package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

/* compiled from: SupportActionModeWrapper.java */
/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f961a;

    /* renamed from: b  reason: collision with root package name */
    final b f962b;

    /* compiled from: SupportActionModeWrapper.java */
    /* loaded from: classes.dex */
    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f963a;

        /* renamed from: b  reason: collision with root package name */
        final Context f964b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f> f965c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        final androidx.collection.g<Menu, Menu> f966d = new androidx.collection.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f964b = context;
            this.f963a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f966d.get(menu);
            if (menu2 == null) {
                o oVar = new o(this.f964b, (s2.a) menu);
                this.f966d.put(menu, oVar);
                return oVar;
            }
            return menu2;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f963a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f963a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f963a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, MenuItem menuItem) {
            return this.f963a.onActionItemClicked(e(bVar), new j(this.f964b, (s2.b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f965c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f965c.get(i10);
                if (fVar != null && fVar.f962b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f964b, bVar);
            this.f965c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f961a = context;
        this.f962b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f962b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f962b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.f961a, (s2.a) this.f962b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f962b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f962b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f962b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f962b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f962b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f962b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f962b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f962b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f962b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f962b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f962b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f962b.s(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f962b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f962b.q(i10);
    }
}
