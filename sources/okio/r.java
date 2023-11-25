package okio;

import java.io.RandomAccessFile;

/* compiled from: JvmFileHandle.kt */
/* loaded from: classes4.dex */
public final class r extends h {

    /* renamed from: r  reason: collision with root package name */
    private final RandomAccessFile f20669r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        qc.q.i(randomAccessFile, "randomAccessFile");
        this.f20669r = randomAccessFile;
    }

    @Override // okio.h
    protected synchronized void m() {
        this.f20669r.close();
    }

    @Override // okio.h
    protected synchronized int q(long j10, byte[] bArr, int i10, int i11) {
        qc.q.i(bArr, "array");
        this.f20669r.seek(j10);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int read = this.f20669r.read(bArr, i10, i11 - i12);
            if (read == -1) {
                if (i12 == 0) {
                    return -1;
                }
            } else {
                i12 += read;
            }
        }
        return i12;
    }

    @Override // okio.h
    protected synchronized long x() {
        return this.f20669r.length();
    }
}
