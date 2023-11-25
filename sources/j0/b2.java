package j0;

import ad.m;
import ad.x1;
import androidx.compose.runtime.ComposeRuntimeError;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dc.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import t0.g;
import t0.h;

/* compiled from: Recomposer.kt */
/* loaded from: classes.dex */
public final class b2 extends p {

    /* renamed from: a  reason: collision with root package name */
    private long f18538a;

    /* renamed from: b  reason: collision with root package name */
    private final j0.h f18539b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f18540c;

    /* renamed from: d  reason: collision with root package name */
    private ad.x1 f18541d;

    /* renamed from: e  reason: collision with root package name */
    private Throwable f18542e;

    /* renamed from: f  reason: collision with root package name */
    private final List<y> f18543f;

    /* renamed from: g  reason: collision with root package name */
    private k0.c<Object> f18544g;

    /* renamed from: h  reason: collision with root package name */
    private final List<y> f18545h;

    /* renamed from: i  reason: collision with root package name */
    private final List<y> f18546i;

    /* renamed from: j  reason: collision with root package name */
    private final List<c1> f18547j;

    /* renamed from: k  reason: collision with root package name */
    private final Map<a1<Object>, List<c1>> f18548k;

    /* renamed from: l  reason: collision with root package name */
    private final Map<c1, b1> f18549l;

    /* renamed from: m  reason: collision with root package name */
    private List<y> f18550m;

    /* renamed from: n  reason: collision with root package name */
    private Set<y> f18551n;

    /* renamed from: o  reason: collision with root package name */
    private ad.m<? super dc.w> f18552o;

    /* renamed from: p  reason: collision with root package name */
    private int f18553p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f18554q;

    /* renamed from: r  reason: collision with root package name */
    private b f18555r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f18556s;

    /* renamed from: t  reason: collision with root package name */
    private final dd.x<d> f18557t;

    /* renamed from: u  reason: collision with root package name */
    private final ad.y f18558u;

    /* renamed from: v  reason: collision with root package name */
    private final hc.f f18559v;

    /* renamed from: w  reason: collision with root package name */
    private final c f18560w;

    /* renamed from: x  reason: collision with root package name */
    public static final a f18535x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f18536y = 8;

    /* renamed from: z  reason: collision with root package name */
    private static final dd.x<l0.h<c>> f18537z = dd.n0.a(l0.a.c());
    private static final AtomicReference<Boolean> A = new AtomicReference<>(Boolean.FALSE);

    /* compiled from: Recomposer.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(c cVar) {
            l0.h hVar;
            l0.h add;
            do {
                hVar = (l0.h) b2.f18537z.getValue();
                add = hVar.add((l0.h) cVar);
                if (hVar == add) {
                    return;
                }
            } while (!b2.f18537z.b(hVar, add));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(c cVar) {
            l0.h hVar;
            l0.h remove;
            do {
                hVar = (l0.h) b2.f18537z.getValue();
                remove = hVar.remove((l0.h) cVar);
                if (hVar == remove) {
                    return;
                }
            } while (!b2.f18537z.b(hVar, remove));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Recomposer.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f18561a;

        /* renamed from: b  reason: collision with root package name */
        private final Exception f18562b;

        public b(boolean z10, Exception exc) {
            qc.q.i(exc, "cause");
            this.f18561a = z10;
            this.f18562b = exc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Recomposer.kt */
    /* loaded from: classes.dex */
    public final class c {
        public c() {
        }
    }

    /* compiled from: Recomposer.kt */
    /* loaded from: classes.dex */
    public enum d {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* compiled from: Recomposer.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.a<dc.w> {
        e() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ad.m W;
            Object obj = b2.this.f18540c;
            b2 b2Var = b2.this;
            synchronized (obj) {
                W = b2Var.W();
                if (((d) b2Var.f18557t.getValue()).compareTo(d.ShuttingDown) <= 0) {
                    throw ad.l1.a("Recomposer shutdown; frame clock awaiter will never resume", b2Var.f18542e);
                }
            }
            if (W != null) {
                m.a aVar = dc.m.f13253f;
                W.resumeWith(dc.m.a(dc.w.f13270a));
            }
        }
    }

    /* compiled from: Recomposer.kt */
    /* loaded from: classes.dex */
    static final class f extends qc.r implements pc.l<Throwable, dc.w> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Recomposer.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<Throwable, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b2 f18566f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ Throwable f18567m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b2 b2Var, Throwable th) {
                super(1);
                this.f18566f = b2Var;
                this.f18567m = th;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
                invoke2(th);
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                Object obj = this.f18566f.f18540c;
                b2 b2Var = this.f18566f;
                Throwable th2 = this.f18567m;
                synchronized (obj) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th != null) {
                        if ((!(th instanceof CancellationException)) == false) {
                            th = null;
                        }
                        if (th != null) {
                            dc.b.a(th2, th);
                        }
                    }
                    b2Var.f18542e = th2;
                    b2Var.f18557t.setValue(d.ShutDown);
                    dc.w wVar = dc.w.f13270a;
                }
            }
        }

        f() {
            super(1);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
            invoke2(th);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            ad.m mVar;
            ad.m mVar2;
            CancellationException a10 = ad.l1.a("Recomposer effect job completed", th);
            Object obj = b2.this.f18540c;
            b2 b2Var = b2.this;
            synchronized (obj) {
                ad.x1 x1Var = b2Var.f18541d;
                mVar = null;
                if (x1Var != null) {
                    b2Var.f18557t.setValue(d.ShuttingDown);
                    if (b2Var.f18554q) {
                        if (b2Var.f18552o != null) {
                            mVar2 = b2Var.f18552o;
                            b2Var.f18552o = null;
                            x1Var.s0(new a(b2Var, th));
                            mVar = mVar2;
                        }
                    } else {
                        x1Var.c(a10);
                    }
                    mVar2 = null;
                    b2Var.f18552o = null;
                    x1Var.s0(new a(b2Var, th));
                    mVar = mVar2;
                } else {
                    b2Var.f18542e = a10;
                    b2Var.f18557t.setValue(d.ShutDown);
                    dc.w wVar = dc.w.f13270a;
                }
            }
            if (mVar != null) {
                m.a aVar = dc.m.f13253f;
                mVar.resumeWith(dc.m.a(dc.w.f13270a));
            }
        }
    }

    /* compiled from: Recomposer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements pc.p<d, Continuation<? super Boolean>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f18568f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f18569m;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, Continuation<? super Boolean> continuation) {
            return ((g) create(dVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(continuation);
            gVar.f18569m = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            ic.d.d();
            if (this.f18568f == 0) {
                dc.n.b(obj);
                if (((d) this.f18569m) == d.ShutDown) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    /* loaded from: classes.dex */
    public static final class h extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k0.c<Object> f18570f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ y f18571m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(k0.c<Object> cVar, y yVar) {
            super(0);
            this.f18570f = cVar;
            this.f18571m = yVar;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            k0.c<Object> cVar = this.f18570f;
            y yVar = this.f18571m;
            Object[] j10 = cVar.j();
            int size = cVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = j10[i10];
                qc.q.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                yVar.q(obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    /* loaded from: classes.dex */
    public static final class i extends qc.r implements pc.l<Object, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y f18572f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(y yVar) {
            super(1);
            this.f18572f = yVar;
        }

        public final void a(Object obj) {
            qc.q.i(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.f18572f.a(obj);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Object obj) {
            a(obj);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {945}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f18573f;

        /* renamed from: m  reason: collision with root package name */
        int f18574m;

        /* renamed from: p  reason: collision with root package name */
        private /* synthetic */ Object f18575p;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ pc.q<ad.k0, y0, Continuation<? super dc.w>, Object> f18577r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ y0 f18578s;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Recomposer.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", l = {946}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f18579f;

            /* renamed from: m  reason: collision with root package name */
            private /* synthetic */ Object f18580m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ pc.q<ad.k0, y0, Continuation<? super dc.w>, Object> f18581p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ y0 f18582q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(pc.q<? super ad.k0, ? super y0, ? super Continuation<? super dc.w>, ? extends Object> qVar, y0 y0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f18581p = qVar;
                this.f18582q = y0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f18581p, this.f18582q, continuation);
                aVar.f18580m = obj;
                return aVar;
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f18579f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    ad.k0 k0Var = (ad.k0) this.f18580m;
                    pc.q<ad.k0, y0, Continuation<? super dc.w>, Object> qVar = this.f18581p;
                    y0 y0Var = this.f18582q;
                    this.f18579f = 1;
                    if (qVar.invoke(k0Var, y0Var, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Recomposer.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.p<Set<? extends Object>, t0.g, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b2 f18583f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(b2 b2Var) {
                super(2);
                this.f18583f = b2Var;
            }

            public final void a(Set<? extends Object> set, t0.g gVar) {
                ad.m mVar;
                qc.q.i(set, "changed");
                qc.q.i(gVar, "<anonymous parameter 1>");
                Object obj = this.f18583f.f18540c;
                b2 b2Var = this.f18583f;
                synchronized (obj) {
                    if (((d) b2Var.f18557t.getValue()).compareTo(d.Idle) >= 0) {
                        b2Var.f18544g.e(set);
                        mVar = b2Var.W();
                    } else {
                        mVar = null;
                    }
                }
                if (mVar != null) {
                    m.a aVar = dc.m.f13253f;
                    mVar.resumeWith(dc.m.a(dc.w.f13270a));
                }
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ dc.w invoke(Set<? extends Object> set, t0.g gVar) {
                a(set, gVar);
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(pc.q<? super ad.k0, ? super y0, ? super Continuation<? super dc.w>, ? extends Object> qVar, y0 y0Var, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f18577r = qVar;
            this.f18578s = y0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            j jVar = new j(this.f18577r, this.f18578s, continuation);
            jVar.f18575p = obj;
            return jVar;
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((j) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j0.b2.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {526, 537}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements pc.q<ad.k0, y0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f18584f;

        /* renamed from: m  reason: collision with root package name */
        Object f18585m;

        /* renamed from: p  reason: collision with root package name */
        Object f18586p;

        /* renamed from: q  reason: collision with root package name */
        Object f18587q;

        /* renamed from: r  reason: collision with root package name */
        Object f18588r;

        /* renamed from: s  reason: collision with root package name */
        int f18589s;

        /* renamed from: t  reason: collision with root package name */
        /* synthetic */ Object f18590t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Recomposer.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<Long, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b2 f18592f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ List<y> f18593m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ List<c1> f18594p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ Set<y> f18595q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ List<y> f18596r;

            /* renamed from: s  reason: collision with root package name */
            final /* synthetic */ Set<y> f18597s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b2 b2Var, List<y> list, List<c1> list2, Set<y> set, List<y> list3, Set<y> set2) {
                super(1);
                this.f18592f = b2Var;
                this.f18593m = list;
                this.f18594p = list2;
                this.f18595q = set;
                this.f18596r = list3;
                this.f18597s = set2;
            }

            public final void a(long j10) {
                Object a10;
                if (this.f18592f.a0()) {
                    b2 b2Var = this.f18592f;
                    k3 k3Var = k3.f18687a;
                    a10 = k3Var.a("Recomposer:animation");
                    try {
                        b2Var.f18539b.k(j10);
                        t0.g.f23297e.g();
                        dc.w wVar = dc.w.f13270a;
                        k3Var.b(a10);
                    } finally {
                    }
                }
                b2 b2Var2 = this.f18592f;
                List<y> list = this.f18593m;
                List<c1> list2 = this.f18594p;
                Set<y> set = this.f18595q;
                List<y> list3 = this.f18596r;
                Set<y> set2 = this.f18597s;
                a10 = k3.f18687a.a("Recomposer:recompose");
                try {
                    b2Var2.p0();
                    synchronized (b2Var2.f18540c) {
                        List list4 = b2Var2.f18545h;
                        int size = list4.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            list.add((y) list4.get(i10));
                        }
                        b2Var2.f18545h.clear();
                        dc.w wVar2 = dc.w.f13270a;
                    }
                    k0.c cVar = new k0.c();
                    k0.c cVar2 = new k0.c();
                    while (true) {
                        if ((!list.isEmpty()) == false && (!list2.isEmpty()) == false) {
                            break;
                        }
                        try {
                            try {
                                int size2 = list.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    y yVar = list.get(i11);
                                    cVar2.add(yVar);
                                    y k02 = b2Var2.k0(yVar, cVar);
                                    if (k02 != null) {
                                        list3.add(k02);
                                    }
                                }
                                list.clear();
                                if (cVar.k()) {
                                    synchronized (b2Var2.f18540c) {
                                        List list5 = b2Var2.f18543f;
                                        int size3 = list5.size();
                                        for (int i12 = 0; i12 < size3; i12++) {
                                            y yVar2 = (y) list5.get(i12);
                                            if (!cVar2.contains(yVar2) && yVar2.f(cVar)) {
                                                list.add(yVar2);
                                            }
                                        }
                                        dc.w wVar3 = dc.w.f13270a;
                                    }
                                }
                                if (list.isEmpty()) {
                                    try {
                                        k.k(list2, b2Var2);
                                        while ((!list2.isEmpty()) != false) {
                                            ec.y.w(set, b2Var2.j0(list2, cVar));
                                            k.k(list2, b2Var2);
                                        }
                                    } catch (Exception e10) {
                                        b2.m0(b2Var2, e10, null, true, 2, null);
                                        k.j(list, list2, list3, set, set2);
                                        return;
                                    }
                                }
                            } catch (Exception e11) {
                                b2.m0(b2Var2, e11, null, true, 2, null);
                                k.j(list, list2, list3, set, set2);
                                list.clear();
                                return;
                            }
                        } catch (Throwable th) {
                            list.clear();
                            throw th;
                        }
                    }
                    if ((!list3.isEmpty()) != false) {
                        b2Var2.f18538a = b2Var2.Y() + 1;
                        try {
                            int size4 = list3.size();
                            for (int i13 = 0; i13 < size4; i13++) {
                                set2.add(list3.get(i13));
                            }
                            int size5 = list3.size();
                            for (int i14 = 0; i14 < size5; i14++) {
                                list3.get(i14).m();
                            }
                        } catch (Exception e12) {
                            b2.m0(b2Var2, e12, null, false, 6, null);
                            k.j(list, list2, list3, set, set2);
                            return;
                        } finally {
                            list3.clear();
                        }
                    }
                    if ((!set.isEmpty()) != false) {
                        try {
                            try {
                                ec.y.w(set2, set);
                                Iterator<T> it = set.iterator();
                                while (it.hasNext()) {
                                    ((y) it.next()).i();
                                }
                            } catch (Exception e13) {
                                b2.m0(b2Var2, e13, null, false, 6, null);
                                k.j(list, list2, list3, set, set2);
                                set.clear();
                                return;
                            }
                        } finally {
                            set.clear();
                        }
                    }
                    if ((!set2.isEmpty()) != false) {
                        try {
                            try {
                                Iterator<T> it2 = set2.iterator();
                                while (it2.hasNext()) {
                                    ((y) it2.next()).s();
                                }
                            } catch (Exception e14) {
                                b2.m0(b2Var2, e14, null, false, 6, null);
                                k.j(list, list2, list3, set, set2);
                                set2.clear();
                                return;
                            }
                        } finally {
                            set2.clear();
                        }
                    }
                    synchronized (b2Var2.f18540c) {
                        b2Var2.W();
                    }
                    t0.g.f23297e.c();
                    b2Var2.f18551n = null;
                    dc.w wVar4 = dc.w.f13270a;
                } finally {
                }
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(Long l10) {
                a(l10.longValue());
                return dc.w.f13270a;
            }
        }

        k(Continuation<? super k> continuation) {
            super(3, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(List<y> list, List<c1> list2, List<y> list3, Set<y> set, Set<y> set2) {
            list.clear();
            list2.clear();
            list3.clear();
            set.clear();
            set2.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(List<c1> list, b2 b2Var) {
            list.clear();
            synchronized (b2Var.f18540c) {
                List list2 = b2Var.f18547j;
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.add((c1) list2.get(i10));
                }
                b2Var.f18547j.clear();
                dc.w wVar = dc.w.f13270a;
            }
        }

        @Override // pc.q
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public final Object invoke(ad.k0 k0Var, y0 y0Var, Continuation<? super dc.w> continuation) {
            k kVar = new k(continuation);
            kVar.f18590t = y0Var;
            return kVar.invokeSuspend(dc.w.f13270a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00f5  */
        /* JADX WARN: Type inference failed for: r2v11, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r5v10, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r5v12, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00dd -> B:23:0x00e1). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00eb -> B:11:0x0086). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j0.b2.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    /* loaded from: classes.dex */
    public static final class l extends qc.r implements pc.l<Object, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y f18598f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ k0.c<Object> f18599m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(y yVar, k0.c<Object> cVar) {
            super(1);
            this.f18598f = yVar;
            this.f18599m = cVar;
        }

        public final void a(Object obj) {
            qc.q.i(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.f18598f.q(obj);
            k0.c<Object> cVar = this.f18599m;
            if (cVar != null) {
                cVar.add(obj);
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Object obj) {
            a(obj);
            return dc.w.f13270a;
        }
    }

    public b2(hc.f fVar) {
        qc.q.i(fVar, "effectCoroutineContext");
        j0.h hVar = new j0.h(new e());
        this.f18539b = hVar;
        this.f18540c = new Object();
        this.f18543f = new ArrayList();
        this.f18544g = new k0.c<>();
        this.f18545h = new ArrayList();
        this.f18546i = new ArrayList();
        this.f18547j = new ArrayList();
        this.f18548k = new LinkedHashMap();
        this.f18549l = new LinkedHashMap();
        this.f18557t = dd.n0.a(d.Inactive);
        ad.y a10 = ad.a2.a((ad.x1) fVar.get(ad.x1.f574b));
        a10.s0(new f());
        this.f18558u = a10;
        this.f18559v = fVar.plus(hVar).plus(a10);
        this.f18560w = new c();
    }

    private final void T(t0.b bVar) {
        try {
            if (!(bVar.C() instanceof h.a)) {
                return;
            }
            throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
        } finally {
            bVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object U(Continuation<? super dc.w> continuation) {
        Continuation c10;
        ad.n nVar;
        Object d10;
        Object d11;
        if (!d0()) {
            c10 = ic.c.c(continuation);
            ad.n nVar2 = new ad.n(c10, 1);
            nVar2.A();
            synchronized (this.f18540c) {
                if (!d0()) {
                    this.f18552o = nVar2;
                    nVar = null;
                } else {
                    nVar = nVar2;
                }
            }
            if (nVar != null) {
                m.a aVar = dc.m.f13253f;
                nVar.resumeWith(dc.m.a(dc.w.f13270a));
            }
            Object x10 = nVar2.x();
            d10 = ic.d.d();
            if (x10 == d10) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            d11 = ic.d.d();
            if (x10 == d11) {
                return x10;
            }
            return dc.w.f13270a;
        }
        return dc.w.f13270a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ad.m<dc.w> W() {
        d dVar;
        if (this.f18557t.getValue().compareTo(d.ShuttingDown) <= 0) {
            this.f18543f.clear();
            this.f18544g = new k0.c<>();
            this.f18545h.clear();
            this.f18546i.clear();
            this.f18547j.clear();
            this.f18550m = null;
            ad.m<? super dc.w> mVar = this.f18552o;
            if (mVar != null) {
                m.a.a(mVar, null, 1, null);
            }
            this.f18552o = null;
            this.f18555r = null;
            return null;
        }
        if (this.f18555r != null) {
            dVar = d.Inactive;
        } else if (this.f18541d == null) {
            this.f18544g = new k0.c<>();
            this.f18545h.clear();
            if (b0()) {
                dVar = d.InactivePendingWork;
            } else {
                dVar = d.Inactive;
            }
        } else if ((!this.f18545h.isEmpty()) == false && !this.f18544g.k() && (!this.f18546i.isEmpty()) == false && (!this.f18547j.isEmpty()) == false && this.f18553p <= 0 && !b0()) {
            dVar = d.Idle;
        } else {
            dVar = d.PendingWork;
        }
        this.f18557t.setValue(dVar);
        if (dVar != d.PendingWork) {
            return null;
        }
        ad.m mVar2 = this.f18552o;
        this.f18552o = null;
        return mVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X() {
        int i10;
        List i11;
        List t10;
        synchronized (this.f18540c) {
            if ((!this.f18548k.isEmpty()) != false) {
                t10 = ec.u.t(this.f18548k.values());
                this.f18548k.clear();
                i11 = new ArrayList(t10.size());
                int size = t10.size();
                for (int i12 = 0; i12 < size; i12++) {
                    c1 c1Var = (c1) t10.get(i12);
                    i11.add(dc.r.a(c1Var, this.f18549l.get(c1Var)));
                }
                this.f18549l.clear();
            } else {
                i11 = ec.t.i();
            }
        }
        int size2 = i11.size();
        for (i10 = 0; i10 < size2; i10++) {
            dc.l lVar = (dc.l) i11.get(i10);
            c1 c1Var2 = (c1) lVar.a();
            b1 b1Var = (b1) lVar.b();
            if (b1Var != null) {
                c1Var2.b().g(b1Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a0() {
        boolean b02;
        synchronized (this.f18540c) {
            b02 = b0();
        }
        return b02;
    }

    private final boolean b0() {
        if (!this.f18556s && this.f18539b.j()) {
            return true;
        }
        return false;
    }

    private final boolean c0() {
        if ((!this.f18545h.isEmpty()) != false || b0()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d0() {
        boolean z10;
        synchronized (this.f18540c) {
            z10 = true;
            if (!this.f18544g.k() && (!this.f18545h.isEmpty()) == false) {
                if (!b0()) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e0() {
        boolean z10;
        boolean z11;
        synchronized (this.f18540c) {
            z10 = !this.f18554q;
        }
        if (z10) {
            return true;
        }
        Iterator<ad.x1> it = this.f18558u.x().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().b()) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        if (z11) {
            return true;
        }
        return false;
    }

    private final void h0(y yVar) {
        synchronized (this.f18540c) {
            List<c1> list = this.f18547j;
            int size = list.size();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (qc.q.d(list.get(i10).b(), yVar)) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                return;
            }
            dc.w wVar = dc.w.f13270a;
            ArrayList arrayList = new ArrayList();
            i0(arrayList, this, yVar);
            while ((!arrayList.isEmpty()) != false) {
                j0(arrayList, null);
                i0(arrayList, this, yVar);
            }
        }
    }

    private static final void i0(List<c1> list, b2 b2Var, y yVar) {
        list.clear();
        synchronized (b2Var.f18540c) {
            Iterator<c1> it = b2Var.f18547j.iterator();
            while (it.hasNext()) {
                c1 next = it.next();
                if (qc.q.d(next.b(), yVar)) {
                    list.add(next);
                    it.remove();
                }
            }
            dc.w wVar = dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<y> j0(List<c1> list, k0.c<Object> cVar) {
        List<y> C0;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            c1 c1Var = list.get(i10);
            y b10 = c1Var.b();
            Object obj = hashMap.get(b10);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(b10, obj);
            }
            ((ArrayList) obj).add(c1Var);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            y yVar = (y) entry.getKey();
            List list2 = (List) entry.getValue();
            n.T(!yVar.n());
            t0.b h10 = t0.g.f23297e.h(n0(yVar), t0(yVar, cVar));
            try {
                t0.g l10 = h10.l();
                try {
                    synchronized (this.f18540c) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            c1 c1Var2 = (c1) list2.get(i11);
                            arrayList.add(dc.r.a(c1Var2, c2.b(this.f18548k, c1Var2.c())));
                        }
                    }
                    yVar.o(arrayList);
                    dc.w wVar = dc.w.f13270a;
                } finally {
                }
            } finally {
                T(h10);
            }
        }
        C0 = ec.b0.C0(hashMap.keySet());
        return C0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:17:0x0033, B:24:0x003f, B:25:0x0047), top: B:38:0x0033, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j0.y k0(j0.y r7, k0.c<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r7.n()
            r1 = 0
            if (r0 != 0) goto L5f
            boolean r0 = r7.k()
            if (r0 != 0) goto L5f
            java.util.Set<j0.y> r0 = r6.f18551n
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1b
            boolean r0 = r0.contains(r7)
            if (r0 != r2) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L1f
            goto L5f
        L1f:
            t0.g$a r0 = t0.g.f23297e
            pc.l r4 = r6.n0(r7)
            pc.l r5 = r6.t0(r7, r8)
            t0.b r0 = r0.h(r4, r5)
            t0.g r4 = r0.l()     // Catch: java.lang.Throwable -> L5a
            if (r8 == 0) goto L3c
            boolean r5 = r8.k()     // Catch: java.lang.Throwable -> L3a
            if (r5 != r2) goto L3c
            goto L3d
        L3a:
            r7 = move-exception
            goto L56
        L3c:
            r2 = 0
        L3d:
            if (r2 == 0) goto L47
            j0.b2$h r2 = new j0.b2$h     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r8, r7)     // Catch: java.lang.Throwable -> L3a
            r7.b(r2)     // Catch: java.lang.Throwable -> L3a
        L47:
            boolean r8 = r7.t()     // Catch: java.lang.Throwable -> L3a
            r0.s(r4)     // Catch: java.lang.Throwable -> L5a
            r6.T(r0)
            if (r8 == 0) goto L54
            goto L55
        L54:
            r7 = r1
        L55:
            return r7
        L56:
            r0.s(r4)     // Catch: java.lang.Throwable -> L5a
            throw r7     // Catch: java.lang.Throwable -> L5a
        L5a:
            r7 = move-exception
            r6.T(r0)
            throw r7
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.b2.k0(j0.y, k0.c):j0.y");
    }

    private final void l0(Exception exc, y yVar, boolean z10) {
        Boolean bool = A.get();
        qc.q.h(bool, "_hotReloadEnabled.get()");
        if (bool.booleanValue()) {
            if (!(exc instanceof ComposeRuntimeError)) {
                synchronized (this.f18540c) {
                    j0.b.e("Error was captured in composition while live edit was enabled.", exc);
                    this.f18546i.clear();
                    this.f18545h.clear();
                    this.f18544g = new k0.c<>();
                    this.f18547j.clear();
                    this.f18548k.clear();
                    this.f18549l.clear();
                    this.f18555r = new b(z10, exc);
                    if (yVar != null) {
                        List list = this.f18550m;
                        if (list == null) {
                            list = new ArrayList();
                            this.f18550m = list;
                        }
                        if (!list.contains(yVar)) {
                            list.add(yVar);
                        }
                        this.f18543f.remove(yVar);
                    }
                    W();
                }
                return;
            }
            throw exc;
        }
        throw exc;
    }

    static /* synthetic */ void m0(b2 b2Var, Exception exc, y yVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            yVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        b2Var.l0(exc, yVar, z10);
    }

    private final pc.l<Object, dc.w> n0(y yVar) {
        return new i(yVar);
    }

    private final Object o0(pc.q<? super ad.k0, ? super y0, ? super Continuation<? super dc.w>, ? extends Object> qVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object g10 = ad.g.g(this.f18539b, new j(qVar, z0.a(continuation.getContext()), null), continuation);
        d10 = ic.d.d();
        if (g10 == d10) {
            return g10;
        }
        return dc.w.f13270a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p0() {
        List F0;
        boolean c02;
        synchronized (this.f18540c) {
            if (this.f18544g.isEmpty()) {
                return c0();
            }
            k0.c<Object> cVar = this.f18544g;
            this.f18544g = new k0.c<>();
            synchronized (this.f18540c) {
                F0 = ec.b0.F0(this.f18543f);
            }
            try {
                int size = F0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((y) F0.get(i10)).l(cVar);
                    if (this.f18557t.getValue().compareTo(d.ShuttingDown) <= 0) {
                        break;
                    }
                }
                this.f18544g = new k0.c<>();
                synchronized (this.f18540c) {
                    if (W() == null) {
                        c02 = c0();
                    } else {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                    }
                }
                return c02;
            } catch (Throwable th) {
                synchronized (this.f18540c) {
                    this.f18544g.e(cVar);
                    dc.w wVar = dc.w.f13270a;
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(ad.x1 x1Var) {
        synchronized (this.f18540c) {
            Throwable th = this.f18542e;
            if (th == null) {
                if (this.f18557t.getValue().compareTo(d.ShuttingDown) > 0) {
                    if (this.f18541d == null) {
                        this.f18541d = x1Var;
                        W();
                    } else {
                        throw new IllegalStateException("Recomposer already running".toString());
                    }
                } else {
                    throw new IllegalStateException("Recomposer shut down".toString());
                }
            } else {
                throw th;
            }
        }
    }

    private final pc.l<Object, dc.w> t0(y yVar, k0.c<Object> cVar) {
        return new l(yVar, cVar);
    }

    public final void V() {
        synchronized (this.f18540c) {
            if (this.f18557t.getValue().compareTo(d.Idle) >= 0) {
                this.f18557t.setValue(d.ShuttingDown);
            }
            dc.w wVar = dc.w.f13270a;
        }
        x1.a.a(this.f18558u, null, 1, null);
    }

    public final long Y() {
        return this.f18538a;
    }

    public final dd.l0<d> Z() {
        return this.f18557t;
    }

    @Override // j0.p
    public void a(y yVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
        qc.q.i(yVar, "composition");
        qc.q.i(pVar, "content");
        boolean n10 = yVar.n();
        try {
            g.a aVar = t0.g.f23297e;
            t0.b h10 = aVar.h(n0(yVar), t0(yVar, null));
            try {
                t0.g l10 = h10.l();
                try {
                    yVar.j(pVar);
                    dc.w wVar = dc.w.f13270a;
                    if (!n10) {
                        aVar.c();
                    }
                    synchronized (this.f18540c) {
                        if (this.f18557t.getValue().compareTo(d.ShuttingDown) > 0 && !this.f18543f.contains(yVar)) {
                            this.f18543f.add(yVar);
                        }
                    }
                    try {
                        h0(yVar);
                        try {
                            yVar.m();
                            yVar.i();
                            if (!n10) {
                                aVar.c();
                            }
                        } catch (Exception e10) {
                            m0(this, e10, null, false, 6, null);
                        }
                    } catch (Exception e11) {
                        l0(e11, yVar, true);
                    }
                } finally {
                    h10.s(l10);
                }
            } finally {
                T(h10);
            }
        } catch (Exception e12) {
            l0(e12, yVar, true);
        }
    }

    @Override // j0.p
    public void b(c1 c1Var) {
        qc.q.i(c1Var, "reference");
        synchronized (this.f18540c) {
            c2.a(this.f18548k, c1Var.c(), c1Var);
        }
    }

    @Override // j0.p
    public boolean d() {
        return false;
    }

    @Override // j0.p
    public int f() {
        return 1000;
    }

    public final Object f0(Continuation<? super dc.w> continuation) {
        Object d10;
        Object w10 = dd.i.w(Z(), new g(null), continuation);
        d10 = ic.d.d();
        if (w10 == d10) {
            return w10;
        }
        return dc.w.f13270a;
    }

    @Override // j0.p
    public hc.f g() {
        return this.f18559v;
    }

    public final void g0() {
        synchronized (this.f18540c) {
            this.f18556s = true;
            dc.w wVar = dc.w.f13270a;
        }
    }

    @Override // j0.p
    public void h(c1 c1Var) {
        ad.m<dc.w> W;
        qc.q.i(c1Var, "reference");
        synchronized (this.f18540c) {
            this.f18547j.add(c1Var);
            W = W();
        }
        if (W != null) {
            m.a aVar = dc.m.f13253f;
            W.resumeWith(dc.m.a(dc.w.f13270a));
        }
    }

    @Override // j0.p
    public void i(y yVar) {
        ad.m<dc.w> mVar;
        qc.q.i(yVar, "composition");
        synchronized (this.f18540c) {
            if (!this.f18545h.contains(yVar)) {
                this.f18545h.add(yVar);
                mVar = W();
            } else {
                mVar = null;
            }
        }
        if (mVar != null) {
            m.a aVar = dc.m.f13253f;
            mVar.resumeWith(dc.m.a(dc.w.f13270a));
        }
    }

    @Override // j0.p
    public void j(c1 c1Var, b1 b1Var) {
        qc.q.i(c1Var, "reference");
        qc.q.i(b1Var, "data");
        synchronized (this.f18540c) {
            this.f18549l.put(c1Var, b1Var);
            dc.w wVar = dc.w.f13270a;
        }
    }

    @Override // j0.p
    public b1 k(c1 c1Var) {
        b1 remove;
        qc.q.i(c1Var, "reference");
        synchronized (this.f18540c) {
            remove = this.f18549l.remove(c1Var);
        }
        return remove;
    }

    @Override // j0.p
    public void l(Set<u0.a> set) {
        qc.q.i(set, "table");
    }

    @Override // j0.p
    public void n(y yVar) {
        qc.q.i(yVar, "composition");
        synchronized (this.f18540c) {
            Set set = this.f18551n;
            if (set == null) {
                set = new LinkedHashSet();
                this.f18551n = set;
            }
            set.add(yVar);
        }
    }

    @Override // j0.p
    public void q(y yVar) {
        qc.q.i(yVar, "composition");
        synchronized (this.f18540c) {
            this.f18543f.remove(yVar);
            this.f18545h.remove(yVar);
            this.f18546i.remove(yVar);
            dc.w wVar = dc.w.f13270a;
        }
    }

    public final void r0() {
        ad.m<dc.w> mVar;
        synchronized (this.f18540c) {
            if (this.f18556s) {
                this.f18556s = false;
                mVar = W();
            } else {
                mVar = null;
            }
        }
        if (mVar != null) {
            m.a aVar = dc.m.f13253f;
            mVar.resumeWith(dc.m.a(dc.w.f13270a));
        }
    }

    public final Object s0(Continuation<? super dc.w> continuation) {
        Object d10;
        Object o02 = o0(new k(null), continuation);
        d10 = ic.d.d();
        if (o02 == d10) {
            return o02;
        }
        return dc.w.f13270a;
    }
}
