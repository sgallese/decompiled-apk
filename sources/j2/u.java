package j2;

import r.x;

/* compiled from: TextUnit.kt */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19008b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f19009c = e(0);

    /* renamed from: d  reason: collision with root package name */
    private static final long f19010d = e(4294967296L);

    /* renamed from: e  reason: collision with root package name */
    private static final long f19011e = e(8589934592L);

    /* renamed from: a  reason: collision with root package name */
    private final long f19012a;

    /* compiled from: TextUnit.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final long a() {
            return u.f19011e;
        }

        public final long b() {
            return u.f19010d;
        }

        public final long c() {
            return u.f19009c;
        }
    }

    private /* synthetic */ u(long j10) {
        this.f19012a = j10;
    }

    public static final /* synthetic */ u d(long j10) {
        return new u(j10);
    }

    public static boolean f(long j10, Object obj) {
        if (!(obj instanceof u) || j10 != ((u) obj).j()) {
            return false;
        }
        return true;
    }

    public static final boolean g(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static int h(long j10) {
        return x.a(j10);
    }

    public static String i(long j10) {
        if (g(j10, f19009c)) {
            return "Unspecified";
        }
        if (g(j10, f19010d)) {
            return "Sp";
        }
        if (g(j10, f19011e)) {
            return "Em";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f19012a, obj);
    }

    public int hashCode() {
        return h(this.f19012a);
    }

    public final /* synthetic */ long j() {
        return this.f19012a;
    }

    public String toString() {
        return i(this.f19012a);
    }

    public static long e(long j10) {
        return j10;
    }
}
