package j$.time.temporal;

import j$.time.Clock$OffsetClock$$ExternalSyntheticBackport0;
import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.Duration$$ExternalSyntheticBackport0;
import j$.time.Instant$$ExternalSyntheticBackport0;
import j$.time.LocalDate$$ExternalSyntheticBackport5;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.ResolverStyle;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class WeekFields implements Serializable {
    private static final ConcurrentMap CACHE = new ConcurrentHashMap(4, 0.75f, 2);
    public static final WeekFields ISO = new WeekFields(DayOfWeek.MONDAY, 4);
    public static final WeekFields SUNDAY_START = of(DayOfWeek.SUNDAY, 1);
    public static final TemporalUnit WEEK_BASED_YEARS = IsoFields.WEEK_BASED_YEARS;
    private static final long serialVersionUID = -1177360819670808121L;
    private final DayOfWeek firstDayOfWeek;
    private final int minimalDays;
    private final transient TemporalField dayOfWeek = ComputedDayOfField.ofDayOfWeekField(this);
    private final transient TemporalField weekOfMonth = ComputedDayOfField.ofWeekOfMonthField(this);
    private final transient TemporalField weekOfYear = ComputedDayOfField.ofWeekOfYearField(this);
    private final transient TemporalField weekOfWeekBasedYear = ComputedDayOfField.ofWeekOfWeekBasedYearField(this);
    private final transient TemporalField weekBasedYear = ComputedDayOfField.ofWeekBasedYearField(this);

    /* loaded from: classes2.dex */
    static class ComputedDayOfField implements TemporalField {
        private final TemporalUnit baseUnit;
        private final String name;
        private final ValueRange range;
        private final TemporalUnit rangeUnit;
        private final WeekFields weekDef;
        private static final ValueRange DAY_OF_WEEK_RANGE = ValueRange.of(1, 7);
        private static final ValueRange WEEK_OF_MONTH_RANGE = ValueRange.of(0, 1, 4, 6);
        private static final ValueRange WEEK_OF_YEAR_RANGE = ValueRange.of(0, 1, 52, 54);
        private static final ValueRange WEEK_OF_WEEK_BASED_YEAR_RANGE = ValueRange.of(1, 52, 53);

        private ComputedDayOfField(String str, WeekFields weekFields, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, ValueRange valueRange) {
            this.name = str;
            this.weekDef = weekFields;
            this.baseUnit = temporalUnit;
            this.rangeUnit = temporalUnit2;
            this.range = valueRange;
        }

        private int computeWeek(int i10, int i11) {
            return ((i10 + 7) + (i11 - 1)) / 7;
        }

        private int localizedDayOfWeek(int i10) {
            return WeekFields$ComputedDayOfField$$ExternalSyntheticBackport1.m(i10 - this.weekDef.getFirstDayOfWeek().getValue(), 7) + 1;
        }

        private int localizedDayOfWeek(TemporalAccessor temporalAccessor) {
            return WeekFields$ComputedDayOfField$$ExternalSyntheticBackport1.m(temporalAccessor.get(ChronoField.DAY_OF_WEEK) - this.weekDef.getFirstDayOfWeek().getValue(), 7) + 1;
        }

        private int localizedWeekBasedYear(TemporalAccessor temporalAccessor) {
            int localizedDayOfWeek = localizedDayOfWeek(temporalAccessor);
            int i10 = temporalAccessor.get(ChronoField.YEAR);
            ChronoField chronoField = ChronoField.DAY_OF_YEAR;
            int i11 = temporalAccessor.get(chronoField);
            int startOfWeekOffset = startOfWeekOffset(i11, localizedDayOfWeek);
            int computeWeek = computeWeek(startOfWeekOffset, i11);
            return computeWeek == 0 ? i10 - 1 : computeWeek >= computeWeek(startOfWeekOffset, ((int) temporalAccessor.range(chronoField).getMaximum()) + this.weekDef.getMinimalDaysInFirstWeek()) ? i10 + 1 : i10;
        }

        private long localizedWeekOfMonth(TemporalAccessor temporalAccessor) {
            int localizedDayOfWeek = localizedDayOfWeek(temporalAccessor);
            int i10 = temporalAccessor.get(ChronoField.DAY_OF_MONTH);
            return computeWeek(startOfWeekOffset(i10, localizedDayOfWeek), i10);
        }

        private int localizedWeekOfWeekBasedYear(TemporalAccessor temporalAccessor) {
            int computeWeek;
            int localizedDayOfWeek = localizedDayOfWeek(temporalAccessor);
            ChronoField chronoField = ChronoField.DAY_OF_YEAR;
            int i10 = temporalAccessor.get(chronoField);
            int startOfWeekOffset = startOfWeekOffset(i10, localizedDayOfWeek);
            int computeWeek2 = computeWeek(startOfWeekOffset, i10);
            return computeWeek2 == 0 ? localizedWeekOfWeekBasedYear(Chronology.CC.from(temporalAccessor).date(temporalAccessor).minus(i10, (TemporalUnit) ChronoUnit.DAYS)) : (computeWeek2 <= 50 || computeWeek2 < (computeWeek = computeWeek(startOfWeekOffset, ((int) temporalAccessor.range(chronoField).getMaximum()) + this.weekDef.getMinimalDaysInFirstWeek()))) ? computeWeek2 : (computeWeek2 - computeWeek) + 1;
        }

        private long localizedWeekOfYear(TemporalAccessor temporalAccessor) {
            int localizedDayOfWeek = localizedDayOfWeek(temporalAccessor);
            int i10 = temporalAccessor.get(ChronoField.DAY_OF_YEAR);
            return computeWeek(startOfWeekOffset(i10, localizedDayOfWeek), i10);
        }

        static ComputedDayOfField ofDayOfWeekField(WeekFields weekFields) {
            return new ComputedDayOfField("DayOfWeek", weekFields, ChronoUnit.DAYS, ChronoUnit.WEEKS, DAY_OF_WEEK_RANGE);
        }

        private ChronoLocalDate ofWeekBasedYear(Chronology chronology, int i10, int i11, int i12) {
            ChronoLocalDate date = chronology.date(i10, 1, 1);
            int startOfWeekOffset = startOfWeekOffset(1, localizedDayOfWeek(date));
            return date.plus((-startOfWeekOffset) + (i12 - 1) + ((Math.min(i11, computeWeek(startOfWeekOffset, date.lengthOfYear() + this.weekDef.getMinimalDaysInFirstWeek()) - 1) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
        }

        static ComputedDayOfField ofWeekBasedYearField(WeekFields weekFields) {
            return new ComputedDayOfField("WeekBasedYear", weekFields, IsoFields.WEEK_BASED_YEARS, ChronoUnit.FOREVER, ChronoField.YEAR.range());
        }

        static ComputedDayOfField ofWeekOfMonthField(WeekFields weekFields) {
            return new ComputedDayOfField("WeekOfMonth", weekFields, ChronoUnit.WEEKS, ChronoUnit.MONTHS, WEEK_OF_MONTH_RANGE);
        }

        static ComputedDayOfField ofWeekOfWeekBasedYearField(WeekFields weekFields) {
            return new ComputedDayOfField("WeekOfWeekBasedYear", weekFields, ChronoUnit.WEEKS, IsoFields.WEEK_BASED_YEARS, WEEK_OF_WEEK_BASED_YEAR_RANGE);
        }

        static ComputedDayOfField ofWeekOfYearField(WeekFields weekFields) {
            return new ComputedDayOfField("WeekOfYear", weekFields, ChronoUnit.WEEKS, ChronoUnit.YEARS, WEEK_OF_YEAR_RANGE);
        }

        private ValueRange rangeByWeek(TemporalAccessor temporalAccessor, TemporalField temporalField) {
            int startOfWeekOffset = startOfWeekOffset(temporalAccessor.get(temporalField), localizedDayOfWeek(temporalAccessor));
            ValueRange range = temporalAccessor.range(temporalField);
            return ValueRange.of(computeWeek(startOfWeekOffset, (int) range.getMinimum()), computeWeek(startOfWeekOffset, (int) range.getMaximum()));
        }

        private ValueRange rangeWeekOfWeekBasedYear(TemporalAccessor temporalAccessor) {
            ChronoField chronoField = ChronoField.DAY_OF_YEAR;
            if (temporalAccessor.isSupported(chronoField)) {
                int localizedDayOfWeek = localizedDayOfWeek(temporalAccessor);
                int i10 = temporalAccessor.get(chronoField);
                int startOfWeekOffset = startOfWeekOffset(i10, localizedDayOfWeek);
                int computeWeek = computeWeek(startOfWeekOffset, i10);
                if (computeWeek == 0) {
                    return rangeWeekOfWeekBasedYear(Chronology.CC.from(temporalAccessor).date(temporalAccessor).minus(i10 + 7, (TemporalUnit) ChronoUnit.DAYS));
                }
                int computeWeek2 = computeWeek(startOfWeekOffset, this.weekDef.getMinimalDaysInFirstWeek() + ((int) temporalAccessor.range(chronoField).getMaximum()));
                return computeWeek >= computeWeek2 ? rangeWeekOfWeekBasedYear(Chronology.CC.from(temporalAccessor).date(temporalAccessor).plus((r0 - i10) + 1 + 7, (TemporalUnit) ChronoUnit.DAYS)) : ValueRange.of(1L, (long) (computeWeek2 - 1));
            }
            return WEEK_OF_YEAR_RANGE;
        }

        private ChronoLocalDate resolveWBY(Map map, Chronology chronology, int i10, ResolverStyle resolverStyle) {
            ChronoLocalDate ofWeekBasedYear;
            int checkValidIntValue = this.weekDef.weekBasedYear.range().checkValidIntValue(((Long) map.get(this.weekDef.weekBasedYear)).longValue(), this.weekDef.weekBasedYear);
            if (resolverStyle == ResolverStyle.LENIENT) {
                ofWeekBasedYear = ofWeekBasedYear(chronology, checkValidIntValue, 1, i10).plus(Instant$$ExternalSyntheticBackport0.m(((Long) map.get(this.weekDef.weekOfWeekBasedYear)).longValue(), 1L), ChronoUnit.WEEKS);
            } else {
                ofWeekBasedYear = ofWeekBasedYear(chronology, checkValidIntValue, this.weekDef.weekOfWeekBasedYear.range().checkValidIntValue(((Long) map.get(this.weekDef.weekOfWeekBasedYear)).longValue(), this.weekDef.weekOfWeekBasedYear), i10);
                if (resolverStyle == ResolverStyle.STRICT && localizedWeekBasedYear(ofWeekBasedYear) != checkValidIntValue) {
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                }
            }
            map.remove(this);
            map.remove(this.weekDef.weekBasedYear);
            map.remove(this.weekDef.weekOfWeekBasedYear);
            map.remove(ChronoField.DAY_OF_WEEK);
            return ofWeekBasedYear;
        }

        private ChronoLocalDate resolveWoM(Map map, Chronology chronology, int i10, long j10, long j11, int i11, ResolverStyle resolverStyle) {
            ChronoLocalDate plus;
            long m10;
            if (resolverStyle == ResolverStyle.LENIENT) {
                ChronoLocalDate plus2 = chronology.date(i10, 1, 1).plus(Instant$$ExternalSyntheticBackport0.m(j10, 1L), (TemporalUnit) ChronoUnit.MONTHS);
                long m11 = Instant$$ExternalSyntheticBackport0.m(j11, localizedWeekOfMonth(plus2));
                int localizedDayOfWeek = i11 - localizedDayOfWeek(plus2);
                m10 = Duration$$ExternalSyntheticBackport0.m(m11, 7);
                plus = plus2.plus(Clock$OffsetClock$$ExternalSyntheticBackport0.m(m10, localizedDayOfWeek), (TemporalUnit) ChronoUnit.DAYS);
            } else {
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                plus = chronology.date(i10, chronoField.checkValidIntValue(j10), 1).plus((((int) (this.range.checkValidIntValue(j11, this) - localizedWeekOfMonth(r6))) * 7) + (i11 - localizedDayOfWeek(r6)), (TemporalUnit) ChronoUnit.DAYS);
                if (resolverStyle == ResolverStyle.STRICT && plus.getLong(chronoField) != j10) {
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
            }
            map.remove(this);
            map.remove(ChronoField.YEAR);
            map.remove(ChronoField.MONTH_OF_YEAR);
            map.remove(ChronoField.DAY_OF_WEEK);
            return plus;
        }

        private ChronoLocalDate resolveWoY(Map map, Chronology chronology, int i10, long j10, int i11, ResolverStyle resolverStyle) {
            ChronoLocalDate plus;
            long m10;
            ChronoLocalDate date = chronology.date(i10, 1, 1);
            if (resolverStyle == ResolverStyle.LENIENT) {
                long m11 = Instant$$ExternalSyntheticBackport0.m(j10, localizedWeekOfYear(date));
                int localizedDayOfWeek = i11 - localizedDayOfWeek(date);
                m10 = Duration$$ExternalSyntheticBackport0.m(m11, 7);
                plus = date.plus(Clock$OffsetClock$$ExternalSyntheticBackport0.m(m10, localizedDayOfWeek), (TemporalUnit) ChronoUnit.DAYS);
            } else {
                plus = date.plus((((int) (this.range.checkValidIntValue(j10, this) - localizedWeekOfYear(date))) * 7) + (i11 - localizedDayOfWeek(date)), (TemporalUnit) ChronoUnit.DAYS);
                if (resolverStyle == ResolverStyle.STRICT && plus.getLong(ChronoField.YEAR) != i10) {
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
                }
            }
            map.remove(this);
            map.remove(ChronoField.YEAR);
            map.remove(ChronoField.DAY_OF_WEEK);
            return plus;
        }

        private int startOfWeekOffset(int i10, int i11) {
            int m10 = WeekFields$ComputedDayOfField$$ExternalSyntheticBackport1.m(i10 - i11, 7);
            return m10 + 1 > this.weekDef.getMinimalDaysInFirstWeek() ? 7 - m10 : -m10;
        }

        @Override // j$.time.temporal.TemporalField
        public Temporal adjustInto(Temporal temporal, long j10) {
            if (this.range.checkValidIntValue(j10, this) == temporal.get(this)) {
                return temporal;
            }
            if (this.rangeUnit == ChronoUnit.FOREVER) {
                return ofWeekBasedYear(Chronology.CC.from(temporal), (int) j10, temporal.get(this.weekDef.weekOfWeekBasedYear), temporal.get(this.weekDef.dayOfWeek));
            }
            return temporal.plus(r0 - r1, this.baseUnit);
        }

        @Override // j$.time.temporal.TemporalField
        public long getFrom(TemporalAccessor temporalAccessor) {
            int localizedWeekBasedYear;
            TemporalUnit temporalUnit = this.rangeUnit;
            if (temporalUnit == ChronoUnit.WEEKS) {
                localizedWeekBasedYear = localizedDayOfWeek(temporalAccessor);
            } else if (temporalUnit == ChronoUnit.MONTHS) {
                return localizedWeekOfMonth(temporalAccessor);
            } else {
                if (temporalUnit == ChronoUnit.YEARS) {
                    return localizedWeekOfYear(temporalAccessor);
                }
                if (temporalUnit == WeekFields.WEEK_BASED_YEARS) {
                    localizedWeekBasedYear = localizedWeekOfWeekBasedYear(temporalAccessor);
                } else if (temporalUnit != ChronoUnit.FOREVER) {
                    throw new IllegalStateException("unreachable, rangeUnit: " + this.rangeUnit + ", this: " + this);
                } else {
                    localizedWeekBasedYear = localizedWeekBasedYear(temporalAccessor);
                }
            }
            return localizedWeekBasedYear;
        }

        @Override // j$.time.temporal.TemporalField
        public boolean isDateBased() {
            return true;
        }

        @Override // j$.time.temporal.TemporalField
        public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
            ChronoField chronoField;
            if (temporalAccessor.isSupported(ChronoField.DAY_OF_WEEK)) {
                TemporalUnit temporalUnit = this.rangeUnit;
                if (temporalUnit == ChronoUnit.WEEKS) {
                    return true;
                }
                if (temporalUnit == ChronoUnit.MONTHS) {
                    chronoField = ChronoField.DAY_OF_MONTH;
                } else if (temporalUnit == ChronoUnit.YEARS || temporalUnit == WeekFields.WEEK_BASED_YEARS) {
                    chronoField = ChronoField.DAY_OF_YEAR;
                } else if (temporalUnit != ChronoUnit.FOREVER) {
                    return false;
                } else {
                    chronoField = ChronoField.YEAR;
                }
                return temporalAccessor.isSupported(chronoField);
            }
            return false;
        }

        @Override // j$.time.temporal.TemporalField
        public boolean isTimeBased() {
            return false;
        }

        @Override // j$.time.temporal.TemporalField
        public ValueRange range() {
            return this.range;
        }

        @Override // j$.time.temporal.TemporalField
        public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
            TemporalUnit temporalUnit = this.rangeUnit;
            if (temporalUnit == ChronoUnit.WEEKS) {
                return this.range;
            }
            if (temporalUnit == ChronoUnit.MONTHS) {
                return rangeByWeek(temporalAccessor, ChronoField.DAY_OF_MONTH);
            }
            if (temporalUnit == ChronoUnit.YEARS) {
                return rangeByWeek(temporalAccessor, ChronoField.DAY_OF_YEAR);
            }
            if (temporalUnit == WeekFields.WEEK_BASED_YEARS) {
                return rangeWeekOfWeekBasedYear(temporalAccessor);
            }
            if (temporalUnit == ChronoUnit.FOREVER) {
                return ChronoField.YEAR.range();
            }
            throw new IllegalStateException("unreachable, rangeUnit: " + this.rangeUnit + ", this: " + this);
        }

        @Override // j$.time.temporal.TemporalField
        public ChronoLocalDate resolve(Map map, TemporalAccessor temporalAccessor, ResolverStyle resolverStyle) {
            int m10 = LocalDate$$ExternalSyntheticBackport5.m(((Long) map.get(this)).longValue());
            if (this.rangeUnit == ChronoUnit.WEEKS) {
                long m11 = WeekFields$ComputedDayOfField$$ExternalSyntheticBackport1.m((this.weekDef.getFirstDayOfWeek().getValue() - 1) + (this.range.checkValidIntValue(r2, this) - 1), 7) + 1;
                map.remove(this);
                map.put(ChronoField.DAY_OF_WEEK, Long.valueOf(m11));
                return null;
            }
            ChronoField chronoField = ChronoField.DAY_OF_WEEK;
            if (map.containsKey(chronoField)) {
                int localizedDayOfWeek = localizedDayOfWeek(chronoField.checkValidIntValue(((Long) map.get(chronoField)).longValue()));
                Chronology from = Chronology.CC.from(temporalAccessor);
                ChronoField chronoField2 = ChronoField.YEAR;
                if (map.containsKey(chronoField2)) {
                    int checkValidIntValue = chronoField2.checkValidIntValue(((Long) map.get(chronoField2)).longValue());
                    if (this.rangeUnit == ChronoUnit.MONTHS) {
                        Object obj = ChronoField.MONTH_OF_YEAR;
                        if (map.containsKey(obj)) {
                            return resolveWoM(map, from, checkValidIntValue, ((Long) map.get(obj)).longValue(), m10, localizedDayOfWeek, resolverStyle);
                        }
                    }
                    if (this.rangeUnit == ChronoUnit.YEARS) {
                        return resolveWoY(map, from, checkValidIntValue, m10, localizedDayOfWeek, resolverStyle);
                    }
                } else {
                    TemporalUnit temporalUnit = this.rangeUnit;
                    if ((temporalUnit == WeekFields.WEEK_BASED_YEARS || temporalUnit == ChronoUnit.FOREVER) && map.containsKey(this.weekDef.weekBasedYear) && map.containsKey(this.weekDef.weekOfWeekBasedYear)) {
                        return resolveWBY(map, from, localizedDayOfWeek, resolverStyle);
                    }
                }
                return null;
            }
            return null;
        }

        public String toString() {
            return this.name + "[" + this.weekDef.toString() + "]";
        }
    }

    private WeekFields(DayOfWeek dayOfWeek, int i10) {
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i10 < 1 || i10 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.firstDayOfWeek = dayOfWeek;
        this.minimalDays = i10;
    }

    public static WeekFields of(DayOfWeek dayOfWeek, int i10) {
        String str = dayOfWeek.toString() + i10;
        ConcurrentMap concurrentMap = CACHE;
        WeekFields weekFields = (WeekFields) concurrentMap.get(str);
        if (weekFields == null) {
            concurrentMap.putIfAbsent(str, new WeekFields(dayOfWeek, i10));
            return (WeekFields) concurrentMap.get(str);
        }
        return weekFields;
    }

    public static WeekFields of(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        return of(DayOfWeek.SUNDAY.plus((long) (r4.getFirstDayOfWeek() - 1)), Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry())).getMinimalDaysInFirstWeek());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.firstDayOfWeek == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i10 = this.minimalDays;
        if (i10 < 1 || i10 > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() {
        try {
            return of(this.firstDayOfWeek, this.minimalDays);
        } catch (IllegalArgumentException e10) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e10.getMessage());
        }
    }

    public TemporalField dayOfWeek() {
        return this.dayOfWeek;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeekFields) && hashCode() == obj.hashCode();
    }

    public DayOfWeek getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    public int getMinimalDaysInFirstWeek() {
        return this.minimalDays;
    }

    public int hashCode() {
        return (this.firstDayOfWeek.ordinal() * 7) + this.minimalDays;
    }

    public String toString() {
        return "WeekFields[" + this.firstDayOfWeek + "," + this.minimalDays + "]";
    }

    public TemporalField weekBasedYear() {
        return this.weekBasedYear;
    }

    public TemporalField weekOfMonth() {
        return this.weekOfMonth;
    }

    public TemporalField weekOfWeekBasedYear() {
        return this.weekOfWeekBasedYear;
    }
}
