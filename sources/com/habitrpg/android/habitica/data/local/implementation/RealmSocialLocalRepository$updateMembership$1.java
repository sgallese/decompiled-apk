package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.social.GroupMembership;
import dc.w;
import io.realm.o0;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RealmSocialLocalRepository.kt */
/* loaded from: classes4.dex */
final class RealmSocialLocalRepository$updateMembership$1 extends r implements l<o0, w> {
    final /* synthetic */ GroupMembership $membership;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmSocialLocalRepository$updateMembership$1(GroupMembership groupMembership) {
        super(1);
        this.$membership = groupMembership;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        q.i(o0Var, "it");
        this.$membership.deleteFromRealm();
    }
}
