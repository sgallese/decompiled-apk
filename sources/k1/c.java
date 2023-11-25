package k1;

/* compiled from: PointerIcon.android.kt */
/* loaded from: classes.dex */
public final class c implements w {

    /* renamed from: c  reason: collision with root package name */
    private final int f19151c;

    public c(int i10) {
        this.f19151c = i10;
    }

    public final int a() {
        return this.f19151c;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!qc.q.d(c.class, cls)) {
            return false;
        }
        qc.q.g(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        if (this.f19151c == ((c) obj).f19151c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f19151c;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f19151c + ')';
    }
}
