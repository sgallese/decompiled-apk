package j$.time.format;

/* loaded from: classes2.dex */
public enum TextStyle {
    FULL(2, 0),
    FULL_STANDALONE(32770, 0),
    SHORT(1, 1),
    SHORT_STANDALONE(32769, 1),
    NARROW(4, 1),
    NARROW_STANDALONE(32772, 1);

    private final int calendarStyle;
    private final int zoneNameStyleIndex;

    TextStyle(int i10, int i11) {
        this.calendarStyle = i10;
        this.zoneNameStyleIndex = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zoneNameStyleIndex() {
        return this.zoneNameStyleIndex;
    }
}
