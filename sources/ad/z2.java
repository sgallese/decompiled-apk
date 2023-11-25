package ad;

import kotlin.coroutines.Continuation;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes4.dex */
public final class z2<T> extends fd.c0<T> {

    /* renamed from: r  reason: collision with root package name */
    private final ThreadLocal<dc.l<hc.f, Object>> f589r;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z2(hc.f r3, kotlin.coroutines.Continuation<? super T> r4) {
        /*
            r2 = this;
            ad.a3 r0 = ad.a3.f467f
            hc.f$b r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            hc.f r0 = r3.plus(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f589r = r0
            hc.f r4 = r4.getContext()
            hc.d$b r0 = hc.d.f16598i
            hc.f$b r4 = r4.get(r0)
            boolean r4 = r4 instanceof ad.g0
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = fd.k0.c(r3, r4)
            fd.k0.a(r3, r4)
            r2.Y0(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.z2.<init>(hc.f, kotlin.coroutines.Continuation):void");
    }

    @Override // fd.c0, ad.a
    protected void T0(Object obj) {
        if (this.threadLocalIsSet) {
            dc.l<hc.f, Object> lVar = this.f589r.get();
            if (lVar != null) {
                fd.k0.a(lVar.a(), lVar.b());
            }
            this.f589r.remove();
        }
        Object a10 = d0.a(obj, this.f15622q);
        Continuation<T> continuation = this.f15622q;
        hc.f context = continuation.getContext();
        z2<?> z2Var = null;
        Object c10 = fd.k0.c(context, null);
        if (c10 != fd.k0.f15643a) {
            z2Var = f0.g(continuation, context, c10);
        }
        try {
            this.f15622q.resumeWith(a10);
            dc.w wVar = dc.w.f13270a;
        } finally {
            if (z2Var == null || z2Var.X0()) {
                fd.k0.a(context, c10);
            }
        }
    }

    public final boolean X0() {
        boolean z10;
        if (this.threadLocalIsSet && this.f589r.get() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f589r.remove();
        return !z10;
    }

    public final void Y0(hc.f fVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f589r.set(dc.r.a(fVar, obj));
    }
}
