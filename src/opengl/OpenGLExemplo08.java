package opengl;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLJPanel;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.texture.Texture;
import com.jogamp.opengl.util.texture.TextureData;
import com.jogamp.opengl.util.texture.TextureIO;
import java.io.InputStream;

public class OpenGLExemplo08 extends GLJPanel implements GLEventListener {

    private Texture tex_background;

    public OpenGLExemplo08() {
        super(new GLCapabilities(GLProfile.getDefault()));
        this.addGLEventListener(this);
    }

    @Override
    public void init(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();

        tex_background = carregarTextura("/texturas/smw_background.png");

    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        int larg = drawable.getSurfaceWidth();
        int alt = drawable.getSurfaceHeight();

        gl.glClear(GL.GL_COLOR_BUFFER_BIT);
        gl.glLoadIdentity();

        gl.glColor3d(1, 1, 1);
        gl.glPushMatrix();
        tex_background.enable(gl);
        tex_background.bind(gl);

        gl.glBegin(GL2.GL_QUADS);
        gl.glTexCoord2f(0.0f, 0.0f);
        gl.glVertex3d(1.0, 1.0, 1.0f);

        gl.glTexCoord2f(1.0f, 0.0f);
        gl.glVertex3d(larg*2, 0, 1.0f);

        gl.glTexCoord2f(1.0f, 1.0f);
        gl.glVertex3d(larg*2, alt, 1.0f);

        gl.glTexCoord2f(0.0f, 1.0f);
        gl.glVertex3d(0, larg, 1.0f);
        gl.glEnd();
        gl.glPopMatrix();

        /*  gl.glPushMatrix();
       /* tex_background.enable(gl);
        tex_background.bind(gl);
        gl.glTexCoord2f(0.0f, 0.0f);
        gl.glVertex3f(-1.0f, -1.0f, 1.0f);
        gl.glTexCoord2f(1.0f, 0.0f);
        gl.glVertex3f(1.0f, -1.0f, 1.0f);
        gl.glTexCoord2f(1.0f, 1.0f);
        gl.glVertex3f(1.0f, 1.0f, 1.0f);
        gl.glTexCoord2f(0.0f, 1.0f);
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);
        gl.glPopMatrix();*/
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL2 gl = drawable.getGL().getGL2();

        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();

        //definição do sistema de coordenadas
        GLU glu = new GLU();
        glu.gluOrtho2D(0.0f, 800, 0.0f, 600);

        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();

        gl.glViewport(0, 0, 800, 600);
    }

    public Texture carregarTextura(String PATH) {
        try {
            InputStream stream = getClass().getResourceAsStream(PATH);
            TextureData data
                    = TextureIO.newTextureData(
                            GLProfile.getDefault(), stream,
                            false, "png");
            return TextureIO.newTexture(data);
        } catch (Exception e) {
            System.out.println("ERRO carregar textura: " + e.getMessage());
            return null;
        }
    }

}
