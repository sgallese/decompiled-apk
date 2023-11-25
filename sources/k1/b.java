package k1;

import android.view.PointerIcon;

/* compiled from: PointerIcon.android.kt */
/* loaded from: classes.dex */
public final class b implements w {

    /* renamed from: c  reason: collision with root package name */
    private final PointerIcon f19149c;

    public final PointerIcon a() {
        return this.f19149c;
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
        if (!qc.q.d(b.class, cls)) {
            return false;
        }
        qc.q.g(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return qc.q.d(this.f19149c, ((b) obj).f19149c);
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.f19149c.hashCode();
        return hashCode;
    }

    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.f19149c + ')';
    }
}
