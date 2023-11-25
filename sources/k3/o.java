package k3;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* compiled from: Navigation.kt */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f19314a = new o();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Navigation.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<View, View> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f19315f = new a();

        a() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            qc.q.i(view, "it");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Navigation.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<View, androidx.navigation.d> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f19316f = new b();

        b() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final androidx.navigation.d invoke(View view) {
            qc.q.i(view, "it");
            return o.f19314a.e(view);
        }
    }

    private o() {
    }

    public static final androidx.navigation.d b(Activity activity, int i10) {
        qc.q.i(activity, "activity");
        View v10 = androidx.core.app.b.v(activity, i10);
        qc.q.h(v10, "requireViewById<View>(activity, viewId)");
        androidx.navigation.d d10 = f19314a.d(v10);
        if (d10 != null) {
            return d10;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i10);
    }

    public static final androidx.navigation.d c(View view) {
        qc.q.i(view, "view");
        androidx.navigation.d d10 = f19314a.d(view);
        if (d10 != null) {
            return d10;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    private final androidx.navigation.d d(View view) {
        xc.g f10;
        xc.g x10;
        Object p10;
        f10 = xc.m.f(view, a.f19315f);
        x10 = xc.o.x(f10, b.f19316f);
        p10 = xc.o.p(x10);
        return (androidx.navigation.d) p10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.navigation.d e(View view) {
        Object tag = view.getTag(r.f19325a);
        if (tag instanceof WeakReference) {
            return (androidx.navigation.d) ((WeakReference) tag).get();
        }
        if (tag instanceof androidx.navigation.d) {
            return (androidx.navigation.d) tag;
        }
        return null;
    }

    public static final void f(View view, androidx.navigation.d dVar) {
        qc.q.i(view, "view");
        view.setTag(r.f19325a, dVar);
    }
}
