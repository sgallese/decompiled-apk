package com.habitrpg.android.habitica.ui.viewmodels;

import androidx.lifecycle.LiveData;
import com.habitrpg.android.habitica.models.user.User;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModel.kt */
/* loaded from: classes4.dex */
public final class BaseViewModel$user$2 extends r implements pc.a<LiveData<User>> {
    final /* synthetic */ BaseViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$user$2(BaseViewModel baseViewModel) {
        super(0);
        this.this$0 = baseViewModel;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final LiveData<User> invoke() {
        return this.this$0.getUserViewModel().getUser();
    }
}
