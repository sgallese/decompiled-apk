package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: i0  reason: collision with root package name */
    private static final Property<SwitchCompat, Float> f1350i0 = new a(Float.class, "thumbPos");

    /* renamed from: j0  reason: collision with root package name */
    private static final int[] f1351j0 = {16842912};
    private boolean A;
    private CharSequence B;
    private CharSequence C;
    private CharSequence D;
    private CharSequence E;
    private boolean F;
    private int G;
    private int H;
    private float I;
    private float J;
    private VelocityTracker K;
    private int L;
    float M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private final TextPaint V;
    private ColorStateList W;

    /* renamed from: a0  reason: collision with root package name */
    private Layout f1352a0;

    /* renamed from: b0  reason: collision with root package name */
    private Layout f1353b0;

    /* renamed from: c0  reason: collision with root package name */
    private TransformationMethod f1354c0;

    /* renamed from: d0  reason: collision with root package name */
    ObjectAnimator f1355d0;

    /* renamed from: e0  reason: collision with root package name */
    private final a0 f1356e0;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1357f;

    /* renamed from: f0  reason: collision with root package name */
    private l f1358f0;

    /* renamed from: g0  reason: collision with root package name */
    private c f1359g0;

    /* renamed from: h0  reason: collision with root package name */
    private final Rect f1360h0;

    /* renamed from: m  reason: collision with root package name */
    private ColorStateList f1361m;

    /* renamed from: p  reason: collision with root package name */
    private PorterDuff.Mode f1362p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1363q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1364r;

    /* renamed from: s  reason: collision with root package name */
    private Drawable f1365s;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f1366t;

    /* renamed from: u  reason: collision with root package name */
    private PorterDuff.Mode f1367u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1368v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1369w;

    /* renamed from: x  reason: collision with root package name */
    private int f1370x;

    /* renamed from: y  reason: collision with root package name */
    private int f1371y;

    /* renamed from: z  reason: collision with root package name */
    private int f1372z;

    /* loaded from: classes.dex */
    class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.M);
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static void a(ObjectAnimator objectAnimator, boolean z10) {
            objectAnimator.setAutoCancel(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends f.AbstractC0088f {

        /* renamed from: f  reason: collision with root package name */
        private final Reference<SwitchCompat> f1373f;

        c(SwitchCompat switchCompat) {
            this.f1373f = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.f.AbstractC0088f
        public void a(Throwable th) {
            SwitchCompat switchCompat = this.f1373f.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.f.AbstractC0088f
        public void b() {
            SwitchCompat switchCompat = this.f1373f.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.O);
    }

    private void a(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1350i0, f10);
        this.f1355d0 = ofFloat;
        ofFloat.setDuration(250L);
        b.a(this.f1355d0, true);
        this.f1355d0.start();
    }

    private void b() {
        Drawable drawable = this.f1357f;
        if (drawable != null) {
            if (this.f1363q || this.f1364r) {
                Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
                this.f1357f = mutate;
                if (this.f1363q) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f1361m);
                }
                if (this.f1364r) {
                    androidx.core.graphics.drawable.a.p(this.f1357f, this.f1362p);
                }
                if (this.f1357f.isStateful()) {
                    this.f1357f.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f1365s;
        if (drawable != null) {
            if (this.f1368v || this.f1369w) {
                Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
                this.f1365s = mutate;
                if (this.f1368v) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f1366t);
                }
                if (this.f1369w) {
                    androidx.core.graphics.drawable.a.p(this.f1365s, this.f1367u);
                }
                if (this.f1365s.isStateful()) {
                    this.f1365s.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.f1355d0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float f(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        if (f10 > f12) {
            return f12;
        }
        return f10;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod f10 = getEmojiTextViewHelper().f(this.f1354c0);
        if (f10 != null) {
            return f10.getTransformation(charSequence, this);
        }
        return charSequence;
    }

    private l getEmojiTextViewHelper() {
        if (this.f1358f0 == null) {
            this.f1358f0 = new l(this);
        }
        return this.f1358f0;
    }

    private boolean getTargetCheckedState() {
        if (this.M > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f10;
        if (r1.b(this)) {
            f10 = 1.0f - this.M;
        } else {
            f10 = this.M;
        }
        return (int) ((f10 * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f1365s;
        if (drawable != null) {
            Rect rect2 = this.f1360h0;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f1357f;
            if (drawable2 != null) {
                rect = n0.d(drawable2);
            } else {
                rect = n0.f1578c;
            }
            return ((((this.N - this.P) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private boolean h(float f10, float f11) {
        if (this.f1357f == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1357f.getPadding(this.f1360h0);
        int i10 = this.R;
        int i11 = this.H;
        int i12 = i10 - i11;
        int i13 = (this.Q + thumbOffset) - i11;
        int i14 = this.P + i13;
        Rect rect = this.f1360h0;
        int i15 = i14 + rect.left + rect.right + i11;
        int i16 = this.T + i11;
        if (f10 <= i13 || f10 >= i15 || f11 <= i12 || f11 >= i16) {
            return false;
        }
        return true;
    }

    private Layout i(CharSequence charSequence) {
        int i10;
        TextPaint textPaint = this.V;
        if (charSequence != null) {
            i10 = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i10 = 0;
        }
        return new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.D;
            if (charSequence == null) {
                charSequence = getResources().getString(g.h.f15813b);
            }
            androidx.core.view.p0.O0(this, charSequence);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.B;
            if (charSequence == null) {
                charSequence = getResources().getString(g.h.f15814c);
            }
            androidx.core.view.p0.O0(this, charSequence);
        }
    }

    private void o(int i10, int i11) {
        Typeface typeface;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    typeface = null;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        n(typeface, i11);
    }

    private void p() {
        if (this.f1359g0 == null && this.f1358f0.b() && androidx.emoji2.text.f.k()) {
            androidx.emoji2.text.f c10 = androidx.emoji2.text.f.c();
            int g10 = c10.g();
            if (g10 == 3 || g10 == 0) {
                c cVar = new c(this);
                this.f1359g0 = cVar;
                c10.v(cVar);
            }
        }
    }

    private void q(MotionEvent motionEvent) {
        boolean z10;
        this.G = 0;
        boolean z11 = true;
        if (motionEvent.getAction() == 1 && isEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isChecked = isChecked();
        if (z10) {
            this.K.computeCurrentVelocity(1000);
            float xVelocity = this.K.getXVelocity();
            if (Math.abs(xVelocity) > this.L) {
                if (!r1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z11 = false;
                }
            } else {
                z11 = getTargetCheckedState();
            }
        } else {
            z11 = isChecked;
        }
        if (z11 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z11);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.D = charSequence;
        this.E = g(charSequence);
        this.f1353b0 = null;
        if (this.F) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.B = charSequence;
        this.C = g(charSequence);
        this.f1352a0 = null;
        if (this.F) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i10;
        int i11;
        Rect rect2 = this.f1360h0;
        int i12 = this.Q;
        int i13 = this.R;
        int i14 = this.S;
        int i15 = this.T;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f1357f;
        if (drawable != null) {
            rect = n0.d(drawable);
        } else {
            rect = n0.f1578c;
        }
        Drawable drawable2 = this.f1365s;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i16 = rect2.left;
            thumbOffset += i16;
            if (rect != null) {
                int i17 = rect.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rect.top;
                int i19 = rect2.top;
                if (i18 > i19) {
                    i10 = (i18 - i19) + i13;
                } else {
                    i10 = i13;
                }
                int i20 = rect.right;
                int i21 = rect2.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rect.bottom;
                int i23 = rect2.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                    this.f1365s.setBounds(i12, i10, i14, i11);
                }
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f1365s.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f1357f;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i24 = thumbOffset - rect2.left;
            int i25 = thumbOffset + this.P + rect2.right;
            this.f1357f.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f1357f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f1365s;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1357f;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1365s;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!r1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.N;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f1372z;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (r1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.N;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f1372z;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.q(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.F;
    }

    public boolean getSplitTrack() {
        return this.A;
    }

    public int getSwitchMinWidth() {
        return this.f1371y;
    }

    public int getSwitchPadding() {
        return this.f1372z;
    }

    public CharSequence getTextOff() {
        return this.D;
    }

    public CharSequence getTextOn() {
        return this.B;
    }

    public Drawable getThumbDrawable() {
        return this.f1357f;
    }

    protected final float getThumbPosition() {
        return this.M;
    }

    public int getThumbTextPadding() {
        return this.f1370x;
    }

    public ColorStateList getThumbTintList() {
        return this.f1361m;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1362p;
    }

    public Drawable getTrackDrawable() {
        return this.f1365s;
    }

    public ColorStateList getTrackTintList() {
        return this.f1366t;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1367u;
    }

    void j() {
        setTextOnInternal(this.B);
        setTextOffInternal(this.D);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1357f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1365s;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1355d0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1355d0.end();
            this.f1355d0 = null;
        }
    }

    public void m(Context context, int i10) {
        g1 t10 = g1.t(context, i10, g.j.f15836a3);
        ColorStateList c10 = t10.c(g.j.f15858e3);
        if (c10 != null) {
            this.W = c10;
        } else {
            this.W = getTextColors();
        }
        int f10 = t10.f(g.j.f15842b3, 0);
        if (f10 != 0) {
            float f11 = f10;
            if (f11 != this.V.getTextSize()) {
                this.V.setTextSize(f11);
                requestLayout();
            }
        }
        o(t10.k(g.j.f15848c3, -1), t10.k(g.j.f15853d3, -1));
        if (t10.a(g.j.f15893l3, false)) {
            this.f1354c0 = new k.a(getContext());
        } else {
            this.f1354c0 = null;
        }
        setTextOnInternal(this.B);
        setTextOffInternal(this.D);
        t10.w();
    }

    public void n(Typeface typeface, int i10) {
        Typeface create;
        int i11;
        float f10 = 0.0f;
        boolean z10 = false;
        if (i10 > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i10);
            } else {
                create = Typeface.create(typeface, i10);
            }
            setSwitchTypeface(create);
            if (create != null) {
                i11 = create.getStyle();
            } else {
                i11 = 0;
            }
            int i12 = (~i11) & i10;
            TextPaint textPaint = this.V;
            if ((i12 & 1) != 0) {
                z10 = true;
            }
            textPaint.setFakeBoldText(z10);
            TextPaint textPaint2 = this.V;
            if ((i12 & 2) != 0) {
                f10 = -0.25f;
            }
            textPaint2.setTextSkewX(f10);
            return;
        }
        this.V.setFakeBoldText(false);
        this.V.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1351j0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.f1360h0;
        Drawable drawable = this.f1365s;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.R;
        int i11 = this.T;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f1357f;
        if (drawable != null) {
            if (this.A && drawable2 != null) {
                Rect d10 = n0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d10.left;
                rect.right -= d10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.f1352a0;
        } else {
            layout = this.f1353b0;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.W;
            if (colorStateList != null) {
                this.V.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.V.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.B;
            } else {
                charSequence = this.D;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                sb2.append(' ');
                sb2.append(charSequence);
                accessibilityNodeInfo.setText(sb2);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int width;
        int i15;
        int i16;
        int i17;
        int i18;
        super.onLayout(z10, i10, i11, i12, i13);
        int i19 = 0;
        if (this.f1357f != null) {
            Rect rect = this.f1360h0;
            Drawable drawable = this.f1365s;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d10 = n0.d(this.f1357f);
            i14 = Math.max(0, d10.left - rect.left);
            i19 = Math.max(0, d10.right - rect.right);
        } else {
            i14 = 0;
        }
        if (r1.b(this)) {
            i15 = getPaddingLeft() + i14;
            width = ((this.N + i15) - i14) - i19;
        } else {
            width = (getWidth() - getPaddingRight()) - i19;
            i15 = (width - this.N) + i14 + i19;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i17 = getPaddingTop();
                i16 = this.O;
            } else {
                i18 = getHeight() - getPaddingBottom();
                i17 = i18 - this.O;
                this.Q = i15;
                this.R = i17;
                this.T = i18;
                this.S = width;
            }
        } else {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i16 = this.O;
            i17 = paddingTop - (i16 / 2);
        }
        i18 = i16 + i17;
        this.Q = i15;
        this.R = i17;
        this.T = i18;
        this.S = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.F) {
            if (this.f1352a0 == null) {
                this.f1352a0 = i(this.C);
            }
            if (this.f1353b0 == null) {
                this.f1353b0 = i(this.E);
            }
        }
        Rect rect = this.f1360h0;
        Drawable drawable = this.f1357f;
        int i16 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i12 = (this.f1357f.getIntrinsicWidth() - rect.left) - rect.right;
            i13 = this.f1357f.getIntrinsicHeight();
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (this.F) {
            i14 = Math.max(this.f1352a0.getWidth(), this.f1353b0.getWidth()) + (this.f1370x * 2);
        } else {
            i14 = 0;
        }
        this.P = Math.max(i14, i12);
        Drawable drawable2 = this.f1365s;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i16 = this.f1365s.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i17 = rect.left;
        int i18 = rect.right;
        Drawable drawable3 = this.f1357f;
        if (drawable3 != null) {
            Rect d10 = n0.d(drawable3);
            i17 = Math.max(i17, d10.left);
            i18 = Math.max(i18, d10.right);
        }
        if (this.U) {
            i15 = Math.max(this.f1371y, (this.P * 2) + i17 + i18);
        } else {
            i15 = this.f1371y;
        }
        int max = Math.max(i16, i13);
        this.N = i15;
        this.O = max;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.B;
        } else {
            charSequence = this.D;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r0 != 3) goto L44;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.K
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9f
            r2 = 2
            if (r0 == r1) goto L8b
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L8b
            goto Lb9
        L16:
            int r0 = r6.G
            if (r0 == r1) goto L57
            if (r0 == r2) goto L1e
            goto Lb9
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.I
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3d
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L39
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3d
        L39:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3d:
            boolean r0 = androidx.appcompat.widget.r1.b(r6)
            if (r0 == 0) goto L44
            float r2 = -r2
        L44:
            float r0 = r6.M
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.M
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L56
            r6.I = r7
            r6.setThumbPosition(r0)
        L56:
            return r1
        L57:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.I
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.H
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7d
            float r4 = r6.J
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.H
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb9
        L7d:
            r6.G = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.I = r0
            r6.J = r3
            return r1
        L8b:
            int r0 = r6.G
            if (r0 != r2) goto L96
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L96:
            r0 = 0
            r6.G = r0
            android.view.VelocityTracker r0 = r6.K
            r0.clear()
            goto Lb9
        L9f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb9
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb9
            r6.G = r1
            r6.I = r0
            r6.J = r2
        Lb9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        float f10;
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && androidx.core.view.p0.Y(this)) {
            a(isChecked);
            return;
        }
        d();
        if (isChecked) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        setThumbPosition(f10);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.B);
        setTextOffInternal(this.D);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z10) {
        this.U = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.A = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f1371y = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f1372z = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.V.getTypeface() != null && !this.V.getTypeface().equals(typeface)) || (this.V.getTypeface() == null && typeface != null)) {
            this.V.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            k();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1357f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1357f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f10) {
        this.M = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(h.a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f1370x = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1361m = colorStateList;
        this.f1363q = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1362p = mode;
        this.f1364r = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1365s;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1365s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(h.a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1366t = colorStateList;
        this.f1368v = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1367u = mode;
        this.f1369w = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f1357f && drawable != this.f1365s) {
            return false;
        }
        return true;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1361m = null;
        this.f1362p = null;
        this.f1363q = false;
        this.f1364r = false;
        this.f1366t = null;
        this.f1367u = null;
        this.f1368v = false;
        this.f1369w = false;
        this.K = VelocityTracker.obtain();
        this.U = true;
        this.f1360h0 = new Rect();
        b1.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.V = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = g.j.L2;
        g1 v10 = g1.v(context, attributeSet, iArr, i10, 0);
        androidx.core.view.p0.s0(this, context, iArr, attributeSet, v10.r(), i10, 0);
        Drawable g10 = v10.g(g.j.O2);
        this.f1357f = g10;
        if (g10 != null) {
            g10.setCallback(this);
        }
        Drawable g11 = v10.g(g.j.X2);
        this.f1365s = g11;
        if (g11 != null) {
            g11.setCallback(this);
        }
        setTextOnInternal(v10.p(g.j.M2));
        setTextOffInternal(v10.p(g.j.N2));
        this.F = v10.a(g.j.P2, true);
        this.f1370x = v10.f(g.j.U2, 0);
        this.f1371y = v10.f(g.j.R2, 0);
        this.f1372z = v10.f(g.j.S2, 0);
        this.A = v10.a(g.j.Q2, false);
        ColorStateList c10 = v10.c(g.j.V2);
        if (c10 != null) {
            this.f1361m = c10;
            this.f1363q = true;
        }
        PorterDuff.Mode e10 = n0.e(v10.k(g.j.W2, -1), null);
        if (this.f1362p != e10) {
            this.f1362p = e10;
            this.f1364r = true;
        }
        if (this.f1363q || this.f1364r) {
            b();
        }
        ColorStateList c11 = v10.c(g.j.Y2);
        if (c11 != null) {
            this.f1366t = c11;
            this.f1368v = true;
        }
        PorterDuff.Mode e11 = n0.e(v10.k(g.j.Z2, -1), null);
        if (this.f1367u != e11) {
            this.f1367u = e11;
            this.f1369w = true;
        }
        if (this.f1368v || this.f1369w) {
            c();
        }
        int n10 = v10.n(g.j.T2, 0);
        if (n10 != 0) {
            m(context, n10);
        }
        a0 a0Var = new a0(this);
        this.f1356e0 = a0Var;
        a0Var.m(attributeSet, i10);
        v10.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.H = viewConfiguration.getScaledTouchSlop();
        this.L = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
