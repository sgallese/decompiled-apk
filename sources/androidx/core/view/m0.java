package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;

/* compiled from: SoftwareKeyboardControllerCompat.java */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private final c f4170a;

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    /* loaded from: classes.dex */
    private static class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private final View f4171a;

        a(View view) {
            this.f4171a = view;
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    /* loaded from: classes.dex */
    private static class c {
        c() {
        }
    }

    public m0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4170a = new b(view);
        } else {
            this.f4170a = new a(view);
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    /* loaded from: classes.dex */
    private static class b extends a {

        /* renamed from: b  reason: collision with root package name */
        private View f4172b;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsetsController f4173c;

        b(View view) {
            super(view);
            this.f4172b = view;
        }

        b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f4173c = windowInsetsController;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public m0(WindowInsetsController windowInsetsController) {
        this.f4170a = new b(windowInsetsController);
    }
}
