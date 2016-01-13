package android.com.widget;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private Button changeOne;
    private Button changeTwo;
    private Button back;
    SlideTitle slideTitle ;
    ArrayList<SlideItem> list;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slideTitle = (SlideTitle)findViewById(R.id.slideTitle);
        setTitle(3);
        aa();

        changeOne=(Button)findViewById(R.id.changeOne);
        changeTwo=(Button)findViewById(R.id.changeTwo);
        changeOne.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                setTitle(1);
                aa();
            }
        });
        changeTwo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                setTitle(2);
                aa();
            }
        });
        back=(Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                setTitle(3);
                aa();
            }
        });
    }

    public void setTitle(int num){
        list = new ArrayList<>();
        CustomBtn btn = new CustomBtn();
        for (int i = 0; i < num; i++) {

            btn.setName("测试");
            btn.setEvent("测试按钮");
            list.add(btn);
        }
        slideTitle.setMidChildTitleFlow(list);
    }

    public void aa() {

        // 标题点击监听
        slideTitle
                .setSlideTitleOnClickListener(new SlideTitle.SlideTitleOnClickListener() {
                    @Override
                    public void slideTitleOnClick(SlideItem item) {
                        if (item instanceof CustomBtn) {
                            CustomBtn btn = (CustomBtn) item;
                            Toast.makeText(getBaseContext(), btn.getEvent(), Toast.LENGTH_SHORT).show();
                        }

                    }
                });
        slideTitle.setMidChildTitleFlow(list);
//        postInvalidate();
    }
    class GameThread implements Runnable {
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

// 使用postInvalidate可以直接在线程中更新界面
            }
        }
    }
}

