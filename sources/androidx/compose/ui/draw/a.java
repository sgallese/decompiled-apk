package androidx.compose.ui.draw;

import androidx.compose.ui.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dc.w;
import p1.c1;
import p1.d1;
import p1.k;
import p1.s;
import p1.z0;
import pc.l;
import qc.q;
import qc.r;
import x0.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawModifier.kt */
/* loaded from: classes.dex */
public final class a extends e.c implements x0.c, c1, x0.b {
    private final x0.d A;
    private boolean B;
    private l<? super x0.d, i> C;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawModifier.kt */
    /* renamed from: androidx.compose.ui.draw.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0033a extends r implements pc.a<w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ x0.d f2333m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0033a(x0.d dVar) {
            super(0);
            this.f2333m = dVar;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a.this.I1().invoke(this.f2333m);
        }
    }

    public a(x0.d dVar, l<? super x0.d, i> lVar) {
        q.i(dVar, "cacheDrawScope");
        q.i(lVar, "block");
        this.A = dVar;
        this.C = lVar;
        dVar.g(this);
    }

    private final i J1() {
        if (!this.B) {
            x0.d dVar = this.A;
            dVar.j(null);
            d1.a(this, new C0033a(dVar));
            if (dVar.d() != null) {
                this.B = true;
            } else {
                throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
            }
        }
        i d10 = this.A.d();
        q.f(d10);
        return d10;
    }

    @Override // p1.c1
    public void E0() {
        I();
    }

    @Override // x0.c
    public void I() {
        this.B = false;
        this.A.j(null);
        s.a(this);
    }

    public final l<x0.d, i> I1() {
        return this.C;
    }

    public final void K1(l<? super x0.d, i> lVar) {
        q.i(lVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.C = lVar;
        I();
    }

    @Override // x0.b
    public long b() {
        return j2.q.c(k.h(this, z0.a(128)).a());
    }

    @Override // p1.r
    public void d0() {
        I();
    }

    @Override // x0.b
    public j2.e getDensity() {
        return k.i(this);
    }

    @Override // x0.b
    public j2.r getLayoutDirection() {
        return k.j(this);
    }

    @Override // p1.r
    public void s(c1.c cVar) {
        q.i(cVar, "<this>");
        J1().a().invoke(cVar);
    }
}
