package androidx.compose.foundation.gestures;

import dc.n;
import dc.w;
import j0.g3;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import pc.p;
import qc.q;
import t.b0;
import u.i;
import u.l;
import u.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
/* loaded from: classes.dex */
public final class c implements l, i {

    /* renamed from: a  reason: collision with root package name */
    private final g3<e> f1917a;

    /* renamed from: b  reason: collision with root package name */
    private u f1918b;

    /* compiled from: Scrollable.kt */
    @f(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", l = {534}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<u, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f1919f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f1920m;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ p<i, Continuation<? super w>, Object> f1922q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super i, ? super Continuation<? super w>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f1922q = pVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(u uVar, Continuation<? super w> continuation) {
            return ((a) create(uVar, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f1922q, continuation);
            aVar.f1920m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f1919f;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                c.this.c((u) this.f1920m);
                p<i, Continuation<? super w>, Object> pVar = this.f1922q;
                c cVar = c.this;
                this.f1919f = 1;
                if (pVar.invoke(cVar, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    public c(g3<e> g3Var) {
        u uVar;
        q.i(g3Var, "scrollLogic");
        this.f1917a = g3Var;
        uVar = d.f1924b;
        this.f1918b = uVar;
    }

    @Override // u.l
    public Object a(b0 b0Var, p<? super i, ? super Continuation<? super w>, ? extends Object> pVar, Continuation<? super w> continuation) {
        Object d10;
        Object c10 = this.f1917a.getValue().e().c(b0Var, new a(pVar, null), continuation);
        d10 = ic.d.d();
        if (c10 == d10) {
            return c10;
        }
        return w.f13270a;
    }

    @Override // u.i
    public void b(float f10) {
        e value = this.f1917a.getValue();
        value.a(this.f1918b, value.q(f10), j1.f.f18968a.a());
    }

    public final void c(u uVar) {
        q.i(uVar, "<set-?>");
        this.f1918b = uVar;
    }
}
