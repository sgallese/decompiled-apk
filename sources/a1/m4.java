package a1;

import a1.p1;
import android.graphics.Shader;

/* compiled from: Brush.kt */
/* loaded from: classes.dex */
public abstract class m4 extends e1 {

    /* renamed from: c  reason: collision with root package name */
    private Shader f121c;

    /* renamed from: d  reason: collision with root package name */
    private long f122d;

    public m4() {
        super(null);
        this.f122d = z0.l.f26375b.a();
    }

    @Override // a1.e1
    public final void a(long j10, b4 b4Var, float f10) {
        boolean z10;
        qc.q.i(b4Var, "p");
        Shader shader = this.f121c;
        if (shader == null || !z0.l.f(this.f122d, j10)) {
            if (z0.l.k(j10)) {
                shader = null;
                this.f121c = null;
                this.f122d = z0.l.f26375b.a();
            } else {
                shader = b(j10);
                this.f121c = shader;
                this.f122d = j10;
            }
        }
        long e10 = b4Var.e();
        p1.a aVar = p1.f146b;
        if (!p1.q(e10, aVar.a())) {
            b4Var.v(aVar.a());
        }
        if (!qc.q.d(b4Var.n(), shader)) {
            b4Var.m(shader);
        }
        if (b4Var.d() == f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            b4Var.c(f10);
        }
    }

    public abstract Shader b(long j10);
}
