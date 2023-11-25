package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;

/* compiled from: Wrapper.android.kt */
/* loaded from: classes.dex */
public final class b5 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2614a = "Wrapper";

    /* renamed from: b  reason: collision with root package name */
    private static final ViewGroup.LayoutParams f2615b = new ViewGroup.LayoutParams(-2, -2);

    public static final j0.o a(p1.j0 j0Var, j0.p pVar) {
        qc.q.i(j0Var, "container");
        qc.q.i(pVar, "parent");
        return j0.s.a(new p1.x1(j0Var), pVar);
    }

    private static final j0.o b(AndroidComposeView androidComposeView, j0.p pVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2) {
        WrappedComposition wrappedComposition;
        if (d(androidComposeView)) {
            androidComposeView.setTag(v0.h.J, Collections.newSetFromMap(new WeakHashMap()));
            c();
        }
        j0.o a10 = j0.s.a(new p1.x1(androidComposeView.getRoot()), pVar);
        View view = androidComposeView.getView();
        int i10 = v0.h.K;
        Object tag = view.getTag(i10);
        if (tag instanceof WrappedComposition) {
            wrappedComposition = (WrappedComposition) tag;
        } else {
            wrappedComposition = null;
        }
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, a10);
            androidComposeView.getView().setTag(i10, wrappedComposition);
        }
        wrappedComposition.e(pVar2);
        return wrappedComposition;
    }

    private static final void c() {
        if (!k1.c()) {
            try {
                Field declaredField = k1.class.getDeclaredField("isDebugInspectorInfoEnabled");
                declaredField.setAccessible(true);
                declaredField.setBoolean(null, true);
            } catch (Exception unused) {
                Log.w(f2614a, "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
            }
        }
    }

    private static final boolean d(AndroidComposeView androidComposeView) {
        if (Build.VERSION.SDK_INT >= 29 && (!a5.f2611a.a(androidComposeView).isEmpty()) != false) {
            return true;
        }
        return false;
    }

    public static final j0.o e(a aVar, j0.p pVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2) {
        qc.q.i(aVar, "<this>");
        qc.q.i(pVar, "parent");
        qc.q.i(pVar2, "content");
        g1.f2674a.a();
        AndroidComposeView androidComposeView = null;
        if (aVar.getChildCount() > 0) {
            View childAt = aVar.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            aVar.removeAllViews();
        }
        if (androidComposeView == null) {
            Context context = aVar.getContext();
            qc.q.h(context, "context");
            androidComposeView = new AndroidComposeView(context, pVar.g());
            aVar.addView(androidComposeView.getView(), f2615b);
        }
        return b(androidComposeView, pVar, pVar2);
    }
}
