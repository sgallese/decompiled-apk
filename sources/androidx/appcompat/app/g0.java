package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.app.h;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.k1;
import androidx.core.view.p0;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ToolbarActionBar.java */
/* loaded from: classes.dex */
public class g0 extends androidx.appcompat.app.a {

    /* renamed from: a  reason: collision with root package name */
    final androidx.appcompat.widget.i0 f798a;

    /* renamed from: b  reason: collision with root package name */
    final Window.Callback f799b;

    /* renamed from: c  reason: collision with root package name */
    final h.g f800c;

    /* renamed from: d  reason: collision with root package name */
    boolean f801d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f802e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f803f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<a.b> f804g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f805h = new a();

    /* renamed from: i  reason: collision with root package name */
    private final Toolbar.h f806i;

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.I();
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return g0.this.f799b.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class c implements m.a {

        /* renamed from: f  reason: collision with root package name */
        private boolean f809f;

        c() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
            if (this.f809f) {
                return;
            }
            this.f809f = true;
            g0.this.f798a.i();
            g0.this.f799b.onPanelClosed(108, gVar);
            this.f809f = false;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            g0.this.f799b.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (g0.this.f798a.c()) {
                g0.this.f799b.onPanelClosed(108, gVar);
            } else if (g0.this.f799b.onPreparePanel(0, null, gVar)) {
                g0.this.f799b.onMenuOpened(108, gVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    private class e implements h.g {
        e() {
        }

        @Override // androidx.appcompat.app.h.g
        public boolean a(int i10) {
            if (i10 == 0) {
                g0 g0Var = g0.this;
                if (!g0Var.f801d) {
                    g0Var.f798a.d();
                    g0.this.f801d = true;
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // androidx.appcompat.app.h.g
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(g0.this.f798a.getContext());
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f806i = bVar;
        androidx.core.util.i.g(toolbar);
        k1 k1Var = new k1(toolbar, false);
        this.f798a = k1Var;
        this.f799b = (Window.Callback) androidx.core.util.i.g(callback);
        k1Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        k1Var.setWindowTitle(charSequence);
        this.f800c = new e();
    }

    private Menu H() {
        if (!this.f802e) {
            this.f798a.s(new c(), new d());
            this.f802e = true;
        }
        return this.f798a.n();
    }

    @Override // androidx.appcompat.app.a
    public void A(Drawable drawable) {
        this.f798a.A(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void D(CharSequence charSequence) {
        this.f798a.m(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void E(CharSequence charSequence) {
        this.f798a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void F(CharSequence charSequence) {
        this.f798a.setWindowTitle(charSequence);
    }

    void I() {
        androidx.appcompat.view.menu.g gVar;
        Menu H = H();
        if (H instanceof androidx.appcompat.view.menu.g) {
            gVar = (androidx.appcompat.view.menu.g) H;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            gVar.d0();
        }
        try {
            H.clear();
            if (!this.f799b.onCreatePanelMenu(0, H) || !this.f799b.onPreparePanel(0, null, H)) {
                H.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.c0();
            }
        }
    }

    public void J(int i10, int i11) {
        this.f798a.l((i10 & i11) | ((~i11) & this.f798a.w()));
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        return this.f798a.g();
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        if (this.f798a.k()) {
            this.f798a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f803f) {
            return;
        }
        this.f803f = z10;
        int size = this.f804g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f804g.get(i10).a(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f798a.w();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        return this.f798a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public void k() {
        this.f798a.t(8);
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        this.f798a.u().removeCallbacks(this.f805h);
        p0.m0(this.f798a.u(), this.f805h);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.a
    public void n() {
        this.f798a.u().removeCallbacks(this.f805h);
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        int i11;
        Menu H = H();
        if (H == null) {
            return false;
        }
        if (keyEvent != null) {
            i11 = keyEvent.getDeviceId();
        } else {
            i11 = -1;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(i11).getKeyboardType() == 1) {
            z10 = false;
        }
        H.setQwertyMode(z10);
        return H.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean q() {
        return this.f798a.h();
    }

    @Override // androidx.appcompat.app.a
    public void r(Drawable drawable) {
        this.f798a.a(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
        int i10;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        J(i10, 4);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        J(i10, 2);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z10) {
        int i10;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        J(i10, 8);
    }

    @Override // androidx.appcompat.app.a
    public void w(boolean z10) {
        J(z10 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.a
    public void x(float f10) {
        p0.C0(this.f798a.u(), f10);
    }

    @Override // androidx.appcompat.app.a
    public void y(int i10) {
        this.f798a.x(i10);
    }

    @Override // androidx.appcompat.app.a
    public void z(int i10) {
        this.f798a.r(i10);
    }

    @Override // androidx.appcompat.app.a
    public void B(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void C(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z10) {
    }
}
