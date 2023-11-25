package t4;

import java.io.InputStream;

/* compiled from: ExifUtils.kt */
/* loaded from: classes.dex */
final class k extends InputStream {

    /* renamed from: f  reason: collision with root package name */
    private final InputStream f23589f;

    /* renamed from: m  reason: collision with root package name */
    private int f23590m = 1073741824;

    public k(InputStream inputStream) {
        this.f23589f = inputStream;
    }

    private final int b(int i10) {
        if (i10 == -1) {
            this.f23590m = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f23590m;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23589f.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return b(this.f23589f.read());
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return this.f23589f.skip(j10);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return b(this.f23589f.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        return b(this.f23589f.read(bArr, i10, i11));
    }
}
