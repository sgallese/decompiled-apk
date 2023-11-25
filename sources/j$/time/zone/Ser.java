package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Ser implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;
    private Object object;
    private byte type;

    public Ser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Ser(byte b10, Object obj) {
        this.type = b10;
        this.object = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long readEpochSec(DataInput dataInput) {
        if ((dataInput.readByte() & 255) == 255) {
            return dataInput.readLong();
        }
        return ((((r0 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    private static Object readInternal(byte b10, DataInput dataInput) {
        if (b10 != 1) {
            if (b10 != 2) {
                if (b10 != 3) {
                    if (b10 == 100) {
                        return ZoneRules.readExternalTimeZone(dataInput);
                    }
                    throw new StreamCorruptedException("Unknown serialized type");
                }
                return ZoneOffsetTransitionRule.readExternal(dataInput);
            }
            return ZoneOffsetTransition.readExternal(dataInput);
        }
        return ZoneRules.readExternal(dataInput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffset readOffset(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? ZoneOffset.ofTotalSeconds(dataInput.readInt()) : ZoneOffset.ofTotalSeconds(readByte * 900);
    }

    private Object readResolve() {
        return this.object;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void writeEpochSec(long j10, DataOutput dataOutput) {
        if (j10 < -4575744000L || j10 >= 10413792000L || j10 % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j10);
            return;
        }
        int i10 = (int) ((j10 + 4575744000L) / 900);
        dataOutput.writeByte((i10 >>> 16) & 255);
        dataOutput.writeByte((i10 >>> 8) & 255);
        dataOutput.writeByte(i10 & 255);
    }

    private static void writeInternal(byte b10, Object obj, DataOutput dataOutput) {
        dataOutput.writeByte(b10);
        if (b10 == 1) {
            ((ZoneRules) obj).writeExternal(dataOutput);
        } else if (b10 == 2) {
            ((ZoneOffsetTransition) obj).writeExternal(dataOutput);
        } else if (b10 == 3) {
            ((ZoneOffsetTransitionRule) obj).writeExternal(dataOutput);
        } else if (b10 != 100) {
            throw new InvalidClassException("Unknown serialized type");
        } else {
            ((ZoneRules) obj).writeExternalTimeZone(dataOutput);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void writeOffset(ZoneOffset zoneOffset, DataOutput dataOutput) {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i10 = totalSeconds % 900 == 0 ? totalSeconds / 900 : 127;
        dataOutput.writeByte(i10);
        if (i10 == 127) {
            dataOutput.writeInt(totalSeconds);
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.type = readByte;
        this.object = readInternal(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        writeInternal(this.type, this.object, objectOutput);
    }
}
