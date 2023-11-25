package dc;

import java.io.Serializable;

/* compiled from: Tuples.kt */
/* loaded from: classes4.dex */
public final class l<A, B> implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    private final A f13251f;

    /* renamed from: m  reason: collision with root package name */
    private final B f13252m;

    public l(A a10, B b10) {
        this.f13251f = a10;
        this.f13252m = b10;
    }

    public final A a() {
        return this.f13251f;
    }

    public final B b() {
        return this.f13252m;
    }

    public final A c() {
        return this.f13251f;
    }

    public final B d() {
        return this.f13252m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (qc.q.d(this.f13251f, lVar.f13251f) && qc.q.d(this.f13252m, lVar.f13252m)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        A a10 = this.f13251f;
        int i10 = 0;
        if (a10 == null) {
            hashCode = 0;
        } else {
            hashCode = a10.hashCode();
        }
        int i11 = hashCode * 31;
        B b10 = this.f13252m;
        if (b10 != null) {
            i10 = b10.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return '(' + this.f13251f + ", " + this.f13252m + ')';
    }
}
