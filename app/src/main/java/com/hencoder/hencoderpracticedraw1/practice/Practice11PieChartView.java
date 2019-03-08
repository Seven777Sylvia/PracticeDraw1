package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint paint;
    private RectF rectF;
    private RectF firstRectF;
    private int[] colors;

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        init();

        //常规画法
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        canvas.drawArc(firstRectF, 285, 65, true, paint);
        int startAngle = 0;
        int sweepAngle = 35;
        for (int i = 0; i < colors.length; i++) {
            paint.setColor(colors[i]);
            startAngle = startAngle + i * 40;
            canvas.drawArc(rectF, startAngle, sweepAngle, true, paint);
        }
    }

    private void init() {
        paint = new Paint();
        firstRectF = new RectF(50, 50, 450, 450);
        rectF = new RectF(100, 100, 500, 500);
        colors = new int[]{Color.GREEN, Color.YELLOW, Color.CYAN, Color.GRAY, Color.RED, Color.BLUE, Color.MAGENTA};
    }
}
