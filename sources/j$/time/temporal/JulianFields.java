package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.Instant$$ExternalSyntheticBackport0;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.ResolverStyle;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class JulianFields {
    public static final TemporalField JULIAN_DAY = Field.JULIAN_DAY;
    public static final TemporalField MODIFIED_JULIAN_DAY = Field.MODIFIED_JULIAN_DAY;
    public static final TemporalField RATA_DIE = Field.RATA_DIE;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    private static final class Field implements TemporalField {
        private static final /* synthetic */ Field[] $VALUES;
        public static final Field JULIAN_DAY;
        public static final Field MODIFIED_JULIAN_DAY;
        public static final Field RATA_DIE;
        private static final long serialVersionUID = -7501623920830201812L;
        private final transient TemporalUnit baseUnit;
        private final transient String name;
        private final transient long offset;
        private final transient ValueRange range;
        private final transient TemporalUnit rangeUnit;

        static {
            ChronoUnit chronoUnit = ChronoUnit.DAYS;
            ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
            Field field = new Field("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
            JULIAN_DAY = field;
            Field field2 = new Field("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
            MODIFIED_JULIAN_DAY = field2;
            Field field3 = new Field("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
            RATA_DIE = field3;
            $VALUES = new Field[]{field, field2, field3};
        }

        private Field(String str, int i10, String str2, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, long j10) {
            this.name = str2;
            this.baseUnit = temporalUnit;
            this.rangeUnit = temporalUnit2;
            this.range = ValueRange.of((-365243219162L) + j10, 365241780471L + j10);
            this.offset = j10;
        }

        public static Field valueOf(String str) {
            return (Field) Enum.valueOf(Field.class, str);
        }

        public static Field[] values() {
            return (Field[]) $VALUES.clone();
        }

        @Override // j$.time.temporal.TemporalField
        public Temporal adjustInto(Temporal temporal, long j10) {
            if (range().isValidValue(j10)) {
                return temporal.with(ChronoField.EPOCH_DAY, Instant$$ExternalSyntheticBackport0.m(j10, this.offset));
            }
            throw new DateTimeException("Invalid value: " + this.name + " " + j10);
        }

        @Override // j$.time.temporal.TemporalField
        public long getFrom(TemporalAccessor temporalAccessor) {
            return temporalAccessor.getLong(ChronoField.EPOCH_DAY) + this.offset;
        }

        @Override // j$.time.temporal.TemporalField
        public boolean isDateBased() {
            return true;
        }

        @Override // j$.time.temporal.TemporalField
        public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
            return temporalAccessor.isSupported(ChronoField.EPOCH_DAY);
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
            if (isSupportedBy(temporalAccessor)) {
                return range();
            }
            throw new DateTimeException("Unsupported field: " + this);
        }

        @Override // j$.time.temporal.TemporalField
        public ChronoLocalDate resolve(Map map, TemporalAccessor temporalAccessor, ResolverStyle resolverStyle) {
            long longValue = ((Long) map.remove(this)).longValue();
            Chronology from = Chronology.CC.from(temporalAccessor);
            if (resolverStyle == ResolverStyle.LENIENT) {
                return from.dateEpochDay(Instant$$ExternalSyntheticBackport0.m(longValue, this.offset));
            }
            range().checkValidValue(longValue, this);
            return from.dateEpochDay(longValue - this.offset);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }
}
