package android.com.widget;

import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Auser on 2016/1/13.
 */
public class myGLRenderer implements GLSurfaceView.Renderer {
    public void onDrawFrame(GL10 gl) {
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);//清空缓存
    }

    public void onSurfaceChanged(GL10 gl, int width, int height) {
        gl.glViewport(0, 0, width, height);//设置视口
    }
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        // TODO Auto-generated method stub
        gl.glClearColor(0.5f, 0.5f, 0.5f, 1.0f); //设置清除色
    }
}
