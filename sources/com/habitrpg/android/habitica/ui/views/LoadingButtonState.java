package com.habitrpg.android.habitica.ui.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoadingButton.kt */
/* loaded from: classes4.dex */
public final class LoadingButtonState {
    private static final /* synthetic */ jc.a $ENTRIES;
    private static final /* synthetic */ LoadingButtonState[] $VALUES;
    public static final LoadingButtonState CONTENT = new LoadingButtonState("CONTENT", 0);
    public static final LoadingButtonState DISABLED = new LoadingButtonState("DISABLED", 1);
    public static final LoadingButtonState LOADING = new LoadingButtonState("LOADING", 2);
    public static final LoadingButtonState FAILED = new LoadingButtonState("FAILED", 3);
    public static final LoadingButtonState SUCCESS = new LoadingButtonState("SUCCESS", 4);

    private static final /* synthetic */ LoadingButtonState[] $values() {
        return new LoadingButtonState[]{CONTENT, DISABLED, LOADING, FAILED, SUCCESS};
    }

    static {
        LoadingButtonState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jc.b.a($values);
    }

    private LoadingButtonState(String str, int i10) {
    }

    public static jc.a<LoadingButtonState> getEntries() {
        return $ENTRIES;
    }

    public static LoadingButtonState valueOf(String str) {
        return (LoadingButtonState) Enum.valueOf(LoadingButtonState.class, str);
    }

    public static LoadingButtonState[] values() {
        return (LoadingButtonState[]) $VALUES.clone();
    }
}
