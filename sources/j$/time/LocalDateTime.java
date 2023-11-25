package j$.time;

import com.google.android.gms.ads.RequestConfiguration;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.ValueRange;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalDateTime implements Temporal, TemporalAdjuster, ChronoLocalDateTime, Serializable {
    private static final long serialVersionUID = 6207766400415563566L;
    private final LocalDate date;
    private final LocalTime time;
    public static final LocalDateTime MIN = of(LocalDate.MIN, LocalTime.MIN);
    public static final LocalDateTime MAX = of(LocalDate.MAX, LocalTime.MAX);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.LocalDateTime$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoUnit;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            $SwitchMap$java$time$temporal$ChronoUnit = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.date = localDate;
        this.time = localTime;
    }

    private int compareTo0(LocalDateTime localDateTime) {
        int compareTo0 = this.date.compareTo0(localDateTime.toLocalDate());
        return compareTo0 == 0 ? this.time.compareTo(localDateTime.toLocalTime()) : compareTo0;
    }

    public static LocalDateTime from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).toLocalDateTime();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.from(temporalAccessor), LocalTime.from(temporalAccessor));
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public static LocalDateTime now() {
        return now(Clock.systemDefaultZone());
    }

    public static LocalDateTime now(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        Instant instant = clock.instant();
        return ofEpochSecond(instant.getEpochSecond(), instant.getNano(), clock.getZone().getRules().getOffset(instant));
    }

    public static LocalDateTime of(int i10, int i11, int i12, int i13, int i14) {
        return new LocalDateTime(LocalDate.of(i10, i11, i12), LocalTime.of(i13, i14));
    }

    public static LocalDateTime of(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new LocalDateTime(LocalDate.of(i10, i11, i12), LocalTime.of(i13, i14, i15, i16));
    }

    public static LocalDateTime of(int i10, Month month, int i11, int i12, int i13) {
        return new LocalDateTime(LocalDate.of(i10, month, i11), LocalTime.of(i12, i13));
    }

    public static LocalDateTime of(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime ofEpochSecond(long j10, int i10, ZoneOffset zoneOffset) {
        long m10;
        Objects.requireNonNull(zoneOffset, "offset");
        long j11 = i10;
        ChronoField.NANO_OF_SECOND.checkValidValue(j11);
        m10 = DesugarLocalDate$$ExternalSyntheticBackport1.m(j10 + zoneOffset.getTotalSeconds(), 86400);
        return new LocalDateTime(LocalDate.ofEpochDay(m10), LocalTime.ofNanoOfDay((LocalDateTime$$ExternalSyntheticBackport5.m(r5, 86400) * 1000000000) + j11));
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ofEpochSecond(instant.getEpochSecond(), instant.getNano(), zoneId.getRules().getOffset(instant));
    }

    private LocalDateTime plusWithOverflow(LocalDate localDate, long j10, long j11, long j12, long j13, int i10) {
        LocalTime ofNanoOfDay;
        LocalDate localDate2 = localDate;
        if ((j10 | j11 | j12 | j13) == 0) {
            ofNanoOfDay = this.time;
        } else {
            long j14 = i10;
            long nanoOfDay = this.time.toNanoOfDay();
            long j15 = (((j13 % 86400000000000L) + ((j12 % 86400) * 1000000000) + ((j11 % 1440) * 60000000000L) + ((j10 % 24) * 3600000000000L)) * j14) + nanoOfDay;
            long m10 = (((j13 / 86400000000000L) + (j12 / 86400) + (j11 / 1440) + (j10 / 24)) * j14) + DesugarLocalDate$$ExternalSyntheticBackport1.m(j15, 86400000000000L);
            long m11 = Clock$TickClock$$ExternalSyntheticBackport0.m(j15, 86400000000000L);
            ofNanoOfDay = m11 == nanoOfDay ? this.time : LocalTime.ofNanoOfDay(m11);
            localDate2 = localDate2.plusDays(m10);
        }
        return with(localDate2, ofNanoOfDay);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LocalDateTime readExternal(DataInput dataInput) {
        return of(LocalDate.readExternal(dataInput), LocalTime.readExternal(dataInput));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private LocalDateTime with(LocalDate localDate, LocalTime localTime) {
        return (this.date == localDate && this.time == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    private Object writeReplace() {
        return new Ser((byte) 5, this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        return ChronoLocalDateTime.CC.$default$adjustInto(this, temporal);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.of(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.of(this, zoneId);
    }

    @Override // java.lang.Comparable
    public int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? compareTo0((LocalDateTime) chronoLocalDateTime) : ChronoLocalDateTime.CC.$default$compareTo((ChronoLocalDateTime) this, chronoLocalDateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            return this.date.equals(localDateTime.date) && this.time.equals(localDateTime.time);
        }
        return false;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).isTimeBased() ? this.time.get(temporalField) : this.date.get(temporalField) : TemporalAccessor.CC.$default$get(this, temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public /* synthetic */ Chronology getChronology() {
        return ChronoLocalDateTime.CC.$default$getChronology(this);
    }

    public int getDayOfMonth() {
        return this.date.getDayOfMonth();
    }

    public int getDayOfYear() {
        return this.date.getDayOfYear();
    }

    public int getHour() {
        return this.time.getHour();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).isTimeBased() ? this.time.getLong(temporalField) : this.date.getLong(temporalField) : temporalField.getFrom(this);
    }

    public int getMinute() {
        return this.time.getMinute();
    }

    public Month getMonth() {
        return this.date.getMonth();
    }

    public int getMonthValue() {
        return this.date.getMonthValue();
    }

    public int getNano() {
        return this.time.getNano();
    }

    public int getSecond() {
        return this.time.getSecond();
    }

    public int getYear() {
        return this.date.getYear();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public int hashCode() {
        return this.date.hashCode() ^ this.time.hashCode();
    }

    public boolean isAfter(ChronoLocalDateTime chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? compareTo0((LocalDateTime) chronoLocalDateTime) > 0 : ChronoLocalDateTime.CC.$default$isAfter(this, chronoLocalDateTime);
    }

    public boolean isBefore(ChronoLocalDateTime chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? compareTo0((LocalDateTime) chronoLocalDateTime) < 0 : ChronoLocalDateTime.CC.$default$isBefore(this, chronoLocalDateTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.isSupportedBy(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.isTimeBased();
    }

    @Override // j$.time.temporal.Temporal
    public LocalDateTime minus(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j10, temporalUnit);
    }

    @Override // j$.time.temporal.Temporal
    public LocalDateTime plus(long j10, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusNanos(j10);
                case 2:
                    return plusDays(j10 / 86400000000L).plusNanos((j10 % 86400000000L) * 1000);
                case 3:
                    return plusDays(j10 / 86400000).plusNanos((j10 % 86400000) * 1000000);
                case 4:
                    return plusSeconds(j10);
                case 5:
                    return plusMinutes(j10);
                case 6:
                    return plusHours(j10);
                case 7:
                    return plusDays(j10 / 256).plusHours((j10 % 256) * 12);
                default:
                    return with(this.date.plus(j10, temporalUnit), this.time);
            }
        }
        return (LocalDateTime) temporalUnit.addTo(this, j10);
    }

    public LocalDateTime plusDays(long j10) {
        return with(this.date.plusDays(j10), this.time);
    }

    public LocalDateTime plusHours(long j10) {
        return plusWithOverflow(this.date, j10, 0L, 0L, 0L, 1);
    }

    public LocalDateTime plusMinutes(long j10) {
        return plusWithOverflow(this.date, 0L, j10, 0L, 0L, 1);
    }

    public LocalDateTime plusNanos(long j10) {
        return plusWithOverflow(this.date, 0L, 0L, 0L, j10, 1);
    }

    public LocalDateTime plusSeconds(long j10) {
        return plusWithOverflow(this.date, 0L, 0L, j10, 0L, 1);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object query(TemporalQuery temporalQuery) {
        return temporalQuery == TemporalQueries.localDate() ? this.date : ChronoLocalDateTime.CC.$default$query(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).isTimeBased() ? this.time.range(temporalField) : this.date.range(temporalField) : temporalField.rangeRefinedBy(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return ChronoLocalDateTime.CC.$default$toEpochSecond(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public LocalDate toLocalDate() {
        return this.date;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public LocalTime toLocalTime() {
        return this.time;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public String toString() {
        return this.date.toString() + RequestConfiguration.MAX_AD_CONTENT_RATING_T + this.time.toString();
    }

    @Override // j$.time.temporal.Temporal
    public LocalDateTime with(TemporalAdjuster temporalAdjuster) {
        return temporalAdjuster instanceof LocalDate ? with((LocalDate) temporalAdjuster, this.time) : temporalAdjuster instanceof LocalTime ? with(this.date, (LocalTime) temporalAdjuster) : temporalAdjuster instanceof LocalDateTime ? (LocalDateTime) temporalAdjuster : (LocalDateTime) temporalAdjuster.adjustInto(this);
    }

    @Override // j$.time.temporal.Temporal
    public LocalDateTime with(TemporalField temporalField, long j10) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).isTimeBased() ? with(this.date, this.time.with(temporalField, j10)) : with(this.date.with(temporalField, j10), this.time) : (LocalDateTime) temporalField.adjustInto(this, j10);
    }

    public LocalDateTime withDayOfMonth(int i10) {
        return with(this.date.withDayOfMonth(i10), this.time);
    }

    public LocalDateTime withHour(int i10) {
        return with(this.date, this.time.withHour(i10));
    }

    public LocalDateTime withMinute(int i10) {
        return with(this.date, this.time.withMinute(i10));
    }

    public LocalDateTime withMonth(int i10) {
        return with(this.date.withMonth(i10), this.time);
    }

    public LocalDateTime withYear(int i10) {
        return with(this.date.withYear(i10), this.time);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        this.date.writeExternal(dataOutput);
        this.time.writeExternal(dataOutput);
    }
}
