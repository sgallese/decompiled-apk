package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.g;

/* compiled from: PopupMenu.java */
/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1689a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.appcompat.view.menu.g f1690b;

    /* renamed from: c  reason: collision with root package name */
    private final View f1691c;

    /* renamed from: d  reason: collision with root package name */
    final androidx.appcompat.view.menu.l f1692d;

    /* renamed from: e  reason: collision with root package name */
    c f1693e;

    /* compiled from: PopupMenu.java */
    /* loaded from: classes.dex */
    class b implements PopupWindow.OnDismissListener {
        b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            v0.this.getClass();
        }
    }

    /* compiled from: PopupMenu.java */
    /* loaded from: classes.dex */
    public interface c {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public v0(Context context, View view) {
        this(context, view, 0);
    }

    public Menu a() {
        return this.f1690b;
    }

    public MenuInflater b() {
        return new androidx.appcompat.view.g(this.f1689a);
    }

    public void c(c cVar) {
        this.f1693e = cVar;
    }

    public void d() {
        this.f1692d.k();
    }

    public v0(Context context, View view, int i10) {
        this(context, view, i10, g.a.I, 0);
    }

    public v0(Context context, View view, int i10, int i11, int i12) {
        this.f1689a = context;
        this.f1691c = view;
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        this.f1690b = gVar;
        gVar.R(new a());
        androidx.appcompat.view.menu.l lVar = new androidx.appcompat.view.menu.l(context, gVar, view, false, i11, i12);
        this.f1692d = lVar;
        lVar.h(i10);
        lVar.i(new b());
    }

    /* compiled from: PopupMenu.java */
    /* loaded from: classes.dex */
    class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            c cVar = v0.this.f1693e;
            if (cVar != null) {
                return cVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
        }
    }
}
