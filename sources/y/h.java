package y;

import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import n1.c;
import y.g;

/* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
/* loaded from: classes.dex */
public final class h implements o1.k<n1.c>, n1.c {

    /* renamed from: h  reason: collision with root package name */
    public static final b f26083h = new b(null);

    /* renamed from: i  reason: collision with root package name */
    private static final a f26084i = new a();

    /* renamed from: c  reason: collision with root package name */
    private final j f26085c;

    /* renamed from: d  reason: collision with root package name */
    private final g f26086d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f26087e;

    /* renamed from: f  reason: collision with root package name */
    private final j2.r f26088f;

    /* renamed from: g  reason: collision with root package name */
    private final u.o f26089g;

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    /* loaded from: classes.dex */
    public static final class a implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f26090a;

        a() {
        }

        @Override // n1.c.a
        public boolean a() {
            return this.f26090a;
        }
    }

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }
    }

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26091a;

        static {
            int[] iArr = new int[j2.r.values().length];
            try {
                iArr[j2.r.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j2.r.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26091a = iArr;
        }
    }

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    /* loaded from: classes.dex */
    public static final class d implements c.a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ qc.f0<g.a> f26093b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f26094c;

        d(qc.f0<g.a> f0Var, int i10) {
            this.f26093b = f0Var;
            this.f26094c = i10;
        }

        @Override // n1.c.a
        public boolean a() {
            return h.this.z(this.f26093b.f21676f, this.f26094c);
        }
    }

    public h(j jVar, g gVar, boolean z10, j2.r rVar, u.o oVar) {
        qc.q.i(jVar, "state");
        qc.q.i(gVar, "beyondBoundsInfo");
        qc.q.i(rVar, "layoutDirection");
        qc.q.i(oVar, "orientation");
        this.f26085c = jVar;
        this.f26086d = gVar;
        this.f26087e = z10;
        this.f26088f = rVar;
        this.f26089g = oVar;
    }

    private final boolean A(int i10) {
        c.b.a aVar = c.b.f19945a;
        if (c.b.h(i10, aVar.c())) {
            return false;
        }
        if (!c.b.h(i10, aVar.b())) {
            if (c.b.h(i10, aVar.a())) {
                return this.f26087e;
            }
            if (c.b.h(i10, aVar.d())) {
                if (this.f26087e) {
                    return false;
                }
            } else if (c.b.h(i10, aVar.e())) {
                int i11 = c.f26091a[this.f26088f.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        if (this.f26087e) {
                            return false;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return this.f26087e;
                }
            } else if (!c.b.h(i10, aVar.f())) {
                i.b();
                throw new KotlinNothingValueException();
            } else {
                int i12 = c.f26091a[this.f26088f.ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        return this.f26087e;
                    }
                    throw new NoWhenBranchMatchedException();
                } else if (this.f26087e) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean B(int i10) {
        boolean h10;
        boolean h11;
        c.b.a aVar = c.b.f19945a;
        boolean z10 = true;
        if (c.b.h(i10, aVar.a())) {
            h10 = true;
        } else {
            h10 = c.b.h(i10, aVar.d());
        }
        if (h10) {
            if (this.f26089g == u.o.Horizontal) {
                return true;
            }
        } else {
            if (c.b.h(i10, aVar.e())) {
                h11 = true;
            } else {
                h11 = c.b.h(i10, aVar.f());
            }
            if (h11) {
                if (this.f26089g == u.o.Vertical) {
                    return true;
                }
            } else {
                if (!c.b.h(i10, aVar.c())) {
                    z10 = c.b.h(i10, aVar.b());
                }
                if (!z10) {
                    i.b();
                    throw new KotlinNothingValueException();
                }
            }
        }
        return false;
    }

    private final g.a v(g.a aVar, int i10) {
        int b10 = aVar.b();
        int a10 = aVar.a();
        if (A(i10)) {
            a10++;
        } else {
            b10--;
        }
        return this.f26086d.a(b10, a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean z(g.a aVar, int i10) {
        if (B(i10)) {
            return false;
        }
        if (A(i10)) {
            if (aVar.a() >= this.f26085c.c() - 1) {
                return false;
            }
        } else if (aVar.b() <= 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return v0.d.a(this, eVar);
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ Object b(Object obj, pc.p pVar) {
        return v0.e.b(this, obj, pVar);
    }

    @Override // n1.c
    public <T> T e(int i10, pc.l<? super c.a, ? extends T> lVar) {
        int g10;
        qc.q.i(lVar, "block");
        if (this.f26085c.c() > 0 && this.f26085c.f()) {
            if (A(i10)) {
                g10 = this.f26085c.d();
            } else {
                g10 = this.f26085c.g();
            }
            qc.f0 f0Var = new qc.f0();
            f0Var.f21676f = (T) this.f26086d.a(g10, g10);
            T t10 = null;
            while (t10 == null && z((g.a) f0Var.f21676f, i10)) {
                T t11 = (T) v((g.a) f0Var.f21676f, i10);
                this.f26086d.e((g.a) f0Var.f21676f);
                f0Var.f21676f = t11;
                this.f26085c.e();
                t10 = lVar.invoke(new d(f0Var, i10));
            }
            this.f26086d.e((g.a) f0Var.f21676f);
            this.f26085c.e();
            return t10;
        }
        return lVar.invoke(f26084i);
    }

    @Override // o1.k
    public o1.m<n1.c> getKey() {
        return n1.d.a();
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ boolean h(pc.l lVar) {
        return v0.e.a(this, lVar);
    }

    @Override // o1.k
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public n1.c getValue() {
        return this;
    }
}
