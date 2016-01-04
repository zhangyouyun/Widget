package android.com.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<SlideItem> list = new ArrayList<>();
        CustomBtn btn = new CustomBtn();
        btn.setName("阅办单");
        btn.setEvent("阅办单已选中");
        list.add(btn);

        btn = new CustomBtn();
        btn.setName("详细信息");
        btn.setEvent("详细信息已选中");
        btn.setIsCheck(true);
        list.add(btn);

        btn = new CustomBtn();
        btn.setName("查看意见");
        btn.setEvent("查看意见已选中");
        list.add(btn);

        btn = new CustomBtn();
        btn.setName("传阅记录");
        btn.setEvent("传阅记录已选中");
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
    }

    }

