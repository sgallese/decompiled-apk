package j$.time.chrono;

import com.google.android.gms.ads.RequestConfiguration;
import j$.time.Clock$TickClock$$ExternalSyntheticBackport0;
import j$.time.DesugarLocalDate$$ExternalSyntheticBackport1;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.ValueRange;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ChronoLocalDateTimeImpl implements ChronoLocalDateTime, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    private final transient ChronoLocalDate date;
    private final transient LocalTime time;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.ChronoLocalDateTimeImpl$1  reason: invalid class name */
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

    private ChronoLocalDateTimeImpl(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(chronoLocalDate, "date");
        Objects.requireNonNull(localTime, "time");
        this.date = chronoLocalDate;
        this.time = localTime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChronoLocalDateTimeImpl ensureValid(Chronology chronology, Temporal temporal) {
        ChronoLocalDateTimeImpl chronoLocalDateTimeImpl = (ChronoLocalDateTimeImpl) temporal;
        if (chronology.equals(chronoLocalDateTimeImpl.getChronology())) {
            return chronoLocalDateTimeImpl;
        }
        throw new ClassCastException("Chronology mismatch, required: " + chronology.getId() + ", actual: " + chronoLocalDateTimeImpl.getChronology().getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChronoLocalDateTimeImpl of(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        return new ChronoLocalDateTimeImpl(chronoLocalDate, localTime);
    }

    private ChronoLocalDateTimeImpl plusDays(long j10) {
        return with(this.date.plus(j10, (TemporalUnit) ChronoUnit.DAYS), this.time);
    }

    private ChronoLocalDateTimeImpl plusHours(long j10) {
        return plusWithOverflow(this.date, j10, 0L, 0L, 0L);
    }

    private ChronoLocalDateTimeImpl plusMinutes(long j10) {
        return plusWithOverflow(this.date, 0L, j10, 0L, 0L);
    }

    private ChronoLocalDateTimeImpl plusNanos(long j10) {
        return plusWithOverflow(this.date, 0L, 0L, 0L, j10);
    }

    private ChronoLocalDateTimeImpl plusWithOverflow(ChronoLocalDate chronoLocalDate, long j10, long j11, long j12, long j13) {
        LocalTime ofNanoOfDay;
        ChronoLocalDate chronoLocalDate2 = chronoLocalDate;
        if ((j10 | j11 | j12 | j13) == 0) {
            ofNanoOfDay = this.time;
        } else {
            long nanoOfDay = this.time.toNanoOfDay();
            long j14 = (j13 % 86400000000000L) + ((j12 % 86400) * 1000000000) + ((j11 % 1440) * 60000000000L) + ((j10 % 24) * 3600000000000L) + nanoOfDay;
            long m10 = (j13 / 86400000000000L) + (j12 / 86400) + (j11 / 1440) + (j10 / 24) + DesugarLocalDate$$ExternalSyntheticBackport1.m(j14, 86400000000000L);
            long m11 = Clock$TickClock$$ExternalSyntheticBackport0.m(j14, 86400000000000L);
            ofNanoOfDay = m11 == nanoOfDay ? this.time : LocalTime.ofNanoOfDay(m11);
            chronoLocalDate2 = chronoLocalDate2.plus(m10, (TemporalUnit) ChronoUnit.DAYS);
        }
        return with(chronoLocalDate2, ofNanoOfDay);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChronoLocalDateTime readExternal(ObjectInput objectInput) {
        return ((ChronoLocalDate) objectInput.readObject()).atTime((LocalTime) objectInput.readObject());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private ChronoLocalDateTimeImpl with(Temporal temporal, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.date;
        return (chronoLocalDate == temporal && this.time == localTime) ? this : new ChronoLocalDateTimeImpl(ChronoLocalDateImpl.ensureValid(chronoLocalDate.getChronology(), temporal), localTime);
    }

    private Object writeReplace() {
        return new Ser((byte) 2, this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public /* synthetic */ Temporal adjustInto(Temporal temporal) {
        Temporal with;
        with = temporal.with(ChronoField.EPOCH_DAY, toLocalDate().toEpochDay()).with(ChronoField.NANO_OF_DAY, toLocalTime().toNanoOfDay());
        return with;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public ChronoZonedDateTime atZone(ZoneId zoneId) {
        return ChronoZonedDateTimeImpl.ofBest(this, zoneId, null);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return ChronoLocalDateTime.CC.$default$compareTo((ChronoLocalDateTime) this, chronoLocalDateTime);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        compareTo = compareTo((ChronoLocalDateTime) obj);
        return compareTo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && compareTo((ChronoLocalDateTime) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).isTimeBased() ? this.time.get(temporalField) : this.date.get(temporalField) : range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public /* synthetic */ Chronology getChronology() {
        Chronology chronology;
        chronology = toLocalDate().getChronology();
        return chronology;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).isTimeBased() ? this.time.getLong(temporalField) : this.date.getLong(temporalField) : temporalField.getFrom(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public int hashCode() {
        return toLocalDate().hashCode() ^ toLocalTime().hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.isSupportedBy(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.isTimeBased();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    public /* synthetic */ ChronoLocalDateTime minus(long j10, TemporalUnit temporalUnit) {
        ChronoLocalDateTime ensureValid;
        ensureValid = ensureValid(getChronology(), Temporal.CC.$default$minus(this, j10, temporalUnit));
        return ensureValid;
    }

    @Override // j$.time.temporal.Temporal
    public /* bridge */ /* synthetic */ Temporal minus(long j10, TemporalUnit temporalUnit) {
        Temporal minus;
        minus = minus(j10, temporalUnit);
        return minus;
    }

    @Override // j$.time.temporal.Temporal
    public ChronoLocalDateTimeImpl plus(long j10, TemporalUnit temporalUnit) {
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
        return ensureValid(this.date.getChronology(), temporalUnit.addTo(this, j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChronoLocalDateTimeImpl plusSeconds(long j10) {
        return plusWithOverflow(this.date, 0L, 0L, j10, 0L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ Object query(TemporalQuery temporalQuery) {
        return ChronoLocalDateTime.CC.$default$query(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).isTimeBased() ? this.time.range(temporalField) : this.date.range(temporalField) : temporalField.rangeRefinedBy(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return ChronoLocalDateTime.CC.$default$toEpochSecond(this, zoneOffset);
    }

    public /* synthetic */ Instant toInstant(ZoneOffset zoneOffset) {
        Instant ofEpochSecond;
        ofEpochSecond = Instant.ofEpochSecond(toEpochSecond(zoneOffset), toLocalTime().getNano());
        return ofEpochSecond;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public ChronoLocalDate toLocalDate() {
        return this.date;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public LocalTime toLocalTime() {
        return this.time;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public String toString() {
        return toLocalDate().toString() + RequestConfiguration.MAX_AD_CONTENT_RATING_T + toLocalTime().toString();
    }

    @Override // j$.time.temporal.Temporal
    public ChronoLocalDateTimeImpl with(TemporalAdjuster temporalAdjuster) {
        return temporalAdjuster instanceof ChronoLocalDate ? with((ChronoLocalDate) temporalAdjuster, this.time) : temporalAdjuster instanceof LocalTime ? with(this.date, (LocalTime) temporalAdjuster) : temporalAdjuster instanceof ChronoLocalDateTimeImpl ? ensureValid(this.date.getChronology(), (ChronoLocalDateTimeImpl) temporalAdjuster) : ensureValid(this.date.getChronology(), (ChronoLocalDateTimeImpl) temporalAdjuster.adjustInto(this));
    }

    @Override // j$.time.temporal.Temporal
    public ChronoLocalDateTimeImpl with(TemporalField temporalField, long j10) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).isTimeBased() ? with(this.date, this.time.with(temporalField, j10)) : with(this.date.with(temporalField, j10), this.time) : ensureValid(this.date.getChronology(), temporalField.adjustInto(this, j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.date);
        objectOutput.writeObject(this.time);
    }
}
