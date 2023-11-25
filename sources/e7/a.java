package e7;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: InsetDialogOnTouchListener.java */
/* loaded from: classes3.dex */
public class a implements View.OnTouchListener {

    /* renamed from: f  reason: collision with root package name */
    private final Dialog f14116f;

    /* renamed from: m  reason: collision with root package name */
    private final int f14117m;

    /* renamed from: p  reason: collision with root package name */
    private final int f14118p;

    /* renamed from: q  reason: collision with root package name */
    private final int f14119q;

    public a(Dialog dialog, Rect rect) {
        this.f14116f = dialog;
        this.f14117m = rect.left;
        this.f14118p = rect.top;
        this.f14119q = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f14117m + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        if (new RectF(left, this.f14118p + findViewById.getTop(), width, findViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f14119q;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f14116f.onTouchEvent(obtain);
    }
}
