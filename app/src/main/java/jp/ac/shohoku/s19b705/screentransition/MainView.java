package jp.ac.shohoku.s19b705.screentransition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
* 一つの Activty，一つの View で状態遷移する場合
*/
public class MainView extends View{
    public final int FIRST = 1; //状態を表す定数 1
    public final int SECOND = 2; //状態を表す定数 2
    public final int THIRD = 3; //状態を表す定数 2

    int state; //状態を表す変数

    /**
     * コンストラクタ
     * @param context
     * @param attrs
     */
    public MainView(Context context, AttributeSet attrs) {
        super(context, attrs);
        state = FIRST; //はじめは状態１
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p1 = new Paint();
        Paint p2 = new Paint();
        Paint p3 = new Paint();

        if(state == FIRST) {
            p1.setColor(Color.BLUE);
            p2.setColor(Color.RED);
            p3.setColor(Color.GREEN);p1.setColor(Color.BLUE);
            canvas.drawARGB(255, 255, 255, 255);
            canvas.drawRect(100, 100, 300, 200, p1);
            canvas.drawRect(400, 100, 600, 200, p2);
            canvas.drawRect(700, 100, 900, 200, p3);
        }

        if(state == SECOND) {
            p1.setColor(Color.BLUE);
            p2.setColor(Color.RED);
            p3.setColor(Color.GREEN);
            canvas.drawARGB(255, 255, 255, 0);
            canvas.drawRect(100, 100, 300, 200, p1);
            canvas.drawRect(400, 100, 600, 200, p2);
            canvas.drawRect(700, 100, 900, 200, p3);
        }

        if(state == THIRD) {
            p1.setColor(Color.BLUE);
            p2.setColor(Color.RED);
            p3.setColor(Color.GREEN);
            canvas.drawARGB(255, 255, 0, 255);
            canvas.drawRect(100, 100, 300, 200, p1);
            canvas.drawRect(400, 100, 600, 200, p2);
            canvas.drawRect(700, 100, 900, 200, p3);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();

        //長方形の内部で
        if(x>100 && x < 300 && y>100 && y<200) {
            state = FIRST;
        }
        if(x>400 && x < 600 && y>100 && y<200) {
            state = SECOND;
        }
        if(x>700 && x < 900 && y>100 && y<200) {
            state = THIRD;
        }

        invalidate(); //再描画
        return super.onTouchEvent(event);
    }
}
