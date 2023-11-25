package k1;

/* compiled from: PointerEvent.kt */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f19225a;

    private /* synthetic */ p0(int i10) {
        this.f19225a = i10;
    }

    public static final /* synthetic */ p0 a(int i10) {
        return new p0(i10);
    }

    public static boolean c(int i10, Object obj) {
        if (!(obj instanceof p0) || i10 != ((p0) obj).f()) {
            return false;
        }
        return true;
    }

    public static String e(int i10) {
        return "PointerKeyboardModifiers(packedValue=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f19225a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f19225a;
    }

    public int hashCode() {
        return d(this.f19225a);
    }

    public String toString() {
        return e(this.f19225a);
    }

    public static int b(int i10) {
        return i10;
    }

    public static int d(int i10) {
        return i10;
    }
}
