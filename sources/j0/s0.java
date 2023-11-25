package j0;

import dc.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: Latch.kt */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f18890a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private List<Continuation<dc.w>> f18891b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<Continuation<dc.w>> f18892c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f18893d = true;

    /* compiled from: Latch.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<Throwable, dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ ad.m<dc.w> f18895m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ad.m<? super dc.w> mVar) {
            super(1);
            this.f18895m = mVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
            invoke2(th);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            Object obj = s0.this.f18890a;
            s0 s0Var = s0.this;
            ad.m<dc.w> mVar = this.f18895m;
            synchronized (obj) {
                s0Var.f18891b.remove(mVar);
                dc.w wVar = dc.w.f13270a;
            }
        }
    }

    public final Object c(Continuation<? super dc.w> continuation) {
        Continuation c10;
        Object d10;
        Object d11;
        if (!e()) {
            c10 = ic.c.c(continuation);
            ad.n nVar = new ad.n(c10, 1);
            nVar.A();
            synchronized (this.f18890a) {
                this.f18891b.add(nVar);
            }
            nVar.n(new a(nVar));
            Object x10 = nVar.x();
            d10 = ic.d.d();
            if (x10 == d10) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            d11 = ic.d.d();
            if (x10 == d11) {
                return x10;
            }
            return dc.w.f13270a;
        }
        return dc.w.f13270a;
    }

    public final void d() {
        synchronized (this.f18890a) {
            this.f18893d = false;
            dc.w wVar = dc.w.f13270a;
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f18890a) {
            z10 = this.f18893d;
        }
        return z10;
    }

    public final void f() {
        synchronized (this.f18890a) {
            if (e()) {
                return;
            }
            List<Continuation<dc.w>> list = this.f18891b;
            this.f18891b = this.f18892c;
            this.f18892c = list;
            this.f18893d = true;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Continuation<dc.w> continuation = list.get(i10);
                m.a aVar = dc.m.f13253f;
                continuation.resumeWith(dc.m.a(dc.w.f13270a));
            }
            list.clear();
            dc.w wVar = dc.w.f13270a;
        }
    }
}
