package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint paint;
    private Paint textPaint;

    public Practice10HistogramView(Context context) {
        super(context);
    }

    private void init() {
        paint = new Paint();
        textPaint = new Paint();
        textPaint.setColor(Color.WHITE);
        textPaint.setTextSize(30);
        textPaint.setStrokeWidth(10);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.DKGRAY);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        init();
        paint.setColor(Color.YELLOW);
        int left = 100;
        int top = 100;
        int right = 180;
        int bottom = 700;
        int textBottom = bottom + 30;
        for (int i = 0; i < 5; i++) {
            RectF rectF = new RectF(left, top, right, bottom);
            canvas.drawText(i + 1 + "月", left+10, textBottom, textPaint);
            left = left + 120;
            top = top + 50;
            right = right + 120;
            canvas.drawRect(rectF, paint);
        }

        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);
        canvas.drawLine(50, 50, 50, 700, paint);
        canvas.drawLine(50, 700, 700, 700, paint);


    }
}
