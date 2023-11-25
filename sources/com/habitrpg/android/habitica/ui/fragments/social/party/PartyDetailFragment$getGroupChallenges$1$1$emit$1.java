package com.habitrpg.android.habitica.ui.fragments.social.party;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$getGroupChallenges$1;
import dc.w;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartyDetailFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$getGroupChallenges$1$1", f = "PartyDetailFragment.kt", l = {466}, m = "emit")
/* loaded from: classes4.dex */
public final class PartyDetailFragment$getGroupChallenges$1$1$emit$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PartyDetailFragment$getGroupChallenges$1.AnonymousClass1<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PartyDetailFragment$getGroupChallenges$1$1$emit$1(PartyDetailFragment$getGroupChallenges$1.AnonymousClass1<? super T> anonymousClass1, Continuation<? super PartyDetailFragment$getGroupChallenges$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.emit((User) null, (Continuation<? super w>) this);
    }
}
