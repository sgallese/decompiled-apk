package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.social.Challenge;
import dc.w;
import io.realm.o0;
import java.util.List;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RealmChallengeLocalRepository.kt */
/* loaded from: classes4.dex */
final class RealmChallengeLocalRepository$saveChallenges$3 extends r implements l<o0, w> {
    final /* synthetic */ List<Challenge> $challenges;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RealmChallengeLocalRepository$saveChallenges$3(List<? extends Challenge> list) {
        super(1);
        this.$challenges = list;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        q.i(o0Var, "realm1");
        o0Var.h1(this.$challenges);
    }
}
