package x;

import androidx.recyclerview.widget.RecyclerView;
import j0.d3;
import j0.j1;
import java.util.List;
import kotlin.coroutines.Continuation;
import n1.a1;
import n1.b1;
import y.z;

/* compiled from: LazyListState.kt */
/* loaded from: classes.dex */
public final class a0 implements u.x {

    /* renamed from: w  reason: collision with root package name */
    public static final c f25505w = new c(null);

    /* renamed from: x  reason: collision with root package name */
    private static final s0.i<a0, ?> f25506x = s0.a.a(a.f25529f, b.f25530f);

    /* renamed from: a  reason: collision with root package name */
    private final y f25507a;

    /* renamed from: b  reason: collision with root package name */
    private final x.f f25508b;

    /* renamed from: c  reason: collision with root package name */
    private final j1<r> f25509c;

    /* renamed from: d  reason: collision with root package name */
    private final v.m f25510d;

    /* renamed from: e  reason: collision with root package name */
    private float f25511e;

    /* renamed from: f  reason: collision with root package name */
    private j2.e f25512f;

    /* renamed from: g  reason: collision with root package name */
    private final u.x f25513g;

    /* renamed from: h  reason: collision with root package name */
    private int f25514h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f25515i;

    /* renamed from: j  reason: collision with root package name */
    private int f25516j;

    /* renamed from: k  reason: collision with root package name */
    private z.a f25517k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f25518l;

    /* renamed from: m  reason: collision with root package name */
    private a1 f25519m;

    /* renamed from: n  reason: collision with root package name */
    private final b1 f25520n;

    /* renamed from: o  reason: collision with root package name */
    private final y.a f25521o;

    /* renamed from: p  reason: collision with root package name */
    private final m f25522p;

    /* renamed from: q  reason: collision with root package name */
    private final y.g f25523q;

    /* renamed from: r  reason: collision with root package name */
    private long f25524r;

    /* renamed from: s  reason: collision with root package name */
    private final y.y f25525s;

    /* renamed from: t  reason: collision with root package name */
    private final j1 f25526t;

    /* renamed from: u  reason: collision with root package name */
    private final j1 f25527u;

    /* renamed from: v  reason: collision with root package name */
    private final y.z f25528v;

    /* compiled from: LazyListState.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.p<s0.k, a0, List<? extends Integer>> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f25529f = new a();

        a() {
            super(2);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final List<Integer> invoke(s0.k kVar, a0 a0Var) {
            List<Integer> l10;
            qc.q.i(kVar, "$this$listSaver");
            qc.q.i(a0Var, "it");
            l10 = ec.t.l(Integer.valueOf(a0Var.l()), Integer.valueOf(a0Var.m()));
            return l10;
        }
    }

    /* compiled from: LazyListState.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<List<? extends Integer>, a0> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f25530f = new b();

        b() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final a0 invoke(List<Integer> list) {
            qc.q.i(list, "it");
            return new a0(list.get(0).intValue(), list.get(1).intValue());
        }
    }

    /* compiled from: LazyListState.kt */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(qc.h hVar) {
            this();
        }

        public final s0.i<a0, ?> a() {
            return a0.f25506x;
        }
    }

    /* compiled from: LazyListState.kt */
    /* loaded from: classes.dex */
    public static final class d implements b1 {
        d() {
        }

        @Override // androidx.compose.ui.e
        public /* synthetic */ androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
            return v0.d.a(this, eVar);
        }

        @Override // androidx.compose.ui.e
        public /* synthetic */ Object b(Object obj, pc.p pVar) {
            return v0.e.b(this, obj, pVar);
        }

        @Override // androidx.compose.ui.e
        public /* synthetic */ boolean h(pc.l lVar) {
            return v0.e.a(this, lVar);
        }

        @Override // n1.b1
        public void u(a1 a1Var) {
            qc.q.i(a1Var, "remeasurement");
            a0.this.f25519m = a1Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyListState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {269, 270}, m = "scroll")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f25532f;

        /* renamed from: m  reason: collision with root package name */
        Object f25533m;

        /* renamed from: p  reason: collision with root package name */
        Object f25534p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f25535q;

        /* renamed from: s  reason: collision with root package name */
        int f25537s;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25535q = obj;
            this.f25537s |= RecyclerView.UNDEFINED_DURATION;
            return a0.this.c(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyListState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements pc.p<u.u, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f25538f;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f25540p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f25541q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10, int i11, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f25540p = i10;
            this.f25541q = i11;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(u.u uVar, Continuation<? super dc.w> continuation) {
            return ((f) create(uVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new f(this.f25540p, this.f25541q, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f25538f == 0) {
                dc.n.b(obj);
                a0.this.E(this.f25540p, this.f25541q);
                return dc.w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LazyListState.kt */
    /* loaded from: classes.dex */
    static final class g extends qc.r implements pc.l<Float, Float> {
        g() {
            super(1);
        }

        public final Float a(float f10) {
            return Float.valueOf(-a0.this.x(-f10));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return a(f10.floatValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x.a0.<init>():void");
    }

    private void A(boolean z10) {
        this.f25527u.setValue(Boolean.valueOf(z10));
    }

    private void B(boolean z10) {
        this.f25526t.setValue(Boolean.valueOf(z10));
    }

    public static /* synthetic */ int G(a0 a0Var, n nVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            t0.g a10 = t0.g.f23297e.a();
            try {
                t0.g l10 = a10.l();
                try {
                    int a11 = a0Var.f25507a.a();
                    a10.d();
                    i10 = a11;
                } finally {
                    a10.s(l10);
                }
            } catch (Throwable th) {
                a10.d();
                throw th;
            }
        }
        return a0Var.F(nVar, i10);
    }

    private final void i(r rVar) {
        Object a02;
        int index;
        Object m02;
        if (this.f25516j != -1 && (!rVar.b().isEmpty()) != false) {
            if (this.f25518l) {
                m02 = ec.b0.m0(rVar.b());
                index = ((l) m02).getIndex() + 1;
            } else {
                a02 = ec.b0.a0(rVar.b());
                index = ((l) a02).getIndex() - 1;
            }
            if (this.f25516j != index) {
                this.f25516j = -1;
                z.a aVar = this.f25517k;
                if (aVar != null) {
                    aVar.cancel();
                }
                this.f25517k = null;
            }
        }
    }

    private final void w(float f10) {
        boolean z10;
        Object a02;
        int index;
        z.a aVar;
        Object m02;
        if (!this.f25515i) {
            return;
        }
        r o10 = o();
        boolean z11 = true;
        if ((!o10.b().isEmpty()) != false) {
            if (f10 < 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                m02 = ec.b0.m0(o10.b());
                index = ((l) m02).getIndex() + 1;
            } else {
                a02 = ec.b0.a0(o10.b());
                index = ((l) a02).getIndex() - 1;
            }
            if (index != this.f25516j) {
                if (index < 0 || index >= o10.a()) {
                    z11 = false;
                }
                if (z11) {
                    if (this.f25518l != z10 && (aVar = this.f25517k) != null) {
                        aVar.cancel();
                    }
                    this.f25518l = z10;
                    this.f25516j = index;
                    this.f25517k = this.f25528v.a(index, this.f25524r);
                }
            }
        }
    }

    public static /* synthetic */ Object z(a0 a0Var, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a0Var.y(i10, i11, continuation);
    }

    public final void C(j2.e eVar) {
        qc.q.i(eVar, "<set-?>");
        this.f25512f = eVar;
    }

    public final void D(long j10) {
        this.f25524r = j10;
    }

    public final void E(int i10, int i11) {
        this.f25507a.d(i10, i11);
        this.f25522p.f();
        a1 a1Var = this.f25519m;
        if (a1Var != null) {
            a1Var.j();
        }
    }

    public final int F(n nVar, int i10) {
        qc.q.i(nVar, "itemProvider");
        return this.f25507a.i(nVar, i10);
    }

    @Override // u.x
    public boolean a() {
        return ((Boolean) this.f25526t.getValue()).booleanValue();
    }

    @Override // u.x
    public boolean b() {
        return this.f25513g.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[RETURN] */
    @Override // u.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(t.b0 r6, pc.p<? super u.u, ? super kotlin.coroutines.Continuation<? super dc.w>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super dc.w> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof x.a0.e
            if (r0 == 0) goto L13
            r0 = r8
            x.a0$e r0 = (x.a0.e) r0
            int r1 = r0.f25537s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25537s = r1
            goto L18
        L13:
            x.a0$e r0 = new x.a0$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f25535q
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f25537s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            dc.n.b(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f25534p
            r7 = r6
            pc.p r7 = (pc.p) r7
            java.lang.Object r6 = r0.f25533m
            t.b0 r6 = (t.b0) r6
            java.lang.Object r2 = r0.f25532f
            x.a0 r2 = (x.a0) r2
            dc.n.b(r8)
            goto L5a
        L45:
            dc.n.b(r8)
            y.a r8 = r5.f25521o
            r0.f25532f = r5
            r0.f25533m = r6
            r0.f25534p = r7
            r0.f25537s = r4
            java.lang.Object r8 = r8.e(r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r2 = r5
        L5a:
            u.x r8 = r2.f25513g
            r2 = 0
            r0.f25532f = r2
            r0.f25533m = r2
            r0.f25534p = r2
            r0.f25537s = r3
            java.lang.Object r6 = r8.c(r6, r7, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            dc.w r6 = dc.w.f13270a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x.a0.c(t.b0, pc.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // u.x
    public boolean d() {
        return ((Boolean) this.f25527u.getValue()).booleanValue();
    }

    @Override // u.x
    public float e(float f10) {
        return this.f25513g.e(f10);
    }

    public final void h(t tVar) {
        int i10;
        qc.q.i(tVar, "result");
        this.f25507a.h(tVar);
        this.f25511e -= tVar.f();
        this.f25509c.setValue(tVar);
        B(tVar.c());
        u g10 = tVar.g();
        boolean z10 = false;
        if (g10 != null) {
            i10 = g10.getIndex();
        } else {
            i10 = 0;
        }
        if (i10 != 0 || tVar.h() != 0) {
            z10 = true;
        }
        A(z10);
        this.f25514h++;
        i(tVar);
    }

    public final y.a j() {
        return this.f25521o;
    }

    public final y.g k() {
        return this.f25523q;
    }

    public final int l() {
        return this.f25507a.a();
    }

    public final int m() {
        return this.f25507a.c();
    }

    public final v.m n() {
        return this.f25510d;
    }

    public final r o() {
        return this.f25509c.getValue();
    }

    public final vc.f p() {
        return this.f25507a.b().getValue();
    }

    public final y.y q() {
        return this.f25525s;
    }

    public final m r() {
        return this.f25522p;
    }

    public final y.z s() {
        return this.f25528v;
    }

    public final a1 t() {
        return this.f25519m;
    }

    public final b1 u() {
        return this.f25520n;
    }

    public final float v() {
        return this.f25511e;
    }

    public final float x(float f10) {
        boolean z10;
        if ((f10 < 0.0f && !a()) || (f10 > 0.0f && !d())) {
            return 0.0f;
        }
        if (Math.abs(this.f25511e) <= 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float f11 = this.f25511e + f10;
            this.f25511e = f11;
            if (Math.abs(f11) > 0.5f) {
                float f12 = this.f25511e;
                a1 a1Var = this.f25519m;
                if (a1Var != null) {
                    a1Var.j();
                }
                if (this.f25515i) {
                    w(f12 - this.f25511e);
                }
            }
            if (Math.abs(this.f25511e) <= 0.5f) {
                return f10;
            }
            float f13 = f10 - this.f25511e;
            this.f25511e = 0.0f;
            return f13;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f25511e).toString());
    }

    public final Object y(int i10, int i11, Continuation<? super dc.w> continuation) {
        Object d10;
        Object c10 = u.w.c(this, null, new f(i10, i11, null), continuation, 1, null);
        d10 = ic.d.d();
        if (c10 == d10) {
            return c10;
        }
        return dc.w.f13270a;
    }

    public a0(int i10, int i11) {
        j1<r> e10;
        j1 e11;
        j1 e12;
        y yVar = new y(i10, i11);
        this.f25507a = yVar;
        this.f25508b = new x.f(this);
        e10 = d3.e(x.a.f25500a, null, 2, null);
        this.f25509c = e10;
        this.f25510d = v.l.a();
        this.f25512f = j2.g.a(1.0f, 1.0f);
        this.f25513g = u.y.a(new g());
        this.f25515i = true;
        this.f25516j = -1;
        this.f25520n = new d();
        this.f25521o = new y.a();
        this.f25522p = new m();
        this.f25523q = new y.g();
        this.f25524r = j2.c.b(0, 0, 0, 0, 15, null);
        this.f25525s = new y.y();
        yVar.b();
        Boolean bool = Boolean.FALSE;
        e11 = d3.e(bool, null, 2, null);
        this.f25526t = e11;
        e12 = d3.e(bool, null, 2, null);
        this.f25527u = e12;
        this.f25528v = new y.z();
    }

    public /* synthetic */ a0(int i10, int i11, int i12, qc.h hVar) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
