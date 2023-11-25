package b6;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Section64Header.java */
/* loaded from: classes.dex */
public class m extends f {
    public m(i iVar, d dVar, int i10) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (dVar.f8059a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f8072a = iVar.z(allocate, dVar.f8062d + (i10 * dVar.f8065g) + 44);
    }
}
