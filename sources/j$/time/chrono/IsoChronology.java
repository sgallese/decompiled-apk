package j$.time.chrono;

import j$.time.Clock;
import j$.time.DesugarLocalDate$$ExternalSyntheticBackport1;
import j$.time.Duration$DurationUnits$$ExternalSyntheticBackport1;
import j$.time.Instant;
import j$.time.Instant$$ExternalSyntheticBackport0;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.Year;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.ValueRange;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class IsoChronology extends AbstractChronology implements Serializable {
    public static final IsoChronology INSTANCE = new IsoChronology();
    private static final long serialVersionUID = -1440403870442975015L;

    private IsoChronology() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public LocalDate date(int i10, int i11, int i12) {
        return LocalDate.of(i10, i11, i12);
    }

    @Override // j$.time.chrono.Chronology
    public LocalDate date(TemporalAccessor temporalAccessor) {
        return LocalDate.from(temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    public LocalDate dateEpochDay(long j10) {
        return LocalDate.ofEpochDay(j10);
    }

    @Override // j$.time.chrono.AbstractChronology
    public LocalDate dateNow() {
        return dateNow(Clock.systemDefaultZone());
    }

    public LocalDate dateNow(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        return date((TemporalAccessor) LocalDate.now(clock));
    }

    @Override // j$.time.chrono.Chronology
    public LocalDate dateYearDay(int i10, int i11) {
        return LocalDate.ofYearDay(i10, i11);
    }

    @Override // j$.time.chrono.Chronology
    public IsoEra eraOf(int i10) {
        return IsoEra.of(i10);
    }

    @Override // j$.time.chrono.Chronology
    public List eras() {
        return Duration$DurationUnits$$ExternalSyntheticBackport1.m(IsoEra.values());
    }

    @Override // j$.time.chrono.Chronology
    public String getCalendarType() {
        return "iso8601";
    }

    @Override // j$.time.chrono.Chronology
    public String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.Chronology
    public boolean isLeapYear(long j10) {
        return (3 & j10) == 0 && (j10 % 100 != 0 || j10 % 400 == 0);
    }

    @Override // j$.time.chrono.AbstractChronology, j$.time.chrono.Chronology
    public LocalDateTime localDateTime(TemporalAccessor temporalAccessor) {
        return LocalDateTime.from(temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    public int prolepticYear(Era era, int i10) {
        if (era instanceof IsoEra) {
            return era == IsoEra.CE ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.Chronology
    public ValueRange range(ChronoField chronoField) {
        return chronoField.range();
    }

    @Override // j$.time.chrono.AbstractChronology, j$.time.chrono.Chronology
    public LocalDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return (LocalDate) super.resolveDate(map, resolverStyle);
    }

    @Override // j$.time.chrono.AbstractChronology
    void resolveProlepticMonth(Map map, ResolverStyle resolverStyle) {
        long m10;
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l10 = (Long) map.remove(chronoField);
        if (l10 != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                chronoField.checkValidValue(l10.longValue());
            }
            addFieldValue(map, ChronoField.MONTH_OF_YEAR, IsoChronology$$ExternalSyntheticBackport0.m(l10.longValue(), 12) + 1);
            ChronoField chronoField2 = ChronoField.YEAR;
            m10 = DesugarLocalDate$$ExternalSyntheticBackport1.m(l10.longValue(), 12);
            addFieldValue(map, chronoField2, m10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractChronology
    public LocalDate resolveYMD(Map map, ResolverStyle resolverStyle) {
        int length;
        ChronoField chronoField = ChronoField.YEAR;
        int checkValidIntValue = chronoField.checkValidIntValue(((Long) map.remove(chronoField)).longValue());
        if (resolverStyle == ResolverStyle.LENIENT) {
            return LocalDate.of(checkValidIntValue, 1, 1).plusMonths(Instant$$ExternalSyntheticBackport0.m(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L)).plusDays(Instant$$ExternalSyntheticBackport0.m(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int checkValidIntValue2 = chronoField2.checkValidIntValue(((Long) map.remove(chronoField2)).longValue());
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int checkValidIntValue3 = chronoField3.checkValidIntValue(((Long) map.remove(chronoField3)).longValue());
        if (resolverStyle == ResolverStyle.SMART) {
            if (checkValidIntValue2 != 4 && checkValidIntValue2 != 6 && checkValidIntValue2 != 9 && checkValidIntValue2 != 11) {
                length = checkValidIntValue2 == 2 ? Month.FEBRUARY.length(Year.isLeap(checkValidIntValue)) : 30;
            }
            checkValidIntValue3 = Math.min(checkValidIntValue3, length);
        }
        return LocalDate.of(checkValidIntValue, checkValidIntValue2, checkValidIntValue3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r7 > 0) goto L23;
     */
    @Override // j$.time.chrono.AbstractChronology
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j$.time.LocalDate resolveYearOfEra(java.util.Map r10, j$.time.format.ResolverStyle r11) {
        /*
            r9 = this;
            j$.time.temporal.ChronoField r0 = j$.time.temporal.ChronoField.YEAR_OF_ERA
            java.lang.Object r1 = r10.remove(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L9a
            j$.time.format.ResolverStyle r2 = j$.time.format.ResolverStyle.LENIENT
            if (r11 == r2) goto L15
            long r2 = r1.longValue()
            r0.checkValidValue(r2)
        L15:
            j$.time.temporal.ChronoField r2 = j$.time.temporal.ChronoField.ERA
            java.lang.Object r2 = r10.remove(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r3 = 0
            r5 = 1
            if (r2 != 0) goto L5e
            j$.time.temporal.ChronoField r2 = j$.time.temporal.ChronoField.YEAR
            java.lang.Object r7 = r10.get(r2)
            java.lang.Long r7 = (java.lang.Long) r7
            j$.time.format.ResolverStyle r8 = j$.time.format.ResolverStyle.STRICT
            if (r11 != r8) goto L42
            if (r7 == 0) goto L3e
            long r7 = r7.longValue()
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            long r0 = r1.longValue()
            if (r11 <= 0) goto L51
            goto L5a
        L3e:
            r10.put(r0, r1)
            goto Laf
        L42:
            if (r7 == 0) goto L56
            long r7 = r7.longValue()
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r11 <= 0) goto L4d
            goto L56
        L4d:
            long r0 = r1.longValue()
        L51:
            long r0 = j$.time.Instant$$ExternalSyntheticBackport0.m(r5, r0)
            goto L5a
        L56:
            long r0 = r1.longValue()
        L5a:
            r9.addFieldValue(r10, r2, r0)
            goto Laf
        L5e:
            long r7 = r2.longValue()
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L70
            j$.time.temporal.ChronoField r11 = j$.time.temporal.ChronoField.YEAR
            long r0 = r1.longValue()
        L6c:
            r9.addFieldValue(r10, r11, r0)
            goto Laf
        L70:
            long r7 = r2.longValue()
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r11 != 0) goto L83
            j$.time.temporal.ChronoField r11 = j$.time.temporal.ChronoField.YEAR
            long r0 = r1.longValue()
            long r0 = j$.time.Instant$$ExternalSyntheticBackport0.m(r5, r0)
            goto L6c
        L83:
            j$.time.DateTimeException r10 = new j$.time.DateTimeException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Invalid value for era: "
            r11.append(r0)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L9a:
            j$.time.temporal.ChronoField r11 = j$.time.temporal.ChronoField.ERA
            boolean r0 = r10.containsKey(r11)
            if (r0 == 0) goto Laf
            java.lang.Object r10 = r10.get(r11)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            r11.checkValidValue(r0)
        Laf:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.IsoChronology.resolveYearOfEra(java.util.Map, j$.time.format.ResolverStyle):j$.time.LocalDate");
    }

    @Override // j$.time.chrono.AbstractChronology
    Object writeReplace() {
        return super.writeReplace();
    }

    @Override // j$.time.chrono.AbstractChronology, j$.time.chrono.Chronology
    public ZonedDateTime zonedDateTime(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.ofInstant(instant, zoneId);
    }
}
