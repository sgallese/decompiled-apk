package j0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotFlow.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class b3 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SnapshotFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = {64, 65}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a<R> extends kotlin.coroutines.jvm.internal.l implements pc.p<t1<R>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f18600f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f18601m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ hc.f f18602p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ dd.g<T> f18603q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: SnapshotFlow.kt */
        /* renamed from: j0.b3$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0418a<T> implements dd.h<T> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ t1<R> f18604f;

            C0418a(t1<R> t1Var) {
                this.f18604f = t1Var;
            }

            @Override // dd.h
            public final Object emit(T t10, Continuation<? super dc.w> continuation) {
                this.f18604f.setValue(t10);
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SnapshotFlow.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", l = {66}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f18605f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ dd.g<T> f18606m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ t1<R> f18607p;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX INFO: Add missing generic type declarations: [T] */
            /* compiled from: SnapshotFlow.kt */
            /* renamed from: j0.b3$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0419a<T> implements dd.h<T> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ t1<R> f18608f;

                C0419a(t1<R> t1Var) {
                    this.f18608f = t1Var;
                }

                @Override // dd.h
                public final Object emit(T t10, Continuation<? super dc.w> continuation) {
                    this.f18608f.setValue(t10);
                    return dc.w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(dd.g<? extends T> gVar, t1<R> t1Var, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f18606m = gVar;
                this.f18607p = t1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new b(this.f18606m, this.f18607p, continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f18605f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    dd.g<T> gVar = this.f18606m;
                    C0419a c0419a = new C0419a(this.f18607p);
                    this.f18605f = 1;
                    if (gVar.collect(c0419a, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(hc.f fVar, dd.g<? extends T> gVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f18602p = fVar;
            this.f18603q = gVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(t1<R> t1Var, Continuation<? super dc.w> continuation) {
            return ((a) create(t1Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f18602p, this.f18603q, continuation);
            aVar.f18601m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f18600f;
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dc.n.b(obj);
            } else {
                dc.n.b(obj);
                t1 t1Var = (t1) this.f18601m;
                if (qc.q.d(this.f18602p, hc.g.f16601f)) {
                    dd.g<T> gVar = this.f18603q;
                    C0418a c0418a = new C0418a(t1Var);
                    this.f18600f = 1;
                    if (gVar.collect(c0418a, this) == d10) {
                        return d10;
                    }
                } else {
                    hc.f fVar = this.f18602p;
                    b bVar = new b(this.f18603q, t1Var, null);
                    this.f18600f = 2;
                    if (ad.g.g(fVar, bVar, this) == d10) {
                        return d10;
                    }
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SnapshotFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {133, 137, 159}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b<T> extends kotlin.coroutines.jvm.internal.l implements pc.p<dd.h<? super T>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f18609f;

        /* renamed from: m  reason: collision with root package name */
        Object f18610m;

        /* renamed from: p  reason: collision with root package name */
        Object f18611p;

        /* renamed from: q  reason: collision with root package name */
        Object f18612q;

        /* renamed from: r  reason: collision with root package name */
        Object f18613r;

        /* renamed from: s  reason: collision with root package name */
        int f18614s;

        /* renamed from: t  reason: collision with root package name */
        int f18615t;

        /* renamed from: u  reason: collision with root package name */
        private /* synthetic */ Object f18616u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ pc.a<T> f18617v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SnapshotFlow.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<Object, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Set<Object> f18618f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Set<Object> set) {
                super(1);
                this.f18618f = set;
            }

            public final void a(Object obj) {
                qc.q.i(obj, "it");
                this.f18618f.add(obj);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(Object obj) {
                a(obj);
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SnapshotFlow.kt */
        /* renamed from: j0.b3$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0420b extends qc.r implements pc.p<Set<? extends Object>, t0.g, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ cd.d<Set<Object>> f18619f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0420b(cd.d<Set<Object>> dVar) {
                super(2);
                this.f18619f = dVar;
            }

            public final void a(Set<? extends Object> set, t0.g gVar) {
                qc.q.i(set, "changed");
                qc.q.i(gVar, "<anonymous parameter 1>");
                this.f18619f.p(set);
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ dc.w invoke(Set<? extends Object> set, t0.g gVar) {
                a(set, gVar);
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(pc.a<? extends T> aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f18617v = aVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(dd.h<? super T> hVar, Continuation<? super dc.w> continuation) {
            return ((b) create(hVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f18617v, continuation);
            bVar.f18616u = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #2 {all -> 0x0053, blocks: (B:34:0x00e4, B:36:0x00e8, B:41:0x00f2, B:44:0x0100, B:48:0x0116, B:50:0x011f, B:59:0x0142, B:60:0x0145, B:11:0x004b, B:45:0x010b, B:47:0x0113, B:56:0x013d, B:57:0x0140, B:46:0x010f), top: B:75:0x004b, inners: #0 }] */
        /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x014c -> B:30:0x00c5). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 350
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j0.b3.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T extends R, R> g3<R> b(dd.g<? extends T> gVar, R r10, hc.f fVar, l lVar, int i10, int i11) {
        qc.q.i(gVar, "<this>");
        lVar.e(-606625098);
        if ((i11 & 2) != 0) {
            fVar = hc.g.f16601f;
        }
        hc.f fVar2 = fVar;
        if (n.K()) {
            n.V(-606625098, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:58)");
        }
        int i12 = i10 >> 3;
        g3<R> k10 = y2.k(r10, gVar, fVar2, new a(fVar2, gVar, null), lVar, (i12 & 8) | 4672 | (i12 & 14));
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return k10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean c(Set<? extends T> set, Set<? extends T> set2) {
        if (set.size() < set2.size()) {
            Set<? extends T> set3 = set;
            if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                Iterator<T> it = set3.iterator();
                while (it.hasNext()) {
                    if (set2.contains(it.next())) {
                        return true;
                    }
                }
            }
        } else {
            Set<? extends T> set4 = set2;
            if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                Iterator<T> it2 = set4.iterator();
                while (it2.hasNext()) {
                    if (set.contains(it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final <T> dd.g<T> d(pc.a<? extends T> aVar) {
        qc.q.i(aVar, "block");
        return dd.i.z(new b(aVar, null));
    }
}
