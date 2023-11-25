package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseMenuWrapper.java */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    final Context f1070a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.collection.g<s2.b, MenuItem> f1071b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.collection.g<s2.c, SubMenu> f1072c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        this.f1070a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof s2.b) {
            s2.b bVar = (s2.b) menuItem;
            if (this.f1071b == null) {
                this.f1071b = new androidx.collection.g<>();
            }
            MenuItem menuItem2 = this.f1071b.get(bVar);
            if (menuItem2 == null) {
                j jVar = new j(this.f1070a, bVar);
                this.f1071b.put(bVar, jVar);
                return jVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof s2.c) {
            s2.c cVar = (s2.c) subMenu;
            if (this.f1072c == null) {
                this.f1072c = new androidx.collection.g<>();
            }
            SubMenu subMenu2 = this.f1072c.get(cVar);
            if (subMenu2 == null) {
                s sVar = new s(this.f1070a, cVar);
                this.f1072c.put(cVar, sVar);
                return sVar;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        androidx.collection.g<s2.b, MenuItem> gVar = this.f1071b;
        if (gVar != null) {
            gVar.clear();
        }
        androidx.collection.g<s2.c, SubMenu> gVar2 = this.f1072c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i10) {
        if (this.f1071b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f1071b.size()) {
            if (this.f1071b.j(i11).getGroupId() == i10) {
                this.f1071b.l(i11);
                i11--;
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i10) {
        if (this.f1071b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f1071b.size(); i11++) {
            if (this.f1071b.j(i11).getItemId() == i10) {
                this.f1071b.l(i11);
                return;
            }
        }
    }
}
