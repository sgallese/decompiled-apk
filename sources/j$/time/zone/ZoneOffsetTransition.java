package j$.time.zone;

import j$.time.Duration;
import j$.time.Duration$DurationUnits$$ExternalSyntheticBackport1;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ZoneOffsetTransition implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;
    private final long epochSecond;
    private final ZoneOffset offsetAfter;
    private final ZoneOffset offsetBefore;
    private final LocalDateTime transition;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneOffsetTransition(long j10, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.epochSecond = j10;
        this.transition = LocalDateTime.ofEpochSecond(j10, 0, zoneOffset);
        this.offsetBefore = zoneOffset;
        this.offsetAfter = zoneOffset2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneOffsetTransition(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.epochSecond = localDateTime.toEpochSecond(zoneOffset);
        this.transition = localDateTime;
        this.offsetBefore = zoneOffset;
        this.offsetAfter = zoneOffset2;
    }

    private int getDurationSeconds() {
        return getOffsetAfter().getTotalSeconds() - getOffsetBefore().getTotalSeconds();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffsetTransition readExternal(DataInput dataInput) {
        long readEpochSec = Ser.readEpochSec(dataInput);
        ZoneOffset readOffset = Ser.readOffset(dataInput);
        ZoneOffset readOffset2 = Ser.readOffset(dataInput);
        if (readOffset.equals(readOffset2)) {
            throw new IllegalArgumentException("Offsets must not be equal");
        }
        return new ZoneOffsetTransition(readEpochSec, readOffset, readOffset2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 2, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ZoneOffsetTransition zoneOffsetTransition) {
        return Long.compare(this.epochSecond, zoneOffsetTransition.epochSecond);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ZoneOffsetTransition) {
            ZoneOffsetTransition zoneOffsetTransition = (ZoneOffsetTransition) obj;
            return this.epochSecond == zoneOffsetTransition.epochSecond && this.offsetBefore.equals(zoneOffsetTransition.offsetBefore) && this.offsetAfter.equals(zoneOffsetTransition.offsetAfter);
        }
        return false;
    }

    public LocalDateTime getDateTimeAfter() {
        return this.transition.plusSeconds(getDurationSeconds());
    }

    public LocalDateTime getDateTimeBefore() {
        return this.transition;
    }

    public Duration getDuration() {
        return Duration.ofSeconds(getDurationSeconds());
    }

    public ZoneOffset getOffsetAfter() {
        return this.offsetAfter;
    }

    public ZoneOffset getOffsetBefore() {
        return this.offsetBefore;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List getValidOffsets() {
        List m10;
        if (isGap()) {
            return Collections.emptyList();
        }
        m10 = Duration$DurationUnits$$ExternalSyntheticBackport1.m(new Object[]{getOffsetBefore(), getOffsetAfter()});
        return m10;
    }

    public int hashCode() {
        return (this.transition.hashCode() ^ this.offsetBefore.hashCode()) ^ Integer.rotateLeft(this.offsetAfter.hashCode(), 16);
    }

    public boolean isGap() {
        return getOffsetAfter().getTotalSeconds() > getOffsetBefore().getTotalSeconds();
    }

    public long toEpochSecond() {
        return this.epochSecond;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Transition[");
        sb2.append(isGap() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.transition);
        sb2.append(this.offsetBefore);
        sb2.append(" to ");
        sb2.append(this.offsetAfter);
        sb2.append(']');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        Ser.writeEpochSec(this.epochSecond, dataOutput);
        Ser.writeOffset(this.offsetBefore, dataOutput);
        Ser.writeOffset(this.offsetAfter, dataOutput);
    }
}
