package com.habitrpg.android.habitica.ui.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoadingButton.kt */
/* loaded from: classes4.dex */
public final class LoadingButtonType {
    private static final /* synthetic */ jc.a $ENTRIES;
    private static final /* synthetic */ LoadingButtonType[] $VALUES;
    public static final LoadingButtonType NORMAL = new LoadingButtonType("NORMAL", 0);
    public static final LoadingButtonType DESTRUCTIVE = new LoadingButtonType("DESTRUCTIVE", 1);

    private static final /* synthetic */ LoadingButtonType[] $values() {
        return new LoadingButtonType[]{NORMAL, DESTRUCTIVE};
    }

    static {
        LoadingButtonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jc.b.a($values);
    }

    private LoadingButtonType(String str, int i10) {
    }

    public static jc.a<LoadingButtonType> getEntries() {
        return $ENTRIES;
    }

    public static LoadingButtonType valueOf(String str) {
        return (LoadingButtonType) Enum.valueOf(LoadingButtonType.class, str);
    }

    public static LoadingButtonType[] values() {
        return (LoadingButtonType[]) $VALUES.clone();
    }
}
