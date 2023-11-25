package j0;

/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class i2<T> {

    /* renamed from: a  reason: collision with root package name */
    private final l f18656a;

    private /* synthetic */ i2(l lVar) {
        this.f18656a = lVar;
    }

    public static final /* synthetic */ i2 a(l lVar) {
        return new i2(lVar);
    }

    public static <T> l b(l lVar) {
        qc.q.i(lVar, "composer");
        return lVar;
    }

    public static boolean c(l lVar, Object obj) {
        if (!(obj instanceof i2) || !qc.q.d(lVar, ((i2) obj).f())) {
            return false;
        }
        return true;
    }

    public static int d(l lVar) {
        return lVar.hashCode();
    }

    public static String e(l lVar) {
        return "SkippableUpdater(composer=" + lVar + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f18656a, obj);
    }

    public final /* synthetic */ l f() {
        return this.f18656a;
    }

    public int hashCode() {
        return d(this.f18656a);
    }

    public String toString() {
        return e(this.f18656a);
    }
}
