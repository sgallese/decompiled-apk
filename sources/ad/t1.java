package ad;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* compiled from: Interruptible.kt */
/* loaded from: classes4.dex */
public final class t1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Interruptible.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super T>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f558f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f559m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.a<T> f560p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pc.a<? extends T> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f560p = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f560p, continuation);
            aVar.f559m = obj;
            return aVar;
        }

        public final Object invoke(k0 k0Var, Continuation<? super T> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f558f == 0) {
                dc.n.b(obj);
                return t1.d(((k0) this.f559m).getCoroutineContext(), this.f560p);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Object invoke(k0 k0Var, Object obj) {
            return invoke(k0Var, (Continuation) ((Continuation) obj));
        }
    }

    public static final <T> Object b(hc.f fVar, pc.a<? extends T> aVar, Continuation<? super T> continuation) {
        return g.g(fVar, new a(aVar, null), continuation);
    }

    public static /* synthetic */ Object c(hc.f fVar, pc.a aVar, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = hc.g.f16601f;
        }
        return b(fVar, aVar, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T d(hc.f fVar, pc.a<? extends T> aVar) {
        try {
            v2 v2Var = new v2(a2.l(fVar));
            v2Var.d();
            try {
                return aVar.invoke();
            } finally {
                v2Var.a();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
