package opengl;

import static com.jogamp.opengl.GL.GL_COLOR_BUFFER_BIT;
import static com.jogamp.opengl.GL.GL_DEPTH_BUFFER_BIT;
import static com.jogamp.opengl.GL.GL_TRIANGLES;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLJPanel;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;

public class OpenGLExemplo02 extends GLJPanel implements GLEventListener {

    private FPSAnimator animator;
    private float angulo = 0.0f;

    public OpenGLExemplo02() {
        super(new GLCapabilities(GLProfile.getDefault()));
        this.addGLEventListener(this);
    }

    @Override
    public void init(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        animator = new FPSAnimator(this, 60);
        animator.start();
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();

        if (animator != null) {
            if (animator.isStarted()) {
                animator.stop();
            }
        }
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();

        gl.glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();

        // Draw a triangle
        float sen = (float) Math.sin(angulo);
        float cos = (float) Math.cos(angulo);
        gl.glBegin(GL_TRIANGLES);
        gl.glColor3f(1.0f, 0.0f, 0.0f);   // Red
        gl.glVertex2d(-cos, -cos);
        gl.glColor3f(0.0f, 1.0f, 0.0f);   // Green
        gl.glVertex2d(0.0f, cos);
        gl.glColor3f(0.0f, 0.0f, 1.0f);   // Blue
        gl.glVertex2d(sen, -sen);
        gl.glEnd();

        //atualização do ângulo
        angulo += 0.01f;
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL2 gl = drawable.getGL().getGL2();

        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();

        //definição do sistema de coordenadas
        GLU glu = new GLU();
        glu.gluOrtho2D(-1.0f, 1.0f, 1.0f, -1.0f);

        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();

        gl.glViewport(0, 0, width, height);
    }

}
