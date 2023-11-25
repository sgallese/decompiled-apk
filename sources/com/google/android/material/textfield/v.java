package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.s0;
import androidx.core.view.p0;

/* compiled from: MaterialAutoCompleteTextView.java */
/* loaded from: classes3.dex */
public class v extends androidx.appcompat.widget.d {

    /* renamed from: r  reason: collision with root package name */
    private final s0 f10602r;

    /* renamed from: s  reason: collision with root package name */
    private final AccessibilityManager f10603s;

    /* renamed from: t  reason: collision with root package name */
    private final Rect f10604t;

    /* renamed from: u  reason: collision with root package name */
    private final int f10605u;

    /* renamed from: v  reason: collision with root package name */
    private final float f10606v;

    /* renamed from: w  reason: collision with root package name */
    private int f10607w;

    /* renamed from: x  reason: collision with root package name */
    private ColorStateList f10608x;

    /* compiled from: MaterialAutoCompleteTextView.java */
    /* loaded from: classes3.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            Object item;
            v vVar = v.this;
            if (i10 < 0) {
                item = vVar.f10602r.u();
            } else {
                item = vVar.getAdapter().getItem(i10);
            }
            v.this.j(item);
            AdapterView.OnItemClickListener onItemClickListener = v.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = v.this.f10602r.x();
                    i10 = v.this.f10602r.w();
                    j10 = v.this.f10602r.v();
                }
                onItemClickListener.onItemClick(v.this.f10602r.j(), view, i10, j10);
            }
            v.this.f10602r.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MaterialAutoCompleteTextView.java */
    /* loaded from: classes3.dex */
    public class b<T> extends ArrayAdapter<String> {

        /* renamed from: f  reason: collision with root package name */
        private ColorStateList f10610f;

        /* renamed from: m  reason: collision with root package name */
        private ColorStateList f10611m;

        b(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            f();
        }

        private ColorStateList a() {
            if (c() && d()) {
                int[] iArr = {16843623, -16842919};
                int[] iArr2 = {16842913, -16842919};
                return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{d7.a.i(v.this.f10607w, v.this.f10608x.getColorForState(iArr2, 0)), d7.a.i(v.this.f10607w, v.this.f10608x.getColorForState(iArr, 0)), v.this.f10607w});
            }
            return null;
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(v.this.f10607w);
            if (this.f10611m != null) {
                androidx.core.graphics.drawable.a.o(colorDrawable, this.f10610f);
                return new RippleDrawable(this.f10611m, colorDrawable, null);
            }
            return colorDrawable;
        }

        private boolean c() {
            if (v.this.f10607w != 0) {
                return true;
            }
            return false;
        }

        private boolean d() {
            if (v.this.f10608x != null) {
                return true;
            }
            return false;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {16842919};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{v.this.f10608x.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.f10611m = e();
            this.f10610f = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            Drawable drawable;
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                if (v.this.getText().toString().contentEquals(textView.getText())) {
                    drawable = b();
                } else {
                    drawable = null;
                }
                p0.y0(textView, drawable);
            }
            return view2;
        }
    }

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v6.b.f24624b);
    }

    private TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        AccessibilityManager accessibilityManager = this.f10603s;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    private int h() {
        ListAdapter adapter = getAdapter();
        TextInputLayout f10 = f();
        int i10 = 0;
        if (adapter == null || f10 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f10602r.w()) + 15);
        View view = null;
        int i11 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(max, view, f10);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        Drawable background = this.f10602r.getBackground();
        if (background != null) {
            background.getPadding(this.f10604t);
            Rect rect = this.f10604t;
            i11 += rect.left + rect.right;
        }
        return i11 + f10.getEndIconView().getMeasuredWidth();
    }

    private void i() {
        TextInputLayout f10 = f();
        if (f10 != null) {
            f10.n0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void j(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.f10602r.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout f10 = f();
        if (f10 != null && f10.P()) {
            return f10.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f10606v;
    }

    public int getSimpleItemSelectedColor() {
        return this.f10607w;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f10608x;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout f10 = f();
        if (f10 != null && f10.P() && super.getHint() == null && com.google.android.material.internal.i.a()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10602r.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), h()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f10602r.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        s0 s0Var = this.f10602r;
        if (s0Var != null) {
            s0Var.a(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f10602r.L(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        i();
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f10607w = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f10608x = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.f10602r.c();
        } else {
            super.showDropDown();
        }
    }

    public v(Context context, AttributeSet attributeSet, int i10) {
        super(s7.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f10604t = new Rect();
        Context context2 = getContext();
        TypedArray i11 = com.google.android.material.internal.p.i(context2, attributeSet, v6.l.f24931l3, i10, v6.k.f24798h, new int[0]);
        int i12 = v6.l.f24941m3;
        if (i11.hasValue(i12) && i11.getInt(i12, 0) == 0) {
            setKeyListener(null);
        }
        this.f10605u = i11.getResourceId(v6.l.f24961o3, v6.h.f24754n);
        this.f10606v = i11.getDimensionPixelOffset(v6.l.f24951n3, v6.d.f24664a0);
        this.f10607w = i11.getColor(v6.l.f24971p3, 0);
        this.f10608x = m7.c.a(context2, i11, v6.l.f24981q3);
        this.f10603s = (AccessibilityManager) context2.getSystemService("accessibility");
        s0 s0Var = new s0(context2);
        this.f10602r = s0Var;
        s0Var.I(true);
        s0Var.C(this);
        s0Var.H(2);
        s0Var.o(getAdapter());
        s0Var.K(new a());
        int i13 = v6.l.f24991r3;
        if (i11.hasValue(i13)) {
            setSimpleItems(i11.getResourceId(i13, 0));
        }
        i11.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f10605u, strArr));
    }
}
