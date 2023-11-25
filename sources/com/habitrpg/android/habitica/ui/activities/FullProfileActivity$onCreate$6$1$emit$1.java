package com.habitrpg.android.habitica.ui.activities;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$6;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FullProfileActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$6$1", f = "FullProfileActivity.kt", l = {143}, m = "emit")
/* loaded from: classes4.dex */
public final class FullProfileActivity$onCreate$6$1$emit$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FullProfileActivity$onCreate$6.AnonymousClass1<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FullProfileActivity$onCreate$6$1$emit$1(FullProfileActivity$onCreate$6.AnonymousClass1<? super T> anonymousClass1, Continuation<? super FullProfileActivity$onCreate$6$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.emit((User) null, (Continuation<? super dc.w>) this);
    }
}
