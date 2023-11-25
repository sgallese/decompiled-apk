package k8;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* compiled from: Dependency.java */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final b0<?> f19418a;

    /* renamed from: b  reason: collision with root package name */
    private final int f19419b;

    /* renamed from: c  reason: collision with root package name */
    private final int f19420c;

    private r(Class<?> cls, int i10, int i11) {
        this(b0.b(cls), i10, i11);
    }

    public static r a(Class<?> cls) {
        return new r(cls, 0, 2);
    }

    private static String b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i10);
            }
            return "provider";
        }
        return DevicePublicKeyStringDef.DIRECT;
    }

    @Deprecated
    public static r h(Class<?> cls) {
        return new r(cls, 0, 0);
    }

    public static r i(Class<?> cls) {
        return new r(cls, 0, 1);
    }

    public static r j(Class<?> cls) {
        return new r(cls, 1, 0);
    }

    public static r k(b0<?> b0Var) {
        return new r(b0Var, 1, 0);
    }

    public static r l(Class<?> cls) {
        return new r(cls, 1, 1);
    }

    public static r m(Class<?> cls) {
        return new r(cls, 2, 0);
    }

    public b0<?> c() {
        return this.f19418a;
    }

    public boolean d() {
        if (this.f19420c == 2) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (this.f19420c == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f19418a.equals(rVar.f19418a) || this.f19419b != rVar.f19419b || this.f19420c != rVar.f19420c) {
            return false;
        }
        return true;
    }

    public boolean f() {
        if (this.f19419b == 1) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.f19419b == 2) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f19418a.hashCode() ^ 1000003) * 1000003) ^ this.f19419b) * 1000003) ^ this.f19420c;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f19418a);
        sb2.append(", type=");
        int i10 = this.f19419b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        sb2.append(b(this.f19420c));
        sb2.append("}");
        return sb2.toString();
    }

    private r(b0<?> b0Var, int i10, int i11) {
        this.f19418a = (b0) a0.c(b0Var, "Null dependency anInterface.");
        this.f19419b = i10;
        this.f19420c = i11;
    }
}
