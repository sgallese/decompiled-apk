package y;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LazyLayoutItemContentFactory.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final s0.c f26102a;

    /* renamed from: b  reason: collision with root package name */
    private final pc.a<o> f26103b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Object, a> f26104c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LazyLayoutItemContentFactory.kt */
    /* loaded from: classes.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f26105a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f26106b;

        /* renamed from: c  reason: collision with root package name */
        private int f26107c;

        /* renamed from: d  reason: collision with root package name */
        private pc.p<? super j0.l, ? super Integer, dc.w> f26108d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f26109e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazyLayoutItemContentFactory.kt */
        /* renamed from: y.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0597a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ m f26110f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ a f26111m;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: LazyLayoutItemContentFactory.kt */
            /* renamed from: y.m$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0598a extends qc.r implements pc.l<j0.f0, j0.e0> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ a f26112f;

                /* compiled from: Effects.kt */
                /* renamed from: y.m$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0599a implements j0.e0 {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f26113a;

                    public C0599a(a aVar) {
                        this.f26113a = aVar;
                    }

                    @Override // j0.e0
                    public void dispose() {
                        this.f26113a.f26108d = null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0598a(a aVar) {
                    super(1);
                    this.f26112f = aVar;
                }

                @Override // pc.l
                public final j0.e0 invoke(j0.f0 f0Var) {
                    qc.q.i(f0Var, "$this$DisposableEffect");
                    return new C0599a(this.f26112f);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0597a(m mVar, a aVar) {
                super(2);
                this.f26110f = mVar;
                this.f26111m = aVar;
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
                invoke(lVar, num.intValue());
                return dc.w.f13270a;
            }

            public final void invoke(j0.l lVar, int i10) {
                if ((i10 & 11) == 2 && lVar.t()) {
                    lVar.z();
                    return;
                }
                if (j0.n.K()) {
                    j0.n.V(1403994769, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:90)");
                }
                o invoke = this.f26110f.d().invoke();
                int f10 = this.f26111m.f();
                if ((f10 >= invoke.c() || !qc.q.d(invoke.a(f10), this.f26111m.g())) && (f10 = invoke.b(this.f26111m.g())) != -1) {
                    this.f26111m.f26107c = f10;
                }
                int i11 = f10;
                boolean z10 = i11 != -1;
                m mVar = this.f26110f;
                a aVar = this.f26111m;
                lVar.v(207, Boolean.valueOf(z10));
                boolean c10 = lVar.c(z10);
                if (z10) {
                    n.a(invoke, i0.a(mVar.f26102a), i11, i0.a(aVar.g()), lVar, 0);
                } else {
                    lVar.o(c10);
                }
                lVar.d();
                j0.h0.b(this.f26111m.g(), new C0598a(this.f26111m), lVar, 8);
                if (j0.n.K()) {
                    j0.n.U();
                }
            }
        }

        public a(m mVar, int i10, Object obj, Object obj2) {
            qc.q.i(obj, "key");
            this.f26109e = mVar;
            this.f26105a = obj;
            this.f26106b = obj2;
            this.f26107c = i10;
        }

        private final pc.p<j0.l, Integer, dc.w> c() {
            return q0.c.c(1403994769, true, new C0597a(this.f26109e, this));
        }

        public final pc.p<j0.l, Integer, dc.w> d() {
            pc.p pVar = this.f26108d;
            if (pVar == null) {
                pc.p<j0.l, Integer, dc.w> c10 = c();
                this.f26108d = c10;
                return c10;
            }
            return pVar;
        }

        public final Object e() {
            return this.f26106b;
        }

        public final int f() {
            return this.f26107c;
        }

        public final Object g() {
            return this.f26105a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(s0.c cVar, pc.a<? extends o> aVar) {
        qc.q.i(cVar, "saveableStateHolder");
        qc.q.i(aVar, "itemProvider");
        this.f26102a = cVar;
        this.f26103b = aVar;
        this.f26104c = new LinkedHashMap();
    }

    public final pc.p<j0.l, Integer, dc.w> b(int i10, Object obj, Object obj2) {
        qc.q.i(obj, "key");
        a aVar = this.f26104c.get(obj);
        if (aVar != null && aVar.f() == i10 && qc.q.d(aVar.e(), obj2)) {
            return aVar.d();
        }
        a aVar2 = new a(this, i10, obj, obj2);
        this.f26104c.put(obj, aVar2);
        return aVar2.d();
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = this.f26104c.get(obj);
        if (aVar != null) {
            return aVar.e();
        }
        o invoke = this.f26103b.invoke();
        int b10 = invoke.b(obj);
        if (b10 == -1) {
            return null;
        }
        return invoke.d(b10);
    }

    public final pc.a<o> d() {
        return this.f26103b;
    }
}
