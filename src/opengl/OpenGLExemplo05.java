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

public class OpenGLExemplo05 extends GLJPanel implements GLEventListener {

    private FPSAnimator animator;
    private GLU glu;
    private GLUT glut;

    private float tx;
    private float ty;
    private float tz;
    private float sx;
    private float sy;
    private float sz;
    private int rx;
    private int ry;
    private int rz;
    private float angulo;

    public OpenGLExemplo05() {
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

        this.tx = 0;
        this.ty = 0;
        this.tz = 0;
        this.sx = 1;
        this.sy = 1;
        this.sz = 1;
        this.rx = 0;
        this.ry = 0;
        this.rz = 0;
        this.angulo = 0;
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

        gl.glTranslatef(0.0f + tx, 0.0f + ty, -10.0f + tz);
        gl.glRotatef(angulo, rx, ry, rz);
        gl.glScalef(1.0f + sx, 1.0f + sy, 1.0f + sz);
        glut.glutSolidTorus(0.3, 0.8, 100, 100);

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

    public float getTx() {
        return tx;
    }

    public void setTx(float tx) {
        this.tx = tx;
    }

    public float getTy() {
        return ty;
    }

    public void setTy(float ty) {
        this.ty = ty;
    }

    public float getTz() {
        return tz;
    }

    public void setTz(float tz) {
        this.tz = tz;
    }

    public float getSx() {
        return sx;
    }

    public void setSx(float sx) {
        this.sx = sx;
    }

    public float getSy() {
        return sy;
    }

    public void setSy(float sy) {
        this.sy = sy;
    }

    public float getSz() {
        return sz;
    }

    public void setSz(float sz) {
        this.sz = sz;
    }

    public int getRx() {
        return rx;
    }

    public void setRx(int rx) {
        this.rx = rx;
    }

    public int getRy() {
        return ry;
    }

    public void setRy(int ry) {
        this.ry = ry;
    }

    public int getRz() {
        return rz;
    }

    public void setRz(int rz) {
        this.rz = rz;
    }

    public float getAngulo() {
        return angulo;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }

}
