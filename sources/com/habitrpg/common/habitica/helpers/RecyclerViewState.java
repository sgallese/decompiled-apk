package com.habitrpg.common.habitica.helpers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecyclerViewEmptySupport.kt */
/* loaded from: classes4.dex */
public final class RecyclerViewState {
    private static final /* synthetic */ jc.a $ENTRIES;
    private static final /* synthetic */ RecyclerViewState[] $VALUES;
    public static final RecyclerViewState LOADING = new RecyclerViewState("LOADING", 0);
    public static final RecyclerViewState EMPTY = new RecyclerViewState("EMPTY", 1);
    public static final RecyclerViewState DISPLAYING_DATA = new RecyclerViewState("DISPLAYING_DATA", 2);
    public static final RecyclerViewState FAILED = new RecyclerViewState("FAILED", 3);

    private static final /* synthetic */ RecyclerViewState[] $values() {
        return new RecyclerViewState[]{LOADING, EMPTY, DISPLAYING_DATA, FAILED};
    }

    static {
        RecyclerViewState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jc.b.a($values);
    }

    private RecyclerViewState(String str, int i10) {
    }

    public static jc.a<RecyclerViewState> getEntries() {
        return $ENTRIES;
    }

    public static RecyclerViewState valueOf(String str) {
        return (RecyclerViewState) Enum.valueOf(RecyclerViewState.class, str);
    }

    public static RecyclerViewState[] values() {
        return (RecyclerViewState[]) $VALUES.clone();
    }
}
