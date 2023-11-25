package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1;
import dc.w;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChallengeDetailFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment$onViewCreated$3$1$2", f = "ChallengeDetailFragment.kt", l = {106}, m = "emit")
/* loaded from: classes4.dex */
public final class ChallengeDetailFragment$onViewCreated$3$1$2$emit$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChallengeDetailFragment$onViewCreated$3$1.AnonymousClass2<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeDetailFragment$onViewCreated$3$1$2$emit$1(ChallengeDetailFragment$onViewCreated$3$1.AnonymousClass2<? super T> anonymousClass2, Continuation<? super ChallengeDetailFragment$onViewCreated$3$1$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.emit((String) null, (Continuation<? super w>) this);
    }
}
