package com.habitrpg.android.habitica.ui.fragments.social.party;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartySeekingFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingPagingSource", f = "PartySeekingFragment.kt", l = {344}, m = "load")
/* loaded from: classes4.dex */
public final class PartySeekingPagingSource$load$1 extends kotlin.coroutines.jvm.internal.d {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PartySeekingPagingSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartySeekingPagingSource$load$1(PartySeekingPagingSource partySeekingPagingSource, Continuation<? super PartySeekingPagingSource$load$1> continuation) {
        super(continuation);
        this.this$0 = partySeekingPagingSource;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.load(null, this);
    }
}
