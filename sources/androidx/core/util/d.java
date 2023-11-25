package androidx.core.util;

/* compiled from: Pair.java */
/* loaded from: classes.dex */
public class d<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f4048a;

    /* renamed from: b  reason: collision with root package name */
    public final S f4049b;

    public d(F f10, S s10) {
        this.f4048a = f10;
        this.f4049b = s10;
    }

    public static <A, B> d<A, B> a(A a10, B b10) {
        return new d<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!c.a(dVar.f4048a, this.f4048a) || !c.a(dVar.f4049b, this.f4049b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        F f10 = this.f4048a;
        int i10 = 0;
        if (f10 == null) {
            hashCode = 0;
        } else {
            hashCode = f10.hashCode();
        }
        S s10 = this.f4049b;
        if (s10 != null) {
            i10 = s10.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "Pair{" + this.f4048a + " " + this.f4049b + "}";
    }
}
