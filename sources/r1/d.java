package r1;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import dc.w;
import qc.q;
import z0.h;

/* compiled from: TextActionModeCallback.android.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final pc.a<w> f22064a;

    /* renamed from: b  reason: collision with root package name */
    private h f22065b;

    /* renamed from: c  reason: collision with root package name */
    private pc.a<w> f22066c;

    /* renamed from: d  reason: collision with root package name */
    private pc.a<w> f22067d;

    /* renamed from: e  reason: collision with root package name */
    private pc.a<w> f22068e;

    /* renamed from: f  reason: collision with root package name */
    private pc.a<w> f22069f;

    public d(pc.a<w> aVar, h hVar, pc.a<w> aVar2, pc.a<w> aVar3, pc.a<w> aVar4, pc.a<w> aVar5) {
        q.i(hVar, "rect");
        this.f22064a = aVar;
        this.f22065b = hVar;
        this.f22066c = aVar2;
        this.f22067d = aVar3;
        this.f22068e = aVar4;
        this.f22069f = aVar5;
    }

    private final void b(Menu menu, b bVar, pc.a<w> aVar) {
        if (aVar != null && menu.findItem(bVar.getId()) == null) {
            a(menu, bVar);
        } else if (aVar == null && menu.findItem(bVar.getId()) != null) {
            menu.removeItem(bVar.getId());
        }
    }

    public final void a(Menu menu, b bVar) {
        q.i(menu, "menu");
        q.i(bVar, "item");
        menu.add(0, bVar.getId(), bVar.getOrder(), bVar.getTitleResource()).setShowAsAction(1);
    }

    public final h c() {
        return this.f22065b;
    }

    public final boolean d(ActionMode actionMode, MenuItem menuItem) {
        q.f(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == b.Copy.getId()) {
            pc.a<w> aVar = this.f22066c;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == b.Paste.getId()) {
            pc.a<w> aVar2 = this.f22067d;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == b.Cut.getId()) {
            pc.a<w> aVar3 = this.f22068e;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId == b.SelectAll.getId()) {
            pc.a<w> aVar4 = this.f22069f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        } else {
            return false;
        }
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        return true;
    }

    public final boolean e(ActionMode actionMode, Menu menu) {
        if (menu != null) {
            if (actionMode != null) {
                if (this.f22066c != null) {
                    a(menu, b.Copy);
                }
                if (this.f22067d != null) {
                    a(menu, b.Paste);
                }
                if (this.f22068e != null) {
                    a(menu, b.Cut);
                }
                if (this.f22069f != null) {
                    a(menu, b.SelectAll);
                    return true;
                }
                return true;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void f() {
        pc.a<w> aVar = this.f22064a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final boolean g(ActionMode actionMode, Menu menu) {
        if (actionMode != null && menu != null) {
            m(menu);
            return true;
        }
        return false;
    }

    public final void h(pc.a<w> aVar) {
        this.f22066c = aVar;
    }

    public final void i(pc.a<w> aVar) {
        this.f22068e = aVar;
    }

    public final void j(pc.a<w> aVar) {
        this.f22067d = aVar;
    }

    public final void k(pc.a<w> aVar) {
        this.f22069f = aVar;
    }

    public final void l(h hVar) {
        q.i(hVar, "<set-?>");
        this.f22065b = hVar;
    }

    public final void m(Menu menu) {
        q.i(menu, "menu");
        b(menu, b.Copy, this.f22066c);
        b(menu, b.Paste, this.f22067d);
        b(menu, b.Cut, this.f22068e);
        b(menu, b.SelectAll, this.f22069f);
    }

    public /* synthetic */ d(pc.a aVar, h hVar, pc.a aVar2, pc.a aVar3, pc.a aVar4, pc.a aVar5, int i10, qc.h hVar2) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? h.f26359e.a() : hVar, (i10 & 4) != 0 ? null : aVar2, (i10 & 8) != 0 ? null : aVar3, (i10 & 16) != 0 ? null : aVar4, (i10 & 32) != 0 ? null : aVar5);
    }
}
