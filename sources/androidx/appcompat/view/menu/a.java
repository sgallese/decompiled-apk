package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ActionMenuItem.java */
/* loaded from: classes.dex */
public class a implements s2.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f1040a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1041b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1042c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f1043d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f1044e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f1045f;

    /* renamed from: g  reason: collision with root package name */
    private char f1046g;

    /* renamed from: i  reason: collision with root package name */
    private char f1048i;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f1050k;

    /* renamed from: l  reason: collision with root package name */
    private Context f1051l;

    /* renamed from: m  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f1052m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f1053n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f1054o;

    /* renamed from: h  reason: collision with root package name */
    private int f1047h = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: j  reason: collision with root package name */
    private int f1049j = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: p  reason: collision with root package name */
    private ColorStateList f1055p = null;

    /* renamed from: q  reason: collision with root package name */
    private PorterDuff.Mode f1056q = null;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1057r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1058s = false;

    /* renamed from: t  reason: collision with root package name */
    private int f1059t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f1051l = context;
        this.f1040a = i11;
        this.f1041b = i10;
        this.f1042c = i13;
        this.f1043d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f1050k;
        if (drawable != null) {
            if (this.f1057r || this.f1058s) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(drawable);
                this.f1050k = r10;
                Drawable mutate = r10.mutate();
                this.f1050k = mutate;
                if (this.f1057r) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f1055p);
                }
                if (this.f1058s) {
                    androidx.core.graphics.drawable.a.p(this.f1050k, this.f1056q);
                }
            }
        }
    }

    @Override // s2.b
    public s2.b a(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // s2.b
    public androidx.core.view.b b() {
        return null;
    }

    @Override // s2.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // s2.b, android.view.MenuItem
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public s2.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // s2.b, android.view.MenuItem
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public s2.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // s2.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // s2.b, android.view.MenuItem
    /* renamed from: f  reason: merged with bridge method [inline-methods] */
    public s2.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // s2.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // s2.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1049j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1048i;
    }

    @Override // s2.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1053n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1041b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1050k;
    }

    @Override // s2.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1055p;
    }

    @Override // s2.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1056q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1045f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1040a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // s2.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1047h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1046g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1042c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1043d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1044e;
        if (charSequence == null) {
            return this.f1043d;
        }
        return charSequence;
    }

    @Override // s2.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1054o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // s2.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        if ((this.f1059t & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        if ((this.f1059t & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        if ((this.f1059t & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        if ((this.f1059t & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f1048i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f1059t = (z10 ? 1 : 0) | (this.f1059t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        int i10;
        int i11 = this.f1059t & (-3);
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f1059t = i10 | i11;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        int i10;
        int i11 = this.f1059t & (-17);
        if (z10) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        this.f1059t = i10 | i11;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1050k = drawable;
        c();
        return this;
    }

    @Override // s2.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1055p = colorStateList;
        this.f1057r = true;
        c();
        return this;
    }

    @Override // s2.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1056q = mode;
        this.f1058s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1045f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f1046g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1052m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f1046g = c10;
        this.f1048i = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1043d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1044e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f1059t & 8;
        if (z10) {
            i10 = 0;
        }
        this.f1059t = i11 | i10;
        return this;
    }

    @Override // s2.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f1048i = Character.toLowerCase(c10);
        this.f1049j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public s2.b setContentDescription(CharSequence charSequence) {
        this.f1053n = charSequence;
        return this;
    }

    @Override // s2.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f1046g = c10;
        this.f1047h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f1043d = this.f1051l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public s2.b setTooltipText(CharSequence charSequence) {
        this.f1054o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f1050k = androidx.core.content.a.e(this.f1051l, i10);
        c();
        return this;
    }

    @Override // s2.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1046g = c10;
        this.f1047h = KeyEvent.normalizeMetaState(i10);
        this.f1048i = Character.toLowerCase(c11);
        this.f1049j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // s2.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }
}
