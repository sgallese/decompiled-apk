package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class UserRepositoryImpl$sleep$2 extends r implements l<User, w> {
    final /* synthetic */ boolean $newValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl$sleep$2(boolean z10) {
        super(1);
        this.$newValue = z10;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        q.i(user, "it");
        Preferences preferences = user.getPreferences();
        if (preferences == null) {
            return;
        }
        preferences.setSleep(this.$newValue);
    }
}
