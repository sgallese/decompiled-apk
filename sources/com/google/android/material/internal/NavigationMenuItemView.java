package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.l1;
import androidx.appcompat.widget.r0;
import androidx.core.view.accessibility.n0;
import androidx.core.view.p0;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class NavigationMenuItemView extends h implements n.a {
    private static final int[] S = {16842912};
    private int I;
    private boolean J;
    boolean K;
    private final CheckedTextView L;
    private FrameLayout M;
    private androidx.appcompat.view.menu.i N;
    private ColorStateList O;
    private boolean P;
    private Drawable Q;
    private final androidx.core.view.a R;

    /* loaded from: classes3.dex */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, n0 n0Var) {
            super.g(view, n0Var);
            n0Var.l0(NavigationMenuItemView.this.K);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        if (D()) {
            this.L.setVisibility(8);
            FrameLayout frameLayout = this.M;
            if (frameLayout != null) {
                r0.a aVar = (r0.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.M.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.L.setVisibility(0);
        FrameLayout frameLayout2 = this.M;
        if (frameLayout2 != null) {
            r0.a aVar2 = (r0.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.M.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(g.a.f15712w, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(S, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    private boolean D() {
        if (this.N.getTitle() == null && this.N.getIcon() == null && this.N.getActionView() != null) {
            return true;
        }
        return false;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.M == null) {
                this.M = (FrameLayout) ((ViewStub) findViewById(v6.f.f24718g)).inflate();
            }
            this.M.removeAllViews();
            this.M.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(androidx.appcompat.view.menu.i iVar, int i10) {
        int i11;
        this.N = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        if (iVar.isVisible()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setVisibility(i11);
        if (getBackground() == null) {
            p0.y0(this, C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        l1.a(this, iVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public androidx.appcompat.view.menu.i getItemData() {
        return this.N;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.i iVar = this.N;
        if (iVar != null && iVar.isCheckable() && this.N.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, S);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.K != z10) {
            this.K = z10;
            this.R.l(this.L, RecyclerView.m.FLAG_MOVED);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.L.setChecked(z10);
        CheckedTextView checkedTextView = this.L;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z10 ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.P) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                androidx.core.graphics.drawable.a.o(drawable, this.O);
            }
            int i10 = this.I;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.J) {
            if (this.Q == null) {
                Drawable e10 = androidx.core.content.res.h.e(getResources(), v6.e.f24711j, getContext().getTheme());
                this.Q = e10;
                if (e10 != null) {
                    int i11 = this.I;
                    e10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.Q;
        }
        androidx.core.widget.j.j(this.L, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.L.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.I = i10;
    }

    void setIconTintList(ColorStateList colorStateList) {
        boolean z10;
        this.O = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.P = z10;
        androidx.appcompat.view.menu.i iVar = this.N;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.L.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.J = z10;
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.j.o(this.L, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.L.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.L.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a();
        this.R = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(v6.h.f24745e, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(v6.d.f24671e));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(v6.f.f24719h);
        this.L = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        p0.u0(checkedTextView, aVar);
    }
}
