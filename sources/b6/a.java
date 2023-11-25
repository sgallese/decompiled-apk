package b6;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Dynamic32Structure.java */
/* loaded from: classes.dex */
public class a extends c {
    public a(i iVar, d dVar, long j10, int i10) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (dVar.f8059a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j11 = j10 + (i10 * 8);
        this.f8057a = iVar.z(allocate, j11);
        this.f8058b = iVar.z(allocate, j11 + 4);
    }
}
