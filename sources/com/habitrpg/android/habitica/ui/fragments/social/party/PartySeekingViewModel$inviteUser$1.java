package com.habitrpg.android.habitica.ui.fragments.social.party;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartySeekingFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingViewModel", f = "PartySeekingFragment.kt", l = {103}, m = "inviteUser")
/* loaded from: classes4.dex */
public final class PartySeekingViewModel$inviteUser$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PartySeekingViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartySeekingViewModel$inviteUser$1(PartySeekingViewModel partySeekingViewModel, Continuation<? super PartySeekingViewModel$inviteUser$1> continuation) {
        super(continuation);
        this.this$0 = partySeekingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.inviteUser(null, this);
    }
}
