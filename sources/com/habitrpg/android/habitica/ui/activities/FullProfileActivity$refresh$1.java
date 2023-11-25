package com.habitrpg.android.habitica.ui.activities;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FullProfileActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.FullProfileActivity", f = "FullProfileActivity.kt", l = {156}, m = "refresh")
/* loaded from: classes4.dex */
public final class FullProfileActivity$refresh$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FullProfileActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullProfileActivity$refresh$1(FullProfileActivity fullProfileActivity, Continuation<? super FullProfileActivity$refresh$1> continuation) {
        super(continuation);
        this.this$0 = fullProfileActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object refresh;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        refresh = this.this$0.refresh(false, this);
        return refresh;
    }
}
