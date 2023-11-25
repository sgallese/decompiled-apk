package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class f0 extends InputStream {

    /* renamed from: f  reason: collision with root package name */
    private final InputStream f10795f;

    /* renamed from: m  reason: collision with root package name */
    private long f10796m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(InputStream inputStream, long j10) {
        this.f10795f = inputStream;
        this.f10796m = j10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f10795f.close();
        this.f10796m = 0L;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        long j10 = this.f10796m;
        if (j10 <= 0) {
            return -1;
        }
        this.f10796m = j10 - 1;
        return this.f10795f.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f10796m;
        if (j10 <= 0) {
            return -1;
        }
        int read = this.f10795f.read(bArr, i10, (int) Math.min(i11, j10));
        if (read != -1) {
            this.f10796m -= read;
        }
        return read;
    }
}
