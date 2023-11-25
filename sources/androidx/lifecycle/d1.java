package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;

/* compiled from: ViewTreeLifecycleOwner.kt */
/* loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTreeLifecycleOwner.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<View, View> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f4962f = new a();

        a() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            qc.q.i(view, "currentView");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTreeLifecycleOwner.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<View, v> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f4963f = new b();

        b() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final v invoke(View view) {
            qc.q.i(view, "viewParent");
            Object tag = view.getTag(i3.a.f16955a);
            if (tag instanceof v) {
                return (v) tag;
            }
            return null;
        }
    }

    public static final v a(View view) {
        xc.g f10;
        xc.g x10;
        Object p10;
        qc.q.i(view, "<this>");
        f10 = xc.m.f(view, a.f4962f);
        x10 = xc.o.x(f10, b.f4963f);
        p10 = xc.o.p(x10);
        return (v) p10;
    }

    public static final void b(View view, v vVar) {
        qc.q.i(view, "<this>");
        view.setTag(i3.a.f16955a, vVar);
    }
}
