package com.habitrpg.android.habitica.data;

import com.habitrpg.android.habitica.models.Achievement;
import com.habitrpg.android.habitica.models.ContentResult;
import com.habitrpg.android.habitica.models.LeaveChallengeBody;
import com.habitrpg.android.habitica.models.Tag;
import com.habitrpg.android.habitica.models.TeamPlan;
import com.habitrpg.android.habitica.models.WorldState;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.invitations.InviteResponse;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.responses.BulkTaskScoringData;
import com.habitrpg.android.habitica.models.responses.BuyResponse;
import com.habitrpg.android.habitica.models.responses.PostChatMessageResult;
import com.habitrpg.android.habitica.models.responses.SkillResponse;
import com.habitrpg.android.habitica.models.responses.UnlockResponse;
import com.habitrpg.android.habitica.models.shops.Shop;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.models.social.FindUsernameResult;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.social.InboxConversation;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.tasks.TaskList;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.common.habitica.api.HostConfig;
import com.habitrpg.common.habitica.models.PurchaseValidationRequest;
import com.habitrpg.common.habitica.models.PurchaseValidationResult;
import com.habitrpg.common.habitica.models.auth.UserAuthResponse;
import com.habitrpg.shared.habitica.models.responses.ErrorResponse;
import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import com.habitrpg.shared.habitica.models.responses.Status;
import com.habitrpg.shared.habitica.models.responses.TaskDirectionData;
import com.habitrpg.shared.habitica.models.responses.VerifyUsernameResponse;
import dc.w;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import retrofit2.HttpException;

/* compiled from: ApiClient.kt */
/* loaded from: classes4.dex */
public interface ApiClient {

    /* compiled from: ApiClient.kt */
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getContent$default(ApiClient apiClient, String str, Continuation continuation, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = null;
                }
                return apiClient.getContent(str, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContent");
        }

        public static /* synthetic */ Object retrieveUser$default(ApiClient apiClient, boolean z10, Continuation continuation, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                return apiClient.retrieveUser(z10, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveUser");
        }
    }

    Object abortQuest(String str, Continuation<? super Quest> continuation);

    Object acceptQuest(String str, Continuation<? super Void> continuation);

    Object addPushDevice(Map<String, String> map, Continuation<? super List<Void>> continuation);

    Object allocatePoint(String str, Continuation<? super Stats> continuation);

    Object assignToTask(String str, List<String> list, Continuation<? super Task> continuation);

    Object blockMember(String str, Continuation<? super List<String>> continuation);

    Object bulkAllocatePoints(int i10, int i11, int i12, int i13, Continuation<? super Stats> continuation);

    Object bulkScoreTasks(List<? extends Map<String, String>> list, Continuation<? super BulkTaskScoringData> continuation);

    Object buyItem(String str, int i10, Continuation<? super BuyResponse> continuation);

    Object cancelQuest(String str, Continuation<? super Void> continuation);

    Object cancelSubscription(Continuation<? super Void> continuation);

    Object changeClass(String str, Continuation<? super User> continuation);

    Object changeCustomDayStart(Map<String, ? extends Object> map, Continuation<? super User> continuation);

    Object connectSocial(String str, String str2, String str3, Continuation<? super UserAuthResponse> continuation);

    Object connectUser(String str, String str2, Continuation<? super UserAuthResponse> continuation);

    Object createChallenge(Challenge challenge, Continuation<? super Challenge> continuation);

    Object createChallengeTask(String str, Task task, Continuation<? super Task> continuation);

    Object createChallengeTasks(String str, List<? extends Task> list, Continuation<? super List<? extends Task>> continuation);

    Object createGroup(Group group, Continuation<? super Group> continuation);

    Object createGroupTask(String str, Task task, Continuation<? super Task> continuation);

    Object createTag(Tag tag, Continuation<? super Tag> continuation);

    Object createTask(Task task, Continuation<? super Task> continuation);

    Object createTasks(List<? extends Task> list, Continuation<? super List<? extends Task>> continuation);

    Object debugAddTenGems(Continuation<? super Void> continuation);

    Object deleteAccount(String str, Continuation<? super Void> continuation);

    Object deleteChallenge(String str, Continuation<? super Void> continuation);

    Object deleteInboxMessage(String str, Continuation<? super Void> continuation);

    Object deleteMessage(String str, String str2, Continuation<? super Void> continuation);

    Object deletePushDevice(String str, Continuation<? super List<Void>> continuation);

    Object deleteTag(String str, Continuation<? super Void> continuation);

    Object deleteTask(String str, Continuation<? super Void> continuation);

    Object disableClasses(Continuation<? super User> continuation);

    Object disconnectSocial(String str, Continuation<? super Void> continuation);

    Object equipItem(String str, String str2, Continuation<? super Items> continuation);

    Object feedPet(String str, String str2, Continuation<? super FeedResponse> continuation);

    Object findUsernames(String str, String str2, String str3, Continuation<? super List<FindUsernameResult>> continuation);

    Object flagInboxMessage(String str, Map<String, String> map, Continuation<? super Void> continuation);

    Object flagMessage(String str, String str2, Map<String, String> map, Continuation<? super Void> continuation);

    Object forceStartQuest(String str, Group group, Continuation<? super Quest> continuation);

    Object getChallenge(String str, Continuation<? super Challenge> continuation);

    Object getChallengeTasks(String str, Continuation<? super TaskList> continuation);

    Object getContent(String str, Continuation<? super ContentResult> continuation);

    ErrorResponse getErrorResponse(HttpException httpException);

    Object getGroup(String str, Continuation<? super Group> continuation);

    Object getGroupInvites(String str, Boolean bool, Continuation<? super List<? extends Member>> continuation);

    Object getGroupMembers(String str, Boolean bool, String str2, Continuation<? super List<? extends Member>> continuation);

    Object getGroupMembers(String str, Boolean bool, Continuation<? super List<? extends Member>> continuation);

    Object getHallMember(String str, Continuation<? super Member> continuation);

    HostConfig getHostConfig();

    String getLanguageCode();

    Object getMember(String str, Continuation<? super Member> continuation);

    Object getMemberAchievements(String str, Continuation<? super List<? extends Achievement>> continuation);

    Object getMemberWithUsername(String str, Continuation<? super Member> continuation);

    Object getNews(Continuation<? super List<? extends Object>> continuation);

    Object getStatus(Continuation<? super Status> continuation);

    Object getTask(String str, Continuation<? super Task> continuation);

    Object getTasks(String str, String str2, Continuation<? super TaskList> continuation);

    Object getTasks(String str, Continuation<? super TaskList> continuation);

    Object getTasks(Continuation<? super TaskList> continuation);

    Object getTeamPlanTasks(String str, Continuation<? super TaskList> continuation);

    Object getTeamPlans(Continuation<? super List<? extends TeamPlan>> continuation);

    Object getUserChallenges(int i10, boolean z10, Continuation<? super List<? extends Challenge>> continuation);

    Object getWorldState(Continuation<? super WorldState> continuation);

    boolean hasAuthenticationKeys();

    Object hatchPet(String str, String str2, Continuation<? super Items> continuation);

    Object inviteToGroup(String str, Map<String, ? extends Object> map, Continuation<? super List<InviteResponse>> continuation);

    Object inviteToQuest(String str, String str2, Continuation<? super Quest> continuation);

    Object joinChallenge(String str, Continuation<? super Challenge> continuation);

    Object joinGroup(String str, Continuation<? super Group> continuation);

    Object leaveChallenge(String str, LeaveChallengeBody leaveChallengeBody, Continuation<? super Void> continuation);

    Object leaveGroup(String str, String str2, Continuation<? super Void> continuation);

    Object leaveQuest(String str, Continuation<? super Void> continuation);

    Object likeMessage(String str, String str2, Continuation<? super ChatMessage> continuation);

    Object listGroupChat(String str, Continuation<? super List<? extends ChatMessage>> continuation);

    Object listGroups(String str, Continuation<? super List<? extends Group>> continuation);

    Object loginApple(String str, Continuation<? super UserAuthResponse> continuation);

    Object markPrivateMessagesRead(Continuation<? super w> continuation);

    Object markTaskNeedsWork(String str, String str2, Continuation<? super Task> continuation);

    Object openMysteryItem(Continuation<? super Equipment> continuation);

    Object postGroupChat(String str, Map<String, String> map, Continuation<? super PostChatMessageResult> continuation);

    Object postPrivateMessage(Map<String, String> map, Continuation<? super PostChatMessageResult> continuation);

    Object postTaskDirection(String str, String str2, Continuation<? super TaskDirectionData> continuation);

    Object postTaskNewPosition(String str, int i10, Continuation<? super List<String>> continuation);

    Object purchaseHourglassItem(String str, String str2, Continuation<? super Void> continuation);

    Object purchaseItem(String str, String str2, int i10, Continuation<? super Void> continuation);

    Object purchaseMysterySet(String str, Continuation<? super Void> continuation);

    Object purchaseQuest(String str, Continuation<? super Void> continuation);

    Object purchaseSpecialSpell(String str, Continuation<? super Void> continuation);

    Object readNotification(String str, Continuation<? super List<? extends Object>> continuation);

    Object readNotifications(Map<String, ? extends List<String>> map, Continuation<? super List<? extends Object>> continuation);

    Object registerUser(String str, String str2, String str3, String str4, Continuation<? super UserAuthResponse> continuation);

    Object registrationLanguage(String str, Continuation<? super User> continuation);

    Object rejectGroupInvite(String str, Continuation<? super Void> continuation);

    Object rejectQuest(String str, Continuation<? super Void> continuation);

    Object removeMemberFromGroup(String str, String str2, Continuation<? super Void> continuation);

    Object reportMember(String str, Map<String, String> map, Continuation<? super Void> continuation);

    Object reroll(Continuation<? super User> continuation);

    Object resetAccount(Continuation<? super Void> continuation);

    Object retrieveInAppRewards(Continuation<? super List<? extends ShopItem>> continuation);

    Object retrieveInboxConversations(Continuation<? super List<? extends InboxConversation>> continuation);

    Object retrieveInboxMessages(String str, int i10, Continuation<? super List<? extends ChatMessage>> continuation);

    Object retrieveMarketGear(Continuation<? super Shop> continuation);

    Object retrievePartySeekingUsers(int i10, Continuation<? super List<? extends Member>> continuation);

    Object retrieveShopIventory(String str, Continuation<? super Shop> continuation);

    Object retrieveUser(boolean z10, Continuation<? super User> continuation);

    Object revive(Continuation<? super Items> continuation);

    Object runCron(Continuation<? super Void> continuation);

    Object scoreChecklistItem(String str, String str2, Continuation<? super Task> continuation);

    Object seeNotifications(Map<String, ? extends List<String>> map, Continuation<? super List<? extends Object>> continuation);

    Object seenMessages(String str, Continuation<? super Void> continuation);

    Object sellItem(String str, String str2, Continuation<? super User> continuation);

    Object sendPasswordResetEmail(String str, Continuation<? super Void> continuation);

    void setLanguageCode(String str);

    Object sleep(Continuation<? super Boolean> continuation);

    Object togglePinnedItem(String str, String str2, Continuation<? super Void> continuation);

    Object transferGems(String str, int i10, Continuation<? super Void> continuation);

    Object unassignFromTask(String str, String str2, Continuation<? super Task> continuation);

    Object unlinkAllTasks(String str, String str2, Continuation<? super Void> continuation);

    Object unlockPath(String str, Continuation<? super UnlockResponse> continuation);

    void updateAuthenticationCredentials(String str, String str2);

    Object updateChallenge(Challenge challenge, Continuation<? super Challenge> continuation);

    Object updateEmail(String str, String str2, Continuation<? super Void> continuation);

    Object updateGroup(String str, Group group, Continuation<? super Group> continuation);

    Object updateLoginName(String str, String str2, Continuation<? super Void> continuation);

    Object updateMember(String str, Map<String, ? extends Map<String, Boolean>> map, Continuation<? super Member> continuation);

    Object updatePassword(String str, String str2, String str3, Continuation<? super Void> continuation);

    void updateServerUrl(String str);

    Object updateTag(String str, Tag tag, Continuation<? super Tag> continuation);

    Object updateTask(String str, Task task, Continuation<? super Task> continuation);

    Object updateUser(Map<String, ? extends Object> map, Continuation<? super User> continuation);

    Object updateUsername(String str, Continuation<? super Void> continuation);

    Object useSkill(String str, String str2, String str3, Continuation<? super SkillResponse> continuation);

    Object useSkill(String str, String str2, Continuation<? super SkillResponse> continuation);

    Object validateNoRenewSubscription(PurchaseValidationRequest purchaseValidationRequest, Continuation<Object> continuation);

    Object validatePurchase(PurchaseValidationRequest purchaseValidationRequest, Continuation<? super PurchaseValidationResult> continuation);

    Object validateSubscription(PurchaseValidationRequest purchaseValidationRequest, Continuation<Object> continuation);

    Object verifyUsername(String str, Continuation<? super VerifyUsernameResponse> continuation);
}
