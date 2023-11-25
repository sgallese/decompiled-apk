package com.habitrpg.android.habitica.data.local.implementation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmInventoryLocalRepository.kt */
@f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository", f = "RealmInventoryLocalRepository.kt", l = {239}, m = "changeOwnedCount")
/* loaded from: classes4.dex */
public final class RealmInventoryLocalRepository$changeOwnedCount$1 extends d {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RealmInventoryLocalRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmInventoryLocalRepository$changeOwnedCount$1(RealmInventoryLocalRepository realmInventoryLocalRepository, Continuation<? super RealmInventoryLocalRepository$changeOwnedCount$1> continuation) {
        super(continuation);
        this.this$0 = realmInventoryLocalRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.changeOwnedCount(null, null, null, 0, this);
    }
}
