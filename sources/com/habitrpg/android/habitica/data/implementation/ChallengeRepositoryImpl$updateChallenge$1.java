package com.habitrpg.android.habitica.data.implementation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChallengeRepositoryImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl", f = "ChallengeRepositoryImpl.kt", l = {106, 110, 113, 118}, m = "updateChallenge")
/* loaded from: classes4.dex */
public final class ChallengeRepositoryImpl$updateChallenge$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChallengeRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$updateChallenge$1(ChallengeRepositoryImpl challengeRepositoryImpl, Continuation<? super ChallengeRepositoryImpl$updateChallenge$1> continuation) {
        super(continuation);
        this.this$0 = challengeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.updateChallenge(null, null, null, null, null, this);
    }
}
