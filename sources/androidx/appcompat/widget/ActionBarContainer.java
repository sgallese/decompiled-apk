package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    private boolean f1210f;

    /* renamed from: m  reason: collision with root package name */
    private View f1211m;

    /* renamed from: p  reason: collision with root package name */
    private View f1212p;

    /* renamed from: q  reason: collision with root package name */
    private View f1213q;

    /* renamed from: r  reason: collision with root package name */
    Drawable f1214r;

    /* renamed from: s  reason: collision with root package name */
    Drawable f1215s;

    /* renamed from: t  reason: collision with root package name */
    Drawable f1216t;

    /* renamed from: u  reason: collision with root package name */
    boolean f1217u;

    /* renamed from: v  reason: collision with root package name */
    boolean f1218v;

    /* renamed from: w  reason: collision with root package name */
    private int f1219w;

    /* loaded from: classes.dex */
    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.p0.y0(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f15832a);
        this.f1214r = obtainStyledAttributes.getDrawable(g.j.f15838b);
        this.f1215s = obtainStyledAttributes.getDrawable(g.j.f15849d);
        this.f1219w = obtainStyledAttributes.getDimensionPixelSize(g.j.f15879j, -1);
        boolean z10 = true;
        if (getId() == g.f.H) {
            this.f1217u = true;
            this.f1216t = obtainStyledAttributes.getDrawable(g.j.f15844c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1217u ? this.f1214r != null || this.f1215s != null : this.f1216t != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        if (view != null && view.getVisibility() != 8 && view.getMeasuredHeight() != 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1214r;
        if (drawable != null && drawable.isStateful()) {
            this.f1214r.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1215s;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1215s.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1216t;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1216t.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1211m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1214r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1215s;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1216t;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1212p = findViewById(g.f.f15766a);
        this.f1213q = findViewById(g.f.f15771f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f1210f && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f1211m;
        boolean z12 = true;
        boolean z13 = false;
        if (view != null && view.getVisibility() != 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f1217u) {
            Drawable drawable2 = this.f1216t;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z12 = false;
            }
        } else {
            if (this.f1214r != null) {
                if (this.f1212p.getVisibility() == 0) {
                    this.f1214r.setBounds(this.f1212p.getLeft(), this.f1212p.getTop(), this.f1212p.getRight(), this.f1212p.getBottom());
                } else {
                    View view2 = this.f1213q;
                    if (view2 != null && view2.getVisibility() == 0) {
                        this.f1214r.setBounds(this.f1213q.getLeft(), this.f1213q.getTop(), this.f1213q.getRight(), this.f1213q.getBottom());
                    } else {
                        this.f1214r.setBounds(0, 0, 0, 0);
                    }
                }
                z13 = true;
            }
            this.f1218v = z11;
            if (z11 && (drawable = this.f1215s) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                z12 = z13;
            }
        }
        if (z12) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f1212p == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i14 = this.f1219w) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i14, View.MeasureSpec.getSize(i11)), RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i10, i11);
        if (this.f1212p == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f1211m;
        if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
            if (!b(this.f1212p)) {
                i12 = a(this.f1212p);
            } else if (!b(this.f1213q)) {
                i12 = a(this.f1213q);
            } else {
                i12 = 0;
            }
            if (mode == Integer.MIN_VALUE) {
                i13 = View.MeasureSpec.getSize(i11);
            } else {
                i13 = Integer.MAX_VALUE;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(i12 + a(this.f1211m), i13));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1214r;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1214r);
        }
        this.f1214r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1212p;
            if (view != null) {
                this.f1214r.setBounds(view.getLeft(), this.f1212p.getTop(), this.f1212p.getRight(), this.f1212p.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f1217u ? this.f1214r != null || this.f1215s != null : this.f1216t != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1216t;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1216t);
        }
        this.f1216t = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1217u && (drawable2 = this.f1216t) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1217u ? !(this.f1214r != null || this.f1215s != null) : this.f1216t == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1215s;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1215s);
        }
        this.f1215s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1218v && (drawable2 = this.f1215s) != null) {
                drawable2.setBounds(this.f1211m.getLeft(), this.f1211m.getTop(), this.f1211m.getRight(), this.f1211m.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f1217u ? this.f1214r != null || this.f1215s != null : this.f1216t != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(z0 z0Var) {
        View view = this.f1211m;
        if (view != null) {
            removeView(view);
        }
        this.f1211m = z0Var;
        if (z0Var != null) {
            addView(z0Var);
            ViewGroup.LayoutParams layoutParams = z0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            z0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        int i10;
        this.f1210f = z10;
        if (z10) {
            i10 = 393216;
        } else {
            i10 = 262144;
        }
        setDescendantFocusability(i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f1214r;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f1215s;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f1216t;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if ((drawable == this.f1214r && !this.f1217u) || ((drawable == this.f1215s && this.f1218v) || ((drawable == this.f1216t && this.f1217u) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
