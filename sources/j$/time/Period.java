package j$.time;

import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalQueries;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class Period implements TemporalAmount, Serializable {
    private static final List SUPPORTED_UNITS;
    private static final long serialVersionUID = -3587258372562876L;
    private final int days;
    private final int months;
    private final int years;
    public static final Period ZERO = new Period(0, 0, 0);
    private static final Pattern PATTERN = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);

    static {
        List m10;
        m10 = Duration$DurationUnits$$ExternalSyntheticBackport1.m(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
        SUPPORTED_UNITS = m10;
    }

    private Period(int i10, int i11, int i12) {
        this.years = i10;
        this.months = i11;
        this.days = i12;
    }

    private static Period create(int i10, int i11, int i12) {
        return ((i10 | i11) | i12) == 0 ? ZERO : new Period(i10, i11, i12);
    }

    public static Period of(int i10, int i11, int i12) {
        return create(i10, i11, i12);
    }

    public static Period ofDays(int i10) {
        return create(0, 0, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Period readExternal(DataInput dataInput) {
        return of(dataInput.readInt(), dataInput.readInt(), dataInput.readInt());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private void validateChrono(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Chronology chronology = (Chronology) temporalAccessor.query(TemporalQueries.chronology());
        if (chronology == null || IsoChronology.INSTANCE.equals(chronology)) {
            return;
        }
        throw new DateTimeException("Chronology mismatch, expected: ISO, actual: " + chronology.getId());
    }

    private Object writeReplace() {
        return new Ser((byte) 14, this);
    }

    @Override // j$.time.temporal.TemporalAmount
    public Temporal addTo(Temporal temporal) {
        long totalMonths;
        ChronoUnit chronoUnit;
        validateChrono(temporal);
        if (this.months == 0) {
            int i10 = this.years;
            if (i10 != 0) {
                totalMonths = i10;
                chronoUnit = ChronoUnit.YEARS;
                temporal = temporal.plus(totalMonths, chronoUnit);
            }
        } else {
            totalMonths = toTotalMonths();
            if (totalMonths != 0) {
                chronoUnit = ChronoUnit.MONTHS;
                temporal = temporal.plus(totalMonths, chronoUnit);
            }
        }
        int i11 = this.days;
        return i11 != 0 ? temporal.plus(i11, ChronoUnit.DAYS) : temporal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Period) {
            Period period = (Period) obj;
            return this.years == period.years && this.months == period.months && this.days == period.days;
        }
        return false;
    }

    public int getDays() {
        return this.days;
    }

    public int hashCode() {
        return this.years + Integer.rotateLeft(this.months, 8) + Integer.rotateLeft(this.days, 16);
    }

    public boolean isZero() {
        return this == ZERO;
    }

    public String toString() {
        if (this == ZERO) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('P');
        int i10 = this.years;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.months;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.days;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }

    public long toTotalMonths() {
        return (this.years * 12) + this.months;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeInt(this.years);
        dataOutput.writeInt(this.months);
        dataOutput.writeInt(this.days);
    }
}
