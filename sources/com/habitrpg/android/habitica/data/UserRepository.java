package com.habitrpg.android.habitica.data;

import com.habitrpg.android.habitica.models.Achievement;
import com.habitrpg.android.habitica.models.QuestAchievement;
import com.habitrpg.android.habitica.models.Skill;
import com.habitrpg.android.habitica.models.TeamPlan;
import com.habitrpg.android.habitica.models.inventory.Customization;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.responses.SkillResponse;
import com.habitrpg.android.habitica.models.responses.UnlockResponse;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.models.user.UserQuestStatus;
import com.habitrpg.common.habitica.models.Notification;
import com.habitrpg.shared.habitica.models.responses.VerifyUsernameResponse;
import com.habitrpg.shared.habitica.models.tasks.Attribute;
import dc.w;
import dd.g;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* compiled from: UserRepository.kt */
/* loaded from: classes4.dex */
public interface UserRepository extends BaseRepository {

    /* compiled from: UserRepository.kt */
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object changeClass$default(UserRepository userRepository, String str, Continuation continuation, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = null;
                }
                return userRepository.changeClass(str, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeClass");
        }

        public static /* synthetic */ Object retrieveUser$default(UserRepository userRepository, boolean z10, boolean z11, boolean z12, Continuation continuation, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                if ((i10 & 2) != 0) {
                    z11 = false;
                }
                if ((i10 & 4) != 0) {
                    z12 = false;
                }
                return userRepository.retrieveUser(z10, z11, z12, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveUser");
        }

        public static /* synthetic */ Object updateLoginName$default(UserRepository userRepository, String str, String str2, Continuation continuation, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str2 = null;
                }
                return userRepository.updateLoginName(str, str2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLoginName");
        }
    }

    Object allocatePoint(Attribute attribute, Continuation<? super Stats> continuation);

    Object bulkAllocatePoints(int i10, int i11, int i12, int i13, Continuation<? super Stats> continuation);

    Object changeClass(String str, Continuation<? super User> continuation);

    Object changeCustomDayStart(int i10, Continuation<? super User> continuation);

    Object deleteAccount(String str, Continuation<? super Void> continuation);

    Object disableClasses(Continuation<? super User> continuation);

    g<List<Achievement>> getAchievements();

    Object getNews(Continuation<? super List<? extends Object>> continuation);

    Object getNewsNotification(Continuation<? super Notification> continuation);

    g<List<QuestAchievement>> getQuestAchievements();

    g<List<Skill>> getSkills(User user);

    g<List<Skill>> getSpecialItems(User user);

    g<Group> getTeamPlan(String str);

    g<List<TeamPlan>> getTeamPlans();

    g<User> getUser();

    g<User> getUser(String str);

    g<UserQuestStatus> getUserQuestStatus();

    Object readNotification(String str, Continuation<? super List<? extends Object>> continuation);

    Object readNotifications(Map<String, ? extends List<String>> map, Continuation<? super List<? extends Object>> continuation);

    Object reroll(Continuation<? super User> continuation);

    Object resetAccount(Continuation<? super User> continuation);

    Object resetTutorial(Continuation<? super User> continuation);

    Object retrieveAchievements(Continuation<? super List<? extends Achievement>> continuation);

    Object retrieveTeamPlan(String str, Continuation<? super Group> continuation);

    Object retrieveTeamPlans(Continuation<? super List<? extends TeamPlan>> continuation);

    Object retrieveUser(boolean z10, boolean z11, boolean z12, Continuation<? super User> continuation);

    Object revive(Continuation<? super Equipment> continuation);

    Object runCron(List<Task> list, Continuation<? super w> continuation);

    Object runCron(Continuation<? super w> continuation);

    Object seeNotifications(Map<String, ? extends List<String>> map, Continuation<? super List<? extends Object>> continuation);

    Object sendPasswordResetEmail(String str, Continuation<? super Void> continuation);

    Object sleep(User user, Continuation<? super User> continuation);

    Object unlockPath(Customization customization, Continuation<? super UnlockResponse> continuation);

    Object unlockPath(String str, int i10, Continuation<? super UnlockResponse> continuation);

    Object updateEmail(String str, String str2, Continuation<? super Void> continuation);

    Object updateLanguage(String str, Continuation<? super User> continuation);

    Object updateLoginName(String str, String str2, Continuation<? super User> continuation);

    Object updatePassword(String str, String str2, String str3, Continuation<? super Void> continuation);

    Object updateUser(String str, Object obj, Continuation<? super User> continuation);

    Object updateUser(Map<String, ? extends Object> map, Continuation<? super User> continuation);

    Object useCustomization(String str, String str2, String str3, Continuation<? super User> continuation);

    Object useSkill(String str, String str2, String str3, Continuation<? super SkillResponse> continuation);

    Object useSkill(String str, String str2, Continuation<? super SkillResponse> continuation);

    Object verifyUsername(String str, Continuation<? super VerifyUsernameResponse> continuation);
}
