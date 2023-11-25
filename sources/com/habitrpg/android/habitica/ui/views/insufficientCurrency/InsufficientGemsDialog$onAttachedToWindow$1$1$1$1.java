package com.habitrpg.android.habitica.ui.views.insufficientCurrency;

import ad.k0;
import com.habitrpg.android.habitica.interactors.InsufficientGemsUseCase;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InsufficientGemsDialog.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientGemsDialog$onAttachedToWindow$1$1$1$1", f = "InsufficientGemsDialog.kt", l = {96}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class InsufficientGemsDialog$onAttachedToWindow$1$1$1$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ InsufficientGemsDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsufficientGemsDialog$onAttachedToWindow$1$1$1$1(InsufficientGemsDialog insufficientGemsDialog, Continuation<? super InsufficientGemsDialog$onAttachedToWindow$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = insufficientGemsDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new InsufficientGemsDialog$onAttachedToWindow$1$1$1$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((InsufficientGemsDialog$onAttachedToWindow$1$1$1$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            InsufficientGemsUseCase insufficientGemsUseCase = this.this$0.getInsufficientGemsUseCase();
            InsufficientGemsUseCase.RequestValues requestValues = new InsufficientGemsUseCase.RequestValues(this.this$0.getGemPrice(), this.this$0.getParentActivity());
            this.label = 1;
            if (insufficientGemsUseCase.callInteractor(requestValues, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
