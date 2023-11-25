package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.p0;

/* compiled from: AutoScrollHelper.java */
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    private static final int E = ViewConfiguration.getTapTimeout();
    boolean A;
    boolean B;
    private boolean C;
    private boolean D;

    /* renamed from: p  reason: collision with root package name */
    final View f4283p;

    /* renamed from: q  reason: collision with root package name */
    private Runnable f4284q;

    /* renamed from: t  reason: collision with root package name */
    private int f4287t;

    /* renamed from: u  reason: collision with root package name */
    private int f4288u;

    /* renamed from: y  reason: collision with root package name */
    private boolean f4292y;

    /* renamed from: z  reason: collision with root package name */
    boolean f4293z;

    /* renamed from: f  reason: collision with root package name */
    final C0084a f4281f = new C0084a();

    /* renamed from: m  reason: collision with root package name */
    private final Interpolator f4282m = new AccelerateInterpolator();

    /* renamed from: r  reason: collision with root package name */
    private float[] f4285r = {0.0f, 0.0f};

    /* renamed from: s  reason: collision with root package name */
    private float[] f4286s = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: v  reason: collision with root package name */
    private float[] f4289v = {0.0f, 0.0f};

    /* renamed from: w  reason: collision with root package name */
    private float[] f4290w = {0.0f, 0.0f};

    /* renamed from: x  reason: collision with root package name */
    private float[] f4291x = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoScrollHelper.java */
    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0084a {

        /* renamed from: a  reason: collision with root package name */
        private int f4294a;

        /* renamed from: b  reason: collision with root package name */
        private int f4295b;

        /* renamed from: c  reason: collision with root package name */
        private float f4296c;

        /* renamed from: d  reason: collision with root package name */
        private float f4297d;

        /* renamed from: j  reason: collision with root package name */
        private float f4303j;

        /* renamed from: k  reason: collision with root package name */
        private int f4304k;

        /* renamed from: e  reason: collision with root package name */
        private long f4298e = Long.MIN_VALUE;

        /* renamed from: i  reason: collision with root package name */
        private long f4302i = -1;

        /* renamed from: f  reason: collision with root package name */
        private long f4299f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f4300g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f4301h = 0;

        C0084a() {
        }

        private float e(long j10) {
            long j11 = this.f4298e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f4302i;
            if (j12 >= 0 && j10 >= j12) {
                float f10 = this.f4303j;
                return (1.0f - f10) + (f10 * a.e(((float) (j10 - j12)) / this.f4304k, 0.0f, 1.0f));
            }
            return a.e(((float) (j10 - j11)) / this.f4294a, 0.0f, 1.0f) * 0.5f;
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f4299f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g10 = g(e(currentAnimationTimeMillis));
                long j10 = currentAnimationTimeMillis - this.f4299f;
                this.f4299f = currentAnimationTimeMillis;
                float f10 = ((float) j10) * g10;
                this.f4300g = (int) (this.f4296c * f10);
                this.f4301h = (int) (f10 * this.f4297d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f4300g;
        }

        public int c() {
            return this.f4301h;
        }

        public int d() {
            float f10 = this.f4296c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f4297d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            if (this.f4302i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f4302i + this.f4304k) {
                return true;
            }
            return false;
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f4304k = a.f((int) (currentAnimationTimeMillis - this.f4298e), 0, this.f4295b);
            this.f4303j = e(currentAnimationTimeMillis);
            this.f4302i = currentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f4295b = i10;
        }

        public void k(int i10) {
            this.f4294a = i10;
        }

        public void l(float f10, float f11) {
            this.f4296c = f10;
            this.f4297d = f11;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f4298e = currentAnimationTimeMillis;
            this.f4302i = -1L;
            this.f4299f = currentAnimationTimeMillis;
            this.f4303j = 0.5f;
            this.f4300g = 0;
            this.f4301h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoScrollHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (!aVar.B) {
                return;
            }
            if (aVar.f4293z) {
                aVar.f4293z = false;
                aVar.f4281f.m();
            }
            C0084a c0084a = a.this.f4281f;
            if (!c0084a.h() && a.this.u()) {
                a aVar2 = a.this;
                if (aVar2.A) {
                    aVar2.A = false;
                    aVar2.c();
                }
                c0084a.a();
                a.this.j(c0084a.b(), c0084a.c());
                p0.m0(a.this.f4283p, this);
                return;
            }
            a.this.B = false;
        }
    }

    public a(View view) {
        this.f4283p = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(E);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float h10 = h(this.f4285r[i10], f11, this.f4286s[i10], f10);
        if (h10 == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f4289v[i10];
        float f14 = this.f4290w[i10];
        float f15 = this.f4291x[i10];
        float f16 = f13 * f12;
        if (h10 > 0.0f) {
            return e(h10 * f16, f14, f15);
        }
        return -e((-h10) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        if (f10 < f11) {
            return f11;
        }
        return f10;
    }

    static int f(int i10, int i11, int i12) {
        if (i10 > i12) {
            return i12;
        }
        if (i10 < i11) {
            return i11;
        }
        return i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f4287t;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        } else if (f10 < f11) {
            if (f10 >= 0.0f) {
                return 1.0f - (f10 / f11);
            }
            if (this.B && i10 == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float e10 = e(f10 * f11, 0.0f, f12);
        float g10 = g(f11 - f13, e10) - g(f13, e10);
        if (g10 < 0.0f) {
            interpolation = -this.f4282m.getInterpolation(-g10);
        } else if (g10 <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f4282m.getInterpolation(g10);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f4293z) {
            this.B = false;
        } else {
            this.f4281f.i();
        }
    }

    private void v() {
        int i10;
        if (this.f4284q == null) {
            this.f4284q = new b();
        }
        this.B = true;
        this.f4293z = true;
        if (!this.f4292y && (i10 = this.f4288u) > 0) {
            p0.n0(this.f4283p, this.f4284q, i10);
        } else {
            this.f4284q.run();
        }
        this.f4292y = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f4283p.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f4288u = i10;
        return this;
    }

    public a l(int i10) {
        this.f4287t = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.C && !z10) {
            i();
        }
        this.C = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f4286s;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f4291x;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.C
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.A = r2
            r5.f4292y = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f4283p
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f4283p
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f4281f
            r7.l(r0, r6)
            boolean r6 = r5.B
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.D
            if (r6 == 0) goto L61
            boolean r6 = r5.B
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f4290w;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f4281f.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f4281f.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f4285r;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f4289v;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean u() {
        C0084a c0084a = this.f4281f;
        int f10 = c0084a.f();
        int d10 = c0084a.d();
        if ((f10 != 0 && b(f10)) || (d10 != 0 && a(d10))) {
            return true;
        }
        return false;
    }
}
