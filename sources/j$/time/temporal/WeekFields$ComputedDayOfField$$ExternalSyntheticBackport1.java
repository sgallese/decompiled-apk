package j$.time.temporal;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class WeekFields$ComputedDayOfField$$ExternalSyntheticBackport1 {
    public static /* synthetic */ int m(int i10, int i11) {
        int i12 = i10 % i11;
        if (i12 == 0) {
            return 0;
        }
        return (((i10 ^ i11) >> 31) | 1) > 0 ? i12 : i12 + i11;
    }
}
