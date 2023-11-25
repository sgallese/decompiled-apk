package androidx.lifecycle;

import ad.s2;
import ad.x1;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* compiled from: CoroutineLiveData.kt */
/* loaded from: classes.dex */
public final class f<T> extends d0<T> {

    /* renamed from: m  reason: collision with root package name */
    private c<T> f4968m;

    /* compiled from: CoroutineLiveData.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f<T> f4969f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<T> fVar) {
            super(0);
            this.f4969f = fVar;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((f) this.f4969f).f4968m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoroutineLiveData.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {235}, m = "clearSource$lifecycle_livedata_ktx_release")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f4970f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f4971m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ f<T> f4972p;

        /* renamed from: q  reason: collision with root package name */
        int f4973q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f<T> fVar, Continuation<? super b> continuation) {
            super(continuation);
            this.f4972p = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4971m = obj;
            this.f4973q |= RecyclerView.UNDEFINED_DURATION;
            return this.f4972p.s(this);
        }
    }

    public f(hc.f fVar, long j10, pc.p<? super b0<T>, ? super Continuation<? super dc.w>, ? extends Object> pVar) {
        qc.q.i(fVar, "context");
        qc.q.i(pVar, "block");
        this.f4968m = new c<>(this, pVar, j10, ad.l0.a(ad.a1.c().N0().plus(fVar).plus(s2.a((x1) fVar.get(x1.f574b)))), new a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.d0, androidx.lifecycle.LiveData
    public void l() {
        super.l();
        c<T> cVar = this.f4968m;
        if (cVar != null) {
            cVar.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.d0, androidx.lifecycle.LiveData
    public void m() {
        super.m();
        c<T> cVar = this.f4968m;
        if (cVar != null) {
            cVar.g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(kotlin.coroutines.Continuation<? super dc.w> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.f.b
            if (r0 == 0) goto L13
            r0 = r5
            androidx.lifecycle.f$b r0 = (androidx.lifecycle.f.b) r0
            int r1 = r0.f4973q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4973q = r1
            goto L18
        L13:
            androidx.lifecycle.f$b r0 = new androidx.lifecycle.f$b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4971m
            ic.b.d()
            int r1 = r0.f4973q
            if (r1 == 0) goto L34
            r2 = 1
            if (r1 != r2) goto L2c
            java.lang.Object r0 = r0.f4970f
            androidx.lifecycle.f r0 = (androidx.lifecycle.f) r0
            dc.n.b(r5)
            goto L38
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L34:
            dc.n.b(r5)
            r0 = r4
        L38:
            r0.getClass()
            dc.w r5 = dc.w.f13270a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.f.s(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
