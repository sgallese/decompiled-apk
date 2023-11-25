package y9;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;
import w9.h;

/* compiled from: InstrHttpOutputStream.java */
/* loaded from: classes3.dex */
public final class b extends OutputStream {

    /* renamed from: f  reason: collision with root package name */
    private final OutputStream f26289f;

    /* renamed from: m  reason: collision with root package name */
    private final Timer f26290m;

    /* renamed from: p  reason: collision with root package name */
    h f26291p;

    /* renamed from: q  reason: collision with root package name */
    long f26292q = -1;

    public b(OutputStream outputStream, h hVar, Timer timer) {
        this.f26289f = outputStream;
        this.f26291p = hVar;
        this.f26290m = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j10 = this.f26292q;
        if (j10 != -1) {
            this.f26291p.o(j10);
        }
        this.f26291p.s(this.f26290m.c());
        try {
            this.f26289f.close();
        } catch (IOException e10) {
            this.f26291p.t(this.f26290m.c());
            f.d(this.f26291p);
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.f26289f.flush();
        } catch (IOException e10) {
            this.f26291p.t(this.f26290m.c());
            f.d(this.f26291p);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        try {
            this.f26289f.write(i10);
            long j10 = this.f26292q + 1;
            this.f26292q = j10;
            this.f26291p.o(j10);
        } catch (IOException e10) {
            this.f26291p.t(this.f26290m.c());
            f.d(this.f26291p);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.f26289f.write(bArr);
            long length = this.f26292q + bArr.length;
            this.f26292q = length;
            this.f26291p.o(length);
        } catch (IOException e10) {
            this.f26291p.t(this.f26290m.c());
            f.d(this.f26291p);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            this.f26289f.write(bArr, i10, i11);
            long j10 = this.f26292q + i11;
            this.f26292q = j10;
            this.f26291p.o(j10);
        } catch (IOException e10) {
            this.f26291p.t(this.f26290m.c());
            f.d(this.f26291p);
            throw e10;
        }
    }
}
