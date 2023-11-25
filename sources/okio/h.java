package okio;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: FileHandle.kt */
/* loaded from: classes4.dex */
public abstract class h implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    private final boolean f20631f;

    /* renamed from: m  reason: collision with root package name */
    private boolean f20632m;

    /* renamed from: p  reason: collision with root package name */
    private int f20633p;

    /* renamed from: q  reason: collision with root package name */
    private final ReentrantLock f20634q = e1.b();

    /* compiled from: FileHandle.kt */
    /* loaded from: classes4.dex */
    private static final class a implements Source {

        /* renamed from: f  reason: collision with root package name */
        private final h f20635f;

        /* renamed from: m  reason: collision with root package name */
        private long f20636m;

        /* renamed from: p  reason: collision with root package name */
        private boolean f20637p;

        public a(h hVar, long j10) {
            qc.q.i(hVar, "fileHandle");
            this.f20635f = hVar;
            this.f20636m = j10;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f20637p) {
                return;
            }
            this.f20637p = true;
            ReentrantLock j10 = this.f20635f.j();
            j10.lock();
            try {
                h hVar = this.f20635f;
                hVar.f20633p--;
                if (this.f20635f.f20633p == 0 && this.f20635f.f20632m) {
                    dc.w wVar = dc.w.f13270a;
                    j10.unlock();
                    this.f20635f.m();
                }
            } finally {
                j10.unlock();
            }
        }

        @Override // okio.Source
        public long read(c cVar, long j10) {
            qc.q.i(cVar, "sink");
            if ((!this.f20637p) != false) {
                long z10 = this.f20635f.z(this.f20636m, cVar, j10);
                if (z10 != -1) {
                    this.f20636m += z10;
                }
                return z10;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // okio.Source
        public a1 timeout() {
            return a1.NONE;
        }
    }

    public h(boolean z10) {
        this.f20631f = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long z(long j10, c cVar, long j11) {
        boolean z10;
        if (j11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long j12 = j10 + j11;
            long j13 = j10;
            while (true) {
                if (j13 >= j12) {
                    break;
                }
                v0 A0 = cVar.A0(1);
                int q10 = q(j13, A0.f20687a, A0.f20689c, (int) Math.min(j12 - j13, 8192 - r10));
                if (q10 == -1) {
                    if (A0.f20688b == A0.f20689c) {
                        cVar.f20602f = A0.b();
                        w0.b(A0);
                    }
                    if (j10 == j13) {
                        return -1L;
                    }
                } else {
                    A0.f20689c += q10;
                    long j14 = q10;
                    j13 += j14;
                    cVar.q0(cVar.s0() + j14);
                }
            }
            return j13 - j10;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
    }

    public final long B() throws IOException {
        ReentrantLock reentrantLock = this.f20634q;
        reentrantLock.lock();
        try {
            if ((!this.f20632m) != false) {
                dc.w wVar = dc.w.f13270a;
                reentrantLock.unlock();
                return x();
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Source E(long j10) throws IOException {
        ReentrantLock reentrantLock = this.f20634q;
        reentrantLock.lock();
        try {
            if ((!this.f20632m) != false) {
                this.f20633p++;
                reentrantLock.unlock();
                return new a(this, j10);
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.f20634q;
        reentrantLock.lock();
        try {
            if (this.f20632m) {
                return;
            }
            this.f20632m = true;
            if (this.f20633p != 0) {
                return;
            }
            dc.w wVar = dc.w.f13270a;
            reentrantLock.unlock();
            m();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ReentrantLock j() {
        return this.f20634q;
    }

    protected abstract void m() throws IOException;

    protected abstract int q(long j10, byte[] bArr, int i10, int i11) throws IOException;

    protected abstract long x() throws IOException;
}
