package opengl;

import static com.jogamp.opengl.GL.GL_COLOR_BUFFER_BIT;
import static com.jogamp.opengl.GL.GL_DEPTH_BUFFER_BIT;
import static com.jogamp.opengl.GL.GL_DEPTH_TEST;
import static com.jogamp.opengl.GL.GL_FRONT;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLJPanel;
import static com.jogamp.opengl.fixedfunc.GLLightingFunc.GL_AMBIENT;
import static com.jogamp.opengl.fixedfunc.GLLightingFunc.GL_DIFFUSE;
import static com.jogamp.opengl.fixedfunc.GLLightingFunc.GL_LIGHT0;
import static com.jogamp.opengl.fixedfunc.GLLightingFunc.GL_LIGHTING;
import static com.jogamp.opengl.fixedfunc.GLLightingFunc.GL_POSITION;
import static com.jogamp.opengl.fixedfunc.GLLightingFunc.GL_SHININESS;
import static com.jogamp.opengl.fixedfunc.GLLightingFunc.GL_SMOOTH;
import static com.jogamp.opengl.fixedfunc.GLLightingFunc.GL_SPECULAR;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.gl2.GLUT;
import java.awt.event.KeyEvent;

public class OpenGLExemplo07 extends GLJPanel implements GLEventListener, java.awt.event.KeyListener {

    private FPSAnimator animator;
    private GLU glu;
    private GLUT glut;
    private double ang;

    //Parâmetros de Iluminação
    private final float luz_ambiente[] = {0.8f, 0.8f, 0.8f, 1.0f};
    private final float luz_difusa[] = {1.0f, 1.0f, 1.0f, 1.0f};
    private final float luz_especular[] = {1.0f, 1.0f, 1.0f, 1.0f};
    private final float luz_posicao[] = {0.0f, 0.0f, 2.0f, 1.0f};

    private final float mat_ambiente[] = {0.1f, 0.1f, 0.1f, 1.0f};
    private final float mat_difusa[] = {0.0f, 0.0f, 0.8f, 1.0f};
    private final float mat_especular[] = {0.9f, 0.9f, 0.9f, 1.0f};
    private final float mat_shininess[] = {50.0f};

    public OpenGLExemplo07() {
        super(new GLCapabilities(GLProfile.getDefault()));
        this.addGLEventListener(this);
        this.addKeyListener(this);
        this.ang = 0.0f;
    }

    @Override
    public void init(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        glu = new GLU();
        glut = new GLUT();
        
        animator = new FPSAnimator(this, 60);
        animator.start();

        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        gl.glEnable(GL_LIGHTING);
        gl.glEnable(GL_LIGHT0);
        gl.glEnable(GL_DEPTH_TEST);
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();

        gl.glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
        gl.glShadeModel(GL_SMOOTH);

        gl.glPushMatrix();
        gl.glTranslated(0.0, 0.0, -5.0);

        gl.glPushMatrix();
        gl.glRotated(ang, 1.0f, 0.0f, 0.0f);

        //PROPRIEDADES DA LUZ
        gl.glLightfv(GL_LIGHT0, GL_DIFFUSE, luz_difusa, 0);
        gl.glLightfv(GL_LIGHT0, GL_SPECULAR, luz_especular, 0);
        gl.glLightfv(GL_LIGHT0, GL_POSITION, luz_posicao, 0);
        gl.glTranslated(0.0, 0.0, 2.0);
        
        gl.glDisable(GL_LIGHTING);
            gl.glColor3f(1.0f, 1.0f, 0.0f);
            glut.glutSolidSphere(0.05, 10, 10);
        gl.glEnable(GL_LIGHTING);

        gl.glPopMatrix();

        //PROPRIEDADES DO MATERIAL
        gl.glMaterialfv(GL_FRONT, GL_AMBIENT, mat_ambiente, 0);
        gl.glMaterialfv(GL_FRONT, GL_DIFFUSE, mat_difusa, 0);
        gl.glMaterialfv(GL_FRONT, GL_SPECULAR, mat_especular, 0);
        gl.glMaterialfv(GL_FRONT, GL_SHININESS, mat_shininess, 0);
        glut.glutSolidTorus(0.5, 1.3, 25, 25);

        gl.glPopMatrix();
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL2 gl = drawable.getGL().getGL2();

        float aspect = (float) width / (float) height;

        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glFrustum(-aspect, +aspect, -1.0, 1.0, 2.0, 100.0);

        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
         switch (ke.getKeyChar()) {
            case 'a':
                ang++;
                break;
            case 'x':
                ang--;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        switch (ke.getKeyChar()) {
            case 'a':
                ang++;
                break;
            case 'x':
                ang--;
                break;
        }
        System.out.println("pressed = " + ke.getKeyChar() + " = " + ang);
    }

}
