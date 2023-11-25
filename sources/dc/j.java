package dc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Lazy.kt */
/* loaded from: classes4.dex */
public final class j {
    private static final /* synthetic */ jc.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j SYNCHRONIZED = new j("SYNCHRONIZED", 0);
    public static final j PUBLICATION = new j("PUBLICATION", 1);
    public static final j NONE = new j("NONE", 2);

    private static final /* synthetic */ j[] $values() {
        return new j[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    static {
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jc.b.a($values);
    }

    private j(String str, int i10) {
    }

    public static jc.a<j> getEntries() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
