package w3;

import android.view.View;
import android.view.ViewParent;
import pc.l;
import qc.q;
import qc.r;
import xc.g;
import xc.m;
import xc.o;

/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
/* loaded from: classes.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTreeSavedStateRegistryOwner.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements l<View, View> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f25364f = new a();

        a() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            q.i(view, "view");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTreeSavedStateRegistryOwner.kt */
    /* loaded from: classes.dex */
    public static final class b extends r implements l<View, d> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f25365f = new b();

        b() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final d invoke(View view) {
            q.i(view, "view");
            Object tag = view.getTag(w3.a.f25358a);
            if (tag instanceof d) {
                return (d) tag;
            }
            return null;
        }
    }

    public static final d a(View view) {
        g f10;
        g x10;
        Object p10;
        q.i(view, "<this>");
        f10 = m.f(view, a.f25364f);
        x10 = o.x(f10, b.f25365f);
        p10 = o.p(x10);
        return (d) p10;
    }

    public static final void b(View view, d dVar) {
        q.i(view, "<this>");
        view.setTag(w3.a.f25358a, dVar);
    }
}
