package jp.ac.shohoku.s19b705.screentransition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class TransActivity extends Activity {
    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trans);
        // ボタンを押したときにイベントを取得できるようにする
        Button button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TransActivity.this, SubActivity.class);

                startActivity(intent);
            }
        });
    }
}