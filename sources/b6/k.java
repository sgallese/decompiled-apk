package b6;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Program64Header.java */
/* loaded from: classes.dex */
public class k extends e {
    public k(i iVar, d dVar, long j10) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (dVar.f8059a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j11 = dVar.f8061c + (j10 * dVar.f8063e);
        this.f8068a = iVar.z(allocate, j11);
        this.f8069b = iVar.q(allocate, 8 + j11);
        this.f8070c = iVar.q(allocate, 16 + j11);
        this.f8071d = iVar.q(allocate, j11 + 40);
    }
}
