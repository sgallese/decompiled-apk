package n1;

/* compiled from: ScaleFactor.kt */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f19959a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final long f19960b = e1.a(Float.NaN, Float.NaN);

    /* compiled from: ScaleFactor.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public static final float b(long j10) {
        boolean z10;
        if (j10 != f19960b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            qc.j jVar = qc.j.f21682a;
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    public static final float c(long j10) {
        boolean z10;
        if (j10 != f19960b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            qc.j jVar = qc.j.f21682a;
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    public static long a(long j10) {
        return j10;
    }
}
