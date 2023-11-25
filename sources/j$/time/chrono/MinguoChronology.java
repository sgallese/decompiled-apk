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
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MinguoChronology extends AbstractChronology implements Serializable {
    public static final MinguoChronology INSTANCE = new MinguoChronology();
    private static final long serialVersionUID = 1039765215346859963L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.MinguoChronology$1  reason: invalid class name */
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

    private MinguoChronology() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public MinguoDate date(int i10, int i11, int i12) {
        return new MinguoDate(LocalDate.of(i10 + 1911, i11, i12));
    }

    @Override // j$.time.chrono.Chronology
    public MinguoDate date(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof MinguoDate ? (MinguoDate) temporalAccessor : new MinguoDate(LocalDate.from(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public MinguoDate dateEpochDay(long j10) {
        return new MinguoDate(LocalDate.ofEpochDay(j10));
    }

    @Override // j$.time.chrono.AbstractChronology
    public MinguoDate dateNow() {
        return dateNow(Clock.systemDefaultZone());
    }

    public MinguoDate dateNow(Clock clock) {
        return date((TemporalAccessor) LocalDate.now(clock));
    }

    @Override // j$.time.chrono.Chronology
    public MinguoDate dateYearDay(int i10, int i11) {
        return new MinguoDate(LocalDate.ofYearDay(i10 + 1911, i11));
    }

    @Override // j$.time.chrono.Chronology
    public MinguoEra eraOf(int i10) {
        return MinguoEra.of(i10);
    }

    @Override // j$.time.chrono.Chronology
    public List eras() {
        return Duration$DurationUnits$$ExternalSyntheticBackport1.m(MinguoEra.values());
    }

    @Override // j$.time.chrono.Chronology
    public String getCalendarType() {
        return "roc";
    }

    @Override // j$.time.chrono.Chronology
    public String getId() {
        return "Minguo";
    }

    @Override // j$.time.chrono.Chronology
    public boolean isLeapYear(long j10) {
        return IsoChronology.INSTANCE.isLeapYear(j10 + 1911);
    }

    @Override // j$.time.chrono.AbstractChronology, j$.time.chrono.Chronology
    public ChronoLocalDateTime localDateTime(TemporalAccessor temporalAccessor) {
        return super.localDateTime(temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    public int prolepticYear(Era era, int i10) {
        if (era instanceof MinguoEra) {
            return era == MinguoEra.ROC ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.Chronology
    public ValueRange range(ChronoField chronoField) {
        int i10 = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
        if (i10 == 1) {
            ValueRange range = ChronoField.PROLEPTIC_MONTH.range();
            return ValueRange.of(range.getMinimum() - 22932, range.getMaximum() - 22932);
        } else if (i10 == 2) {
            ValueRange range2 = ChronoField.YEAR.range();
            return ValueRange.of(1L, range2.getMaximum() - 1911, (-range2.getMinimum()) + 1 + 1911);
        } else if (i10 != 3) {
            return chronoField.range();
        } else {
            ValueRange range3 = ChronoField.YEAR.range();
            return ValueRange.of(range3.getMinimum() - 1911, range3.getMaximum() - 1911);
        }
    }

    @Override // j$.time.chrono.AbstractChronology, j$.time.chrono.Chronology
    public MinguoDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return (MinguoDate) super.resolveDate(map, resolverStyle);
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
