package e9;

import java.io.OutputStream;

/* compiled from: LengthCountingOutputStream.java */
/* loaded from: classes3.dex */
final class b extends OutputStream {

    /* renamed from: f  reason: collision with root package name */
    private long f14134f = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public long b() {
        return this.f14134f;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f14134f++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f14134f += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f14134f += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
