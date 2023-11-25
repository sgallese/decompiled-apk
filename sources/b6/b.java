package b6;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Dynamic64Structure.java */
/* loaded from: classes.dex */
public class b extends c {
    public b(i iVar, d dVar, long j10, int i10) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (dVar.f8059a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j11 = j10 + (i10 * 16);
        this.f8057a = iVar.q(allocate, j11);
        this.f8058b = iVar.q(allocate, j11 + 8);
    }
}
