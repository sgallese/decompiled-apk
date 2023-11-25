package vc;

import ec.i0;

/* compiled from: Progressions.kt */
/* loaded from: classes4.dex */
public class g implements Iterable<Long>, rc.a {

    /* renamed from: q  reason: collision with root package name */
    public static final a f25125q = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private final long f25126f;

    /* renamed from: m  reason: collision with root package name */
    private final long f25127m;

    /* renamed from: p  reason: collision with root package name */
    private final long f25128p;

    /* compiled from: Progressions.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public g(long j10, long j11, long j12) {
        if (j12 != 0) {
            if (j12 != Long.MIN_VALUE) {
                this.f25126f = j10;
                this.f25127m = kc.c.d(j10, j11, j12);
                this.f25128p = j12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final long h() {
        return this.f25126f;
    }

    public final long i() {
        return this.f25127m;
    }

    @Override // java.lang.Iterable
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public i0 iterator() {
        return new h(this.f25126f, this.f25127m, this.f25128p);
    }
}
