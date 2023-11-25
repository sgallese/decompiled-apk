package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.Instant$$ExternalSyntheticBackport0;
import j$.time.LocalDate$$ExternalSyntheticBackport5;
import j$.time.ZoneId;
import j$.time.chrono.Chronology;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjusters;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;

/* loaded from: classes2.dex */
public abstract class AbstractChronology implements Chronology {
    private static final ConcurrentHashMap CHRONOS_BY_ID = new ConcurrentHashMap();
    private static final ConcurrentHashMap CHRONOS_BY_TYPE = new ConcurrentHashMap();
    private static final Locale JAPANESE_CALENDAR_LOCALE = new Locale("ja", "JP", "JP");

    private static boolean initCache() {
        if (CHRONOS_BY_ID.get("ISO") == null) {
            registerChrono(HijrahChronology.INSTANCE);
            registerChrono(JapaneseChronology.INSTANCE);
            registerChrono(MinguoChronology.INSTANCE);
            registerChrono(ThaiBuddhistChronology.INSTANCE);
            Iterator it = ServiceLoader.load(AbstractChronology.class, null).iterator();
            while (it.hasNext()) {
                AbstractChronology abstractChronology = (AbstractChronology) it.next();
                if (!abstractChronology.getId().equals("ISO")) {
                    registerChrono(abstractChronology);
                }
            }
            registerChrono(IsoChronology.INSTANCE);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Chronology of(String str) {
        Objects.requireNonNull(str, "id");
        do {
            Chronology of0 = of0(str);
            if (of0 != null) {
                return of0;
            }
        } while (initCache());
        Iterator it = ServiceLoader.load(Chronology.class).iterator();
        while (it.hasNext()) {
            Chronology chronology = (Chronology) it.next();
            if (str.equals(chronology.getId()) || str.equals(chronology.getCalendarType())) {
                return chronology;
            }
        }
        throw new DateTimeException("Unknown chronology: " + str);
    }

    private static Chronology of0(String str) {
        Chronology chronology = (Chronology) CHRONOS_BY_ID.get(str);
        return chronology == null ? (Chronology) CHRONOS_BY_TYPE.get(str) : chronology;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Chronology readExternal(DataInput dataInput) {
        return Chronology.CC.of(dataInput.readUTF());
    }

    static Chronology registerChrono(Chronology chronology) {
        return registerChrono(chronology, chronology.getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Chronology registerChrono(Chronology chronology, String str) {
        String calendarType;
        Chronology chronology2 = (Chronology) CHRONOS_BY_ID.putIfAbsent(str, chronology);
        if (chronology2 == null && (calendarType = chronology.getCalendarType()) != null) {
            CHRONOS_BY_TYPE.putIfAbsent(calendarType, chronology);
        }
        return chronology2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addFieldValue(Map map, ChronoField chronoField, long j10) {
        Long l10 = (Long) map.get(chronoField);
        if (l10 == null || l10.longValue() == j10) {
            map.put(chronoField, Long.valueOf(j10));
            return;
        }
        throw new DateTimeException("Conflict found: " + chronoField + " " + l10 + " differs from " + chronoField + " " + j10);
    }

    @Override // java.lang.Comparable
    public int compareTo(Chronology chronology) {
        return getId().compareTo(chronology.getId());
    }

    public abstract /* synthetic */ ChronoLocalDate dateNow();

    @Override // j$.time.chrono.Chronology
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractChronology) && compareTo((Chronology) ((AbstractChronology) obj)) == 0;
    }

    @Override // j$.time.chrono.Chronology
    public int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    @Override // j$.time.chrono.Chronology
    public /* synthetic */ ChronoLocalDateTime localDateTime(TemporalAccessor temporalAccessor) {
        return Chronology.CC.$default$localDateTime(this, temporalAccessor);
    }

    ChronoLocalDate resolveAligned(ChronoLocalDate chronoLocalDate, long j10, long j11, long j12) {
        long j13;
        ChronoLocalDate plus = chronoLocalDate.plus(j10, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        ChronoLocalDate plus2 = plus.plus(j11, (TemporalUnit) chronoUnit);
        if (j12 <= 7) {
            if (j12 < 1) {
                plus2 = plus2.plus(Instant$$ExternalSyntheticBackport0.m(j12, 7L) / 7, (TemporalUnit) chronoUnit);
                j13 = j12 + 6;
            }
            return plus2.with(TemporalAdjusters.nextOrSame(DayOfWeek.of((int) j12)));
        }
        j13 = j12 - 1;
        plus2 = plus2.plus(j13 / 7, (TemporalUnit) chronoUnit);
        j12 = (j13 % 7) + 1;
        return plus2.with(TemporalAdjusters.nextOrSame(DayOfWeek.of((int) j12)));
    }

    @Override // j$.time.chrono.Chronology
    public ChronoLocalDate resolveDate(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return dateEpochDay(((Long) map.remove(chronoField)).longValue());
        }
        resolveProlepticMonth(map, resolverStyle);
        ChronoLocalDate resolveYearOfEra = resolveYearOfEra(map, resolverStyle);
        if (resolveYearOfEra != null) {
            return resolveYearOfEra;
        }
        if (map.containsKey(ChronoField.YEAR)) {
            if (map.containsKey(ChronoField.MONTH_OF_YEAR)) {
                if (map.containsKey(ChronoField.DAY_OF_MONTH)) {
                    return resolveYMD(map, resolverStyle);
                }
                if (map.containsKey(ChronoField.ALIGNED_WEEK_OF_MONTH)) {
                    if (map.containsKey(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH)) {
                        return resolveYMAA(map, resolverStyle);
                    }
                    if (map.containsKey(ChronoField.DAY_OF_WEEK)) {
                        return resolveYMAD(map, resolverStyle);
                    }
                }
            }
            if (map.containsKey(ChronoField.DAY_OF_YEAR)) {
                return resolveYD(map, resolverStyle);
            }
            if (map.containsKey(ChronoField.ALIGNED_WEEK_OF_YEAR)) {
                if (map.containsKey(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR)) {
                    return resolveYAA(map, resolverStyle);
                }
                if (map.containsKey(ChronoField.DAY_OF_WEEK)) {
                    return resolveYAD(map, resolverStyle);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    void resolveProlepticMonth(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l10 = (Long) map.remove(chronoField);
        if (l10 != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                chronoField.checkValidValue(l10.longValue());
            }
            ChronoLocalDate with = dateNow().with((TemporalField) ChronoField.DAY_OF_MONTH, 1L).with((TemporalField) chronoField, l10.longValue());
            addFieldValue(map, ChronoField.MONTH_OF_YEAR, with.get(r0));
            addFieldValue(map, ChronoField.YEAR, with.get(r0));
        }
    }

    ChronoLocalDate resolveYAA(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR;
        int checkValidIntValue = range(chronoField).checkValidIntValue(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            return dateYearDay(checkValidIntValue, 1).plus(Instant$$ExternalSyntheticBackport0.m(((Long) map.remove(ChronoField.ALIGNED_WEEK_OF_YEAR)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).plus(Instant$$ExternalSyntheticBackport0.m(((Long) map.remove(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.ALIGNED_WEEK_OF_YEAR;
        int checkValidIntValue2 = range(chronoField2).checkValidIntValue(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        ChronoLocalDate plus = dateYearDay(checkValidIntValue, 1).plus(((checkValidIntValue2 - 1) * 7) + (range(chronoField3).checkValidIntValue(((Long) map.remove(chronoField3)).longValue(), chronoField3) - 1), (TemporalUnit) ChronoUnit.DAYS);
        if (resolverStyle != ResolverStyle.STRICT || plus.get(chronoField) == checkValidIntValue) {
            return plus;
        }
        throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
    }

    ChronoLocalDate resolveYAD(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR;
        int checkValidIntValue = range(chronoField).checkValidIntValue(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            return resolveAligned(dateYearDay(checkValidIntValue, 1), 0L, Instant$$ExternalSyntheticBackport0.m(((Long) map.remove(ChronoField.ALIGNED_WEEK_OF_YEAR)).longValue(), 1L), Instant$$ExternalSyntheticBackport0.m(((Long) map.remove(ChronoField.DAY_OF_WEEK)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.ALIGNED_WEEK_OF_YEAR;
        int checkValidIntValue2 = range(chronoField2).checkValidIntValue(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_WEEK;
        ChronoLocalDate with = dateYearDay(checkValidIntValue, 1).plus((checkValidIntValue2 - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).with(TemporalAdjusters.nextOrSame(DayOfWeek.of(range(chronoField3).checkValidIntValue(((Long) map.remove(chronoField3)).longValue(), chronoField3))));
        if (resolverStyle != ResolverStyle.STRICT || with.get(chronoField) == checkValidIntValue) {
            return with;
        }
        throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
    }

    ChronoLocalDate resolveYD(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR;
        int checkValidIntValue = range(chronoField).checkValidIntValue(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            return dateYearDay(checkValidIntValue, 1).plus(Instant$$ExternalSyntheticBackport0.m(((Long) map.remove(ChronoField.DAY_OF_YEAR)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.DAY_OF_YEAR;
        return dateYearDay(checkValidIntValue, range(chronoField2).checkValidIntValue(((Long) map.remove(chronoField2)).longValue(), chronoField2));
    }

    ChronoLocalDate resolveYMAA(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR;
        int checkValidIntValue = range(chronoField).checkValidIntValue(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            long m10 = Instant$$ExternalSyntheticBackport0.m(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return date(checkValidIntValue, 1, 1).plus(m10, (TemporalUnit) ChronoUnit.MONTHS).plus(Instant$$ExternalSyntheticBackport0.m(((Long) map.remove(ChronoField.ALIGNED_WEEK_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).plus(Instant$$ExternalSyntheticBackport0.m(((Long) map.remove(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int checkValidIntValue2 = range(chronoField2).checkValidIntValue(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.ALIGNED_WEEK_OF_MONTH;
        int checkValidIntValue3 = range(chronoField3).checkValidIntValue(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        ChronoField chronoField4 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
        ChronoLocalDate plus = date(checkValidIntValue, checkValidIntValue2, 1).plus(((checkValidIntValue3 - 1) * 7) + (range(chronoField4).checkValidIntValue(((Long) map.remove(chronoField4)).longValue(), chronoField4) - 1), (TemporalUnit) ChronoUnit.DAYS);
        if (resolverStyle != ResolverStyle.STRICT || plus.get(chronoField2) == checkValidIntValue2) {
            return plus;
        }
        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
    }

    ChronoLocalDate resolveYMAD(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR;
        int checkValidIntValue = range(chronoField).checkValidIntValue(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            return resolveAligned(date(checkValidIntValue, 1, 1), Instant$$ExternalSyntheticBackport0.m(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L), Instant$$ExternalSyntheticBackport0.m(((Long) map.remove(ChronoField.ALIGNED_WEEK_OF_MONTH)).longValue(), 1L), Instant$$ExternalSyntheticBackport0.m(((Long) map.remove(ChronoField.DAY_OF_WEEK)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int checkValidIntValue2 = range(chronoField2).checkValidIntValue(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.ALIGNED_WEEK_OF_MONTH;
        int checkValidIntValue3 = range(chronoField3).checkValidIntValue(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        ChronoField chronoField4 = ChronoField.DAY_OF_WEEK;
        ChronoLocalDate with = date(checkValidIntValue, checkValidIntValue2, 1).plus((checkValidIntValue3 - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).with(TemporalAdjusters.nextOrSame(DayOfWeek.of(range(chronoField4).checkValidIntValue(((Long) map.remove(chronoField4)).longValue(), chronoField4))));
        if (resolverStyle != ResolverStyle.STRICT || with.get(chronoField2) == checkValidIntValue2) {
            return with;
        }
        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
    }

    ChronoLocalDate resolveYMD(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR;
        int checkValidIntValue = range(chronoField).checkValidIntValue(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            long m10 = Instant$$ExternalSyntheticBackport0.m(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return date(checkValidIntValue, 1, 1).plus(m10, (TemporalUnit) ChronoUnit.MONTHS).plus(Instant$$ExternalSyntheticBackport0.m(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int checkValidIntValue2 = range(chronoField2).checkValidIntValue(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int checkValidIntValue3 = range(chronoField3).checkValidIntValue(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (resolverStyle == ResolverStyle.SMART) {
            try {
                return date(checkValidIntValue, checkValidIntValue2, checkValidIntValue3);
            } catch (DateTimeException unused) {
                return date(checkValidIntValue, checkValidIntValue2, 1).with(TemporalAdjusters.lastDayOfMonth());
            }
        }
        return date(checkValidIntValue, checkValidIntValue2, checkValidIntValue3);
    }

    ChronoLocalDate resolveYearOfEra(Map map, ResolverStyle resolverStyle) {
        Era era;
        long j10;
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l10 = (Long) map.remove(chronoField);
        if (l10 == null) {
            ChronoField chronoField2 = ChronoField.ERA;
            if (map.containsKey(chronoField2)) {
                range(chronoField2).checkValidValue(((Long) map.get(chronoField2)).longValue(), chronoField2);
                return null;
            }
            return null;
        }
        Long l11 = (Long) map.remove(ChronoField.ERA);
        int checkValidIntValue = resolverStyle != ResolverStyle.LENIENT ? range(chronoField).checkValidIntValue(l10.longValue(), chronoField) : LocalDate$$ExternalSyntheticBackport5.m(l10.longValue());
        if (l11 != null) {
            addFieldValue(map, ChronoField.YEAR, prolepticYear(eraOf(range(r2).checkValidIntValue(l11.longValue(), r2)), checkValidIntValue));
            return null;
        }
        ChronoField chronoField3 = ChronoField.YEAR;
        if (map.containsKey(chronoField3)) {
            era = dateYearDay(range(chronoField3).checkValidIntValue(((Long) map.get(chronoField3)).longValue(), chronoField3), 1).getEra();
        } else if (resolverStyle == ResolverStyle.STRICT) {
            map.put(chronoField, l10);
            return null;
        } else {
            List eras = eras();
            if (eras.isEmpty()) {
                j10 = checkValidIntValue;
                addFieldValue(map, chronoField3, j10);
                return null;
            }
            era = (Era) eras.get(eras.size() - 1);
        }
        j10 = prolepticYear(era, checkValidIntValue);
        addFieldValue(map, chronoField3, j10);
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public String toString() {
        return getId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeUTF(getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object writeReplace() {
        return new Ser((byte) 1, this);
    }

    @Override // j$.time.chrono.Chronology
    public /* synthetic */ ChronoZonedDateTime zonedDateTime(Instant instant, ZoneId zoneId) {
        ChronoZonedDateTime ofInstant;
        ofInstant = ChronoZonedDateTimeImpl.ofInstant(this, instant, zoneId);
        return ofInstant;
    }
}
