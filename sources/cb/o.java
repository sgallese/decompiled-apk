package cb;

/* compiled from: Prop.java */
/* loaded from: classes4.dex */
public class o<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f8937a;

    o(String str) {
        this.f8937a = str;
    }

    public static <T> o<T> c(String str) {
        return new o<>(str);
    }

    public T a(r rVar) {
        return (T) rVar.c(this);
    }

    public T b(r rVar, T t10) {
        return (T) rVar.a(this, t10);
    }

    public T d(r rVar) {
        T a10 = a(rVar);
        if (a10 != null) {
            return a10;
        }
        throw new NullPointerException(this.f8937a);
    }

    public void e(r rVar, T t10) {
        rVar.b(this, t10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f8937a.equals(((o) obj).f8937a);
        }
        return false;
    }

    public int hashCode() {
        return this.f8937a.hashCode();
    }

    public String toString() {
        return "Prop{name='" + this.f8937a + "'}";
    }
}
