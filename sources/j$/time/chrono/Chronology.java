package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.ValueRange;
import j$.util.Objects;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface Chronology extends Comparable {

    /* renamed from: j$.time.chrono.Chronology$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class CC {
        public static ChronoLocalDateTime $default$localDateTime(Chronology chronology, TemporalAccessor temporalAccessor) {
            try {
                return chronology.date(temporalAccessor).atTime(LocalTime.from(temporalAccessor));
            } catch (DateTimeException e10) {
                throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e10);
            }
        }

        public static Chronology from(TemporalAccessor temporalAccessor) {
            Objects.requireNonNull(temporalAccessor, "temporal");
            return (Chronology) Objects.requireNonNullElse((Chronology) temporalAccessor.query(TemporalQueries.chronology()), IsoChronology.INSTANCE);
        }

        public static Chronology of(String str) {
            return AbstractChronology.of(str);
        }
    }

    int compareTo(Chronology chronology);

    ChronoLocalDate date(int i10, int i11, int i12);

    ChronoLocalDate date(TemporalAccessor temporalAccessor);

    ChronoLocalDate dateEpochDay(long j10);

    ChronoLocalDate dateYearDay(int i10, int i11);

    boolean equals(Object obj);

    Era eraOf(int i10);

    List eras();

    String getCalendarType();

    String getId();

    int hashCode();

    boolean isLeapYear(long j10);

    ChronoLocalDateTime localDateTime(TemporalAccessor temporalAccessor);

    int prolepticYear(Era era, int i10);

    ValueRange range(ChronoField chronoField);

    ChronoLocalDate resolveDate(Map map, ResolverStyle resolverStyle);

    String toString();

    ChronoZonedDateTime zonedDateTime(Instant instant, ZoneId zoneId);
}
