package com.habitrpg.android.habitica.models.user;

import jc.a;
import jc.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserQuestStatus.kt */
/* loaded from: classes4.dex */
public final class UserQuestStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UserQuestStatus[] $VALUES;
    public static final UserQuestStatus NO_QUEST = new UserQuestStatus("NO_QUEST", 0);
    public static final UserQuestStatus QUEST_COLLECT = new UserQuestStatus("QUEST_COLLECT", 1);
    public static final UserQuestStatus QUEST_BOSS = new UserQuestStatus("QUEST_BOSS", 2);
    public static final UserQuestStatus QUEST_UNKNOWN = new UserQuestStatus("QUEST_UNKNOWN", 3);

    private static final /* synthetic */ UserQuestStatus[] $values() {
        return new UserQuestStatus[]{NO_QUEST, QUEST_COLLECT, QUEST_BOSS, QUEST_UNKNOWN};
    }

    static {
        UserQuestStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UserQuestStatus(String str, int i10) {
    }

    public static a<UserQuestStatus> getEntries() {
        return $ENTRIES;
    }

    public static UserQuestStatus valueOf(String str) {
        return (UserQuestStatus) Enum.valueOf(UserQuestStatus.class, str);
    }

    public static UserQuestStatus[] values() {
        return (UserQuestStatus[]) $VALUES.clone();
    }
}
