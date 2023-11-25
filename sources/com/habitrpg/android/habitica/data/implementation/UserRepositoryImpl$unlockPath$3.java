package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.models.responses.UnlockResponse;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class UserRepositoryImpl$unlockPath$3 extends r implements l<User, w> {
    final /* synthetic */ int $price;
    final /* synthetic */ UnlockResponse $unlockResponse;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl$unlockPath$3(UnlockResponse unlockResponse, int i10) {
        super(1);
        this.$unlockResponse = unlockResponse;
        this.$price = i10;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        q.i(user, "liveUser");
        Preferences preferences = this.$unlockResponse.preferences;
        if (preferences != null) {
            user.setPreferences(preferences);
        }
        user.setPurchased(this.$unlockResponse.purchased);
        user.setItems(this.$unlockResponse.items);
        user.setBalance(user.getBalance() - (this.$price / 4.0d));
    }
}
