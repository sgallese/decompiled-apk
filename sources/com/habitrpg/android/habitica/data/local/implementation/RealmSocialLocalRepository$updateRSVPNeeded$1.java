package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.social.UserParty;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import io.realm.o0;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RealmSocialLocalRepository.kt */
/* loaded from: classes4.dex */
final class RealmSocialLocalRepository$updateRSVPNeeded$1 extends r implements l<o0, w> {
    final /* synthetic */ boolean $newValue;
    final /* synthetic */ User $user;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmSocialLocalRepository$updateRSVPNeeded$1(User user, boolean z10) {
        super(1);
        this.$user = user;
        this.$newValue = z10;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        UserParty party;
        q.i(o0Var, "it");
        User user = this.$user;
        Quest quest = (user == null || (party = user.getParty()) == null) ? null : party.getQuest();
        if (quest == null) {
            return;
        }
        quest.setRSVPNeeded(this.$newValue);
    }
}
