package j$.time.chrono;

import j$.time.Clock$OffsetClock$$ExternalSyntheticBackport0;
import j$.time.Duration$$ExternalSyntheticBackport0;
import j$.time.LocalTime;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class ChronoLocalDateImpl implements ChronoLocalDate, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.ChronoLocalDateImpl$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoUnit;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            $SwitchMap$java$time$temporal$ChronoUnit = iArr;
            try {
                iArr[ChronoUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChronoLocalDate ensureValid(Chronology chronology, Temporal temporal) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) temporal;
        if (chronology.equals(chronoLocalDate.getChronology())) {
            return chronoLocalDate;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + chronology.getId() + ", actual: " + chronoLocalDate.getChronology().getId());
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public /* synthetic */ Temporal adjustInto(Temporal temporal) {
        Temporal with;
        with = temporal.with(ChronoField.EPOCH_DAY, toEpochDay());
        return with;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public /* synthetic */ ChronoLocalDateTime atTime(LocalTime localTime) {
        ChronoLocalDateTime of;
        of = ChronoLocalDateTimeImpl.of(this, localTime);
        return of;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDate
    public /* synthetic */ int compareTo(ChronoLocalDate chronoLocalDate) {
        return ChronoLocalDate.CC.$default$compareTo((ChronoLocalDate) this, chronoLocalDate);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ChronoLocalDate chronoLocalDate) {
        int compareTo;
        compareTo = compareTo((ChronoLocalDate) chronoLocalDate);
        return compareTo;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && compareTo((ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ int get(TemporalField temporalField) {
        return TemporalAccessor.CC.$default$get(this, temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public /* synthetic */ Era getEra() {
        Era eraOf;
        eraOf = getChronology().eraOf(get(ChronoField.ERA));
        return eraOf;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return getChronology().hashCode() ^ ((int) (epochDay ^ (epochDay >>> 32)));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public /* synthetic */ boolean isLeapYear() {
        boolean isLeapYear;
        isLeapYear = getChronology().isLeapYear(getLong(ChronoField.YEAR));
        return isLeapYear;
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean isSupported(TemporalField temporalField) {
        return ChronoLocalDate.CC.$default$isSupported(this, temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public /* synthetic */ int lengthOfYear() {
        return ChronoLocalDate.CC.$default$lengthOfYear(this);
    }

    @Override // j$.time.temporal.Temporal
    public ChronoLocalDate minus(long j10, TemporalUnit temporalUnit) {
        ChronoLocalDate ensureValid;
        ensureValid = ensureValid(getChronology(), Temporal.CC.$default$minus(this, j10, temporalUnit));
        return ensureValid;
    }

    @Override // j$.time.temporal.Temporal
    public ChronoLocalDate plus(long j10, TemporalUnit temporalUnit) {
        long m10;
        long m11;
        long m12;
        long m13;
        if (temporalUnit instanceof ChronoUnit) {
            switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusDays(j10);
                case 2:
                    m10 = Duration$$ExternalSyntheticBackport0.m(j10, 7);
                    return plusDays(m10);
                case 3:
                    return plusMonths(j10);
                case 4:
                    return plusYears(j10);
                case 5:
                    m11 = Duration$$ExternalSyntheticBackport0.m(j10, 10);
                    return plusYears(m11);
                case 6:
                    m12 = Duration$$ExternalSyntheticBackport0.m(j10, 100);
                    return plusYears(m12);
                case 7:
                    m13 = Duration$$ExternalSyntheticBackport0.m(j10, 1000);
                    return plusYears(m13);
                case 8:
                    ChronoField chronoField = ChronoField.ERA;
                    return with((TemporalField) chronoField, Clock$OffsetClock$$ExternalSyntheticBackport0.m(getLong(chronoField), j10));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
            }
        }
        return ChronoLocalDate.CC.$default$plus(this, j10, temporalUnit);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public ChronoLocalDate plus(TemporalAmount temporalAmount) {
        return ChronoLocalDate.CC.$default$plus(this, temporalAmount);
    }

    abstract ChronoLocalDate plusDays(long j10);

    abstract ChronoLocalDate plusMonths(long j10);

    abstract ChronoLocalDate plusYears(long j10);

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ Object query(TemporalQuery temporalQuery) {
        return ChronoLocalDate.CC.$default$query(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ ValueRange range(TemporalField temporalField) {
        return TemporalAccessor.CC.$default$range(this, temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public /* synthetic */ long toEpochDay() {
        long j10;
        j10 = getLong(ChronoField.EPOCH_DAY);
        return j10;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        long j10 = getLong(ChronoField.YEAR_OF_ERA);
        long j11 = getLong(ChronoField.MONTH_OF_YEAR);
        long j12 = getLong(ChronoField.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(getChronology().toString());
        sb2.append(" ");
        sb2.append(getEra());
        sb2.append(" ");
        sb2.append(j10);
        sb2.append(j11 < 10 ? "-0" : "-");
        sb2.append(j11);
        sb2.append(j12 >= 10 ? "-" : "-0");
        sb2.append(j12);
        return sb2.toString();
    }

    @Override // j$.time.temporal.Temporal
    public ChronoLocalDate with(TemporalAdjuster temporalAdjuster) {
        return ChronoLocalDate.CC.$default$with(this, temporalAdjuster);
    }

    @Override // j$.time.temporal.Temporal
    public ChronoLocalDate with(TemporalField temporalField, long j10) {
        return ChronoLocalDate.CC.$default$with(this, temporalField, j10);
    }
}
