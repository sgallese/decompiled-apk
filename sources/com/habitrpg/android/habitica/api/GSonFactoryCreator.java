package com.habitrpg.android.habitica.api;

import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.reflect.TypeToken;
import com.habitrpg.android.habitica.models.Achievement;
import com.habitrpg.android.habitica.models.ContentResult;
import com.habitrpg.android.habitica.models.FAQArticle;
import com.habitrpg.android.habitica.models.Skill;
import com.habitrpg.android.habitica.models.Tag;
import com.habitrpg.android.habitica.models.TutorialStep;
import com.habitrpg.android.habitica.models.WorldState;
import com.habitrpg.android.habitica.models.inventory.Customization;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.inventory.QuestCollect;
import com.habitrpg.android.habitica.models.inventory.QuestDropItem;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.models.social.FindUsernameResult;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.tasks.TaskList;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.OwnedMount;
import com.habitrpg.android.habitica.models.user.OwnedPet;
import com.habitrpg.android.habitica.models.user.Purchases;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.models.user.auth.SocialAuthentication;
import com.habitrpg.android.habitica.utils.AchievementListDeserializer;
import com.habitrpg.android.habitica.utils.AssignedDetailsDeserializer;
import com.habitrpg.android.habitica.utils.BooleanAsIntAdapter;
import com.habitrpg.android.habitica.utils.ChallengeDeserializer;
import com.habitrpg.android.habitica.utils.ChallengeListDeserializer;
import com.habitrpg.android.habitica.utils.ChatMessageDeserializer;
import com.habitrpg.android.habitica.utils.ContentDeserializer;
import com.habitrpg.android.habitica.utils.CustomizationDeserializer;
import com.habitrpg.android.habitica.utils.DateDeserializer;
import com.habitrpg.android.habitica.utils.EquipmentListDeserializer;
import com.habitrpg.android.habitica.utils.FAQArticleListDeserilializer;
import com.habitrpg.android.habitica.utils.FeedResponseDeserializer;
import com.habitrpg.android.habitica.utils.FindUsernameResultDeserializer;
import com.habitrpg.android.habitica.utils.GroupSerialization;
import com.habitrpg.android.habitica.utils.MemberSerialization;
import com.habitrpg.android.habitica.utils.NotificationDeserializer;
import com.habitrpg.android.habitica.utils.OwnedItemListDeserializer;
import com.habitrpg.android.habitica.utils.OwnedMountListDeserializer;
import com.habitrpg.android.habitica.utils.OwnedPetListDeserializer;
import com.habitrpg.android.habitica.utils.PurchasedDeserializer;
import com.habitrpg.android.habitica.utils.QuestCollectDeserializer;
import com.habitrpg.android.habitica.utils.QuestDeserializer;
import com.habitrpg.android.habitica.utils.QuestDropItemsListSerialization;
import com.habitrpg.android.habitica.utils.SkillDeserializer;
import com.habitrpg.android.habitica.utils.SocialAuthenticationDeserializer;
import com.habitrpg.android.habitica.utils.TaskListDeserializer;
import com.habitrpg.android.habitica.utils.TaskSerializer;
import com.habitrpg.android.habitica.utils.TaskTagDeserializer;
import com.habitrpg.android.habitica.utils.TutorialStepListDeserializer;
import com.habitrpg.android.habitica.utils.UserDeserializer;
import com.habitrpg.android.habitica.utils.WorldStateSerialization;
import com.habitrpg.common.habitica.models.Notification;
import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;
import retrofit2.converter.gson.GsonConverterFactory;

/* loaded from: classes4.dex */
public class GSonFactoryCreator {
    public static GsonConverterFactory create() {
        return GsonConverterFactory.create(createGson());
    }

    public static f createGson() {
        Type type = new TypeToken<List<Skill>>() { // from class: com.habitrpg.android.habitica.api.GSonFactoryCreator.1
        }.getType();
        Type type2 = new TypeToken<x0<Tag>>() { // from class: com.habitrpg.android.habitica.api.GSonFactoryCreator.2
        }.getType();
        Type type3 = new TypeToken<x0<Customization>>() { // from class: com.habitrpg.android.habitica.api.GSonFactoryCreator.3
        }.getType();
        Type type4 = new TypeToken<x0<TutorialStep>>() { // from class: com.habitrpg.android.habitica.api.GSonFactoryCreator.4
        }.getType();
        Type type5 = new TypeToken<x0<FAQArticle>>() { // from class: com.habitrpg.android.habitica.api.GSonFactoryCreator.5
        }.getType();
        Type type6 = new TypeToken<x0<Equipment>>() { // from class: com.habitrpg.android.habitica.api.GSonFactoryCreator.6
        }.getType();
        Type type7 = new TypeToken<x0<QuestCollect>>() { // from class: com.habitrpg.android.habitica.api.GSonFactoryCreator.7
        }.getType();
        new TypeToken<x0<ChatMessage>>() { // from class: com.habitrpg.android.habitica.api.GSonFactoryCreator.8
        }.getType();
        Type type8 = new TypeToken<List<Challenge>>() { // from class: com.habitrpg.android.habitica.api.GSonFactoryCreator.9
        }.getType();
        Type type9 = new TypeToken<x0<Challenge>>() { // from class: com.habitrpg.android.habitica.api.GSonFactoryCreator.10
        }.getType();
        Type type10 = new TypeToken<x0<QuestDropItem>>() { // from class: com.habitrpg.android.habitica.api.GSonFactoryCreator.11
        }.getType();
        Type type11 = new TypeToken<x0<OwnedItem>>() { // from class: com.habitrpg.android.habitica.api.GSonFactoryCreator.12
        }.getType();
        Type type12 = new TypeToken<x0<OwnedPet>>() { // from class: com.habitrpg.android.habitica.api.GSonFactoryCreator.13
        }.getType();
        Type type13 = new TypeToken<x0<OwnedMount>>() { // from class: com.habitrpg.android.habitica.api.GSonFactoryCreator.14
        }.getType();
        Type type14 = new TypeToken<List<Achievement>>() { // from class: com.habitrpg.android.habitica.api.GSonFactoryCreator.15
        }.getType();
        return new g().c(type2, new TaskTagDeserializer()).c(Boolean.class, new BooleanAsIntAdapter()).c(Boolean.TYPE, new BooleanAsIntAdapter()).c(type, new SkillDeserializer()).c(TaskList.class, new TaskListDeserializer()).c(Purchases.class, new PurchasedDeserializer()).c(type3, new CustomizationDeserializer()).c(type4, new TutorialStepListDeserializer()).c(type5, new FAQArticleListDeserilializer()).c(Group.class, new GroupSerialization()).c(Date.class, new DateDeserializer()).c(type6, new EquipmentListDeserializer()).c(ChatMessage.class, new ChatMessageDeserializer()).c(Task.class, new TaskSerializer()).c(ContentResult.class, new ContentDeserializer()).c(FeedResponse.class, new FeedResponseDeserializer()).c(Challenge.class, new ChallengeDeserializer()).c(User.class, new UserDeserializer()).c(type7, new QuestCollectDeserializer()).c(type8, new ChallengeListDeserializer()).c(type9, new ChallengeListDeserializer()).c(type10, new QuestDropItemsListSerialization()).c(type11, new OwnedItemListDeserializer()).c(type12, new OwnedPetListDeserializer()).c(type13, new OwnedMountListDeserializer()).c(type14, new AchievementListDeserializer()).c(new TypeToken<x0<GroupAssignedDetails>>() { // from class: com.habitrpg.android.habitica.api.GSonFactoryCreator.16
        }.getType(), new AssignedDetailsDeserializer()).c(Quest.class, new QuestDeserializer()).c(Member.class, new MemberSerialization()).c(WorldState.class, new WorldStateSerialization()).c(FindUsernameResult.class, new FindUsernameResultDeserializer()).c(Notification.class, new NotificationDeserializer()).c(SocialAuthentication.class, new SocialAuthenticationDeserializer()).e("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").d().b();
    }
}
