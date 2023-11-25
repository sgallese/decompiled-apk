package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class UserRepositoryImpl$bulkAllocatePoints$2 extends r implements l<User, w> {
    final /* synthetic */ Stats $stats;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl$bulkAllocatePoints$2(Stats stats) {
        super(1);
        this.$stats = stats;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        q.i(user, "liveUser");
        Stats stats = user.getStats();
        if (stats != null) {
            stats.setStrength(this.$stats.getStrength());
        }
        Stats stats2 = user.getStats();
        if (stats2 != null) {
            stats2.setConstitution(this.$stats.getConstitution());
        }
        Stats stats3 = user.getStats();
        if (stats3 != null) {
            stats3.setPer(this.$stats.getPer());
        }
        Stats stats4 = user.getStats();
        if (stats4 != null) {
            stats4.setIntelligence(this.$stats.getIntelligence());
        }
        Stats stats5 = user.getStats();
        if (stats5 != null) {
            stats5.setPoints(this.$stats.getPoints());
        }
        Stats stats6 = user.getStats();
        if (stats6 == null) {
            return;
        }
        stats6.setMp(this.$stats.getMp());
    }
}
