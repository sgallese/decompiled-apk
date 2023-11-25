package zb;

/* compiled from: Pair.java */
/* loaded from: classes4.dex */
public class a<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public F f26429a;

    /* renamed from: b  reason: collision with root package name */
    public S f26430b;

    public a(F f10, S s10) {
        this.f26429a = f10;
        this.f26430b = s10;
    }

    private boolean a(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!a(aVar.f26429a, this.f26429a) || !a(aVar.f26430b, this.f26430b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        F f10 = this.f26429a;
        int i10 = 0;
        if (f10 == null) {
            hashCode = 0;
        } else {
            hashCode = f10.hashCode();
        }
        S s10 = this.f26430b;
        if (s10 != null) {
            i10 = s10.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f26429a) + " " + String.valueOf(this.f26430b) + "}";
    }
}
