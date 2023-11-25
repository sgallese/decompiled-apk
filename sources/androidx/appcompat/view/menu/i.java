package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: MenuItemImpl.java */
/* loaded from: classes.dex */
public final class i implements s2.b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a  reason: collision with root package name */
    private final int f1142a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1143b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1144c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1145d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f1146e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f1147f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f1148g;

    /* renamed from: h  reason: collision with root package name */
    private char f1149h;

    /* renamed from: j  reason: collision with root package name */
    private char f1151j;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f1153l;

    /* renamed from: n  reason: collision with root package name */
    g f1155n;

    /* renamed from: o  reason: collision with root package name */
    private r f1156o;

    /* renamed from: p  reason: collision with root package name */
    private Runnable f1157p;

    /* renamed from: q  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f1158q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f1159r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f1160s;

    /* renamed from: z  reason: collision with root package name */
    private int f1167z;

    /* renamed from: i  reason: collision with root package name */
    private int f1150i = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: k  reason: collision with root package name */
    private int f1152k = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: m  reason: collision with root package name */
    private int f1154m = 0;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f1161t = null;

    /* renamed from: u  reason: collision with root package name */
    private PorterDuff.Mode f1162u = null;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1163v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1164w = false;

    /* renamed from: x  reason: collision with root package name */
    private boolean f1165x = false;

    /* renamed from: y  reason: collision with root package name */
    private int f1166y = 16;
    private boolean D = false;

    /* compiled from: MenuItemImpl.java */
    /* loaded from: classes.dex */
    class a implements b.InterfaceC0080b {
        a() {
        }

        @Override // androidx.core.view.b.InterfaceC0080b
        public void onActionProviderVisibilityChanged(boolean z10) {
            i iVar = i.this;
            iVar.f1155n.J(iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(g gVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f1155n = gVar;
        this.f1142a = i11;
        this.f1143b = i10;
        this.f1144c = i12;
        this.f1145d = i13;
        this.f1146e = charSequence;
        this.f1167z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f1165x && (this.f1163v || this.f1164w)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (this.f1163v) {
                androidx.core.graphics.drawable.a.o(drawable, this.f1161t);
            }
            if (this.f1164w) {
                androidx.core.graphics.drawable.a.p(drawable, this.f1162u);
            }
            this.f1165x = false;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        if (this.f1155n.H() && g() != 0) {
            return true;
        }
        return false;
    }

    public boolean B() {
        if ((this.f1167z & 4) == 4) {
            return true;
        }
        return false;
    }

    @Override // s2.b
    public s2.b a(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f1155n.K(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    @Override // s2.b
    public androidx.core.view.b b() {
        return this.B;
    }

    public void c() {
        this.f1155n.I(this);
    }

    @Override // s2.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1167z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f1155n.f(this);
    }

    @Override // s2.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f1155n.k(this);
    }

    public int f() {
        return this.f1145d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public char g() {
        if (this.f1155n.G()) {
            return this.f1151j;
        }
        return this.f1149h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // s2.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar != null) {
            View d10 = bVar.d(this);
            this.A = d10;
            return d10;
        }
        return null;
    }

    @Override // s2.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1152k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1151j;
    }

    @Override // s2.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1159r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1143b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1153l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f1154m != 0) {
            Drawable b10 = h.a.b(this.f1155n.u(), this.f1154m);
            this.f1154m = 0;
            this.f1153l = b10;
            return e(b10);
        }
        return null;
    }

    @Override // s2.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1161t;
    }

    @Override // s2.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1162u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1148g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1142a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // s2.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1150i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1149h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1144c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1156o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1146e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1147f;
        if (charSequence == null) {
            return this.f1146e;
        }
        return charSequence;
    }

    @Override // s2.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1160s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String h() {
        int i10;
        char g10 = g();
        if (g10 == 0) {
            return "";
        }
        Resources resources = this.f1155n.u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f1155n.u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(g.h.f15824m));
        }
        if (this.f1155n.G()) {
            i10 = this.f1152k;
        } else {
            i10 = this.f1150i;
        }
        d(sb2, i10, 65536, resources.getString(g.h.f15820i));
        d(sb2, i10, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, resources.getString(g.h.f15816e));
        d(sb2, i10, 2, resources.getString(g.h.f15815d));
        d(sb2, i10, 1, resources.getString(g.h.f15821j));
        d(sb2, i10, 4, resources.getString(g.h.f15823l));
        d(sb2, i10, 8, resources.getString(g.h.f15819h));
        if (g10 != '\b') {
            if (g10 != '\n') {
                if (g10 != ' ') {
                    sb2.append(g10);
                } else {
                    sb2.append(resources.getString(g.h.f15822k));
                }
            } else {
                sb2.append(resources.getString(g.h.f15818g));
            }
        } else {
            sb2.append(resources.getString(g.h.f15817f));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        if (this.f1156o != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence i(n.a aVar) {
        if (aVar != null && aVar.d()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // s2.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        if ((this.f1166y & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        if ((this.f1166y & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        if ((this.f1166y & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        if (bVar != null && bVar.g()) {
            if ((this.f1166y & 8) == 0 && this.B.b()) {
                return true;
            }
            return false;
        } else if ((this.f1166y & 8) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f1167z & 8) == 0) {
            return false;
        }
        if (this.A == null && (bVar = this.B) != null) {
            this.A = bVar.d(this);
        }
        if (this.A == null) {
            return false;
        }
        return true;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1158q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.f1155n;
        if (gVar.h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f1157p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1148g != null) {
            try {
                this.f1155n.u().startActivity(this.f1148g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        androidx.core.view.b bVar = this.B;
        if (bVar != null && bVar.e()) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if ((this.f1166y & 32) == 32) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if ((this.f1166y & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if ((this.f1167z & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if ((this.f1167z & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // s2.b, android.view.MenuItem
    /* renamed from: p  reason: merged with bridge method [inline-methods] */
    public s2.b setActionView(int i10) {
        Context u10 = this.f1155n.u();
        setActionView(LayoutInflater.from(u10).inflate(i10, (ViewGroup) new LinearLayout(u10), false));
        return this;
    }

    @Override // s2.b, android.view.MenuItem
    /* renamed from: q  reason: merged with bridge method [inline-methods] */
    public s2.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f1142a) > 0) {
            view.setId(i10);
        }
        this.f1155n.I(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f1155n.K(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(boolean z10) {
        int i10;
        int i11 = this.f1166y;
        int i12 = i11 & (-3);
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i13 = i10 | i12;
        this.f1166y = i13;
        if (i11 != i13) {
            this.f1155n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f1151j == c10) {
            return this;
        }
        this.f1151j = Character.toLowerCase(c10);
        this.f1155n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f1166y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f1166y = i11;
        if (i10 != i11) {
            this.f1155n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f1166y & 4) != 0) {
            this.f1155n.T(this);
        } else {
            s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f1166y |= 16;
        } else {
            this.f1166y &= -17;
        }
        this.f1155n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1154m = 0;
        this.f1153l = drawable;
        this.f1165x = true;
        this.f1155n.K(false);
        return this;
    }

    @Override // s2.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1161t = colorStateList;
        this.f1163v = true;
        this.f1165x = true;
        this.f1155n.K(false);
        return this;
    }

    @Override // s2.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1162u = mode;
        this.f1164w = true;
        this.f1165x = true;
        this.f1155n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1148g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f1149h == c10) {
            return this;
        }
        this.f1149h = c10;
        this.f1155n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1158q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f1149h = c10;
        this.f1151j = Character.toLowerCase(c11);
        this.f1155n.K(false);
        return this;
    }

    @Override // s2.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1167z = i10;
        this.f1155n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1146e = charSequence;
        this.f1155n.K(false);
        r rVar = this.f1156o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1147f = charSequence;
        this.f1155n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f1155n.J(this);
        }
        return this;
    }

    public void t(boolean z10) {
        int i10;
        int i11 = this.f1166y & (-5);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        this.f1166y = i10 | i11;
    }

    public String toString() {
        CharSequence charSequence = this.f1146e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f1166y |= 32;
        } else {
            this.f1166y &= -33;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // s2.b, android.view.MenuItem
    /* renamed from: w  reason: merged with bridge method [inline-methods] */
    public s2.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(r rVar) {
        this.f1156o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y(boolean z10) {
        int i10;
        int i11 = this.f1166y;
        int i12 = i11 & (-9);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f1166y = i13;
        if (i11 == i13) {
            return false;
        }
        return true;
    }

    public boolean z() {
        return this.f1155n.A();
    }

    @Override // android.view.MenuItem
    public s2.b setContentDescription(CharSequence charSequence) {
        this.f1159r = charSequence;
        this.f1155n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public s2.b setTooltipText(CharSequence charSequence) {
        this.f1160s = charSequence;
        this.f1155n.K(false);
        return this;
    }

    @Override // s2.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f1151j == c10 && this.f1152k == i10) {
            return this;
        }
        this.f1151j = Character.toLowerCase(c10);
        this.f1152k = KeyEvent.normalizeMetaState(i10);
        this.f1155n.K(false);
        return this;
    }

    @Override // s2.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f1149h == c10 && this.f1150i == i10) {
            return this;
        }
        this.f1149h = c10;
        this.f1150i = KeyEvent.normalizeMetaState(i10);
        this.f1155n.K(false);
        return this;
    }

    @Override // s2.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1149h = c10;
        this.f1150i = KeyEvent.normalizeMetaState(i10);
        this.f1151j = Character.toLowerCase(c11);
        this.f1152k = KeyEvent.normalizeMetaState(i11);
        this.f1155n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f1153l = null;
        this.f1154m = i10;
        this.f1165x = true;
        this.f1155n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f1155n.u().getString(i10));
    }
}
