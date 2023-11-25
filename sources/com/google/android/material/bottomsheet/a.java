package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.x;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.n0;
import androidx.core.view.b1;
import androidx.core.view.h0;
import androidx.core.view.p0;
import androidx.core.view.p1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p7.g;
import v6.h;
import v6.k;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes3.dex */
public class a extends x {
    private BottomSheetBehavior<FrameLayout> behavior;
    private FrameLayout bottomSheet;
    private BottomSheetBehavior.f bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    private CoordinatorLayout coordinator;
    boolean dismissWithAnimation;
    private f edgeToEdgeCallback;
    private boolean edgeToEdgeEnabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0231a implements h0 {
        C0231a() {
        }

        @Override // androidx.core.view.h0
        public p1 a(View view, p1 p1Var) {
            if (a.this.edgeToEdgeCallback != null) {
                a.this.behavior.x0(a.this.edgeToEdgeCallback);
            }
            if (p1Var != null) {
                a aVar = a.this;
                aVar.edgeToEdgeCallback = new f(aVar.bottomSheet, p1Var, null);
                a.this.edgeToEdgeCallback.b(a.this.getWindow());
                a.this.behavior.Y(a.this.edgeToEdgeCallback);
            }
            return p1Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.cancelable && aVar.isShowing() && a.this.shouldWindowCloseOnTouchOutside()) {
                a.this.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes3.dex */
    public class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void g(View view, n0 n0Var) {
            super.g(view, n0Var);
            if (a.this.cancelable) {
                n0Var.a(1048576);
                n0Var.t0(true);
                return;
            }
            n0Var.t0(false);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                a aVar = a.this;
                if (aVar.cancelable) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i10, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes3.dex */
    public class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes3.dex */
    private static class f extends BottomSheetBehavior.f {

        /* renamed from: a  reason: collision with root package name */
        private final Boolean f9688a;

        /* renamed from: b  reason: collision with root package name */
        private final p1 f9689b;

        /* renamed from: c  reason: collision with root package name */
        private Window f9690c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f9691d;

        /* synthetic */ f(View view, p1 p1Var, C0231a c0231a) {
            this(view, p1Var);
        }

        private void a(View view) {
            boolean booleanValue;
            if (view.getTop() < this.f9689b.l()) {
                Window window = this.f9690c;
                if (window != null) {
                    Boolean bool = this.f9688a;
                    if (bool == null) {
                        booleanValue = this.f9691d;
                    } else {
                        booleanValue = bool.booleanValue();
                    }
                    com.google.android.material.internal.d.f(window, booleanValue);
                }
                view.setPadding(view.getPaddingLeft(), this.f9689b.l() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                Window window2 = this.f9690c;
                if (window2 != null) {
                    com.google.android.material.internal.d.f(window2, this.f9691d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        void b(Window window) {
            if (this.f9690c == window) {
                return;
            }
            this.f9690c = window;
            if (window != null) {
                this.f9691d = b1.a(window, window.getDecorView()).b();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        void onLayout(View view) {
            a(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void onSlide(View view, float f10) {
            a(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void onStateChanged(View view, int i10) {
            a(view);
        }

        private f(View view, p1 p1Var) {
            ColorStateList u10;
            this.f9689b = p1Var;
            g n02 = BottomSheetBehavior.k0(view).n0();
            if (n02 != null) {
                u10 = n02.x();
            } else {
                u10 = p0.u(view);
            }
            if (u10 != null) {
                this.f9688a = Boolean.valueOf(d7.a.h(u10.getDefaultColor()));
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f9688a = Boolean.valueOf(d7.a.h(((ColorDrawable) view.getBackground()).getColor()));
            } else {
                this.f9688a = null;
            }
        }
    }

    public a(Context context) {
        this(context, 0);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{v6.b.f24652v}).getBoolean(0, false);
    }

    private FrameLayout ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), h.f24741a, null);
            this.container = frameLayout;
            this.coordinator = (CoordinatorLayout) frameLayout.findViewById(v6.f.f24716e);
            FrameLayout frameLayout2 = (FrameLayout) this.container.findViewById(v6.f.f24717f);
            this.bottomSheet = frameLayout2;
            BottomSheetBehavior<FrameLayout> k02 = BottomSheetBehavior.k0(frameLayout2);
            this.behavior = k02;
            k02.Y(this.bottomSheetCallback);
            this.behavior.H0(this.cancelable);
        }
        return this.container;
    }

    private static int getThemeResId(Context context, int i10) {
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(v6.b.f24628d, typedValue, true)) {
                return typedValue.resourceId;
            }
            return k.f24797g;
        }
        return i10;
    }

    @Deprecated
    public static void setLightStatusBar(View view, boolean z10) {
        int i10;
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility | 8192;
            } else {
                i10 = systemUiVisibility & (-8193);
            }
            view.setSystemUiVisibility(i10);
        }
    }

    private View wrapInBottomSheet(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.container.findViewById(v6.f.f24716e);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.edgeToEdgeEnabled) {
            p0.J0(this.bottomSheet, new C0231a());
        }
        this.bottomSheet.removeAllViews();
        if (layoutParams == null) {
            this.bottomSheet.addView(view);
        } else {
            this.bottomSheet.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(v6.f.W).setOnClickListener(new b());
        p0.u0(this.bottomSheet, new c());
        this.bottomSheet.setOnTouchListener(new d());
        return this.container;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        if (this.dismissWithAnimation && behavior.o0() != 5) {
            behavior.P0(5);
        } else {
            super.cancel();
        }
    }

    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public boolean getDismissWithAnimation() {
        return this.dismissWithAnimation;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.edgeToEdgeEnabled;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.edgeToEdgeEnabled && Color.alpha(window.getNavigationBarColor()) < 255) {
                z10 = true;
            } else {
                z10 = false;
            }
            FrameLayout frameLayout = this.container;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.coordinator;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            b1.b(window, !z10);
            f fVar = this.edgeToEdgeCallback;
            if (fVar != null) {
                fVar.b(window);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.x, androidx.activity.i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i10 = Build.VERSION.SDK_INT;
            window.setStatusBarColor(0);
            window.addFlags(RecyclerView.UNDEFINED_DURATION);
            if (i10 < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.edgeToEdgeCallback;
        if (fVar != null) {
            fVar.b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.i, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior != null && bottomSheetBehavior.o0() == 5) {
            this.behavior.P0(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeDefaultCallback() {
        this.behavior.x0(this.bottomSheetCallback);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.cancelable != z10) {
            this.cancelable = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.H0(z10);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z10;
        this.canceledOnTouchOutsideSet = true;
    }

    @Override // androidx.appcompat.app.x, androidx.activity.i, android.app.Dialog
    public void setContentView(int i10) {
        super.setContentView(wrapInBottomSheet(i10, null, null));
    }

    public void setDismissWithAnimation(boolean z10) {
        this.dismissWithAnimation = z10;
    }

    boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    @Override // androidx.appcompat.app.x, androidx.activity.i, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(wrapInBottomSheet(0, view, null));
    }

    @Override // androidx.appcompat.app.x, androidx.activity.i, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }

    public a(Context context, int i10) {
        super(context, getThemeResId(context, i10));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new e();
        supportRequestWindowFeature(1);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{v6.b.f24652v}).getBoolean(0, false);
    }

    protected a(Context context, boolean z10, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z10, onCancelListener);
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new e();
        supportRequestWindowFeature(1);
        this.cancelable = z10;
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{v6.b.f24652v}).getBoolean(0, false);
    }

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes3.dex */
    class e extends BottomSheetBehavior.f {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void onStateChanged(View view, int i10) {
            if (i10 == 5) {
                a.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void onSlide(View view, float f10) {
        }
    }
}
