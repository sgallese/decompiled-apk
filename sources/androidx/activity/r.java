package androidx.activity;

import android.view.View;
import android.view.ViewParent;

/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
/* loaded from: classes.dex */
public final class r {

    /* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<View, View> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f648f = new a();

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

    /* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<View, o> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f649f = new b();

        b() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final o invoke(View view) {
            qc.q.i(view, "it");
            Object tag = view.getTag(p.f647b);
            if (tag instanceof o) {
                return (o) tag;
            }
            return null;
        }
    }

    public static final o a(View view) {
        xc.g f10;
        xc.g x10;
        Object p10;
        qc.q.i(view, "<this>");
        f10 = xc.m.f(view, a.f648f);
        x10 = xc.o.x(f10, b.f649f);
        p10 = xc.o.p(x10);
        return (o) p10;
    }

    public static final void b(View view, o oVar) {
        qc.q.i(view, "<this>");
        qc.q.i(oVar, "onBackPressedDispatcherOwner");
        view.setTag(p.f647b, oVar);
    }
}
