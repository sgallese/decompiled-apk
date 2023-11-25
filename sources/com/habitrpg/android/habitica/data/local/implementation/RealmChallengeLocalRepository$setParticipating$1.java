package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.social.ChallengeMembership;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import io.realm.o0;
import io.realm.x0;
import java.util.Iterator;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RealmChallengeLocalRepository.kt */
/* loaded from: classes4.dex */
final class RealmChallengeLocalRepository$setParticipating$1 extends r implements l<o0, w> {
    final /* synthetic */ String $challengeID;
    final /* synthetic */ boolean $isParticipating;
    final /* synthetic */ User $user;
    final /* synthetic */ String $userID;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmChallengeLocalRepository$setParticipating$1(boolean z10, User user, String str, String str2) {
        super(1);
        this.$isParticipating = z10;
        this.$user = user;
        this.$userID = str;
        this.$challengeID = str2;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        ChallengeMembership challengeMembership;
        x0<ChallengeMembership> challenges;
        q.i(o0Var, "it");
        if (this.$isParticipating) {
            x0<ChallengeMembership> challenges2 = this.$user.getChallenges();
            if (challenges2 != null) {
                challenges2.add(new ChallengeMembership(this.$userID, this.$challengeID));
                return;
            }
            return;
        }
        x0<ChallengeMembership> challenges3 = this.$user.getChallenges();
        if (challenges3 != null) {
            String str = this.$challengeID;
            Iterator<ChallengeMembership> it = challenges3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    challengeMembership = null;
                    break;
                }
                challengeMembership = it.next();
                if (q.d(challengeMembership.getChallengeID(), str)) {
                    break;
                }
            }
            ChallengeMembership challengeMembership2 = challengeMembership;
            if (challengeMembership2 == null || (challenges = this.$user.getChallenges()) == null) {
                return;
            }
            challenges.remove(challengeMembership2);
        }
    }
}
