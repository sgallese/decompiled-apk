package h0;

import a1.p1;
import ad.k0;
import dc.w;
import j0.g3;
import j0.h0;
import j0.y2;
import kotlin.coroutines.Continuation;
import t.v;

/* compiled from: Ripple.kt */
/* loaded from: classes.dex */
public abstract class e implements v {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16349a;

    /* renamed from: b  reason: collision with root package name */
    private final float f16350b;

    /* renamed from: c  reason: collision with root package name */
    private final g3<p1> f16351c;

    /* compiled from: Ripple.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", l = {136}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f16352f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f16353m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ v.k f16354p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ m f16355q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Ripple.kt */
        /* renamed from: h0.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0385a implements dd.h<v.j> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ m f16356f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ k0 f16357m;

            C0385a(m mVar, k0 k0Var) {
                this.f16356f = mVar;
                this.f16357m = k0Var;
            }

            @Override // dd.h
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object emit(v.j jVar, Continuation<? super w> continuation) {
                if (jVar instanceof v.p) {
                    this.f16356f.e((v.p) jVar, this.f16357m);
                } else if (jVar instanceof v.q) {
                    this.f16356f.g(((v.q) jVar).a());
                } else if (jVar instanceof v.o) {
                    this.f16356f.g(((v.o) jVar).a());
                } else {
                    this.f16356f.h(jVar, this.f16357m);
                }
                return w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v.k kVar, m mVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f16354p = kVar;
            this.f16355q = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f16354p, this.f16355q, continuation);
            aVar.f16353m = obj;
            return aVar;
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f16352f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                k0 k0Var = (k0) this.f16353m;
                dd.g<v.j> b10 = this.f16354p.b();
                C0385a c0385a = new C0385a(this.f16355q, k0Var);
                this.f16352f = 1;
                if (b10.collect(c0385a, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    public /* synthetic */ e(boolean z10, float f10, g3 g3Var, qc.h hVar) {
        this(z10, f10, g3Var);
    }

    @Override // t.v
    public final t.w a(v.k kVar, j0.l lVar, int i10) {
        boolean z10;
        long a10;
        qc.q.i(kVar, "interactionSource");
        lVar.e(988743187);
        if (j0.n.K()) {
            j0.n.V(988743187, i10, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:113)");
        }
        o oVar = (o) lVar.C(p.d());
        lVar.e(-1524341038);
        if (this.f16351c.getValue().y() != p1.f146b.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a10 = this.f16351c.getValue().y();
        } else {
            a10 = oVar.a(lVar, 0);
        }
        lVar.N();
        m b10 = b(kVar, this.f16349a, this.f16350b, y2.m(p1.g(a10), lVar, 0), y2.m(oVar.b(lVar, 0), lVar, 0), lVar, (i10 & 14) | ((i10 << 12) & 458752));
        h0.c(b10, kVar, new a(kVar, b10, null), lVar, ((i10 << 3) & 112) | 520);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return b10;
    }

    public abstract m b(v.k kVar, boolean z10, float f10, g3<p1> g3Var, g3<f> g3Var2, j0.l lVar, int i10);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f16349a == eVar.f16349a && j2.h.l(this.f16350b, eVar.f16350b) && qc.q.d(this.f16351c, eVar.f16351c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((t.k.a(this.f16349a) * 31) + j2.h.m(this.f16350b)) * 31) + this.f16351c.hashCode();
    }

    private e(boolean z10, float f10, g3<p1> g3Var) {
        qc.q.i(g3Var, "color");
        this.f16349a = z10;
        this.f16350b = f10;
        this.f16351c = g3Var;
    }
}
