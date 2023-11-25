package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import java.util.Date;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class UserRepositoryImpl$runCron$3 extends r implements l<User, w> {
    public static final UserRepositoryImpl$runCron$3 INSTANCE = new UserRepositoryImpl$runCron$3();

    UserRepositoryImpl$runCron$3() {
        super(1);
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        q.i(user, "liveUser");
        user.setNeedsCron(false);
        user.setLastCron(new Date());
    }
}
