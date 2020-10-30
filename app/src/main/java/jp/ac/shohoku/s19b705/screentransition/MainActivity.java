package jp.ac.shohoku.s19b705.screentransition;

 import android.app.Activity;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.Button;
 import android.widget.LinearLayout;
 import android.view.View.OnClickListener;

public class MainActivity extends Activity {
 int count = 1;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_view);
         // ボタンを押したときにイベントを取得できるようにする
         Button button1 = (Button) findViewById(R.id.button1);
         button1.setOnClickListener(new OnClickListener() {
 @Override
 public void onClick(View v) {
                 if(count == 1) {
                     // 変更したいレイアウトを取得する
                     LinearLayout layout = (LinearLayout) findViewById(R.id.linearlayout1);
                     // レイアウトのビューをすべて削除する
                     layout.removeAllViews();
                     // レイアウトを R.layout.sample に変更する
                     getLayoutInflater().inflate(R.layout.view2, layout);
                     count=2;
                     } else if (count == 2) {
                     LinearLayout layout = (LinearLayout) findViewById(R.id.linearlayout2);
                     layout.removeAllViews();
                     getLayoutInflater().inflate(R.layout.view3, layout);
                     count = 3;
                     }else if (count == 3) {
                     LinearLayout layout = (LinearLayout) findViewById(R.id.linearlayout3);
                     layout.removeAllViews();
                     getLayoutInflater().inflate(R.layout.view1,layout);
                     count = 1;
                 }
                 }
 });
 }

 }