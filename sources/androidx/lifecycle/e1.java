package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;

/* compiled from: ViewTreeViewModelStoreOwner.kt */
/* loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTreeViewModelStoreOwner.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<View, View> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f4966f = new a();

        a() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            qc.q.i(view, "view");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTreeViewModelStoreOwner.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<View, c1> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f4967f = new b();

        b() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final c1 invoke(View view) {
            qc.q.i(view, "view");
            Object tag = view.getTag(j3.e.f19020a);
            if (tag instanceof c1) {
                return (c1) tag;
            }
            return null;
        }
    }

    public static final c1 a(View view) {
        xc.g f10;
        xc.g x10;
        Object p10;
        qc.q.i(view, "<this>");
        f10 = xc.m.f(view, a.f4966f);
        x10 = xc.o.x(f10, b.f4967f);
        p10 = xc.o.p(x10);
        return (c1) p10;
    }

    public static final void b(View view, c1 c1Var) {
        qc.q.i(view, "<this>");
        view.setTag(j3.e.f19020a, c1Var);
    }
}
