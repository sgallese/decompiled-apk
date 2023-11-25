package g0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import pc.l;
import pc.p;
import qc.q;
import z0.g;

/* compiled from: PullRefresh.kt */
/* loaded from: classes.dex */
final class d implements j1.b {

    /* renamed from: f  reason: collision with root package name */
    private final l<Float, Float> f15977f;

    /* renamed from: m  reason: collision with root package name */
    private final p<Float, Continuation<? super Float>, Object> f15978m;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f15979p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PullRefresh.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", l = {117}, m = "onPreFling-QWom1Mo")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        float f15980f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f15981m;

        /* renamed from: q  reason: collision with root package name */
        int f15983q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f15981m = obj;
            this.f15983q |= RecyclerView.UNDEFINED_DURATION;
            return d.this.A0(0L, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(l<? super Float, Float> lVar, p<? super Float, ? super Continuation<? super Float>, ? extends Object> pVar, boolean z10) {
        q.i(lVar, "onPull");
        q.i(pVar, "onRelease");
        this.f15977f = lVar;
        this.f15978m = pVar;
        this.f15979p = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // j1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A0(long r5, kotlin.coroutines.Continuation<? super j2.v> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof g0.d.a
            if (r0 == 0) goto L13
            r0 = r7
            g0.d$a r0 = (g0.d.a) r0
            int r1 = r0.f15983q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15983q = r1
            goto L18
        L13:
            g0.d$a r0 = new g0.d$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f15981m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f15983q
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            float r5 = r0.f15980f
            dc.n.b(r7)
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            dc.n.b(r7)
            pc.p<java.lang.Float, kotlin.coroutines.Continuation<? super java.lang.Float>, java.lang.Object> r7 = r4.f15978m
            float r5 = j2.v.i(r5)
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.c(r5)
            r6 = 0
            r0.f15980f = r6
            r0.f15983q = r3
            java.lang.Object r7 = r7.invoke(r5, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r5 = 0
        L4d:
            java.lang.Number r7 = (java.lang.Number) r7
            float r6 = r7.floatValue()
            long r5 = j2.w.a(r5, r6)
            j2.v r5 = j2.v.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.d.A0(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // j1.b
    public /* synthetic */ Object H(long j10, long j11, Continuation continuation) {
        return j1.a.a(this, j10, j11, continuation);
    }

    @Override // j1.b
    public long T0(long j10, long j11, int i10) {
        if (!this.f15979p) {
            return z0.f.f26354b.c();
        }
        if (j1.f.d(i10, j1.f.f18968a.a()) && z0.f.p(j11) > 0.0f) {
            return g.a(0.0f, this.f15977f.invoke(Float.valueOf(z0.f.p(j11))).floatValue());
        }
        return z0.f.f26354b.c();
    }

    @Override // j1.b
    public long o0(long j10, int i10) {
        if (!this.f15979p) {
            return z0.f.f26354b.c();
        }
        if (j1.f.d(i10, j1.f.f18968a.a()) && z0.f.p(j10) < 0.0f) {
            return g.a(0.0f, this.f15977f.invoke(Float.valueOf(z0.f.p(j10))).floatValue());
        }
        return z0.f.f26354b.c();
    }
}
