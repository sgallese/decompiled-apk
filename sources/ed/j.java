package ed;

import ad.k0;
import androidx.recyclerview.widget.RecyclerView;
import cd.s;
import ec.g0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;

/* compiled from: Combine.kt */
/* loaded from: classes4.dex */
public final class j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Combine.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {54, 76, 79}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f14250f;

        /* renamed from: m  reason: collision with root package name */
        Object f14251m;

        /* renamed from: p  reason: collision with root package name */
        int f14252p;

        /* renamed from: q  reason: collision with root package name */
        int f14253q;

        /* renamed from: r  reason: collision with root package name */
        int f14254r;

        /* renamed from: s  reason: collision with root package name */
        private /* synthetic */ Object f14255s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ dd.g<T>[] f14256t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ pc.a<T[]> f14257u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ pc.q<dd.h<? super R>, T[], Continuation<? super dc.w>, Object> f14258v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ dd.h<R> f14259w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Combine.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {31}, m = "invokeSuspend")
        /* renamed from: ed.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0340a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f14260f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ dd.g<T>[] f14261m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ int f14262p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ AtomicInteger f14263q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ cd.d<g0<Object>> f14264r;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Combine.kt */
            /* renamed from: ed.j$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0341a<T> implements dd.h {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ cd.d<g0<Object>> f14265f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ int f14266m;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: Combine.kt */
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {32, 33}, m = "emit")
                /* renamed from: ed.j$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0342a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: f  reason: collision with root package name */
                    /* synthetic */ Object f14267f;

                    /* renamed from: m  reason: collision with root package name */
                    final /* synthetic */ C0341a<T> f14268m;

                    /* renamed from: p  reason: collision with root package name */
                    int f14269p;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0342a(C0341a<? super T> c0341a, Continuation<? super C0342a> continuation) {
                        super(continuation);
                        this.f14268m = c0341a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f14267f = obj;
                        this.f14269p |= RecyclerView.UNDEFINED_DURATION;
                        return this.f14268m.emit(null, this);
                    }
                }

                C0341a(cd.d<g0<Object>> dVar, int i10) {
                    this.f14265f = dVar;
                    this.f14266m = i10;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super dc.w> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof ed.j.a.C0340a.C0341a.C0342a
                        if (r0 == 0) goto L13
                        r0 = r8
                        ed.j$a$a$a$a r0 = (ed.j.a.C0340a.C0341a.C0342a) r0
                        int r1 = r0.f14269p
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f14269p = r1
                        goto L18
                    L13:
                        ed.j$a$a$a$a r0 = new ed.j$a$a$a$a
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.f14267f
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.f14269p
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        dc.n.b(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        dc.n.b(r8)
                        goto L4d
                    L38:
                        dc.n.b(r8)
                        cd.d<ec.g0<java.lang.Object>> r8 = r6.f14265f
                        ec.g0 r2 = new ec.g0
                        int r5 = r6.f14266m
                        r2.<init>(r5, r7)
                        r0.f14269p = r4
                        java.lang.Object r7 = r8.r(r2, r0)
                        if (r7 != r1) goto L4d
                        return r1
                    L4d:
                        r0.f14269p = r3
                        java.lang.Object r7 = ad.d3.a(r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        dc.w r7 = dc.w.f13270a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ed.j.a.C0340a.C0341a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0340a(dd.g<? extends T>[] gVarArr, int i10, AtomicInteger atomicInteger, cd.d<g0<Object>> dVar, Continuation<? super C0340a> continuation) {
                super(2, continuation);
                this.f14261m = gVarArr;
                this.f14262p = i10;
                this.f14263q = atomicInteger;
                this.f14264r = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new C0340a(this.f14261m, this.f14262p, this.f14263q, this.f14264r, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((C0340a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                AtomicInteger atomicInteger;
                d10 = ic.d.d();
                int i10 = this.f14260f;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        dd.g[] gVarArr = this.f14261m;
                        int i11 = this.f14262p;
                        dd.g gVar = gVarArr[i11];
                        C0341a c0341a = new C0341a(this.f14264r, i11);
                        this.f14260f = 1;
                        if (gVar.collect(c0341a, this) == d10) {
                            return d10;
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        s.a.a(this.f14264r, null, 1, null);
                    }
                    return dc.w.f13270a;
                } finally {
                    if (this.f14263q.decrementAndGet() == 0) {
                        s.a.a(this.f14264r, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(dd.g<? extends T>[] gVarArr, pc.a<T[]> aVar, pc.q<? super dd.h<? super R>, ? super T[], ? super Continuation<? super dc.w>, ? extends Object> qVar, dd.h<? super R> hVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f14256t = gVarArr;
            this.f14257u = aVar;
            this.f14258v = qVar;
            this.f14259w = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f14256t, this.f14257u, this.f14258v, this.f14259w, continuation);
            aVar.f14255s = obj;
            return aVar;
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00d7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x010a A[EDGE_INSN: B:49:0x010a->B:35:0x010a BREAK  A[LOOP:0: B:28:0x00e5->B:50:?], SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r15v0, types: [dd.g[], dd.g<T>[]] */
        /* JADX WARN: Type inference failed for: r2v12, types: [int] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Type inference failed for: r6v0, types: [dd.g<T>[]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x012d -> B:20:0x00c2). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0160 -> B:45:0x015c). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 356
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ed.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <R, T> Object a(dd.h<? super R> hVar, dd.g<? extends T>[] gVarArr, pc.a<T[]> aVar, pc.q<? super dd.h<? super R>, ? super T[], ? super Continuation<? super dc.w>, ? extends Object> qVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object a10 = m.a(new a(gVarArr, aVar, qVar, hVar, null), continuation);
        d10 = ic.d.d();
        if (a10 == d10) {
            return a10;
        }
        return dc.w.f13270a;
    }
}
