package com.habitrpg.android.habitica.data.implementation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChallengeRepositoryImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl", f = "ChallengeRepositoryImpl.kt", l = {138}, m = "retrieveChallenges")
/* loaded from: classes4.dex */
public final class ChallengeRepositoryImpl$retrieveChallenges$1 extends d {
    int I$0;
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChallengeRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$retrieveChallenges$1(ChallengeRepositoryImpl challengeRepositoryImpl, Continuation<? super ChallengeRepositoryImpl$retrieveChallenges$1> continuation) {
        super(continuation);
        this.this$0 = challengeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.retrieveChallenges(0, false, this);
    }
}
