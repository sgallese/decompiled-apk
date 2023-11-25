package com.habitrpg.android.habitica.ui.activities;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BirthdayActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.BirthdayActivity", f = "BirthdayActivity.kt", l = {191, 192}, m = "purchaseWithGems")
/* loaded from: classes4.dex */
public final class BirthdayActivity$purchaseWithGems$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BirthdayActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayActivity$purchaseWithGems$1(BirthdayActivity birthdayActivity, Continuation<? super BirthdayActivity$purchaseWithGems$1> continuation) {
        super(continuation);
        this.this$0 = birthdayActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object purchaseWithGems;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        purchaseWithGems = this.this$0.purchaseWithGems(this);
        return purchaseWithGems;
    }
}
