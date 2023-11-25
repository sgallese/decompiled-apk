package h0;

import a1.p1;
import ad.k0;
import dc.w;
import j0.f2;
import j0.g3;
import j0.y2;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import t0.t;

/* compiled from: CommonRipple.kt */
/* loaded from: classes.dex */
public final class b extends m implements f2 {

    /* renamed from: m  reason: collision with root package name */
    private final boolean f16339m;

    /* renamed from: p  reason: collision with root package name */
    private final float f16340p;

    /* renamed from: q  reason: collision with root package name */
    private final g3<p1> f16341q;

    /* renamed from: r  reason: collision with root package name */
    private final g3<f> f16342r;

    /* renamed from: s  reason: collision with root package name */
    private final t<v.p, g> f16343s;

    /* compiled from: CommonRipple.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", l = {87}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f16344f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g f16345m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ b f16346p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ v.p f16347q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar, b bVar, v.p pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f16345m = gVar;
            this.f16346p = bVar;
            this.f16347q = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f16345m, this.f16346p, this.f16347q, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f16344f;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    g gVar = this.f16345m;
                    this.f16344f = 1;
                    if (gVar.d(this) == d10) {
                        return d10;
                    }
                }
                this.f16346p.f16343s.remove(this.f16347q);
                return w.f13270a;
            } catch (Throwable th) {
                this.f16346p.f16343s.remove(this.f16347q);
                throw th;
            }
        }
    }

    public /* synthetic */ b(boolean z10, float f10, g3 g3Var, g3 g3Var2, qc.h hVar) {
        this(z10, f10, g3Var, g3Var2);
    }

    private final void j(c1.f fVar, long j10) {
        boolean z10;
        Iterator<Map.Entry<v.p, g>> it = this.f16343s.entrySet().iterator();
        while (it.hasNext()) {
            g value = it.next().getValue();
            float d10 = this.f16342r.getValue().d();
            if (d10 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                value.e(fVar, p1.o(j10, d10, 0.0f, 0.0f, 0.0f, 14, null));
            }
        }
    }

    @Override // t.w
    public void a(c1.c cVar) {
        qc.q.i(cVar, "<this>");
        long y10 = this.f16341q.getValue().y();
        cVar.d1();
        f(cVar, this.f16340p, y10);
        j(cVar, y10);
    }

    @Override // j0.f2
    public void b() {
        this.f16343s.clear();
    }

    @Override // j0.f2
    public void c() {
        this.f16343s.clear();
    }

    @Override // h0.m
    public void e(v.p pVar, k0 k0Var) {
        z0.f fVar;
        qc.q.i(pVar, "interaction");
        qc.q.i(k0Var, "scope");
        Iterator<Map.Entry<v.p, g>> it = this.f16343s.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().h();
        }
        qc.h hVar = null;
        if (this.f16339m) {
            fVar = z0.f.d(pVar.a());
        } else {
            fVar = null;
        }
        g gVar = new g(fVar, this.f16340p, this.f16339m, hVar);
        this.f16343s.put(pVar, gVar);
        ad.i.d(k0Var, null, null, new a(gVar, this, pVar, null), 3, null);
    }

    @Override // h0.m
    public void g(v.p pVar) {
        qc.q.i(pVar, "interaction");
        g gVar = this.f16343s.get(pVar);
        if (gVar != null) {
            gVar.h();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private b(boolean z10, float f10, g3<p1> g3Var, g3<f> g3Var2) {
        super(z10, g3Var2);
        qc.q.i(g3Var, "color");
        qc.q.i(g3Var2, "rippleAlpha");
        this.f16339m = z10;
        this.f16340p = f10;
        this.f16341q = g3Var;
        this.f16342r = g3Var2;
        this.f16343s = y2.g();
    }

    @Override // j0.f2
    public void d() {
    }
}
