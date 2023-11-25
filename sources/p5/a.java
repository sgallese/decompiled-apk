package p5;

import ad.g0;
import ad.k0;
import ad.r0;
import dc.n;
import dc.w;
import ec.n0;
import java.util.Map;
import kotlin.coroutines.Continuation;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: Amplitude.kt */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final p5.b f21062a;

    /* renamed from: b  reason: collision with root package name */
    private final e f21063b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f21064c;

    /* renamed from: d  reason: collision with root package name */
    private final g0 f21065d;

    /* renamed from: e  reason: collision with root package name */
    private final g0 f21066e;

    /* renamed from: f  reason: collision with root package name */
    private final g0 f21067f;

    /* renamed from: g  reason: collision with root package name */
    private final g0 f21068g;

    /* renamed from: h  reason: collision with root package name */
    private final r5.g f21069h;

    /* renamed from: i  reason: collision with root package name */
    public f f21070i;

    /* renamed from: j  reason: collision with root package name */
    private final m5.a f21071j;

    /* renamed from: k  reason: collision with root package name */
    protected v5.e f21072k;

    /* renamed from: l  reason: collision with root package name */
    private final r0<Boolean> f21073l;

    /* compiled from: Amplitude.kt */
    /* renamed from: p5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0475a extends r implements l<r5.f, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final C0475a f21074f = new C0475a();

        C0475a() {
            super(1);
        }

        public final void a(r5.f fVar) {
            r5.c cVar;
            q.i(fVar, "it");
            if (fVar instanceof r5.c) {
                cVar = (r5.c) fVar;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                cVar.flush();
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(r5.f fVar) {
            a(fVar);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Amplitude.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.amplitude.core.Amplitude$setDeviceId$1", f = "Amplitude.kt", l = {202}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f21075f;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ String f21077p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f21077p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new b(this.f21077p, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f21075f;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                r0<Boolean> u10 = a.this.u();
                this.f21075f = 1;
                if (u10.E(this) == d10) {
                    return d10;
                }
            }
            a.this.i().c().a().b(this.f21077p).c();
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Amplitude.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.amplitude.core.Amplitude$setUserId$1", f = "Amplitude.kt", l = {187}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f21078f;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ String f21080p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f21080p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new c(this.f21080p, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((c) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f21078f;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                r0<Boolean> u10 = a.this.u();
                this.f21078f = 1;
                obj = u10.E(this);
                if (obj == d10) {
                    return d10;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                a.this.i().c().a().a(this.f21080p).c();
            }
            return w.f13270a;
        }
    }

    public a(p5.b bVar, e eVar, k0 k0Var, g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4) {
        q.i(bVar, "configuration");
        q.i(eVar, "store");
        q.i(k0Var, "amplitudeScope");
        q.i(g0Var, "amplitudeDispatcher");
        q.i(g0Var2, "networkIODispatcher");
        q.i(g0Var3, "storageIODispatcher");
        q.i(g0Var4, "retryDispatcher");
        this.f21062a = bVar;
        this.f21063b = eVar;
        this.f21064c = k0Var;
        this.f21065d = g0Var;
        this.f21066e = g0Var2;
        this.f21067f = g0Var3;
        this.f21068g = g0Var4;
        if (bVar.q()) {
            this.f21069h = d();
            this.f21071j = bVar.g().a(this);
            r0<Boolean> b10 = b();
            this.f21073l = b10;
            b10.start();
            return;
        }
        throw new IllegalArgumentException("invalid configuration".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a C(a aVar, String str, Map map, q5.b bVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                map = null;
            }
            if ((i10 & 4) != 0) {
                bVar = null;
            }
            return aVar.A(str, map, bVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a D(a aVar, q5.a aVar2, q5.b bVar, pc.q qVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                bVar = null;
            }
            if ((i10 & 4) != 0) {
                qVar = null;
            }
            return aVar.B(aVar2, bVar, qVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
    }

    private final q5.d c(Map<String, ? extends Object> map) {
        q5.d dVar = new q5.d();
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    dVar.b(entry.getKey(), value);
                }
            }
        }
        return dVar;
    }

    public static /* synthetic */ a s(a aVar, Map map, q5.b bVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                bVar = null;
            }
            return aVar.q(map, bVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: identify");
    }

    public static /* synthetic */ a t(a aVar, q5.d dVar, q5.b bVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                bVar = null;
            }
            return aVar.r(dVar, bVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: identify");
    }

    private final void v(q5.a aVar) {
        if (this.f21062a.i()) {
            this.f21071j.c("Skip event for opt out config.");
            return;
        }
        if (aVar.L() == null) {
            aVar.z0(Long.valueOf(System.currentTimeMillis()));
        }
        this.f21071j.b(q.q("Logged event with type: ", aVar.D0()));
        this.f21069h.f(aVar);
    }

    public final a A(String str, Map<String, ? extends Object> map, q5.b bVar) {
        Map<String, Object> t10;
        q.i(str, "eventType");
        q5.a aVar = new q5.a();
        aVar.K0(str);
        if (map != null) {
            t10 = n0.t(map);
        } else {
            t10 = null;
        }
        aVar.J0(t10);
        if (bVar != null) {
            aVar.I0(bVar);
        }
        v(aVar);
        return this;
    }

    public final a B(q5.a aVar, q5.b bVar, pc.q<? super q5.a, ? super Integer, ? super String, w> qVar) {
        q.i(aVar, "event");
        if (bVar != null) {
            aVar.I0(bVar);
        }
        if (qVar != null) {
            aVar.T(qVar);
        }
        v(aVar);
        return this;
    }

    public final a a(r5.f fVar) {
        q.i(fVar, "plugin");
        if (fVar instanceof r5.e) {
            this.f21063b.a((r5.e) fVar, this);
        } else {
            this.f21069h.a(fVar);
        }
        return this;
    }

    public r0<Boolean> b() {
        throw null;
    }

    public r5.g d() {
        throw null;
    }

    public final void e() {
        this.f21069h.b(C0475a.f21074f);
    }

    public final g0 f() {
        return this.f21065d;
    }

    public final k0 g() {
        return this.f21064c;
    }

    public final p5.b h() {
        return this.f21062a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final v5.e i() {
        v5.e eVar = this.f21072k;
        if (eVar != null) {
            return eVar;
        }
        q.z("idContainer");
        return null;
    }

    public final m5.a j() {
        return this.f21071j;
    }

    public final g0 k() {
        return this.f21066e;
    }

    public final g0 l() {
        return this.f21068g;
    }

    public final f m() {
        f fVar = this.f21070i;
        if (fVar != null) {
            return fVar;
        }
        q.z("storage");
        return null;
    }

    public final g0 n() {
        return this.f21067f;
    }

    public final e o() {
        return this.f21063b;
    }

    public final r5.g p() {
        return this.f21069h;
    }

    public final a q(Map<String, ? extends Object> map, q5.b bVar) {
        return r(c(map), bVar);
    }

    public final a r(q5.d dVar, q5.b bVar) {
        q.i(dVar, "identify");
        q5.e eVar = new q5.e();
        eVar.N0(dVar.a());
        if (bVar != null) {
            eVar.I0(bVar);
            String M = bVar.M();
            if (M != null) {
                z(M);
            }
            String k10 = bVar.k();
            if (k10 != null) {
                w(k10);
            }
        }
        v(eVar);
        return this;
    }

    public final r0<Boolean> u() {
        return this.f21073l;
    }

    public final a w(String str) {
        q.i(str, "deviceId");
        ad.g.d(this.f21064c, this.f21065d, null, new b(str, null), 2, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(v5.e eVar) {
        q.i(eVar, "<set-?>");
        this.f21072k = eVar;
    }

    public final void y(f fVar) {
        q.i(fVar, "<set-?>");
        this.f21070i = fVar;
    }

    public final a z(String str) {
        ad.g.d(this.f21064c, this.f21065d, null, new c(str, null), 2, null);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ a(p5.b r10, p5.e r11, ad.k0 r12, ad.g0 r13, ad.g0 r14, ad.g0 r15, ad.g0 r16, int r17, qc.h r18) {
        /*
            r9 = this;
            r0 = r17 & 4
            if (r0 == 0) goto L10
            r0 = 1
            r1 = 0
            ad.y r0 = ad.s2.b(r1, r0, r1)
            ad.k0 r0 = ad.l0.a(r0)
            r4 = r0
            goto L11
        L10:
            r4 = r12
        L11:
            r0 = r17 & 8
            if (r0 == 0) goto L24
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.lang.String r1 = "newCachedThreadPool()"
            qc.q.h(r0, r1)
            ad.m1 r0 = ad.o1.b(r0)
            r5 = r0
            goto L25
        L24:
            r5 = r13
        L25:
            r0 = r17 & 16
            java.lang.String r1 = "newSingleThreadExecutor()"
            if (r0 == 0) goto L38
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            qc.q.h(r0, r1)
            ad.m1 r0 = ad.o1.b(r0)
            r6 = r0
            goto L39
        L38:
            r6 = r14
        L39:
            r0 = r17 & 32
            if (r0 == 0) goto L4d
            r0 = 3
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            java.lang.String r2 = "newFixedThreadPool(3)"
            qc.q.h(r0, r2)
            ad.m1 r0 = ad.o1.b(r0)
            r7 = r0
            goto L4e
        L4d:
            r7 = r15
        L4e:
            r0 = r17 & 64
            if (r0 == 0) goto L5f
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            qc.q.h(r0, r1)
            ad.m1 r0 = ad.o1.b(r0)
            r8 = r0
            goto L61
        L5f:
            r8 = r16
        L61:
            r1 = r9
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.a.<init>(p5.b, p5.e, ad.k0, ad.g0, ad.g0, ad.g0, ad.g0, int, qc.h):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(p5.b bVar) {
        this(bVar, new e(), null, null, null, null, null, 124, null);
        q.i(bVar, "configuration");
    }
}
