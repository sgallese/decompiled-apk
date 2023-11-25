package e1;

import a1.e1;
import a1.g4;
import a1.s4;
import a1.t4;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* compiled from: ImageVector.kt */
/* loaded from: classes.dex */
public final class x extends u {
    private final float A;

    /* renamed from: f  reason: collision with root package name */
    private final String f13980f;

    /* renamed from: m  reason: collision with root package name */
    private final List<i> f13981m;

    /* renamed from: p  reason: collision with root package name */
    private final int f13982p;

    /* renamed from: q  reason: collision with root package name */
    private final e1 f13983q;

    /* renamed from: r  reason: collision with root package name */
    private final float f13984r;

    /* renamed from: s  reason: collision with root package name */
    private final e1 f13985s;

    /* renamed from: t  reason: collision with root package name */
    private final float f13986t;

    /* renamed from: u  reason: collision with root package name */
    private final float f13987u;

    /* renamed from: v  reason: collision with root package name */
    private final int f13988v;

    /* renamed from: w  reason: collision with root package name */
    private final int f13989w;

    /* renamed from: x  reason: collision with root package name */
    private final float f13990x;

    /* renamed from: y  reason: collision with root package name */
    private final float f13991y;

    /* renamed from: z  reason: collision with root package name */
    private final float f13992z;

    public /* synthetic */ x(String str, List list, int i10, e1 e1Var, float f10, e1 e1Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, qc.h hVar) {
        this(str, list, i10, e1Var, f10, e1Var2, f11, f12, i11, i12, f13, f14, f15, f16);
    }

    public final e1 a() {
        return this.f13983q;
    }

    public final float e() {
        return this.f13984r;
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
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        if (!qc.q.d(this.f13980f, xVar.f13980f) || !qc.q.d(this.f13983q, xVar.f13983q)) {
            return false;
        }
        if (this.f13984r == xVar.f13984r) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !qc.q.d(this.f13985s, xVar.f13985s)) {
            return false;
        }
        if (this.f13986t == xVar.f13986t) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        if (this.f13987u == xVar.f13987u) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 || !s4.g(this.f13988v, xVar.f13988v) || !t4.g(this.f13989w, xVar.f13989w)) {
            return false;
        }
        if (this.f13990x == xVar.f13990x) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            return false;
        }
        if (this.f13991y == xVar.f13991y) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z14) {
            return false;
        }
        if (this.f13992z == xVar.f13992z) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (!z15) {
            return false;
        }
        if (this.A == xVar.A) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z16 && g4.f(this.f13982p, xVar.f13982p) && qc.q.d(this.f13981m, xVar.f13981m)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f13980f;
    }

    public final List<i> h() {
        return this.f13981m;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((this.f13980f.hashCode() * 31) + this.f13981m.hashCode()) * 31;
        e1 e1Var = this.f13983q;
        int i11 = 0;
        if (e1Var != null) {
            i10 = e1Var.hashCode();
        } else {
            i10 = 0;
        }
        int floatToIntBits = (((hashCode + i10) * 31) + Float.floatToIntBits(this.f13984r)) * 31;
        e1 e1Var2 = this.f13985s;
        if (e1Var2 != null) {
            i11 = e1Var2.hashCode();
        }
        return ((((((((((((((((((floatToIntBits + i11) * 31) + Float.floatToIntBits(this.f13986t)) * 31) + Float.floatToIntBits(this.f13987u)) * 31) + s4.h(this.f13988v)) * 31) + t4.h(this.f13989w)) * 31) + Float.floatToIntBits(this.f13990x)) * 31) + Float.floatToIntBits(this.f13991y)) * 31) + Float.floatToIntBits(this.f13992z)) * 31) + Float.floatToIntBits(this.A)) * 31) + g4.g(this.f13982p);
    }

    public final int i() {
        return this.f13982p;
    }

    public final e1 j() {
        return this.f13985s;
    }

    public final float k() {
        return this.f13986t;
    }

    public final int l() {
        return this.f13988v;
    }

    public final int m() {
        return this.f13989w;
    }

    public final float n() {
        return this.f13990x;
    }

    public final float o() {
        return this.f13987u;
    }

    public final float p() {
        return this.f13992z;
    }

    public final float r() {
        return this.A;
    }

    public final float s() {
        return this.f13991y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private x(String str, List<? extends i> list, int i10, e1 e1Var, float f10, e1 e1Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        super(null);
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        qc.q.i(list, "pathData");
        this.f13980f = str;
        this.f13981m = list;
        this.f13982p = i10;
        this.f13983q = e1Var;
        this.f13984r = f10;
        this.f13985s = e1Var2;
        this.f13986t = f11;
        this.f13987u = f12;
        this.f13988v = i11;
        this.f13989w = i12;
        this.f13990x = f13;
        this.f13991y = f14;
        this.f13992z = f15;
        this.A = f16;
    }
}
