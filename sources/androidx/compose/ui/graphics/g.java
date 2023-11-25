package androidx.compose.ui.graphics;

import a1.y4;
import qc.h;
import qc.j;
import r.x;

/* compiled from: TransformOrigin.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f2458b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f2459c = y4.a(0.5f, 0.5f);

    /* renamed from: a  reason: collision with root package name */
    private final long f2460a;

    /* compiled from: TransformOrigin.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final long a() {
            return g.f2459c;
        }
    }

    private /* synthetic */ g(long j10) {
        this.f2460a = j10;
    }

    public static final /* synthetic */ g b(long j10) {
        return new g(j10);
    }

    public static boolean d(long j10, Object obj) {
        if (!(obj instanceof g) || j10 != ((g) obj).j()) {
            return false;
        }
        return true;
    }

    public static final boolean e(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final float f(long j10) {
        j jVar = j.f21682a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float g(long j10) {
        j jVar = j.f21682a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int h(long j10) {
        return x.a(j10);
    }

    public static String i(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f2460a, obj);
    }

    public int hashCode() {
        return h(this.f2460a);
    }

    public final /* synthetic */ long j() {
        return this.f2460a;
    }

    public String toString() {
        return i(this.f2460a);
    }

    public static long c(long j10) {
        return j10;
    }
}
