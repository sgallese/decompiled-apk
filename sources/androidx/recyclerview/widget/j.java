package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DividerItemDecoration.java */
/* loaded from: classes.dex */
public class j extends RecyclerView.o {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f6812d = {16843284};

    /* renamed from: a  reason: collision with root package name */
    private Drawable f6813a;

    /* renamed from: b  reason: collision with root package name */
    private int f6814b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f6815c = new Rect();

    @SuppressLint({"UnknownNullness"})
    public j(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f6812d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f6813a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        e(i10);
    }

    private void c(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i10;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i10 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i10, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i10 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            recyclerView.getLayoutManager().b0(childAt, this.f6815c);
            int round = this.f6815c.right + Math.round(childAt.getTranslationX());
            this.f6813a.setBounds(round - this.f6813a.getIntrinsicWidth(), i10, round, height);
            this.f6813a.draw(canvas);
        }
        canvas.restore();
    }

    private void d(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i10;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i10 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i10, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i10 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f6815c);
            int round = this.f6815c.bottom + Math.round(childAt.getTranslationY());
            this.f6813a.setBounds(i10, round - this.f6813a.getIntrinsicHeight(), width, round);
            this.f6813a.draw(canvas);
        }
        canvas.restore();
    }

    public void e(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f6814b = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        Drawable drawable = this.f6813a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f6814b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (recyclerView.getLayoutManager() != null && this.f6813a != null) {
            if (this.f6814b == 1) {
                d(canvas, recyclerView);
            } else {
                c(canvas, recyclerView);
            }
        }
    }
}
