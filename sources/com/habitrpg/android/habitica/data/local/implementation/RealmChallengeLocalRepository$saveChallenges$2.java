package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.social.Challenge;
import dc.w;
import io.realm.o0;
import java.util.ArrayList;
import java.util.Iterator;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RealmChallengeLocalRepository.kt */
/* loaded from: classes4.dex */
final class RealmChallengeLocalRepository$saveChallenges$2 extends r implements l<o0, w> {
    final /* synthetic */ ArrayList<Challenge> $challengesToDelete;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmChallengeLocalRepository$saveChallenges$2(ArrayList<Challenge> arrayList) {
        super(1);
        this.$challengesToDelete = arrayList;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        q.i(o0Var, "it");
        Iterator<Challenge> it = this.$challengesToDelete.iterator();
        while (it.hasNext()) {
            it.next().deleteFromRealm();
        }
    }
}
