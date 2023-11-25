package j$.time;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class Clock$OffsetClock$$ExternalSyntheticBackport0 {
    public static /* synthetic */ long m(long j10, long j11) {
        long j12 = j10 + j11;
        if (((j11 ^ j10) < 0) || ((j10 ^ j12) >= 0)) {
            return j12;
        }
        throw new ArithmeticException();
    }
}
