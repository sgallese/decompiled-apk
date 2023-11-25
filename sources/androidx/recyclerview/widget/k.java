package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FastScroller.java */
/* loaded from: classes.dex */
public class k extends RecyclerView.o implements RecyclerView.t {
    private static final int[] D = {16842919};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.u C;

    /* renamed from: a  reason: collision with root package name */
    private final int f6816a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6817b;

    /* renamed from: c  reason: collision with root package name */
    final StateListDrawable f6818c;

    /* renamed from: d  reason: collision with root package name */
    final Drawable f6819d;

    /* renamed from: e  reason: collision with root package name */
    private final int f6820e;

    /* renamed from: f  reason: collision with root package name */
    private final int f6821f;

    /* renamed from: g  reason: collision with root package name */
    private final StateListDrawable f6822g;

    /* renamed from: h  reason: collision with root package name */
    private final Drawable f6823h;

    /* renamed from: i  reason: collision with root package name */
    private final int f6824i;

    /* renamed from: j  reason: collision with root package name */
    private final int f6825j;

    /* renamed from: k  reason: collision with root package name */
    int f6826k;

    /* renamed from: l  reason: collision with root package name */
    int f6827l;

    /* renamed from: m  reason: collision with root package name */
    float f6828m;

    /* renamed from: n  reason: collision with root package name */
    int f6829n;

    /* renamed from: o  reason: collision with root package name */
    int f6830o;

    /* renamed from: p  reason: collision with root package name */
    float f6831p;

    /* renamed from: s  reason: collision with root package name */
    private RecyclerView f6834s;

    /* renamed from: z  reason: collision with root package name */
    final ValueAnimator f6841z;

    /* renamed from: q  reason: collision with root package name */
    private int f6832q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f6833r = 0;

    /* renamed from: t  reason: collision with root package name */
    private boolean f6835t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f6836u = false;

    /* renamed from: v  reason: collision with root package name */
    private int f6837v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f6838w = 0;

    /* renamed from: x  reason: collision with root package name */
    private final int[] f6839x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    private final int[] f6840y = new int[2];

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.j(500);
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    class b extends RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            k.this.u(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f6844a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6844a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f6844a) {
                this.f6844a = false;
            } else if (((Float) k.this.f6841z.getAnimatedValue()).floatValue() == 0.0f) {
                k kVar = k.this;
                kVar.A = 0;
                kVar.r(0);
            } else {
                k kVar2 = k.this;
                kVar2.A = 2;
                kVar2.o();
            }
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            k.this.f6818c.setAlpha(floatValue);
            k.this.f6819d.setAlpha(floatValue);
            k.this.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f6841z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f6818c = stateListDrawable;
        this.f6819d = drawable;
        this.f6822g = stateListDrawable2;
        this.f6823h = drawable2;
        this.f6820e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f6821f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f6824i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f6825j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f6816a = i11;
        this.f6817b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        c(recyclerView);
    }

    private void d() {
        this.f6834s.removeCallbacks(this.B);
    }

    private void e() {
        this.f6834s.removeItemDecoration(this);
        this.f6834s.removeOnItemTouchListener(this);
        this.f6834s.removeOnScrollListener(this.C);
        d();
    }

    private void f(Canvas canvas) {
        int i10 = this.f6833r;
        int i11 = this.f6824i;
        int i12 = this.f6830o;
        int i13 = this.f6829n;
        this.f6822g.setBounds(0, 0, i13, i11);
        this.f6823h.setBounds(0, 0, this.f6832q, this.f6825j);
        canvas.translate(0.0f, i10 - i11);
        this.f6823h.draw(canvas);
        canvas.translate(i12 - (i13 / 2), 0.0f);
        this.f6822g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void g(Canvas canvas) {
        int i10 = this.f6832q;
        int i11 = this.f6820e;
        int i12 = i10 - i11;
        int i13 = this.f6827l;
        int i14 = this.f6826k;
        int i15 = i13 - (i14 / 2);
        this.f6818c.setBounds(0, 0, i11, i14);
        this.f6819d.setBounds(0, 0, this.f6821f, this.f6833r);
        if (l()) {
            this.f6819d.draw(canvas);
            canvas.translate(this.f6820e, i15);
            canvas.scale(-1.0f, 1.0f);
            this.f6818c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.f6820e, -i15);
            return;
        }
        canvas.translate(i12, 0.0f);
        this.f6819d.draw(canvas);
        canvas.translate(0.0f, i15);
        this.f6818c.draw(canvas);
        canvas.translate(-i12, -i15);
    }

    private int[] h() {
        int[] iArr = this.f6840y;
        int i10 = this.f6817b;
        iArr[0] = i10;
        iArr[1] = this.f6832q - i10;
        return iArr;
    }

    private int[] i() {
        int[] iArr = this.f6839x;
        int i10 = this.f6817b;
        iArr[0] = i10;
        iArr[1] = this.f6833r - i10;
        return iArr;
    }

    private void k(float f10) {
        int[] h10 = h();
        float max = Math.max(h10[0], Math.min(h10[1], f10));
        if (Math.abs(this.f6830o - max) < 2.0f) {
            return;
        }
        int q10 = q(this.f6831p, max, h10, this.f6834s.computeHorizontalScrollRange(), this.f6834s.computeHorizontalScrollOffset(), this.f6832q);
        if (q10 != 0) {
            this.f6834s.scrollBy(q10, 0);
        }
        this.f6831p = max;
    }

    private boolean l() {
        if (p0.E(this.f6834s) == 1) {
            return true;
        }
        return false;
    }

    private void p(int i10) {
        d();
        this.f6834s.postDelayed(this.B, i10);
    }

    private int q(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void s() {
        this.f6834s.addItemDecoration(this);
        this.f6834s.addOnItemTouchListener(this);
        this.f6834s.addOnScrollListener(this.C);
    }

    private void v(float f10) {
        int[] i10 = i();
        float max = Math.max(i10[0], Math.min(i10[1], f10));
        if (Math.abs(this.f6827l - max) < 2.0f) {
            return;
        }
        int q10 = q(this.f6828m, max, i10, this.f6834s.computeVerticalScrollRange(), this.f6834s.computeVerticalScrollOffset(), this.f6833r);
        if (q10 != 0) {
            this.f6834s.scrollBy(0, q10);
        }
        this.f6828m = max;
    }

    public void c(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f6834s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f6834s = recyclerView;
        if (recyclerView != null) {
            s();
        }
    }

    void j(int i10) {
        int i11 = this.A;
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
        } else {
            this.f6841z.cancel();
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f6841z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f6841z.setDuration(i10);
        this.f6841z.start();
    }

    boolean m(float f10, float f11) {
        if (f11 >= this.f6833r - this.f6824i) {
            int i10 = this.f6830o;
            int i11 = this.f6829n;
            if (f10 >= i10 - (i11 / 2) && f10 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean n(float f10, float f11) {
        if (!l() ? f10 >= this.f6832q - this.f6820e : f10 <= this.f6820e) {
            int i10 = this.f6827l;
            int i11 = this.f6826k;
            if (f11 >= i10 - (i11 / 2) && f11 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    void o() {
        this.f6834s.invalidate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (this.f6832q == this.f6834s.getWidth() && this.f6833r == this.f6834s.getHeight()) {
            if (this.A != 0) {
                if (this.f6835t) {
                    g(canvas);
                }
                if (this.f6836u) {
                    f(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.f6832q = this.f6834s.getWidth();
        this.f6833r = this.f6834s.getHeight();
        r(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f6837v;
        if (i10 == 1) {
            boolean n10 = n(motionEvent.getX(), motionEvent.getY());
            boolean m10 = m(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!n10 && !m10) {
                return false;
            }
            if (m10) {
                this.f6838w = 1;
                this.f6831p = (int) motionEvent.getX();
            } else if (n10) {
                this.f6838w = 2;
                this.f6828m = (int) motionEvent.getY();
            }
            r(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f6837v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean n10 = n(motionEvent.getX(), motionEvent.getY());
            boolean m10 = m(motionEvent.getX(), motionEvent.getY());
            if (n10 || m10) {
                if (m10) {
                    this.f6838w = 1;
                    this.f6831p = (int) motionEvent.getX();
                } else if (n10) {
                    this.f6838w = 2;
                    this.f6828m = (int) motionEvent.getY();
                }
                r(2);
            }
        } else if (motionEvent.getAction() == 1 && this.f6837v == 2) {
            this.f6828m = 0.0f;
            this.f6831p = 0.0f;
            r(1);
            this.f6838w = 0;
        } else if (motionEvent.getAction() == 2 && this.f6837v == 2) {
            t();
            if (this.f6838w == 1) {
                k(motionEvent.getX());
            }
            if (this.f6838w == 2) {
                v(motionEvent.getY());
            }
        }
    }

    void r(int i10) {
        if (i10 == 2 && this.f6837v != 2) {
            this.f6818c.setState(D);
            d();
        }
        if (i10 == 0) {
            o();
        } else {
            t();
        }
        if (this.f6837v == 2 && i10 != 2) {
            this.f6818c.setState(E);
            p(1200);
        } else if (i10 == 1) {
            p(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f6837v = i10;
    }

    public void t() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f6841z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f6841z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f6841z.setDuration(500L);
        this.f6841z.setStartDelay(0L);
        this.f6841z.start();
    }

    void u(int i10, int i11) {
        boolean z10;
        boolean z11;
        int computeVerticalScrollRange = this.f6834s.computeVerticalScrollRange();
        int i12 = this.f6833r;
        if (computeVerticalScrollRange - i12 > 0 && i12 >= this.f6816a) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f6835t = z10;
        int computeHorizontalScrollRange = this.f6834s.computeHorizontalScrollRange();
        int i13 = this.f6832q;
        if (computeHorizontalScrollRange - i13 > 0 && i13 >= this.f6816a) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f6836u = z11;
        boolean z12 = this.f6835t;
        if (!z12 && !z11) {
            if (this.f6837v != 0) {
                r(0);
                return;
            }
            return;
        }
        if (z12) {
            float f10 = i12;
            this.f6827l = (int) ((f10 * (i11 + (f10 / 2.0f))) / computeVerticalScrollRange);
            this.f6826k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
        }
        if (this.f6836u) {
            float f11 = i13;
            this.f6830o = (int) ((f11 * (i10 + (f11 / 2.0f))) / computeHorizontalScrollRange);
            this.f6829n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
        }
        int i14 = this.f6837v;
        if (i14 == 0 || i14 == 1) {
            r(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onRequestDisallowInterceptTouchEvent(boolean z10) {
    }
}
