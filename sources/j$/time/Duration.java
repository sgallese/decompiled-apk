package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    private static final long serialVersionUID = 3078945930695997490L;
    private final int nanos;
    private final long seconds;
    public static final Duration ZERO = new Duration(0, 0);
    private static final BigInteger BI_NANOS_PER_SECOND = BigInteger.valueOf(1000000000);

    private Duration(long j10, int i10) {
        this.seconds = j10;
        this.nanos = i10;
    }

    private static Duration create(long j10, int i10) {
        return (((long) i10) | j10) == 0 ? ZERO : new Duration(j10, i10);
    }

    public static Duration ofMillis(long j10) {
        long j11 = j10 / 1000;
        int i10 = (int) (j10 % 1000);
        if (i10 < 0) {
            i10 += 1000;
            j11--;
        }
        return create(j11, i10 * 1000000);
    }

    public static Duration ofNanos(long j10) {
        long j11 = j10 / 1000000000;
        int i10 = (int) (j10 % 1000000000);
        if (i10 < 0) {
            i10 = (int) (i10 + 1000000000);
            j11--;
        }
        return create(j11, i10);
    }

    public static Duration ofSeconds(long j10) {
        return create(j10, 0);
    }

    public static Duration ofSeconds(long j10, long j11) {
        return create(Clock$OffsetClock$$ExternalSyntheticBackport0.m(j10, DesugarLocalDate$$ExternalSyntheticBackport1.m(j11, 1000000000L)), (int) Clock$TickClock$$ExternalSyntheticBackport0.m(j11, 1000000000L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Duration readExternal(DataInput dataInput) {
        return ofSeconds(dataInput.readLong(), dataInput.readInt());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 1, this);
    }

    @Override // j$.time.temporal.TemporalAmount
    public Temporal addTo(Temporal temporal) {
        long j10 = this.seconds;
        if (j10 != 0) {
            temporal = temporal.plus(j10, ChronoUnit.SECONDS);
        }
        int i10 = this.nanos;
        return i10 != 0 ? temporal.plus(i10, ChronoUnit.NANOS) : temporal;
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int compare = Long.compare(this.seconds, duration.seconds);
        return compare != 0 ? compare : this.nanos - duration.nanos;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            return this.seconds == duration.seconds && this.nanos == duration.nanos;
        }
        return false;
    }

    public int getNano() {
        return this.nanos;
    }

    public long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j10 = this.seconds;
        return ((int) (j10 ^ (j10 >>> 32))) + (this.nanos * 51);
    }

    public long toMillis() {
        long m10;
        long j10 = this.seconds;
        long j11 = this.nanos;
        if (j10 < 0) {
            j10++;
            j11 -= 1000000000;
        }
        m10 = Duration$$ExternalSyntheticBackport0.m(j10, 1000);
        return Clock$OffsetClock$$ExternalSyntheticBackport0.m(m10, j11 / 1000000);
    }

    public String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j10 = this.seconds;
        if (j10 < 0 && this.nanos > 0) {
            j10++;
        }
        long j11 = j10 / 3600;
        int i10 = (int) ((j10 % 3600) / 60);
        int i11 = (int) (j10 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j11 != 0) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        if (i11 == 0 && this.nanos == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (this.seconds >= 0 || this.nanos <= 0 || i11 != 0) {
            sb2.append(i11);
        } else {
            sb2.append("-0");
        }
        if (this.nanos > 0) {
            int length = sb2.length();
            long j12 = this.seconds;
            long j13 = this.nanos;
            if (j12 < 0) {
                sb2.append(2000000000 - j13);
            } else {
                sb2.append(j13 + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeLong(this.seconds);
        dataOutput.writeInt(this.nanos);
    }
}
