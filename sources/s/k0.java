package s;

import kotlin.coroutines.Continuation;

/* compiled from: InfiniteAnimationPolicy.kt */
/* loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: InfiniteAnimationPolicy.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {31}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a<R> extends kotlin.coroutines.jvm.internal.l implements pc.l<Continuation<? super R>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f22725f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.l<Long, R> f22726m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pc.l<? super Long, ? extends R> lVar, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f22726m = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Continuation<?> continuation) {
            return new a(this.f22726m, continuation);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((Continuation) ((Continuation) obj));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f22725f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                pc.l<Long, R> lVar = this.f22726m;
                this.f22725f = 1;
                obj = j0.z0.b(lVar, this);
                if (obj == d10) {
                    return d10;
                }
            }
            return obj;
        }

        public final Object invoke(Continuation<? super R> continuation) {
            return ((a) create(continuation)).invokeSuspend(dc.w.f13270a);
        }
    }

    public static final <R> Object a(pc.l<? super Long, ? extends R> lVar, Continuation<? super R> continuation) {
        androidx.compose.ui.platform.h1 h1Var = (androidx.compose.ui.platform.h1) continuation.getContext().get(androidx.compose.ui.platform.h1.f2686c);
        if (h1Var == null) {
            return j0.z0.b(lVar, continuation);
        }
        return h1Var.z0(new a(lVar, null), continuation);
    }
}
