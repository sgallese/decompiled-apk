package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;

/* compiled from: DecorToolbar.java */
/* loaded from: classes.dex */
public interface i0 {
    void A(Drawable drawable);

    void B(boolean z10);

    void a(Drawable drawable);

    void b(Menu menu, m.a aVar);

    boolean c();

    void collapseActionView();

    void d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i();

    void j(z0 z0Var);

    boolean k();

    void l(int i10);

    void m(CharSequence charSequence);

    Menu n();

    void o(int i10);

    int p();

    androidx.core.view.x0 q(int i10, long j10);

    void r(int i10);

    void s(m.a aVar, g.a aVar2);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(int i10);

    ViewGroup u();

    void v(boolean z10);

    int w();

    void x(int i10);

    void y();

    void z();
}
