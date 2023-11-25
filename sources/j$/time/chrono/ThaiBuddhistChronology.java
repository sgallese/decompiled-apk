package j$.time.chrono;

import j$.time.Clock;
import j$.time.Duration$DurationUnits$$ExternalSyntheticBackport1;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ThaiBuddhistChronology extends AbstractChronology implements Serializable {
    private static final HashMap ERA_FULL_NAMES;
    private static final HashMap ERA_NARROW_NAMES;
    private static final HashMap ERA_SHORT_NAMES;
    public static final ThaiBuddhistChronology INSTANCE = new ThaiBuddhistChronology();
    private static final long serialVersionUID = 2775954514031616474L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.ThaiBuddhistChronology$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;

        static {
            int[] iArr = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr;
            try {
                iArr[ChronoField.PROLEPTIC_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        ERA_NARROW_NAMES = hashMap;
        HashMap hashMap2 = new HashMap();
        ERA_SHORT_NAMES = hashMap2;
        HashMap hashMap3 = new HashMap();
        ERA_FULL_NAMES = hashMap3;
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private ThaiBuddhistChronology() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public ThaiBuddhistDate date(int i10, int i11, int i12) {
        return new ThaiBuddhistDate(LocalDate.of(i10 - 543, i11, i12));
    }

    @Override // j$.time.chrono.Chronology
    public ThaiBuddhistDate date(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof ThaiBuddhistDate ? (ThaiBuddhistDate) temporalAccessor : new ThaiBuddhistDate(LocalDate.from(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public ThaiBuddhistDate dateEpochDay(long j10) {
        return new ThaiBuddhistDate(LocalDate.ofEpochDay(j10));
    }

    @Override // j$.time.chrono.AbstractChronology
    public ThaiBuddhistDate dateNow() {
        return dateNow(Clock.systemDefaultZone());
    }

    public ThaiBuddhistDate dateNow(Clock clock) {
        return date((TemporalAccessor) LocalDate.now(clock));
    }

    @Override // j$.time.chrono.Chronology
    public ThaiBuddhistDate dateYearDay(int i10, int i11) {
        return new ThaiBuddhistDate(LocalDate.ofYearDay(i10 - 543, i11));
    }

    @Override // j$.time.chrono.Chronology
    public ThaiBuddhistEra eraOf(int i10) {
        return ThaiBuddhistEra.of(i10);
    }

    @Override // j$.time.chrono.Chronology
    public List eras() {
        return Duration$DurationUnits$$ExternalSyntheticBackport1.m(ThaiBuddhistEra.values());
    }

    @Override // j$.time.chrono.Chronology
    public String getCalendarType() {
        return "buddhist";
    }

    @Override // j$.time.chrono.Chronology
    public String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.Chronology
    public boolean isLeapYear(long j10) {
        return IsoChronology.INSTANCE.isLeapYear(j10 - 543);
    }

    @Override // j$.time.chrono.AbstractChronology, j$.time.chrono.Chronology
    public ChronoLocalDateTime localDateTime(TemporalAccessor temporalAccessor) {
        return super.localDateTime(temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    public int prolepticYear(Era era, int i10) {
        if (era instanceof ThaiBuddhistEra) {
            return era == ThaiBuddhistEra.BE ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // j$.time.chrono.Chronology
    public ValueRange range(ChronoField chronoField) {
        int i10 = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
        if (i10 == 1) {
            ValueRange range = ChronoField.PROLEPTIC_MONTH.range();
            return ValueRange.of(range.getMinimum() + 6516, range.getMaximum() + 6516);
        } else if (i10 == 2) {
            ValueRange range2 = ChronoField.YEAR.range();
            return ValueRange.of(1L, 1 + (-(range2.getMinimum() + 543)), range2.getMaximum() + 543);
        } else if (i10 != 3) {
            return chronoField.range();
        } else {
            ValueRange range3 = ChronoField.YEAR.range();
            return ValueRange.of(range3.getMinimum() + 543, range3.getMaximum() + 543);
        }
    }

    @Override // j$.time.chrono.AbstractChronology, j$.time.chrono.Chronology
    public ThaiBuddhistDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return (ThaiBuddhistDate) super.resolveDate(map, resolverStyle);
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
