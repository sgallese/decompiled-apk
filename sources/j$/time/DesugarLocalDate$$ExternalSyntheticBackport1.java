package j$.time;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class DesugarLocalDate$$ExternalSyntheticBackport1 {
    public static /* synthetic */ long m(long j10, long j11) {
        long j12 = j10 / j11;
        return (j10 - (j11 * j12) != 0 && (((j10 ^ j11) >> 63) | 1) < 0) ? j12 - 1 : j12;
    }
}
