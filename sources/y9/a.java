package y9;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import w9.h;

/* compiled from: InstrHttpInputStream.java */
/* loaded from: classes3.dex */
public final class a extends InputStream {

    /* renamed from: f  reason: collision with root package name */
    private final InputStream f26283f;

    /* renamed from: m  reason: collision with root package name */
    private final h f26284m;

    /* renamed from: p  reason: collision with root package name */
    private final Timer f26285p;

    /* renamed from: r  reason: collision with root package name */
    private long f26287r;

    /* renamed from: q  reason: collision with root package name */
    private long f26286q = -1;

    /* renamed from: s  reason: collision with root package name */
    private long f26288s = -1;

    public a(InputStream inputStream, h hVar, Timer timer) {
        this.f26285p = timer;
        this.f26283f = inputStream;
        this.f26284m = hVar;
        this.f26287r = hVar.e();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f26283f.available();
        } catch (IOException e10) {
            this.f26284m.t(this.f26285p.c());
            f.d(this.f26284m);
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long c10 = this.f26285p.c();
        if (this.f26288s == -1) {
            this.f26288s = c10;
        }
        try {
            this.f26283f.close();
            long j10 = this.f26286q;
            if (j10 != -1) {
                this.f26284m.r(j10);
            }
            long j11 = this.f26287r;
            if (j11 != -1) {
                this.f26284m.u(j11);
            }
            this.f26284m.t(this.f26288s);
            this.f26284m.b();
        } catch (IOException e10) {
            this.f26284m.t(this.f26285p.c());
            f.d(this.f26284m);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f26283f.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f26283f.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int read = this.f26283f.read();
            long c10 = this.f26285p.c();
            if (this.f26287r == -1) {
                this.f26287r = c10;
            }
            if (read == -1 && this.f26288s == -1) {
                this.f26288s = c10;
                this.f26284m.t(c10);
                this.f26284m.b();
            } else {
                long j10 = this.f26286q + 1;
                this.f26286q = j10;
                this.f26284m.r(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f26284m.t(this.f26285p.c());
            f.d(this.f26284m);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.f26283f.reset();
        } catch (IOException e10) {
            this.f26284m.t(this.f26285p.c());
            f.d(this.f26284m);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            long skip = this.f26283f.skip(j10);
            long c10 = this.f26285p.c();
            if (this.f26287r == -1) {
                this.f26287r = c10;
            }
            if (skip == -1 && this.f26288s == -1) {
                this.f26288s = c10;
                this.f26284m.t(c10);
            } else {
                long j11 = this.f26286q + skip;
                this.f26286q = j11;
                this.f26284m.r(j11);
            }
            return skip;
        } catch (IOException e10) {
            this.f26284m.t(this.f26285p.c());
            f.d(this.f26284m);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            int read = this.f26283f.read(bArr, i10, i11);
            long c10 = this.f26285p.c();
            if (this.f26287r == -1) {
                this.f26287r = c10;
            }
            if (read == -1 && this.f26288s == -1) {
                this.f26288s = c10;
                this.f26284m.t(c10);
                this.f26284m.b();
            } else {
                long j10 = this.f26286q + read;
                this.f26286q = j10;
                this.f26284m.r(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f26284m.t(this.f26285p.c());
            f.d(this.f26284m);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int read = this.f26283f.read(bArr);
            long c10 = this.f26285p.c();
            if (this.f26287r == -1) {
                this.f26287r = c10;
            }
            if (read == -1 && this.f26288s == -1) {
                this.f26288s = c10;
                this.f26284m.t(c10);
                this.f26284m.b();
            } else {
                long j10 = this.f26286q + read;
                this.f26286q = j10;
                this.f26284m.r(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f26284m.t(this.f26285p.c());
            f.d(this.f26284m);
            throw e10;
        }
    }
}
