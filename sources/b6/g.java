package b6;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Elf32Header.java */
/* loaded from: classes.dex */
public class g extends d {

    /* renamed from: j  reason: collision with root package name */
    private final i f8073j;

    public g(boolean z10, i iVar) throws IOException {
        ByteOrder byteOrder;
        this.f8059a = z10;
        this.f8073j = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (z10) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f8060b = iVar.m(allocate, 16L);
        this.f8061c = iVar.z(allocate, 28L);
        this.f8062d = iVar.z(allocate, 32L);
        this.f8063e = iVar.m(allocate, 42L);
        this.f8064f = iVar.m(allocate, 44L);
        this.f8065g = iVar.m(allocate, 46L);
        this.f8066h = iVar.m(allocate, 48L);
        this.f8067i = iVar.m(allocate, 50L);
    }

    @Override // b6.d
    public c a(long j10, int i10) throws IOException {
        return new a(this.f8073j, this, j10, i10);
    }

    @Override // b6.d
    public e b(long j10) throws IOException {
        return new j(this.f8073j, this, j10);
    }

    @Override // b6.d
    public f c(int i10) throws IOException {
        return new l(this.f8073j, this, i10);
    }
}
