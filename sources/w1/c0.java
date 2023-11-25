package w1;

import android.os.Build;
import android.text.StaticLayout;

/* compiled from: StaticLayoutFactory.kt */
/* loaded from: classes.dex */
final class c0 implements q0 {
    @Override // w1.q0
    public boolean a(StaticLayout staticLayout, boolean z10) {
        qc.q.i(staticLayout, "layout");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return n0.a(staticLayout);
        }
        if (i10 < 28) {
            return false;
        }
        return z10;
    }

    @Override // w1.q0
    public StaticLayout b(r0 r0Var) {
        StaticLayout.Builder obtain;
        StaticLayout build;
        qc.q.i(r0Var, "params");
        obtain = StaticLayout.Builder.obtain(r0Var.r(), r0Var.q(), r0Var.e(), r0Var.o(), r0Var.u());
        obtain.setTextDirection(r0Var.s());
        obtain.setAlignment(r0Var.a());
        obtain.setMaxLines(r0Var.n());
        obtain.setEllipsize(r0Var.c());
        obtain.setEllipsizedWidth(r0Var.d());
        obtain.setLineSpacing(r0Var.l(), r0Var.m());
        obtain.setIncludePad(r0Var.g());
        obtain.setBreakStrategy(r0Var.b());
        obtain.setHyphenationFrequency(r0Var.f());
        obtain.setIndents(r0Var.i(), r0Var.p());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            qc.q.h(obtain, "this");
            e0.a(obtain, r0Var.h());
        }
        if (i10 >= 28) {
            qc.q.h(obtain, "this");
            g0.a(obtain, r0Var.t());
        }
        if (i10 >= 33) {
            qc.q.h(obtain, "this");
            n0.b(obtain, r0Var.j(), r0Var.k());
        }
        build = obtain.build();
        qc.q.h(build, "obtain(params.text, para…  }\n            }.build()");
        return build;
    }
}
