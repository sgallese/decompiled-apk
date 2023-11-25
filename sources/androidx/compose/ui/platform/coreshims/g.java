package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.coreshims.g;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SoftwareKeyboardControllerCompat.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final c f2628a;

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    /* loaded from: classes.dex */
    private static class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private final View f2629a;

        a(View view) {
            this.f2629a = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // androidx.compose.ui.platform.coreshims.g.c
        void a() {
            View view = this.f2629a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f2629a.getWindowToken(), 0);
            }
        }

        @Override // androidx.compose.ui.platform.coreshims.g.c
        void b() {
            final View view = this.f2629a;
            if (view == null) {
                return;
            }
            if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                view = view.getRootView().findFocus();
            } else {
                view.requestFocus();
            }
            if (view == null) {
                view = this.f2629a.getRootView().findViewById(16908290);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new Runnable() { // from class: androidx.compose.ui.platform.coreshims.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.a.d(view);
                    }
                });
            }
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    /* loaded from: classes.dex */
    private static class b extends a {

        /* renamed from: b  reason: collision with root package name */
        private View f2630b;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsetsController f2631c;

        b(View view) {
            super(view);
            this.f2630b = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void f(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i10) {
            boolean z10;
            if ((i10 & 8) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            atomicBoolean.set(z10);
        }

        @Override // androidx.compose.ui.platform.coreshims.g.a, androidx.compose.ui.platform.coreshims.g.c
        void a() {
            int ime;
            View view;
            WindowInsetsController windowInsetsController = this.f2631c;
            if (windowInsetsController == null) {
                View view2 = this.f2630b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.compose.ui.platform.coreshims.n
                    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                        g.b.f(atomicBoolean, windowInsetsController2, i10);
                    }
                };
                windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                if (!atomicBoolean.get() && (view = this.f2630b) != null) {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f2630b.getWindowToken(), 0);
                }
                windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                ime = WindowInsets.Type.ime();
                windowInsetsController.hide(ime);
                return;
            }
            super.a();
        }

        @Override // androidx.compose.ui.platform.coreshims.g.a, androidx.compose.ui.platform.coreshims.g.c
        void b() {
            int ime;
            View view = this.f2630b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f2631c;
            if (windowInsetsController == null) {
                View view2 = this.f2630b;
                if (view2 != null) {
                    windowInsetsController = view2.getWindowInsetsController();
                } else {
                    windowInsetsController = null;
                }
            }
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
                return;
            }
            super.b();
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    /* loaded from: classes.dex */
    private static class c {
        c() {
        }

        void a() {
            throw null;
        }

        void b() {
            throw null;
        }
    }

    public g(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2628a = new b(view);
        } else {
            this.f2628a = new a(view);
        }
    }

    public void a() {
        this.f2628a.a();
    }

    public void b() {
        this.f2628a.b();
    }
}
