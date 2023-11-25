package e1;

import a1.q1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j0.d3;
import j0.j1;

/* compiled from: Vector.kt */
/* loaded from: classes.dex */
public final class o extends m {

    /* renamed from: b  reason: collision with root package name */
    private final e f13875b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13876c;

    /* renamed from: d  reason: collision with root package name */
    private final e1.a f13877d;

    /* renamed from: e  reason: collision with root package name */
    private pc.a<dc.w> f13878e;

    /* renamed from: f  reason: collision with root package name */
    private final j1 f13879f;

    /* renamed from: g  reason: collision with root package name */
    private float f13880g;

    /* renamed from: h  reason: collision with root package name */
    private float f13881h;

    /* renamed from: i  reason: collision with root package name */
    private long f13882i;

    /* renamed from: j  reason: collision with root package name */
    private final pc.l<c1.f, dc.w> f13883j;

    /* compiled from: Vector.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<c1.f, dc.w> {
        a() {
            super(1);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(c1.f fVar) {
            invoke2(fVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(c1.f fVar) {
            qc.q.i(fVar, "$this$null");
            o.this.j().a(fVar);
        }
    }

    /* compiled from: Vector.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f13885f = new b();

        b() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }
    }

    /* compiled from: Vector.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.a<dc.w> {
        c() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            o.this.f();
        }
    }

    public o() {
        super(null);
        j1 e10;
        e eVar = new e();
        eVar.m(0.0f);
        eVar.n(0.0f);
        eVar.d(new c());
        this.f13875b = eVar;
        this.f13876c = true;
        this.f13877d = new e1.a();
        this.f13878e = b.f13885f;
        e10 = d3.e(null, null, 2, null);
        this.f13879f = e10;
        this.f13882i = z0.l.f26375b.a();
        this.f13883j = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.f13876c = true;
        this.f13878e.invoke();
    }

    @Override // e1.m
    public void a(c1.f fVar) {
        qc.q.i(fVar, "<this>");
        g(fVar, 1.0f, null);
    }

    public final void g(c1.f fVar, float f10, q1 q1Var) {
        qc.q.i(fVar, "<this>");
        if (q1Var == null) {
            q1Var = h();
        }
        if (this.f13876c || !z0.l.f(this.f13882i, fVar.b())) {
            this.f13875b.p(z0.l.i(fVar.b()) / this.f13880g);
            this.f13875b.q(z0.l.g(fVar.b()) / this.f13881h);
            this.f13877d.b(j2.q.a((int) Math.ceil(z0.l.i(fVar.b())), (int) Math.ceil(z0.l.g(fVar.b()))), fVar, fVar.getLayoutDirection(), this.f13883j);
            this.f13876c = false;
            this.f13882i = fVar.b();
        }
        this.f13877d.c(fVar, f10, q1Var);
    }

    public final q1 h() {
        return (q1) this.f13879f.getValue();
    }

    public final String i() {
        return this.f13875b.e();
    }

    public final e j() {
        return this.f13875b;
    }

    public final float k() {
        return this.f13881h;
    }

    public final float l() {
        return this.f13880g;
    }

    public final void m(q1 q1Var) {
        this.f13879f.setValue(q1Var);
    }

    public final void n(pc.a<dc.w> aVar) {
        qc.q.i(aVar, "<set-?>");
        this.f13878e = aVar;
    }

    public final void o(String str) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f13875b.l(str);
    }

    public final void p(float f10) {
        boolean z10;
        if (this.f13881h == f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f13881h = f10;
            f();
        }
    }

    public final void q(float f10) {
        boolean z10;
        if (this.f13880g == f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f13880g = f10;
            f();
        }
    }

    public String toString() {
        String str = "Params: \tname: " + i() + "\n\tviewportWidth: " + this.f13880g + "\n\tviewportHeight: " + this.f13881h + "\n";
        qc.q.h(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
