package com.habitrpg.android.habitica.interactors;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.interactors.NotifyUserUseCase;
import com.habitrpg.android.habitica.models.user.Stats;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotifyUserUseCase.kt */
@f(c = "com.habitrpg.android.habitica.interactors.NotifyUserUseCase", f = "NotifyUserUseCase.kt", l = {43, 44}, m = "run")
/* loaded from: classes4.dex */
public final class NotifyUserUseCase$run$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotifyUserUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifyUserUseCase$run$1(NotifyUserUseCase notifyUserUseCase, Continuation<? super NotifyUserUseCase$run$1> continuation) {
        super(continuation);
        this.this$0 = notifyUserUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.run((NotifyUserUseCase.RequestValues) null, (Continuation<? super Stats>) this);
    }
}
