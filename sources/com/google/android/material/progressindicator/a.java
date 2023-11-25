package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.core.view.p0;
import com.google.android.material.internal.p;
import com.google.android.material.progressindicator.b;
import java.util.Arrays;
import v6.k;
import v6.l;

/* compiled from: BaseProgressIndicator.java */
/* loaded from: classes3.dex */
public abstract class a<S extends com.google.android.material.progressindicator.b> extends ProgressBar {
    static final int B = k.F;
    private final androidx.vectordrawable.graphics.drawable.b A;

    /* renamed from: f  reason: collision with root package name */
    S f10190f;

    /* renamed from: m  reason: collision with root package name */
    private int f10191m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10192p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f10193q;

    /* renamed from: r  reason: collision with root package name */
    private final int f10194r;

    /* renamed from: s  reason: collision with root package name */
    private final int f10195s;

    /* renamed from: t  reason: collision with root package name */
    private long f10196t;

    /* renamed from: u  reason: collision with root package name */
    k7.a f10197u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f10198v;

    /* renamed from: w  reason: collision with root package name */
    private int f10199w;

    /* renamed from: x  reason: collision with root package name */
    private final Runnable f10200x;

    /* renamed from: y  reason: collision with root package name */
    private final Runnable f10201y;

    /* renamed from: z  reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f10202z;

    /* compiled from: BaseProgressIndicator.java */
    /* renamed from: com.google.android.material.progressindicator.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class RunnableC0239a implements Runnable {
        RunnableC0239a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.k();
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.j();
            a.this.f10196t = -1L;
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    /* loaded from: classes3.dex */
    class c extends androidx.vectordrawable.graphics.drawable.b {
        c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            a.this.setIndeterminate(false);
            a aVar = a.this;
            aVar.o(aVar.f10191m, a.this.f10192p);
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    /* loaded from: classes3.dex */
    class d extends androidx.vectordrawable.graphics.drawable.b {
        d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            if (!a.this.f10198v) {
                a aVar = a.this;
                aVar.setVisibility(aVar.f10199w);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(s7.a.c(context, attributeSet, i10, B), attributeSet, i10);
        this.f10196t = -1L;
        this.f10198v = false;
        this.f10199w = 4;
        this.f10200x = new RunnableC0239a();
        this.f10201y = new b();
        this.f10202z = new c();
        this.A = new d();
        Context context2 = getContext();
        this.f10190f = i(context2, attributeSet);
        TypedArray i12 = p.i(context2, attributeSet, l.f24838c0, i10, i11, new int[0]);
        this.f10194r = i12.getInt(l.f24888h0, -1);
        this.f10195s = Math.min(i12.getInt(l.f24868f0, -1), 1000);
        i12.recycle();
        this.f10197u = new k7.a();
        this.f10193q = true;
    }

    private h<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().v();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ((g) getCurrentDrawable()).q(false, false, true);
        if (m()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f10195s > 0) {
            this.f10196t = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean m() {
        if ((getProgressDrawable() != null && getProgressDrawable().isVisible()) || (getIndeterminateDrawable() != null && getIndeterminateDrawable().isVisible())) {
            return false;
        }
        return true;
    }

    private void n() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().u().d(this.f10202z);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().m(this.A);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m(this.A);
        }
    }

    private void p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().s(this.A);
            getIndeterminateDrawable().u().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().s(this.A);
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f10190f.f10212f;
    }

    public int[] getIndicatorColor() {
        return this.f10190f.f10209c;
    }

    public int getShowAnimationBehavior() {
        return this.f10190f.f10211e;
    }

    public int getTrackColor() {
        return this.f10190f.f10210d;
    }

    public int getTrackCornerRadius() {
        return this.f10190f.f10208b;
    }

    public int getTrackThickness() {
        return this.f10190f.f10207a;
    }

    protected void h(boolean z10) {
        if (!this.f10193q) {
            return;
        }
        ((g) getCurrentDrawable()).q(q(), false, z10);
    }

    abstract S i(Context context, AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    boolean l() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() != 0) {
                    return false;
                }
                return true;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    public void o(int i10, boolean z10) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.f10191m = i10;
                this.f10192p = z10;
                this.f10198v = true;
                if (getIndeterminateDrawable().isVisible() && this.f10197u.a(getContext().getContentResolver()) != 0.0f) {
                    getIndeterminateDrawable().u().f();
                    return;
                } else {
                    this.f10202z.b(getIndeterminateDrawable());
                    return;
                }
            }
            return;
        }
        super.setProgress(i10);
        if (getProgressDrawable() != null && !z10) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        n();
        if (q()) {
            k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f10201y);
        removeCallbacks(this.f10200x);
        ((g) getCurrentDrawable()).i();
        p();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        int e10;
        int d10;
        h<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        if (currentDrawingDelegate.e() < 0) {
            e10 = View.getDefaultSize(getSuggestedMinimumWidth(), i10);
        } else {
            e10 = currentDrawingDelegate.e() + getPaddingLeft() + getPaddingRight();
        }
        if (currentDrawingDelegate.d() < 0) {
            d10 = View.getDefaultSize(getSuggestedMinimumHeight(), i11);
        } else {
            d10 = currentDrawingDelegate.d() + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(e10, d10);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        boolean z10;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        h(z10);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        h(false);
    }

    boolean q() {
        if (p0.X(this) && getWindowVisibility() == 0 && l()) {
            return true;
        }
        return false;
    }

    public void setAnimatorDurationScaleProvider(k7.a aVar) {
        this.f10197u = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f10237p = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f10237p = aVar;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f10190f.f10212f = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        if (z10 == isIndeterminate()) {
            return;
        }
        g gVar = (g) getCurrentDrawable();
        if (gVar != null) {
            gVar.i();
        }
        super.setIndeterminate(z10);
        g gVar2 = (g) getCurrentDrawable();
        if (gVar2 != null) {
            gVar2.q(q(), false, false);
        }
        if ((gVar2 instanceof j) && q()) {
            ((j) gVar2).u().g();
        }
        this.f10198v = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (drawable instanceof j) {
            ((g) drawable).i();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{d7.a.b(getContext(), v6.b.f24645o, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f10190f.f10209c = iArr;
            getIndeterminateDrawable().u().c();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        o(i10, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else if (drawable instanceof f) {
            f fVar = (f) drawable;
            fVar.i();
            super.setProgressDrawable(fVar);
            fVar.A(getProgress() / getMax());
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f10190f.f10211e = i10;
        invalidate();
    }

    public void setTrackColor(int i10) {
        S s10 = this.f10190f;
        if (s10.f10210d != i10) {
            s10.f10210d = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i10) {
        S s10 = this.f10190f;
        if (s10.f10208b != i10) {
            s10.f10208b = Math.min(i10, s10.f10207a / 2);
        }
    }

    public void setTrackThickness(int i10) {
        S s10 = this.f10190f;
        if (s10.f10207a != i10) {
            s10.f10207a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f10199w = i10;
    }

    @Override // android.widget.ProgressBar
    public j<S> getIndeterminateDrawable() {
        return (j) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public f<S> getProgressDrawable() {
        return (f) super.getProgressDrawable();
    }
}
