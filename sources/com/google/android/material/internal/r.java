package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.h0;
import androidx.core.view.p0;
import androidx.core.view.p1;

/* compiled from: ViewUtils.java */
/* loaded from: classes3.dex */
public class r {

    /* compiled from: ViewUtils.java */
    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f10182f;

        a(View view) {
            this.f10182f = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f10182f.getContext().getSystemService("input_method")).showSoftInput(this.f10182f, 1);
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes3.dex */
    class b implements h0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f10183a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f10184b;

        b(d dVar, e eVar) {
            this.f10183a = dVar;
            this.f10184b = eVar;
        }

        @Override // androidx.core.view.h0
        public p1 a(View view, p1 p1Var) {
            return this.f10183a.a(view, p1Var, new e(this.f10184b));
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes3.dex */
    public interface d {
        p1 a(View view, p1 p1Var, e eVar);
    }

    public static void a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void b(View view, d dVar) {
        p0.J0(view, new b(dVar, new e(p0.J(view), view.getPaddingTop(), p0.I(view), view.getPaddingBottom())));
        j(view);
    }

    public static float c(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer d(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    public static float e(View view) {
        float f10 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f10 += p0.y((View) parent);
        }
        return f10;
    }

    public static boolean f(View view) {
        if (p0.E(view) == 1) {
            return true;
        }
        return false;
    }

    public static PorterDuff.Mode g(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void h(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            i(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void i(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void j(View view) {
        if (p0.X(view)) {
            p0.r0(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void k(View view) {
        view.requestFocus();
        view.post(new a(view));
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public int f10185a;

        /* renamed from: b  reason: collision with root package name */
        public int f10186b;

        /* renamed from: c  reason: collision with root package name */
        public int f10187c;

        /* renamed from: d  reason: collision with root package name */
        public int f10188d;

        public e(int i10, int i11, int i12, int i13) {
            this.f10185a = i10;
            this.f10186b = i11;
            this.f10187c = i12;
            this.f10188d = i13;
        }

        public e(e eVar) {
            this.f10185a = eVar.f10185a;
            this.f10186b = eVar.f10186b;
            this.f10187c = eVar.f10187c;
            this.f10188d = eVar.f10188d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewUtils.java */
    /* loaded from: classes3.dex */
    public class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            p0.r0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
