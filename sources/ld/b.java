package ld;

import java.io.IOException;
import okio.Source;
import okio.m;
import qc.q;

/* compiled from: FixedLengthSource.kt */
/* loaded from: classes4.dex */
public final class b extends m {

    /* renamed from: f  reason: collision with root package name */
    private final long f19652f;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f19653m;

    /* renamed from: p  reason: collision with root package name */
    private long f19654p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Source source, long j10, boolean z10) {
        super(source);
        q.i(source, "delegate");
        this.f19652f = j10;
        this.f19653m = z10;
    }

    private final void b(okio.c cVar, long j10) {
        okio.c cVar2 = new okio.c();
        cVar2.g0(cVar);
        cVar.write(cVar2, j10);
        cVar2.b();
    }

    @Override // okio.m, okio.Source
    public long read(okio.c cVar, long j10) {
        q.i(cVar, "sink");
        long j11 = this.f19654p;
        long j12 = this.f19652f;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f19653m) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long read = super.read(cVar, j10);
        if (read != -1) {
            this.f19654p += read;
        }
        long j14 = this.f19654p;
        long j15 = this.f19652f;
        if ((j14 < j15 && read == -1) || j14 > j15) {
            if (read > 0 && j14 > j15) {
                b(cVar, cVar.s0() - (this.f19654p - this.f19652f));
            }
            throw new IOException("expected " + this.f19652f + " bytes but got " + this.f19654p);
        }
        return read;
    }
}
