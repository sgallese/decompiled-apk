package j$.time;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class Clock$TickClock$$ExternalSyntheticBackport0 {
    public static /* synthetic */ long m(long j10, long j11) {
        long j12 = j10 % j11;
        if (j12 == 0) {
            return 0L;
        }
        return (((j10 ^ j11) >> 63) | 1) > 0 ? j12 : j12 + j11;
    }
}
