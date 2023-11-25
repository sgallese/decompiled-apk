package com.habitrpg.android.habitica.interactors;

import ad.k0;
import com.habitrpg.android.habitica.interactors.UseCase;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX WARN: Incorrect field signature: TQ; */
/* compiled from: UseCase.kt */
@f(c = "com.habitrpg.android.habitica.interactors.UseCase$callInteractor$2", f = "UseCase.kt", l = {10}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class UseCase$callInteractor$2<T> extends l implements p<k0, Continuation<? super T>, Object> {
    final /* synthetic */ UseCase.RequestValues $requestValues;
    int label;
    final /* synthetic */ UseCase<Q, T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/habitrpg/android/habitica/interactors/UseCase<TQ;TT;>;TQ;Lkotlin/coroutines/Continuation<-Lcom/habitrpg/android/habitica/interactors/UseCase$callInteractor$2;>;)V */
    public UseCase$callInteractor$2(UseCase useCase, UseCase.RequestValues requestValues, Continuation continuation) {
        super(2, continuation);
        this.this$0 = useCase;
        this.$requestValues = requestValues;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new UseCase$callInteractor$2(this.this$0, this.$requestValues, continuation);
    }

    public final Object invoke(k0 k0Var, Continuation<? super T> continuation) {
        return ((UseCase$callInteractor$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            UseCase<Q, T> useCase = this.this$0;
            UseCase.RequestValues requestValues = this.$requestValues;
            this.label = 1;
            obj = useCase.run(requestValues, this);
            if (obj == d10) {
                return d10;
            }
        }
        return obj;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ Object invoke(k0 k0Var, Object obj) {
        return invoke(k0Var, (Continuation) ((Continuation) obj));
    }
}
