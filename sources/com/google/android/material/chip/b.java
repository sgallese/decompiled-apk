package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.n0;
import com.google.android.material.internal.g;
import java.util.List;
import v6.k;

/* compiled from: ChipGroup.java */
/* loaded from: classes3.dex */
public class b extends g {

    /* renamed from: v  reason: collision with root package name */
    private static final int f9872v = k.f24813w;

    /* renamed from: r  reason: collision with root package name */
    private int f9873r;

    /* renamed from: s  reason: collision with root package name */
    private int f9874s;

    /* renamed from: t  reason: collision with root package name */
    private d f9875t;

    /* renamed from: u  reason: collision with root package name */
    private final int f9876u;

    /* compiled from: ChipGroup.java */
    /* loaded from: classes3.dex */
    class a implements d {
        a(c cVar) {
        }
    }

    /* compiled from: ChipGroup.java */
    /* renamed from: com.google.android.material.chip.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0235b extends ViewGroup.MarginLayoutParams {
        public C0235b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0235b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0235b(int i10, int i11) {
            super(i10, i11);
        }
    }

    /* compiled from: ChipGroup.java */
    @Deprecated
    /* loaded from: classes3.dex */
    public interface c {
    }

    /* compiled from: ChipGroup.java */
    /* loaded from: classes3.dex */
    public interface d {
    }

    /* compiled from: ChipGroup.java */
    /* loaded from: classes3.dex */
    private class e implements ViewGroup.OnHierarchyChangeListener {
        static /* synthetic */ ViewGroup.OnHierarchyChangeListener a(e eVar, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
            throw null;
        }
    }

    private boolean e(int i10) {
        if (getChildAt(i10).getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private int getVisibleChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof Chip) && e(i11)) {
                i10++;
            }
        }
        return i10;
    }

    @Override // com.google.android.material.internal.g
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0235b)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt instanceof Chip) && e(i11)) {
                if (((Chip) childAt) == view) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public boolean f() {
        throw null;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0235b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0235b(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        throw null;
    }

    public List<Integer> getCheckedChipIds() {
        throw null;
    }

    public int getChipSpacingHorizontal() {
        return this.f9873r;
    }

    public int getChipSpacingVertical() {
        return this.f9874s;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (this.f9876u == -1) {
            return;
        }
        throw null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        n0 e12 = n0.e1(accessibilityNodeInfo);
        if (c()) {
            i10 = getVisibleChipCount();
        } else {
            i10 = -1;
        }
        int rowCount = getRowCount();
        if (f()) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        e12.p0(n0.f.a(rowCount, i10, false, i11));
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f9873r != i10) {
            this.f9873r = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f9874s != i10) {
            this.f9874s = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new a(cVar));
        }
    }

    public void setOnCheckedStateChangeListener(d dVar) {
        this.f9875t = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        e.a(null, onHierarchyChangeListener);
    }

    public void setSelectionRequired(boolean z10) {
        throw null;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.g
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        throw null;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0235b(layoutParams);
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
