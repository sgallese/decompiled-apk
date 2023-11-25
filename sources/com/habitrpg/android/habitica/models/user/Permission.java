package com.habitrpg.android.habitica.models.user;

import jc.a;
import jc.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: User.kt */
/* loaded from: classes4.dex */
public final class Permission {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Permission[] $VALUES;
    public static final Permission MODERATOR = new Permission("MODERATOR", 0);
    public static final Permission USER_SUPPORT = new Permission("USER_SUPPORT", 1);

    private static final /* synthetic */ Permission[] $values() {
        return new Permission[]{MODERATOR, USER_SUPPORT};
    }

    static {
        Permission[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Permission(String str, int i10) {
    }

    public static a<Permission> getEntries() {
        return $ENTRIES;
    }

    public static Permission valueOf(String str) {
        return (Permission) Enum.valueOf(Permission.class, str);
    }

    public static Permission[] values() {
        return (Permission[]) $VALUES.clone();
    }
}
