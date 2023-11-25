package j$.time.chrono;

import j$.time.Clock$TickClock$$ExternalSyntheticBackport0;
import j$.time.DesugarLocalDate$$ExternalSyntheticBackport1;
import j$.time.LocalTime;
import j$.time.Period$$ExternalSyntheticBackport3;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* loaded from: classes2.dex */
public final class HijrahDate extends ChronoLocalDateImpl {
    private static final long serialVersionUID = -5207853542612002020L;
    private final transient HijrahChronology chrono;
    private final transient int dayOfMonth;
    private final transient int monthOfYear;
    private final transient int prolepticYear;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.HijrahDate$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;

        static {
            int[] iArr = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr;
            try {
                iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.DAY_OF_WEEK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.EPOCH_DAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.MONTH_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.PROLEPTIC_MONTH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR_OF_ERA.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ERA.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private HijrahDate(HijrahChronology hijrahChronology, int i10, int i11, int i12) {
        hijrahChronology.getEpochDay(i10, i11, i12);
        this.chrono = hijrahChronology;
        this.prolepticYear = i10;
        this.monthOfYear = i11;
        this.dayOfMonth = i12;
    }

    private HijrahDate(HijrahChronology hijrahChronology, long j10) {
        int[] hijrahDateInfo = hijrahChronology.getHijrahDateInfo((int) j10);
        this.chrono = hijrahChronology;
        this.prolepticYear = hijrahDateInfo[0];
        this.monthOfYear = hijrahDateInfo[1];
        this.dayOfMonth = hijrahDateInfo[2];
    }

    private int getDayOfWeek() {
        return HijrahDate$$ExternalSyntheticBackport0.m(toEpochDay() + 3, 7) + 1;
    }

    private int getDayOfYear() {
        return this.chrono.getDayOfYear(this.prolepticYear, this.monthOfYear) + this.dayOfMonth;
    }

    private int getEraValue() {
        return this.prolepticYear > 1 ? 1 : 0;
    }

    private long getProlepticMonth() {
        return ((this.prolepticYear * 12) + this.monthOfYear) - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HijrahDate of(HijrahChronology hijrahChronology, int i10, int i11, int i12) {
        return new HijrahDate(hijrahChronology, i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HijrahDate ofEpochDay(HijrahChronology hijrahChronology, long j10) {
        return new HijrahDate(hijrahChronology, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HijrahDate readExternal(ObjectInput objectInput) {
        return ((HijrahChronology) objectInput.readObject()).date(objectInput.readInt(), (int) objectInput.readByte(), (int) objectInput.readByte());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private HijrahDate resolvePreviousValid(int i10, int i11, int i12) {
        int monthLength = this.chrono.getMonthLength(i10, i11);
        if (i12 > monthLength) {
            i12 = monthLength;
        }
        return of(this.chrono, i10, i11, i12);
    }

    private Object writeReplace() {
        return new Ser((byte) 6, this);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime atTime(LocalTime localTime) {
        return super.atTime(localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HijrahDate) {
            HijrahDate hijrahDate = (HijrahDate) obj;
            return this.prolepticYear == hijrahDate.prolepticYear && this.monthOfYear == hijrahDate.monthOfYear && this.dayOfMonth == hijrahDate.dayOfMonth && getChronology().equals(hijrahDate.getChronology());
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public HijrahChronology getChronology() {
        return this.chrono;
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.chrono.ChronoLocalDate
    public HijrahEra getEra() {
        return HijrahEra.AH;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (temporalField instanceof ChronoField) {
            switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()]) {
                case 1:
                    i10 = this.dayOfMonth;
                    break;
                case 2:
                    i10 = getDayOfYear();
                    break;
                case 3:
                    i11 = this.dayOfMonth;
                    i13 = (i11 - 1) / 7;
                    i10 = i13 + 1;
                    break;
                case 4:
                    i10 = getDayOfWeek();
                    break;
                case 5:
                    i12 = this.dayOfMonth;
                    i13 = (i12 - 1) % 7;
                    i10 = i13 + 1;
                    break;
                case 6:
                    i12 = getDayOfYear();
                    i13 = (i12 - 1) % 7;
                    i10 = i13 + 1;
                    break;
                case 7:
                    return toEpochDay();
                case 8:
                    i11 = getDayOfYear();
                    i13 = (i11 - 1) / 7;
                    i10 = i13 + 1;
                    break;
                case 9:
                    i10 = this.monthOfYear;
                    break;
                case 10:
                    return getProlepticMonth();
                case 11:
                case 12:
                    i10 = this.prolepticYear;
                    break;
                case 13:
                    i10 = getEraValue();
                    break;
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
            }
            return i10;
        }
        return temporalField.getFrom(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i10 = this.prolepticYear;
        int i11 = this.monthOfYear;
        int i12 = this.dayOfMonth;
        return (((i10 << 11) + (i11 << 6)) + i12) ^ (getChronology().getId().hashCode() ^ (i10 & (-2048)));
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.chrono.ChronoLocalDate
    public boolean isLeapYear() {
        return this.chrono.isLeapYear(this.prolepticYear);
    }

    public int lengthOfMonth() {
        return this.chrono.getMonthLength(this.prolepticYear, this.monthOfYear);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.chrono.ChronoLocalDate
    public int lengthOfYear() {
        return this.chrono.getYearLength(this.prolepticYear);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.temporal.Temporal
    public HijrahDate minus(long j10, TemporalUnit temporalUnit) {
        return (HijrahDate) super.minus(j10, temporalUnit);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.temporal.Temporal
    public HijrahDate plus(long j10, TemporalUnit temporalUnit) {
        return (HijrahDate) super.plus(j10, temporalUnit);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.chrono.ChronoLocalDate
    public HijrahDate plus(TemporalAmount temporalAmount) {
        return (HijrahDate) super.plus(temporalAmount);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    public HijrahDate plusDays(long j10) {
        return new HijrahDate(this.chrono, toEpochDay() + j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    public HijrahDate plusMonths(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.prolepticYear * 12) + ((long) (this.monthOfYear - 1)) + j10;
        return resolvePreviousValid(this.chrono.checkValidYear(DesugarLocalDate$$ExternalSyntheticBackport1.m(j11, 12L)), ((int) Clock$TickClock$$ExternalSyntheticBackport0.m(j11, 12L)) + 1, this.dayOfMonth);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    public HijrahDate plusYears(long j10) {
        return j10 == 0 ? this : resolvePreviousValid(Period$$ExternalSyntheticBackport3.m(this.prolepticYear, (int) j10), this.monthOfYear, this.dayOfMonth);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (isSupported(temporalField)) {
                ChronoField chronoField = (ChronoField) temporalField;
                int i10 = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
                return i10 != 1 ? i10 != 2 ? i10 != 3 ? getChronology().range(chronoField) : ValueRange.of(1L, 5L) : ValueRange.of(1L, lengthOfYear()) : ValueRange.of(1L, lengthOfMonth());
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        return this.chrono.getEpochDay(this.prolepticYear, this.monthOfYear, this.dayOfMonth);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.chrono.ChronoLocalDate
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.temporal.Temporal
    public HijrahDate with(TemporalAdjuster temporalAdjuster) {
        return (HijrahDate) super.with(temporalAdjuster);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, j$.time.temporal.Temporal
    public HijrahDate with(TemporalField temporalField, long j10) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            this.chrono.range(chronoField).checkValidValue(j10, chronoField);
            int i10 = (int) j10;
            switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()]) {
                case 1:
                    return resolvePreviousValid(this.prolepticYear, this.monthOfYear, i10);
                case 2:
                    return plusDays(Math.min(i10, lengthOfYear()) - getDayOfYear());
                case 3:
                    return plusDays((j10 - getLong(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
                case 4:
                    return plusDays(j10 - getDayOfWeek());
                case 5:
                    return plusDays(j10 - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 6:
                    return plusDays(j10 - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 7:
                    return new HijrahDate(this.chrono, j10);
                case 8:
                    return plusDays((j10 - getLong(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
                case 9:
                    return resolvePreviousValid(this.prolepticYear, i10, this.dayOfMonth);
                case 10:
                    return plusMonths(j10 - getProlepticMonth());
                case 11:
                    if (this.prolepticYear < 1) {
                        i10 = 1 - i10;
                    }
                    return resolvePreviousValid(i10, this.monthOfYear, this.dayOfMonth);
                case 12:
                    return resolvePreviousValid(i10, this.monthOfYear, this.dayOfMonth);
                case 13:
                    return resolvePreviousValid(1 - this.prolepticYear, this.monthOfYear, this.dayOfMonth);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
            }
        }
        return (HijrahDate) super.with(temporalField, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(getChronology());
        objectOutput.writeInt(get(ChronoField.YEAR));
        objectOutput.writeByte(get(ChronoField.MONTH_OF_YEAR));
        objectOutput.writeByte(get(ChronoField.DAY_OF_MONTH));
    }
}
