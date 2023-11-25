package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.l1;
import androidx.appcompat.widget.q0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends b0 implements n.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: f  reason: collision with root package name */
    i f1012f;

    /* renamed from: m  reason: collision with root package name */
    private CharSequence f1013m;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f1014p;

    /* renamed from: q  reason: collision with root package name */
    g.b f1015q;

    /* renamed from: r  reason: collision with root package name */
    private q0 f1016r;

    /* renamed from: s  reason: collision with root package name */
    b f1017s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1018t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1019u;

    /* renamed from: v  reason: collision with root package name */
    private int f1020v;

    /* renamed from: w  reason: collision with root package name */
    private int f1021w;

    /* renamed from: x  reason: collision with root package name */
    private int f1022x;

    /* loaded from: classes.dex */
    private class a extends q0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.q0
        public p b() {
            b bVar = ActionMenuItemView.this.f1017s;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.q0
        protected boolean c() {
            p b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f1015q;
            if (bVar == null || !bVar.a(actionMenuItemView.f1012f) || (b10 = b()) == null || !b10.b()) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480 && ((i10 < 640 || i11 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    private void g() {
        CharSequence charSequence;
        CharSequence title;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1013m);
        if (this.f1014p != null && (!this.f1012f.B() || (!this.f1018t && !this.f1019u))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence2 = null;
        if (z12) {
            charSequence = this.f1013m;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.f1012f.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z12) {
                title = null;
            } else {
                title = this.f1012f.getTitle();
            }
            setContentDescription(title);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1012f.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z12) {
                charSequence2 = this.f1012f.getTitle();
            }
            l1.a(this, charSequence2);
            return;
        }
        l1.a(this, tooltipText);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return c();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        if (c() && this.f1012f.getIcon() == null) {
            return true;
        }
        return false;
    }

    public boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(i iVar, int i10) {
        int i11;
        this.f1012f = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.i(this));
        setId(iVar.getItemId());
        if (iVar.isVisible()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setVisibility(i11);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f1016r == null) {
            this.f1016r = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f1012f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.f1015q;
        if (bVar != null) {
            bVar.a(this.f1012f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1018t = f();
        g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.b0, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean c10 = c();
        if (c10 && (i13 = this.f1021w) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(size, this.f1020v);
        } else {
            i12 = this.f1020v;
        }
        if (mode != 1073741824 && this.f1020v > 0 && measuredWidth < i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
        if (!c10 && this.f1014p != null) {
            super.setPadding((getMeasuredWidth() - this.f1014p.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        q0 q0Var;
        if (this.f1012f.hasSubMenu() && (q0Var = this.f1016r) != null && q0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f1019u != z10) {
            this.f1019u = z10;
            i iVar = this.f1012f;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1014p = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f1022x;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        g();
    }

    public void setItemInvoker(g.b bVar) {
        this.f1015q = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f1021w = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f1017s = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1013m = charSequence;
        g();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f1018t = f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f15939v, i10, 0);
        this.f1020v = obtainStyledAttributes.getDimensionPixelSize(g.j.f15944w, 0);
        obtainStyledAttributes.recycle();
        this.f1022x = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1021w = -1;
        setSaveEnabled(false);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }
}
