package dd;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Channels.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Channels.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {36, 37}, m = "emitAllImpl$FlowKt__ChannelsKt")
    /* loaded from: classes4.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f13345f;

        /* renamed from: m  reason: collision with root package name */
        Object f13346m;

        /* renamed from: p  reason: collision with root package name */
        Object f13347p;

        /* renamed from: q  reason: collision with root package name */
        boolean f13348q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f13349r;

        /* renamed from: s  reason: collision with root package name */
        int f13350s;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13349r = obj;
            this.f13350s |= RecyclerView.UNDEFINED_DURATION;
            return k.d(null, null, false, this);
        }
    }

    public static final <T> g<T> b(cd.r<? extends T> rVar) {
        return new c(rVar, true, null, 0, null, 28, null);
    }

    public static final <T> Object c(h<? super T> hVar, cd.r<? extends T> rVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object d11 = d(hVar, rVar, true, continuation);
        d10 = ic.d.d();
        if (d11 == d10) {
            return d11;
        }
        return dc.w.f13270a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #0 {all -> 0x009b, blocks: (B:13:0x0036, B:22:0x0060, B:26:0x0075, B:28:0x007d, B:18:0x0052, B:21:0x005c), top: B:41:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008f -> B:14:0x0039). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(dd.h<? super T> r6, cd.r<? extends T> r7, boolean r8, kotlin.coroutines.Continuation<? super dc.w> r9) {
        /*
            boolean r0 = r9 instanceof dd.k.a
            if (r0 == 0) goto L13
            r0 = r9
            dd.k$a r0 = (dd.k.a) r0
            int r1 = r0.f13350s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13350s = r1
            goto L18
        L13:
            dd.k$a r0 = new dd.k$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f13349r
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f13350s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L56
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            boolean r8 = r0.f13348q
            java.lang.Object r6 = r0.f13347p
            cd.f r6 = (cd.f) r6
            java.lang.Object r7 = r0.f13346m
            cd.r r7 = (cd.r) r7
            java.lang.Object r2 = r0.f13345f
            dd.h r2 = (dd.h) r2
            dc.n.b(r9)     // Catch: java.lang.Throwable -> L9b
        L39:
            r9 = r6
            r6 = r2
            goto L60
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            boolean r8 = r0.f13348q
            java.lang.Object r6 = r0.f13347p
            cd.f r6 = (cd.f) r6
            java.lang.Object r7 = r0.f13346m
            cd.r r7 = (cd.r) r7
            java.lang.Object r2 = r0.f13345f
            dd.h r2 = (dd.h) r2
            dc.n.b(r9)     // Catch: java.lang.Throwable -> L9b
            goto L75
        L56:
            dc.n.b(r9)
            dd.i.t(r6)
            cd.f r9 = r7.iterator()     // Catch: java.lang.Throwable -> L9b
        L60:
            r0.f13345f = r6     // Catch: java.lang.Throwable -> L9b
            r0.f13346m = r7     // Catch: java.lang.Throwable -> L9b
            r0.f13347p = r9     // Catch: java.lang.Throwable -> L9b
            r0.f13348q = r8     // Catch: java.lang.Throwable -> L9b
            r0.f13350s = r4     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L9b
            if (r2 != r1) goto L71
            return r1
        L71:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L75:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L9b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L9b
            if (r9 == 0) goto L92
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L9b
            r0.f13345f = r2     // Catch: java.lang.Throwable -> L9b
            r0.f13346m = r7     // Catch: java.lang.Throwable -> L9b
            r0.f13347p = r6     // Catch: java.lang.Throwable -> L9b
            r0.f13348q = r8     // Catch: java.lang.Throwable -> L9b
            r0.f13350s = r3     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L9b
            if (r9 != r1) goto L39
            return r1
        L92:
            if (r8 == 0) goto L98
            r6 = 0
            cd.k.a(r7, r6)
        L98:
            dc.w r6 = dc.w.f13270a
            return r6
        L9b:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L9d
        L9d:
            r9 = move-exception
            if (r8 == 0) goto La3
            cd.k.a(r7, r6)
        La3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.k.d(dd.h, cd.r, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> g<T> e(cd.r<? extends T> rVar) {
        return new c(rVar, false, null, 0, null, 28, null);
    }
}
