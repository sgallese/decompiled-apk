package com.habitrpg.android.habitica.api;

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
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.common.habitica.models.HabitResponse;
import com.habitrpg.common.habitica.models.PurchaseValidationRequest;
import com.habitrpg.common.habitica.models.PurchaseValidationResult;
import com.habitrpg.common.habitica.models.auth.UserAuth;
import com.habitrpg.common.habitica.models.auth.UserAuthResponse;
import com.habitrpg.common.habitica.models.auth.UserAuthSocial;
import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import com.habitrpg.shared.habitica.models.responses.Status;
import com.habitrpg.shared.habitica.models.responses.TaskDirectionData;
import com.habitrpg.shared.habitica.models.responses.VerifyUsernameResponse;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: ApiService.kt */
/* loaded from: classes4.dex */
public interface ApiService {
    @POST("groups/{gid}/quests/abort")
    Object abortQuest(@Path("gid") String str, Continuation<HabitResponse<Quest>> continuation);

    @POST("groups/{gid}/quests/accept")
    Object acceptQuest(@Path("gid") String str, Continuation<HabitResponse<Void>> continuation);

    @POST("user/push-devices")
    Object addPushDevice(@Body Map<String, String> map, Continuation<HabitResponse<List<Void>>> continuation);

    @POST("user/allocate")
    Object allocatePoint(@Query("stat") String str, Continuation<HabitResponse<Stats>> continuation);

    @POST("tasks/{taskID}/assign")
    Object assignToTask(@Path("taskID") String str, @Body List<String> list, Continuation<HabitResponse<Task>> continuation);

    @POST("user/block/{userID}")
    Object blockMember(@Path("userID") String str, Continuation<HabitResponse<List<String>>> continuation);

    @POST("user/allocate-bulk")
    Object bulkAllocatePoints(@Body Map<String, Map<String, Integer>> map, Continuation<HabitResponse<Stats>> continuation);

    @POST("tasks/bulk-score")
    Object bulkScoreTasks(@Body List<Map<String, String>> list, Continuation<HabitResponse<BulkTaskScoringData>> continuation);

    @POST("user/buy/{key}")
    Object buyItem(@Path("key") String str, @Body Map<String, Integer> map, Continuation<HabitResponse<BuyResponse>> continuation);

    @POST("groups/{gid}/quests/cancel")
    Object cancelQuest(@Path("gid") String str, Continuation<HabitResponse<Void>> continuation);

    @GET("/iap/android/subscribe/cancel")
    Object cancelSubscription(Continuation<HabitResponse<Void>> continuation);

    @POST("user/change-class")
    Object changeClass(@Query("class") String str, Continuation<HabitResponse<User>> continuation);

    @POST("user/change-class")
    Object changeClass(Continuation<HabitResponse<User>> continuation);

    @POST("user/custom-day-start")
    Object changeCustomDayStart(@Body Map<String, Object> map, Continuation<HabitResponse<User>> continuation);

    @POST("user/auth/local/login")
    Object connectLocal(@Body UserAuth userAuth, Continuation<HabitResponse<UserAuthResponse>> continuation);

    @POST("user/auth/social")
    Object connectSocial(@Body UserAuthSocial userAuthSocial, Continuation<HabitResponse<UserAuthResponse>> continuation);

    @POST(NavigationDrawerFragment.SIDEBAR_CHALLENGES)
    Object createChallenge(@Body Challenge challenge, Continuation<HabitResponse<Challenge>> continuation);

    @POST("tasks/challenge/{challengeId}")
    Object createChallengeTask(@Path("challengeId") String str, @Body Task task, Continuation<HabitResponse<Task>> continuation);

    @POST("tasks/challenge/{challengeId}")
    Object createChallengeTasks(@Path("challengeId") String str, @Body List<Task> list, Continuation<HabitResponse<List<Task>>> continuation);

    @POST("groups")
    Object createGroup(@Body Group group, Continuation<HabitResponse<Group>> continuation);

    @POST("tasks/group/{groupId}")
    Object createGroupTask(@Path("groupId") String str, @Body Task task, Continuation<HabitResponse<Task>> continuation);

    @POST("tags")
    Object createTag(@Body Tag tag, Continuation<HabitResponse<Tag>> continuation);

    @POST("tasks/user")
    Object createTask(@Body Task task, Continuation<HabitResponse<Task>> continuation);

    @POST("tasks/user")
    Object createTasks(@Body List<Task> list, Continuation<HabitResponse<List<Task>>> continuation);

    @POST("debug/add-ten-gems")
    Object debugAddTenGems(Continuation<HabitResponse<Void>> continuation);

    @HTTP(hasBody = true, method = "DELETE", path = "user")
    Object deleteAccount(@Body Map<String, String> map, Continuation<HabitResponse<Void>> continuation);

    @DELETE("challenges/{challengeId}")
    Object deleteChallenge(@Path("challengeId") String str, Continuation<HabitResponse<Void>> continuation);

    @DELETE("inbox/messages/{messageId}")
    Object deleteInboxMessage(@Path("messageId") String str, Continuation<HabitResponse<Void>> continuation);

    @DELETE("groups/{gid}/chat/{messageId}")
    Object deleteMessage(@Path("gid") String str, @Path("messageId") String str2, Continuation<HabitResponse<Void>> continuation);

    @DELETE("user/push-devices/{regId}")
    Object deletePushDevice(@Path("regId") String str, Continuation<HabitResponse<List<Void>>> continuation);

    @DELETE("tags/{id}")
    Object deleteTag(@Path("id") String str, Continuation<HabitResponse<Void>> continuation);

    @DELETE("tasks/{id}")
    Object deleteTask(@Path("id") String str, Continuation<HabitResponse<Void>> continuation);

    @POST("user/disable-classes")
    Object disableClasses(Continuation<HabitResponse<User>> continuation);

    @DELETE("user/auth/social/{network}")
    Object disconnectSocial(@Path("network") String str, Continuation<HabitResponse<Void>> continuation);

    @POST("user/equip/{type}/{key}")
    Object equipItem(@Path("type") String str, @Path("key") String str2, Continuation<HabitResponse<Items>> continuation);

    @POST("user/feed/{pet}/{food}")
    Object feedPet(@Path("pet") String str, @Path("food") String str2, Continuation<HabitResponse<FeedResponse>> continuation);

    @GET("members/find/{username}")
    Object findUsernames(@Path("username") String str, @Query("context") String str2, @Query("id") String str3, Continuation<HabitResponse<List<FindUsernameResult>>> continuation);

    @POST("members/flag-private-message/{mid}")
    Object flagInboxMessage(@Path("mid") String str, @Body Map<String, String> map, Continuation<HabitResponse<Void>> continuation);

    @POST("groups/{gid}/chat/{mid}/flag")
    Object flagMessage(@Path("gid") String str, @Path("mid") String str2, @Body Map<String, String> map, Continuation<HabitResponse<Void>> continuation);

    @POST("groups/{gid}/quests/force-start")
    Object forceStartQuest(@Path("gid") String str, @Body Group group, Continuation<HabitResponse<Quest>> continuation);

    @GET("challenges/{challengeId}")
    Object getChallenge(@Path("challengeId") String str, Continuation<HabitResponse<Challenge>> continuation);

    @GET("tasks/challenge/{challengeId}")
    Object getChallengeTasks(@Path("challengeId") String str, Continuation<HabitResponse<TaskList>> continuation);

    @GET("content")
    Object getContent(@Query("language") String str, Continuation<HabitResponse<ContentResult>> continuation);

    @GET("groups/{gid}")
    Object getGroup(@Path("gid") String str, Continuation<HabitResponse<Group>> continuation);

    @GET("groups/{gid}/invites")
    Object getGroupInvites(@Path("gid") String str, @Query("includeAllPublicFields") Boolean bool, Continuation<HabitResponse<List<Member>>> continuation);

    @GET("groups/{gid}/members")
    Object getGroupMembers(@Path("gid") String str, @Query("includeAllPublicFields") Boolean bool, @Query("lastId") String str2, Continuation<HabitResponse<List<Member>>> continuation);

    @GET("groups/{gid}/members")
    Object getGroupMembers(@Path("gid") String str, @Query("includeAllPublicFields") Boolean bool, Continuation<HabitResponse<List<Member>>> continuation);

    @GET("hall/heroes/{memberID}")
    Object getHallMember(@Path("memberID") String str, Continuation<HabitResponse<Member>> continuation);

    @GET("inbox/conversations")
    Object getInboxConversations(Continuation<HabitResponse<List<InboxConversation>>> continuation);

    @GET("inbox/messages")
    Object getInboxMessages(@Query("conversation") String str, @Query("page") int i10, Continuation<HabitResponse<List<ChatMessage>>> continuation);

    @GET("members/{mid}")
    Object getMember(@Path("mid") String str, Continuation<HabitResponse<Member>> continuation);

    @GET("members/{mid}/achievements")
    Object getMemberAchievements(@Path("mid") String str, @Query("lang") String str2, Continuation<HabitResponse<List<Achievement>>> continuation);

    @GET("members/username/{username}")
    Object getMemberWithUsername(@Path("username") String str, Continuation<HabitResponse<Member>> continuation);

    @GET(NavigationDrawerFragment.SIDEBAR_NEWS)
    Object getNews(Continuation<HabitResponse<List<Object>>> continuation);

    @GET("status")
    Object getStatus(Continuation<HabitResponse<Status>> continuation);

    @GET("tasks/{id}")
    Object getTask(@Path("id") String str, Continuation<HabitResponse<Task>> continuation);

    @GET("tasks/user")
    Object getTasks(@Query("type") String str, @Query("dueDate") String str2, Continuation<HabitResponse<TaskList>> continuation);

    @GET("tasks/user")
    Object getTasks(@Query("type") String str, Continuation<HabitResponse<TaskList>> continuation);

    @GET("tasks/user")
    Object getTasks(Continuation<HabitResponse<TaskList>> continuation);

    @GET("tasks/group/{groupID}")
    Object getTeamPlanTasks(@Path("groupID") String str, Continuation<HabitResponse<TaskList>> continuation);

    @GET("group-plans")
    Object getTeamPlans(Continuation<HabitResponse<List<TeamPlan>>> continuation);

    @GET("user/")
    Object getUser(Continuation<HabitResponse<User>> continuation);

    @GET("challenges/user")
    Object getUserChallenges(@Query("page") Integer num, Continuation<HabitResponse<List<Challenge>>> continuation);

    @GET("challenges/user")
    Object getUserChallenges(@Query("page") Integer num, @Query("member") boolean z10, Continuation<HabitResponse<List<Challenge>>> continuation);

    @POST("user/hatch/{egg}/{hatchingPotion}")
    Object hatchPet(@Path("egg") String str, @Path("hatchingPotion") String str2, Continuation<HabitResponse<Items>> continuation);

    @POST("groups/{gid}/invite")
    Object inviteToGroup(@Path("gid") String str, @Body Map<String, Object> map, Continuation<HabitResponse<List<InviteResponse>>> continuation);

    @POST("groups/{gid}/quests/invite/{questKey}")
    Object inviteToQuest(@Path("gid") String str, @Path("questKey") String str2, Continuation<HabitResponse<Quest>> continuation);

    @POST("challenges/{challengeId}/join")
    Object joinChallenge(@Path("challengeId") String str, Continuation<HabitResponse<Challenge>> continuation);

    @POST("groups/{gid}/join")
    Object joinGroup(@Path("gid") String str, Continuation<HabitResponse<Group>> continuation);

    @POST("challenges/{challengeId}/leave")
    Object leaveChallenge(@Path("challengeId") String str, @Body LeaveChallengeBody leaveChallengeBody, Continuation<HabitResponse<Void>> continuation);

    @POST("groups/{gid}/leave")
    Object leaveGroup(@Path("gid") String str, @Query("keepChallenges") String str2, Continuation<HabitResponse<Void>> continuation);

    @POST("groups/{gid}/quests/leave")
    Object leaveQuest(@Path("gid") String str, Continuation<HabitResponse<Void>> continuation);

    @POST("groups/{gid}/chat/{mid}/like")
    Object likeMessage(@Path("gid") String str, @Path("mid") String str2, Continuation<HabitResponse<ChatMessage>> continuation);

    @GET("groups/{gid}/chat")
    Object listGroupChat(@Path("gid") String str, Continuation<HabitResponse<List<ChatMessage>>> continuation);

    @GET("groups")
    Object listGroups(@Query("type") String str, Continuation<HabitResponse<List<Group>>> continuation);

    @POST("user/auth/apple")
    Object loginApple(@Body Map<String, Object> map, Continuation<HabitResponse<UserAuthResponse>> continuation);

    @POST("user/mark-pms-read")
    Object markPrivateMessagesRead(Continuation<Void> continuation);

    @POST("tasks/{taskID}/needs-work/{userID}")
    Object markTaskNeedsWork(@Path("taskID") String str, @Path("userID") String str2, Continuation<HabitResponse<Task>> continuation);

    @POST("user/open-mystery-item")
    Object openMysteryItem(Continuation<HabitResponse<Equipment>> continuation);

    @POST("groups/{gid}/chat")
    Object postGroupChat(@Path("gid") String str, @Body Map<String, String> map, Continuation<HabitResponse<PostChatMessageResult>> continuation);

    @POST("members/send-private-message")
    Object postPrivateMessage(@Body Map<String, String> map, Continuation<HabitResponse<PostChatMessageResult>> continuation);

    @POST("tasks/{id}/score/{direction}")
    Object postTaskDirection(@Path("id") String str, @Path("direction") String str2, Continuation<HabitResponse<TaskDirectionData>> continuation);

    @POST("tasks/{id}/move/to/{position}")
    Object postTaskNewPosition(@Path("id") String str, @Path("position") int i10, Continuation<HabitResponse<List<String>>> continuation);

    @POST("user/purchase-hourglass/{type}/{key}")
    Object purchaseHourglassItem(@Path("type") String str, @Path("key") String str2, Continuation<HabitResponse<Void>> continuation);

    @POST("user/purchase/{type}/{key}")
    Object purchaseItem(@Path("type") String str, @Path("key") String str2, @Body Map<String, Integer> map, Continuation<HabitResponse<Void>> continuation);

    @POST("user/buy-mystery-set/{key}")
    Object purchaseMysterySet(@Path("key") String str, Continuation<HabitResponse<Void>> continuation);

    @POST("user/buy-quest/{key}")
    Object purchaseQuest(@Path("key") String str, Continuation<HabitResponse<Void>> continuation);

    @POST("user/buy-special-spell/{key}")
    Object purchaseSpecialSpell(@Path("key") String str, Continuation<HabitResponse<Void>> continuation);

    @POST("notifications/{notificationId}/read")
    Object readNotification(@Path("notificationId") String str, Continuation<HabitResponse<List<Object>>> continuation);

    @POST("notifications/read")
    Object readNotifications(@Body Map<String, List<String>> map, Continuation<HabitResponse<List<Object>>> continuation);

    @POST("user/auth/local/register")
    Object registerUser(@Body UserAuth userAuth, Continuation<HabitResponse<UserAuthResponse>> continuation);

    @PUT("user/")
    Object registrationLanguage(@Header("Accept-Language") String str, Continuation<HabitResponse<User>> continuation);

    @POST("groups/{gid}/reject-invite")
    Object rejectGroupInvite(@Path("gid") String str, Continuation<HabitResponse<Void>> continuation);

    @POST("groups/{gid}/quests/reject")
    Object rejectQuest(@Path("gid") String str, Continuation<HabitResponse<Void>> continuation);

    @POST("groups/{groupID}/removeMember/{userID}")
    Object removeMemberFromGroup(@Path("groupID") String str, @Path("userID") String str2, Continuation<HabitResponse<Void>> continuation);

    @POST("members/{mid}/flag")
    Object reportMember(@Path("mid") String str, @Body Map<String, String> map, Continuation<HabitResponse<Void>> continuation);

    @POST("user/reroll")
    Object reroll(Continuation<HabitResponse<User>> continuation);

    @POST("user/reset")
    Object resetAccount(Continuation<HabitResponse<Void>> continuation);

    @GET("user/in-app-rewards")
    Object retrieveInAppRewards(Continuation<HabitResponse<List<ShopItem>>> continuation);

    @GET("shops/market-gear")
    Object retrieveMarketGear(@Query("lang") String str, Continuation<HabitResponse<Shop>> continuation);

    @GET("looking-for-party")
    Object retrievePartySeekingUsers(@Query("page") int i10, Continuation<HabitResponse<List<Member>>> continuation);

    @GET("shops/{identifier}")
    Object retrieveShopInventory(@Path("identifier") String str, @Query("lang") String str2, Continuation<HabitResponse<Shop>> continuation);

    @POST("user/revive")
    Object revive(Continuation<HabitResponse<Items>> continuation);

    @POST("cron")
    Object runCron(Continuation<HabitResponse<Void>> continuation);

    @POST("tasks/{taskId}/checklist/{itemId}/score")
    Object scoreChecklistItem(@Path("taskId") String str, @Path("itemId") String str2, Continuation<HabitResponse<Task>> continuation);

    @POST("notifications/see")
    Object seeNotifications(@Body Map<String, List<String>> map, Continuation<HabitResponse<List<Object>>> continuation);

    @POST("groups/{gid}/chat/seen")
    Object seenMessages(@Path("gid") String str, Continuation<HabitResponse<Void>> continuation);

    @POST("user/sell/{type}/{key}")
    Object sellItem(@Path("type") String str, @Path("key") String str2, Continuation<HabitResponse<User>> continuation);

    @POST("user/reset-password")
    Object sendPasswordResetEmail(@Body Map<String, String> map, Continuation<HabitResponse<Void>> continuation);

    @POST("user/sleep")
    Object sleep(Continuation<HabitResponse<Boolean>> continuation);

    @GET("user/toggle-pinned-item/{pinType}/{path}")
    Object togglePinnedItem(@Path("pinType") String str, @Path("path") String str2, Continuation<HabitResponse<Void>> continuation);

    @POST("members/transfer-gems")
    Object transferGems(@Body Map<String, Object> map, Continuation<HabitResponse<Void>> continuation);

    @POST("tasks/{taskID}/unassign/{userID}")
    Object unassignFromTask(@Path("taskID") String str, @Path("userID") String str2, Continuation<HabitResponse<Task>> continuation);

    @POST("tasks/unlink-all/{challengeID}")
    Object unlinkAllTasks(@Path("challengeID") String str, @Query("keep") String str2, Continuation<HabitResponse<Void>> continuation);

    @POST("user/unlock")
    Object unlockPath(@Query("path") String str, Continuation<HabitResponse<UnlockResponse>> continuation);

    @PUT("challenges/{challengeId}")
    Object updateChallenge(@Path("challengeId") String str, @Body Challenge challenge, Continuation<HabitResponse<Challenge>> continuation);

    @PUT("user/auth/update-email")
    Object updateEmail(@Body Map<String, String> map, Continuation<HabitResponse<Void>> continuation);

    @PUT("groups/{id}")
    Object updateGroup(@Path("id") String str, @Body Group group, Continuation<HabitResponse<Group>> continuation);

    @PUT("user/auth/update-username")
    Object updateLoginName(@Body Map<String, String> map, Continuation<HabitResponse<Void>> continuation);

    @PUT("user/auth/update-password")
    Object updatePassword(@Body Map<String, String> map, Continuation<HabitResponse<Void>> continuation);

    @PUT("tags/{id}")
    Object updateTag(@Path("id") String str, @Body Tag tag, Continuation<HabitResponse<Tag>> continuation);

    @PUT("tasks/{id}")
    Object updateTask(@Path("id") String str, @Body Task task, Continuation<HabitResponse<Task>> continuation);

    @PUT("hall/heroes/{memberID}")
    Object updateUser(@Path("memberID") String str, @Body Map<String, Map<String, Boolean>> map, Continuation<HabitResponse<Member>> continuation);

    @PUT("user/")
    Object updateUser(@Body Map<String, Object> map, Continuation<HabitResponse<User>> continuation);

    @POST("user/class/cast/{skill}")
    Object useSkill(@Path("skill") String str, @Query("targetType") String str2, @Query("targetId") String str3, Continuation<HabitResponse<SkillResponse>> continuation);

    @POST("user/class/cast/{skill}")
    Object useSkill(@Path("skill") String str, @Query("targetType") String str2, Continuation<HabitResponse<SkillResponse>> continuation);

    @POST("/iap/android/norenew-subscribe")
    Object validateNoRenewSubscription(@Body PurchaseValidationRequest purchaseValidationRequest, Continuation<HabitResponse<Void>> continuation);

    @POST("/iap/android/verify")
    Object validatePurchase(@Body PurchaseValidationRequest purchaseValidationRequest, Continuation<HabitResponse<PurchaseValidationResult>> continuation);

    @POST("/iap/android/subscribe")
    Object validateSubscription(@Body PurchaseValidationRequest purchaseValidationRequest, Continuation<HabitResponse<Void>> continuation);

    @POST("user/auth/verify-username")
    Object verifyUsername(@Body Map<String, String> map, Continuation<HabitResponse<VerifyUsernameResponse>> continuation);

    @GET("world-state")
    Object worldState(Continuation<HabitResponse<WorldState>> continuation);
}
