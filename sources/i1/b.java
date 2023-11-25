package i1;

import android.view.KeyEvent;
import qc.q;

/* compiled from: KeyEvent.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final KeyEvent f16950a;

    private /* synthetic */ b(KeyEvent keyEvent) {
        this.f16950a = keyEvent;
    }

    public static final /* synthetic */ b a(KeyEvent keyEvent) {
        return new b(keyEvent);
    }

    public static KeyEvent b(KeyEvent keyEvent) {
        q.i(keyEvent, "nativeKeyEvent");
        return keyEvent;
    }

    public static boolean c(KeyEvent keyEvent, Object obj) {
        if (!(obj instanceof b) || !q.d(keyEvent, ((b) obj).f())) {
            return false;
        }
        return true;
    }

    public static int d(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String e(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f16950a, obj);
    }

    public final /* synthetic */ KeyEvent f() {
        return this.f16950a;
    }

    public int hashCode() {
        return d(this.f16950a);
    }

    public String toString() {
        return e(this.f16950a);
    }
}
