package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.p0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.q;
import d7.a;
import p7.g;
import p7.h;
import v6.b;
import v6.d;
import v6.k;

/* loaded from: classes3.dex */
public class SearchBar extends Toolbar {

    /* renamed from: w0  reason: collision with root package name */
    private static final int f10255w0 = k.f24806p;

    /* renamed from: k0  reason: collision with root package name */
    private final TextView f10256k0;

    /* renamed from: l0  reason: collision with root package name */
    private final boolean f10257l0;

    /* renamed from: m0  reason: collision with root package name */
    private final boolean f10258m0;

    /* renamed from: n0  reason: collision with root package name */
    private final Drawable f10259n0;

    /* renamed from: o0  reason: collision with root package name */
    private final boolean f10260o0;

    /* renamed from: p0  reason: collision with root package name */
    private final boolean f10261p0;

    /* renamed from: q0  reason: collision with root package name */
    private View f10262q0;

    /* renamed from: r0  reason: collision with root package name */
    private Integer f10263r0;

    /* renamed from: s0  reason: collision with root package name */
    private Drawable f10264s0;

    /* renamed from: t0  reason: collision with root package name */
    private int f10265t0;

    /* renamed from: u0  reason: collision with root package name */
    private boolean f10266u0;

    /* renamed from: v0  reason: collision with root package name */
    private g f10267v0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: p  reason: collision with root package name */
        String f10268p;

        /* loaded from: classes3.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f10268p);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10268p = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private int S(int i10, int i11) {
        if (i10 == 0) {
            return i11;
        }
        return i10;
    }

    private void T() {
        View view = this.f10262q0;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i10 = measuredWidth2 + measuredWidth;
        int measuredHeight = this.f10262q0.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        U(this.f10262q0, measuredWidth2, measuredHeight2, i10, measuredHeight2 + measuredHeight);
    }

    private void U(View view, int i10, int i11, int i12, int i13) {
        if (p0.E(this) == 1) {
            view.layout(getMeasuredWidth() - i12, i11, getMeasuredWidth() - i10, i13);
        } else {
            view.layout(i10, i11, i12, i13);
        }
    }

    private Drawable V(Drawable drawable) {
        int i10;
        int d10;
        if (this.f10260o0 && drawable != null) {
            Integer num = this.f10263r0;
            if (num != null) {
                d10 = num.intValue();
            } else {
                if (drawable == this.f10259n0) {
                    i10 = b.f24644n;
                } else {
                    i10 = b.f24643m;
                }
                d10 = a.d(this, i10);
            }
            Drawable r10 = androidx.core.graphics.drawable.a.r(drawable.mutate());
            androidx.core.graphics.drawable.a.n(r10, d10);
            return r10;
        }
        return drawable;
    }

    private void W(int i10, int i11) {
        View view = this.f10262q0;
        if (view != null) {
            view.measure(i10, i11);
        }
    }

    private void X() {
        if (this.f10258m0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(d.f24694s);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(d.f24695t);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = S(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = S(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = S(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = S(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private void Y() {
        if (getLayoutParams() instanceof AppBarLayout.e) {
            AppBarLayout.e eVar = (AppBarLayout.e) getLayoutParams();
            if (this.f10266u0) {
                if (eVar.c() == 0) {
                    eVar.g(53);
                }
            } else if (eVar.c() == 53) {
                eVar.g(0);
            }
        }
    }

    private void setNavigationIconDecorative(boolean z10) {
        Drawable drawable;
        ImageButton c10 = q.c(this);
        if (c10 == null) {
            return;
        }
        c10.setClickable(!z10);
        c10.setFocusable(!z10);
        Drawable background = c10.getBackground();
        if (background != null) {
            this.f10264s0 = background;
        }
        if (z10) {
            drawable = null;
        } else {
            drawable = this.f10264s0;
        }
        c10.setBackgroundDrawable(drawable);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f10257l0 && this.f10262q0 == null && !(view instanceof ActionMenuView)) {
            this.f10262q0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i10, layoutParams);
    }

    public View getCenterView() {
        return this.f10262q0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getCompatElevation() {
        g gVar = this.f10267v0;
        if (gVar != null) {
            return gVar.w();
        }
        return p0.y(this);
    }

    public float getCornerSize() {
        return this.f10267v0.J();
    }

    public CharSequence getHint() {
        return this.f10256k0.getHint();
    }

    int getMenuResId() {
        return this.f10265t0;
    }

    public int getStrokeColor() {
        return this.f10267v0.F().getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.f10267v0.H();
    }

    public CharSequence getText() {
        return this.f10256k0.getText();
    }

    public TextView getTextView() {
        return this.f10256k0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.f10267v0);
        X();
        Y();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        T();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        W(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setText(savedState.f10268p);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        String charSequence;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        if (text == null) {
            charSequence = null;
        } else {
            charSequence = text.toString();
        }
        savedState.f10268p = charSequence;
        return savedState;
    }

    public void setCenterView(View view) {
        View view2 = this.f10262q0;
        if (view2 != null) {
            removeView(view2);
            this.f10262q0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f10266u0 = z10;
        Y();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        g gVar = this.f10267v0;
        if (gVar != null) {
            gVar.a0(f10);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.f10256k0.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(V(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        boolean z10;
        if (this.f10261p0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        if (onClickListener == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setNavigationIconDecorative(z10);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        throw null;
    }

    public void setStrokeColor(int i10) {
        if (getStrokeColor() != i10) {
            this.f10267v0.j0(ColorStateList.valueOf(i10));
        }
    }

    public void setStrokeWidth(float f10) {
        if (getStrokeWidth() != f10) {
            this.f10267v0.k0(f10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f10256k0.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void x(int i10) {
        super.x(i10);
        this.f10265t0 = i10;
    }

    /* loaded from: classes3.dex */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: h  reason: collision with root package name */
        private boolean f10269h;

        public ScrollingViewBehavior() {
            this.f10269h = false;
        }

        private void U(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            if (Build.VERSION.SDK_INT == 21) {
                appBarLayout.setOutlineProvider(null);
            } else {
                appBarLayout.setTargetElevation(0.0f);
            }
        }

        @Override // com.google.android.material.appbar.l
        protected boolean P() {
            return true;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean h10 = super.h(coordinatorLayout, view, view2);
            if (!this.f10269h && (view2 instanceof AppBarLayout)) {
                this.f10269h = true;
                U((AppBarLayout) view2);
            }
            return h10;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10269h = false;
        }
    }

    public void setHint(int i10) {
        this.f10256k0.setHint(i10);
    }

    public void setText(int i10) {
        this.f10256k0.setText(i10);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
