package com.habitrpg.android.habitica.data.implementation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SocialRepositoryImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl", f = "SocialRepositoryImpl.kt", l = {117, 119}, m = "deleteMessage")
/* loaded from: classes4.dex */
public final class SocialRepositoryImpl$deleteMessage$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SocialRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialRepositoryImpl$deleteMessage$1(SocialRepositoryImpl socialRepositoryImpl, Continuation<? super SocialRepositoryImpl$deleteMessage$1> continuation) {
        super(continuation);
        this.this$0 = socialRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.deleteMessage(null, this);
    }
}
