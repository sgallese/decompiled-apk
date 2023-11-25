package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.models.auth.LocalAuthentication;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.Flags;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class UserRepositoryImpl$updateLoginName$2 extends r implements l<User, w> {
    final /* synthetic */ String $newLoginName;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl$updateLoginName$2(String str) {
        super(1);
        this.$newLoginName = str;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        q.i(user, "liveUser");
        Authentication authentication = user.getAuthentication();
        LocalAuthentication localAuthentication = authentication != null ? authentication.getLocalAuthentication() : null;
        if (localAuthentication != null) {
            localAuthentication.setUsername(this.$newLoginName);
        }
        Flags flags = user.getFlags();
        if (flags == null) {
            return;
        }
        flags.setVerifiedUsername(true);
    }
}
