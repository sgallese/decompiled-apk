package io.realm;

import com.habitrpg.android.habitica.models.Achievement;
import com.habitrpg.android.habitica.models.FAQArticle;
import com.habitrpg.android.habitica.models.QuestAchievement;
import com.habitrpg.android.habitica.models.Skill;
import com.habitrpg.android.habitica.models.Tag;
import com.habitrpg.android.habitica.models.TeamPlan;
import com.habitrpg.android.habitica.models.TutorialStep;
import com.habitrpg.android.habitica.models.WorldState;
import com.habitrpg.android.habitica.models.WorldStateEvent;
import com.habitrpg.android.habitica.models.auth.LocalAuthentication;
import com.habitrpg.android.habitica.models.inventory.Customization;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import com.habitrpg.android.habitica.models.inventory.ItemEvent;
import com.habitrpg.android.habitica.models.inventory.Mount;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.inventory.QuestBoss;
import com.habitrpg.android.habitica.models.inventory.QuestBossRage;
import com.habitrpg.android.habitica.models.inventory.QuestCollect;
import com.habitrpg.android.habitica.models.inventory.QuestColors;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.inventory.QuestDropItem;
import com.habitrpg.android.habitica.models.inventory.QuestDrops;
import com.habitrpg.android.habitica.models.inventory.QuestMember;
import com.habitrpg.android.habitica.models.inventory.QuestProgress;
import com.habitrpg.android.habitica.models.inventory.QuestProgressCollect;
import com.habitrpg.android.habitica.models.inventory.QuestRageStrike;
import com.habitrpg.android.habitica.models.inventory.SpecialItem;
import com.habitrpg.android.habitica.models.invitations.GuildInvite;
import com.habitrpg.android.habitica.models.invitations.Invitations;
import com.habitrpg.android.habitica.models.invitations.PartyInvite;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.members.MemberFlags;
import com.habitrpg.android.habitica.models.members.MemberPreferences;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.models.shops.ShopItemUnlockCondition;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.social.ChallengeMembership;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.models.social.ChatMessageLike;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.social.GroupCategory;
import com.habitrpg.android.habitica.models.social.GroupMembership;
import com.habitrpg.android.habitica.models.social.InboxConversation;
import com.habitrpg.android.habitica.models.social.UserParty;
import com.habitrpg.android.habitica.models.social.UserStyles;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Days;
import com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails;
import com.habitrpg.android.habitica.models.tasks.RemindersItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.tasks.TaskGroupPlan;
import com.habitrpg.android.habitica.models.tasks.TaskTag;
import com.habitrpg.android.habitica.models.user.ABTest;
import com.habitrpg.android.habitica.models.user.AdditionalSubscriptionInfo;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.AuthenticationTimestamps;
import com.habitrpg.android.habitica.models.user.Backer;
import com.habitrpg.android.habitica.models.user.Buffs;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.models.user.EmailNotificationsPreference;
import com.habitrpg.android.habitica.models.user.Flags;
import com.habitrpg.android.habitica.models.user.Gear;
import com.habitrpg.android.habitica.models.user.GoogleSubscriptionData;
import com.habitrpg.android.habitica.models.user.Hair;
import com.habitrpg.android.habitica.models.user.Inbox;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Outfit;
import com.habitrpg.android.habitica.models.user.OwnedCustomization;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.OwnedMount;
import com.habitrpg.android.habitica.models.user.OwnedPet;
import com.habitrpg.android.habitica.models.user.Permissions;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.models.user.Purchases;
import com.habitrpg.android.habitica.models.user.PushNotificationsPreference;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;
import com.habitrpg.android.habitica.models.user.SubscriptionPlanConsecutive;
import com.habitrpg.android.habitica.models.user.SuppressedModals;
import com.habitrpg.android.habitica.models.user.Training;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.models.user.UserAchievement;
import com.habitrpg.android.habitica.models.user.UserTaskPreferences;
import com.habitrpg.android.habitica.models.user.auth.SocialAuthentication;
import io.realm.a;
import io.realm.a2;
import io.realm.a3;
import io.realm.a4;
import io.realm.a5;
import io.realm.a6;
import io.realm.a7;
import io.realm.a8;
import io.realm.annotations.RealmModule;
import io.realm.c2;
import io.realm.c3;
import io.realm.c4;
import io.realm.c5;
import io.realm.c6;
import io.realm.c7;
import io.realm.c8;
import io.realm.com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy;
import io.realm.com_habitrpg_android_habitica_models_tasks_DaysRealmProxy;
import io.realm.com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy;
import io.realm.com_habitrpg_android_habitica_models_tasks_TaskRealmProxy;
import io.realm.e2;
import io.realm.e3;
import io.realm.e4;
import io.realm.e5;
import io.realm.e6;
import io.realm.e7;
import io.realm.e8;
import io.realm.g2;
import io.realm.g3;
import io.realm.g4;
import io.realm.g5;
import io.realm.g6;
import io.realm.g7;
import io.realm.i2;
import io.realm.i3;
import io.realm.i4;
import io.realm.i6;
import io.realm.i7;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.o;
import io.realm.k2;
import io.realm.k3;
import io.realm.k4;
import io.realm.k5;
import io.realm.k6;
import io.realm.k7;
import io.realm.m2;
import io.realm.m3;
import io.realm.m4;
import io.realm.m6;
import io.realm.m7;
import io.realm.n5;
import io.realm.o1;
import io.realm.o2;
import io.realm.o3;
import io.realm.o4;
import io.realm.o6;
import io.realm.o7;
import io.realm.q1;
import io.realm.q2;
import io.realm.q3;
import io.realm.q4;
import io.realm.q5;
import io.realm.q6;
import io.realm.q7;
import io.realm.s1;
import io.realm.s2;
import io.realm.s3;
import io.realm.s4;
import io.realm.s5;
import io.realm.s6;
import io.realm.s7;
import io.realm.u1;
import io.realm.u2;
import io.realm.u3;
import io.realm.u4;
import io.realm.u5;
import io.realm.u6;
import io.realm.u7;
import io.realm.w1;
import io.realm.w2;
import io.realm.w3;
import io.realm.w4;
import io.realm.w5;
import io.realm.w6;
import io.realm.w7;
import io.realm.y1;
import io.realm.y2;
import io.realm.y3;
import io.realm.y4;
import io.realm.y5;
import io.realm.y6;
import io.realm.y7;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RealmModule
/* loaded from: classes4.dex */
class DefaultRealmModuleMediator extends io.realm.internal.p {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<Class<? extends a1>> f17225a;

    static {
        HashSet hashSet = new HashSet(89);
        hashSet.add(SocialAuthentication.class);
        hashSet.add(UserTaskPreferences.class);
        hashSet.add(UserAchievement.class);
        hashSet.add(User.class);
        hashSet.add(Training.class);
        hashSet.add(SuppressedModals.class);
        hashSet.add(SubscriptionPlanConsecutive.class);
        hashSet.add(SubscriptionPlan.class);
        hashSet.add(Stats.class);
        hashSet.add(PushNotificationsPreference.class);
        hashSet.add(Purchases.class);
        hashSet.add(Profile.class);
        hashSet.add(Preferences.class);
        hashSet.add(Permissions.class);
        hashSet.add(OwnedPet.class);
        hashSet.add(OwnedMount.class);
        hashSet.add(OwnedItem.class);
        hashSet.add(OwnedCustomization.class);
        hashSet.add(Outfit.class);
        hashSet.add(Items.class);
        hashSet.add(Inbox.class);
        hashSet.add(Hair.class);
        hashSet.add(GoogleSubscriptionData.class);
        hashSet.add(Gear.class);
        hashSet.add(Flags.class);
        hashSet.add(EmailNotificationsPreference.class);
        hashSet.add(ContributorInfo.class);
        hashSet.add(Buffs.class);
        hashSet.add(Backer.class);
        hashSet.add(AuthenticationTimestamps.class);
        hashSet.add(Authentication.class);
        hashSet.add(AdditionalSubscriptionInfo.class);
        hashSet.add(ABTest.class);
        hashSet.add(TaskTag.class);
        hashSet.add(TaskGroupPlan.class);
        hashSet.add(Task.class);
        hashSet.add(RemindersItem.class);
        hashSet.add(GroupAssignedDetails.class);
        hashSet.add(Days.class);
        hashSet.add(ChecklistItem.class);
        hashSet.add(UserStyles.class);
        hashSet.add(UserParty.class);
        hashSet.add(InboxConversation.class);
        hashSet.add(GroupMembership.class);
        hashSet.add(GroupCategory.class);
        hashSet.add(Group.class);
        hashSet.add(ChatMessageLike.class);
        hashSet.add(ChatMessage.class);
        hashSet.add(ChallengeMembership.class);
        hashSet.add(Challenge.class);
        hashSet.add(ShopItemUnlockCondition.class);
        hashSet.add(ShopItem.class);
        hashSet.add(MemberPreferences.class);
        hashSet.add(MemberFlags.class);
        hashSet.add(Member.class);
        hashSet.add(PartyInvite.class);
        hashSet.add(Invitations.class);
        hashSet.add(GuildInvite.class);
        hashSet.add(SpecialItem.class);
        hashSet.add(QuestRageStrike.class);
        hashSet.add(QuestProgressCollect.class);
        hashSet.add(QuestProgress.class);
        hashSet.add(QuestMember.class);
        hashSet.add(QuestDrops.class);
        hashSet.add(QuestDropItem.class);
        hashSet.add(QuestContent.class);
        hashSet.add(QuestColors.class);
        hashSet.add(QuestCollect.class);
        hashSet.add(QuestBossRage.class);
        hashSet.add(QuestBoss.class);
        hashSet.add(Quest.class);
        hashSet.add(Pet.class);
        hashSet.add(Mount.class);
        hashSet.add(ItemEvent.class);
        hashSet.add(HatchingPotion.class);
        hashSet.add(Food.class);
        hashSet.add(Equipment.class);
        hashSet.add(Egg.class);
        hashSet.add(Customization.class);
        hashSet.add(LocalAuthentication.class);
        hashSet.add(WorldStateEvent.class);
        hashSet.add(WorldState.class);
        hashSet.add(TutorialStep.class);
        hashSet.add(TeamPlan.class);
        hashSet.add(Tag.class);
        hashSet.add(Skill.class);
        hashSet.add(QuestAchievement.class);
        hashSet.add(FAQArticle.class);
        hashSet.add(Achievement.class);
        f17225a = Collections.unmodifiableSet(hashSet);
    }

    DefaultRealmModuleMediator() {
    }

    @Override // io.realm.internal.p
    public <E extends a1> E c(o0 o0Var, E e10, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        Class<?> superclass = e10 instanceof io.realm.internal.o ? e10.getClass().getSuperclass() : e10.getClass();
        if (superclass.equals(SocialAuthentication.class)) {
            return (E) superclass.cast(e8.d(o0Var, (e8.a) o0Var.R().e(SocialAuthentication.class), (SocialAuthentication) e10, z10, map, set));
        }
        if (superclass.equals(UserTaskPreferences.class)) {
            return (E) superclass.cast(c8.d(o0Var, (c8.a) o0Var.R().e(UserTaskPreferences.class), (UserTaskPreferences) e10, z10, map, set));
        }
        if (superclass.equals(UserAchievement.class)) {
            return (E) superclass.cast(y7.d(o0Var, (y7.a) o0Var.R().e(UserAchievement.class), (UserAchievement) e10, z10, map, set));
        }
        if (superclass.equals(User.class)) {
            return (E) superclass.cast(a8.d(o0Var, (a8.a) o0Var.R().e(User.class), (User) e10, z10, map, set));
        }
        if (superclass.equals(Training.class)) {
            return (E) superclass.cast(w7.d(o0Var, (w7.a) o0Var.R().e(Training.class), (Training) e10, z10, map, set));
        }
        if (superclass.equals(SuppressedModals.class)) {
            return (E) superclass.cast(u7.d(o0Var, (u7.a) o0Var.R().e(SuppressedModals.class), (SuppressedModals) e10, z10, map, set));
        }
        if (superclass.equals(SubscriptionPlanConsecutive.class)) {
            return (E) superclass.cast(q7.d(o0Var, (q7.a) o0Var.R().e(SubscriptionPlanConsecutive.class), (SubscriptionPlanConsecutive) e10, z10, map, set));
        }
        if (superclass.equals(SubscriptionPlan.class)) {
            return (E) superclass.cast(s7.d(o0Var, (s7.a) o0Var.R().e(SubscriptionPlan.class), (SubscriptionPlan) e10, z10, map, set));
        }
        if (superclass.equals(Stats.class)) {
            return (E) superclass.cast(o7.d(o0Var, (o7.a) o0Var.R().e(Stats.class), (Stats) e10, z10, map, set));
        }
        if (superclass.equals(PushNotificationsPreference.class)) {
            return (E) superclass.cast(m7.d(o0Var, (m7.a) o0Var.R().e(PushNotificationsPreference.class), (PushNotificationsPreference) e10, z10, map, set));
        }
        if (superclass.equals(Purchases.class)) {
            return (E) superclass.cast(k7.d(o0Var, (k7.a) o0Var.R().e(Purchases.class), (Purchases) e10, z10, map, set));
        }
        if (superclass.equals(Profile.class)) {
            return (E) superclass.cast(i7.d(o0Var, (i7.a) o0Var.R().e(Profile.class), (Profile) e10, z10, map, set));
        }
        if (superclass.equals(Preferences.class)) {
            return (E) superclass.cast(g7.d(o0Var, (g7.a) o0Var.R().e(Preferences.class), (Preferences) e10, z10, map, set));
        }
        if (superclass.equals(Permissions.class)) {
            return (E) superclass.cast(e7.d(o0Var, (e7.a) o0Var.R().e(Permissions.class), (Permissions) e10, z10, map, set));
        }
        if (superclass.equals(OwnedPet.class)) {
            return (E) superclass.cast(c7.d(o0Var, (c7.a) o0Var.R().e(OwnedPet.class), (OwnedPet) e10, z10, map, set));
        }
        if (superclass.equals(OwnedMount.class)) {
            return (E) superclass.cast(a7.d(o0Var, (a7.a) o0Var.R().e(OwnedMount.class), (OwnedMount) e10, z10, map, set));
        }
        if (superclass.equals(OwnedItem.class)) {
            return (E) superclass.cast(y6.d(o0Var, (y6.a) o0Var.R().e(OwnedItem.class), (OwnedItem) e10, z10, map, set));
        }
        if (superclass.equals(OwnedCustomization.class)) {
            return (E) superclass.cast(w6.d(o0Var, (w6.a) o0Var.R().e(OwnedCustomization.class), (OwnedCustomization) e10, z10, map, set));
        }
        if (superclass.equals(Outfit.class)) {
            return (E) superclass.cast(u6.d(o0Var, (u6.a) o0Var.R().e(Outfit.class), (Outfit) e10, z10, map, set));
        }
        if (superclass.equals(Items.class)) {
            return (E) superclass.cast(s6.d(o0Var, (s6.a) o0Var.R().e(Items.class), (Items) e10, z10, map, set));
        }
        if (superclass.equals(Inbox.class)) {
            return (E) superclass.cast(q6.d(o0Var, (q6.a) o0Var.R().e(Inbox.class), (Inbox) e10, z10, map, set));
        }
        if (superclass.equals(Hair.class)) {
            return (E) superclass.cast(o6.d(o0Var, (o6.a) o0Var.R().e(Hair.class), (Hair) e10, z10, map, set));
        }
        if (superclass.equals(GoogleSubscriptionData.class)) {
            return (E) superclass.cast(m6.d(o0Var, (m6.a) o0Var.R().e(GoogleSubscriptionData.class), (GoogleSubscriptionData) e10, z10, map, set));
        }
        if (superclass.equals(Gear.class)) {
            return (E) superclass.cast(k6.d(o0Var, (k6.a) o0Var.R().e(Gear.class), (Gear) e10, z10, map, set));
        }
        if (superclass.equals(Flags.class)) {
            return (E) superclass.cast(i6.d(o0Var, (i6.a) o0Var.R().e(Flags.class), (Flags) e10, z10, map, set));
        }
        if (superclass.equals(EmailNotificationsPreference.class)) {
            return (E) superclass.cast(g6.d(o0Var, (g6.a) o0Var.R().e(EmailNotificationsPreference.class), (EmailNotificationsPreference) e10, z10, map, set));
        }
        if (superclass.equals(ContributorInfo.class)) {
            return (E) superclass.cast(e6.d(o0Var, (e6.a) o0Var.R().e(ContributorInfo.class), (ContributorInfo) e10, z10, map, set));
        }
        if (superclass.equals(Buffs.class)) {
            return (E) superclass.cast(c6.d(o0Var, (c6.a) o0Var.R().e(Buffs.class), (Buffs) e10, z10, map, set));
        }
        if (superclass.equals(Backer.class)) {
            return (E) superclass.cast(a6.d(o0Var, (a6.a) o0Var.R().e(Backer.class), (Backer) e10, z10, map, set));
        }
        if (superclass.equals(AuthenticationTimestamps.class)) {
            return (E) superclass.cast(y5.d(o0Var, (y5.a) o0Var.R().e(AuthenticationTimestamps.class), (AuthenticationTimestamps) e10, z10, map, set));
        }
        if (superclass.equals(Authentication.class)) {
            return (E) superclass.cast(w5.d(o0Var, (w5.a) o0Var.R().e(Authentication.class), (Authentication) e10, z10, map, set));
        }
        if (superclass.equals(AdditionalSubscriptionInfo.class)) {
            return (E) superclass.cast(u5.d(o0Var, (u5.a) o0Var.R().e(AdditionalSubscriptionInfo.class), (AdditionalSubscriptionInfo) e10, z10, map, set));
        }
        if (superclass.equals(ABTest.class)) {
            return (E) superclass.cast(s5.d(o0Var, (s5.a) o0Var.R().e(ABTest.class), (ABTest) e10, z10, map, set));
        }
        if (superclass.equals(TaskTag.class)) {
            return (E) superclass.cast(q5.d(o0Var, (q5.a) o0Var.R().e(TaskTag.class), (TaskTag) e10, z10, map, set));
        }
        if (superclass.equals(TaskGroupPlan.class)) {
            return (E) superclass.cast(n5.d(o0Var, (n5.a) o0Var.R().e(TaskGroupPlan.class), (TaskGroupPlan) e10, z10, map, set));
        }
        if (superclass.equals(Task.class)) {
            return (E) superclass.cast(com_habitrpg_android_habitica_models_tasks_TaskRealmProxy.d(o0Var, (com_habitrpg_android_habitica_models_tasks_TaskRealmProxy.a) o0Var.R().e(Task.class), (Task) e10, z10, map, set));
        }
        if (superclass.equals(RemindersItem.class)) {
            return (E) superclass.cast(com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.d(o0Var, (com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.a) o0Var.R().e(RemindersItem.class), (RemindersItem) e10, z10, map, set));
        }
        if (superclass.equals(GroupAssignedDetails.class)) {
            return (E) superclass.cast(k5.d(o0Var, (k5.a) o0Var.R().e(GroupAssignedDetails.class), (GroupAssignedDetails) e10, z10, map, set));
        }
        if (superclass.equals(Days.class)) {
            return (E) superclass.cast(com_habitrpg_android_habitica_models_tasks_DaysRealmProxy.d(o0Var, (com_habitrpg_android_habitica_models_tasks_DaysRealmProxy.a) o0Var.R().e(Days.class), (Days) e10, z10, map, set));
        }
        if (superclass.equals(ChecklistItem.class)) {
            return (E) superclass.cast(com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.d(o0Var, (com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.a) o0Var.R().e(ChecklistItem.class), (ChecklistItem) e10, z10, map, set));
        }
        if (superclass.equals(UserStyles.class)) {
            return (E) superclass.cast(g5.d(o0Var, (g5.a) o0Var.R().e(UserStyles.class), (UserStyles) e10, z10, map, set));
        }
        if (superclass.equals(UserParty.class)) {
            return (E) superclass.cast(e5.d(o0Var, (e5.a) o0Var.R().e(UserParty.class), (UserParty) e10, z10, map, set));
        }
        if (superclass.equals(InboxConversation.class)) {
            return (E) superclass.cast(c5.d(o0Var, (c5.a) o0Var.R().e(InboxConversation.class), (InboxConversation) e10, z10, map, set));
        }
        if (superclass.equals(GroupMembership.class)) {
            return (E) superclass.cast(y4.d(o0Var, (y4.a) o0Var.R().e(GroupMembership.class), (GroupMembership) e10, z10, map, set));
        }
        if (superclass.equals(GroupCategory.class)) {
            return (E) superclass.cast(w4.d(o0Var, (w4.a) o0Var.R().e(GroupCategory.class), (GroupCategory) e10, z10, map, set));
        }
        if (superclass.equals(Group.class)) {
            return (E) superclass.cast(a5.d(o0Var, (a5.a) o0Var.R().e(Group.class), (Group) e10, z10, map, set));
        }
        if (superclass.equals(ChatMessageLike.class)) {
            return (E) superclass.cast(s4.d(o0Var, (s4.a) o0Var.R().e(ChatMessageLike.class), (ChatMessageLike) e10, z10, map, set));
        }
        if (superclass.equals(ChatMessage.class)) {
            return (E) superclass.cast(u4.d(o0Var, (u4.a) o0Var.R().e(ChatMessage.class), (ChatMessage) e10, z10, map, set));
        }
        if (superclass.equals(ChallengeMembership.class)) {
            return (E) superclass.cast(o4.d(o0Var, (o4.a) o0Var.R().e(ChallengeMembership.class), (ChallengeMembership) e10, z10, map, set));
        }
        if (superclass.equals(Challenge.class)) {
            return (E) superclass.cast(q4.d(o0Var, (q4.a) o0Var.R().e(Challenge.class), (Challenge) e10, z10, map, set));
        }
        if (superclass.equals(ShopItemUnlockCondition.class)) {
            return (E) superclass.cast(m4.d(o0Var, (m4.a) o0Var.R().e(ShopItemUnlockCondition.class), (ShopItemUnlockCondition) e10, z10, map, set));
        }
        if (superclass.equals(ShopItem.class)) {
            return (E) superclass.cast(k4.d(o0Var, (k4.a) o0Var.R().e(ShopItem.class), (ShopItem) e10, z10, map, set));
        }
        if (superclass.equals(MemberPreferences.class)) {
            return (E) superclass.cast(g4.d(o0Var, (g4.a) o0Var.R().e(MemberPreferences.class), (MemberPreferences) e10, z10, map, set));
        }
        if (superclass.equals(MemberFlags.class)) {
            return (E) superclass.cast(e4.d(o0Var, (e4.a) o0Var.R().e(MemberFlags.class), (MemberFlags) e10, z10, map, set));
        }
        if (superclass.equals(Member.class)) {
            return (E) superclass.cast(i4.d(o0Var, (i4.a) o0Var.R().e(Member.class), (Member) e10, z10, map, set));
        }
        if (superclass.equals(PartyInvite.class)) {
            return (E) superclass.cast(c4.d(o0Var, (c4.a) o0Var.R().e(PartyInvite.class), (PartyInvite) e10, z10, map, set));
        }
        if (superclass.equals(Invitations.class)) {
            return (E) superclass.cast(a4.d(o0Var, (a4.a) o0Var.R().e(Invitations.class), (Invitations) e10, z10, map, set));
        }
        if (superclass.equals(GuildInvite.class)) {
            return (E) superclass.cast(y3.d(o0Var, (y3.a) o0Var.R().e(GuildInvite.class), (GuildInvite) e10, z10, map, set));
        }
        if (superclass.equals(SpecialItem.class)) {
            return (E) superclass.cast(w3.d(o0Var, (w3.a) o0Var.R().e(SpecialItem.class), (SpecialItem) e10, z10, map, set));
        }
        if (superclass.equals(QuestRageStrike.class)) {
            return (E) superclass.cast(s3.d(o0Var, (s3.a) o0Var.R().e(QuestRageStrike.class), (QuestRageStrike) e10, z10, map, set));
        }
        if (superclass.equals(QuestProgressCollect.class)) {
            return (E) superclass.cast(o3.d(o0Var, (o3.a) o0Var.R().e(QuestProgressCollect.class), (QuestProgressCollect) e10, z10, map, set));
        }
        if (superclass.equals(QuestProgress.class)) {
            return (E) superclass.cast(q3.d(o0Var, (q3.a) o0Var.R().e(QuestProgress.class), (QuestProgress) e10, z10, map, set));
        }
        if (superclass.equals(QuestMember.class)) {
            return (E) superclass.cast(m3.d(o0Var, (m3.a) o0Var.R().e(QuestMember.class), (QuestMember) e10, z10, map, set));
        }
        if (superclass.equals(QuestDrops.class)) {
            return (E) superclass.cast(k3.d(o0Var, (k3.a) o0Var.R().e(QuestDrops.class), (QuestDrops) e10, z10, map, set));
        }
        if (superclass.equals(QuestDropItem.class)) {
            return (E) superclass.cast(i3.d(o0Var, (i3.a) o0Var.R().e(QuestDropItem.class), (QuestDropItem) e10, z10, map, set));
        }
        if (superclass.equals(QuestContent.class)) {
            return (E) superclass.cast(g3.d(o0Var, (g3.a) o0Var.R().e(QuestContent.class), (QuestContent) e10, z10, map, set));
        }
        if (superclass.equals(QuestColors.class)) {
            return (E) superclass.cast(e3.d(o0Var, (e3.a) o0Var.R().e(QuestColors.class), (QuestColors) e10, z10, map, set));
        }
        if (superclass.equals(QuestCollect.class)) {
            return (E) superclass.cast(c3.d(o0Var, (c3.a) o0Var.R().e(QuestCollect.class), (QuestCollect) e10, z10, map, set));
        }
        if (superclass.equals(QuestBossRage.class)) {
            return (E) superclass.cast(y2.d(o0Var, (y2.a) o0Var.R().e(QuestBossRage.class), (QuestBossRage) e10, z10, map, set));
        }
        if (superclass.equals(QuestBoss.class)) {
            return (E) superclass.cast(a3.d(o0Var, (a3.a) o0Var.R().e(QuestBoss.class), (QuestBoss) e10, z10, map, set));
        }
        if (superclass.equals(Quest.class)) {
            return (E) superclass.cast(u3.d(o0Var, (u3.a) o0Var.R().e(Quest.class), (Quest) e10, z10, map, set));
        }
        if (superclass.equals(Pet.class)) {
            return (E) superclass.cast(w2.d(o0Var, (w2.a) o0Var.R().e(Pet.class), (Pet) e10, z10, map, set));
        }
        if (superclass.equals(Mount.class)) {
            return (E) superclass.cast(u2.d(o0Var, (u2.a) o0Var.R().e(Mount.class), (Mount) e10, z10, map, set));
        }
        if (superclass.equals(ItemEvent.class)) {
            return (E) superclass.cast(s2.d(o0Var, (s2.a) o0Var.R().e(ItemEvent.class), (ItemEvent) e10, z10, map, set));
        }
        if (superclass.equals(HatchingPotion.class)) {
            return (E) superclass.cast(q2.d(o0Var, (q2.a) o0Var.R().e(HatchingPotion.class), (HatchingPotion) e10, z10, map, set));
        }
        if (superclass.equals(Food.class)) {
            return (E) superclass.cast(o2.d(o0Var, (o2.a) o0Var.R().e(Food.class), (Food) e10, z10, map, set));
        }
        if (superclass.equals(Equipment.class)) {
            return (E) superclass.cast(m2.d(o0Var, (m2.a) o0Var.R().e(Equipment.class), (Equipment) e10, z10, map, set));
        }
        if (superclass.equals(Egg.class)) {
            return (E) superclass.cast(k2.d(o0Var, (k2.a) o0Var.R().e(Egg.class), (Egg) e10, z10, map, set));
        }
        if (superclass.equals(Customization.class)) {
            return (E) superclass.cast(i2.d(o0Var, (i2.a) o0Var.R().e(Customization.class), (Customization) e10, z10, map, set));
        }
        if (superclass.equals(LocalAuthentication.class)) {
            return (E) superclass.cast(g2.d(o0Var, (g2.a) o0Var.R().e(LocalAuthentication.class), (LocalAuthentication) e10, z10, map, set));
        }
        if (superclass.equals(WorldStateEvent.class)) {
            return (E) superclass.cast(c2.d(o0Var, (c2.a) o0Var.R().e(WorldStateEvent.class), (WorldStateEvent) e10, z10, map, set));
        }
        if (superclass.equals(WorldState.class)) {
            return (E) superclass.cast(e2.d(o0Var, (e2.a) o0Var.R().e(WorldState.class), (WorldState) e10, z10, map, set));
        }
        if (superclass.equals(TutorialStep.class)) {
            return (E) superclass.cast(a2.d(o0Var, (a2.a) o0Var.R().e(TutorialStep.class), (TutorialStep) e10, z10, map, set));
        }
        if (superclass.equals(TeamPlan.class)) {
            return (E) superclass.cast(y1.d(o0Var, (y1.a) o0Var.R().e(TeamPlan.class), (TeamPlan) e10, z10, map, set));
        }
        if (superclass.equals(Tag.class)) {
            return (E) superclass.cast(w1.d(o0Var, (w1.a) o0Var.R().e(Tag.class), (Tag) e10, z10, map, set));
        }
        if (superclass.equals(Skill.class)) {
            return (E) superclass.cast(u1.d(o0Var, (u1.a) o0Var.R().e(Skill.class), (Skill) e10, z10, map, set));
        }
        if (superclass.equals(QuestAchievement.class)) {
            return (E) superclass.cast(s1.d(o0Var, (s1.a) o0Var.R().e(QuestAchievement.class), (QuestAchievement) e10, z10, map, set));
        }
        if (superclass.equals(FAQArticle.class)) {
            return (E) superclass.cast(q1.d(o0Var, (q1.a) o0Var.R().e(FAQArticle.class), (FAQArticle) e10, z10, map, set));
        }
        if (superclass.equals(Achievement.class)) {
            return (E) superclass.cast(o1.d(o0Var, (o1.a) o0Var.R().e(Achievement.class), (Achievement) e10, z10, map, set));
        }
        throw io.realm.internal.p.i(superclass);
    }

    @Override // io.realm.internal.p
    public io.realm.internal.c d(Class<? extends a1> cls, OsSchemaInfo osSchemaInfo) {
        io.realm.internal.p.a(cls);
        if (cls.equals(SocialAuthentication.class)) {
            return e8.e(osSchemaInfo);
        }
        if (cls.equals(UserTaskPreferences.class)) {
            return c8.e(osSchemaInfo);
        }
        if (cls.equals(UserAchievement.class)) {
            return y7.e(osSchemaInfo);
        }
        if (cls.equals(User.class)) {
            return a8.e(osSchemaInfo);
        }
        if (cls.equals(Training.class)) {
            return w7.e(osSchemaInfo);
        }
        if (cls.equals(SuppressedModals.class)) {
            return u7.e(osSchemaInfo);
        }
        if (cls.equals(SubscriptionPlanConsecutive.class)) {
            return q7.e(osSchemaInfo);
        }
        if (cls.equals(SubscriptionPlan.class)) {
            return s7.e(osSchemaInfo);
        }
        if (cls.equals(Stats.class)) {
            return o7.e(osSchemaInfo);
        }
        if (cls.equals(PushNotificationsPreference.class)) {
            return m7.e(osSchemaInfo);
        }
        if (cls.equals(Purchases.class)) {
            return k7.e(osSchemaInfo);
        }
        if (cls.equals(Profile.class)) {
            return i7.e(osSchemaInfo);
        }
        if (cls.equals(Preferences.class)) {
            return g7.e(osSchemaInfo);
        }
        if (cls.equals(Permissions.class)) {
            return e7.e(osSchemaInfo);
        }
        if (cls.equals(OwnedPet.class)) {
            return c7.e(osSchemaInfo);
        }
        if (cls.equals(OwnedMount.class)) {
            return a7.e(osSchemaInfo);
        }
        if (cls.equals(OwnedItem.class)) {
            return y6.e(osSchemaInfo);
        }
        if (cls.equals(OwnedCustomization.class)) {
            return w6.e(osSchemaInfo);
        }
        if (cls.equals(Outfit.class)) {
            return u6.e(osSchemaInfo);
        }
        if (cls.equals(Items.class)) {
            return s6.e(osSchemaInfo);
        }
        if (cls.equals(Inbox.class)) {
            return q6.e(osSchemaInfo);
        }
        if (cls.equals(Hair.class)) {
            return o6.e(osSchemaInfo);
        }
        if (cls.equals(GoogleSubscriptionData.class)) {
            return m6.e(osSchemaInfo);
        }
        if (cls.equals(Gear.class)) {
            return k6.e(osSchemaInfo);
        }
        if (cls.equals(Flags.class)) {
            return i6.e(osSchemaInfo);
        }
        if (cls.equals(EmailNotificationsPreference.class)) {
            return g6.e(osSchemaInfo);
        }
        if (cls.equals(ContributorInfo.class)) {
            return e6.e(osSchemaInfo);
        }
        if (cls.equals(Buffs.class)) {
            return c6.e(osSchemaInfo);
        }
        if (cls.equals(Backer.class)) {
            return a6.e(osSchemaInfo);
        }
        if (cls.equals(AuthenticationTimestamps.class)) {
            return y5.e(osSchemaInfo);
        }
        if (cls.equals(Authentication.class)) {
            return w5.e(osSchemaInfo);
        }
        if (cls.equals(AdditionalSubscriptionInfo.class)) {
            return u5.e(osSchemaInfo);
        }
        if (cls.equals(ABTest.class)) {
            return s5.e(osSchemaInfo);
        }
        if (cls.equals(TaskTag.class)) {
            return q5.e(osSchemaInfo);
        }
        if (cls.equals(TaskGroupPlan.class)) {
            return n5.e(osSchemaInfo);
        }
        if (cls.equals(Task.class)) {
            return com_habitrpg_android_habitica_models_tasks_TaskRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(RemindersItem.class)) {
            return com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(GroupAssignedDetails.class)) {
            return k5.e(osSchemaInfo);
        }
        if (cls.equals(Days.class)) {
            return com_habitrpg_android_habitica_models_tasks_DaysRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(ChecklistItem.class)) {
            return com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(UserStyles.class)) {
            return g5.e(osSchemaInfo);
        }
        if (cls.equals(UserParty.class)) {
            return e5.e(osSchemaInfo);
        }
        if (cls.equals(InboxConversation.class)) {
            return c5.e(osSchemaInfo);
        }
        if (cls.equals(GroupMembership.class)) {
            return y4.e(osSchemaInfo);
        }
        if (cls.equals(GroupCategory.class)) {
            return w4.e(osSchemaInfo);
        }
        if (cls.equals(Group.class)) {
            return a5.e(osSchemaInfo);
        }
        if (cls.equals(ChatMessageLike.class)) {
            return s4.e(osSchemaInfo);
        }
        if (cls.equals(ChatMessage.class)) {
            return u4.e(osSchemaInfo);
        }
        if (cls.equals(ChallengeMembership.class)) {
            return o4.e(osSchemaInfo);
        }
        if (cls.equals(Challenge.class)) {
            return q4.e(osSchemaInfo);
        }
        if (cls.equals(ShopItemUnlockCondition.class)) {
            return m4.e(osSchemaInfo);
        }
        if (cls.equals(ShopItem.class)) {
            return k4.e(osSchemaInfo);
        }
        if (cls.equals(MemberPreferences.class)) {
            return g4.e(osSchemaInfo);
        }
        if (cls.equals(MemberFlags.class)) {
            return e4.e(osSchemaInfo);
        }
        if (cls.equals(Member.class)) {
            return i4.e(osSchemaInfo);
        }
        if (cls.equals(PartyInvite.class)) {
            return c4.e(osSchemaInfo);
        }
        if (cls.equals(Invitations.class)) {
            return a4.e(osSchemaInfo);
        }
        if (cls.equals(GuildInvite.class)) {
            return y3.e(osSchemaInfo);
        }
        if (cls.equals(SpecialItem.class)) {
            return w3.e(osSchemaInfo);
        }
        if (cls.equals(QuestRageStrike.class)) {
            return s3.e(osSchemaInfo);
        }
        if (cls.equals(QuestProgressCollect.class)) {
            return o3.e(osSchemaInfo);
        }
        if (cls.equals(QuestProgress.class)) {
            return q3.e(osSchemaInfo);
        }
        if (cls.equals(QuestMember.class)) {
            return m3.e(osSchemaInfo);
        }
        if (cls.equals(QuestDrops.class)) {
            return k3.e(osSchemaInfo);
        }
        if (cls.equals(QuestDropItem.class)) {
            return i3.e(osSchemaInfo);
        }
        if (cls.equals(QuestContent.class)) {
            return g3.e(osSchemaInfo);
        }
        if (cls.equals(QuestColors.class)) {
            return e3.e(osSchemaInfo);
        }
        if (cls.equals(QuestCollect.class)) {
            return c3.e(osSchemaInfo);
        }
        if (cls.equals(QuestBossRage.class)) {
            return y2.e(osSchemaInfo);
        }
        if (cls.equals(QuestBoss.class)) {
            return a3.e(osSchemaInfo);
        }
        if (cls.equals(Quest.class)) {
            return u3.e(osSchemaInfo);
        }
        if (cls.equals(Pet.class)) {
            return w2.e(osSchemaInfo);
        }
        if (cls.equals(Mount.class)) {
            return u2.e(osSchemaInfo);
        }
        if (cls.equals(ItemEvent.class)) {
            return s2.e(osSchemaInfo);
        }
        if (cls.equals(HatchingPotion.class)) {
            return q2.e(osSchemaInfo);
        }
        if (cls.equals(Food.class)) {
            return o2.e(osSchemaInfo);
        }
        if (cls.equals(Equipment.class)) {
            return m2.e(osSchemaInfo);
        }
        if (cls.equals(Egg.class)) {
            return k2.e(osSchemaInfo);
        }
        if (cls.equals(Customization.class)) {
            return i2.e(osSchemaInfo);
        }
        if (cls.equals(LocalAuthentication.class)) {
            return g2.e(osSchemaInfo);
        }
        if (cls.equals(WorldStateEvent.class)) {
            return c2.e(osSchemaInfo);
        }
        if (cls.equals(WorldState.class)) {
            return e2.e(osSchemaInfo);
        }
        if (cls.equals(TutorialStep.class)) {
            return a2.e(osSchemaInfo);
        }
        if (cls.equals(TeamPlan.class)) {
            return y1.e(osSchemaInfo);
        }
        if (cls.equals(Tag.class)) {
            return w1.e(osSchemaInfo);
        }
        if (cls.equals(Skill.class)) {
            return u1.e(osSchemaInfo);
        }
        if (cls.equals(QuestAchievement.class)) {
            return s1.e(osSchemaInfo);
        }
        if (cls.equals(FAQArticle.class)) {
            return q1.e(osSchemaInfo);
        }
        if (cls.equals(Achievement.class)) {
            return o1.e(osSchemaInfo);
        }
        throw io.realm.internal.p.i(cls);
    }

    @Override // io.realm.internal.p
    public <E extends a1> E e(E e10, int i10, Map<a1, o.a<a1>> map) {
        Class<? super Object> superclass = e10.getClass().getSuperclass();
        if (superclass.equals(SocialAuthentication.class)) {
            return (E) superclass.cast(e8.f((SocialAuthentication) e10, 0, i10, map));
        }
        if (superclass.equals(UserTaskPreferences.class)) {
            return (E) superclass.cast(c8.f((UserTaskPreferences) e10, 0, i10, map));
        }
        if (superclass.equals(UserAchievement.class)) {
            return (E) superclass.cast(y7.f((UserAchievement) e10, 0, i10, map));
        }
        if (superclass.equals(User.class)) {
            return (E) superclass.cast(a8.f((User) e10, 0, i10, map));
        }
        if (superclass.equals(Training.class)) {
            return (E) superclass.cast(w7.f((Training) e10, 0, i10, map));
        }
        if (superclass.equals(SuppressedModals.class)) {
            return (E) superclass.cast(u7.f((SuppressedModals) e10, 0, i10, map));
        }
        if (superclass.equals(SubscriptionPlanConsecutive.class)) {
            return (E) superclass.cast(q7.f((SubscriptionPlanConsecutive) e10, 0, i10, map));
        }
        if (superclass.equals(SubscriptionPlan.class)) {
            return (E) superclass.cast(s7.f((SubscriptionPlan) e10, 0, i10, map));
        }
        if (superclass.equals(Stats.class)) {
            return (E) superclass.cast(o7.f((Stats) e10, 0, i10, map));
        }
        if (superclass.equals(PushNotificationsPreference.class)) {
            return (E) superclass.cast(m7.f((PushNotificationsPreference) e10, 0, i10, map));
        }
        if (superclass.equals(Purchases.class)) {
            return (E) superclass.cast(k7.f((Purchases) e10, 0, i10, map));
        }
        if (superclass.equals(Profile.class)) {
            return (E) superclass.cast(i7.f((Profile) e10, 0, i10, map));
        }
        if (superclass.equals(Preferences.class)) {
            return (E) superclass.cast(g7.f((Preferences) e10, 0, i10, map));
        }
        if (superclass.equals(Permissions.class)) {
            return (E) superclass.cast(e7.f((Permissions) e10, 0, i10, map));
        }
        if (superclass.equals(OwnedPet.class)) {
            return (E) superclass.cast(c7.f((OwnedPet) e10, 0, i10, map));
        }
        if (superclass.equals(OwnedMount.class)) {
            return (E) superclass.cast(a7.f((OwnedMount) e10, 0, i10, map));
        }
        if (superclass.equals(OwnedItem.class)) {
            return (E) superclass.cast(y6.f((OwnedItem) e10, 0, i10, map));
        }
        if (superclass.equals(OwnedCustomization.class)) {
            return (E) superclass.cast(w6.f((OwnedCustomization) e10, 0, i10, map));
        }
        if (superclass.equals(Outfit.class)) {
            return (E) superclass.cast(u6.f((Outfit) e10, 0, i10, map));
        }
        if (superclass.equals(Items.class)) {
            return (E) superclass.cast(s6.f((Items) e10, 0, i10, map));
        }
        if (superclass.equals(Inbox.class)) {
            return (E) superclass.cast(q6.f((Inbox) e10, 0, i10, map));
        }
        if (superclass.equals(Hair.class)) {
            return (E) superclass.cast(o6.f((Hair) e10, 0, i10, map));
        }
        if (superclass.equals(GoogleSubscriptionData.class)) {
            return (E) superclass.cast(m6.f((GoogleSubscriptionData) e10, 0, i10, map));
        }
        if (superclass.equals(Gear.class)) {
            return (E) superclass.cast(k6.f((Gear) e10, 0, i10, map));
        }
        if (superclass.equals(Flags.class)) {
            return (E) superclass.cast(i6.f((Flags) e10, 0, i10, map));
        }
        if (superclass.equals(EmailNotificationsPreference.class)) {
            return (E) superclass.cast(g6.f((EmailNotificationsPreference) e10, 0, i10, map));
        }
        if (superclass.equals(ContributorInfo.class)) {
            return (E) superclass.cast(e6.f((ContributorInfo) e10, 0, i10, map));
        }
        if (superclass.equals(Buffs.class)) {
            return (E) superclass.cast(c6.f((Buffs) e10, 0, i10, map));
        }
        if (superclass.equals(Backer.class)) {
            return (E) superclass.cast(a6.f((Backer) e10, 0, i10, map));
        }
        if (superclass.equals(AuthenticationTimestamps.class)) {
            return (E) superclass.cast(y5.f((AuthenticationTimestamps) e10, 0, i10, map));
        }
        if (superclass.equals(Authentication.class)) {
            return (E) superclass.cast(w5.f((Authentication) e10, 0, i10, map));
        }
        if (superclass.equals(AdditionalSubscriptionInfo.class)) {
            return (E) superclass.cast(u5.f((AdditionalSubscriptionInfo) e10, 0, i10, map));
        }
        if (superclass.equals(ABTest.class)) {
            return (E) superclass.cast(s5.f((ABTest) e10, 0, i10, map));
        }
        if (superclass.equals(TaskTag.class)) {
            return (E) superclass.cast(q5.f((TaskTag) e10, 0, i10, map));
        }
        if (superclass.equals(TaskGroupPlan.class)) {
            return (E) superclass.cast(n5.f((TaskGroupPlan) e10, 0, i10, map));
        }
        if (superclass.equals(Task.class)) {
            return (E) superclass.cast(com_habitrpg_android_habitica_models_tasks_TaskRealmProxy.f((Task) e10, 0, i10, map));
        }
        if (superclass.equals(RemindersItem.class)) {
            return (E) superclass.cast(com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.f((RemindersItem) e10, 0, i10, map));
        }
        if (superclass.equals(GroupAssignedDetails.class)) {
            return (E) superclass.cast(k5.f((GroupAssignedDetails) e10, 0, i10, map));
        }
        if (superclass.equals(Days.class)) {
            return (E) superclass.cast(com_habitrpg_android_habitica_models_tasks_DaysRealmProxy.f((Days) e10, 0, i10, map));
        }
        if (superclass.equals(ChecklistItem.class)) {
            return (E) superclass.cast(com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.f((ChecklistItem) e10, 0, i10, map));
        }
        if (superclass.equals(UserStyles.class)) {
            return (E) superclass.cast(g5.f((UserStyles) e10, 0, i10, map));
        }
        if (superclass.equals(UserParty.class)) {
            return (E) superclass.cast(e5.f((UserParty) e10, 0, i10, map));
        }
        if (superclass.equals(InboxConversation.class)) {
            return (E) superclass.cast(c5.f((InboxConversation) e10, 0, i10, map));
        }
        if (superclass.equals(GroupMembership.class)) {
            return (E) superclass.cast(y4.f((GroupMembership) e10, 0, i10, map));
        }
        if (superclass.equals(GroupCategory.class)) {
            return (E) superclass.cast(w4.f((GroupCategory) e10, 0, i10, map));
        }
        if (superclass.equals(Group.class)) {
            return (E) superclass.cast(a5.f((Group) e10, 0, i10, map));
        }
        if (superclass.equals(ChatMessageLike.class)) {
            return (E) superclass.cast(s4.f((ChatMessageLike) e10, 0, i10, map));
        }
        if (superclass.equals(ChatMessage.class)) {
            return (E) superclass.cast(u4.f((ChatMessage) e10, 0, i10, map));
        }
        if (superclass.equals(ChallengeMembership.class)) {
            return (E) superclass.cast(o4.f((ChallengeMembership) e10, 0, i10, map));
        }
        if (superclass.equals(Challenge.class)) {
            return (E) superclass.cast(q4.f((Challenge) e10, 0, i10, map));
        }
        if (superclass.equals(ShopItemUnlockCondition.class)) {
            return (E) superclass.cast(m4.f((ShopItemUnlockCondition) e10, 0, i10, map));
        }
        if (superclass.equals(ShopItem.class)) {
            return (E) superclass.cast(k4.f((ShopItem) e10, 0, i10, map));
        }
        if (superclass.equals(MemberPreferences.class)) {
            return (E) superclass.cast(g4.f((MemberPreferences) e10, 0, i10, map));
        }
        if (superclass.equals(MemberFlags.class)) {
            return (E) superclass.cast(e4.f((MemberFlags) e10, 0, i10, map));
        }
        if (superclass.equals(Member.class)) {
            return (E) superclass.cast(i4.f((Member) e10, 0, i10, map));
        }
        if (superclass.equals(PartyInvite.class)) {
            return (E) superclass.cast(c4.f((PartyInvite) e10, 0, i10, map));
        }
        if (superclass.equals(Invitations.class)) {
            return (E) superclass.cast(a4.f((Invitations) e10, 0, i10, map));
        }
        if (superclass.equals(GuildInvite.class)) {
            return (E) superclass.cast(y3.f((GuildInvite) e10, 0, i10, map));
        }
        if (superclass.equals(SpecialItem.class)) {
            return (E) superclass.cast(w3.f((SpecialItem) e10, 0, i10, map));
        }
        if (superclass.equals(QuestRageStrike.class)) {
            return (E) superclass.cast(s3.f((QuestRageStrike) e10, 0, i10, map));
        }
        if (superclass.equals(QuestProgressCollect.class)) {
            return (E) superclass.cast(o3.f((QuestProgressCollect) e10, 0, i10, map));
        }
        if (superclass.equals(QuestProgress.class)) {
            return (E) superclass.cast(q3.f((QuestProgress) e10, 0, i10, map));
        }
        if (superclass.equals(QuestMember.class)) {
            return (E) superclass.cast(m3.f((QuestMember) e10, 0, i10, map));
        }
        if (superclass.equals(QuestDrops.class)) {
            return (E) superclass.cast(k3.f((QuestDrops) e10, 0, i10, map));
        }
        if (superclass.equals(QuestDropItem.class)) {
            return (E) superclass.cast(i3.f((QuestDropItem) e10, 0, i10, map));
        }
        if (superclass.equals(QuestContent.class)) {
            return (E) superclass.cast(g3.f((QuestContent) e10, 0, i10, map));
        }
        if (superclass.equals(QuestColors.class)) {
            return (E) superclass.cast(e3.f((QuestColors) e10, 0, i10, map));
        }
        if (superclass.equals(QuestCollect.class)) {
            return (E) superclass.cast(c3.f((QuestCollect) e10, 0, i10, map));
        }
        if (superclass.equals(QuestBossRage.class)) {
            return (E) superclass.cast(y2.f((QuestBossRage) e10, 0, i10, map));
        }
        if (superclass.equals(QuestBoss.class)) {
            return (E) superclass.cast(a3.f((QuestBoss) e10, 0, i10, map));
        }
        if (superclass.equals(Quest.class)) {
            return (E) superclass.cast(u3.f((Quest) e10, 0, i10, map));
        }
        if (superclass.equals(Pet.class)) {
            return (E) superclass.cast(w2.f((Pet) e10, 0, i10, map));
        }
        if (superclass.equals(Mount.class)) {
            return (E) superclass.cast(u2.f((Mount) e10, 0, i10, map));
        }
        if (superclass.equals(ItemEvent.class)) {
            return (E) superclass.cast(s2.f((ItemEvent) e10, 0, i10, map));
        }
        if (superclass.equals(HatchingPotion.class)) {
            return (E) superclass.cast(q2.f((HatchingPotion) e10, 0, i10, map));
        }
        if (superclass.equals(Food.class)) {
            return (E) superclass.cast(o2.f((Food) e10, 0, i10, map));
        }
        if (superclass.equals(Equipment.class)) {
            return (E) superclass.cast(m2.f((Equipment) e10, 0, i10, map));
        }
        if (superclass.equals(Egg.class)) {
            return (E) superclass.cast(k2.f((Egg) e10, 0, i10, map));
        }
        if (superclass.equals(Customization.class)) {
            return (E) superclass.cast(i2.f((Customization) e10, 0, i10, map));
        }
        if (superclass.equals(LocalAuthentication.class)) {
            return (E) superclass.cast(g2.f((LocalAuthentication) e10, 0, i10, map));
        }
        if (superclass.equals(WorldStateEvent.class)) {
            return (E) superclass.cast(c2.f((WorldStateEvent) e10, 0, i10, map));
        }
        if (superclass.equals(WorldState.class)) {
            return (E) superclass.cast(e2.f((WorldState) e10, 0, i10, map));
        }
        if (superclass.equals(TutorialStep.class)) {
            return (E) superclass.cast(a2.f((TutorialStep) e10, 0, i10, map));
        }
        if (superclass.equals(TeamPlan.class)) {
            return (E) superclass.cast(y1.f((TeamPlan) e10, 0, i10, map));
        }
        if (superclass.equals(Tag.class)) {
            return (E) superclass.cast(w1.f((Tag) e10, 0, i10, map));
        }
        if (superclass.equals(Skill.class)) {
            return (E) superclass.cast(u1.f((Skill) e10, 0, i10, map));
        }
        if (superclass.equals(QuestAchievement.class)) {
            return (E) superclass.cast(s1.f((QuestAchievement) e10, 0, i10, map));
        }
        if (superclass.equals(FAQArticle.class)) {
            return (E) superclass.cast(q1.f((FAQArticle) e10, 0, i10, map));
        }
        if (superclass.equals(Achievement.class)) {
            return (E) superclass.cast(o1.f((Achievement) e10, 0, i10, map));
        }
        throw io.realm.internal.p.i(superclass);
    }

    @Override // io.realm.internal.p
    public Class<? extends a1> g(String str) {
        io.realm.internal.p.b(str);
        if (str.equals("SocialAuthentication")) {
            return SocialAuthentication.class;
        }
        if (str.equals("UserTaskPreferences")) {
            return UserTaskPreferences.class;
        }
        if (str.equals("UserAchievement")) {
            return UserAchievement.class;
        }
        if (str.equals("User")) {
            return User.class;
        }
        if (str.equals("Training")) {
            return Training.class;
        }
        if (str.equals("SuppressedModals")) {
            return SuppressedModals.class;
        }
        if (str.equals("SubscriptionPlanConsecutive")) {
            return SubscriptionPlanConsecutive.class;
        }
        if (str.equals("SubscriptionPlan")) {
            return SubscriptionPlan.class;
        }
        if (str.equals("Stats")) {
            return Stats.class;
        }
        if (str.equals("PushNotificationsPreference")) {
            return PushNotificationsPreference.class;
        }
        if (str.equals("Purchases")) {
            return Purchases.class;
        }
        if (str.equals("Profile")) {
            return Profile.class;
        }
        if (str.equals("Preferences")) {
            return Preferences.class;
        }
        if (str.equals("Permissions")) {
            return Permissions.class;
        }
        if (str.equals("OwnedPet")) {
            return OwnedPet.class;
        }
        if (str.equals("OwnedMount")) {
            return OwnedMount.class;
        }
        if (str.equals("OwnedItem")) {
            return OwnedItem.class;
        }
        if (str.equals("OwnedCustomization")) {
            return OwnedCustomization.class;
        }
        if (str.equals("Outfit")) {
            return Outfit.class;
        }
        if (str.equals("Items")) {
            return Items.class;
        }
        if (str.equals("Inbox")) {
            return Inbox.class;
        }
        if (str.equals("Hair")) {
            return Hair.class;
        }
        if (str.equals("GoogleSubscriptionData")) {
            return GoogleSubscriptionData.class;
        }
        if (str.equals("Gear")) {
            return Gear.class;
        }
        if (str.equals("Flags")) {
            return Flags.class;
        }
        if (str.equals("EmailNotificationsPreference")) {
            return EmailNotificationsPreference.class;
        }
        if (str.equals("ContributorInfo")) {
            return ContributorInfo.class;
        }
        if (str.equals("Buffs")) {
            return Buffs.class;
        }
        if (str.equals("Backer")) {
            return Backer.class;
        }
        if (str.equals("AuthenticationTimestamps")) {
            return AuthenticationTimestamps.class;
        }
        if (str.equals("Authentication")) {
            return Authentication.class;
        }
        if (str.equals("AdditionalSubscriptionInfo")) {
            return AdditionalSubscriptionInfo.class;
        }
        if (str.equals("ABTest")) {
            return ABTest.class;
        }
        if (str.equals("TaskTag")) {
            return TaskTag.class;
        }
        if (str.equals("TaskGroupPlan")) {
            return TaskGroupPlan.class;
        }
        if (str.equals("Task")) {
            return Task.class;
        }
        if (str.equals("RemindersItem")) {
            return RemindersItem.class;
        }
        if (str.equals("GroupAssignedDetails")) {
            return GroupAssignedDetails.class;
        }
        if (str.equals("Days")) {
            return Days.class;
        }
        if (str.equals("ChecklistItem")) {
            return ChecklistItem.class;
        }
        if (str.equals("UserStyles")) {
            return UserStyles.class;
        }
        if (str.equals("UserParty")) {
            return UserParty.class;
        }
        if (str.equals("InboxConversation")) {
            return InboxConversation.class;
        }
        if (str.equals("GroupMembership")) {
            return GroupMembership.class;
        }
        if (str.equals("GroupCategory")) {
            return GroupCategory.class;
        }
        if (str.equals("Group")) {
            return Group.class;
        }
        if (str.equals("ChatMessageLike")) {
            return ChatMessageLike.class;
        }
        if (str.equals("ChatMessage")) {
            return ChatMessage.class;
        }
        if (str.equals("ChallengeMembership")) {
            return ChallengeMembership.class;
        }
        if (str.equals("Challenge")) {
            return Challenge.class;
        }
        if (str.equals("ShopItemUnlockCondition")) {
            return ShopItemUnlockCondition.class;
        }
        if (str.equals("ShopItem")) {
            return ShopItem.class;
        }
        if (str.equals("MemberPreferences")) {
            return MemberPreferences.class;
        }
        if (str.equals("MemberFlags")) {
            return MemberFlags.class;
        }
        if (str.equals("Member")) {
            return Member.class;
        }
        if (str.equals("PartyInvite")) {
            return PartyInvite.class;
        }
        if (str.equals("Invitations")) {
            return Invitations.class;
        }
        if (str.equals("GuildInvite")) {
            return GuildInvite.class;
        }
        if (str.equals("SpecialItem")) {
            return SpecialItem.class;
        }
        if (str.equals("QuestRageStrike")) {
            return QuestRageStrike.class;
        }
        if (str.equals("QuestProgressCollect")) {
            return QuestProgressCollect.class;
        }
        if (str.equals("QuestProgress")) {
            return QuestProgress.class;
        }
        if (str.equals("QuestMember")) {
            return QuestMember.class;
        }
        if (str.equals("QuestDrops")) {
            return QuestDrops.class;
        }
        if (str.equals("QuestDropItem")) {
            return QuestDropItem.class;
        }
        if (str.equals("QuestContent")) {
            return QuestContent.class;
        }
        if (str.equals("QuestColors")) {
            return QuestColors.class;
        }
        if (str.equals("QuestCollect")) {
            return QuestCollect.class;
        }
        if (str.equals("QuestBossRage")) {
            return QuestBossRage.class;
        }
        if (str.equals("QuestBoss")) {
            return QuestBoss.class;
        }
        if (str.equals("Quest")) {
            return Quest.class;
        }
        if (str.equals("Pet")) {
            return Pet.class;
        }
        if (str.equals("Mount")) {
            return Mount.class;
        }
        if (str.equals("ItemEvent")) {
            return ItemEvent.class;
        }
        if (str.equals("HatchingPotion")) {
            return HatchingPotion.class;
        }
        if (str.equals("Food")) {
            return Food.class;
        }
        if (str.equals("Equipment")) {
            return Equipment.class;
        }
        if (str.equals("Egg")) {
            return Egg.class;
        }
        if (str.equals("Customization")) {
            return Customization.class;
        }
        if (str.equals("LocalAuthentication")) {
            return LocalAuthentication.class;
        }
        if (str.equals("WorldStateEvent")) {
            return WorldStateEvent.class;
        }
        if (str.equals("WorldState")) {
            return WorldState.class;
        }
        if (str.equals("TutorialStep")) {
            return TutorialStep.class;
        }
        if (str.equals("TeamPlan")) {
            return TeamPlan.class;
        }
        if (str.equals("Tag")) {
            return Tag.class;
        }
        if (str.equals("Skill")) {
            return Skill.class;
        }
        if (str.equals("QuestAchievement")) {
            return QuestAchievement.class;
        }
        if (str.equals("FAQArticle")) {
            return FAQArticle.class;
        }
        if (str.equals("Achievement")) {
            return Achievement.class;
        }
        throw io.realm.internal.p.j(str);
    }

    @Override // io.realm.internal.p
    public Map<Class<? extends a1>, OsObjectSchemaInfo> h() {
        HashMap hashMap = new HashMap(89);
        hashMap.put(SocialAuthentication.class, e8.h());
        hashMap.put(UserTaskPreferences.class, c8.h());
        hashMap.put(UserAchievement.class, y7.h());
        hashMap.put(User.class, a8.h());
        hashMap.put(Training.class, w7.h());
        hashMap.put(SuppressedModals.class, u7.h());
        hashMap.put(SubscriptionPlanConsecutive.class, q7.h());
        hashMap.put(SubscriptionPlan.class, s7.h());
        hashMap.put(Stats.class, o7.h());
        hashMap.put(PushNotificationsPreference.class, m7.h());
        hashMap.put(Purchases.class, k7.h());
        hashMap.put(Profile.class, i7.h());
        hashMap.put(Preferences.class, g7.h());
        hashMap.put(Permissions.class, e7.h());
        hashMap.put(OwnedPet.class, c7.h());
        hashMap.put(OwnedMount.class, a7.h());
        hashMap.put(OwnedItem.class, y6.h());
        hashMap.put(OwnedCustomization.class, w6.h());
        hashMap.put(Outfit.class, u6.h());
        hashMap.put(Items.class, s6.h());
        hashMap.put(Inbox.class, q6.h());
        hashMap.put(Hair.class, o6.h());
        hashMap.put(GoogleSubscriptionData.class, m6.h());
        hashMap.put(Gear.class, k6.h());
        hashMap.put(Flags.class, i6.h());
        hashMap.put(EmailNotificationsPreference.class, g6.h());
        hashMap.put(ContributorInfo.class, e6.h());
        hashMap.put(Buffs.class, c6.h());
        hashMap.put(Backer.class, a6.h());
        hashMap.put(AuthenticationTimestamps.class, y5.h());
        hashMap.put(Authentication.class, w5.h());
        hashMap.put(AdditionalSubscriptionInfo.class, u5.h());
        hashMap.put(ABTest.class, s5.h());
        hashMap.put(TaskTag.class, q5.h());
        hashMap.put(TaskGroupPlan.class, n5.h());
        hashMap.put(Task.class, com_habitrpg_android_habitica_models_tasks_TaskRealmProxy.h());
        hashMap.put(RemindersItem.class, com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.h());
        hashMap.put(GroupAssignedDetails.class, k5.h());
        hashMap.put(Days.class, com_habitrpg_android_habitica_models_tasks_DaysRealmProxy.h());
        hashMap.put(ChecklistItem.class, com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.h());
        hashMap.put(UserStyles.class, g5.h());
        hashMap.put(UserParty.class, e5.h());
        hashMap.put(InboxConversation.class, c5.h());
        hashMap.put(GroupMembership.class, y4.h());
        hashMap.put(GroupCategory.class, w4.h());
        hashMap.put(Group.class, a5.h());
        hashMap.put(ChatMessageLike.class, s4.h());
        hashMap.put(ChatMessage.class, u4.h());
        hashMap.put(ChallengeMembership.class, o4.h());
        hashMap.put(Challenge.class, q4.h());
        hashMap.put(ShopItemUnlockCondition.class, m4.h());
        hashMap.put(ShopItem.class, k4.h());
        hashMap.put(MemberPreferences.class, g4.h());
        hashMap.put(MemberFlags.class, e4.h());
        hashMap.put(Member.class, i4.h());
        hashMap.put(PartyInvite.class, c4.h());
        hashMap.put(Invitations.class, a4.h());
        hashMap.put(GuildInvite.class, y3.h());
        hashMap.put(SpecialItem.class, w3.h());
        hashMap.put(QuestRageStrike.class, s3.h());
        hashMap.put(QuestProgressCollect.class, o3.h());
        hashMap.put(QuestProgress.class, q3.h());
        hashMap.put(QuestMember.class, m3.h());
        hashMap.put(QuestDrops.class, k3.h());
        hashMap.put(QuestDropItem.class, i3.h());
        hashMap.put(QuestContent.class, g3.h());
        hashMap.put(QuestColors.class, e3.h());
        hashMap.put(QuestCollect.class, c3.h());
        hashMap.put(QuestBossRage.class, y2.h());
        hashMap.put(QuestBoss.class, a3.h());
        hashMap.put(Quest.class, u3.h());
        hashMap.put(Pet.class, w2.h());
        hashMap.put(Mount.class, u2.h());
        hashMap.put(ItemEvent.class, s2.h());
        hashMap.put(HatchingPotion.class, q2.h());
        hashMap.put(Food.class, o2.h());
        hashMap.put(Equipment.class, m2.h());
        hashMap.put(Egg.class, k2.h());
        hashMap.put(Customization.class, i2.h());
        hashMap.put(LocalAuthentication.class, g2.h());
        hashMap.put(WorldStateEvent.class, c2.h());
        hashMap.put(WorldState.class, e2.h());
        hashMap.put(TutorialStep.class, a2.h());
        hashMap.put(TeamPlan.class, y1.h());
        hashMap.put(Tag.class, w1.h());
        hashMap.put(Skill.class, u1.h());
        hashMap.put(QuestAchievement.class, s1.h());
        hashMap.put(FAQArticle.class, q1.h());
        hashMap.put(Achievement.class, o1.h());
        return hashMap;
    }

    @Override // io.realm.internal.p
    public Set<Class<? extends a1>> k() {
        return f17225a;
    }

    @Override // io.realm.internal.p
    public String n(Class<? extends a1> cls) {
        io.realm.internal.p.a(cls);
        if (cls.equals(SocialAuthentication.class)) {
            return "SocialAuthentication";
        }
        if (cls.equals(UserTaskPreferences.class)) {
            return "UserTaskPreferences";
        }
        if (cls.equals(UserAchievement.class)) {
            return "UserAchievement";
        }
        if (cls.equals(User.class)) {
            return "User";
        }
        if (cls.equals(Training.class)) {
            return "Training";
        }
        if (cls.equals(SuppressedModals.class)) {
            return "SuppressedModals";
        }
        if (cls.equals(SubscriptionPlanConsecutive.class)) {
            return "SubscriptionPlanConsecutive";
        }
        if (cls.equals(SubscriptionPlan.class)) {
            return "SubscriptionPlan";
        }
        if (cls.equals(Stats.class)) {
            return "Stats";
        }
        if (cls.equals(PushNotificationsPreference.class)) {
            return "PushNotificationsPreference";
        }
        if (cls.equals(Purchases.class)) {
            return "Purchases";
        }
        if (cls.equals(Profile.class)) {
            return "Profile";
        }
        if (cls.equals(Preferences.class)) {
            return "Preferences";
        }
        if (cls.equals(Permissions.class)) {
            return "Permissions";
        }
        if (cls.equals(OwnedPet.class)) {
            return "OwnedPet";
        }
        if (cls.equals(OwnedMount.class)) {
            return "OwnedMount";
        }
        if (cls.equals(OwnedItem.class)) {
            return "OwnedItem";
        }
        if (cls.equals(OwnedCustomization.class)) {
            return "OwnedCustomization";
        }
        if (cls.equals(Outfit.class)) {
            return "Outfit";
        }
        if (cls.equals(Items.class)) {
            return "Items";
        }
        if (cls.equals(Inbox.class)) {
            return "Inbox";
        }
        if (cls.equals(Hair.class)) {
            return "Hair";
        }
        if (cls.equals(GoogleSubscriptionData.class)) {
            return "GoogleSubscriptionData";
        }
        if (cls.equals(Gear.class)) {
            return "Gear";
        }
        if (cls.equals(Flags.class)) {
            return "Flags";
        }
        if (cls.equals(EmailNotificationsPreference.class)) {
            return "EmailNotificationsPreference";
        }
        if (cls.equals(ContributorInfo.class)) {
            return "ContributorInfo";
        }
        if (cls.equals(Buffs.class)) {
            return "Buffs";
        }
        if (cls.equals(Backer.class)) {
            return "Backer";
        }
        if (cls.equals(AuthenticationTimestamps.class)) {
            return "AuthenticationTimestamps";
        }
        if (cls.equals(Authentication.class)) {
            return "Authentication";
        }
        if (cls.equals(AdditionalSubscriptionInfo.class)) {
            return "AdditionalSubscriptionInfo";
        }
        if (cls.equals(ABTest.class)) {
            return "ABTest";
        }
        if (cls.equals(TaskTag.class)) {
            return "TaskTag";
        }
        if (cls.equals(TaskGroupPlan.class)) {
            return "TaskGroupPlan";
        }
        if (cls.equals(Task.class)) {
            return "Task";
        }
        if (cls.equals(RemindersItem.class)) {
            return "RemindersItem";
        }
        if (cls.equals(GroupAssignedDetails.class)) {
            return "GroupAssignedDetails";
        }
        if (cls.equals(Days.class)) {
            return "Days";
        }
        if (cls.equals(ChecklistItem.class)) {
            return "ChecklistItem";
        }
        if (cls.equals(UserStyles.class)) {
            return "UserStyles";
        }
        if (cls.equals(UserParty.class)) {
            return "UserParty";
        }
        if (cls.equals(InboxConversation.class)) {
            return "InboxConversation";
        }
        if (cls.equals(GroupMembership.class)) {
            return "GroupMembership";
        }
        if (cls.equals(GroupCategory.class)) {
            return "GroupCategory";
        }
        if (cls.equals(Group.class)) {
            return "Group";
        }
        if (cls.equals(ChatMessageLike.class)) {
            return "ChatMessageLike";
        }
        if (cls.equals(ChatMessage.class)) {
            return "ChatMessage";
        }
        if (cls.equals(ChallengeMembership.class)) {
            return "ChallengeMembership";
        }
        if (cls.equals(Challenge.class)) {
            return "Challenge";
        }
        if (cls.equals(ShopItemUnlockCondition.class)) {
            return "ShopItemUnlockCondition";
        }
        if (cls.equals(ShopItem.class)) {
            return "ShopItem";
        }
        if (cls.equals(MemberPreferences.class)) {
            return "MemberPreferences";
        }
        if (cls.equals(MemberFlags.class)) {
            return "MemberFlags";
        }
        if (cls.equals(Member.class)) {
            return "Member";
        }
        if (cls.equals(PartyInvite.class)) {
            return "PartyInvite";
        }
        if (cls.equals(Invitations.class)) {
            return "Invitations";
        }
        if (cls.equals(GuildInvite.class)) {
            return "GuildInvite";
        }
        if (cls.equals(SpecialItem.class)) {
            return "SpecialItem";
        }
        if (cls.equals(QuestRageStrike.class)) {
            return "QuestRageStrike";
        }
        if (cls.equals(QuestProgressCollect.class)) {
            return "QuestProgressCollect";
        }
        if (cls.equals(QuestProgress.class)) {
            return "QuestProgress";
        }
        if (cls.equals(QuestMember.class)) {
            return "QuestMember";
        }
        if (cls.equals(QuestDrops.class)) {
            return "QuestDrops";
        }
        if (cls.equals(QuestDropItem.class)) {
            return "QuestDropItem";
        }
        if (cls.equals(QuestContent.class)) {
            return "QuestContent";
        }
        if (cls.equals(QuestColors.class)) {
            return "QuestColors";
        }
        if (cls.equals(QuestCollect.class)) {
            return "QuestCollect";
        }
        if (cls.equals(QuestBossRage.class)) {
            return "QuestBossRage";
        }
        if (cls.equals(QuestBoss.class)) {
            return "QuestBoss";
        }
        if (cls.equals(Quest.class)) {
            return "Quest";
        }
        if (cls.equals(Pet.class)) {
            return "Pet";
        }
        if (cls.equals(Mount.class)) {
            return "Mount";
        }
        if (cls.equals(ItemEvent.class)) {
            return "ItemEvent";
        }
        if (cls.equals(HatchingPotion.class)) {
            return "HatchingPotion";
        }
        if (cls.equals(Food.class)) {
            return "Food";
        }
        if (cls.equals(Equipment.class)) {
            return "Equipment";
        }
        if (cls.equals(Egg.class)) {
            return "Egg";
        }
        if (cls.equals(Customization.class)) {
            return "Customization";
        }
        if (cls.equals(LocalAuthentication.class)) {
            return "LocalAuthentication";
        }
        if (cls.equals(WorldStateEvent.class)) {
            return "WorldStateEvent";
        }
        if (cls.equals(WorldState.class)) {
            return "WorldState";
        }
        if (cls.equals(TutorialStep.class)) {
            return "TutorialStep";
        }
        if (cls.equals(TeamPlan.class)) {
            return "TeamPlan";
        }
        if (cls.equals(Tag.class)) {
            return "Tag";
        }
        if (cls.equals(Skill.class)) {
            return "Skill";
        }
        if (cls.equals(QuestAchievement.class)) {
            return "QuestAchievement";
        }
        if (cls.equals(FAQArticle.class)) {
            return "FAQArticle";
        }
        if (cls.equals(Achievement.class)) {
            return "Achievement";
        }
        throw io.realm.internal.p.i(cls);
    }

    @Override // io.realm.internal.p
    public boolean p(Class<? extends a1> cls) {
        if (!User.class.isAssignableFrom(cls) && !Task.class.isAssignableFrom(cls) && !RemindersItem.class.isAssignableFrom(cls) && !ChecklistItem.class.isAssignableFrom(cls) && !InboxConversation.class.isAssignableFrom(cls) && !GroupMembership.class.isAssignableFrom(cls) && !GroupCategory.class.isAssignableFrom(cls) && !Group.class.isAssignableFrom(cls) && !ChatMessage.class.isAssignableFrom(cls) && !Challenge.class.isAssignableFrom(cls) && !ShopItem.class.isAssignableFrom(cls) && !Member.class.isAssignableFrom(cls) && !SpecialItem.class.isAssignableFrom(cls) && !QuestRageStrike.class.isAssignableFrom(cls) && !QuestMember.class.isAssignableFrom(cls) && !QuestDrops.class.isAssignableFrom(cls) && !QuestDropItem.class.isAssignableFrom(cls) && !QuestContent.class.isAssignableFrom(cls) && !QuestColors.class.isAssignableFrom(cls) && !QuestCollect.class.isAssignableFrom(cls) && !QuestBossRage.class.isAssignableFrom(cls) && !QuestBoss.class.isAssignableFrom(cls) && !Quest.class.isAssignableFrom(cls) && !Pet.class.isAssignableFrom(cls) && !Mount.class.isAssignableFrom(cls) && !HatchingPotion.class.isAssignableFrom(cls) && !Food.class.isAssignableFrom(cls) && !Equipment.class.isAssignableFrom(cls) && !Egg.class.isAssignableFrom(cls) && !Customization.class.isAssignableFrom(cls) && !WorldState.class.isAssignableFrom(cls) && !TeamPlan.class.isAssignableFrom(cls) && !Tag.class.isAssignableFrom(cls) && !Skill.class.isAssignableFrom(cls) && !QuestAchievement.class.isAssignableFrom(cls) && !FAQArticle.class.isAssignableFrom(cls) && !Achievement.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    @Override // io.realm.internal.p
    public long q(o0 o0Var, a1 a1Var, Map<a1, Long> map) {
        Class<?> cls;
        if (a1Var instanceof io.realm.internal.o) {
            cls = a1Var.getClass().getSuperclass();
        } else {
            cls = a1Var.getClass();
        }
        if (!cls.equals(SocialAuthentication.class)) {
            if (!cls.equals(UserTaskPreferences.class)) {
                if (!cls.equals(UserAchievement.class)) {
                    if (cls.equals(User.class)) {
                        return a8.i(o0Var, (User) a1Var, map);
                    }
                    if (!cls.equals(Training.class)) {
                        if (!cls.equals(SuppressedModals.class)) {
                            if (!cls.equals(SubscriptionPlanConsecutive.class)) {
                                if (!cls.equals(SubscriptionPlan.class)) {
                                    if (!cls.equals(Stats.class)) {
                                        if (!cls.equals(PushNotificationsPreference.class)) {
                                            if (!cls.equals(Purchases.class)) {
                                                if (!cls.equals(Profile.class)) {
                                                    if (!cls.equals(Preferences.class)) {
                                                        if (cls.equals(Permissions.class)) {
                                                            return e7.i(o0Var, (Permissions) a1Var, map);
                                                        }
                                                        if (!cls.equals(OwnedPet.class)) {
                                                            if (!cls.equals(OwnedMount.class)) {
                                                                if (!cls.equals(OwnedItem.class)) {
                                                                    if (!cls.equals(OwnedCustomization.class)) {
                                                                        if (!cls.equals(Outfit.class)) {
                                                                            if (!cls.equals(Items.class)) {
                                                                                if (!cls.equals(Inbox.class)) {
                                                                                    if (!cls.equals(Hair.class)) {
                                                                                        if (!cls.equals(GoogleSubscriptionData.class)) {
                                                                                            if (!cls.equals(Gear.class)) {
                                                                                                if (!cls.equals(Flags.class)) {
                                                                                                    if (!cls.equals(EmailNotificationsPreference.class)) {
                                                                                                        if (!cls.equals(ContributorInfo.class)) {
                                                                                                            if (!cls.equals(Buffs.class)) {
                                                                                                                if (!cls.equals(Backer.class)) {
                                                                                                                    if (!cls.equals(AuthenticationTimestamps.class)) {
                                                                                                                        if (!cls.equals(Authentication.class)) {
                                                                                                                            if (!cls.equals(AdditionalSubscriptionInfo.class)) {
                                                                                                                                if (!cls.equals(ABTest.class)) {
                                                                                                                                    if (!cls.equals(TaskTag.class)) {
                                                                                                                                        if (!cls.equals(TaskGroupPlan.class)) {
                                                                                                                                            if (cls.equals(Task.class)) {
                                                                                                                                                return com_habitrpg_android_habitica_models_tasks_TaskRealmProxy.i(o0Var, (Task) a1Var, map);
                                                                                                                                            }
                                                                                                                                            if (cls.equals(RemindersItem.class)) {
                                                                                                                                                return com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.i(o0Var, (RemindersItem) a1Var, map);
                                                                                                                                            }
                                                                                                                                            if (!cls.equals(GroupAssignedDetails.class)) {
                                                                                                                                                if (!cls.equals(Days.class)) {
                                                                                                                                                    if (cls.equals(ChecklistItem.class)) {
                                                                                                                                                        return com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.i(o0Var, (ChecklistItem) a1Var, map);
                                                                                                                                                    }
                                                                                                                                                    if (!cls.equals(UserStyles.class)) {
                                                                                                                                                        if (!cls.equals(UserParty.class)) {
                                                                                                                                                            if (cls.equals(InboxConversation.class)) {
                                                                                                                                                                return c5.i(o0Var, (InboxConversation) a1Var, map);
                                                                                                                                                            }
                                                                                                                                                            if (cls.equals(GroupMembership.class)) {
                                                                                                                                                                return y4.i(o0Var, (GroupMembership) a1Var, map);
                                                                                                                                                            }
                                                                                                                                                            if (cls.equals(GroupCategory.class)) {
                                                                                                                                                                return w4.i(o0Var, (GroupCategory) a1Var, map);
                                                                                                                                                            }
                                                                                                                                                            if (cls.equals(Group.class)) {
                                                                                                                                                                return a5.i(o0Var, (Group) a1Var, map);
                                                                                                                                                            }
                                                                                                                                                            if (!cls.equals(ChatMessageLike.class)) {
                                                                                                                                                                if (cls.equals(ChatMessage.class)) {
                                                                                                                                                                    return u4.i(o0Var, (ChatMessage) a1Var, map);
                                                                                                                                                                }
                                                                                                                                                                if (!cls.equals(ChallengeMembership.class)) {
                                                                                                                                                                    if (cls.equals(Challenge.class)) {
                                                                                                                                                                        return q4.i(o0Var, (Challenge) a1Var, map);
                                                                                                                                                                    }
                                                                                                                                                                    if (!cls.equals(ShopItemUnlockCondition.class)) {
                                                                                                                                                                        if (cls.equals(ShopItem.class)) {
                                                                                                                                                                            return k4.i(o0Var, (ShopItem) a1Var, map);
                                                                                                                                                                        }
                                                                                                                                                                        if (!cls.equals(MemberPreferences.class)) {
                                                                                                                                                                            if (!cls.equals(MemberFlags.class)) {
                                                                                                                                                                                if (cls.equals(Member.class)) {
                                                                                                                                                                                    return i4.i(o0Var, (Member) a1Var, map);
                                                                                                                                                                                }
                                                                                                                                                                                if (!cls.equals(PartyInvite.class)) {
                                                                                                                                                                                    if (!cls.equals(Invitations.class)) {
                                                                                                                                                                                        if (!cls.equals(GuildInvite.class)) {
                                                                                                                                                                                            if (cls.equals(SpecialItem.class)) {
                                                                                                                                                                                                return w3.i(o0Var, (SpecialItem) a1Var, map);
                                                                                                                                                                                            }
                                                                                                                                                                                            if (cls.equals(QuestRageStrike.class)) {
                                                                                                                                                                                                return s3.i(o0Var, (QuestRageStrike) a1Var, map);
                                                                                                                                                                                            }
                                                                                                                                                                                            if (!cls.equals(QuestProgressCollect.class)) {
                                                                                                                                                                                                if (!cls.equals(QuestProgress.class)) {
                                                                                                                                                                                                    if (cls.equals(QuestMember.class)) {
                                                                                                                                                                                                        return m3.i(o0Var, (QuestMember) a1Var, map);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (cls.equals(QuestDrops.class)) {
                                                                                                                                                                                                        return k3.i(o0Var, (QuestDrops) a1Var, map);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (cls.equals(QuestDropItem.class)) {
                                                                                                                                                                                                        return i3.i(o0Var, (QuestDropItem) a1Var, map);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (cls.equals(QuestContent.class)) {
                                                                                                                                                                                                        return g3.i(o0Var, (QuestContent) a1Var, map);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (cls.equals(QuestColors.class)) {
                                                                                                                                                                                                        return e3.i(o0Var, (QuestColors) a1Var, map);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (cls.equals(QuestCollect.class)) {
                                                                                                                                                                                                        return c3.i(o0Var, (QuestCollect) a1Var, map);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (cls.equals(QuestBossRage.class)) {
                                                                                                                                                                                                        return y2.i(o0Var, (QuestBossRage) a1Var, map);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (cls.equals(QuestBoss.class)) {
                                                                                                                                                                                                        return a3.i(o0Var, (QuestBoss) a1Var, map);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (cls.equals(Quest.class)) {
                                                                                                                                                                                                        return u3.i(o0Var, (Quest) a1Var, map);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (cls.equals(Pet.class)) {
                                                                                                                                                                                                        return w2.i(o0Var, (Pet) a1Var, map);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (cls.equals(Mount.class)) {
                                                                                                                                                                                                        return u2.i(o0Var, (Mount) a1Var, map);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (cls.equals(ItemEvent.class)) {
                                                                                                                                                                                                        return s2.i(o0Var, (ItemEvent) a1Var, map);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (cls.equals(HatchingPotion.class)) {
                                                                                                                                                                                                        return q2.i(o0Var, (HatchingPotion) a1Var, map);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (cls.equals(Food.class)) {
                                                                                                                                                                                                        return o2.i(o0Var, (Food) a1Var, map);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (cls.equals(Equipment.class)) {
                                                                                                                                                                                                        return m2.i(o0Var, (Equipment) a1Var, map);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (cls.equals(Egg.class)) {
                                                                                                                                                                                                        return k2.i(o0Var, (Egg) a1Var, map);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (cls.equals(Customization.class)) {
                                                                                                                                                                                                        return i2.i(o0Var, (Customization) a1Var, map);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (!cls.equals(LocalAuthentication.class)) {
                                                                                                                                                                                                        if (!cls.equals(WorldStateEvent.class)) {
                                                                                                                                                                                                            if (cls.equals(WorldState.class)) {
                                                                                                                                                                                                                return e2.i(o0Var, (WorldState) a1Var, map);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (!cls.equals(TutorialStep.class)) {
                                                                                                                                                                                                                if (cls.equals(TeamPlan.class)) {
                                                                                                                                                                                                                    return y1.i(o0Var, (TeamPlan) a1Var, map);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (cls.equals(Tag.class)) {
                                                                                                                                                                                                                    return w1.i(o0Var, (Tag) a1Var, map);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (cls.equals(Skill.class)) {
                                                                                                                                                                                                                    return u1.i(o0Var, (Skill) a1Var, map);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (cls.equals(QuestAchievement.class)) {
                                                                                                                                                                                                                    return s1.i(o0Var, (QuestAchievement) a1Var, map);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (cls.equals(FAQArticle.class)) {
                                                                                                                                                                                                                    return q1.i(o0Var, (FAQArticle) a1Var, map);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (cls.equals(Achievement.class)) {
                                                                                                                                                                                                                    return o1.i(o0Var, (Achievement) a1Var, map);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                throw io.realm.internal.p.i(cls);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                                        }
                                                                                                                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                                    }
                                                                                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                                }
                                                                                                                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                            }
                                                                                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                        }
                                                                                                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                    }
                                                                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                }
                                                                                                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                            }
                                                                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                        }
                                                                                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                    }
                                                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                }
                                                                                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                            }
                                                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                        }
                                                                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                    }
                                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                }
                                                                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                            }
                                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                        }
                                                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                    }
                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                }
                                                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                            }
                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                        }
                                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                    }
                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                }
                                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                            }
                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                        }
                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                    }
                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                }
                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                            }
                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                        }
                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                    }
                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                }
                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                            }
                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                        }
                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                    }
                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                }
                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                            }
                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                        }
                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                    }
                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                }
                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                            }
                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                        }
                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                    }
                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                }
                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                            }
                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                        }
                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                    }
                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                }
                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
            }
            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
        }
        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
    }

    @Override // io.realm.internal.p
    public void r(o0 o0Var, Collection<? extends a1> collection) {
        Class<?> cls;
        Iterator<? extends a1> it = collection.iterator();
        HashMap hashMap = new HashMap(collection.size());
        if (it.hasNext()) {
            a1 next = it.next();
            if (next instanceof io.realm.internal.o) {
                cls = next.getClass().getSuperclass();
            } else {
                cls = next.getClass();
            }
            if (!cls.equals(SocialAuthentication.class)) {
                if (!cls.equals(UserTaskPreferences.class)) {
                    if (!cls.equals(UserAchievement.class)) {
                        Object obj = Inbox.class;
                        Object obj2 = Items.class;
                        Object obj3 = Outfit.class;
                        Object obj4 = OwnedCustomization.class;
                        Object obj5 = OwnedItem.class;
                        Object obj6 = OwnedMount.class;
                        if (cls.equals(User.class)) {
                            a8.i(o0Var, (User) next, hashMap);
                        } else if (!cls.equals(Training.class)) {
                            if (!cls.equals(SuppressedModals.class)) {
                                if (!cls.equals(SubscriptionPlanConsecutive.class)) {
                                    if (!cls.equals(SubscriptionPlan.class)) {
                                        if (!cls.equals(Stats.class)) {
                                            if (!cls.equals(PushNotificationsPreference.class)) {
                                                if (!cls.equals(Purchases.class)) {
                                                    if (!cls.equals(Profile.class)) {
                                                        if (!cls.equals(Preferences.class)) {
                                                            if (cls.equals(Permissions.class)) {
                                                                e7.i(o0Var, (Permissions) next, hashMap);
                                                            } else if (!cls.equals(OwnedPet.class)) {
                                                                if (!cls.equals(obj6)) {
                                                                    obj6 = obj6;
                                                                    if (!cls.equals(obj5)) {
                                                                        obj5 = obj5;
                                                                        if (!cls.equals(obj4)) {
                                                                            obj4 = obj4;
                                                                            if (!cls.equals(obj3)) {
                                                                                obj3 = obj3;
                                                                                if (!cls.equals(obj2)) {
                                                                                    obj2 = obj2;
                                                                                    if (!cls.equals(obj)) {
                                                                                        obj = obj;
                                                                                        if (!cls.equals(Hair.class)) {
                                                                                            if (!cls.equals(GoogleSubscriptionData.class)) {
                                                                                                if (!cls.equals(Gear.class)) {
                                                                                                    if (!cls.equals(Flags.class)) {
                                                                                                        if (!cls.equals(EmailNotificationsPreference.class)) {
                                                                                                            if (!cls.equals(ContributorInfo.class)) {
                                                                                                                if (!cls.equals(Buffs.class)) {
                                                                                                                    if (!cls.equals(Backer.class)) {
                                                                                                                        if (!cls.equals(AuthenticationTimestamps.class)) {
                                                                                                                            if (!cls.equals(Authentication.class)) {
                                                                                                                                if (!cls.equals(AdditionalSubscriptionInfo.class)) {
                                                                                                                                    if (!cls.equals(ABTest.class)) {
                                                                                                                                        if (!cls.equals(TaskTag.class)) {
                                                                                                                                            if (!cls.equals(TaskGroupPlan.class)) {
                                                                                                                                                if (cls.equals(Task.class)) {
                                                                                                                                                    com_habitrpg_android_habitica_models_tasks_TaskRealmProxy.i(o0Var, (Task) next, hashMap);
                                                                                                                                                } else if (cls.equals(RemindersItem.class)) {
                                                                                                                                                    com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.i(o0Var, (RemindersItem) next, hashMap);
                                                                                                                                                } else if (!cls.equals(GroupAssignedDetails.class)) {
                                                                                                                                                    if (!cls.equals(Days.class)) {
                                                                                                                                                        if (cls.equals(ChecklistItem.class)) {
                                                                                                                                                            com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.i(o0Var, (ChecklistItem) next, hashMap);
                                                                                                                                                        } else if (!cls.equals(UserStyles.class)) {
                                                                                                                                                            if (!cls.equals(UserParty.class)) {
                                                                                                                                                                if (cls.equals(InboxConversation.class)) {
                                                                                                                                                                    c5.i(o0Var, (InboxConversation) next, hashMap);
                                                                                                                                                                } else if (cls.equals(GroupMembership.class)) {
                                                                                                                                                                    y4.i(o0Var, (GroupMembership) next, hashMap);
                                                                                                                                                                } else if (cls.equals(GroupCategory.class)) {
                                                                                                                                                                    w4.i(o0Var, (GroupCategory) next, hashMap);
                                                                                                                                                                } else if (cls.equals(Group.class)) {
                                                                                                                                                                    a5.i(o0Var, (Group) next, hashMap);
                                                                                                                                                                } else if (!cls.equals(ChatMessageLike.class)) {
                                                                                                                                                                    if (cls.equals(ChatMessage.class)) {
                                                                                                                                                                        u4.i(o0Var, (ChatMessage) next, hashMap);
                                                                                                                                                                    } else if (!cls.equals(ChallengeMembership.class)) {
                                                                                                                                                                        if (cls.equals(Challenge.class)) {
                                                                                                                                                                            q4.i(o0Var, (Challenge) next, hashMap);
                                                                                                                                                                        } else if (!cls.equals(ShopItemUnlockCondition.class)) {
                                                                                                                                                                            if (cls.equals(ShopItem.class)) {
                                                                                                                                                                                k4.i(o0Var, (ShopItem) next, hashMap);
                                                                                                                                                                            } else if (!cls.equals(MemberPreferences.class)) {
                                                                                                                                                                                if (!cls.equals(MemberFlags.class)) {
                                                                                                                                                                                    if (cls.equals(Member.class)) {
                                                                                                                                                                                        i4.i(o0Var, (Member) next, hashMap);
                                                                                                                                                                                    } else if (!cls.equals(PartyInvite.class)) {
                                                                                                                                                                                        if (!cls.equals(Invitations.class)) {
                                                                                                                                                                                            if (!cls.equals(GuildInvite.class)) {
                                                                                                                                                                                                if (cls.equals(SpecialItem.class)) {
                                                                                                                                                                                                    w3.i(o0Var, (SpecialItem) next, hashMap);
                                                                                                                                                                                                } else if (cls.equals(QuestRageStrike.class)) {
                                                                                                                                                                                                    s3.i(o0Var, (QuestRageStrike) next, hashMap);
                                                                                                                                                                                                } else if (!cls.equals(QuestProgressCollect.class)) {
                                                                                                                                                                                                    if (!cls.equals(QuestProgress.class)) {
                                                                                                                                                                                                        if (cls.equals(QuestMember.class)) {
                                                                                                                                                                                                            m3.i(o0Var, (QuestMember) next, hashMap);
                                                                                                                                                                                                        } else if (cls.equals(QuestDrops.class)) {
                                                                                                                                                                                                            k3.i(o0Var, (QuestDrops) next, hashMap);
                                                                                                                                                                                                        } else if (cls.equals(QuestDropItem.class)) {
                                                                                                                                                                                                            i3.i(o0Var, (QuestDropItem) next, hashMap);
                                                                                                                                                                                                        } else if (cls.equals(QuestContent.class)) {
                                                                                                                                                                                                            g3.i(o0Var, (QuestContent) next, hashMap);
                                                                                                                                                                                                        } else if (cls.equals(QuestColors.class)) {
                                                                                                                                                                                                            e3.i(o0Var, (QuestColors) next, hashMap);
                                                                                                                                                                                                        } else if (cls.equals(QuestCollect.class)) {
                                                                                                                                                                                                            c3.i(o0Var, (QuestCollect) next, hashMap);
                                                                                                                                                                                                        } else if (cls.equals(QuestBossRage.class)) {
                                                                                                                                                                                                            y2.i(o0Var, (QuestBossRage) next, hashMap);
                                                                                                                                                                                                        } else if (cls.equals(QuestBoss.class)) {
                                                                                                                                                                                                            a3.i(o0Var, (QuestBoss) next, hashMap);
                                                                                                                                                                                                        } else if (cls.equals(Quest.class)) {
                                                                                                                                                                                                            u3.i(o0Var, (Quest) next, hashMap);
                                                                                                                                                                                                        } else if (cls.equals(Pet.class)) {
                                                                                                                                                                                                            w2.i(o0Var, (Pet) next, hashMap);
                                                                                                                                                                                                        } else if (cls.equals(Mount.class)) {
                                                                                                                                                                                                            u2.i(o0Var, (Mount) next, hashMap);
                                                                                                                                                                                                        } else if (cls.equals(ItemEvent.class)) {
                                                                                                                                                                                                            s2.i(o0Var, (ItemEvent) next, hashMap);
                                                                                                                                                                                                        } else if (cls.equals(HatchingPotion.class)) {
                                                                                                                                                                                                            q2.i(o0Var, (HatchingPotion) next, hashMap);
                                                                                                                                                                                                        } else if (cls.equals(Food.class)) {
                                                                                                                                                                                                            o2.i(o0Var, (Food) next, hashMap);
                                                                                                                                                                                                        } else if (cls.equals(Equipment.class)) {
                                                                                                                                                                                                            m2.i(o0Var, (Equipment) next, hashMap);
                                                                                                                                                                                                        } else if (cls.equals(Egg.class)) {
                                                                                                                                                                                                            k2.i(o0Var, (Egg) next, hashMap);
                                                                                                                                                                                                        } else if (cls.equals(Customization.class)) {
                                                                                                                                                                                                            i2.i(o0Var, (Customization) next, hashMap);
                                                                                                                                                                                                        } else if (!cls.equals(LocalAuthentication.class)) {
                                                                                                                                                                                                            if (!cls.equals(WorldStateEvent.class)) {
                                                                                                                                                                                                                if (cls.equals(WorldState.class)) {
                                                                                                                                                                                                                    e2.i(o0Var, (WorldState) next, hashMap);
                                                                                                                                                                                                                } else if (!cls.equals(TutorialStep.class)) {
                                                                                                                                                                                                                    if (cls.equals(TeamPlan.class)) {
                                                                                                                                                                                                                        y1.i(o0Var, (TeamPlan) next, hashMap);
                                                                                                                                                                                                                    } else if (cls.equals(Tag.class)) {
                                                                                                                                                                                                                        w1.i(o0Var, (Tag) next, hashMap);
                                                                                                                                                                                                                    } else if (cls.equals(Skill.class)) {
                                                                                                                                                                                                                        u1.i(o0Var, (Skill) next, hashMap);
                                                                                                                                                                                                                    } else if (cls.equals(QuestAchievement.class)) {
                                                                                                                                                                                                                        s1.i(o0Var, (QuestAchievement) next, hashMap);
                                                                                                                                                                                                                    } else if (cls.equals(FAQArticle.class)) {
                                                                                                                                                                                                                        q1.i(o0Var, (FAQArticle) next, hashMap);
                                                                                                                                                                                                                    } else if (cls.equals(Achievement.class)) {
                                                                                                                                                                                                                        o1.i(o0Var, (Achievement) next, hashMap);
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        throw io.realm.internal.p.i(cls);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                                    }
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                                }
                                                                                                                                                                                            } else {
                                                                                                                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                            }
                                                                                                                                                                                        } else {
                                                                                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                }
                                                                                                                                                                            } else {
                                                                                                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                            }
                                                                                                                                                                        } else {
                                                                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                }
                                                                                                            } else {
                                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                            }
                                                                                                        } else {
                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                        }
                                                                                                    } else {
                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                    }
                                                                                                } else {
                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                }
                                                                                            } else {
                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                            }
                                                                                        } else {
                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                        }
                                                                                    } else {
                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                    }
                                                                                } else {
                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                }
                                                                            } else {
                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                            }
                                                                        } else {
                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                        }
                                                                    } else {
                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                    }
                                                                } else {
                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                }
                                                            } else {
                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                            }
                                                        } else {
                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                        }
                                                    } else {
                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                    }
                                                } else {
                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                }
                                            } else {
                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                            }
                                        } else {
                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                    }
                                } else {
                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                }
                            } else {
                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                            }
                        } else {
                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                        }
                        if (it.hasNext()) {
                            if (!cls.equals(SocialAuthentication.class)) {
                                if (!cls.equals(UserTaskPreferences.class)) {
                                    if (!cls.equals(UserAchievement.class)) {
                                        if (cls.equals(User.class)) {
                                            a8.k(o0Var, it, hashMap);
                                            return;
                                        } else if (!cls.equals(Training.class)) {
                                            if (!cls.equals(SuppressedModals.class)) {
                                                if (!cls.equals(SubscriptionPlanConsecutive.class)) {
                                                    if (!cls.equals(SubscriptionPlan.class)) {
                                                        if (!cls.equals(Stats.class)) {
                                                            if (!cls.equals(PushNotificationsPreference.class)) {
                                                                if (!cls.equals(Purchases.class)) {
                                                                    if (!cls.equals(Profile.class)) {
                                                                        if (!cls.equals(Preferences.class)) {
                                                                            if (cls.equals(Permissions.class)) {
                                                                                e7.k(o0Var, it, hashMap);
                                                                                return;
                                                                            } else if (!cls.equals(OwnedPet.class)) {
                                                                                if (!cls.equals(obj6)) {
                                                                                    if (!cls.equals(obj5)) {
                                                                                        if (!cls.equals(obj4)) {
                                                                                            if (!cls.equals(obj3)) {
                                                                                                if (!cls.equals(obj2)) {
                                                                                                    if (!cls.equals(obj)) {
                                                                                                        if (!cls.equals(Hair.class)) {
                                                                                                            if (!cls.equals(GoogleSubscriptionData.class)) {
                                                                                                                if (!cls.equals(Gear.class)) {
                                                                                                                    if (!cls.equals(Flags.class)) {
                                                                                                                        if (!cls.equals(EmailNotificationsPreference.class)) {
                                                                                                                            if (!cls.equals(ContributorInfo.class)) {
                                                                                                                                if (!cls.equals(Buffs.class)) {
                                                                                                                                    if (!cls.equals(Backer.class)) {
                                                                                                                                        if (!cls.equals(AuthenticationTimestamps.class)) {
                                                                                                                                            if (!cls.equals(Authentication.class)) {
                                                                                                                                                if (!cls.equals(AdditionalSubscriptionInfo.class)) {
                                                                                                                                                    if (!cls.equals(ABTest.class)) {
                                                                                                                                                        if (!cls.equals(TaskTag.class)) {
                                                                                                                                                            if (!cls.equals(TaskGroupPlan.class)) {
                                                                                                                                                                if (cls.equals(Task.class)) {
                                                                                                                                                                    com_habitrpg_android_habitica_models_tasks_TaskRealmProxy.k(o0Var, it, hashMap);
                                                                                                                                                                    return;
                                                                                                                                                                } else if (cls.equals(RemindersItem.class)) {
                                                                                                                                                                    com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.k(o0Var, it, hashMap);
                                                                                                                                                                    return;
                                                                                                                                                                } else if (!cls.equals(GroupAssignedDetails.class)) {
                                                                                                                                                                    if (!cls.equals(Days.class)) {
                                                                                                                                                                        if (cls.equals(ChecklistItem.class)) {
                                                                                                                                                                            com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.k(o0Var, it, hashMap);
                                                                                                                                                                            return;
                                                                                                                                                                        } else if (!cls.equals(UserStyles.class)) {
                                                                                                                                                                            if (!cls.equals(UserParty.class)) {
                                                                                                                                                                                if (cls.equals(InboxConversation.class)) {
                                                                                                                                                                                    c5.k(o0Var, it, hashMap);
                                                                                                                                                                                    return;
                                                                                                                                                                                } else if (cls.equals(GroupMembership.class)) {
                                                                                                                                                                                    y4.k(o0Var, it, hashMap);
                                                                                                                                                                                    return;
                                                                                                                                                                                } else if (cls.equals(GroupCategory.class)) {
                                                                                                                                                                                    w4.k(o0Var, it, hashMap);
                                                                                                                                                                                    return;
                                                                                                                                                                                } else if (cls.equals(Group.class)) {
                                                                                                                                                                                    a5.k(o0Var, it, hashMap);
                                                                                                                                                                                    return;
                                                                                                                                                                                } else if (!cls.equals(ChatMessageLike.class)) {
                                                                                                                                                                                    if (cls.equals(ChatMessage.class)) {
                                                                                                                                                                                        u4.k(o0Var, it, hashMap);
                                                                                                                                                                                        return;
                                                                                                                                                                                    } else if (!cls.equals(ChallengeMembership.class)) {
                                                                                                                                                                                        if (cls.equals(Challenge.class)) {
                                                                                                                                                                                            q4.k(o0Var, it, hashMap);
                                                                                                                                                                                            return;
                                                                                                                                                                                        } else if (!cls.equals(ShopItemUnlockCondition.class)) {
                                                                                                                                                                                            if (cls.equals(ShopItem.class)) {
                                                                                                                                                                                                k4.k(o0Var, it, hashMap);
                                                                                                                                                                                                return;
                                                                                                                                                                                            } else if (!cls.equals(MemberPreferences.class)) {
                                                                                                                                                                                                if (!cls.equals(MemberFlags.class)) {
                                                                                                                                                                                                    if (cls.equals(Member.class)) {
                                                                                                                                                                                                        i4.k(o0Var, it, hashMap);
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    } else if (!cls.equals(PartyInvite.class)) {
                                                                                                                                                                                                        if (!cls.equals(Invitations.class)) {
                                                                                                                                                                                                            if (!cls.equals(GuildInvite.class)) {
                                                                                                                                                                                                                if (cls.equals(SpecialItem.class)) {
                                                                                                                                                                                                                    w3.k(o0Var, it, hashMap);
                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                } else if (cls.equals(QuestRageStrike.class)) {
                                                                                                                                                                                                                    s3.k(o0Var, it, hashMap);
                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                } else if (!cls.equals(QuestProgressCollect.class)) {
                                                                                                                                                                                                                    if (!cls.equals(QuestProgress.class)) {
                                                                                                                                                                                                                        if (cls.equals(QuestMember.class)) {
                                                                                                                                                                                                                            m3.k(o0Var, it, hashMap);
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        } else if (cls.equals(QuestDrops.class)) {
                                                                                                                                                                                                                            k3.k(o0Var, it, hashMap);
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        } else if (cls.equals(QuestDropItem.class)) {
                                                                                                                                                                                                                            i3.k(o0Var, it, hashMap);
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        } else if (cls.equals(QuestContent.class)) {
                                                                                                                                                                                                                            g3.k(o0Var, it, hashMap);
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        } else if (cls.equals(QuestColors.class)) {
                                                                                                                                                                                                                            e3.k(o0Var, it, hashMap);
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        } else if (cls.equals(QuestCollect.class)) {
                                                                                                                                                                                                                            c3.k(o0Var, it, hashMap);
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        } else if (cls.equals(QuestBossRage.class)) {
                                                                                                                                                                                                                            y2.k(o0Var, it, hashMap);
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        } else if (cls.equals(QuestBoss.class)) {
                                                                                                                                                                                                                            a3.k(o0Var, it, hashMap);
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        } else if (cls.equals(Quest.class)) {
                                                                                                                                                                                                                            u3.k(o0Var, it, hashMap);
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        } else if (cls.equals(Pet.class)) {
                                                                                                                                                                                                                            w2.k(o0Var, it, hashMap);
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        } else if (cls.equals(Mount.class)) {
                                                                                                                                                                                                                            u2.k(o0Var, it, hashMap);
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        } else if (cls.equals(ItemEvent.class)) {
                                                                                                                                                                                                                            s2.k(o0Var, it, hashMap);
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        } else if (cls.equals(HatchingPotion.class)) {
                                                                                                                                                                                                                            q2.k(o0Var, it, hashMap);
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        } else if (cls.equals(Food.class)) {
                                                                                                                                                                                                                            o2.k(o0Var, it, hashMap);
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        } else if (cls.equals(Equipment.class)) {
                                                                                                                                                                                                                            m2.k(o0Var, it, hashMap);
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        } else if (cls.equals(Egg.class)) {
                                                                                                                                                                                                                            k2.k(o0Var, it, hashMap);
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        } else if (cls.equals(Customization.class)) {
                                                                                                                                                                                                                            i2.k(o0Var, it, hashMap);
                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                        } else if (!cls.equals(LocalAuthentication.class)) {
                                                                                                                                                                                                                            if (!cls.equals(WorldStateEvent.class)) {
                                                                                                                                                                                                                                if (cls.equals(WorldState.class)) {
                                                                                                                                                                                                                                    e2.k(o0Var, it, hashMap);
                                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                                } else if (!cls.equals(TutorialStep.class)) {
                                                                                                                                                                                                                                    if (cls.equals(TeamPlan.class)) {
                                                                                                                                                                                                                                        y1.k(o0Var, it, hashMap);
                                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                                    } else if (cls.equals(Tag.class)) {
                                                                                                                                                                                                                                        w1.k(o0Var, it, hashMap);
                                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                                    } else if (cls.equals(Skill.class)) {
                                                                                                                                                                                                                                        u1.k(o0Var, it, hashMap);
                                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                                    } else if (cls.equals(QuestAchievement.class)) {
                                                                                                                                                                                                                                        s1.k(o0Var, it, hashMap);
                                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                                    } else if (cls.equals(FAQArticle.class)) {
                                                                                                                                                                                                                                        q1.k(o0Var, it, hashMap);
                                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                                    } else if (cls.equals(Achievement.class)) {
                                                                                                                                                                                                                                        o1.k(o0Var, it, hashMap);
                                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                        throw io.realm.internal.p.i(cls);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                                        }
                                                                                                                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                            } else {
                                                                                                                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                            }
                                                                                                                                                                                        } else {
                                                                                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                        } else {
                                                                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                } else {
                                                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                        }
                                                                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                    }
                                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                                }
                                                                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                            }
                                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                        }
                                                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                    }
                                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                                }
                                                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                            }
                                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                        }
                                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                    }
                                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                                }
                                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                            }
                                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                        }
                                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                    }
                                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                                }
                                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                            }
                                                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                        }
                                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                    }
                                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                                }
                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                            } else {
                                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                            }
                                                                        }
                                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                    }
                                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                                }
                                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                            }
                                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                        }
                                                        throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                    }
                                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                                }
                                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                            }
                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                        } else {
                                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                        }
                                    }
                                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                                }
                                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                            }
                            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                }
                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
            }
            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
        }
    }

    @Override // io.realm.internal.p
    public <E extends a1> boolean s(Class<E> cls) {
        if (cls.equals(SocialAuthentication.class) || cls.equals(UserTaskPreferences.class) || cls.equals(UserAchievement.class)) {
            return true;
        }
        if (cls.equals(User.class)) {
            return false;
        }
        if (cls.equals(Training.class) || cls.equals(SuppressedModals.class) || cls.equals(SubscriptionPlanConsecutive.class) || cls.equals(SubscriptionPlan.class) || cls.equals(Stats.class) || cls.equals(PushNotificationsPreference.class) || cls.equals(Purchases.class) || cls.equals(Profile.class) || cls.equals(Preferences.class)) {
            return true;
        }
        if (cls.equals(Permissions.class)) {
            return false;
        }
        if (cls.equals(OwnedPet.class) || cls.equals(OwnedMount.class) || cls.equals(OwnedItem.class) || cls.equals(OwnedCustomization.class) || cls.equals(Outfit.class) || cls.equals(Items.class) || cls.equals(Inbox.class) || cls.equals(Hair.class) || cls.equals(GoogleSubscriptionData.class) || cls.equals(Gear.class) || cls.equals(Flags.class) || cls.equals(EmailNotificationsPreference.class) || cls.equals(ContributorInfo.class) || cls.equals(Buffs.class) || cls.equals(Backer.class) || cls.equals(AuthenticationTimestamps.class) || cls.equals(Authentication.class) || cls.equals(AdditionalSubscriptionInfo.class) || cls.equals(ABTest.class) || cls.equals(TaskTag.class) || cls.equals(TaskGroupPlan.class)) {
            return true;
        }
        if (cls.equals(Task.class) || cls.equals(RemindersItem.class)) {
            return false;
        }
        if (cls.equals(GroupAssignedDetails.class) || cls.equals(Days.class)) {
            return true;
        }
        if (cls.equals(ChecklistItem.class)) {
            return false;
        }
        if (cls.equals(UserStyles.class) || cls.equals(UserParty.class)) {
            return true;
        }
        if (cls.equals(InboxConversation.class) || cls.equals(GroupMembership.class) || cls.equals(GroupCategory.class) || cls.equals(Group.class)) {
            return false;
        }
        if (cls.equals(ChatMessageLike.class)) {
            return true;
        }
        if (cls.equals(ChatMessage.class)) {
            return false;
        }
        if (cls.equals(ChallengeMembership.class)) {
            return true;
        }
        if (cls.equals(Challenge.class)) {
            return false;
        }
        if (cls.equals(ShopItemUnlockCondition.class)) {
            return true;
        }
        if (cls.equals(ShopItem.class)) {
            return false;
        }
        if (cls.equals(MemberPreferences.class) || cls.equals(MemberFlags.class)) {
            return true;
        }
        if (cls.equals(Member.class)) {
            return false;
        }
        if (cls.equals(PartyInvite.class) || cls.equals(Invitations.class) || cls.equals(GuildInvite.class)) {
            return true;
        }
        if (cls.equals(SpecialItem.class) || cls.equals(QuestRageStrike.class)) {
            return false;
        }
        if (cls.equals(QuestProgressCollect.class) || cls.equals(QuestProgress.class)) {
            return true;
        }
        if (cls.equals(QuestMember.class) || cls.equals(QuestDrops.class) || cls.equals(QuestDropItem.class) || cls.equals(QuestContent.class) || cls.equals(QuestColors.class) || cls.equals(QuestCollect.class) || cls.equals(QuestBossRage.class) || cls.equals(QuestBoss.class) || cls.equals(Quest.class) || cls.equals(Pet.class) || cls.equals(Mount.class) || cls.equals(ItemEvent.class) || cls.equals(HatchingPotion.class) || cls.equals(Food.class) || cls.equals(Equipment.class) || cls.equals(Egg.class) || cls.equals(Customization.class)) {
            return false;
        }
        if (cls.equals(LocalAuthentication.class) || cls.equals(WorldStateEvent.class)) {
            return true;
        }
        if (cls.equals(WorldState.class)) {
            return false;
        }
        if (cls.equals(TutorialStep.class)) {
            return true;
        }
        if (cls.equals(TeamPlan.class) || cls.equals(Tag.class) || cls.equals(Skill.class) || cls.equals(QuestAchievement.class) || cls.equals(FAQArticle.class) || cls.equals(Achievement.class)) {
            return false;
        }
        throw io.realm.internal.p.i(cls);
    }

    @Override // io.realm.internal.p
    public <E extends a1> E t(Class<E> cls, Object obj, io.realm.internal.q qVar, io.realm.internal.c cVar, boolean z10, List<String> list) {
        a.c cVar2 = a.f17237x.get();
        try {
            cVar2.g((a) obj, qVar, cVar, z10, list);
            io.realm.internal.p.a(cls);
            if (cls.equals(SocialAuthentication.class)) {
                return cls.cast(new e8());
            }
            if (cls.equals(UserTaskPreferences.class)) {
                return cls.cast(new c8());
            }
            if (cls.equals(UserAchievement.class)) {
                return cls.cast(new y7());
            }
            if (cls.equals(User.class)) {
                return cls.cast(new a8());
            }
            if (cls.equals(Training.class)) {
                return cls.cast(new w7());
            }
            if (cls.equals(SuppressedModals.class)) {
                return cls.cast(new u7());
            }
            if (cls.equals(SubscriptionPlanConsecutive.class)) {
                return cls.cast(new q7());
            }
            if (cls.equals(SubscriptionPlan.class)) {
                return cls.cast(new s7());
            }
            if (cls.equals(Stats.class)) {
                return cls.cast(new o7());
            }
            if (cls.equals(PushNotificationsPreference.class)) {
                return cls.cast(new m7());
            }
            if (cls.equals(Purchases.class)) {
                return cls.cast(new k7());
            }
            if (cls.equals(Profile.class)) {
                return cls.cast(new i7());
            }
            if (cls.equals(Preferences.class)) {
                return cls.cast(new g7());
            }
            if (cls.equals(Permissions.class)) {
                return cls.cast(new e7());
            }
            if (cls.equals(OwnedPet.class)) {
                return cls.cast(new c7());
            }
            if (cls.equals(OwnedMount.class)) {
                return cls.cast(new a7());
            }
            if (cls.equals(OwnedItem.class)) {
                return cls.cast(new y6());
            }
            if (cls.equals(OwnedCustomization.class)) {
                return cls.cast(new w6());
            }
            if (cls.equals(Outfit.class)) {
                return cls.cast(new u6());
            }
            if (cls.equals(Items.class)) {
                return cls.cast(new s6());
            }
            if (cls.equals(Inbox.class)) {
                return cls.cast(new q6());
            }
            if (cls.equals(Hair.class)) {
                return cls.cast(new o6());
            }
            if (cls.equals(GoogleSubscriptionData.class)) {
                return cls.cast(new m6());
            }
            if (cls.equals(Gear.class)) {
                return cls.cast(new k6());
            }
            if (cls.equals(Flags.class)) {
                return cls.cast(new i6());
            }
            if (cls.equals(EmailNotificationsPreference.class)) {
                return cls.cast(new g6());
            }
            if (cls.equals(ContributorInfo.class)) {
                return cls.cast(new e6());
            }
            if (cls.equals(Buffs.class)) {
                return cls.cast(new c6());
            }
            if (cls.equals(Backer.class)) {
                return cls.cast(new a6());
            }
            if (cls.equals(AuthenticationTimestamps.class)) {
                return cls.cast(new y5());
            }
            if (cls.equals(Authentication.class)) {
                return cls.cast(new w5());
            }
            if (cls.equals(AdditionalSubscriptionInfo.class)) {
                return cls.cast(new u5());
            }
            if (cls.equals(ABTest.class)) {
                return cls.cast(new s5());
            }
            if (cls.equals(TaskTag.class)) {
                return cls.cast(new q5());
            }
            if (cls.equals(TaskGroupPlan.class)) {
                return cls.cast(new n5());
            }
            if (cls.equals(Task.class)) {
                return cls.cast(new com_habitrpg_android_habitica_models_tasks_TaskRealmProxy());
            }
            if (cls.equals(RemindersItem.class)) {
                return cls.cast(new com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy());
            }
            if (cls.equals(GroupAssignedDetails.class)) {
                return cls.cast(new k5());
            }
            if (cls.equals(Days.class)) {
                return cls.cast(new com_habitrpg_android_habitica_models_tasks_DaysRealmProxy());
            }
            if (cls.equals(ChecklistItem.class)) {
                return cls.cast(new com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy());
            }
            if (cls.equals(UserStyles.class)) {
                return cls.cast(new g5());
            }
            if (cls.equals(UserParty.class)) {
                return cls.cast(new e5());
            }
            if (cls.equals(InboxConversation.class)) {
                return cls.cast(new c5());
            }
            if (cls.equals(GroupMembership.class)) {
                return cls.cast(new y4());
            }
            if (cls.equals(GroupCategory.class)) {
                return cls.cast(new w4());
            }
            if (cls.equals(Group.class)) {
                return cls.cast(new a5());
            }
            if (cls.equals(ChatMessageLike.class)) {
                return cls.cast(new s4());
            }
            if (cls.equals(ChatMessage.class)) {
                return cls.cast(new u4());
            }
            if (cls.equals(ChallengeMembership.class)) {
                return cls.cast(new o4());
            }
            if (cls.equals(Challenge.class)) {
                return cls.cast(new q4());
            }
            if (cls.equals(ShopItemUnlockCondition.class)) {
                return cls.cast(new m4());
            }
            if (cls.equals(ShopItem.class)) {
                return cls.cast(new k4());
            }
            if (cls.equals(MemberPreferences.class)) {
                return cls.cast(new g4());
            }
            if (cls.equals(MemberFlags.class)) {
                return cls.cast(new e4());
            }
            if (cls.equals(Member.class)) {
                return cls.cast(new i4());
            }
            if (cls.equals(PartyInvite.class)) {
                return cls.cast(new c4());
            }
            if (cls.equals(Invitations.class)) {
                return cls.cast(new a4());
            }
            if (cls.equals(GuildInvite.class)) {
                return cls.cast(new y3());
            }
            if (cls.equals(SpecialItem.class)) {
                return cls.cast(new w3());
            }
            if (cls.equals(QuestRageStrike.class)) {
                return cls.cast(new s3());
            }
            if (cls.equals(QuestProgressCollect.class)) {
                return cls.cast(new o3());
            }
            if (cls.equals(QuestProgress.class)) {
                return cls.cast(new q3());
            }
            if (cls.equals(QuestMember.class)) {
                return cls.cast(new m3());
            }
            if (cls.equals(QuestDrops.class)) {
                return cls.cast(new k3());
            }
            if (cls.equals(QuestDropItem.class)) {
                return cls.cast(new i3());
            }
            if (cls.equals(QuestContent.class)) {
                return cls.cast(new g3());
            }
            if (cls.equals(QuestColors.class)) {
                return cls.cast(new e3());
            }
            if (cls.equals(QuestCollect.class)) {
                return cls.cast(new c3());
            }
            if (cls.equals(QuestBossRage.class)) {
                return cls.cast(new y2());
            }
            if (cls.equals(QuestBoss.class)) {
                return cls.cast(new a3());
            }
            if (cls.equals(Quest.class)) {
                return cls.cast(new u3());
            }
            if (cls.equals(Pet.class)) {
                return cls.cast(new w2());
            }
            if (cls.equals(Mount.class)) {
                return cls.cast(new u2());
            }
            if (cls.equals(ItemEvent.class)) {
                return cls.cast(new s2());
            }
            if (cls.equals(HatchingPotion.class)) {
                return cls.cast(new q2());
            }
            if (cls.equals(Food.class)) {
                return cls.cast(new o2());
            }
            if (cls.equals(Equipment.class)) {
                return cls.cast(new m2());
            }
            if (cls.equals(Egg.class)) {
                return cls.cast(new k2());
            }
            if (cls.equals(Customization.class)) {
                return cls.cast(new i2());
            }
            if (cls.equals(LocalAuthentication.class)) {
                return cls.cast(new g2());
            }
            if (cls.equals(WorldStateEvent.class)) {
                return cls.cast(new c2());
            }
            if (cls.equals(WorldState.class)) {
                return cls.cast(new e2());
            }
            if (cls.equals(TutorialStep.class)) {
                return cls.cast(new a2());
            }
            if (cls.equals(TeamPlan.class)) {
                return cls.cast(new y1());
            }
            if (cls.equals(Tag.class)) {
                return cls.cast(new w1());
            }
            if (cls.equals(Skill.class)) {
                return cls.cast(new u1());
            }
            if (cls.equals(QuestAchievement.class)) {
                return cls.cast(new s1());
            }
            if (cls.equals(FAQArticle.class)) {
                return cls.cast(new q1());
            }
            if (cls.equals(Achievement.class)) {
                return cls.cast(new o1());
            }
            throw io.realm.internal.p.i(cls);
        } finally {
            cVar2.a();
        }
    }

    @Override // io.realm.internal.p
    public boolean u() {
        return true;
    }

    @Override // io.realm.internal.p
    public <E extends a1> void v(o0 o0Var, E e10, E e11, Map<a1, io.realm.internal.o> map, Set<v> set) {
        Class<? super Object> superclass = e11.getClass().getSuperclass();
        if (superclass.equals(SocialAuthentication.class)) {
            e8.n(o0Var, (SocialAuthentication) e10, (SocialAuthentication) e11, map, set);
        } else if (superclass.equals(UserTaskPreferences.class)) {
            c8.n(o0Var, (UserTaskPreferences) e10, (UserTaskPreferences) e11, map, set);
        } else if (superclass.equals(UserAchievement.class)) {
            y7.n(o0Var, (UserAchievement) e10, (UserAchievement) e11, map, set);
        } else if (!superclass.equals(User.class)) {
            if (superclass.equals(Training.class)) {
                w7.n(o0Var, (Training) e10, (Training) e11, map, set);
            } else if (superclass.equals(SuppressedModals.class)) {
                u7.n(o0Var, (SuppressedModals) e10, (SuppressedModals) e11, map, set);
            } else if (superclass.equals(SubscriptionPlanConsecutive.class)) {
                q7.n(o0Var, (SubscriptionPlanConsecutive) e10, (SubscriptionPlanConsecutive) e11, map, set);
            } else if (superclass.equals(SubscriptionPlan.class)) {
                s7.n(o0Var, (SubscriptionPlan) e10, (SubscriptionPlan) e11, map, set);
            } else if (superclass.equals(Stats.class)) {
                o7.n(o0Var, (Stats) e10, (Stats) e11, map, set);
            } else if (superclass.equals(PushNotificationsPreference.class)) {
                m7.n(o0Var, (PushNotificationsPreference) e10, (PushNotificationsPreference) e11, map, set);
            } else if (superclass.equals(Purchases.class)) {
                k7.n(o0Var, (Purchases) e10, (Purchases) e11, map, set);
            } else if (superclass.equals(Profile.class)) {
                i7.n(o0Var, (Profile) e10, (Profile) e11, map, set);
            } else if (superclass.equals(Preferences.class)) {
                g7.n(o0Var, (Preferences) e10, (Preferences) e11, map, set);
            } else if (!superclass.equals(Permissions.class)) {
                if (superclass.equals(OwnedPet.class)) {
                    c7.n(o0Var, (OwnedPet) e10, (OwnedPet) e11, map, set);
                } else if (superclass.equals(OwnedMount.class)) {
                    a7.n(o0Var, (OwnedMount) e10, (OwnedMount) e11, map, set);
                } else if (superclass.equals(OwnedItem.class)) {
                    y6.n(o0Var, (OwnedItem) e10, (OwnedItem) e11, map, set);
                } else if (superclass.equals(OwnedCustomization.class)) {
                    w6.n(o0Var, (OwnedCustomization) e10, (OwnedCustomization) e11, map, set);
                } else if (superclass.equals(Outfit.class)) {
                    u6.n(o0Var, (Outfit) e10, (Outfit) e11, map, set);
                } else if (superclass.equals(Items.class)) {
                    s6.n(o0Var, (Items) e10, (Items) e11, map, set);
                } else if (superclass.equals(Inbox.class)) {
                    q6.n(o0Var, (Inbox) e10, (Inbox) e11, map, set);
                } else if (superclass.equals(Hair.class)) {
                    o6.n(o0Var, (Hair) e10, (Hair) e11, map, set);
                } else if (superclass.equals(GoogleSubscriptionData.class)) {
                    m6.n(o0Var, (GoogleSubscriptionData) e10, (GoogleSubscriptionData) e11, map, set);
                } else if (superclass.equals(Gear.class)) {
                    k6.n(o0Var, (Gear) e10, (Gear) e11, map, set);
                } else if (superclass.equals(Flags.class)) {
                    i6.n(o0Var, (Flags) e10, (Flags) e11, map, set);
                } else if (superclass.equals(EmailNotificationsPreference.class)) {
                    g6.n(o0Var, (EmailNotificationsPreference) e10, (EmailNotificationsPreference) e11, map, set);
                } else if (superclass.equals(ContributorInfo.class)) {
                    e6.n(o0Var, (ContributorInfo) e10, (ContributorInfo) e11, map, set);
                } else if (superclass.equals(Buffs.class)) {
                    c6.n(o0Var, (Buffs) e10, (Buffs) e11, map, set);
                } else if (superclass.equals(Backer.class)) {
                    a6.n(o0Var, (Backer) e10, (Backer) e11, map, set);
                } else if (superclass.equals(AuthenticationTimestamps.class)) {
                    y5.n(o0Var, (AuthenticationTimestamps) e10, (AuthenticationTimestamps) e11, map, set);
                } else if (superclass.equals(Authentication.class)) {
                    w5.n(o0Var, (Authentication) e10, (Authentication) e11, map, set);
                } else if (superclass.equals(AdditionalSubscriptionInfo.class)) {
                    u5.n(o0Var, (AdditionalSubscriptionInfo) e10, (AdditionalSubscriptionInfo) e11, map, set);
                } else if (superclass.equals(ABTest.class)) {
                    s5.n(o0Var, (ABTest) e10, (ABTest) e11, map, set);
                } else if (superclass.equals(TaskTag.class)) {
                    q5.l(o0Var, (TaskTag) e10, (TaskTag) e11, map, set);
                } else if (superclass.equals(TaskGroupPlan.class)) {
                    n5.n(o0Var, (TaskGroupPlan) e10, (TaskGroupPlan) e11, map, set);
                } else if (!superclass.equals(Task.class)) {
                    if (!superclass.equals(RemindersItem.class)) {
                        if (superclass.equals(GroupAssignedDetails.class)) {
                            k5.n(o0Var, (GroupAssignedDetails) e10, (GroupAssignedDetails) e11, map, set);
                            return;
                        } else if (superclass.equals(Days.class)) {
                            com_habitrpg_android_habitica_models_tasks_DaysRealmProxy.n(o0Var, (Days) e10, (Days) e11, map, set);
                            return;
                        } else if (!superclass.equals(ChecklistItem.class)) {
                            if (superclass.equals(UserStyles.class)) {
                                g5.n(o0Var, (UserStyles) e10, (UserStyles) e11, map, set);
                                return;
                            } else if (superclass.equals(UserParty.class)) {
                                e5.n(o0Var, (UserParty) e10, (UserParty) e11, map, set);
                                return;
                            } else if (!superclass.equals(InboxConversation.class)) {
                                if (!superclass.equals(GroupMembership.class)) {
                                    if (!superclass.equals(GroupCategory.class)) {
                                        if (!superclass.equals(Group.class)) {
                                            if (superclass.equals(ChatMessageLike.class)) {
                                                s4.n(o0Var, (ChatMessageLike) e10, (ChatMessageLike) e11, map, set);
                                                return;
                                            } else if (!superclass.equals(ChatMessage.class)) {
                                                if (superclass.equals(ChallengeMembership.class)) {
                                                    o4.n(o0Var, (ChallengeMembership) e10, (ChallengeMembership) e11, map, set);
                                                    return;
                                                } else if (!superclass.equals(Challenge.class)) {
                                                    if (superclass.equals(ShopItemUnlockCondition.class)) {
                                                        m4.n(o0Var, (ShopItemUnlockCondition) e10, (ShopItemUnlockCondition) e11, map, set);
                                                        return;
                                                    } else if (!superclass.equals(ShopItem.class)) {
                                                        if (superclass.equals(MemberPreferences.class)) {
                                                            g4.n(o0Var, (MemberPreferences) e10, (MemberPreferences) e11, map, set);
                                                            return;
                                                        } else if (superclass.equals(MemberFlags.class)) {
                                                            e4.n(o0Var, (MemberFlags) e10, (MemberFlags) e11, map, set);
                                                            return;
                                                        } else if (!superclass.equals(Member.class)) {
                                                            if (superclass.equals(PartyInvite.class)) {
                                                                c4.n(o0Var, (PartyInvite) e10, (PartyInvite) e11, map, set);
                                                                return;
                                                            } else if (superclass.equals(Invitations.class)) {
                                                                a4.n(o0Var, (Invitations) e10, (Invitations) e11, map, set);
                                                                return;
                                                            } else if (superclass.equals(GuildInvite.class)) {
                                                                y3.n(o0Var, (GuildInvite) e10, (GuildInvite) e11, map, set);
                                                                return;
                                                            } else if (!superclass.equals(SpecialItem.class)) {
                                                                if (!superclass.equals(QuestRageStrike.class)) {
                                                                    if (superclass.equals(QuestProgressCollect.class)) {
                                                                        o3.n(o0Var, (QuestProgressCollect) e10, (QuestProgressCollect) e11, map, set);
                                                                        return;
                                                                    } else if (superclass.equals(QuestProgress.class)) {
                                                                        q3.n(o0Var, (QuestProgress) e10, (QuestProgress) e11, map, set);
                                                                        return;
                                                                    } else if (!superclass.equals(QuestMember.class)) {
                                                                        if (!superclass.equals(QuestDrops.class)) {
                                                                            if (!superclass.equals(QuestDropItem.class)) {
                                                                                if (!superclass.equals(QuestContent.class)) {
                                                                                    if (!superclass.equals(QuestColors.class)) {
                                                                                        if (!superclass.equals(QuestCollect.class)) {
                                                                                            if (!superclass.equals(QuestBossRage.class)) {
                                                                                                if (!superclass.equals(QuestBoss.class)) {
                                                                                                    if (!superclass.equals(Quest.class)) {
                                                                                                        if (!superclass.equals(Pet.class)) {
                                                                                                            if (!superclass.equals(Mount.class)) {
                                                                                                                if (!superclass.equals(ItemEvent.class)) {
                                                                                                                    if (!superclass.equals(HatchingPotion.class)) {
                                                                                                                        if (!superclass.equals(Food.class)) {
                                                                                                                            if (!superclass.equals(Equipment.class)) {
                                                                                                                                if (!superclass.equals(Egg.class)) {
                                                                                                                                    if (!superclass.equals(Customization.class)) {
                                                                                                                                        if (superclass.equals(LocalAuthentication.class)) {
                                                                                                                                            g2.n(o0Var, (LocalAuthentication) e10, (LocalAuthentication) e11, map, set);
                                                                                                                                            return;
                                                                                                                                        } else if (superclass.equals(WorldStateEvent.class)) {
                                                                                                                                            c2.n(o0Var, (WorldStateEvent) e10, (WorldStateEvent) e11, map, set);
                                                                                                                                            return;
                                                                                                                                        } else if (!superclass.equals(WorldState.class)) {
                                                                                                                                            if (superclass.equals(TutorialStep.class)) {
                                                                                                                                                a2.n(o0Var, (TutorialStep) e10, (TutorialStep) e11, map, set);
                                                                                                                                                return;
                                                                                                                                            } else if (!superclass.equals(TeamPlan.class)) {
                                                                                                                                                if (!superclass.equals(Tag.class)) {
                                                                                                                                                    if (!superclass.equals(Skill.class)) {
                                                                                                                                                        if (!superclass.equals(QuestAchievement.class)) {
                                                                                                                                                            if (!superclass.equals(FAQArticle.class)) {
                                                                                                                                                                if (superclass.equals(Achievement.class)) {
                                                                                                                                                                    throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.Achievement");
                                                                                                                                                                }
                                                                                                                                                                throw io.realm.internal.p.i(superclass);
                                                                                                                                                            }
                                                                                                                                                            throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.FAQArticle");
                                                                                                                                                        }
                                                                                                                                                        throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.QuestAchievement");
                                                                                                                                                    }
                                                                                                                                                    throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.Skill");
                                                                                                                                                }
                                                                                                                                                throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.Tag");
                                                                                                                                            } else {
                                                                                                                                                throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.TeamPlan");
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.WorldState");
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.Customization");
                                                                                                                                }
                                                                                                                                throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.Egg");
                                                                                                                            }
                                                                                                                            throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.Equipment");
                                                                                                                        }
                                                                                                                        throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.Food");
                                                                                                                    }
                                                                                                                    throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.HatchingPotion");
                                                                                                                }
                                                                                                                throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.ItemEvent");
                                                                                                            }
                                                                                                            throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.Mount");
                                                                                                        }
                                                                                                        throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.Pet");
                                                                                                    }
                                                                                                    throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.Quest");
                                                                                                }
                                                                                                throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.QuestBoss");
                                                                                            }
                                                                                            throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.QuestBossRage");
                                                                                        }
                                                                                        throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.QuestCollect");
                                                                                    }
                                                                                    throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.QuestColors");
                                                                                }
                                                                                throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.QuestContent");
                                                                            }
                                                                            throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.QuestDropItem");
                                                                        }
                                                                        throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.QuestDrops");
                                                                    } else {
                                                                        throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.QuestMember");
                                                                    }
                                                                }
                                                                throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.QuestRageStrike");
                                                            } else {
                                                                throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.inventory.SpecialItem");
                                                            }
                                                        } else {
                                                            throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.members.Member");
                                                        }
                                                    } else {
                                                        throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.shops.ShopItem");
                                                    }
                                                } else {
                                                    throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.social.Challenge");
                                                }
                                            } else {
                                                throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.social.ChatMessage");
                                            }
                                        }
                                        throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.social.Group");
                                    }
                                    throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.social.GroupCategory");
                                }
                                throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.social.GroupMembership");
                            } else {
                                throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.social.InboxConversation");
                            }
                        } else {
                            throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.tasks.ChecklistItem");
                        }
                    }
                    throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.tasks.RemindersItem");
                } else {
                    throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.tasks.Task");
                }
            } else {
                throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.user.Permissions");
            }
        } else {
            throw io.realm.internal.p.l("com.habitrpg.android.habitica.models.user.User");
        }
    }
}
