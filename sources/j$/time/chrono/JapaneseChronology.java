package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Duration$DurationUnits$$ExternalSyntheticBackport1;
import j$.time.Instant;
import j$.time.Instant$$ExternalSyntheticBackport0;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjusters;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class JapaneseChronology extends AbstractChronology implements Serializable {
    public static final JapaneseChronology INSTANCE = new JapaneseChronology();
    private static final long serialVersionUID = 459996390165777884L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.JapaneseChronology$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;

        static {
            int[] iArr = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr;
            try {
                iArr[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR_OF_ERA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.DAY_OF_YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ERA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private JapaneseChronology() {
    }

    private int prolepticYearLenient(JapaneseEra japaneseEra, int i10) {
        return (japaneseEra.getSince().getYear() + i10) - 1;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private ChronoLocalDate resolveYD(JapaneseEra japaneseEra, int i10, Map map, ResolverStyle resolverStyle) {
        map.remove(ChronoField.ERA);
        map.remove(ChronoField.YEAR_OF_ERA);
        if (resolverStyle != ResolverStyle.LENIENT) {
            ChronoField chronoField = ChronoField.DAY_OF_YEAR;
            return dateYearDay(japaneseEra, i10, range(chronoField).checkValidIntValue(((Long) map.remove(chronoField)).longValue(), chronoField));
        }
        int prolepticYearLenient = prolepticYearLenient(japaneseEra, i10);
        return dateYearDay(prolepticYearLenient, 1).plus(Instant$$ExternalSyntheticBackport0.m(((Long) map.remove(ChronoField.DAY_OF_YEAR)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
    }

    private ChronoLocalDate resolveYMD(JapaneseEra japaneseEra, int i10, Map map, ResolverStyle resolverStyle) {
        JapaneseDate with;
        map.remove(ChronoField.ERA);
        map.remove(ChronoField.YEAR_OF_ERA);
        if (resolverStyle == ResolverStyle.LENIENT) {
            int prolepticYearLenient = prolepticYearLenient(japaneseEra, i10);
            return date(prolepticYearLenient, 1, 1).plus(Instant$$ExternalSyntheticBackport0.m(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L), (TemporalUnit) ChronoUnit.MONTHS).plus(Instant$$ExternalSyntheticBackport0.m(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        int checkValidIntValue = range(chronoField).checkValidIntValue(((Long) map.remove(chronoField)).longValue(), chronoField);
        ChronoField chronoField2 = ChronoField.DAY_OF_MONTH;
        int checkValidIntValue2 = range(chronoField2).checkValidIntValue(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        if (resolverStyle == ResolverStyle.SMART) {
            if (i10 < 1) {
                throw new DateTimeException("Invalid YearOfEra: " + i10);
            }
            int prolepticYearLenient2 = prolepticYearLenient(japaneseEra, i10);
            try {
                with = date(prolepticYearLenient2, checkValidIntValue, checkValidIntValue2);
            } catch (DateTimeException unused) {
                with = date(prolepticYearLenient2, checkValidIntValue, 1).with(TemporalAdjusters.lastDayOfMonth());
            }
            if (with.getEra() == japaneseEra || with.get(ChronoField.YEAR_OF_ERA) <= 1 || i10 <= 1) {
                return with;
            }
            throw new DateTimeException("Invalid YearOfEra for Era: " + japaneseEra + " " + i10);
        }
        return date(japaneseEra, i10, checkValidIntValue, checkValidIntValue2);
    }

    @Override // j$.time.chrono.Chronology
    public JapaneseDate date(int i10, int i11, int i12) {
        return new JapaneseDate(LocalDate.of(i10, i11, i12));
    }

    public JapaneseDate date(Era era, int i10, int i11, int i12) {
        if (era instanceof JapaneseEra) {
            return JapaneseDate.of((JapaneseEra) era, i10, i11, i12);
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    @Override // j$.time.chrono.Chronology
    public JapaneseDate date(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof JapaneseDate ? (JapaneseDate) temporalAccessor : new JapaneseDate(LocalDate.from(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public JapaneseDate dateEpochDay(long j10) {
        return new JapaneseDate(LocalDate.ofEpochDay(j10));
    }

    @Override // j$.time.chrono.AbstractChronology
    public JapaneseDate dateNow() {
        return dateNow(Clock.systemDefaultZone());
    }

    public JapaneseDate dateNow(Clock clock) {
        return date((TemporalAccessor) LocalDate.now(clock));
    }

    @Override // j$.time.chrono.Chronology
    public JapaneseDate dateYearDay(int i10, int i11) {
        return new JapaneseDate(LocalDate.ofYearDay(i10, i11));
    }

    public JapaneseDate dateYearDay(Era era, int i10, int i11) {
        return JapaneseDate.ofYearDay((JapaneseEra) era, i10, i11);
    }

    @Override // j$.time.chrono.Chronology
    public JapaneseEra eraOf(int i10) {
        return JapaneseEra.of(i10);
    }

    @Override // j$.time.chrono.Chronology
    public List eras() {
        return Duration$DurationUnits$$ExternalSyntheticBackport1.m(JapaneseEra.values());
    }

    @Override // j$.time.chrono.Chronology
    public String getCalendarType() {
        return "japanese";
    }

    @Override // j$.time.chrono.Chronology
    public String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.Chronology
    public boolean isLeapYear(long j10) {
        return IsoChronology.INSTANCE.isLeapYear(j10);
    }

    @Override // j$.time.chrono.AbstractChronology, j$.time.chrono.Chronology
    public ChronoLocalDateTime localDateTime(TemporalAccessor temporalAccessor) {
        return super.localDateTime(temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    public int prolepticYear(Era era, int i10) {
        if (era instanceof JapaneseEra) {
            JapaneseEra japaneseEra = (JapaneseEra) era;
            int year = (japaneseEra.getSince().getYear() + i10) - 1;
            if (i10 == 1) {
                return year;
            }
            if (year < -999999999 || year > 999999999 || year < japaneseEra.getSince().getYear() || era != JapaneseEra.from(LocalDate.of(year, 1, 1))) {
                throw new DateTimeException("Invalid yearOfEra value");
            }
            return year;
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    @Override // j$.time.chrono.Chronology
    public ValueRange range(ChronoField chronoField) {
        switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + chronoField);
            case 5:
                return ValueRange.of(1L, JapaneseEra.shortestYearsOfEra(), 999999999 - JapaneseEra.getCurrentEra().getSince().getYear());
            case 6:
                return ValueRange.of(1L, JapaneseEra.shortestDaysOfYear(), ChronoField.DAY_OF_YEAR.range().getMaximum());
            case 7:
                return ValueRange.of(JapaneseDate.MEIJI_6_ISODATE.getYear(), 999999999L);
            case 8:
                return ValueRange.of(JapaneseEra.MEIJI.getValue(), JapaneseEra.getCurrentEra().getValue());
            default:
                return chronoField.range();
        }
    }

    @Override // j$.time.chrono.AbstractChronology, j$.time.chrono.Chronology
    public JapaneseDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return (JapaneseDate) super.resolveDate(map, resolverStyle);
    }

    @Override // j$.time.chrono.AbstractChronology
    ChronoLocalDate resolveYearOfEra(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.ERA;
        Long l10 = (Long) map.get(chronoField);
        JapaneseEra eraOf = l10 != null ? eraOf(range(chronoField).checkValidIntValue(l10.longValue(), chronoField)) : null;
        ChronoField chronoField2 = ChronoField.YEAR_OF_ERA;
        Long l11 = (Long) map.get(chronoField2);
        int checkValidIntValue = l11 != null ? range(chronoField2).checkValidIntValue(l11.longValue(), chronoField2) : 0;
        if (eraOf == null && l11 != null && !map.containsKey(ChronoField.YEAR) && resolverStyle != ResolverStyle.STRICT) {
            eraOf = JapaneseEra.values()[JapaneseEra.values().length - 1];
        }
        if (l11 != null && eraOf != null) {
            if (map.containsKey(ChronoField.MONTH_OF_YEAR) && map.containsKey(ChronoField.DAY_OF_MONTH)) {
                return resolveYMD(eraOf, checkValidIntValue, map, resolverStyle);
            }
            if (map.containsKey(ChronoField.DAY_OF_YEAR)) {
                return resolveYD(eraOf, checkValidIntValue, map, resolverStyle);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractChronology
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // j$.time.chrono.AbstractChronology, j$.time.chrono.Chronology
    public ChronoZonedDateTime zonedDateTime(Instant instant, ZoneId zoneId) {
        return super.zonedDateTime(instant, zoneId);
    }
}
