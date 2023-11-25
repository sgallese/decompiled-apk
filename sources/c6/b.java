package c6;

import a1.f0;
import a1.g0;
import a1.h1;
import a1.q1;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import dc.f;
import dc.h;
import j0.d3;
import j0.f2;
import j0.j1;
import j2.r;
import kotlin.NoWhenBranchMatchedException;
import qc.q;
import z0.l;

/* compiled from: DrawablePainter.kt */
/* loaded from: classes.dex */
public final class b extends d1.c implements f2 {

    /* renamed from: t  reason: collision with root package name */
    private final Drawable f8857t;

    /* renamed from: u  reason: collision with root package name */
    private final j1 f8858u;

    /* renamed from: v  reason: collision with root package name */
    private final j1 f8859v;

    /* renamed from: w  reason: collision with root package name */
    private final f f8860w;

    /* compiled from: DrawablePainter.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8861a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8861a = iArr;
        }
    }

    /* compiled from: DrawablePainter.kt */
    /* renamed from: c6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0224b extends qc.r implements pc.a<a> {

        /* compiled from: DrawablePainter.kt */
        /* renamed from: c6.b$b$a */
        /* loaded from: classes.dex */
        public static final class a implements Drawable.Callback {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b f8863f;

            a(b bVar) {
                this.f8863f = bVar;
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable drawable) {
                long c10;
                q.i(drawable, "d");
                b bVar = this.f8863f;
                bVar.u(bVar.r() + 1);
                b bVar2 = this.f8863f;
                c10 = c.c(bVar2.s());
                bVar2.v(c10);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
                Handler d10;
                q.i(drawable, "d");
                q.i(runnable, "what");
                d10 = c.d();
                d10.postAtTime(runnable, j10);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                Handler d10;
                q.i(drawable, "d");
                q.i(runnable, "what");
                d10 = c.d();
                d10.removeCallbacks(runnable);
            }
        }

        C0224b() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return new a(b.this);
        }
    }

    public b(Drawable drawable) {
        j1 e10;
        long c10;
        j1 e11;
        f b10;
        q.i(drawable, "drawable");
        this.f8857t = drawable;
        e10 = d3.e(0, null, 2, null);
        this.f8858u = e10;
        c10 = c.c(drawable);
        e11 = d3.e(l.c(c10), null, 2, null);
        this.f8859v = e11;
        b10 = h.b(new C0224b());
        this.f8860w = b10;
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    private final Drawable.Callback q() {
        return (Drawable.Callback) this.f8860w.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r() {
        return ((Number) this.f8858u.getValue()).intValue();
    }

    private final long t() {
        return ((l) this.f8859v.getValue()).m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(int i10) {
        this.f8858u.setValue(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(long j10) {
        this.f8859v.setValue(l.c(j10));
    }

    @Override // d1.c
    protected boolean a(float f10) {
        int d10;
        int l10;
        Drawable drawable = this.f8857t;
        d10 = sc.c.d(f10 * 255);
        l10 = vc.l.l(d10, 0, 255);
        drawable.setAlpha(l10);
        return true;
    }

    @Override // j0.f2
    public void b() {
        c();
    }

    @Override // j0.f2
    public void c() {
        Drawable drawable = this.f8857t;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        this.f8857t.setVisible(false, false);
        this.f8857t.setCallback(null);
    }

    @Override // j0.f2
    public void d() {
        this.f8857t.setCallback(q());
        this.f8857t.setVisible(true, true);
        Drawable drawable = this.f8857t;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // d1.c
    protected boolean e(q1 q1Var) {
        ColorFilter colorFilter;
        Drawable drawable = this.f8857t;
        if (q1Var != null) {
            colorFilter = g0.b(q1Var);
        } else {
            colorFilter = null;
        }
        drawable.setColorFilter(colorFilter);
        return true;
    }

    @Override // d1.c
    protected boolean f(r rVar) {
        boolean layoutDirection;
        q.i(rVar, "layoutDirection");
        int i10 = 0;
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        Drawable drawable = this.f8857t;
        int i11 = a.f8861a[rVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                i10 = 1;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        layoutDirection = drawable.setLayoutDirection(i10);
        return layoutDirection;
    }

    @Override // d1.c
    public long k() {
        return t();
    }

    @Override // d1.c
    protected void m(c1.f fVar) {
        int d10;
        int d11;
        q.i(fVar, "<this>");
        h1 d12 = fVar.y0().d();
        r();
        Drawable drawable = this.f8857t;
        d10 = sc.c.d(l.i(fVar.b()));
        d11 = sc.c.d(l.g(fVar.b()));
        drawable.setBounds(0, 0, d10, d11);
        try {
            d12.k();
            this.f8857t.draw(f0.c(d12));
        } finally {
            d12.p();
        }
    }

    public final Drawable s() {
        return this.f8857t;
    }
}
