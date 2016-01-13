package android.com.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Auser on 2016/1/13.
 */
public class TestActivity extends Activity {
    private TextView text;
    private myGLSurfaceView mGLSurfaceView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mGLSurfaceView = new myGLSurfaceView(this);
        setContentView(mGLSurfaceView);//这里我们用mGLSurfaceView来替换以前常用的R.layout.main
        setContentView(R.layout.t);
        text=(TextView)findViewById(R.id.fragment2_tv);
        ArrayList<SlideItem> list = new ArrayList<>();
        CustomBtn btn = new CustomBtn();
        btn.setName("测试");
        btn.setEvent("测试按钮");
        list.add(btn);

        btn.setName("测试");
        btn.setEvent("测试按钮");
        list.add(btn);

        SlideTitle slideTitle = (SlideTitle)findViewById(R.id.slideTitle);
        // 标题点击监听
        slideTitle
                .setSlideTitleOnClickListener(new SlideTitle.SlideTitleOnClickListener() {
                    @Override
                    public void slideTitleOnClick(SlideItem item) {
                        if (item instanceof CustomBtn){
                            CustomBtn btn = (CustomBtn)item;
                            Toast.makeText(getBaseContext(), btn.getEvent(),Toast.LENGTH_SHORT).show();
                        }

                    }
                });
        slideTitle.setMidChildTitleFlow(list);
//
//
//
//
//
    }


}
