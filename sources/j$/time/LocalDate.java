package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.IsoChronology;
import j$.time.chrono.IsoEra;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalDate implements Temporal, TemporalAdjuster, ChronoLocalDate, Serializable {
    private static final long serialVersionUID = 2942565459149668126L;
    private final short day;
    private final short month;
    private final int year;
    public static final LocalDate MIN = of(-999999999, 1, 1);
    public static final LocalDate MAX = of(999999999, 12, 31);
    public static final LocalDate EPOCH = of(1970, 1, 1);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.LocalDate$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;
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
            int[] iArr2 = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr2;
            try {
                iArr2[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.DAY_OF_WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.EPOCH_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.PROLEPTIC_MONTH.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ERA.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private LocalDate(int i10, int i11, int i12) {
        this.year = i10;
        this.month = (short) i11;
        this.day = (short) i12;
    }

    private static LocalDate create(int i10, int i11, int i12) {
        int i13 = 28;
        if (i12 > 28) {
            if (i11 != 2) {
                i13 = (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31;
            } else if (IsoChronology.INSTANCE.isLeapYear(i10)) {
                i13 = 29;
            }
            if (i12 > i13) {
                if (i12 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i10 + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date '" + Month.of(i11).name() + " " + i12 + "'");
            }
        }
        return new LocalDate(i10, i11, i12);
    }

    public static LocalDate from(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.query(TemporalQueries.localDate());
        if (localDate != null) {
            return localDate;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    private int get0(TemporalField temporalField) {
        switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.day;
            case 2:
                return getDayOfYear();
            case 3:
                return ((this.day - 1) / 7) + 1;
            case 4:
                int i10 = this.year;
                return i10 >= 1 ? i10 : 1 - i10;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.day - 1) % 7) + 1;
            case 7:
                return ((getDayOfYear() - 1) % 7) + 1;
            case 8:
                throw new UnsupportedTemporalTypeException("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((getDayOfYear() - 1) / 7) + 1;
            case 10:
                return this.month;
            case 11:
                throw new UnsupportedTemporalTypeException("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.year;
            case 13:
                return this.year >= 1 ? 1 : 0;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
    }

    private long getProlepticMonth() {
        return ((this.year * 12) + this.month) - 1;
    }

    public static LocalDate now() {
        return now(Clock.systemDefaultZone());
    }

    public static LocalDate now(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        return ofInstant(clock.instant(), clock.getZone());
    }

    public static LocalDate of(int i10, int i11, int i12) {
        ChronoField.YEAR.checkValidValue(i10);
        ChronoField.MONTH_OF_YEAR.checkValidValue(i11);
        ChronoField.DAY_OF_MONTH.checkValidValue(i12);
        return create(i10, i11, i12);
    }

    public static LocalDate of(int i10, Month month, int i11) {
        ChronoField.YEAR.checkValidValue(i10);
        Objects.requireNonNull(month, "month");
        ChronoField.DAY_OF_MONTH.checkValidValue(i11);
        return create(i10, month.getValue(), i11);
    }

    public static LocalDate ofEpochDay(long j10) {
        long j11;
        ChronoField.EPOCH_DAY.checkValidValue(j10);
        long j12 = (j10 + 719528) - 60;
        if (j12 < 0) {
            long j13 = ((j12 + 1) / 146097) - 1;
            j11 = j13 * 400;
            j12 += (-j13) * 146097;
        } else {
            j11 = 0;
        }
        long j14 = ((j12 * 400) + 591) / 146097;
        long j15 = j12 - ((((j14 * 365) + (j14 / 4)) - (j14 / 100)) + (j14 / 400));
        if (j15 < 0) {
            j14--;
            j15 = j12 - ((((365 * j14) + (j14 / 4)) - (j14 / 100)) + (j14 / 400));
        }
        int i10 = (int) j15;
        int i11 = ((i10 * 5) + 2) / 153;
        return new LocalDate(ChronoField.YEAR.checkValidIntValue(j14 + j11 + (i11 / 10)), ((i11 + 2) % 12) + 1, (i10 - (((i11 * 306) + 5) / 10)) + 1);
    }

    public static LocalDate ofInstant(Instant instant, ZoneId zoneId) {
        long m10;
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        m10 = DesugarLocalDate$$ExternalSyntheticBackport1.m(instant.getEpochSecond() + zoneId.getRules().getOffset(instant).getTotalSeconds(), 86400);
        return ofEpochDay(m10);
    }

    public static LocalDate ofYearDay(int i10, int i11) {
        long j10 = i10;
        ChronoField.YEAR.checkValidValue(j10);
        ChronoField.DAY_OF_YEAR.checkValidValue(i11);
        boolean isLeapYear = IsoChronology.INSTANCE.isLeapYear(j10);
        if (i11 != 366 || isLeapYear) {
            Month of = Month.of(((i11 - 1) / 31) + 1);
            if (i11 > (of.firstDayOfYear(isLeapYear) + of.length(isLeapYear)) - 1) {
                of = of.plus(1L);
            }
            return new LocalDate(i10, of.getValue(), (i11 - of.firstDayOfYear(isLeapYear)) + 1);
        }
        throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i10 + "' is not a leap year");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LocalDate readExternal(DataInput dataInput) {
        return of(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private static LocalDate resolvePreviousValid(int i10, int i11, int i12) {
        int i13;
        if (i11 != 2) {
            if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
                i13 = 30;
            }
            return new LocalDate(i10, i11, i12);
        }
        i13 = IsoChronology.INSTANCE.isLeapYear((long) i10) ? 29 : 28;
        i12 = Math.min(i12, i13);
        return new LocalDate(i10, i11, i12);
    }

    private Object writeReplace() {
        return new Ser((byte) 3, this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        return ChronoLocalDate.CC.$default$adjustInto(this, temporal);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public LocalDateTime atTime(LocalTime localTime) {
        return LocalDateTime.of(this, localTime);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? compareTo0((LocalDate) chronoLocalDate) : ChronoLocalDate.CC.$default$compareTo((ChronoLocalDate) this, chronoLocalDate);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int compareTo0(LocalDate localDate) {
        int i10 = this.year - localDate.year;
        if (i10 == 0) {
            int i11 = this.month - localDate.month;
            return i11 == 0 ? this.day - localDate.day : i11;
        }
        return i10;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && compareTo0((LocalDate) obj) == 0;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? get0(temporalField) : TemporalAccessor.CC.$default$get(this, temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public IsoChronology getChronology() {
        return IsoChronology.INSTANCE;
    }

    public int getDayOfMonth() {
        return this.day;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.of(LocalDate$$ExternalSyntheticBackport0.m(toEpochDay() + 3, 7) + 1);
    }

    public int getDayOfYear() {
        return (getMonth().firstDayOfYear(isLeapYear()) + this.day) - 1;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public IsoEra getEra() {
        return getYear() >= 1 ? IsoEra.CE : IsoEra.BCE;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.EPOCH_DAY ? toEpochDay() : temporalField == ChronoField.PROLEPTIC_MONTH ? getProlepticMonth() : get0(temporalField) : temporalField.getFrom(this);
    }

    public Month getMonth() {
        return Month.of(this.month);
    }

    public int getMonthValue() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i10 = this.year;
        return (((i10 << 11) + (this.month << 6)) + this.day) ^ (i10 & (-2048));
    }

    public boolean isBefore(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? compareTo0((LocalDate) chronoLocalDate) < 0 : ChronoLocalDate.CC.$default$isBefore(this, chronoLocalDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean isLeapYear() {
        return IsoChronology.INSTANCE.isLeapYear(this.year);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        return ChronoLocalDate.CC.$default$isSupported(this, temporalField);
    }

    public int lengthOfMonth() {
        short s10 = this.month;
        return s10 != 2 ? (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31 : isLeapYear() ? 29 : 28;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    @Override // j$.time.temporal.Temporal
    public LocalDate minus(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j10, temporalUnit);
    }

    public LocalDate minusYears(long j10) {
        return j10 == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1L) : plusYears(-j10);
    }

    @Override // j$.time.temporal.Temporal
    public LocalDate plus(long j10, TemporalUnit temporalUnit) {
        long m10;
        long m11;
        long m12;
        if (temporalUnit instanceof ChronoUnit) {
            switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusDays(j10);
                case 2:
                    return plusWeeks(j10);
                case 3:
                    return plusMonths(j10);
                case 4:
                    return plusYears(j10);
                case 5:
                    m10 = Duration$$ExternalSyntheticBackport0.m(j10, 10);
                    return plusYears(m10);
                case 6:
                    m11 = Duration$$ExternalSyntheticBackport0.m(j10, 100);
                    return plusYears(m11);
                case 7:
                    m12 = Duration$$ExternalSyntheticBackport0.m(j10, 1000);
                    return plusYears(m12);
                case 8:
                    ChronoField chronoField = ChronoField.ERA;
                    return with((TemporalField) chronoField, Clock$OffsetClock$$ExternalSyntheticBackport0.m(getLong(chronoField), j10));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
            }
        }
        return (LocalDate) temporalUnit.addTo(this, j10);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public LocalDate plus(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof Period) {
            return plusMonths(((Period) temporalAmount).toTotalMonths()).plusDays(r4.getDays());
        }
        Objects.requireNonNull(temporalAmount, "amountToAdd");
        return (LocalDate) temporalAmount.addTo(this);
    }

    public LocalDate plusDays(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = this.day + j10;
        if (j11 > 0) {
            if (j11 <= 28) {
                return new LocalDate(this.year, this.month, (int) j11);
            }
            if (j11 <= 59) {
                long lengthOfMonth = lengthOfMonth();
                if (j11 <= lengthOfMonth) {
                    return new LocalDate(this.year, this.month, (int) j11);
                }
                short s10 = this.month;
                if (s10 < 12) {
                    return new LocalDate(this.year, s10 + 1, (int) (j11 - lengthOfMonth));
                }
                ChronoField.YEAR.checkValidValue(this.year + 1);
                return new LocalDate(this.year + 1, 1, (int) (j11 - lengthOfMonth));
            }
        }
        return ofEpochDay(Clock$OffsetClock$$ExternalSyntheticBackport0.m(toEpochDay(), j10));
    }

    public LocalDate plusMonths(long j10) {
        long m10;
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.year * 12) + ((long) (this.month - 1)) + j10;
        ChronoField chronoField = ChronoField.YEAR;
        m10 = DesugarLocalDate$$ExternalSyntheticBackport1.m(j11, 12);
        return resolvePreviousValid(chronoField.checkValidIntValue(m10), LocalDate$$ExternalSyntheticBackport7.m(j11, 12) + 1, this.day);
    }

    public LocalDate plusWeeks(long j10) {
        long m10;
        m10 = Duration$$ExternalSyntheticBackport0.m(j10, 7);
        return plusDays(m10);
    }

    public LocalDate plusYears(long j10) {
        return j10 == 0 ? this : resolvePreviousValid(ChronoField.YEAR.checkValidIntValue(this.year + j10), this.month, this.day);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object query(TemporalQuery temporalQuery) {
        return temporalQuery == TemporalQueries.localDate() ? this : ChronoLocalDate.CC.$default$query(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        int lengthOfMonth;
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (!chronoField.isDateBased()) {
                throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
            }
            int i10 = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
            if (i10 == 1) {
                lengthOfMonth = lengthOfMonth();
            } else if (i10 != 2) {
                if (i10 == 3) {
                    return ValueRange.of(1L, (getMonth() != Month.FEBRUARY || isLeapYear()) ? 5L : 4L);
                } else if (i10 != 4) {
                    return temporalField.range();
                } else {
                    return ValueRange.of(1L, getYear() <= 0 ? 1000000000L : 999999999L);
                }
            } else {
                lengthOfMonth = lengthOfYear();
            }
            return ValueRange.of(1L, lengthOfMonth);
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j10 = this.year;
        long j11 = this.month;
        long j12 = (365 * j10) + 0;
        long j13 = (j10 >= 0 ? j12 + (((3 + j10) / 4) - ((99 + j10) / 100)) + ((j10 + 399) / 400) : j12 - (((j10 / (-4)) - (j10 / (-100))) + (j10 / (-400)))) + (((367 * j11) - 362) / 12) + ((long) (this.day - 1));
        if (j11 > 2) {
            j13--;
            if (!isLeapYear()) {
                j13--;
            }
        }
        return j13 - 719528;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        int i10;
        int i11 = this.year;
        short s10 = this.month;
        short s11 = this.day;
        int abs = Math.abs(i11);
        StringBuilder sb2 = new StringBuilder(10);
        if (abs < 1000) {
            if (i11 < 0) {
                sb2.append(i11 - 10000);
                i10 = 1;
            } else {
                sb2.append(i11 + 10000);
                i10 = 0;
            }
            sb2.deleteCharAt(i10);
        } else {
            if (i11 > 9999) {
                sb2.append('+');
            }
            sb2.append(i11);
        }
        sb2.append(s10 < 10 ? "-0" : "-");
        sb2.append((int) s10);
        sb2.append(s11 >= 10 ? "-" : "-0");
        sb2.append((int) s11);
        return sb2.toString();
    }

    @Override // j$.time.temporal.Temporal
    public LocalDate with(TemporalAdjuster temporalAdjuster) {
        return temporalAdjuster instanceof LocalDate ? (LocalDate) temporalAdjuster : (LocalDate) temporalAdjuster.adjustInto(this);
    }

    @Override // j$.time.temporal.Temporal
    public LocalDate with(TemporalField temporalField, long j10) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.checkValidValue(j10);
            switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()]) {
                case 1:
                    return withDayOfMonth((int) j10);
                case 2:
                    return withDayOfYear((int) j10);
                case 3:
                    return plusWeeks(j10 - getLong(ChronoField.ALIGNED_WEEK_OF_MONTH));
                case 4:
                    if (this.year < 1) {
                        j10 = 1 - j10;
                    }
                    return withYear((int) j10);
                case 5:
                    return plusDays(j10 - getDayOfWeek().getValue());
                case 6:
                    return plusDays(j10 - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 7:
                    return plusDays(j10 - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 8:
                    return ofEpochDay(j10);
                case 9:
                    return plusWeeks(j10 - getLong(ChronoField.ALIGNED_WEEK_OF_YEAR));
                case 10:
                    return withMonth((int) j10);
                case 11:
                    return plusMonths(j10 - getProlepticMonth());
                case 12:
                    return withYear((int) j10);
                case 13:
                    return getLong(ChronoField.ERA) == j10 ? this : withYear(1 - this.year);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
            }
        }
        return (LocalDate) temporalField.adjustInto(this, j10);
    }

    public LocalDate withDayOfMonth(int i10) {
        return this.day == i10 ? this : of(this.year, this.month, i10);
    }

    public LocalDate withDayOfYear(int i10) {
        return getDayOfYear() == i10 ? this : ofYearDay(this.year, i10);
    }

    public LocalDate withMonth(int i10) {
        if (this.month == i10) {
            return this;
        }
        ChronoField.MONTH_OF_YEAR.checkValidValue(i10);
        return resolvePreviousValid(this.year, i10, this.day);
    }

    public LocalDate withYear(int i10) {
        if (this.year == i10) {
            return this;
        }
        ChronoField.YEAR.checkValidValue(i10);
        return resolvePreviousValid(i10, this.month, this.day);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeInt(this.year);
        dataOutput.writeByte(this.month);
        dataOutput.writeByte(this.day);
    }
}
