package t;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: Clickable.android.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final long f23183a = ViewConfiguration.getTapTimeout();

    public static final long a() {
        return f23183a;
    }

    public static final boolean b(KeyEvent keyEvent) {
        qc.q.i(keyEvent, "$this$isClick");
        if (i1.c.e(i1.d.b(keyEvent), i1.c.f16951a.b()) && d(keyEvent)) {
            return true;
        }
        return false;
    }

    public static final boolean c(p1.h hVar) {
        qc.q.i(hVar, "<this>");
        return e((View) p1.i.a(hVar, androidx.compose.ui.platform.j0.k()));
    }

    private static final boolean d(KeyEvent keyEvent) {
        int b10 = i1.f.b(i1.d.a(keyEvent));
        if (b10 != 23 && b10 != 66 && b10 != 160) {
            return false;
        }
        return true;
    }

    private static final boolean e(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final boolean f(KeyEvent keyEvent) {
        qc.q.i(keyEvent, "$this$isPress");
        if (i1.c.e(i1.d.b(keyEvent), i1.c.f16951a.a()) && d(keyEvent)) {
            return true;
        }
        return false;
    }
}
