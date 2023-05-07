package opengl;

import static com.jogamp.opengl.GL.GL_COLOR_BUFFER_BIT;
import static com.jogamp.opengl.GL.GL_DEPTH_BUFFER_BIT;
import static com.jogamp.opengl.GL.GL_DEPTH_TEST;
import static com.jogamp.opengl.GL.GL_LEQUAL;
import static com.jogamp.opengl.GL.GL_NICEST;
import com.jogamp.opengl.GL2;
import static com.jogamp.opengl.GL2ES1.GL_PERSPECTIVE_CORRECTION_HINT;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLJPanel;
import static com.jogamp.opengl.fixedfunc.GLLightingFunc.GL_SMOOTH;
import static com.jogamp.opengl.fixedfunc.GLMatrixFunc.GL_MODELVIEW;
import static com.jogamp.opengl.fixedfunc.GLMatrixFunc.GL_PROJECTION;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.gl2.GLUT;

public class OpenGLExemplo04 extends GLJPanel implements GLEventListener {

    private FPSAnimator animator;
    private GLU glu;
    private GLUT glut;

    private float angulo = 0;
    private final float velocidade = 2.0f;

    public OpenGLExemplo04() {
        super(new GLCapabilities(GLProfile.getDefault()));
        this.addGLEventListener(this);
    }

    @Override
    public void init(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();

        glu = new GLU();
        glut = new GLUT();
        animator = new FPSAnimator(this, 60);
        animator.start();

        gl.glClearDepth(1.0f);      // set clear depth value to farthest
        gl.glEnable(GL_DEPTH_TEST); // enables depth testing
        gl.glDepthFunc(GL_LEQUAL);  // the type of depth test to do
        gl.glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST); // best perspective correction
        gl.glShadeModel(GL_SMOOTH); // blends colors nicely, and smoothes out lighting
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

        gl.glColor3f(1.0f, 1.0f, 0.0f);

        //
        // GLUT - API Reference
        // https://www.opengl.org/resources/libraries/glut/spec3/spec3.html
        //
        
        gl.glPushMatrix();
        gl.glTranslatef(-2.0f, 0.0f, -10.0f);
        gl.glRotatef(angulo, 1.0f, 1.0f, 1.0f);
        glut.glutSolidTorus(0.3, 0.8, 100, 100);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(+2.0f, 0.0f, -10.0f);
        gl.glRotatef(angulo, 1.0f, 1.0f, 1.0f);
        glut.glutWireTorus(0.3, 0.8, 20, 100);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(0.0f, -2.0f, -10.0f);
        gl.glRotatef(angulo, 1.0f, 1.0f, 1.0f);
        glut.glutWireTeapot(0.5);
        gl.glPopMatrix();

//        //glut.glutWireSphere(0.5,30,30);
//        //glut.glutWireTeapot(0.5);
//        //glut.glutWireIcosahedron();
//        //glut.glutWireDodecahedron();
//        //glut.glutWireCone(0.5,0.2,10,10);
//        //glut.glutWireCube(0.5f);
//        //glut.glutWireRhombicDodecahedron();
//        //glut.glutWireCylinder(0.2, 0.9, 100, 100);
        
        angulo += velocidade;
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL2 gl = drawable.getGL().getGL2();

        if (height == 0) {
            height = 1;   // prevent divide by zero
        }
        float aspect = (float) width / height;

        // Configurar área de visualização para o tamanho da janela
        gl.glViewport(0, 0, width, height);

        // Definir projeção em perspectiva 
        gl.glMatrixMode(GL_PROJECTION);  // Matriz de projeção 
        gl.glLoadIdentity();             // Resetar projection matrix
        glu.gluPerspective(45.0, aspect, 0.1, 100.0); // fovy, aspect, zNear, zFar

        gl.glMatrixMode(GL_MODELVIEW);
        gl.glLoadIdentity();
    }

}
