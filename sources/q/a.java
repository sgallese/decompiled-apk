package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: CardView.java */
/* loaded from: classes.dex */
public class a extends FrameLayout {

    /* renamed from: u  reason: collision with root package name */
    private static final int[] f21286u = {16842801};

    /* renamed from: v  reason: collision with root package name */
    private static final d f21287v;

    /* renamed from: f  reason: collision with root package name */
    private boolean f21288f;

    /* renamed from: m  reason: collision with root package name */
    private boolean f21289m;

    /* renamed from: p  reason: collision with root package name */
    int f21290p;

    /* renamed from: q  reason: collision with root package name */
    int f21291q;

    /* renamed from: r  reason: collision with root package name */
    final Rect f21292r;

    /* renamed from: s  reason: collision with root package name */
    final Rect f21293s;

    /* renamed from: t  reason: collision with root package name */
    private final c f21294t;

    /* compiled from: CardView.java */
    /* renamed from: q.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0476a implements c {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f21295a;

        C0476a() {
        }

        @Override // q.c
        public void a(Drawable drawable) {
            this.f21295a = drawable;
            a.this.setBackgroundDrawable(drawable);
        }

        @Override // q.c
        public void b(int i10, int i11, int i12, int i13) {
            a.this.f21293s.set(i10, i11, i12, i13);
            a aVar = a.this;
            Rect rect = aVar.f21292r;
            a.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // q.c
        public boolean c() {
            return a.this.getPreventCornerOverlap();
        }

        @Override // q.c
        public boolean d() {
            return a.this.getUseCompatPadding();
        }

        @Override // q.c
        public Drawable e() {
            return this.f21295a;
        }

        @Override // q.c
        public View f() {
            return a.this;
        }
    }

    static {
        b bVar = new b();
        f21287v = bVar;
        bVar.l();
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p.a.f20723a);
    }

    public void d(int i10, int i11, int i12, int i13) {
        this.f21292r.set(i10, i11, i12, i13);
        f21287v.k(this.f21294t);
    }

    public ColorStateList getCardBackgroundColor() {
        return f21287v.i(this.f21294t);
    }

    public float getCardElevation() {
        return f21287v.f(this.f21294t);
    }

    public int getContentPaddingBottom() {
        return this.f21292r.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f21292r.left;
    }

    public int getContentPaddingRight() {
        return this.f21292r.right;
    }

    public int getContentPaddingTop() {
        return this.f21292r.top;
    }

    public float getMaxCardElevation() {
        return f21287v.g(this.f21294t);
    }

    public boolean getPreventCornerOverlap() {
        return this.f21289m;
    }

    public float getRadius() {
        return f21287v.d(this.f21294t);
    }

    public boolean getUseCompatPadding() {
        return this.f21288f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!(f21287v instanceof b)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.b(this.f21294t)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.h(this.f21294t)), View.MeasureSpec.getSize(i11)), mode2);
            }
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f21287v.n(this.f21294t, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f21287v.j(this.f21294t, f10);
    }

    public void setMaxCardElevation(float f10) {
        f21287v.o(this.f21294t, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f21291q = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f21290p = i10;
        super.setMinimumWidth(i10);
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f21289m) {
            this.f21289m = z10;
            f21287v.e(this.f21294t);
        }
    }

    public void setRadius(float f10) {
        f21287v.c(this.f21294t, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f21288f != z10) {
            this.f21288f = z10;
            f21287v.a(this.f21294t);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f21292r = rect;
        this.f21293s = new Rect();
        C0476a c0476a = new C0476a();
        this.f21294t = c0476a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.d.f20727a, i10, p.c.f20726a);
        int i11 = p.d.f20730d;
        if (obtainStyledAttributes.hasValue(i11)) {
            valueOf = obtainStyledAttributes.getColorStateList(i11);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f21286u);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(p.b.f20725b);
            } else {
                color = getResources().getColor(p.b.f20724a);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(p.d.f20731e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(p.d.f20732f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(p.d.f20733g, 0.0f);
        this.f21288f = obtainStyledAttributes.getBoolean(p.d.f20735i, false);
        this.f21289m = obtainStyledAttributes.getBoolean(p.d.f20734h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(p.d.f20736j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(p.d.f20738l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(p.d.f20740n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(p.d.f20739m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(p.d.f20737k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f21290p = obtainStyledAttributes.getDimensionPixelSize(p.d.f20728b, 0);
        this.f21291q = obtainStyledAttributes.getDimensionPixelSize(p.d.f20729c, 0);
        obtainStyledAttributes.recycle();
        f21287v.m(c0476a, context, colorStateList, dimension, dimension2, f10);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f21287v.n(this.f21294t, colorStateList);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }
}
