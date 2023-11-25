package s4;

import androidx.recyclerview.widget.RecyclerView;
import dc.w;
import dd.n0;
import dd.x;
import kotlin.coroutines.Continuation;
import n1.g0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.m;
import n1.n;
import n1.y;
import n1.y0;
import n1.z;
import pc.l;
import pc.p;
import qc.r;

/* compiled from: AsyncImage.kt */
/* loaded from: classes.dex */
public final class d implements c5.j, z {

    /* renamed from: c  reason: collision with root package name */
    private final x<j2.b> f23000c = n0.a(j2.b.b(j.c()));

    /* compiled from: AsyncImage.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements l<y0.a, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f23001f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var) {
            super(1);
            this.f23001f = y0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            y0.a.n(aVar, this.f23001f, 0, 0, 0.0f, 4, null);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes.dex */
    public static final class b implements dd.g<c5.i> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ dd.g f23002f;

        /* compiled from: Emitters.kt */
        /* loaded from: classes.dex */
        public static final class a<T> implements dd.h {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ dd.h f23003f;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2", f = "AsyncImage.kt", l = {225}, m = "emit")
            /* renamed from: s4.d$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0538a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: f  reason: collision with root package name */
                /* synthetic */ Object f23004f;

                /* renamed from: m  reason: collision with root package name */
                int f23005m;

                public C0538a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f23004f = obj;
                    this.f23005m |= RecyclerView.UNDEFINED_DURATION;
                    return a.this.emit(null, this);
                }
            }

            public a(dd.h hVar) {
                this.f23003f = hVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // dd.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof s4.d.b.a.C0538a
                    if (r0 == 0) goto L13
                    r0 = r8
                    s4.d$b$a$a r0 = (s4.d.b.a.C0538a) r0
                    int r1 = r0.f23005m
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f23005m = r1
                    goto L18
                L13:
                    s4.d$b$a$a r0 = new s4.d$b$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f23004f
                    java.lang.Object r1 = ic.b.d()
                    int r2 = r0.f23005m
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    dc.n.b(r8)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    dc.n.b(r8)
                    dd.h r8 = r6.f23003f
                    j2.b r7 = (j2.b) r7
                    long r4 = r7.t()
                    c5.i r7 = s4.a.c(r4)
                    if (r7 == 0) goto L4b
                    r0.f23005m = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L4b
                    return r1
                L4b:
                    dc.w r7 = dc.w.f13270a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: s4.d.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(dd.g gVar) {
            this.f23002f = gVar;
        }

        @Override // dd.g
        public Object collect(dd.h<? super c5.i> hVar, Continuation continuation) {
            Object d10;
            Object collect = this.f23002f.collect(new a(hVar), continuation);
            d10 = ic.d.d();
            if (collect == d10) {
                return collect;
            }
            return w.f13270a;
        }
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return v0.d.a(this, eVar);
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ Object b(Object obj, p pVar) {
        return v0.e.b(this, obj, pVar);
    }

    @Override // n1.z
    public j0 d(l0 l0Var, g0 g0Var, long j10) {
        this.f23000c.setValue(j2.b.b(j10));
        y0 w10 = g0Var.w(j10);
        return k0.b(l0Var, w10.A0(), w10.l0(), null, new a(w10), 4, null);
    }

    @Override // n1.z
    public /* synthetic */ int f(n nVar, m mVar, int i10) {
        return y.b(this, nVar, mVar, i10);
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ boolean h(l lVar) {
        return v0.e.a(this, lVar);
    }

    @Override // c5.j
    public Object m(Continuation<? super c5.i> continuation) {
        return dd.i.v(new b(this.f23000c), continuation);
    }

    @Override // n1.z
    public /* synthetic */ int n(n nVar, m mVar, int i10) {
        return y.c(this, nVar, mVar, i10);
    }

    @Override // n1.z
    public /* synthetic */ int r(n nVar, m mVar, int i10) {
        return y.a(this, nVar, mVar, i10);
    }

    @Override // n1.z
    public /* synthetic */ int t(n nVar, m mVar, int i10) {
        return y.d(this, nVar, mVar, i10);
    }
}
