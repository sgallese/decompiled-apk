package e1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.List;

/* compiled from: ImageVector.kt */
/* loaded from: classes.dex */
public final class s extends u implements Iterable<u>, rc.a {

    /* renamed from: f  reason: collision with root package name */
    private final String f13938f;

    /* renamed from: m  reason: collision with root package name */
    private final float f13939m;

    /* renamed from: p  reason: collision with root package name */
    private final float f13940p;

    /* renamed from: q  reason: collision with root package name */
    private final float f13941q;

    /* renamed from: r  reason: collision with root package name */
    private final float f13942r;

    /* renamed from: s  reason: collision with root package name */
    private final float f13943s;

    /* renamed from: t  reason: collision with root package name */
    private final float f13944t;

    /* renamed from: u  reason: collision with root package name */
    private final float f13945u;

    /* renamed from: v  reason: collision with root package name */
    private final List<i> f13946v;

    /* renamed from: w  reason: collision with root package name */
    private final List<u> f13947w;

    /* compiled from: ImageVector.kt */
    /* loaded from: classes.dex */
    public static final class a implements Iterator<u>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private final Iterator<u> f13948f;

        a(s sVar) {
            this.f13948f = sVar.f13947w.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public u next() {
            return this.f13948f.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13948f.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public s() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    public final List<i> e() {
        return this.f13946v;
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (!qc.q.d(this.f13938f, sVar.f13938f)) {
            return false;
        }
        if (this.f13939m == sVar.f13939m) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (this.f13940p == sVar.f13940p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        if (this.f13941q == sVar.f13941q) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        if (this.f13942r == sVar.f13942r) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            return false;
        }
        if (this.f13943s == sVar.f13943s) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z14) {
            return false;
        }
        if (this.f13944t == sVar.f13944t) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (!z15) {
            return false;
        }
        if (this.f13945u == sVar.f13945u) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z16 && qc.q.d(this.f13946v, sVar.f13946v) && qc.q.d(this.f13947w, sVar.f13947w)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f13938f;
    }

    public final float h() {
        return this.f13940p;
    }

    public int hashCode() {
        return (((((((((((((((((this.f13938f.hashCode() * 31) + Float.floatToIntBits(this.f13939m)) * 31) + Float.floatToIntBits(this.f13940p)) * 31) + Float.floatToIntBits(this.f13941q)) * 31) + Float.floatToIntBits(this.f13942r)) * 31) + Float.floatToIntBits(this.f13943s)) * 31) + Float.floatToIntBits(this.f13944t)) * 31) + Float.floatToIntBits(this.f13945u)) * 31) + this.f13946v.hashCode()) * 31) + this.f13947w.hashCode();
    }

    public final float i() {
        return this.f13941q;
    }

    @Override // java.lang.Iterable
    public Iterator<u> iterator() {
        return new a(this);
    }

    public final float j() {
        return this.f13939m;
    }

    public final float k() {
        return this.f13942r;
    }

    public final float l() {
        return this.f13943s;
    }

    public final float m() {
        return this.f13944t;
    }

    public final float n() {
        return this.f13945u;
    }

    public /* synthetic */ s(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) == 0 ? f14 : 1.0f, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) == 0 ? f16 : 0.0f, (i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? t.e() : list, (i10 & 512) != 0 ? ec.t.i() : list2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends i> list, List<? extends u> list2) {
        super(null);
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        qc.q.i(list, "clipPathData");
        qc.q.i(list2, "children");
        this.f13938f = str;
        this.f13939m = f10;
        this.f13940p = f11;
        this.f13941q = f12;
        this.f13942r = f13;
        this.f13943s = f14;
        this.f13944t = f15;
        this.f13945u = f16;
        this.f13946v = list;
        this.f13947w = list2;
    }
}
