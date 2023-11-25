package t4;

import okio.Source;

/* compiled from: FrameDelayRewritingSource.kt */
/* loaded from: classes.dex */
public final class p extends okio.m {

    /* renamed from: m  reason: collision with root package name */
    private static final a f23602m = new a(null);

    /* renamed from: p  reason: collision with root package name */
    private static final okio.f f23603p = okio.f.f20621q.b("0021F904");

    /* renamed from: f  reason: collision with root package name */
    private final okio.c f23604f;

    /* compiled from: FrameDelayRewritingSource.kt */
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public p(Source source) {
        super(source);
        this.f23604f = new okio.c();
    }

    private final long b(okio.f fVar) {
        long j10 = -1;
        while (true) {
            j10 = this.f23604f.E(fVar.i(0), j10 + 1);
            if (j10 == -1 || (m0(fVar.D()) && this.f23604f.a0(j10, fVar))) {
                break;
            }
        }
        return j10;
    }

    private final long c(okio.c cVar, long j10) {
        long e10;
        e10 = vc.l.e(this.f23604f.read(cVar, j10), 0L);
        return e10;
    }

    private final boolean m0(long j10) {
        if (this.f23604f.s0() >= j10) {
            return true;
        }
        long s02 = j10 - this.f23604f.s0();
        if (super.read(this.f23604f, s02) == s02) {
            return true;
        }
        return false;
    }

    @Override // okio.m, okio.Source
    public long read(okio.c cVar, long j10) {
        m0(j10);
        if (this.f23604f.s0() == 0) {
            if (j10 != 0) {
                return -1L;
            }
            return 0L;
        }
        long j11 = 0;
        while (true) {
            long b10 = b(f23603p);
            if (b10 == -1) {
                break;
            }
            j11 += c(cVar, b10 + 4);
            if (m0(5L) && this.f23604f.B(4L) == 0 && (((dc.s.b(this.f23604f.B(2L)) & 255) << 8) | (dc.s.b(this.f23604f.B(1L)) & 255)) < 2) {
                cVar.D(this.f23604f.B(0L));
                cVar.D(10);
                cVar.D(0);
                this.f23604f.skip(3L);
            }
        }
        if (j11 < j10) {
            j11 += c(cVar, j10 - j11);
        }
        if (j11 == 0) {
            return -1L;
        }
        return j11;
    }
}
