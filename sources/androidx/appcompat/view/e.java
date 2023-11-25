package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode.java */
/* loaded from: classes.dex */
public class e extends b implements g.a {

    /* renamed from: p  reason: collision with root package name */
    private Context f954p;

    /* renamed from: q  reason: collision with root package name */
    private ActionBarContextView f955q;

    /* renamed from: r  reason: collision with root package name */
    private b.a f956r;

    /* renamed from: s  reason: collision with root package name */
    private WeakReference<View> f957s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f958t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f959u;

    /* renamed from: v  reason: collision with root package name */
    private androidx.appcompat.view.menu.g f960v;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f954p = context;
        this.f955q = actionBarContextView;
        this.f956r = aVar;
        androidx.appcompat.view.menu.g S = new androidx.appcompat.view.menu.g(actionBarContextView.getContext()).S(1);
        this.f960v = S;
        S.R(this);
        this.f959u = z10;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        return this.f956r.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        k();
        this.f955q.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f958t) {
            return;
        }
        this.f958t = true;
        this.f956r.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference<View> weakReference = this.f957s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f960v;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f955q.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f955q.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f955q.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f956r.c(this, this.f960v);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f955q.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        WeakReference<View> weakReference;
        this.f955q.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.f957s = weakReference;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i10) {
        o(this.f954p.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f955q.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i10) {
        r(this.f954p.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f955q.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z10) {
        super.s(z10);
        this.f955q.setTitleOptional(z10);
    }
}
