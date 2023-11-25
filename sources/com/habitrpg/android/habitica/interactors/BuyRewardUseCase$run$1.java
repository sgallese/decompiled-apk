package com.habitrpg.android.habitica.interactors;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.interactors.BuyRewardUseCase;
import com.habitrpg.shared.habitica.models.responses.TaskScoringResult;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyRewardUseCase.kt */
@f(c = "com.habitrpg.android.habitica.interactors.BuyRewardUseCase", f = "BuyRewardUseCase.kt", l = {17}, m = "run")
/* loaded from: classes4.dex */
public final class BuyRewardUseCase$run$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BuyRewardUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyRewardUseCase$run$1(BuyRewardUseCase buyRewardUseCase, Continuation<? super BuyRewardUseCase$run$1> continuation) {
        super(continuation);
        this.this$0 = buyRewardUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.run((BuyRewardUseCase.RequestValues) null, (Continuation<? super TaskScoringResult>) this);
    }
}
