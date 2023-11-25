package j$.time;

import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
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
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class YearMonth implements Temporal, TemporalAdjuster, Comparable, Serializable {
    private static final DateTimeFormatter PARSER = new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
    private static final long serialVersionUID = 4183400860270640070L;
    private final int month;
    private final int year;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.YearMonth$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoUnit;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            $SwitchMap$java$time$temporal$ChronoUnit = iArr;
            try {
                iArr[ChronoUnit.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.CENTURIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MILLENNIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.ERAS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr2;
            try {
                iArr2[ChronoField.MONTH_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.PROLEPTIC_MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR_OF_ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ERA.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private YearMonth(int i10, int i11) {
        this.year = i10;
        this.month = i11;
    }

    private long getProlepticMonth() {
        return ((this.year * 12) + this.month) - 1;
    }

    public static YearMonth of(int i10, int i11) {
        ChronoField.YEAR.checkValidValue(i10);
        ChronoField.MONTH_OF_YEAR.checkValidValue(i11);
        return new YearMonth(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static YearMonth readExternal(DataInput dataInput) {
        return of(dataInput.readInt(), dataInput.readByte());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private YearMonth with(int i10, int i11) {
        return (this.year == i10 && this.month == i11) ? this : new YearMonth(i10, i11);
    }

    private Object writeReplace() {
        return new Ser((byte) 12, this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        if (Chronology.CC.from(temporal).equals(IsoChronology.INSTANCE)) {
            return temporal.with(ChronoField.PROLEPTIC_MONTH, getProlepticMonth());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    @Override // java.lang.Comparable
    public int compareTo(YearMonth yearMonth) {
        int i10 = this.year - yearMonth.year;
        return i10 == 0 ? this.month - yearMonth.month : i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YearMonth) {
            YearMonth yearMonth = (YearMonth) obj;
            return this.year == yearMonth.year && this.month == yearMonth.month;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        int i10;
        if (temporalField instanceof ChronoField) {
            int i11 = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()];
            if (i11 == 1) {
                i10 = this.month;
            } else if (i11 == 2) {
                return getProlepticMonth();
            } else {
                if (i11 == 3) {
                    int i12 = this.year;
                    if (i12 < 1) {
                        i12 = 1 - i12;
                    }
                    return i12;
                } else if (i11 != 4) {
                    if (i11 == 5) {
                        return this.year < 1 ? 0 : 1;
                    }
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
                } else {
                    i10 = this.year;
                }
            }
            return i10;
        }
        return temporalField.getFrom(this);
    }

    public int getYear() {
        return this.year;
    }

    public int hashCode() {
        return this.year ^ (this.month << 27);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // j$.time.temporal.Temporal
    public YearMonth minus(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j10, temporalUnit);
    }

    @Override // j$.time.temporal.Temporal
    public YearMonth plus(long j10, TemporalUnit temporalUnit) {
        long m10;
        long m11;
        long m12;
        if (temporalUnit instanceof ChronoUnit) {
            switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusMonths(j10);
                case 2:
                    return plusYears(j10);
                case 3:
                    m10 = Duration$$ExternalSyntheticBackport0.m(j10, 10);
                    return plusYears(m10);
                case 4:
                    m11 = Duration$$ExternalSyntheticBackport0.m(j10, 100);
                    return plusYears(m11);
                case 5:
                    m12 = Duration$$ExternalSyntheticBackport0.m(j10, 1000);
                    return plusYears(m12);
                case 6:
                    ChronoField chronoField = ChronoField.ERA;
                    return with((TemporalField) chronoField, Clock$OffsetClock$$ExternalSyntheticBackport0.m(getLong(chronoField), j10));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
            }
        }
        return (YearMonth) temporalUnit.addTo(this, j10);
    }

    public YearMonth plusMonths(long j10) {
        long m10;
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.year * 12) + ((long) (this.month - 1)) + j10;
        ChronoField chronoField = ChronoField.YEAR;
        m10 = DesugarLocalDate$$ExternalSyntheticBackport1.m(j11, 12);
        return with(chronoField.checkValidIntValue(m10), YearMonth$$ExternalSyntheticBackport4.m(j11, 12) + 1);
    }

    public YearMonth plusYears(long j10) {
        return j10 == 0 ? this : with(ChronoField.YEAR.checkValidIntValue(this.year + j10), this.month);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object query(TemporalQuery temporalQuery) {
        return temporalQuery == TemporalQueries.chronology() ? IsoChronology.INSTANCE : temporalQuery == TemporalQueries.precision() ? ChronoUnit.MONTHS : TemporalAccessor.CC.$default$query(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return ValueRange.of(1L, getYear() <= 0 ? 1000000000L : 999999999L);
        }
        return TemporalAccessor.CC.$default$range(this, temporalField);
    }

    public String toString() {
        int i10;
        int abs = Math.abs(this.year);
        StringBuilder sb2 = new StringBuilder(9);
        if (abs < 1000) {
            int i11 = this.year;
            if (i11 < 0) {
                sb2.append(i11 - 10000);
                i10 = 1;
            } else {
                sb2.append(i11 + 10000);
                i10 = 0;
            }
            sb2.deleteCharAt(i10);
        } else {
            sb2.append(this.year);
        }
        sb2.append(this.month < 10 ? "-0" : "-");
        sb2.append(this.month);
        return sb2.toString();
    }

    @Override // j$.time.temporal.Temporal
    public YearMonth with(TemporalAdjuster temporalAdjuster) {
        return (YearMonth) temporalAdjuster.adjustInto(this);
    }

    @Override // j$.time.temporal.Temporal
    public YearMonth with(TemporalField temporalField, long j10) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.checkValidValue(j10);
            int i10 = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        if (this.year < 1) {
                            j10 = 1 - j10;
                        }
                        return withYear((int) j10);
                    } else if (i10 != 4) {
                        if (i10 == 5) {
                            return getLong(ChronoField.ERA) == j10 ? this : withYear(1 - this.year);
                        }
                        throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
                    } else {
                        return withYear((int) j10);
                    }
                }
                return plusMonths(j10 - getProlepticMonth());
            }
            return withMonth((int) j10);
        }
        return (YearMonth) temporalField.adjustInto(this, j10);
    }

    public YearMonth withMonth(int i10) {
        ChronoField.MONTH_OF_YEAR.checkValidValue(i10);
        return with(this.year, i10);
    }

    public YearMonth withYear(int i10) {
        ChronoField.YEAR.checkValidValue(i10);
        return with(i10, this.month);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeInt(this.year);
        dataOutput.writeByte(this.month);
    }
}
