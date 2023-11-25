package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
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
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public final class LocalTime implements Temporal, TemporalAdjuster, Comparable, Serializable {
    private static final LocalTime[] HOURS = new LocalTime[24];
    public static final LocalTime MAX;
    public static final LocalTime MIDNIGHT;
    public static final LocalTime MIN;
    public static final LocalTime NOON;
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte hour;
    private final byte minute;
    private final int nano;
    private final byte second;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.LocalTime$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;
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
            int[] iArr2 = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr2;
            try {
                iArr2[ChronoField.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.NANO_OF_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.MICRO_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.MICRO_OF_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.MILLI_OF_SECOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.MILLI_OF_DAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.SECOND_OF_MINUTE.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.SECOND_OF_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.MINUTE_OF_HOUR.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.MINUTE_OF_DAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.HOUR_OF_AMPM.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.CLOCK_HOUR_OF_AMPM.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.HOUR_OF_DAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.CLOCK_HOUR_OF_DAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.AMPM_OF_DAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    static {
        int i10 = 0;
        while (true) {
            LocalTime[] localTimeArr = HOURS;
            if (i10 >= localTimeArr.length) {
                LocalTime localTime = localTimeArr[0];
                MIDNIGHT = localTime;
                NOON = localTimeArr[12];
                MIN = localTime;
                MAX = new LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i10] = new LocalTime(i10, 0, 0, 0);
            i10++;
        }
    }

    private LocalTime(int i10, int i11, int i12, int i13) {
        this.hour = (byte) i10;
        this.minute = (byte) i11;
        this.second = (byte) i12;
        this.nano = i13;
    }

    private static LocalTime create(int i10, int i11, int i12, int i13) {
        return ((i11 | i12) | i13) == 0 ? HOURS[i10] : new LocalTime(i10, i11, i12, i13);
    }

    public static LocalTime from(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.query(TemporalQueries.localTime());
        if (localTime != null) {
            return localTime;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    private int get0(TemporalField temporalField) {
        switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.nano;
            case 2:
                throw new UnsupportedTemporalTypeException("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.nano / 1000;
            case 4:
                throw new UnsupportedTemporalTypeException("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.nano / 1000000;
            case 6:
                return (int) (toNanoOfDay() / 1000000);
            case 7:
                return this.second;
            case 8:
                return toSecondOfDay();
            case 9:
                return this.minute;
            case 10:
                return (this.hour * 60) + this.minute;
            case 11:
                return this.hour % 12;
            case 12:
                int i10 = this.hour % 12;
                if (i10 % 12 == 0) {
                    return 12;
                }
                return i10;
            case 13:
                return this.hour;
            case 14:
                byte b10 = this.hour;
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case 15:
                return this.hour / 12;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
    }

    public static LocalTime of(int i10, int i11) {
        ChronoField.HOUR_OF_DAY.checkValidValue(i10);
        if (i11 == 0) {
            return HOURS[i10];
        }
        ChronoField.MINUTE_OF_HOUR.checkValidValue(i11);
        return new LocalTime(i10, i11, 0, 0);
    }

    public static LocalTime of(int i10, int i11, int i12, int i13) {
        ChronoField.HOUR_OF_DAY.checkValidValue(i10);
        ChronoField.MINUTE_OF_HOUR.checkValidValue(i11);
        ChronoField.SECOND_OF_MINUTE.checkValidValue(i12);
        ChronoField.NANO_OF_SECOND.checkValidValue(i13);
        return create(i10, i11, i12, i13);
    }

    public static LocalTime ofNanoOfDay(long j10) {
        ChronoField.NANO_OF_DAY.checkValidValue(j10);
        int i10 = (int) (j10 / 3600000000000L);
        long j11 = j10 - (i10 * 3600000000000L);
        int i11 = (int) (j11 / 60000000000L);
        long j12 = j11 - (i11 * 60000000000L);
        int i12 = (int) (j12 / 1000000000);
        return create(i10, i11, i12, (int) (j12 - (i12 * 1000000000)));
    }

    public static LocalTime ofSecondOfDay(long j10) {
        ChronoField.SECOND_OF_DAY.checkValidValue(j10);
        int i10 = (int) (j10 / 3600);
        long j11 = j10 - (i10 * 3600);
        return create(i10, (int) (j11 / 60), (int) (j11 - (r0 * 60)), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    public static LocalTime readExternal(DataInput dataInput) {
        byte b10;
        int i10;
        byte b11;
        int readByte = dataInput.readByte();
        byte b12 = 0;
        if (readByte >= 0) {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                ?? r52 = ~readByte2;
                i10 = 0;
                b12 = r52;
                b10 = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    b12 = readByte2;
                    b11 = ~readByte3;
                } else {
                    int readInt = dataInput.readInt();
                    b10 = readByte3;
                    i10 = readInt;
                    b12 = readByte2;
                }
            }
            return of(readByte, b12, b10, i10);
        }
        readByte = ~readByte;
        b11 = 0;
        i10 = 0;
        b10 = b11;
        return of(readByte, b12, b10, i10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 4, this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.NANO_OF_DAY, toNanoOfDay());
    }

    public OffsetTime atOffset(ZoneOffset zoneOffset) {
        return OffsetTime.of(this, zoneOffset);
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalTime localTime) {
        int compare = Integer.compare(this.hour, localTime.hour);
        if (compare == 0) {
            int compare2 = Integer.compare(this.minute, localTime.minute);
            if (compare2 == 0) {
                int compare3 = Integer.compare(this.second, localTime.second);
                return compare3 == 0 ? Integer.compare(this.nano, localTime.nano) : compare3;
            }
            return compare2;
        }
        return compare;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            return this.hour == localTime.hour && this.minute == localTime.minute && this.second == localTime.second && this.nano == localTime.nano;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? get0(temporalField) : TemporalAccessor.CC.$default$get(this, temporalField);
    }

    public int getHour() {
        return this.hour;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.NANO_OF_DAY ? toNanoOfDay() : temporalField == ChronoField.MICRO_OF_DAY ? toNanoOfDay() / 1000 : get0(temporalField) : temporalField.getFrom(this);
    }

    public int getMinute() {
        return this.minute;
    }

    public int getNano() {
        return this.nano;
    }

    public int getSecond() {
        return this.second;
    }

    public int hashCode() {
        long nanoOfDay = toNanoOfDay();
        return (int) (nanoOfDay ^ (nanoOfDay >>> 32));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField.isTimeBased() : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // j$.time.temporal.Temporal
    public LocalTime minus(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j10, temporalUnit);
    }

    @Override // j$.time.temporal.Temporal
    public LocalTime plus(long j10, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusNanos(j10);
                case 2:
                    return plusNanos((j10 % 86400000000L) * 1000);
                case 3:
                    return plusNanos((j10 % 86400000) * 1000000);
                case 4:
                    return plusSeconds(j10);
                case 5:
                    return plusMinutes(j10);
                case 6:
                    return plusHours(j10);
                case 7:
                    return plusHours((j10 % 2) * 12);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
            }
        }
        return (LocalTime) temporalUnit.addTo(this, j10);
    }

    public LocalTime plusHours(long j10) {
        return j10 == 0 ? this : create(((((int) (j10 % 24)) + this.hour) + 24) % 24, this.minute, this.second, this.nano);
    }

    public LocalTime plusMinutes(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i10 = (this.hour * 60) + this.minute;
        int i11 = ((((int) (j10 % 1440)) + i10) + 1440) % 1440;
        return i10 == i11 ? this : create(i11 / 60, i11 % 60, this.second, this.nano);
    }

    public LocalTime plusNanos(long j10) {
        if (j10 == 0) {
            return this;
        }
        long nanoOfDay = toNanoOfDay();
        long j11 = (((j10 % 86400000000000L) + nanoOfDay) + 86400000000000L) % 86400000000000L;
        return nanoOfDay == j11 ? this : create((int) (j11 / 3600000000000L), (int) ((j11 / 60000000000L) % 60), (int) ((j11 / 1000000000) % 60), (int) (j11 % 1000000000));
    }

    public LocalTime plusSeconds(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i10 = (this.hour * 3600) + (this.minute * 60) + this.second;
        int i11 = ((((int) (j10 % 86400)) + i10) + 86400) % 86400;
        return i10 == i11 ? this : create(i11 / 3600, (i11 / 60) % 60, i11 % 60, this.nano);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.chronology() || temporalQuery == TemporalQueries.zoneId() || temporalQuery == TemporalQueries.zone() || temporalQuery == TemporalQueries.offset()) {
            return null;
        }
        if (temporalQuery == TemporalQueries.localTime()) {
            return this;
        }
        if (temporalQuery == TemporalQueries.localDate()) {
            return null;
        }
        return temporalQuery == TemporalQueries.precision() ? ChronoUnit.NANOS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        return TemporalAccessor.CC.$default$range(this, temporalField);
    }

    public long toNanoOfDay() {
        return (this.hour * 3600000000000L) + (this.minute * 60000000000L) + (this.second * 1000000000) + this.nano;
    }

    public int toSecondOfDay() {
        return (this.hour * 3600) + (this.minute * 60) + this.second;
    }

    public String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.hour;
        byte b11 = this.minute;
        byte b12 = this.second;
        int i11 = this.nano;
        sb2.append(b10 < 10 ? "0" : "");
        sb2.append((int) b10);
        sb2.append(b11 < 10 ? ":0" : ":");
        sb2.append((int) b11);
        if (b12 > 0 || i11 > 0) {
            sb2.append(b12 >= 10 ? ":" : ":0");
            sb2.append((int) b12);
            if (i11 > 0) {
                sb2.append('.');
                int i12 = 1000000;
                if (i11 % 1000000 == 0) {
                    i10 = (i11 / 1000000) + 1000;
                } else {
                    if (i11 % 1000 == 0) {
                        i11 /= 1000;
                    } else {
                        i12 = Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
                    }
                    i10 = i11 + i12;
                }
                sb2.append(Integer.toString(i10).substring(1));
            }
        }
        return sb2.toString();
    }

    @Override // j$.time.temporal.Temporal
    public LocalTime with(TemporalAdjuster temporalAdjuster) {
        return temporalAdjuster instanceof LocalTime ? (LocalTime) temporalAdjuster : (LocalTime) temporalAdjuster.adjustInto(this);
    }

    @Override // j$.time.temporal.Temporal
    public LocalTime with(TemporalField temporalField, long j10) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.checkValidValue(j10);
            switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()]) {
                case 1:
                    return withNano((int) j10);
                case 2:
                    return ofNanoOfDay(j10);
                case 3:
                    return withNano(((int) j10) * 1000);
                case 4:
                    return ofNanoOfDay(j10 * 1000);
                case 5:
                    return withNano(((int) j10) * 1000000);
                case 6:
                    return ofNanoOfDay(j10 * 1000000);
                case 7:
                    return withSecond((int) j10);
                case 8:
                    return plusSeconds(j10 - toSecondOfDay());
                case 9:
                    return withMinute((int) j10);
                case 10:
                    return plusMinutes(j10 - ((this.hour * 60) + this.minute));
                case 11:
                    return plusHours(j10 - (this.hour % 12));
                case 12:
                    if (j10 == 12) {
                        j10 = 0;
                    }
                    return plusHours(j10 - (this.hour % 12));
                case 13:
                    return withHour((int) j10);
                case 14:
                    if (j10 == 24) {
                        j10 = 0;
                    }
                    return withHour((int) j10);
                case 15:
                    return plusHours((j10 - (this.hour / 12)) * 12);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
            }
        }
        return (LocalTime) temporalField.adjustInto(this, j10);
    }

    public LocalTime withHour(int i10) {
        if (this.hour == i10) {
            return this;
        }
        ChronoField.HOUR_OF_DAY.checkValidValue(i10);
        return create(i10, this.minute, this.second, this.nano);
    }

    public LocalTime withMinute(int i10) {
        if (this.minute == i10) {
            return this;
        }
        ChronoField.MINUTE_OF_HOUR.checkValidValue(i10);
        return create(this.hour, i10, this.second, this.nano);
    }

    public LocalTime withNano(int i10) {
        if (this.nano == i10) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.checkValidValue(i10);
        return create(this.hour, this.minute, this.second, i10);
    }

    public LocalTime withSecond(int i10) {
        if (this.second == i10) {
            return this;
        }
        ChronoField.SECOND_OF_MINUTE.checkValidValue(i10);
        return create(this.hour, this.minute, i10, this.nano);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        byte b10;
        if (this.nano != 0) {
            dataOutput.writeByte(this.hour);
            dataOutput.writeByte(this.minute);
            dataOutput.writeByte(this.second);
            dataOutput.writeInt(this.nano);
            return;
        }
        if (this.second != 0) {
            dataOutput.writeByte(this.hour);
            dataOutput.writeByte(this.minute);
            b10 = this.second;
        } else if (this.minute == 0) {
            b10 = this.hour;
        } else {
            dataOutput.writeByte(this.hour);
            b10 = this.minute;
        }
        dataOutput.writeByte(~b10);
    }
}
