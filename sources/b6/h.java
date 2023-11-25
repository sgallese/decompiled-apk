package b6;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Elf64Header.java */
/* loaded from: classes.dex */
public class h extends d {

    /* renamed from: j  reason: collision with root package name */
    private final i f8074j;

    public h(boolean z10, i iVar) throws IOException {
        ByteOrder byteOrder;
        this.f8059a = z10;
        this.f8074j = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (z10) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f8060b = iVar.m(allocate, 16L);
        this.f8061c = iVar.q(allocate, 32L);
        this.f8062d = iVar.q(allocate, 40L);
        this.f8063e = iVar.m(allocate, 54L);
        this.f8064f = iVar.m(allocate, 56L);
        this.f8065g = iVar.m(allocate, 58L);
        this.f8066h = iVar.m(allocate, 60L);
        this.f8067i = iVar.m(allocate, 62L);
    }

    @Override // b6.d
    public c a(long j10, int i10) throws IOException {
        return new b(this.f8074j, this, j10, i10);
    }

    @Override // b6.d
    public e b(long j10) throws IOException {
        return new k(this.f8074j, this, j10);
    }

    @Override // b6.d
    public f c(int i10) throws IOException {
        return new m(this.f8074j, this, i10);
    }
}
