package com.habitrpg.android.habitica.data.implementation;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.models.user.User;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRepositoryImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl", f = "UserRepositoryImpl.kt", l = {56, 57}, m = "updateUser")
/* loaded from: classes4.dex */
public final class UserRepositoryImpl$updateUser$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl$updateUser$1(UserRepositoryImpl userRepositoryImpl, Continuation<? super UserRepositoryImpl$updateUser$1> continuation) {
        super(continuation);
        this.this$0 = userRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object updateUser;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        updateUser = this.this$0.updateUser((String) null, (Map<String, ? extends Object>) null, (Continuation<? super User>) this);
        return updateUser;
    }
}
