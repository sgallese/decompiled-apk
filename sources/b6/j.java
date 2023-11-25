package b6;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Program32Header.java */
/* loaded from: classes.dex */
public class j extends e {
    public j(i iVar, d dVar, long j10) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (dVar.f8059a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j11 = dVar.f8061c + (j10 * dVar.f8063e);
        this.f8068a = iVar.z(allocate, j11);
        this.f8069b = iVar.z(allocate, 4 + j11);
        this.f8070c = iVar.z(allocate, 8 + j11);
        this.f8071d = iVar.z(allocate, j11 + 20);
    }
}
