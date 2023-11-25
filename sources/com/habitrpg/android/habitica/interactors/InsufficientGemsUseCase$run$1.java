package com.habitrpg.android.habitica.interactors;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.interactors.InsufficientGemsUseCase;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InsufficientGemsUseCase.kt */
@f(c = "com.habitrpg.android.habitica.interactors.InsufficientGemsUseCase", f = "InsufficientGemsUseCase.kt", l = {20}, m = "run")
/* loaded from: classes4.dex */
public final class InsufficientGemsUseCase$run$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InsufficientGemsUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsufficientGemsUseCase$run$1(InsufficientGemsUseCase insufficientGemsUseCase, Continuation<? super InsufficientGemsUseCase$run$1> continuation) {
        super(continuation);
        this.this$0 = insufficientGemsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.run((InsufficientGemsUseCase.RequestValues) null, (Continuation<? super w>) this);
    }
}
