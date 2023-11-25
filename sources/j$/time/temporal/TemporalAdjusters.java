package j$.time.temporal;

import j$.time.DayOfWeek;

/* loaded from: classes2.dex */
public abstract class TemporalAdjusters {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Temporal lambda$lastDayOfMonth$2(Temporal temporal) {
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return temporal.with(chronoField, temporal.range(chronoField).getMaximum());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Temporal lambda$nextOrSame$10(int i10, Temporal temporal) {
        int i11 = temporal.get(ChronoField.DAY_OF_WEEK);
        if (i11 == i10) {
            return temporal;
        }
        return temporal.plus(i11 - i10 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Temporal lambda$previousOrSame$12(int i10, Temporal temporal) {
        int i11 = temporal.get(ChronoField.DAY_OF_WEEK);
        if (i11 == i10) {
            return temporal;
        }
        return temporal.minus(i10 - i11 >= 0 ? 7 - r2 : -r2, ChronoUnit.DAYS);
    }

    public static TemporalAdjuster lastDayOfMonth() {
        return new TemporalAdjuster() { // from class: j$.time.temporal.TemporalAdjusters$$ExternalSyntheticLambda12
            @Override // j$.time.temporal.TemporalAdjuster
            public final Temporal adjustInto(Temporal temporal) {
                return TemporalAdjusters.lambda$lastDayOfMonth$2(temporal);
            }
        };
    }

    public static TemporalAdjuster nextOrSame(DayOfWeek dayOfWeek) {
        final int value = dayOfWeek.getValue();
        return new TemporalAdjuster() { // from class: j$.time.temporal.TemporalAdjusters$$ExternalSyntheticLambda11
            @Override // j$.time.temporal.TemporalAdjuster
            public final Temporal adjustInto(Temporal temporal) {
                return TemporalAdjusters.lambda$nextOrSame$10(value, temporal);
            }
        };
    }

    public static TemporalAdjuster previousOrSame(DayOfWeek dayOfWeek) {
        final int value = dayOfWeek.getValue();
        return new TemporalAdjuster() { // from class: j$.time.temporal.TemporalAdjusters$$ExternalSyntheticLambda3
            @Override // j$.time.temporal.TemporalAdjuster
            public final Temporal adjustInto(Temporal temporal) {
                return TemporalAdjusters.lambda$previousOrSame$12(value, temporal);
            }
        };
    }
}
