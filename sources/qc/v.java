package qc;

/* compiled from: PackageReference.kt */
/* loaded from: classes4.dex */
public final class v implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f21687a;

    /* renamed from: b  reason: collision with root package name */
    private final String f21688b;

    public v(Class<?> cls, String str) {
        q.i(cls, "jClass");
        q.i(str, "moduleName");
        this.f21687a = cls;
        this.f21688b = str;
    }

    @Override // qc.e
    public Class<?> b() {
        return this.f21687a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof v) && q.d(b(), ((v) obj).b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
