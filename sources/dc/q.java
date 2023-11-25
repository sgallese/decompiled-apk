package dc;

import java.io.Serializable;

/* compiled from: Tuples.kt */
/* loaded from: classes4.dex */
public final class q<A, B, C> implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    private final A f13263f;

    /* renamed from: m  reason: collision with root package name */
    private final B f13264m;

    /* renamed from: p  reason: collision with root package name */
    private final C f13265p;

    public q(A a10, B b10, C c10) {
        this.f13263f = a10;
        this.f13264m = b10;
        this.f13265p = c10;
    }

    public final A a() {
        return this.f13263f;
    }

    public final B b() {
        return this.f13264m;
    }

    public final C c() {
        return this.f13265p;
    }

    public final A d() {
        return this.f13263f;
    }

    public final B e() {
        return this.f13264m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (qc.q.d(this.f13263f, qVar.f13263f) && qc.q.d(this.f13264m, qVar.f13264m) && qc.q.d(this.f13265p, qVar.f13265p)) {
            return true;
        }
        return false;
    }

    public final C f() {
        return this.f13265p;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        A a10 = this.f13263f;
        int i10 = 0;
        if (a10 == null) {
            hashCode = 0;
        } else {
            hashCode = a10.hashCode();
        }
        int i11 = hashCode * 31;
        B b10 = this.f13264m;
        if (b10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = b10.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        C c10 = this.f13265p;
        if (c10 != null) {
            i10 = c10.hashCode();
        }
        return i12 + i10;
    }

    public String toString() {
        return '(' + this.f13263f + ", " + this.f13264m + ", " + this.f13265p + ')';
    }
}
