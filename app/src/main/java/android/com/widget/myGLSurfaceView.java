package android.com.widget;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by Auser on 2016/1/13.
 */
public class myGLSurfaceView extends GLSurfaceView {
    public myGLSurfaceView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
        mrender = new myGLRenderer();
        setRenderer(mrender);
    }
    private myGLRenderer mrender;
}
