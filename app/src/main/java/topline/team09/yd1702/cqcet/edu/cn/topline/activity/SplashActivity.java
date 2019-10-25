package topline.team09.yd1702.cqcet.edu.cn.topline.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

import topline.team09.yd1702.cqcet.edu.cn.topline.MainActivity;
import topline.team09.yd1702.cqcet.edu.cn.topline.R;

/**
 * Created by RedSlodier on 2019/10/23 9:29.
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        init();
    }

    private void init() {
        //利用Timer让此界面延迟3s后再跳转
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                SplashActivity.this.finish();
            }
        };
        //设置该task在延迟3秒后执行
        timer.schedule(task,3000);
    }
}
