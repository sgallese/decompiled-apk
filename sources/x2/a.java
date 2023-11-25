package x2;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.t0;
import androidx.core.view.u0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import qc.q;

/* compiled from: PoolingContainer.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int f25705a = d.f25709b;

    /* renamed from: b  reason: collision with root package name */
    private static final int f25706b = d.f25708a;

    @SuppressLint({"ExecutorRegistration"})
    public static final void a(View view, b bVar) {
        q.i(view, "<this>");
        q.i(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        d(view).a(bVar);
    }

    public static final void b(View view) {
        q.i(view, "<this>");
        Iterator<View> it = u0.a(view).iterator();
        while (it.hasNext()) {
            d(it.next()).b();
        }
    }

    public static final void c(ViewGroup viewGroup) {
        q.i(viewGroup, "<this>");
        Iterator<View> it = t0.a(viewGroup).iterator();
        while (it.hasNext()) {
            d(it.next()).b();
        }
    }

    private static final c d(View view) {
        int i10 = f25705a;
        c cVar = (c) view.getTag(i10);
        if (cVar == null) {
            c cVar2 = new c();
            view.setTag(i10, cVar2);
            return cVar2;
        }
        return cVar;
    }

    public static final boolean e(View view) {
        Boolean bool;
        q.i(view, "<this>");
        Object tag = view.getTag(f25706b);
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean f(View view) {
        q.i(view, "<this>");
        for (ViewParent viewParent : u0.b(view)) {
            if ((viewParent instanceof View) && e((View) viewParent)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void g(View view, b bVar) {
        q.i(view, "<this>");
        q.i(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        d(view).c(bVar);
    }

    public static final void h(View view, boolean z10) {
        q.i(view, "<this>");
        view.setTag(f25706b, Boolean.valueOf(z10));
    }
}
