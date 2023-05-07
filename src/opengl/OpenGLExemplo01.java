package opengl;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLJPanel;
import com.jogamp.opengl.glu.GLU;

public class OpenGLExemplo01 extends GLJPanel implements GLEventListener {

    public OpenGLExemplo01() {
        super(new GLCapabilities(GLProfile.getDefault()));
        this.addGLEventListener(this);
    }

    @Override
    public void init(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();

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
        gl.glClearColor(0, 0, 0, 1);
        gl.glLoadIdentity();

        gl.glColor3f(1, 0, 0);
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glColor3f(1, 0, 0);
            gl.glVertex2f(0, 0);
            gl.glColor3f(0, 1, 0);
            gl.glVertex2f(larg, 0);
            gl.glColor3f(0, 0, 1);
            gl.glVertex2f(larg / 2, alt);
        gl.glEnd();
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL2 gl = drawable.getGL().getGL2();

        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();

        //definição do sistema de coordenadas
        GLU glu = new GLU();
        glu.gluOrtho2D(0.0f, width, 0.0f, height);

        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();

        gl.glViewport(0, 0, width, height);
    }

}
