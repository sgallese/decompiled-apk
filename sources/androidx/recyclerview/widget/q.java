package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSmoothScroller.java */
/* loaded from: classes.dex */
public class q extends RecyclerView.a0 {
    @SuppressLint({"UnknownNullness"})

    /* renamed from: k  reason: collision with root package name */
    protected PointF f6925k;

    /* renamed from: l  reason: collision with root package name */
    private final DisplayMetrics f6926l;

    /* renamed from: n  reason: collision with root package name */
    private float f6928n;

    /* renamed from: i  reason: collision with root package name */
    protected final LinearInterpolator f6923i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    protected final DecelerateInterpolator f6924j = new DecelerateInterpolator();

    /* renamed from: m  reason: collision with root package name */
    private boolean f6927m = false;

    /* renamed from: o  reason: collision with root package name */
    protected int f6929o = 0;

    /* renamed from: p  reason: collision with root package name */
    protected int f6930p = 0;

    @SuppressLint({"UnknownNullness"})
    public q(Context context) {
        this.f6926l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f6927m) {
            this.f6928n = v(this.f6926l);
            this.f6927m = true;
        }
        return this.f6928n;
    }

    private int y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    protected int B() {
        PointF pointF = this.f6925k;
        if (pointF != null) {
            float f10 = pointF.y;
            if (f10 != 0.0f) {
                if (f10 > 0.0f) {
                    return 1;
                }
                return -1;
            }
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    protected void C(RecyclerView.a0.a aVar) {
        PointF a10 = a(f());
        if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
            i(a10);
            this.f6925k = a10;
            this.f6929o = (int) (a10.x * 10000.0f);
            this.f6930p = (int) (a10.y * 10000.0f);
            aVar.d((int) (this.f6929o * 1.2f), (int) (this.f6930p * 1.2f), (int) (x(10000) * 1.2f), this.f6923i);
            return;
        }
        aVar.b(f());
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    @SuppressLint({"UnknownNullness"})
    protected void l(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f6929o = y(this.f6929o, i10);
        int y10 = y(this.f6930p, i11);
        this.f6930p = y10;
        if (this.f6929o == 0 && y10 == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    protected void n() {
        this.f6930p = 0;
        this.f6929o = 0;
        this.f6925k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    @SuppressLint({"UnknownNullness"})
    protected void o(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        int t10 = t(view, z());
        int u10 = u(view, B());
        int w10 = w((int) Math.sqrt((t10 * t10) + (u10 * u10)));
        if (w10 > 0) {
            aVar.d(-t10, -u10, w10, this.f6924j);
        }
    }

    public int s(int i10, int i11, int i12, int i13, int i14) {
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    return i13 - i11;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        }
        return i12 - i10;
    }

    @SuppressLint({"UnknownNullness"})
    public int t(View view, int i10) {
        RecyclerView.p e10 = e();
        if (e10 != null && e10.w()) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return s(e10.c0(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, e10.f0(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, e10.getPaddingLeft(), e10.w0() - e10.getPaddingRight(), i10);
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public int u(View view, int i10) {
        RecyclerView.p e10 = e();
        if (e10 != null && e10.x()) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return s(e10.g0(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, e10.a0(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, e10.getPaddingTop(), e10.i0() - e10.getPaddingBottom(), i10);
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int w(int i10) {
        return (int) Math.ceil(x(i10) / 0.3356d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int x(int i10) {
        return (int) Math.ceil(Math.abs(i10) * A());
    }

    protected int z() {
        PointF pointF = this.f6925k;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 != 0.0f) {
                if (f10 > 0.0f) {
                    return 1;
                }
                return -1;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    protected void m() {
    }
}
