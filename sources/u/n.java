package u;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import k1.c0;
import k1.l0;
import kotlin.coroutines.Continuation;

/* compiled from: ForEachGesture.kt */
/* loaded from: classes.dex */
public final class n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ForEachGesture.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {86}, m = "awaitAllPointersUp")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f23959f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f23960m;

        /* renamed from: p  reason: collision with root package name */
        int f23961p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23960m = obj;
            this.f23961p |= RecyclerView.UNDEFINED_DURATION;
            return n.b(null, this);
        }
    }

    /* compiled from: ForEachGesture.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {104, 107, 112}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.k implements pc.p<k1.e, Continuation<? super dc.w>, Object> {

        /* renamed from: m  reason: collision with root package name */
        int f23962m;

        /* renamed from: p  reason: collision with root package name */
        private /* synthetic */ Object f23963p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ hc.f f23964q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ pc.p<k1.e, Continuation<? super dc.w>, Object> f23965r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(hc.f fVar, pc.p<? super k1.e, ? super Continuation<? super dc.w>, ? extends Object> pVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f23964q = fVar;
            this.f23965r = pVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(k1.e eVar, Continuation<? super dc.w> continuation) {
            return ((b) create(eVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f23964q, this.f23965r, continuation);
            bVar.f23963p = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0062 -> B:20:0x003f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0083 -> B:20:0x003f). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r8.f23962m
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L37
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r8.f23963p
                k1.e r1 = (k1.e) r1
                dc.n.b(r9)
                goto L28
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                java.lang.Object r1 = r8.f23963p
                k1.e r1 = (k1.e) r1
                dc.n.b(r9)     // Catch: java.util.concurrent.CancellationException -> L33
            L28:
                r9 = r1
                goto L3e
            L2a:
                java.lang.Object r1 = r8.f23963p
                k1.e r1 = (k1.e) r1
                dc.n.b(r9)     // Catch: java.util.concurrent.CancellationException -> L33
                r9 = r8
                goto L57
            L33:
                r9 = move-exception
                r5 = r1
                r1 = r8
                goto L70
            L37:
                dc.n.b(r9)
                java.lang.Object r9 = r8.f23963p
                k1.e r9 = (k1.e) r9
            L3e:
                r1 = r8
            L3f:
                hc.f r5 = r1.f23964q
                boolean r5 = ad.a2.m(r5)
                if (r5 == 0) goto L86
                pc.p<k1.e, kotlin.coroutines.Continuation<? super dc.w>, java.lang.Object> r5 = r1.f23965r     // Catch: java.util.concurrent.CancellationException -> L6c
                r1.f23963p = r9     // Catch: java.util.concurrent.CancellationException -> L6c
                r1.f23962m = r4     // Catch: java.util.concurrent.CancellationException -> L6c
                java.lang.Object r5 = r5.invoke(r9, r1)     // Catch: java.util.concurrent.CancellationException -> L6c
                if (r5 != r0) goto L54
                return r0
            L54:
                r7 = r1
                r1 = r9
                r9 = r7
            L57:
                r9.f23963p = r1     // Catch: java.util.concurrent.CancellationException -> L66
                r9.f23962m = r3     // Catch: java.util.concurrent.CancellationException -> L66
                java.lang.Object r5 = u.n.b(r1, r9)     // Catch: java.util.concurrent.CancellationException -> L66
                if (r5 != r0) goto L62
                return r0
            L62:
                r7 = r1
                r1 = r9
                r9 = r7
                goto L3f
            L66:
                r5 = move-exception
                r7 = r1
                r1 = r9
                r9 = r5
                r5 = r7
                goto L70
            L6c:
                r5 = move-exception
                r7 = r5
                r5 = r9
                r9 = r7
            L70:
                hc.f r6 = r1.f23964q
                boolean r6 = ad.a2.m(r6)
                if (r6 == 0) goto L85
                r1.f23963p = r5
                r1.f23962m = r2
                java.lang.Object r9 = u.n.b(r5, r1)
                if (r9 != r0) goto L83
                return r0
            L83:
                r9 = r5
                goto L3f
            L85:
                throw r9
            L86:
                dc.w r9 = dc.w.f13270a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: u.n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final boolean a(k1.e eVar) {
        qc.q.i(eVar, "<this>");
        List<c0> c10 = eVar.E().c();
        int size = c10.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            } else if (c10.get(i10).h()) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        return !z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (a(r7) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r8 = k1.t.Final;
        r0.f23959f = r7;
        r0.f23961p = 1;
        r8 = r7.X(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r8 != r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r4 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        return dc.w.f13270a;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(k1.e r7, kotlin.coroutines.Continuation<? super dc.w> r8) {
        /*
            boolean r0 = r8 instanceof u.n.a
            if (r0 == 0) goto L13
            r0 = r8
            u.n$a r0 = (u.n.a) r0
            int r1 = r0.f23961p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23961p = r1
            goto L18
        L13:
            u.n$a r0 = new u.n$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f23960m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f23961p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f23959f
            k1.e r7 = (k1.e) r7
            dc.n.b(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            dc.n.b(r8)
            boolean r8 = a(r7)
            if (r8 != 0) goto L6c
        L3e:
            k1.t r8 = k1.t.Final
            r0.f23959f = r7
            r0.f23961p = r3
            java.lang.Object r8 = r7.X(r8, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            k1.r r8 = (k1.r) r8
            java.util.List r8 = r8.c()
            int r2 = r8.size()
            r4 = 0
            r5 = 0
        L57:
            if (r5 >= r2) goto L6a
            java.lang.Object r6 = r8.get(r5)
            k1.c0 r6 = (k1.c0) r6
            boolean r6 = r6.h()
            if (r6 == 0) goto L67
            r4 = 1
            goto L6a
        L67:
            int r5 = r5 + 1
            goto L57
        L6a:
            if (r4 != 0) goto L3e
        L6c:
            dc.w r7 = dc.w.f13270a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u.n.b(k1.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object c(l0 l0Var, pc.p<? super k1.e, ? super Continuation<? super dc.w>, ? extends Object> pVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object V0 = l0Var.V0(new b(continuation.getContext(), pVar, null), continuation);
        d10 = ic.d.d();
        if (V0 == d10) {
            return V0;
        }
        return dc.w.f13270a;
    }
}
