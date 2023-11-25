package com.habitrpg.android.habitica.data.local;

import com.habitrpg.android.habitica.models.Achievement;
import com.habitrpg.android.habitica.models.QuestAchievement;
import com.habitrpg.android.habitica.models.Skill;
import com.habitrpg.android.habitica.models.TeamPlan;
import com.habitrpg.android.habitica.models.TutorialStep;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.models.user.UserQuestStatus;
import dd.g;
import io.realm.g1;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: UserLocalRepository.kt */
/* loaded from: classes4.dex */
public interface UserLocalRepository extends BaseLocalRepository {

    /* compiled from: UserLocalRepository.kt */
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void saveUser$default(UserLocalRepository userLocalRepository, User user, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = true;
                }
                userLocalRepository.saveUser(user, z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveUser");
        }
    }

    g<List<Achievement>> getAchievements();

    g<List<QuestAchievement>> getQuestAchievements(String str);

    g<List<Skill>> getSkills(User user);

    g<List<Skill>> getSpecialItems(User user);

    g<Group> getTeamPlan(String str);

    g<List<TeamPlan>> getTeamPlans(String str);

    Object getTutorialSteps(Continuation<? super g<? extends g1<TutorialStep>>> continuation);

    g<User> getUser(String str);

    g<UserQuestStatus> getUserQuestStatus(String str);

    void saveMessages(List<? extends ChatMessage> list);

    void saveUser(User user, boolean z10);
}
