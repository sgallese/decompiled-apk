package com.habitrpg.android.habitica.data.local;

import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.social.ChallengeMembership;
import com.habitrpg.android.habitica.models.tasks.Task;
import dd.g;
import java.util.List;

/* compiled from: ChallengeLocalRepository.kt */
/* loaded from: classes4.dex */
public interface ChallengeLocalRepository extends BaseLocalRepository {
    g<Challenge> getChallenge(String str);

    g<ChallengeMembership> getChallengeMembership(String str, String str2);

    g<List<ChallengeMembership>> getChallengeMemberships(String str);

    g<List<Challenge>> getChallenges();

    g<List<Task>> getTasks(String str);

    g<List<Challenge>> getUserChallenges(String str);

    g<Boolean> isChallengeMember(String str, String str2);

    void saveChallenges(List<? extends Challenge> list, boolean z10, boolean z11, String str);

    void setParticipating(String str, String str2, boolean z10);
}
