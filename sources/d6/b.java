package d6;

import a1.p1;
import a1.r1;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.b1;
import androidx.core.view.o2;
import pc.l;
import qc.q;

/* compiled from: SystemUiController.kt */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private final View f13123a;

    /* renamed from: b  reason: collision with root package name */
    private final Window f13124b;

    /* renamed from: c  reason: collision with root package name */
    private final o2 f13125c;

    public b(View view, Window window) {
        o2 o2Var;
        q.i(view, "view");
        this.f13123a = view;
        this.f13124b = window;
        if (window != null) {
            o2Var = b1.a(window, view);
        } else {
            o2Var = null;
        }
        this.f13125c = o2Var;
    }

    @Override // d6.d
    public void a(long j10, boolean z10, l<? super p1, p1> lVar) {
        q.i(lVar, "transformColorForLightContent");
        e(z10);
        Window window = this.f13124b;
        if (window != null) {
            if (z10) {
                o2 o2Var = this.f13125c;
                boolean z11 = false;
                if (o2Var != null && o2Var.b()) {
                    z11 = true;
                }
                if (!z11) {
                    j10 = lVar.invoke(p1.g(j10)).y();
                }
            }
            window.setStatusBarColor(r1.k(j10));
        }
    }

    @Override // d6.d
    public void b(long j10, boolean z10, boolean z11, l<? super p1, p1> lVar) {
        q.i(lVar, "transformColorForLightContent");
        d(z10);
        c(z11);
        Window window = this.f13124b;
        if (window != null) {
            if (z10) {
                o2 o2Var = this.f13125c;
                boolean z12 = false;
                if (o2Var != null && o2Var.a()) {
                    z12 = true;
                }
                if (!z12) {
                    j10 = lVar.invoke(p1.g(j10)).y();
                }
            }
            window.setNavigationBarColor(r1.k(j10));
        }
    }

    public void c(boolean z10) {
        Window window;
        if (Build.VERSION.SDK_INT >= 29 && (window = this.f13124b) != null) {
            window.setNavigationBarContrastEnforced(z10);
        }
    }

    public void d(boolean z10) {
        o2 o2Var = this.f13125c;
        if (o2Var != null) {
            o2Var.c(z10);
        }
    }

    public void e(boolean z10) {
        o2 o2Var = this.f13125c;
        if (o2Var != null) {
            o2Var.d(z10);
        }
    }
}
