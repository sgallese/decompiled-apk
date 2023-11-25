package j0;

import androidx.recyclerview.widget.RecyclerView;
import hc.f;
import j0.y0;
import kotlin.coroutines.Continuation;

/* compiled from: PausableMonotonicFrameClock.kt */
/* loaded from: classes.dex */
public final class n1 implements y0 {

    /* renamed from: f  reason: collision with root package name */
    private final y0 f18820f;

    /* renamed from: m  reason: collision with root package name */
    private final s0 f18821m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PausableMonotonicFrameClock.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {62, 63}, m = "withFrameNanos")
    /* loaded from: classes.dex */
    public static final class a<R> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f18822f;

        /* renamed from: m  reason: collision with root package name */
        Object f18823m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f18824p;

        /* renamed from: r  reason: collision with root package name */
        int f18826r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18824p = obj;
            this.f18826r |= RecyclerView.UNDEFINED_DURATION;
            return n1.this.R(null, this);
        }
    }

    public n1(y0 y0Var) {
        qc.q.i(y0Var, "frameClock");
        this.f18820f = y0Var;
        this.f18821m = new s0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[PHI: r7
      0x0063: PHI (r7v6 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:21:0x0060, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // j0.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object R(pc.l<? super java.lang.Long, ? extends R> r6, kotlin.coroutines.Continuation<? super R> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof j0.n1.a
            if (r0 == 0) goto L13
            r0 = r7
            j0.n1$a r0 = (j0.n1.a) r0
            int r1 = r0.f18826r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18826r = r1
            goto L18
        L13:
            j0.n1$a r0 = new j0.n1$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f18824p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f18826r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            dc.n.b(r7)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f18823m
            pc.l r6 = (pc.l) r6
            java.lang.Object r2 = r0.f18822f
            j0.n1 r2 = (j0.n1) r2
            dc.n.b(r7)
            goto L53
        L40:
            dc.n.b(r7)
            j0.s0 r7 = r5.f18821m
            r0.f18822f = r5
            r0.f18823m = r6
            r0.f18826r = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            j0.y0 r7 = r2.f18820f
            r2 = 0
            r0.f18822f = r2
            r0.f18823m = r2
            r0.f18826r = r3
            java.lang.Object r7 = r7.R(r6, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.n1.R(pc.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a() {
        this.f18821m.d();
    }

    public final void d() {
        this.f18821m.f();
    }

    @Override // hc.f
    public <R> R fold(R r10, pc.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) y0.a.a(this, r10, pVar);
    }

    @Override // hc.f.b, hc.f
    public <E extends f.b> E get(f.c<E> cVar) {
        return (E) y0.a.b(this, cVar);
    }

    @Override // hc.f.b
    public /* synthetic */ f.c getKey() {
        return x0.a(this);
    }

    @Override // hc.f
    public hc.f minusKey(f.c<?> cVar) {
        return y0.a.c(this, cVar);
    }

    @Override // hc.f
    public hc.f plus(hc.f fVar) {
        return y0.a.d(this, fVar);
    }
}
