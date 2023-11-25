package ad;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* compiled from: Timeout.kt */
/* loaded from: classes4.dex */
public final class x2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Timeout.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {104}, m = "withTimeoutOrNull")
    /* loaded from: classes4.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        long f576f;

        /* renamed from: m  reason: collision with root package name */
        Object f577m;

        /* renamed from: p  reason: collision with root package name */
        Object f578p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f579q;

        /* renamed from: r  reason: collision with root package name */
        int f580r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f579q = obj;
            this.f580r |= RecyclerView.UNDEFINED_DURATION;
            return x2.c(0L, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r4 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.coroutines.TimeoutCancellationException a(long r2, ad.t0 r4, ad.x1 r5) {
        /*
            boolean r0 = r4 instanceof ad.v0
            if (r0 == 0) goto L7
            ad.v0 r4 = (ad.v0) r4
            goto L8
        L7:
            r4 = 0
        L8:
            if (r4 == 0) goto L18
            zc.a$a r0 = zc.a.f26431m
            zc.d r0 = zc.d.MILLISECONDS
            long r0 = zc.c.p(r2, r0)
            java.lang.String r4 = r4.k0(r0)
            if (r4 != 0) goto L2e
        L18:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Timed out waiting for "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L2e:
            kotlinx.coroutines.TimeoutCancellationException r2 = new kotlinx.coroutines.TimeoutCancellationException
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.x2.a(long, ad.t0, ad.x1):kotlinx.coroutines.TimeoutCancellationException");
    }

    private static final <U, T extends U> Object b(w2<U, ? super T> w2Var, pc.p<? super k0, ? super Continuation<? super T>, ? extends Object> pVar) {
        a2.i(w2Var, u0.c(w2Var.f15622q.getContext()).p0(w2Var.f572r, w2Var, w2Var.getContext()));
        return gd.b.d(w2Var, w2Var, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Type inference failed for: r2v1, types: [ad.w2, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(long r7, pc.p<? super ad.k0, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r9, kotlin.coroutines.Continuation<? super T> r10) {
        /*
            boolean r0 = r10 instanceof ad.x2.a
            if (r0 == 0) goto L13
            r0 = r10
            ad.x2$a r0 = (ad.x2.a) r0
            int r1 = r0.f580r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f580r = r1
            goto L18
        L13:
            ad.x2$a r0 = new ad.x2$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f579q
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f580r
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f578p
            qc.f0 r7 = (qc.f0) r7
            java.lang.Object r8 = r0.f577m
            pc.p r8 = (pc.p) r8
            dc.n.b(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L32
            goto L6b
        L32:
            r8 = move-exception
            goto L6e
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            dc.n.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            qc.f0 r10 = new qc.f0
            r10.<init>()
            r0.f577m = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r0.f578p = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r0.f576f = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r0.f580r = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            ad.w2 r2 = new ad.w2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r10.f21676f = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            java.lang.Object r7 = b(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            java.lang.Object r8 = ic.b.d()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            if (r7 != r8) goto L67
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
        L67:
            if (r7 != r1) goto L6a
            return r1
        L6a:
            r10 = r7
        L6b:
            return r10
        L6c:
            r8 = move-exception
            r7 = r10
        L6e:
            ad.x1 r9 = r8.f19464f
            T r7 = r7.f21676f
            if (r9 != r7) goto L75
            return r3
        L75:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.x2.c(long, pc.p, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
