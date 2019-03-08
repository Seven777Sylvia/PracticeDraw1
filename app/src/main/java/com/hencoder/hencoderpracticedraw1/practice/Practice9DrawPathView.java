package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    private Path path;
    private Paint paint;
    private RectF leftRectF;

    public Practice9DrawPathView(Context context) {
        super(context);

    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        paint = new Paint();
        path = new Path();
        leftRectF = new RectF(100, 50, 200, 150);

        path.addArc(leftRectF, -225, 225);
        path.arcTo(200,50,300,150,-180,225,false);
        path.lineTo(200, 200);

        canvas.drawPath(path, paint);
    }
}
