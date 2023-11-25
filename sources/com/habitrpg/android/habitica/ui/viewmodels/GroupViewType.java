package com.habitrpg.android.habitica.ui.viewmodels;

import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import jc.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupViewModel.kt */
/* loaded from: classes4.dex */
public final class GroupViewType {
    private static final /* synthetic */ jc.a $ENTRIES;
    private static final /* synthetic */ GroupViewType[] $VALUES;
    private final String order;
    public static final GroupViewType PARTY = new GroupViewType("PARTY", 0, NavigationDrawerFragment.SIDEBAR_PARTY);
    public static final GroupViewType GUILD = new GroupViewType("GUILD", 1, "guild");

    private static final /* synthetic */ GroupViewType[] $values() {
        return new GroupViewType[]{PARTY, GUILD};
    }

    static {
        GroupViewType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private GroupViewType(String str, int i10, String str2) {
        this.order = str2;
    }

    public static jc.a<GroupViewType> getEntries() {
        return $ENTRIES;
    }

    public static GroupViewType valueOf(String str) {
        return (GroupViewType) Enum.valueOf(GroupViewType.class, str);
    }

    public static GroupViewType[] values() {
        return (GroupViewType[]) $VALUES.clone();
    }

    public final String getOrder$Habitica_2311256681_prodRelease() {
        return this.order;
    }
}
