package br.com.fpg.chesspuzzles.ui;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import br.com.fpg.chesspuzzles.R;

public class MainActivity extends AppCompatActivity {

    private static int TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent viewPagerIntent = new Intent(MainActivity.this, ViewPagerActivity.class);
                startActivity(viewPagerIntent);
                finish();
            }
        }, TIME_OUT);

    }
}
