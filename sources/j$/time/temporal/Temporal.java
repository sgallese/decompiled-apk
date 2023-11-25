package j$.time.temporal;

/* loaded from: classes2.dex */
public interface Temporal extends TemporalAccessor {

    /* renamed from: j$.time.temporal.Temporal$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class CC {
        public static Temporal $default$minus(Temporal temporal, long j10, TemporalUnit temporalUnit) {
            long j11;
            if (j10 == Long.MIN_VALUE) {
                temporal = temporal.plus(Long.MAX_VALUE, temporalUnit);
                j11 = 1;
            } else {
                j11 = -j10;
            }
            return temporal.plus(j11, temporalUnit);
        }
    }

    Temporal minus(long j10, TemporalUnit temporalUnit);

    Temporal plus(long j10, TemporalUnit temporalUnit);

    Temporal with(TemporalAdjuster temporalAdjuster);

    Temporal with(TemporalField temporalField, long j10);
}
