package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.accessibility.n0;
import androidx.core.view.p0;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import v6.h;
import v6.k;
import v6.l;

/* loaded from: classes3.dex */
class ClockFaceView extends e implements ClockHandView.b {
    private final ClockHandView N;
    private final Rect O;
    private final RectF P;
    private final Rect Q;
    private final SparseArray<TextView> R;
    private final androidx.core.view.a S;
    private final int[] T;
    private final float[] U;
    private final int V;
    private final int W;

    /* renamed from: a0  reason: collision with root package name */
    private final int f10633a0;

    /* renamed from: b0  reason: collision with root package name */
    private final int f10634b0;

    /* renamed from: c0  reason: collision with root package name */
    private String[] f10635c0;

    /* renamed from: d0  reason: collision with root package name */
    private float f10636d0;

    /* renamed from: e0  reason: collision with root package name */
    private final ColorStateList f10637e0;

    /* loaded from: classes3.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.x(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.N.i()) - ClockFaceView.this.V);
            return true;
        }
    }

    /* loaded from: classes3.dex */
    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, n0 n0Var) {
            super.g(view, n0Var);
            int intValue = ((Integer) view.getTag(v6.f.f24729r)).intValue();
            if (intValue > 0) {
                n0Var.X0((View) ClockFaceView.this.R.get(intValue - 1));
            }
            n0Var.q0(n0.g.a(0, 1, intValue, 1, false, view.isSelected()));
            n0Var.o0(true);
            n0Var.b(n0.a.f4081i);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 == 16) {
                long uptimeMillis = SystemClock.uptimeMillis();
                view.getHitRect(ClockFaceView.this.O);
                float centerX = ClockFaceView.this.O.centerX();
                float centerY = ClockFaceView.this.O.centerY();
                ClockFaceView.this.N.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
                ClockFaceView.this.N.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
                return true;
            }
            return super.j(view, i10, bundle);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v6.b.C);
    }

    private void F() {
        boolean z10;
        RectF e10 = this.N.e();
        TextView H = H(e10);
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            TextView textView = this.R.get(i10);
            if (textView != null) {
                if (textView == H) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                textView.setSelected(z10);
                textView.getPaint().setShader(G(e10, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient G(RectF rectF, TextView textView) {
        textView.getHitRect(this.O);
        this.P.set(this.O);
        textView.getLineBounds(0, this.Q);
        RectF rectF2 = this.P;
        Rect rect = this.Q;
        rectF2.inset(rect.left, rect.top);
        if (!RectF.intersects(rectF, this.P)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.P.left, rectF.centerY() - this.P.top, rectF.width() * 0.5f, this.T, this.U, Shader.TileMode.CLAMP);
    }

    private TextView H(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            TextView textView2 = this.R.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.O);
                this.P.set(this.O);
                this.P.union(rectF);
                float width = this.P.width() * this.P.height();
                if (width < f10) {
                    textView = textView2;
                    f10 = width;
                }
            }
        }
        return textView;
    }

    private static float I(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private void K(int i10) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.R.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.f10635c0.length, size); i11++) {
            TextView textView = this.R.get(i11);
            if (i11 >= this.f10635c0.length) {
                removeView(textView);
                this.R.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(h.f24748h, (ViewGroup) this, false);
                    this.R.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.f10635c0[i11]);
                textView.setTag(v6.f.f24729r, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(v6.f.f24724m, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                p0.u0(textView, this.S);
                textView.setTextColor(this.f10637e0);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f10635c0[i11]));
                }
            }
        }
        this.N.q(z10);
    }

    public void J(String[] strArr, int i10) {
        this.f10635c0 = strArr;
        K(i10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f10, boolean z10) {
        if (Math.abs(this.f10636d0 - f10) > 0.001f) {
            this.f10636d0 = f10;
            F();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        n0.e1(accessibilityNodeInfo).p0(n0.f.a(1, this.f10635c0.length, false, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        F();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int I = (int) (this.f10634b0 / I(this.W / displayMetrics.heightPixels, this.f10633a0 / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(I, 1073741824);
        setMeasuredDimension(I, I);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.e
    public void x(int i10) {
        if (i10 != w()) {
            super.x(i10);
            this.N.m(w());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.timepicker.e
    public void z() {
        super.z();
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            this.R.get(i10).setVisibility(0);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.O = new Rect();
        this.P = new RectF();
        this.Q = new Rect();
        this.R = new SparseArray<>();
        this.U = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.L1, i10, k.G);
        Resources resources = getResources();
        ColorStateList a10 = m7.c.a(context, obtainStyledAttributes, l.N1);
        this.f10637e0 = a10;
        LayoutInflater.from(context).inflate(h.f24749i, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(v6.f.f24723l);
        this.N = clockHandView;
        this.V = resources.getDimensionPixelSize(v6.d.f24698w);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.T = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = h.a.a(context, v6.c.f24658b).getDefaultColor();
        ColorStateList a11 = m7.c.a(context, obtainStyledAttributes, l.M1);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.S = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        J(strArr, 0);
        this.W = resources.getDimensionPixelSize(v6.d.J);
        this.f10633a0 = resources.getDimensionPixelSize(v6.d.K);
        this.f10634b0 = resources.getDimensionPixelSize(v6.d.f24700y);
    }
}
