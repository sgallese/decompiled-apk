package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import io.realm.o0;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RealmInventoryLocalRepository.kt */
/* loaded from: classes4.dex */
final class RealmInventoryLocalRepository$soldItem$1 extends r implements l<o0, w> {
    final /* synthetic */ User $updatedUser;
    final /* synthetic */ User $user;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmInventoryLocalRepository$soldItem$1(User user, User user2) {
        super(1);
        this.$updatedUser = user;
        this.$user = user2;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        q.i(o0Var, "it");
        Items items = this.$updatedUser.getItems();
        if (items != null) {
            this.$user.setItems(items);
        }
        Stats stats = this.$updatedUser.getStats();
        if (stats != null) {
            this.$user.setStats(stats);
        }
    }
}
