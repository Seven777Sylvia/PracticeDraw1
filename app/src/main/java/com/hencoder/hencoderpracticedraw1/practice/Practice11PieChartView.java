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

    private Paint paint = new Paint();
    private RectF rectF = new RectF(100, 100, 500, 500);
    private RectF firstRectF = new RectF(90, 90, 490, 490);
    private int[] colors = new int[]{Color.YELLOW, Color.CYAN, Color.GRAY, Color.RED, Color.BLUE, Color.MAGENTA};

    {
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
    }
    
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

        //常规画法
        canvas.drawArc(firstRectF, -180, 150, true, paint);
        int startAngle = -30;
        int sweepAngle = 30;
        for (int i = 0; i < colors.length; i++) {
            paint.setColor(colors[i]);
            canvas.drawArc(rectF, startAngle, sweepAngle, true, paint);

            startAngle = startAngle + 35;
        }
    }

}
