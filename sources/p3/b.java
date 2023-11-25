package p3;

import ad.r0;
import androidx.concurrent.futures.c;
import dc.w;
import java.util.concurrent.CancellationException;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: CoroutineAdapter.kt */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: CoroutineAdapter.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements l<Throwable, w> {

        /* renamed from: f */
        final /* synthetic */ c.a<T> f21056f;

        /* renamed from: m */
        final /* synthetic */ r0<T> f21057m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c.a<T> aVar, r0<? extends T> r0Var) {
            super(1);
            this.f21056f = aVar;
            this.f21057m = r0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(Throwable th) {
            invoke2(th);
            return w.f13270a;
        }

        /* renamed from: invoke */
        public final void invoke2(Throwable th) {
            if (th != null) {
                if (th instanceof CancellationException) {
                    this.f21056f.c();
                    return;
                } else {
                    this.f21056f.e(th);
                    return;
                }
            }
            this.f21056f.b(this.f21057m.getCompleted());
        }
    }

    public static final <T> com.google.common.util.concurrent.a<T> b(final r0<? extends T> r0Var, final Object obj) {
        q.i(r0Var, "<this>");
        com.google.common.util.concurrent.a<T> a10 = c.a(new c.InterfaceC0060c() { // from class: p3.a
            @Override // androidx.concurrent.futures.c.InterfaceC0060c
            public final Object a(c.a aVar) {
                Object d10;
                d10 = b.d(r0.this, obj, aVar);
                return d10;
            }
        });
        q.h(a10, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return a10;
    }

    public static /* synthetic */ com.google.common.util.concurrent.a c(r0 r0Var, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(r0Var, obj);
    }

    public static final Object d(r0 r0Var, Object obj, c.a aVar) {
        q.i(r0Var, "$this_asListenableFuture");
        q.i(aVar, "completer");
        r0Var.s0(new a(aVar, r0Var));
        return obj;
    }
}
