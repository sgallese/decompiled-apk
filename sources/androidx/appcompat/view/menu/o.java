package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: MenuWrapperICS.java */
/* loaded from: classes.dex */
public class o extends c implements Menu {

    /* renamed from: d  reason: collision with root package name */
    private final s2.a f1194d;

    public o(Context context, s2.a aVar) {
        super(context);
        if (aVar != null) {
            this.f1194d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return c(this.f1194d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f1194d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = c(menuItemArr2[i14]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f1194d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        e();
        this.f1194d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f1194d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        return c(this.f1194d.findItem(i10));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return c(this.f1194d.getItem(i10));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f1194d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f1194d.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return this.f1194d.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f1194d.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        f(i10);
        this.f1194d.removeGroup(i10);
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        g(i10);
        this.f1194d.removeItem(i10);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f1194d.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        this.f1194d.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        this.f1194d.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f1194d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1194d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return c(this.f1194d.add(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return d(this.f1194d.addSubMenu(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return c(this.f1194d.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return d(this.f1194d.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return c(this.f1194d.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return d(this.f1194d.addSubMenu(i10, i11, i12, i13));
    }
}
