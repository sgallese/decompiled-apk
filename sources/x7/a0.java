package x7;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class a0 extends z {

    /* renamed from: f  reason: collision with root package name */
    private final z f25831f;

    /* renamed from: m  reason: collision with root package name */
    private final long f25832m;

    /* renamed from: p  reason: collision with root package name */
    private final long f25833p;

    public a0(z zVar, long j10, long j11) {
        this.f25831f = zVar;
        long e10 = e(j10);
        this.f25832m = e10;
        this.f25833p = e(e10 + j11);
    }

    private final long e(long j10) {
        if (j10 < 0) {
            return 0L;
        }
        if (j10 > this.f25831f.b()) {
            return this.f25831f.b();
        }
        return j10;
    }

    @Override // x7.z
    public final long b() {
        return this.f25833p - this.f25832m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x7.z
    public final InputStream c(long j10, long j11) throws IOException {
        long e10 = e(this.f25832m);
        return this.f25831f.c(e10, e(j11 + e10) - e10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
