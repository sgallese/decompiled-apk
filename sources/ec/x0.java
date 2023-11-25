package ec;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AbstractIterator.kt */
/* loaded from: classes4.dex */
final class x0 {
    private static final /* synthetic */ jc.a $ENTRIES;
    private static final /* synthetic */ x0[] $VALUES;
    public static final x0 Ready = new x0("Ready", 0);
    public static final x0 NotReady = new x0("NotReady", 1);
    public static final x0 Done = new x0("Done", 2);
    public static final x0 Failed = new x0("Failed", 3);

    private static final /* synthetic */ x0[] $values() {
        return new x0[]{Ready, NotReady, Done, Failed};
    }

    static {
        x0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jc.b.a($values);
    }

    private x0(String str, int i10) {
    }

    public static jc.a<x0> getEntries() {
        return $ENTRIES;
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) $VALUES.clone();
    }
}
