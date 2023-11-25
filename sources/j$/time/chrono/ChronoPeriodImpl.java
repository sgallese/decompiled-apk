package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Duration$DurationUnits$$ExternalSyntheticBackport1;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.ValueRange;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
final class ChronoPeriodImpl implements TemporalAmount, Serializable {
    private static final List SUPPORTED_UNITS;
    private static final long serialVersionUID = 57387258289L;
    private final Chronology chrono;
    final int days;
    final int months;
    final int years;

    static {
        List m10;
        m10 = Duration$DurationUnits$$ExternalSyntheticBackport1.m(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
        SUPPORTED_UNITS = m10;
    }

    ChronoPeriodImpl(Chronology chronology, int i10, int i11, int i12) {
        Objects.requireNonNull(chronology, "chrono");
        this.chrono = chronology;
        this.years = i10;
        this.months = i11;
        this.days = i12;
    }

    private long monthRange() {
        ValueRange range = this.chrono.range(ChronoField.MONTH_OF_YEAR);
        if (range.isFixed() && range.isIntValue()) {
            return (range.getMaximum() - range.getMinimum()) + 1;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChronoPeriodImpl readExternal(DataInput dataInput) {
        return new ChronoPeriodImpl(Chronology.CC.of(dataInput.readUTF()), dataInput.readInt(), dataInput.readInt(), dataInput.readInt());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private void validateChrono(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Chronology chronology = (Chronology) temporalAccessor.query(TemporalQueries.chronology());
        if (chronology == null || this.chrono.equals(chronology)) {
            return;
        }
        throw new DateTimeException("Chronology mismatch, expected: " + this.chrono.getId() + ", actual: " + chronology.getId());
    }

    @Override // j$.time.temporal.TemporalAmount
    public Temporal addTo(Temporal temporal) {
        long j10;
        ChronoUnit chronoUnit;
        validateChrono(temporal);
        if (this.months == 0) {
            int i10 = this.years;
            if (i10 != 0) {
                j10 = i10;
                chronoUnit = ChronoUnit.YEARS;
                temporal = temporal.plus(j10, chronoUnit);
            }
        } else {
            long monthRange = monthRange();
            if (monthRange > 0) {
                temporal = temporal.plus((this.years * monthRange) + this.months, ChronoUnit.MONTHS);
            } else {
                int i11 = this.years;
                if (i11 != 0) {
                    temporal = temporal.plus(i11, ChronoUnit.YEARS);
                }
                j10 = this.months;
                chronoUnit = ChronoUnit.MONTHS;
                temporal = temporal.plus(j10, chronoUnit);
            }
        }
        int i12 = this.days;
        return i12 != 0 ? temporal.plus(i12, ChronoUnit.DAYS) : temporal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChronoPeriodImpl) {
            ChronoPeriodImpl chronoPeriodImpl = (ChronoPeriodImpl) obj;
            return this.years == chronoPeriodImpl.years && this.months == chronoPeriodImpl.months && this.days == chronoPeriodImpl.days && this.chrono.equals(chronoPeriodImpl.chrono);
        }
        return false;
    }

    public Chronology getChronology() {
        return this.chrono;
    }

    public int hashCode() {
        return ((this.years + Integer.rotateLeft(this.months, 8)) + Integer.rotateLeft(this.days, 16)) ^ this.chrono.hashCode();
    }

    public boolean isZero() {
        return this.years == 0 && this.months == 0 && this.days == 0;
    }

    public String toString() {
        if (isZero()) {
            return getChronology().toString() + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getChronology().toString());
        sb2.append(' ');
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeUTF(this.chrono.getId());
        dataOutput.writeInt(this.years);
        dataOutput.writeInt(this.months);
        dataOutput.writeInt(this.days);
    }

    protected Object writeReplace() {
        return new Ser((byte) 9, this);
    }
}
