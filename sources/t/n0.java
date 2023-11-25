package t;

import android.view.View;
import android.widget.Magnifier;
import t.m0;

/* compiled from: PlatformMagnifier.kt */
/* loaded from: classes.dex */
public final class n0 implements l0 {

    /* renamed from: b  reason: collision with root package name */
    public static final n0 f23192b = new n0();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f23193c = true;

    /* compiled from: PlatformMagnifier.kt */
    /* loaded from: classes.dex */
    public static final class a extends m0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Magnifier magnifier) {
            super(magnifier);
            qc.q.i(magnifier, "magnifier");
        }

        @Override // t.m0.a, t.k0
        public void b(long j10, long j11, float f10) {
            if (!Float.isNaN(f10)) {
                d().setZoom(f10);
            }
            if (z0.g.c(j11)) {
                d().show(z0.f.o(j10), z0.f.p(j10), z0.f.o(j11), z0.f.p(j11));
            } else {
                d().show(z0.f.o(j10), z0.f.p(j10));
            }
        }
    }

    private n0() {
    }

    @Override // t.l0
    public boolean a() {
        return f23193c;
    }

    @Override // t.l0
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public a b(a0 a0Var, View view, j2.e eVar, float f10) {
        boolean z10;
        int d10;
        int d11;
        qc.q.i(a0Var, "style");
        qc.q.i(view, "view");
        qc.q.i(eVar, "density");
        if (qc.q.d(a0Var, a0.f23106g.b())) {
            return new a(new Magnifier(view));
        }
        long S0 = eVar.S0(a0Var.g());
        float v02 = eVar.v0(a0Var.d());
        float v03 = eVar.v0(a0Var.e());
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (S0 != z0.l.f26375b.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            d10 = sc.c.d(z0.l.i(S0));
            d11 = sc.c.d(z0.l.g(S0));
            builder.setSize(d10, d11);
        }
        if (!Float.isNaN(v02)) {
            builder.setCornerRadius(v02);
        }
        if (!Float.isNaN(v03)) {
            builder.setElevation(v03);
        }
        if (!Float.isNaN(f10)) {
            builder.setInitialZoom(f10);
        }
        builder.setClippingEnabled(a0Var.c());
        Magnifier build = builder.build();
        qc.q.h(build, "Builder(view).run {\n    …    build()\n            }");
        return new a(build);
    }
}
