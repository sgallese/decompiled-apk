package z0;

import r.x;

/* compiled from: CornerRadius.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0608a f26348a = new C0608a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final long f26349b = b.b(0.0f, 0.0f, 2, null);

    /* compiled from: CornerRadius.kt */
    /* renamed from: z0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0608a {
        private C0608a() {
        }

        public /* synthetic */ C0608a(qc.h hVar) {
            this();
        }

        public final long a() {
            return a.f26349b;
        }
    }

    public static final boolean c(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final float d(long j10) {
        qc.j jVar = qc.j.f21682a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float e(long j10) {
        qc.j jVar = qc.j.f21682a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int f(long j10) {
        return x.a(j10);
    }

    public static String g(long j10) {
        boolean z10;
        if (d(j10) == e(j10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "CornerRadius.circular(" + c.a(d(j10), 1) + ')';
        }
        return "CornerRadius.elliptical(" + c.a(d(j10), 1) + ", " + c.a(e(j10), 1) + ')';
    }

    public static long b(long j10) {
        return j10;
    }
}
