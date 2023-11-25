package cd;

import ad.f0;
import ad.k0;
import ad.m0;
import androidx.recyclerview.widget.RecyclerView;
import dc.m;
import dc.w;
import kotlin.coroutines.Continuation;

/* compiled from: Produce.kt */
/* loaded from: classes4.dex */
public final class n {

    /* compiled from: Produce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {153}, m = "awaitClose")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f */
        Object f9014f;

        /* renamed from: m */
        Object f9015m;

        /* renamed from: p */
        /* synthetic */ Object f9016p;

        /* renamed from: q */
        int f9017q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9016p = obj;
            this.f9017q |= RecyclerView.UNDEFINED_DURATION;
            return n.a(null, null, this);
        }
    }

    /* compiled from: Produce.kt */
    /* loaded from: classes4.dex */
    public static final class b extends qc.r implements pc.l<Throwable, w> {

        /* renamed from: f */
        final /* synthetic */ ad.m<w> f9018f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ad.m<? super w> mVar) {
            super(1);
            this.f9018f = mVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(Throwable th) {
            invoke2(th);
            return w.f13270a;
        }

        /* renamed from: invoke */
        public final void invoke2(Throwable th) {
            ad.m<w> mVar = this.f9018f;
            m.a aVar = dc.m.f13253f;
            mVar.resumeWith(dc.m.a(w.f13270a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(cd.p<?> r4, pc.a<dc.w> r5, kotlin.coroutines.Continuation<? super dc.w> r6) {
        /*
            boolean r0 = r6 instanceof cd.n.a
            if (r0 == 0) goto L13
            r0 = r6
            cd.n$a r0 = (cd.n.a) r0
            int r1 = r0.f9017q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9017q = r1
            goto L18
        L13:
            cd.n$a r0 = new cd.n$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9016p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f9017q
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f9015m
            r5 = r4
            pc.a r5 = (pc.a) r5
            java.lang.Object r4 = r0.f9014f
            cd.p r4 = (cd.p) r4
            dc.n.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L7a
        L32:
            r4 = move-exception
            goto L80
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            dc.n.b(r6)
            hc.f r6 = r0.getContext()
            ad.x1$b r2 = ad.x1.f574b
            hc.f$b r6 = r6.get(r2)
            if (r6 != r4) goto L4d
            r6 = 1
            goto L4e
        L4d:
            r6 = 0
        L4e:
            if (r6 == 0) goto L84
            r0.f9014f = r4     // Catch: java.lang.Throwable -> L32
            r0.f9015m = r5     // Catch: java.lang.Throwable -> L32
            r0.f9017q = r3     // Catch: java.lang.Throwable -> L32
            ad.n r6 = new ad.n     // Catch: java.lang.Throwable -> L32
            kotlin.coroutines.Continuation r2 = ic.b.c(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.A()     // Catch: java.lang.Throwable -> L32
            cd.n$b r2 = new cd.n$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.h(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.x()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = ic.b.d()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L77
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L32
        L77:
            if (r4 != r1) goto L7a
            return r1
        L7a:
            r5.invoke()
            dc.w r4 = dc.w.f13270a
            return r4
        L80:
            r5.invoke()
            throw r4
        L84:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.n.a(cd.p, pc.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <E> r<E> b(k0 k0Var, hc.f fVar, int i10, cd.a aVar, m0 m0Var, pc.l<? super Throwable, w> lVar, pc.p<? super p<? super E>, ? super Continuation<? super w>, ? extends Object> pVar) {
        o oVar = new o(f0.d(k0Var, fVar), g.b(i10, aVar, null, 4, null));
        if (lVar != null) {
            oVar.s0(lVar);
        }
        oVar.W0(m0Var, oVar, pVar);
        return oVar;
    }

    public static final <E> r<E> c(k0 k0Var, hc.f fVar, int i10, pc.p<? super p<? super E>, ? super Continuation<? super w>, ? extends Object> pVar) {
        return b(k0Var, fVar, i10, cd.a.SUSPEND, m0.DEFAULT, null, pVar);
    }

    public static /* synthetic */ r d(k0 k0Var, hc.f fVar, int i10, cd.a aVar, m0 m0Var, pc.l lVar, pc.p pVar, int i11, Object obj) {
        int i12;
        if ((i11 & 1) != 0) {
            fVar = hc.g.f16601f;
        }
        hc.f fVar2 = fVar;
        if ((i11 & 2) != 0) {
            i12 = 0;
        } else {
            i12 = i10;
        }
        if ((i11 & 4) != 0) {
            aVar = cd.a.SUSPEND;
        }
        cd.a aVar2 = aVar;
        if ((i11 & 8) != 0) {
            m0Var = m0.DEFAULT;
        }
        m0 m0Var2 = m0Var;
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        return b(k0Var, fVar2, i12, aVar2, m0Var2, lVar, pVar);
    }

    public static /* synthetic */ r e(k0 k0Var, hc.f fVar, int i10, pc.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fVar = hc.g.f16601f;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c(k0Var, fVar, i10, pVar);
    }
}
