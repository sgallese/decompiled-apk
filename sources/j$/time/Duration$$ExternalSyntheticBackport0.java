package j$.time;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class Duration$$ExternalSyntheticBackport0 {
    public static /* synthetic */ long m(long j10, long j11) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j11);
        if (numberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        if (numberOfLeadingZeros >= 64) {
            if ((j10 >= 0) | (j11 != Long.MIN_VALUE)) {
                long j12 = j10 * j11;
                if (j10 == 0 || j12 / j10 == j11) {
                    return j12;
                }
            }
        }
        throw new ArithmeticException();
    }
}
