package qc;

import java.io.Serializable;

/* compiled from: AdaptedFunctionReference.java */
/* loaded from: classes4.dex */
public class a implements l, Serializable {

    /* renamed from: f  reason: collision with root package name */
    protected final Object f21647f;

    /* renamed from: m  reason: collision with root package name */
    private final Class f21648m;

    /* renamed from: p  reason: collision with root package name */
    private final String f21649p;

    /* renamed from: q  reason: collision with root package name */
    private final String f21650q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f21651r;

    /* renamed from: s  reason: collision with root package name */
    private final int f21652s;

    /* renamed from: t  reason: collision with root package name */
    private final int f21653t;

    public a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        boolean z10;
        this.f21647f = obj;
        this.f21648m = cls;
        this.f21649p = str;
        this.f21650q = str2;
        if ((i11 & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f21651r = z10;
        this.f21652s = i10;
        this.f21653t = i11 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f21651r == aVar.f21651r && this.f21652s == aVar.f21652s && this.f21653t == aVar.f21653t && q.d(this.f21647f, aVar.f21647f) && q.d(this.f21648m, aVar.f21648m) && this.f21649p.equals(aVar.f21649p) && this.f21650q.equals(aVar.f21650q)) {
            return true;
        }
        return false;
    }

    @Override // qc.l
    public int getArity() {
        return this.f21652s;
    }

    public int hashCode() {
        int i10;
        int i11;
        Object obj = this.f21647f;
        int i12 = 0;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Class cls = this.f21648m;
        if (cls != null) {
            i12 = cls.hashCode();
        }
        int hashCode = (((((i13 + i12) * 31) + this.f21649p.hashCode()) * 31) + this.f21650q.hashCode()) * 31;
        if (this.f21651r) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return ((((hashCode + i11) * 31) + this.f21652s) * 31) + this.f21653t;
    }

    public String toString() {
        return g0.g(this);
    }
}
