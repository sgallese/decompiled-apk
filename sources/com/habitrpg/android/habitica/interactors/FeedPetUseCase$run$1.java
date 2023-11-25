package com.habitrpg.android.habitica.interactors;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.interactors.FeedPetUseCase;
import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FeedPetUseCase.kt */
@f(c = "com.habitrpg.android.habitica.interactors.FeedPetUseCase", f = "FeedPetUseCase.kt", l = {33}, m = "run")
/* loaded from: classes4.dex */
public final class FeedPetUseCase$run$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FeedPetUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedPetUseCase$run$1(FeedPetUseCase feedPetUseCase, Continuation<? super FeedPetUseCase$run$1> continuation) {
        super(continuation);
        this.this$0 = feedPetUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.run((FeedPetUseCase.RequestValues) null, (Continuation<? super FeedResponse>) this);
    }
}
