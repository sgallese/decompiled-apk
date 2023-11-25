package com.habitrpg.android.habitica.data;

import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.social.ChallengeMembership;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.tasks.TaskList;
import dd.g;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: ChallengeRepository.kt */
/* loaded from: classes4.dex */
public interface ChallengeRepository extends BaseRepository {

    /* compiled from: ChallengeRepository.kt */
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ g getUserChallenges$default(ChallengeRepository challengeRepository, String str, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = null;
                }
                return challengeRepository.getUserChallenges(str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserChallenges");
        }

        public static /* synthetic */ Object retrieveChallenges$default(ChallengeRepository challengeRepository, int i10, boolean z10, Continuation continuation, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    i10 = 0;
                }
                return challengeRepository.retrieveChallenges(i10, z10, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveChallenges");
        }
    }

    Object createChallenge(Challenge challenge, List<? extends Task> list, Continuation<? super Challenge> continuation);

    Object deleteChallenge(String str, Continuation<? super Void> continuation);

    g<Challenge> getChallenge(String str);

    g<List<ChallengeMembership>> getChallengeMemberships();

    g<List<Task>> getChallengeTasks(String str);

    g<ChallengeMembership> getChallengepMembership(String str);

    g<List<Challenge>> getChallenges();

    g<List<Challenge>> getUserChallenges(String str);

    g<Boolean> isChallengeMember(String str);

    Object joinChallenge(Challenge challenge, Continuation<? super Challenge> continuation);

    Object leaveChallenge(Challenge challenge, String str, Continuation<? super Void> continuation);

    Object retrieveChallenge(String str, Continuation<? super Challenge> continuation);

    Object retrieveChallengeTasks(String str, Continuation<? super TaskList> continuation);

    Object retrieveChallenges(int i10, boolean z10, Continuation<? super List<? extends Challenge>> continuation);

    Object updateChallenge(Challenge challenge, List<? extends Task> list, List<? extends Task> list2, List<? extends Task> list3, List<String> list4, Continuation<? super Challenge> continuation);
}
