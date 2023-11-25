package b1;

import a1.r1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: ColorSpace.kt */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f7637d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f7638a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7639b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7640c;

    /* compiled from: ColorSpace.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public /* synthetic */ c(String str, long j10, int i10, qc.h hVar) {
        this(str, j10, i10);
    }

    public final float[] a(float f10, float f11, float f12) {
        float[] fArr = new float[b.f(this.f7639b)];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        return b(fArr);
    }

    public abstract float[] b(float[] fArr);

    public final int c() {
        return b.f(this.f7639b);
    }

    public final int d() {
        return this.f7640c;
    }

    public abstract float e(int i10);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f7640c != cVar.f7640c || !qc.q.d(this.f7638a, cVar.f7638a)) {
            return false;
        }
        return b.e(this.f7639b, cVar.f7639b);
    }

    public abstract float f(int i10);

    public final long g() {
        return this.f7639b;
    }

    public final String h() {
        return this.f7638a;
    }

    public int hashCode() {
        return (((this.f7638a.hashCode() * 31) + b.g(this.f7639b)) * 31) + this.f7640c;
    }

    public boolean i() {
        return false;
    }

    public long j(float f10, float f11, float f12) {
        float[] k10 = k(f10, f11, f12);
        float f13 = k10[0];
        float f14 = k10[1];
        return (Float.floatToIntBits(f13) << 32) | (Float.floatToIntBits(f14) & 4294967295L);
    }

    public final float[] k(float f10, float f11, float f12) {
        return l(new float[]{f10, f11, f12});
    }

    public abstract float[] l(float[] fArr);

    public float m(float f10, float f11, float f12) {
        return k(f10, f11, f12)[2];
    }

    public long n(float f10, float f11, float f12, float f13, c cVar) {
        qc.q.i(cVar, "colorSpace");
        float[] a10 = a(f10, f11, f12);
        return r1.a(a10[0], a10[1], a10[2], f13, cVar);
    }

    public String toString() {
        return this.f7638a + " (id=" + this.f7640c + ", model=" + ((Object) b.h(this.f7639b)) + ')';
    }

    private c(String str, long j10, int i10) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f7638a = str;
        this.f7639b = j10;
        this.f7640c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
