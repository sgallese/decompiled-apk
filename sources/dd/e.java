package dd;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Distinct.kt */
/* loaded from: classes4.dex */
public final class e<T> implements g<T> {

    /* renamed from: f  reason: collision with root package name */
    private final g<T> f13308f;

    /* renamed from: m  reason: collision with root package name */
    public final pc.l<T, Object> f13309m;

    /* renamed from: p  reason: collision with root package name */
    public final pc.p<Object, Object, Boolean> f13310p;

    /* compiled from: Distinct.kt */
    /* loaded from: classes4.dex */
    static final class a<T> implements h {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e<T> f13311f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ qc.f0<Object> f13312m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ h<T> f13313p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Distinct.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {77}, m = "emit")
        /* renamed from: dd.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0306a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ Object f13314f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ a<T> f13315m;

            /* renamed from: p  reason: collision with root package name */
            int f13316p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0306a(a<? super T> aVar, Continuation<? super C0306a> continuation) {
                super(continuation);
                this.f13315m = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f13314f = obj;
                this.f13316p |= RecyclerView.UNDEFINED_DURATION;
                return this.f13315m.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(e<T> eVar, qc.f0<Object> f0Var, h<? super T> hVar) {
            this.f13311f = eVar;
            this.f13312m = f0Var;
            this.f13313p = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // dd.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super dc.w> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof dd.e.a.C0306a
                if (r0 == 0) goto L13
                r0 = r7
                dd.e$a$a r0 = (dd.e.a.C0306a) r0
                int r1 = r0.f13316p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13316p = r1
                goto L18
            L13:
                dd.e$a$a r0 = new dd.e$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f13314f
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f13316p
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                dc.n.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                dc.n.b(r7)
                dd.e<T> r7 = r5.f13311f
                pc.l<T, java.lang.Object> r7 = r7.f13309m
                java.lang.Object r7 = r7.invoke(r6)
                qc.f0<java.lang.Object> r2 = r5.f13312m
                T r2 = r2.f21676f
                fd.g0 r4 = ed.r.f14280a
                if (r2 == r4) goto L58
                dd.e<T> r4 = r5.f13311f
                pc.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f13310p
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                dc.w r6 = dc.w.f13270a
                return r6
            L58:
                qc.f0<java.lang.Object> r2 = r5.f13312m
                r2.f21676f = r7
                dd.h<T> r7 = r5.f13313p
                r0.f13316p = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                dc.w r6 = dc.w.f13270a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(g<? extends T> gVar, pc.l<? super T, ? extends Object> lVar, pc.p<Object, Object, Boolean> pVar) {
        this.f13308f = gVar;
        this.f13309m = lVar;
        this.f13310p = pVar;
    }

    @Override // dd.g
    public Object collect(h<? super T> hVar, Continuation<? super dc.w> continuation) {
        Object d10;
        qc.f0 f0Var = new qc.f0();
        f0Var.f21676f = (T) ed.r.f14280a;
        Object collect = this.f13308f.collect(new a(this, f0Var, hVar), continuation);
        d10 = ic.d.d();
        if (collect == d10) {
            return collect;
        }
        return dc.w.f13270a;
    }
}
