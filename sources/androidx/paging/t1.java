package androidx.paging;

import androidx.paging.d1;
import androidx.paging.m1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;

/* compiled from: PagingDataDiffer.kt */
/* loaded from: classes.dex */
public abstract class t1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final s f6052a;

    /* renamed from: b  reason: collision with root package name */
    private final hc.f f6053b;

    /* renamed from: c  reason: collision with root package name */
    private b0 f6054c;

    /* renamed from: d  reason: collision with root package name */
    private m2 f6055d;

    /* renamed from: e  reason: collision with root package name */
    private m1<T> f6056e;

    /* renamed from: f  reason: collision with root package name */
    private final x0 f6057f;

    /* renamed from: g  reason: collision with root package name */
    private final CopyOnWriteArrayList<pc.a<dc.w>> f6058g;

    /* renamed from: h  reason: collision with root package name */
    private final i2 f6059h;

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f6060i;

    /* renamed from: j  reason: collision with root package name */
    private volatile int f6061j;

    /* renamed from: k  reason: collision with root package name */
    private final e f6062k;

    /* renamed from: l  reason: collision with root package name */
    private final dd.l0<j> f6063l;

    /* renamed from: m  reason: collision with root package name */
    private final dd.w<dc.w> f6064m;

    /* compiled from: PagingDataDiffer.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t1<T> f6065f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t1<T> t1Var) {
            super(0);
            this.f6065f = t1Var;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((t1) this.f6065f).f6064m.e(dc.w.f13270a);
        }
    }

    /* compiled from: PagingDataDiffer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataDiffer$collectFrom$2", f = "PagingDataDiffer.kt", l = {140}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements pc.l<Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f6066f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ t1<T> f6067m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ s1<T> f6068p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PagingDataDiffer.kt */
        /* loaded from: classes.dex */
        public static final class a<T> implements dd.h {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ t1<T> f6069f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ s1<T> f6070m;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PagingDataDiffer.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataDiffer$collectFrom$2$1$2", f = "PagingDataDiffer.kt", l = {159, 169, 186}, m = "invokeSuspend")
            /* renamed from: androidx.paging.t1$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0142a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f  reason: collision with root package name */
                int f6071f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ d1<T> f6072m;

                /* renamed from: p  reason: collision with root package name */
                final /* synthetic */ t1<T> f6073p;

                /* renamed from: q  reason: collision with root package name */
                final /* synthetic */ s1<T> f6074q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0142a(d1<T> d1Var, t1<T> t1Var, s1<T> s1Var, Continuation<? super C0142a> continuation) {
                    super(2, continuation);
                    this.f6072m = d1Var;
                    this.f6073p = t1Var;
                    this.f6074q = s1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new C0142a(this.f6072m, this.f6073p, this.f6074q, continuation);
                }

                @Override // pc.p
                public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((C0142a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x01f8  */
                /* JADX WARN: Removed duplicated region for block: B:91:0x0210 A[LOOP:1: B:89:0x020a->B:91:0x0210, LOOP_END] */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                    /*
                        Method dump skipped, instructions count: 541
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.t1.b.a.C0142a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            a(t1<T> t1Var, s1<T> s1Var) {
                this.f6069f = t1Var;
                this.f6070m = s1Var;
            }

            @Override // dd.h
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object emit(d1<T> d1Var, Continuation<? super dc.w> continuation) {
                Object d10;
                u0 a10 = v0.a();
                boolean z10 = false;
                if (a10 != null && a10.a(2)) {
                    z10 = true;
                }
                if (z10) {
                    a10.b(2, "Collected " + d1Var, null);
                }
                Object g10 = ad.g.g(((t1) this.f6069f).f6053b, new C0142a(d1Var, this.f6069f, this.f6070m, null), continuation);
                d10 = ic.d.d();
                if (g10 == d10) {
                    return g10;
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t1<T> t1Var, s1<T> s1Var, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f6067m = t1Var;
            this.f6068p = s1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Continuation<?> continuation) {
            return new b(this.f6067m, this.f6068p, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f6066f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                ((t1) this.f6067m).f6055d = this.f6068p.d();
                dd.g<d1<T>> b10 = this.f6068p.b();
                a aVar = new a(this.f6067m, this.f6068p);
                this.f6066f = 1;
                if (b10.collect(aVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }

        @Override // pc.l
        public final Object invoke(Continuation<? super dc.w> continuation) {
            return ((b) create(continuation)).invokeSuspend(dc.w.f13270a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PagingDataDiffer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataDiffer", f = "PagingDataDiffer.kt", l = {460}, m = "presentNewList")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f6075f;

        /* renamed from: m  reason: collision with root package name */
        Object f6076m;

        /* renamed from: p  reason: collision with root package name */
        Object f6077p;

        /* renamed from: q  reason: collision with root package name */
        Object f6078q;

        /* renamed from: r  reason: collision with root package name */
        Object f6079r;

        /* renamed from: s  reason: collision with root package name */
        boolean f6080s;

        /* renamed from: t  reason: collision with root package name */
        /* synthetic */ Object f6081t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ t1<T> f6082u;

        /* renamed from: v  reason: collision with root package name */
        int f6083v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(t1<T> t1Var, Continuation<? super c> continuation) {
            super(continuation);
            this.f6082u = t1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6081t = obj;
            this.f6083v |= RecyclerView.UNDEFINED_DURATION;
            return this.f6082u.w(null, 0, 0, false, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PagingDataDiffer.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t1<T> f6084f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ m1<T> f6085m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ qc.b0 f6086p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ b0 f6087q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ s0 f6088r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ List<l2<T>> f6089s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f6090t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f6091u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ s0 f6092v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(t1<T> t1Var, m1<T> m1Var, qc.b0 b0Var, b0 b0Var2, s0 s0Var, List<l2<T>> list, int i10, int i11, s0 s0Var2) {
            super(0);
            this.f6084f = t1Var;
            this.f6085m = m1Var;
            this.f6086p = b0Var;
            this.f6087q = b0Var2;
            this.f6088r = s0Var;
            this.f6089s = list;
            this.f6090t = i10;
            this.f6091u = i11;
            this.f6092v = s0Var2;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Object c02;
            Object n02;
            String h10;
            List<T> b10;
            List<T> b11;
            ((t1) this.f6084f).f6056e = this.f6085m;
            this.f6086p.f21657f = true;
            ((t1) this.f6084f).f6054c = this.f6087q;
            s0 s0Var = this.f6088r;
            List<l2<T>> list = this.f6089s;
            int i10 = this.f6090t;
            int i11 = this.f6091u;
            b0 b0Var = this.f6087q;
            s0 s0Var2 = this.f6092v;
            u0 a10 = v0.a();
            boolean z10 = false;
            if (a10 != null && a10.a(3)) {
                z10 = true;
            }
            if (z10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Presenting data:\n                            |   first item: ");
                c02 = ec.b0.c0(list);
                l2 l2Var = (l2) c02;
                sb2.append((l2Var == null || (b11 = l2Var.b()) == null) ? null : ec.b0.c0(b11));
                sb2.append("\n                            |   last item: ");
                n02 = ec.b0.n0(list);
                l2 l2Var2 = (l2) n02;
                sb2.append((l2Var2 == null || (b10 = l2Var2.b()) == null) ? null : ec.b0.n0(b10));
                sb2.append("\n                            |   placeholdersBefore: ");
                sb2.append(i10);
                sb2.append("\n                            |   placeholdersAfter: ");
                sb2.append(i11);
                sb2.append("\n                            |   hintReceiver: ");
                sb2.append(b0Var);
                sb2.append("\n                            |   sourceLoadStates: ");
                sb2.append(s0Var2);
                sb2.append("\n                        ");
                String sb3 = sb2.toString();
                if (s0Var != null) {
                    sb3 = sb3 + "|   mediatorLoadStates: " + s0Var + '\n';
                }
                h10 = yc.o.h(sb3 + "|)", null, 1, null);
                a10.b(3, h10, null);
            }
        }
    }

    /* compiled from: PagingDataDiffer.kt */
    /* loaded from: classes.dex */
    public static final class e implements m1.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t1<T> f6093a;

        e(t1<T> t1Var) {
            this.f6093a = t1Var;
        }

        @Override // androidx.paging.m1.b
        public void a(int i10, int i11) {
            ((t1) this.f6093a).f6052a.a(i10, i11);
        }

        @Override // androidx.paging.m1.b
        public void b(int i10, int i11) {
            ((t1) this.f6093a).f6052a.b(i10, i11);
        }

        @Override // androidx.paging.m1.b
        public void c(int i10, int i11) {
            ((t1) this.f6093a).f6052a.c(i10, i11);
        }

        @Override // androidx.paging.m1.b
        public void d(t0 t0Var, boolean z10, q0 q0Var) {
            qc.q.i(t0Var, "loadType");
            qc.q.i(q0Var, "loadState");
            ((t1) this.f6093a).f6057f.g(t0Var, z10, q0Var);
        }

        @Override // androidx.paging.m1.b
        public void e(s0 s0Var, s0 s0Var2) {
            qc.q.i(s0Var, "source");
            this.f6093a.r(s0Var, s0Var2);
        }
    }

    public t1(s sVar, hc.f fVar, s1<T> s1Var) {
        d1.b<T> bVar;
        d1.b<T> a10;
        qc.q.i(sVar, "differCallback");
        qc.q.i(fVar, "mainContext");
        this.f6052a = sVar;
        this.f6053b = fVar;
        m1.a aVar = m1.f5875r;
        qc.h hVar = null;
        if (s1Var != null) {
            bVar = s1Var.a();
        } else {
            bVar = null;
        }
        this.f6056e = aVar.a(bVar);
        x0 x0Var = new x0();
        if (s1Var != null && (a10 = s1Var.a()) != null) {
            x0Var.f(a10.i(), a10.e());
        }
        this.f6057f = x0Var;
        this.f6058g = new CopyOnWriteArrayList<>();
        this.f6059h = new i2(false, 1, hVar);
        this.f6062k = new e(this);
        this.f6063l = x0Var.e();
        this.f6064m = dd.d0.a(0, 64, cd.a.DROP_OLDEST);
        p(new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.util.List<androidx.paging.l2<T>> r21, int r22, int r23, boolean r24, androidx.paging.s0 r25, androidx.paging.s0 r26, androidx.paging.b0 r27, kotlin.coroutines.Continuation<? super dc.w> r28) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.t1.w(java.util.List, int, int, boolean, androidx.paging.s0, androidx.paging.s0, androidx.paging.b0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void p(pc.a<dc.w> aVar) {
        qc.q.i(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f6058g.add(aVar);
    }

    public final Object q(s1<T> s1Var, Continuation<? super dc.w> continuation) {
        Object d10;
        Object c10 = i2.c(this.f6059h, 0, new b(this, s1Var, null), continuation, 1, null);
        d10 = ic.d.d();
        if (c10 == d10) {
            return c10;
        }
        return dc.w.f13270a;
    }

    public final void r(s0 s0Var, s0 s0Var2) {
        qc.q.i(s0Var, "source");
        this.f6057f.f(s0Var, s0Var2);
    }

    public final T s(int i10) {
        boolean z10 = true;
        this.f6060i = true;
        this.f6061j = i10;
        u0 a10 = v0.a();
        if (a10 == null || !a10.a(2)) {
            z10 = false;
        }
        if (z10) {
            a10.b(2, "Accessing item index[" + i10 + ']', null);
        }
        b0 b0Var = this.f6054c;
        if (b0Var != null) {
            b0Var.a(this.f6056e.b(i10));
        }
        return this.f6056e.k(i10);
    }

    public final dd.l0<j> t() {
        return this.f6063l;
    }

    public boolean u() {
        return false;
    }

    public abstract Object v(a1<T> a1Var, a1<T> a1Var2, int i10, pc.a<dc.w> aVar, Continuation<? super Integer> continuation);

    public final void x() {
        u0 a10 = v0.a();
        boolean z10 = false;
        if (a10 != null && a10.a(3)) {
            z10 = true;
        }
        if (z10) {
            a10.b(3, "Refresh signal received", null);
        }
        m2 m2Var = this.f6055d;
        if (m2Var != null) {
            m2Var.a();
        }
    }

    public final j0<T> y() {
        return this.f6056e.q();
    }
}
