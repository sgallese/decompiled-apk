package coil.util;

import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* compiled from: Lifecycles.kt */
/* renamed from: coil.util.-Lifecycles  reason: invalid class name */
/* loaded from: classes.dex */
public final class Lifecycles {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Lifecycles.kt */
    @f(c = "coil.util.-Lifecycles", f = "Lifecycles.kt", l = {44}, m = "awaitStarted")
    /* renamed from: coil.util.-Lifecycles$a */
    /* loaded from: classes.dex */
    public static final class a extends d {

        /* renamed from: f  reason: collision with root package name */
        Object f9060f;

        /* renamed from: m  reason: collision with root package name */
        Object f9061m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f9062p;

        /* renamed from: q  reason: collision with root package name */
        int f9063q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9062p = obj;
            this.f9063q |= RecyclerView.UNDEFINED_DURATION;
            return Lifecycles.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, coil.util.-Lifecycles$awaitStarted$2$1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(androidx.lifecycle.p r6, kotlin.coroutines.Continuation<? super dc.w> r7) {
        /*
            boolean r0 = r7 instanceof coil.util.Lifecycles.a
            if (r0 == 0) goto L13
            r0 = r7
            coil.util.-Lifecycles$a r0 = (coil.util.Lifecycles.a) r0
            int r1 = r0.f9063q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9063q = r1
            goto L18
        L13:
            coil.util.-Lifecycles$a r0 = new coil.util.-Lifecycles$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f9062p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f9063q
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f9061m
            qc.f0 r6 = (qc.f0) r6
            java.lang.Object r0 = r0.f9060f
            androidx.lifecycle.p r0 = (androidx.lifecycle.p) r0
            dc.n.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L85
        L31:
            r7 = move-exception
            goto L96
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            dc.n.b(r7)
            androidx.lifecycle.p$b r7 = r6.b()
            androidx.lifecycle.p$b r2 = androidx.lifecycle.p.b.STARTED
            boolean r7 = r7.isAtLeast(r2)
            if (r7 == 0) goto L4d
            dc.w r6 = dc.w.f13270a
            return r6
        L4d:
            qc.f0 r7 = new qc.f0
            r7.<init>()
            r0.f9060f = r6     // Catch: java.lang.Throwable -> L91
            r0.f9061m = r7     // Catch: java.lang.Throwable -> L91
            r0.f9063q = r3     // Catch: java.lang.Throwable -> L91
            ad.n r2 = new ad.n     // Catch: java.lang.Throwable -> L91
            kotlin.coroutines.Continuation r4 = ic.b.c(r0)     // Catch: java.lang.Throwable -> L91
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L91
            r2.A()     // Catch: java.lang.Throwable -> L91
            coil.util.-Lifecycles$awaitStarted$2$1 r3 = new coil.util.-Lifecycles$awaitStarted$2$1     // Catch: java.lang.Throwable -> L91
            r3.<init>()     // Catch: java.lang.Throwable -> L91
            r7.f21676f = r3     // Catch: java.lang.Throwable -> L91
            qc.q.f(r3)     // Catch: java.lang.Throwable -> L91
            androidx.lifecycle.u r3 = (androidx.lifecycle.u) r3     // Catch: java.lang.Throwable -> L91
            r6.a(r3)     // Catch: java.lang.Throwable -> L91
            java.lang.Object r2 = r2.x()     // Catch: java.lang.Throwable -> L91
            java.lang.Object r3 = ic.b.d()     // Catch: java.lang.Throwable -> L91
            if (r2 != r3) goto L80
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L91
        L80:
            if (r2 != r1) goto L83
            return r1
        L83:
            r0 = r6
            r6 = r7
        L85:
            T r6 = r6.f21676f
            androidx.lifecycle.u r6 = (androidx.lifecycle.u) r6
            if (r6 == 0) goto L8e
            r0.d(r6)
        L8e:
            dc.w r6 = dc.w.f13270a
            return r6
        L91:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L96:
            T r6 = r6.f21676f
            androidx.lifecycle.u r6 = (androidx.lifecycle.u) r6
            if (r6 == 0) goto L9f
            r0.d(r6)
        L9f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.util.Lifecycles.a(androidx.lifecycle.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b(p pVar, u uVar) {
        pVar.d(uVar);
        pVar.a(uVar);
    }
}
