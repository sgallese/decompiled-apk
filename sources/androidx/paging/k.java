package androidx.paging;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* compiled from: ConflatedEventBus.kt */
/* loaded from: classes.dex */
public final class k<T> {

    /* renamed from: a  reason: collision with root package name */
    private final dd.x<dc.l<Integer, T>> f5808a;

    /* renamed from: b  reason: collision with root package name */
    private final dd.g<T> f5809b;

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes.dex */
    public static final class a implements dd.g<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ dd.g f5810f;

        /* compiled from: Emitters.kt */
        /* renamed from: androidx.paging.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0138a<T> implements dd.h {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ dd.h f5811f;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2", f = "ConflatedEventBus.kt", l = {225}, m = "emit")
            /* renamed from: androidx.paging.k$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0139a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: f  reason: collision with root package name */
                /* synthetic */ Object f5812f;

                /* renamed from: m  reason: collision with root package name */
                int f5813m;

                public C0139a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f5812f = obj;
                    this.f5813m |= RecyclerView.UNDEFINED_DURATION;
                    return C0138a.this.emit(null, this);
                }
            }

            public C0138a(dd.h hVar) {
                this.f5811f = hVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // dd.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof androidx.paging.k.a.C0138a.C0139a
                    if (r0 == 0) goto L13
                    r0 = r6
                    androidx.paging.k$a$a$a r0 = (androidx.paging.k.a.C0138a.C0139a) r0
                    int r1 = r0.f5813m
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f5813m = r1
                    goto L18
                L13:
                    androidx.paging.k$a$a$a r0 = new androidx.paging.k$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f5812f
                    java.lang.Object r1 = ic.b.d()
                    int r2 = r0.f5813m
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    dc.n.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    dc.n.b(r6)
                    dd.h r6 = r4.f5811f
                    dc.l r5 = (dc.l) r5
                    java.lang.Object r5 = r5.d()
                    if (r5 == 0) goto L47
                    r0.f5813m = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    dc.w r5 = dc.w.f13270a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.k.a.C0138a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(dd.g gVar) {
            this.f5810f = gVar;
        }

        @Override // dd.g
        public Object collect(dd.h hVar, Continuation continuation) {
            Object d10;
            Object collect = this.f5810f.collect(new C0138a(hVar), continuation);
            d10 = ic.d.d();
            if (collect == d10) {
                return collect;
            }
            return dc.w.f13270a;
        }
    }

    public k(T t10) {
        dd.x<dc.l<Integer, T>> a10 = dd.n0.a(new dc.l(Integer.valueOf((int) RecyclerView.UNDEFINED_DURATION), t10));
        this.f5808a = a10;
        this.f5809b = new a(a10);
    }

    public final dd.g<T> a() {
        return this.f5809b;
    }

    public final void b(T t10) {
        qc.q.i(t10, "data");
        dd.x<dc.l<Integer, T>> xVar = this.f5808a;
        xVar.setValue(new dc.l<>(Integer.valueOf(xVar.getValue().c().intValue() + 1), t10));
    }

    public /* synthetic */ k(Object obj, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? null : obj);
    }
}
