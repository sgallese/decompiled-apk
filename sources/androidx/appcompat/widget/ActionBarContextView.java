package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {
    private LinearLayout A;
    private TextView B;
    private TextView C;
    private int D;
    private int E;
    private boolean F;
    private int G;

    /* renamed from: v  reason: collision with root package name */
    private CharSequence f1220v;

    /* renamed from: w  reason: collision with root package name */
    private CharSequence f1221w;

    /* renamed from: x  reason: collision with root package name */
    private View f1222x;

    /* renamed from: y  reason: collision with root package name */
    private View f1223y;

    /* renamed from: z  reason: collision with root package name */
    private View f1224z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f1225f;

        a(androidx.appcompat.view.b bVar) {
            this.f1225f = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1225f.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        int i10;
        if (this.A == null) {
            LayoutInflater.from(getContext()).inflate(g.g.f15792a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.A = linearLayout;
            this.B = (TextView) linearLayout.findViewById(g.f.f15770e);
            this.C = (TextView) this.A.findViewById(g.f.f15769d);
            if (this.D != 0) {
                this.B.setTextAppearance(getContext(), this.D);
            }
            if (this.E != 0) {
                this.C.setTextAppearance(getContext(), this.E);
            }
        }
        this.B.setText(this.f1220v);
        this.C.setText(this.f1221w);
        boolean z10 = !TextUtils.isEmpty(this.f1220v);
        boolean z11 = !TextUtils.isEmpty(this.f1221w);
        TextView textView = this.C;
        int i11 = 0;
        if (z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        LinearLayout linearLayout2 = this.A;
        if (!z10 && !z11) {
            i11 = 8;
        }
        linearLayout2.setVisibility(i11);
        if (this.A.getParent() == null) {
            addView(this.A);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ androidx.core.view.x0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f1222x == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1221w;
    }

    public CharSequence getTitle() {
        return this.f1220v;
    }

    public void h(androidx.appcompat.view.b bVar) {
        View view = this.f1222x;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.G, (ViewGroup) this, false);
            this.f1222x = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1222x);
        }
        View findViewById = this.f1222x.findViewById(g.f.f15774i);
        this.f1223y = findViewById;
        findViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) bVar.e();
        c cVar = this.f1414q;
        if (cVar != null) {
            cVar.y();
        }
        c cVar2 = new c(getContext());
        this.f1414q = cVar2;
        cVar2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.c(this.f1414q, this.f1412m);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1414q.o(this);
        this.f1413p = actionMenuView;
        androidx.core.view.p0.y0(actionMenuView, null);
        addView(this.f1413p, layoutParams);
    }

    public boolean j() {
        return this.F;
    }

    public void k() {
        removeAllViews();
        this.f1224z = null;
        this.f1413p = null;
        this.f1414q = null;
        View view = this.f1223y;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        c cVar = this.f1414q;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1414q;
        if (cVar != null) {
            cVar.B();
            this.f1414q.C();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int paddingRight;
        int i14;
        int i15;
        boolean b10 = r1.b(this);
        if (b10) {
            paddingLeft = (i12 - i10) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1222x;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1222x.getLayoutParams();
            if (b10) {
                i14 = marginLayoutParams.rightMargin;
            } else {
                i14 = marginLayoutParams.leftMargin;
            }
            if (b10) {
                i15 = marginLayoutParams.leftMargin;
            } else {
                i15 = marginLayoutParams.rightMargin;
            }
            int d10 = androidx.appcompat.widget.a.d(paddingLeft, i14, b10);
            paddingLeft = androidx.appcompat.widget.a.d(d10 + e(this.f1222x, d10, paddingTop, paddingTop2, b10), i15, b10);
        }
        int i16 = paddingLeft;
        LinearLayout linearLayout = this.A;
        if (linearLayout != null && this.f1224z == null && linearLayout.getVisibility() != 8) {
            i16 += e(this.A, i16, paddingTop, paddingTop2, b10);
        }
        int i17 = i16;
        View view2 = this.f1224z;
        if (view2 != null) {
            e(view2, i17, paddingTop, paddingTop2, b10);
        }
        if (b10) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i12 - i10) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f1413p;
        if (actionMenuView != null) {
            e(actionMenuView, paddingRight, paddingTop, paddingTop2, !b10);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14 = 1073741824;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            if (View.MeasureSpec.getMode(i11) != 0) {
                int size = View.MeasureSpec.getSize(i10);
                int i15 = this.f1415r;
                if (i15 <= 0) {
                    i15 = View.MeasureSpec.getSize(i11);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i16 = i15 - paddingTop;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, RecyclerView.UNDEFINED_DURATION);
                View view = this.f1222x;
                if (view != null) {
                    int c10 = c(view, paddingLeft, makeMeasureSpec, 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1222x.getLayoutParams();
                    paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f1413p;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = c(this.f1413p, paddingLeft, makeMeasureSpec, 0);
                }
                LinearLayout linearLayout = this.A;
                if (linearLayout != null && this.f1224z == null) {
                    if (this.F) {
                        this.A.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.A.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.A;
                        if (z10) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        linearLayout2.setVisibility(i13);
                    } else {
                        paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                    }
                }
                View view2 = this.f1224z;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i17 = layoutParams.width;
                    if (i17 != -2) {
                        i12 = 1073741824;
                    } else {
                        i12 = RecyclerView.UNDEFINED_DURATION;
                    }
                    if (i17 >= 0) {
                        paddingLeft = Math.min(i17, paddingLeft);
                    }
                    int i18 = layoutParams.height;
                    if (i18 == -2) {
                        i14 = RecyclerView.UNDEFINED_DURATION;
                    }
                    if (i18 >= 0) {
                        i16 = Math.min(i18, i16);
                    }
                    this.f1224z.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i16, i14));
                }
                if (this.f1415r <= 0) {
                    int childCount = getChildCount();
                    int i19 = 0;
                    for (int i20 = 0; i20 < childCount; i20++) {
                        int measuredHeight = getChildAt(i20).getMeasuredHeight() + paddingTop;
                        if (measuredHeight > i19) {
                            i19 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i19);
                    return;
                }
                setMeasuredDimension(size, i15);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i10) {
        this.f1415r = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1224z;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1224z = view;
        if (view != null && (linearLayout = this.A) != null) {
            removeView(linearLayout);
            this.A = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1221w = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1220v = charSequence;
        i();
        androidx.core.view.p0.x0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.F) {
            requestLayout();
        }
        this.F = z10;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.f15699j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g1 v10 = g1.v(context, attributeSet, g.j.f15954y, i10, 0);
        androidx.core.view.p0.y0(this, v10.g(g.j.f15959z));
        this.D = v10.n(g.j.D, 0);
        this.E = v10.n(g.j.C, 0);
        this.f1415r = v10.m(g.j.B, 0);
        this.G = v10.n(g.j.A, g.g.f15795d);
        v10.w();
    }
}
