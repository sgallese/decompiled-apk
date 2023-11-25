package a2;

/* compiled from: FontFamily.kt */
/* loaded from: classes.dex */
public final class f0 extends l {

    /* renamed from: u  reason: collision with root package name */
    private final t0 f255u;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f0) && qc.q.d(this.f255u, ((f0) obj).f255u)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f255u.hashCode();
    }

    public final t0 j() {
        return this.f255u;
    }

    public String toString() {
        return "LoadedFontFamily(typeface=" + this.f255u + ')';
    }
}
