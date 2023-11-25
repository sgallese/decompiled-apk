package com.habitrpg.common.habitica.models;

import com.habitrpg.common.habitica.models.notifications.AchievementData;
import com.habitrpg.common.habitica.models.notifications.ChallengeWonData;
import com.habitrpg.common.habitica.models.notifications.FirstDropData;
import com.habitrpg.common.habitica.models.notifications.GroupTaskApprovedData;
import com.habitrpg.common.habitica.models.notifications.GroupTaskNeedsWorkData;
import com.habitrpg.common.habitica.models.notifications.GroupTaskRequiresApprovalData;
import com.habitrpg.common.habitica.models.notifications.GuildInvitationData;
import com.habitrpg.common.habitica.models.notifications.ItemReceivedData;
import com.habitrpg.common.habitica.models.notifications.LoginIncentiveData;
import com.habitrpg.common.habitica.models.notifications.NewChatMessageData;
import com.habitrpg.common.habitica.models.notifications.NewStuffData;
import com.habitrpg.common.habitica.models.notifications.NotificationData;
import com.habitrpg.common.habitica.models.notifications.PartyInvitationData;
import com.habitrpg.common.habitica.models.notifications.QuestInvitationData;
import com.habitrpg.common.habitica.models.notifications.UnallocatedPointsData;
import jc.a;
import jc.b;
import qc.q;

/* compiled from: Notification.kt */
/* loaded from: classes4.dex */
public final class Notification {
    private NotificationData data;

    /* renamed from: id  reason: collision with root package name */
    private String f12934id = "";
    private Boolean seen;
    private String type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Notification.kt */
    /* loaded from: classes4.dex */
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private final String type;
        public static final Type LOGIN_INCENTIVE = new Type("LOGIN_INCENTIVE", 0, "LOGIN_INCENTIVE");
        public static final Type NEW_STUFF = new Type("NEW_STUFF", 1, "NEW_STUFF");
        public static final Type NEW_CHAT_MESSAGE = new Type("NEW_CHAT_MESSAGE", 2, "NEW_CHAT_MESSAGE");
        public static final Type NEW_MYSTERY_ITEMS = new Type("NEW_MYSTERY_ITEMS", 3, "NEW_MYSTERY_ITEMS");
        public static final Type GROUP_TASK_NEEDS_WORK = new Type("GROUP_TASK_NEEDS_WORK", 4, "GROUP_TASK_NEEDS_WORK");
        public static final Type GROUP_TASK_APPROVED = new Type("GROUP_TASK_APPROVED", 5, "GROUP_TASK_APPROVED");
        public static final Type GROUP_TASK_REQUIRES_APPROVAL = new Type("GROUP_TASK_REQUIRES_APPROVAL", 6, "GROUP_TASK_REQUIRES_APPROVAL");
        public static final Type UNALLOCATED_STATS_POINTS = new Type("UNALLOCATED_STATS_POINTS", 7, "UNALLOCATED_STATS_POINTS");
        public static final Type WON_CHALLENGE = new Type("WON_CHALLENGE", 8, "WON_CHALLENGE");
        public static final Type ITEM_RECEIVED = new Type("ITEM_RECEIVED", 9, "ITEM_RECEIVED");
        public static final Type ACHIEVEMENT_PARTY_UP = new Type("ACHIEVEMENT_PARTY_UP", 10, "ACHIEVEMENT_PARTY_UP");
        public static final Type ACHIEVEMENT_PARTY_ON = new Type("ACHIEVEMENT_PARTY_ON", 11, "ACHIEVEMENT_PARTY_ON");
        public static final Type ACHIEVEMENT_BEAST_MASTER = new Type("ACHIEVEMENT_BEAST_MASTER", 12, "ACHIEVEMENT_BEAST_MASTER");
        public static final Type ACHIEVEMENT_MOUNT_MASTER = new Type("ACHIEVEMENT_MOUNT_MASTER", 13, "ACHIEVEMENT_MOUNT_MASTER");
        public static final Type ACHIEVEMENT_TRIAD_BINGO = new Type("ACHIEVEMENT_TRIAD_BINGO", 14, "ACHIEVEMENT_TRIAD_BINGO");
        public static final Type ACHIEVEMENT_GUILD_JOINED = new Type("ACHIEVEMENT_GUILD_JOINED", 15, "GUILD_JOINED_ACHIEVEMENT");
        public static final Type ACHIEVEMENT_CHALLENGE_JOINED = new Type("ACHIEVEMENT_CHALLENGE_JOINED", 16, "CHALLENGE_JOINED_ACHIEVEMENT");
        public static final Type ACHIEVEMENT_INVITED_FRIEND = new Type("ACHIEVEMENT_INVITED_FRIEND", 17, "INVITED_FRIEND_ACHIEVEMENT");
        public static final Type ACHIEVEMENT_GENERIC = new Type("ACHIEVEMENT_GENERIC", 18, "ACHIEVEMENT");
        public static final Type ACHIEVEMENT_ONBOARDING_COMPLETE = new Type("ACHIEVEMENT_ONBOARDING_COMPLETE", 19, "ONBOARDING_COMPLETE");
        public static final Type ACHIEVEMENT_ALL_YOUR_BASE = new Type("ACHIEVEMENT_ALL_YOUR_BASE", 20, "ACHIEVEMENT_ALL_YOUR_BASE");
        public static final Type ACHIEVEMENT_BACK_TO_BASICS = new Type("ACHIEVEMENT_BACK_TO_BASICS", 21, "ACHIEVEMENT_BACK_TO_BASICS");
        public static final Type ACHIEVEMENT_JUST_ADD_WATER = new Type("ACHIEVEMENT_JUST_ADD_WATER", 22, "ACHIEVEMENT_JUST_ADD_WATER");
        public static final Type ACHIEVEMENT_LOST_MASTERCLASSER = new Type("ACHIEVEMENT_LOST_MASTERCLASSER", 23, "ACHIEVEMENT_LOST_MASTERCLASSER");
        public static final Type ACHIEVEMENT_MIND_OVER_MATTER = new Type("ACHIEVEMENT_MIND_OVER_MATTER", 24, "ACHIEVEMENT_MIND_OVER_MATTER");
        public static final Type ACHIEVEMENT_DUST_DEVIL = new Type("ACHIEVEMENT_DUST_DEVIL", 25, "ACHIEVEMENT_DUST_DEVIL");
        public static final Type ACHIEVEMENT_ARID_AUTHORITY = new Type("ACHIEVEMENT_ARID_AUTHORITY", 26, "ACHIEVEMENT_ARID_AUTHORITY");
        public static final Type ACHIEVEMENT_MONSTER_MAGUS = new Type("ACHIEVEMENT_MONSTER_MAGUS", 27, "ACHIEVEMENT_MONSTER_MAGUS");
        public static final Type ACHIEVEMENT_UNDEAD_UNDERTAKER = new Type("ACHIEVEMENT_UNDEAD_UNDERTAKER", 28, "ACHIEVEMENT_UNDEAD_UNDERTAKER");
        public static final Type ACHIEVEMENT_PRIMED_FOR_PAINTING = new Type("ACHIEVEMENT_PRIMED_FOR_PAINTING", 29, "ACHIEVEMENT_PRIMED_FOR_PAINTING");
        public static final Type ACHIEVEMENT_PEARLY_PRO = new Type("ACHIEVEMENT_PEARLY_PRO", 30, "ACHIEVEMENT_PEARLY_PRO");
        public static final Type ACHIEVEMENT_TICKLED_PINK = new Type("ACHIEVEMENT_TICKLED_PINK", 31, "ACHIEVEMENT_TICKLED_PINK");
        public static final Type ACHIEVEMENT_ROSY_OUTLOOK = new Type("ACHIEVEMENT_ROSY_OUTLOOK", 32, "ACHIEVEMENT_ROSY_OUTLOOK");
        public static final Type ACHIEVEMENT_BUG_BONANZA = new Type("ACHIEVEMENT_BUG_BONANZA", 33, "ACHIEVEMENT_BUG_BONANZA");
        public static final Type ACHIEVEMENT_BARE_NECESSITIES = new Type("ACHIEVEMENT_BARE_NECESSITIES", 34, "ACHIEVEMENT_BARE_NECESSITIES");
        public static final Type ACHIEVEMENT_FRESHWATER_FRIENDS = new Type("ACHIEVEMENT_FRESHWATER_FRIENDS", 35, "ACHIEVEMENT_FRESHWATER_FRIENDS");
        public static final Type ACHIEVEMENT_GOOD_AS_GOLD = new Type("ACHIEVEMENT_GOOD_AS_GOLD", 36, "ACHIEVEMENT_GOOD_AS_GOLD");
        public static final Type ACHIEVEMENT_ALL_THAT_GLITTERS = new Type("ACHIEVEMENT_ALL_THAT_GLITTERS", 37, "ACHIEVEMENT_ALL_THAT_GLITTERS");
        public static final Type ACHIEVEMENT_BONE_COLLECTOR = new Type("ACHIEVEMENT_BONE_COLLECTOR", 38, "ACHIEVEMENT_BONE_COLLECTOR");
        public static final Type ACHIEVEMENT_SKELETON_CREW = new Type("ACHIEVEMENT_SKELETON_CREW", 39, "ACHIEVEMENT_SKELETON_CREW");
        public static final Type ACHIEVEMENT_SEEING_RED = new Type("ACHIEVEMENT_SEEING_RED", 40, "ACHIEVEMENT_SEEING_RED");
        public static final Type ACHIEVEMENT_RED_LETTER_DAY = new Type("ACHIEVEMENT_RED_LETTER_DAY", 41, "ACHIEVEMENT_RED_LETTER_DAY");
        public static final Type FIRST_DROP = new Type("FIRST_DROP", 42, "FIRST_DROPS");
        public static final Type GUILD_INVITATION = new Type("GUILD_INVITATION", 43, "GUILD_INVITATION");
        public static final Type PARTY_INVITATION = new Type("PARTY_INVITATION", 44, "PARTY_INVITATION");
        public static final Type QUEST_INVITATION = new Type("QUEST_INVITATION", 45, "QUEST_INVITATION");

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{LOGIN_INCENTIVE, NEW_STUFF, NEW_CHAT_MESSAGE, NEW_MYSTERY_ITEMS, GROUP_TASK_NEEDS_WORK, GROUP_TASK_APPROVED, GROUP_TASK_REQUIRES_APPROVAL, UNALLOCATED_STATS_POINTS, WON_CHALLENGE, ITEM_RECEIVED, ACHIEVEMENT_PARTY_UP, ACHIEVEMENT_PARTY_ON, ACHIEVEMENT_BEAST_MASTER, ACHIEVEMENT_MOUNT_MASTER, ACHIEVEMENT_TRIAD_BINGO, ACHIEVEMENT_GUILD_JOINED, ACHIEVEMENT_CHALLENGE_JOINED, ACHIEVEMENT_INVITED_FRIEND, ACHIEVEMENT_GENERIC, ACHIEVEMENT_ONBOARDING_COMPLETE, ACHIEVEMENT_ALL_YOUR_BASE, ACHIEVEMENT_BACK_TO_BASICS, ACHIEVEMENT_JUST_ADD_WATER, ACHIEVEMENT_LOST_MASTERCLASSER, ACHIEVEMENT_MIND_OVER_MATTER, ACHIEVEMENT_DUST_DEVIL, ACHIEVEMENT_ARID_AUTHORITY, ACHIEVEMENT_MONSTER_MAGUS, ACHIEVEMENT_UNDEAD_UNDERTAKER, ACHIEVEMENT_PRIMED_FOR_PAINTING, ACHIEVEMENT_PEARLY_PRO, ACHIEVEMENT_TICKLED_PINK, ACHIEVEMENT_ROSY_OUTLOOK, ACHIEVEMENT_BUG_BONANZA, ACHIEVEMENT_BARE_NECESSITIES, ACHIEVEMENT_FRESHWATER_FRIENDS, ACHIEVEMENT_GOOD_AS_GOLD, ACHIEVEMENT_ALL_THAT_GLITTERS, ACHIEVEMENT_BONE_COLLECTOR, ACHIEVEMENT_SKELETON_CREW, ACHIEVEMENT_SEEING_RED, ACHIEVEMENT_RED_LETTER_DAY, FIRST_DROP, GUILD_INVITATION, PARTY_INVITATION, QUEST_INVITATION};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i10, String str2) {
            this.type = str2;
        }

        public static a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String getType() {
            return this.type;
        }
    }

    public final NotificationData getData() {
        return this.data;
    }

    public final java.lang.reflect.Type getDataType() {
        String str = this.type;
        if (q.d(str, Type.LOGIN_INCENTIVE.getType())) {
            return LoginIncentiveData.class;
        }
        if (q.d(str, Type.NEW_STUFF.getType())) {
            return NewStuffData.class;
        }
        if (q.d(str, Type.NEW_CHAT_MESSAGE.getType())) {
            return NewChatMessageData.class;
        }
        if (q.d(str, Type.GROUP_TASK_NEEDS_WORK.getType())) {
            return GroupTaskNeedsWorkData.class;
        }
        if (q.d(str, Type.GROUP_TASK_APPROVED.getType())) {
            return GroupTaskApprovedData.class;
        }
        if (q.d(str, Type.GROUP_TASK_REQUIRES_APPROVAL.getType())) {
            return GroupTaskRequiresApprovalData.class;
        }
        if (q.d(str, Type.UNALLOCATED_STATS_POINTS.getType())) {
            return UnallocatedPointsData.class;
        }
        if (q.d(str, Type.GUILD_INVITATION.getType())) {
            return GuildInvitationData.class;
        }
        if (q.d(str, Type.PARTY_INVITATION.getType())) {
            return PartyInvitationData.class;
        }
        if (q.d(str, Type.QUEST_INVITATION.getType())) {
            return QuestInvitationData.class;
        }
        if (q.d(str, Type.FIRST_DROP.getType())) {
            return FirstDropData.class;
        }
        if (!q.d(str, Type.ACHIEVEMENT_GENERIC.getType())) {
            if (q.d(str, Type.WON_CHALLENGE.getType())) {
                return ChallengeWonData.class;
            }
            if (q.d(str, Type.ITEM_RECEIVED.getType())) {
                return ItemReceivedData.class;
            }
            if (!q.d(str, Type.ACHIEVEMENT_ALL_YOUR_BASE.getType()) && !q.d(str, Type.ACHIEVEMENT_BACK_TO_BASICS.getType()) && !q.d(str, Type.ACHIEVEMENT_JUST_ADD_WATER.getType()) && !q.d(str, Type.ACHIEVEMENT_LOST_MASTERCLASSER.getType()) && !q.d(str, Type.ACHIEVEMENT_MIND_OVER_MATTER.getType()) && !q.d(str, Type.ACHIEVEMENT_DUST_DEVIL.getType()) && !q.d(str, Type.ACHIEVEMENT_ARID_AUTHORITY.getType()) && !q.d(str, Type.ACHIEVEMENT_MONSTER_MAGUS.getType()) && !q.d(str, Type.ACHIEVEMENT_UNDEAD_UNDERTAKER.getType()) && !q.d(str, Type.ACHIEVEMENT_PRIMED_FOR_PAINTING.getType()) && !q.d(str, Type.ACHIEVEMENT_PEARLY_PRO.getType()) && !q.d(str, Type.ACHIEVEMENT_TICKLED_PINK.getType()) && !q.d(str, Type.ACHIEVEMENT_ROSY_OUTLOOK.getType()) && !q.d(str, Type.ACHIEVEMENT_BUG_BONANZA.getType()) && !q.d(str, Type.ACHIEVEMENT_BARE_NECESSITIES.getType()) && !q.d(str, Type.ACHIEVEMENT_FRESHWATER_FRIENDS.getType())) {
                Type type = Type.ACHIEVEMENT_GOOD_AS_GOLD;
                if (!q.d(str, type.getType()) && !q.d(str, Type.ACHIEVEMENT_ALL_THAT_GLITTERS.getType()) && !q.d(str, type.getType()) && !q.d(str, Type.ACHIEVEMENT_BONE_COLLECTOR.getType()) && !q.d(str, Type.ACHIEVEMENT_SKELETON_CREW.getType()) && !q.d(str, Type.ACHIEVEMENT_SEEING_RED.getType()) && !q.d(str, Type.ACHIEVEMENT_RED_LETTER_DAY.getType())) {
                    return null;
                }
            }
        }
        return AchievementData.class;
    }

    public final String getId() {
        return this.f12934id;
    }

    public final int getPriority() {
        String str = this.type;
        if (q.d(str, Type.NEW_STUFF.getType())) {
            return 1;
        }
        if (q.d(str, Type.GUILD_INVITATION.getType())) {
            return 2;
        }
        if (q.d(str, Type.PARTY_INVITATION.getType())) {
            return 3;
        }
        if (q.d(str, Type.UNALLOCATED_STATS_POINTS.getType())) {
            return 4;
        }
        if (q.d(str, Type.NEW_MYSTERY_ITEMS.getType())) {
            return 5;
        }
        if (q.d(str, Type.NEW_CHAT_MESSAGE.getType())) {
            return 6;
        }
        return 100;
    }

    public final Boolean getSeen() {
        return this.seen;
    }

    public final String getType() {
        return this.type;
    }

    public final void setData(NotificationData notificationData) {
        this.data = notificationData;
    }

    public final void setId(String str) {
        q.i(str, "<set-?>");
        this.f12934id = str;
    }

    public final void setSeen(Boolean bool) {
        this.seen = bool;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
