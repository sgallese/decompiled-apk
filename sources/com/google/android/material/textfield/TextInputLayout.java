package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.autofill.AutofillId;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.n0;
import androidx.core.view.p0;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout {
    private static final int L0 = v6.k.f24805o;
    private static final int[][] M0 = {new int[]{16842919}, new int[0]};
    private f A;
    private int A0;
    private TextView B;
    private int B0;
    private int C;
    private int C0;
    private int D;
    private int D0;
    private CharSequence E;
    private boolean E0;
    private boolean F;
    final com.google.android.material.internal.a F0;
    private TextView G;
    private boolean G0;
    private ColorStateList H;
    private boolean H0;
    private int I;
    private ValueAnimator I0;
    private c4.d J;
    private boolean J0;
    private c4.d K;
    private boolean K0;
    private ColorStateList L;
    private ColorStateList M;
    private boolean N;
    private CharSequence O;
    private boolean P;
    private p7.g Q;
    private p7.g R;
    private StateListDrawable S;
    private boolean T;
    private p7.g U;
    private p7.g V;
    private p7.k W;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f10460a0;

    /* renamed from: b0  reason: collision with root package name */
    private final int f10461b0;

    /* renamed from: c0  reason: collision with root package name */
    private int f10462c0;

    /* renamed from: d0  reason: collision with root package name */
    private int f10463d0;

    /* renamed from: e0  reason: collision with root package name */
    private int f10464e0;

    /* renamed from: f  reason: collision with root package name */
    private final FrameLayout f10465f;

    /* renamed from: f0  reason: collision with root package name */
    private int f10466f0;

    /* renamed from: g0  reason: collision with root package name */
    private int f10467g0;

    /* renamed from: h0  reason: collision with root package name */
    private int f10468h0;

    /* renamed from: i0  reason: collision with root package name */
    private int f10469i0;

    /* renamed from: j0  reason: collision with root package name */
    private final Rect f10470j0;

    /* renamed from: k0  reason: collision with root package name */
    private final Rect f10471k0;

    /* renamed from: l0  reason: collision with root package name */
    private final RectF f10472l0;

    /* renamed from: m  reason: collision with root package name */
    private final z f10473m;

    /* renamed from: m0  reason: collision with root package name */
    private Typeface f10474m0;

    /* renamed from: n0  reason: collision with root package name */
    private Drawable f10475n0;

    /* renamed from: o0  reason: collision with root package name */
    private int f10476o0;

    /* renamed from: p  reason: collision with root package name */
    private final r f10477p;

    /* renamed from: p0  reason: collision with root package name */
    private final LinkedHashSet<g> f10478p0;

    /* renamed from: q  reason: collision with root package name */
    EditText f10479q;

    /* renamed from: q0  reason: collision with root package name */
    private Drawable f10480q0;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f10481r;

    /* renamed from: r0  reason: collision with root package name */
    private int f10482r0;

    /* renamed from: s  reason: collision with root package name */
    private int f10483s;

    /* renamed from: s0  reason: collision with root package name */
    private Drawable f10484s0;

    /* renamed from: t  reason: collision with root package name */
    private int f10485t;

    /* renamed from: t0  reason: collision with root package name */
    private ColorStateList f10486t0;

    /* renamed from: u  reason: collision with root package name */
    private int f10487u;

    /* renamed from: u0  reason: collision with root package name */
    private ColorStateList f10488u0;

    /* renamed from: v  reason: collision with root package name */
    private int f10489v;

    /* renamed from: v0  reason: collision with root package name */
    private int f10490v0;

    /* renamed from: w  reason: collision with root package name */
    private final u f10491w;

    /* renamed from: w0  reason: collision with root package name */
    private int f10492w0;

    /* renamed from: x  reason: collision with root package name */
    boolean f10493x;

    /* renamed from: x0  reason: collision with root package name */
    private int f10494x0;

    /* renamed from: y  reason: collision with root package name */
    private int f10495y;

    /* renamed from: y0  reason: collision with root package name */
    private ColorStateList f10496y0;

    /* renamed from: z  reason: collision with root package name */
    private boolean f10497z;

    /* renamed from: z0  reason: collision with root package name */
    private int f10498z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: p  reason: collision with root package name */
        CharSequence f10499p;

        /* renamed from: q  reason: collision with root package name */
        boolean f10500q;

        /* loaded from: classes3.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f10499p) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f10499p, parcel, i10);
            parcel.writeInt(this.f10500q ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10499p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f10500q = parcel.readInt() == 1;
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f10477p.h();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f10479q.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.F0.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        private final TextInputLayout f10505d;

        public e(TextInputLayout textInputLayout) {
            this.f10505d = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void g(View view, n0 n0Var) {
            CharSequence charSequence;
            boolean z10;
            String str;
            super.g(view, n0Var);
            EditText editText = this.f10505d.getEditText();
            if (editText != null) {
                charSequence = editText.getText();
            } else {
                charSequence = null;
            }
            CharSequence hint = this.f10505d.getHint();
            CharSequence error = this.f10505d.getError();
            CharSequence placeholderText = this.f10505d.getPlaceholderText();
            int counterMaxLength = this.f10505d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f10505d.getCounterOverflowDescription();
            boolean z11 = !TextUtils.isEmpty(charSequence);
            boolean z12 = !TextUtils.isEmpty(hint);
            boolean z13 = !this.f10505d.O();
            boolean z14 = !TextUtils.isEmpty(error);
            if (!z14 && TextUtils.isEmpty(counterOverflowDescription)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z12) {
                str = hint.toString();
            } else {
                str = "";
            }
            this.f10505d.f10473m.z(n0Var);
            if (z11) {
                n0Var.V0(charSequence);
            } else if (!TextUtils.isEmpty(str)) {
                n0Var.V0(str);
                if (z13 && placeholderText != null) {
                    n0Var.V0(str + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                n0Var.V0(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    n0Var.A0(str);
                } else {
                    if (z11) {
                        str = ((Object) charSequence) + ", " + str;
                    }
                    n0Var.V0(str);
                }
                n0Var.R0(!z11);
            }
            if (charSequence == null || charSequence.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            n0Var.F0(counterMaxLength);
            if (z10) {
                if (!z14) {
                    error = counterOverflowDescription;
                }
                n0Var.w0(error);
            }
            View t10 = this.f10505d.f10491w.t();
            if (t10 != null) {
                n0Var.C0(t10);
            }
            this.f10505d.f10477p.m().o(view, n0Var);
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f10505d.f10477p.m().p(view, accessibilityEvent);
        }
    }

    /* loaded from: classes3.dex */
    public interface f {
        int a(Editable editable);
    }

    /* loaded from: classes3.dex */
    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: classes3.dex */
    public interface h {
        void a(TextInputLayout textInputLayout, int i10);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v6.b.f24635g0);
    }

    private boolean A() {
        if (this.N && !TextUtils.isEmpty(this.O) && (this.Q instanceof com.google.android.material.textfield.h)) {
            return true;
        }
        return false;
    }

    private void B() {
        Iterator<g> it = this.f10478p0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void C(Canvas canvas) {
        p7.g gVar;
        if (this.V != null && (gVar = this.U) != null) {
            gVar.draw(canvas);
            if (this.f10479q.isFocused()) {
                Rect bounds = this.V.getBounds();
                Rect bounds2 = this.U.getBounds();
                float F = this.F0.F();
                int centerX = bounds2.centerX();
                bounds.left = w6.a.c(centerX, bounds2.left, F);
                bounds.right = w6.a.c(centerX, bounds2.right, F);
                this.V.draw(canvas);
            }
        }
    }

    private void D(Canvas canvas) {
        if (this.N) {
            this.F0.l(canvas);
        }
    }

    private void E(boolean z10) {
        ValueAnimator valueAnimator = this.I0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.I0.cancel();
        }
        if (z10 && this.H0) {
            k(0.0f);
        } else {
            this.F0.y0(0.0f);
        }
        if (A() && ((com.google.android.material.textfield.h) this.Q).r0()) {
            x();
        }
        this.E0 = true;
        K();
        this.f10473m.k(true);
        this.f10477p.G(true);
    }

    private p7.g F(boolean z10) {
        float f10;
        float dimensionPixelOffset;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(v6.d.f24676g0);
        if (z10) {
            f10 = dimensionPixelOffset2;
        } else {
            f10 = 0.0f;
        }
        EditText editText = this.f10479q;
        if (editText instanceof v) {
            dimensionPixelOffset = ((v) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(v6.d.f24693r);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(v6.d.f24666b0);
        p7.k m10 = p7.k.a().A(f10).E(f10).s(dimensionPixelOffset2).w(dimensionPixelOffset2).m();
        p7.g m11 = p7.g.m(getContext(), dimensionPixelOffset);
        m11.setShapeAppearanceModel(m10);
        m11.d0(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        return m11;
    }

    private static Drawable G(p7.g gVar, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{d7.a.j(i11, i10, 0.1f), i10}), gVar, gVar);
    }

    private int H(int i10, boolean z10) {
        int compoundPaddingLeft = i10 + this.f10479q.getCompoundPaddingLeft();
        if (getPrefixText() != null && !z10) {
            return (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
        }
        return compoundPaddingLeft;
    }

    private int I(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.f10479q.getCompoundPaddingRight();
        if (getPrefixText() != null && z10) {
            return compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
        }
        return compoundPaddingRight;
    }

    private static Drawable J(Context context, p7.g gVar, int i10, int[][] iArr) {
        int c10 = d7.a.c(context, v6.b.f24647q, "TextInputLayout");
        p7.g gVar2 = new p7.g(gVar.E());
        int j10 = d7.a.j(i10, c10, 0.1f);
        gVar2.b0(new ColorStateList(iArr, new int[]{j10, 0}));
        gVar2.setTint(c10);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{j10, c10});
        p7.g gVar3 = new p7.g(gVar.E());
        gVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
    }

    private void K() {
        TextView textView = this.G;
        if (textView != null && this.F) {
            textView.setText((CharSequence) null);
            c4.n.a(this.f10465f, this.K);
            this.G.setVisibility(4);
        }
    }

    private boolean Q() {
        if (this.f10462c0 == 1 && this.f10479q.getMinLines() <= 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int R(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private void S() {
        o();
        n0();
        w0();
        e0();
        j();
        if (this.f10462c0 != 0) {
            p0();
        }
        Y();
    }

    private void T() {
        if (!A()) {
            return;
        }
        RectF rectF = this.f10472l0;
        this.F0.o(rectF, this.f10479q.getWidth(), this.f10479q.getGravity());
        if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
            n(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f10464e0);
            ((com.google.android.material.textfield.h) this.Q).u0(rectF);
        }
    }

    private void U() {
        if (A() && !this.E0) {
            x();
            T();
        }
    }

    private static void V(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                V((ViewGroup) childAt, z10);
            }
        }
    }

    private void X() {
        TextView textView = this.G;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void Y() {
        EditText editText = this.f10479q;
        if (!(editText instanceof AutoCompleteTextView)) {
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        if (autoCompleteTextView.getDropDownBackground() == null) {
            int i10 = this.f10462c0;
            if (i10 == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
            } else if (i10 == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
            }
        }
    }

    private boolean b0() {
        if ((this.f10477p.F() || ((this.f10477p.z() && L()) || this.f10477p.w() != null)) && this.f10477p.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    private boolean c0() {
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f10473m.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    private void d0() {
        if (this.G != null && this.F && !TextUtils.isEmpty(this.E)) {
            this.G.setText(this.E);
            c4.n.a(this.f10465f, this.J);
            this.G.setVisibility(0);
            this.G.bringToFront();
            announceForAccessibility(this.E);
        }
    }

    private void e0() {
        if (this.f10462c0 == 1) {
            if (m7.c.h(getContext())) {
                this.f10463d0 = getResources().getDimensionPixelSize(v6.d.E);
            } else if (m7.c.g(getContext())) {
                this.f10463d0 = getResources().getDimensionPixelSize(v6.d.D);
            }
        }
    }

    private void f0(Rect rect) {
        p7.g gVar = this.U;
        if (gVar != null) {
            int i10 = rect.bottom;
            gVar.setBounds(rect.left, i10 - this.f10466f0, rect.right, i10);
        }
        p7.g gVar2 = this.V;
        if (gVar2 != null) {
            int i11 = rect.bottom;
            gVar2.setBounds(rect.left, i11 - this.f10467g0, rect.right, i11);
        }
    }

    private void g0() {
        Editable text;
        if (this.B != null) {
            EditText editText = this.f10479q;
            if (editText == null) {
                text = null;
            } else {
                text = editText.getText();
            }
            h0(text);
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f10479q;
        if ((editText instanceof AutoCompleteTextView) && !q.a(editText)) {
            int d10 = d7.a.d(this.f10479q, v6.b.f24641k);
            int i10 = this.f10462c0;
            if (i10 == 2) {
                return J(getContext(), this.Q, d10, M0);
            }
            if (i10 == 1) {
                return G(this.Q, this.f10469i0, d10, M0);
            }
            return null;
        }
        return this.Q;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.S == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.S = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.S.addState(new int[0], F(false));
        }
        return this.S;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.R == null) {
            this.R = F(true);
        }
        return this.R;
    }

    private void i() {
        TextView textView = this.G;
        if (textView != null) {
            this.f10465f.addView(textView);
            this.G.setVisibility(0);
        }
    }

    private static void i0(Context context, TextView textView, int i10, int i11, boolean z10) {
        int i12;
        if (z10) {
            i12 = v6.j.f24767c;
        } else {
            i12 = v6.j.f24766b;
        }
        textView.setContentDescription(context.getString(i12, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void j() {
        if (this.f10479q != null && this.f10462c0 == 1) {
            if (m7.c.h(getContext())) {
                EditText editText = this.f10479q;
                p0.K0(editText, p0.J(editText), getResources().getDimensionPixelSize(v6.d.C), p0.I(this.f10479q), getResources().getDimensionPixelSize(v6.d.B));
            } else if (m7.c.g(getContext())) {
                EditText editText2 = this.f10479q;
                p0.K0(editText2, p0.J(editText2), getResources().getDimensionPixelSize(v6.d.A), p0.I(this.f10479q), getResources().getDimensionPixelSize(v6.d.f24701z));
            }
        }
    }

    private void j0() {
        int i10;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.B;
        if (textView != null) {
            if (this.f10497z) {
                i10 = this.C;
            } else {
                i10 = this.D;
            }
            Z(textView, i10);
            if (!this.f10497z && (colorStateList2 = this.L) != null) {
                this.B.setTextColor(colorStateList2);
            }
            if (this.f10497z && (colorStateList = this.M) != null) {
                this.B.setTextColor(colorStateList);
            }
        }
    }

    @TargetApi(29)
    private void k0(boolean z10) {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList g10 = d7.a.g(getContext(), v6.b.f24640j);
        EditText editText = this.f10479q;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null && g10 != null) {
                textCursorDrawable2 = this.f10479q.getTextCursorDrawable();
                if (z10) {
                    ColorStateList colorStateList = this.f10496y0;
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(this.f10468h0);
                    }
                    g10 = colorStateList;
                }
                androidx.core.graphics.drawable.a.o(textCursorDrawable2, g10);
            }
        }
    }

    private void l() {
        p7.g gVar = this.Q;
        if (gVar == null) {
            return;
        }
        p7.k E = gVar.E();
        p7.k kVar = this.W;
        if (E != kVar) {
            this.Q.setShapeAppearanceModel(kVar);
        }
        if (v()) {
            this.Q.h0(this.f10464e0, this.f10468h0);
        }
        int p10 = p();
        this.f10469i0 = p10;
        this.Q.b0(ColorStateList.valueOf(p10));
        m();
        n0();
    }

    private void m() {
        ColorStateList valueOf;
        if (this.U != null && this.V != null) {
            if (w()) {
                p7.g gVar = this.U;
                if (this.f10479q.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.f10490v0);
                } else {
                    valueOf = ColorStateList.valueOf(this.f10468h0);
                }
                gVar.b0(valueOf);
                this.V.b0(ColorStateList.valueOf(this.f10468h0));
            }
            invalidate();
        }
    }

    private void n(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f10461b0;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    private void o() {
        int i10 = this.f10462c0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (this.N && !(this.Q instanceof com.google.android.material.textfield.h)) {
                        this.Q = com.google.android.material.textfield.h.q0(this.W);
                    } else {
                        this.Q = new p7.g(this.W);
                    }
                    this.U = null;
                    this.V = null;
                    return;
                }
                throw new IllegalArgumentException(this.f10462c0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.Q = new p7.g(this.W);
            this.U = new p7.g();
            this.V = new p7.g();
            return;
        }
        this.Q = null;
        this.U = null;
        this.V = null;
    }

    private boolean o0() {
        int max;
        if (this.f10479q == null || this.f10479q.getMeasuredHeight() >= (max = Math.max(this.f10477p.getMeasuredHeight(), this.f10473m.getMeasuredHeight()))) {
            return false;
        }
        this.f10479q.setMinimumHeight(max);
        return true;
    }

    private int p() {
        int i10 = this.f10469i0;
        if (this.f10462c0 == 1) {
            return d7.a.i(d7.a.e(this, v6.b.f24647q, 0), this.f10469i0);
        }
        return i10;
    }

    private void p0() {
        if (this.f10462c0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f10465f.getLayoutParams();
            int u10 = u();
            if (u10 != layoutParams.topMargin) {
                layoutParams.topMargin = u10;
                this.f10465f.requestLayout();
            }
        }
    }

    private Rect q(Rect rect) {
        if (this.f10479q != null) {
            Rect rect2 = this.f10471k0;
            boolean f10 = com.google.android.material.internal.r.f(this);
            rect2.bottom = rect.bottom;
            int i10 = this.f10462c0;
            if (i10 != 1) {
                if (i10 != 2) {
                    rect2.left = H(rect.left, f10);
                    rect2.top = getPaddingTop();
                    rect2.right = I(rect.right, f10);
                    return rect2;
                }
                rect2.left = rect.left + this.f10479q.getPaddingLeft();
                rect2.top = rect.top - u();
                rect2.right = rect.right - this.f10479q.getPaddingRight();
                return rect2;
            }
            rect2.left = H(rect.left, f10);
            rect2.top = rect.top + this.f10463d0;
            rect2.right = I(rect.right, f10);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int r(Rect rect, Rect rect2, float f10) {
        if (Q()) {
            return (int) (rect2.top + f10);
        }
        return rect.bottom - this.f10479q.getCompoundPaddingBottom();
    }

    private void r0(boolean z10, boolean z11) {
        boolean z12;
        ColorStateList colorStateList;
        TextView textView;
        int i10;
        boolean isEnabled = isEnabled();
        EditText editText = this.f10479q;
        boolean z13 = true;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z12 = true;
        } else {
            z12 = false;
        }
        EditText editText2 = this.f10479q;
        if (editText2 == null || !editText2.hasFocus()) {
            z13 = false;
        }
        ColorStateList colorStateList2 = this.f10486t0;
        if (colorStateList2 != null) {
            this.F0.d0(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f10486t0;
            if (colorStateList3 != null) {
                i10 = colorStateList3.getColorForState(new int[]{-16842910}, this.D0);
            } else {
                i10 = this.D0;
            }
            this.F0.d0(ColorStateList.valueOf(i10));
        } else if (a0()) {
            this.F0.d0(this.f10491w.r());
        } else if (this.f10497z && (textView = this.B) != null) {
            this.F0.d0(textView.getTextColors());
        } else if (z13 && (colorStateList = this.f10488u0) != null) {
            this.F0.i0(colorStateList);
        }
        if (!z12 && this.G0 && (!isEnabled() || !z13)) {
            if (z11 || !this.E0) {
                E(z10);
            }
        } else if (z11 || this.E0) {
            y(z10);
        }
    }

    private int s(Rect rect, float f10) {
        if (Q()) {
            return (int) (rect.centerY() - (f10 / 2.0f));
        }
        return rect.top + this.f10479q.getCompoundPaddingTop();
    }

    private void s0() {
        EditText editText;
        if (this.G != null && (editText = this.f10479q) != null) {
            this.G.setGravity(editText.getGravity());
            this.G.setPadding(this.f10479q.getCompoundPaddingLeft(), this.f10479q.getCompoundPaddingTop(), this.f10479q.getCompoundPaddingRight(), this.f10479q.getCompoundPaddingBottom());
        }
    }

    private void setEditText(EditText editText) {
        if (this.f10479q == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f10479q = editText;
            int i10 = this.f10483s;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.f10487u);
            }
            int i11 = this.f10485t;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.f10489v);
            }
            this.T = false;
            S();
            setTextInputAccessibilityDelegate(new e(this));
            this.F0.N0(this.f10479q.getTypeface());
            this.F0.v0(this.f10479q.getTextSize());
            this.F0.q0(this.f10479q.getLetterSpacing());
            int gravity = this.f10479q.getGravity();
            this.F0.j0((gravity & (-113)) | 48);
            this.F0.u0(gravity);
            this.f10479q.addTextChangedListener(new a());
            if (this.f10486t0 == null) {
                this.f10486t0 = this.f10479q.getHintTextColors();
            }
            if (this.N) {
                if (TextUtils.isEmpty(this.O)) {
                    CharSequence hint = this.f10479q.getHint();
                    this.f10481r = hint;
                    setHint(hint);
                    this.f10479q.setHint((CharSequence) null);
                }
                this.P = true;
            }
            if (this.B != null) {
                h0(this.f10479q.getText());
            }
            m0();
            this.f10491w.f();
            this.f10473m.bringToFront();
            this.f10477p.bringToFront();
            B();
            this.f10477p.w0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            r0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.O)) {
            this.O = charSequence;
            this.F0.K0(charSequence);
            if (!this.E0) {
                T();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.F == z10) {
            return;
        }
        if (z10) {
            i();
        } else {
            X();
            this.G = null;
        }
        this.F = z10;
    }

    private Rect t(Rect rect) {
        if (this.f10479q != null) {
            Rect rect2 = this.f10471k0;
            float C = this.F0.C();
            rect2.left = rect.left + this.f10479q.getCompoundPaddingLeft();
            rect2.top = s(rect, C);
            rect2.right = rect.right - this.f10479q.getCompoundPaddingRight();
            rect2.bottom = r(rect, rect2, C);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private void t0() {
        Editable text;
        EditText editText = this.f10479q;
        if (editText == null) {
            text = null;
        } else {
            text = editText.getText();
        }
        u0(text);
    }

    private int u() {
        float r10;
        if (!this.N) {
            return 0;
        }
        int i10 = this.f10462c0;
        if (i10 != 0) {
            if (i10 != 2) {
                return 0;
            }
            r10 = this.F0.r() / 2.0f;
        } else {
            r10 = this.F0.r();
        }
        return (int) r10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(Editable editable) {
        if (this.A.a(editable) == 0 && !this.E0) {
            d0();
        } else {
            K();
        }
    }

    private boolean v() {
        if (this.f10462c0 == 2 && w()) {
            return true;
        }
        return false;
    }

    private void v0(boolean z10, boolean z11) {
        int defaultColor = this.f10496y0.getDefaultColor();
        int colorForState = this.f10496y0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f10496y0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.f10468h0 = colorForState2;
        } else if (z11) {
            this.f10468h0 = colorForState;
        } else {
            this.f10468h0 = defaultColor;
        }
    }

    private boolean w() {
        if (this.f10464e0 > -1 && this.f10468h0 != 0) {
            return true;
        }
        return false;
    }

    private void x() {
        if (A()) {
            ((com.google.android.material.textfield.h) this.Q).s0();
        }
    }

    private void y(boolean z10) {
        ValueAnimator valueAnimator = this.I0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.I0.cancel();
        }
        if (z10 && this.H0) {
            k(1.0f);
        } else {
            this.F0.y0(1.0f);
        }
        this.E0 = false;
        if (A()) {
            T();
        }
        t0();
        this.f10473m.k(false);
        this.f10477p.G(false);
    }

    private c4.d z() {
        c4.d dVar = new c4.d();
        dVar.V(j7.a.f(getContext(), v6.b.J, 87));
        dVar.X(j7.a.g(getContext(), v6.b.P, w6.a.f25410a));
        return dVar;
    }

    public boolean L() {
        return this.f10477p.E();
    }

    public boolean M() {
        return this.f10491w.A();
    }

    public boolean N() {
        return this.f10491w.B();
    }

    final boolean O() {
        return this.E0;
    }

    public boolean P() {
        return this.P;
    }

    public void W() {
        this.f10473m.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Z(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.j.o(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = v6.k.f24793c
            androidx.core.widget.j.o(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = v6.c.f24657a
            int r4 = androidx.core.content.a.c(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.Z(android.widget.TextView, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a0() {
        return this.f10491w.l();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.f10465f.addView(view, layoutParams2);
            this.f10465f.setLayoutParams(layoutParams);
            p0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        AutofillId autofillId;
        ViewStructure newChild;
        EditText editText = this.f10479q;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f10481r == null) {
            autofillId = getAutofillId();
            viewStructure.setAutofillId(autofillId);
            onProvideAutofillStructure(viewStructure, i10);
            onProvideAutofillVirtualStructure(viewStructure, i10);
            viewStructure.setChildCount(this.f10465f.getChildCount());
            for (int i11 = 0; i11 < this.f10465f.getChildCount(); i11++) {
                View childAt = this.f10465f.getChildAt(i11);
                newChild = viewStructure.newChild(i11);
                childAt.dispatchProvideAutofillStructure(newChild, i10);
                if (childAt == this.f10479q) {
                    newChild.setHint(getHint());
                }
            }
            return;
        }
        boolean z10 = this.P;
        this.P = false;
        CharSequence hint = editText.getHint();
        this.f10479q.setHint(this.f10481r);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
        } finally {
            this.f10479q.setHint(hint);
            this.P = z10;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.K0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.K0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        D(canvas);
        C(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        boolean z10;
        if (this.J0) {
            return;
        }
        boolean z11 = true;
        this.J0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.F0;
        if (aVar != null) {
            z10 = aVar.I0(drawableState) | false;
        } else {
            z10 = false;
        }
        if (this.f10479q != null) {
            if (!p0.Y(this) || !isEnabled()) {
                z11 = false;
            }
            q0(z11);
        }
        m0();
        w0();
        if (z10) {
            invalidate();
        }
        this.J0 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f10479q;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + u();
        }
        return super.getBaseline();
    }

    p7.g getBoxBackground() {
        int i10 = this.f10462c0;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException();
        }
        return this.Q;
    }

    public int getBoxBackgroundColor() {
        return this.f10469i0;
    }

    public int getBoxBackgroundMode() {
        return this.f10462c0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f10463d0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (com.google.android.material.internal.r.f(this)) {
            return this.W.j().a(this.f10472l0);
        }
        return this.W.l().a(this.f10472l0);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (com.google.android.material.internal.r.f(this)) {
            return this.W.l().a(this.f10472l0);
        }
        return this.W.j().a(this.f10472l0);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (com.google.android.material.internal.r.f(this)) {
            return this.W.r().a(this.f10472l0);
        }
        return this.W.t().a(this.f10472l0);
    }

    public float getBoxCornerRadiusTopStart() {
        if (com.google.android.material.internal.r.f(this)) {
            return this.W.t().a(this.f10472l0);
        }
        return this.W.r().a(this.f10472l0);
    }

    public int getBoxStrokeColor() {
        return this.f10494x0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f10496y0;
    }

    public int getBoxStrokeWidth() {
        return this.f10466f0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f10467g0;
    }

    public int getCounterMaxLength() {
        return this.f10495y;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f10493x && this.f10497z && (textView = this.B) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.M;
    }

    public ColorStateList getCounterTextColor() {
        return this.L;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f10486t0;
    }

    public EditText getEditText() {
        return this.f10479q;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f10477p.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f10477p.n();
    }

    public int getEndIconMinSize() {
        return this.f10477p.o();
    }

    public int getEndIconMode() {
        return this.f10477p.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f10477p.q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f10477p.r();
    }

    public CharSequence getError() {
        if (this.f10491w.A()) {
            return this.f10491w.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f10491w.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f10491w.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f10491w.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f10477p.s();
    }

    public CharSequence getHelperText() {
        if (this.f10491w.B()) {
            return this.f10491w.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f10491w.u();
    }

    public CharSequence getHint() {
        if (this.N) {
            return this.O;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.F0.r();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.F0.w();
    }

    public ColorStateList getHintTextColor() {
        return this.f10488u0;
    }

    public f getLengthCounter() {
        return this.A;
    }

    public int getMaxEms() {
        return this.f10485t;
    }

    public int getMaxWidth() {
        return this.f10489v;
    }

    public int getMinEms() {
        return this.f10483s;
    }

    public int getMinWidth() {
        return this.f10487u;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f10477p.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f10477p.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.F) {
            return this.E;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.I;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.H;
    }

    public CharSequence getPrefixText() {
        return this.f10473m.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f10473m.b();
    }

    public TextView getPrefixTextView() {
        return this.f10473m.c();
    }

    public p7.k getShapeAppearanceModel() {
        return this.W;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f10473m.d();
    }

    public Drawable getStartIconDrawable() {
        return this.f10473m.e();
    }

    public int getStartIconMinSize() {
        return this.f10473m.f();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f10473m.g();
    }

    public CharSequence getSuffixText() {
        return this.f10477p.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f10477p.x();
    }

    public TextView getSuffixTextView() {
        return this.f10477p.y();
    }

    public Typeface getTypeface() {
        return this.f10474m0;
    }

    public void h(g gVar) {
        this.f10478p0.add(gVar);
        if (this.f10479q != null) {
            gVar.a(this);
        }
    }

    void h0(Editable editable) {
        boolean z10;
        int a10 = this.A.a(editable);
        boolean z11 = this.f10497z;
        int i10 = this.f10495y;
        if (i10 == -1) {
            this.B.setText(String.valueOf(a10));
            this.B.setContentDescription(null);
            this.f10497z = false;
        } else {
            if (a10 > i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f10497z = z10;
            i0(getContext(), this.B, a10, this.f10495y, this.f10497z);
            if (z11 != this.f10497z) {
                j0();
            }
            this.B.setText(androidx.core.text.a.c().j(getContext().getString(v6.j.f24768d, Integer.valueOf(a10), Integer.valueOf(this.f10495y))));
        }
        if (this.f10479q != null && z11 != this.f10497z) {
            q0(false);
            w0();
            m0();
        }
    }

    void k(float f10) {
        if (this.F0.F() == f10) {
            return;
        }
        if (this.I0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.I0 = valueAnimator;
            valueAnimator.setInterpolator(j7.a.g(getContext(), v6.b.O, w6.a.f25411b));
            this.I0.setDuration(j7.a.f(getContext(), v6.b.H, 167));
            this.I0.addUpdateListener(new d());
        }
        this.I0.setFloatValues(this.F0.F(), f10);
        this.I0.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l0() {
        boolean z10;
        if (this.f10479q == null) {
            return false;
        }
        boolean z11 = true;
        if (c0()) {
            int measuredWidth = this.f10473m.getMeasuredWidth() - this.f10479q.getPaddingLeft();
            if (this.f10475n0 == null || this.f10476o0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f10475n0 = colorDrawable;
                this.f10476o0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a10 = androidx.core.widget.j.a(this.f10479q);
            Drawable drawable = a10[0];
            Drawable drawable2 = this.f10475n0;
            if (drawable != drawable2) {
                androidx.core.widget.j.j(this.f10479q, drawable2, a10[1], a10[2], a10[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f10475n0 != null) {
                Drawable[] a11 = androidx.core.widget.j.a(this.f10479q);
                androidx.core.widget.j.j(this.f10479q, null, a11[1], a11[2], a11[3]);
                this.f10475n0 = null;
                z10 = true;
            }
            z10 = false;
        }
        if (b0()) {
            int measuredWidth2 = this.f10477p.y().getMeasuredWidth() - this.f10479q.getPaddingRight();
            CheckableImageButton k10 = this.f10477p.k();
            if (k10 != null) {
                measuredWidth2 = measuredWidth2 + k10.getMeasuredWidth() + androidx.core.view.s.b((ViewGroup.MarginLayoutParams) k10.getLayoutParams());
            }
            Drawable[] a12 = androidx.core.widget.j.a(this.f10479q);
            Drawable drawable3 = this.f10480q0;
            if (drawable3 != null && this.f10482r0 != measuredWidth2) {
                this.f10482r0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.j.j(this.f10479q, a12[0], a12[1], this.f10480q0, a12[3]);
            } else {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f10480q0 = colorDrawable2;
                    this.f10482r0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = a12[2];
                Drawable drawable5 = this.f10480q0;
                if (drawable4 != drawable5) {
                    this.f10484s0 = drawable4;
                    androidx.core.widget.j.j(this.f10479q, a12[0], a12[1], drawable5, a12[3]);
                } else {
                    z11 = z10;
                }
            }
        } else if (this.f10480q0 != null) {
            Drawable[] a13 = androidx.core.widget.j.a(this.f10479q);
            if (a13[2] == this.f10480q0) {
                androidx.core.widget.j.j(this.f10479q, a13[0], a13[1], this.f10484s0, a13[3]);
            } else {
                z11 = z10;
            }
            this.f10480q0 = null;
        } else {
            return z10;
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f10479q;
        if (editText == null || this.f10462c0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (androidx.appcompat.widget.n0.a(background)) {
            background = background.mutate();
        }
        if (a0()) {
            background.setColorFilter(androidx.appcompat.widget.j.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f10497z && (textView = this.B) != null) {
            background.setColorFilter(androidx.appcompat.widget.j.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            androidx.core.graphics.drawable.a.c(background);
            this.f10479q.refreshDrawableState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n0() {
        EditText editText = this.f10479q;
        if (editText != null && this.Q != null) {
            if ((this.T || editText.getBackground() == null) && this.f10462c0 != 0) {
                p0.y0(this.f10479q, getEditTextBoxBackground());
                this.T = true;
            }
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.F0.Y(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f10479q;
        if (editText != null) {
            Rect rect = this.f10470j0;
            com.google.android.material.internal.c.a(this, editText, rect);
            f0(rect);
            if (this.N) {
                this.F0.v0(this.f10479q.getTextSize());
                int gravity = this.f10479q.getGravity();
                this.F0.j0((gravity & (-113)) | 48);
                this.F0.u0(gravity);
                this.F0.f0(q(rect));
                this.F0.p0(t(rect));
                this.F0.a0();
                if (A() && !this.E0) {
                    T();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean o02 = o0();
        boolean l02 = l0();
        if (o02 || l02) {
            this.f10479q.post(new c());
        }
        s0();
        this.f10477p.w0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setError(savedState.f10499p);
        if (savedState.f10500q) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != this.f10460a0) {
            float a10 = this.W.r().a(this.f10472l0);
            float a11 = this.W.t().a(this.f10472l0);
            float a12 = this.W.j().a(this.f10472l0);
            float a13 = this.W.l().a(this.f10472l0);
            p7.d q10 = this.W.q();
            p7.d s10 = this.W.s();
            p7.k m10 = p7.k.a().z(s10).D(q10).r(this.W.k()).v(this.W.i()).A(a11).E(a10).s(a13).w(a12).m();
            this.f10460a0 = z10;
            setShapeAppearanceModel(m10);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (a0()) {
            savedState.f10499p = getError();
        }
        savedState.f10500q = this.f10477p.D();
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q0(boolean z10) {
        r0(z10, false);
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f10469i0 != i10) {
            this.f10469i0 = i10;
            this.f10498z0 = i10;
            this.B0 = i10;
            this.C0 = i10;
            l();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(androidx.core.content.a.c(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f10498z0 = defaultColor;
        this.f10469i0 = defaultColor;
        this.A0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.B0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.C0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        l();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f10462c0) {
            return;
        }
        this.f10462c0 = i10;
        if (this.f10479q != null) {
            S();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f10463d0 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.W = this.W.v().y(i10, this.W.r()).C(i10, this.W.t()).q(i10, this.W.j()).u(i10, this.W.l()).m();
        l();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f10494x0 != i10) {
            this.f10494x0 = i10;
            w0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f10490v0 = colorStateList.getDefaultColor();
            this.D0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f10492w0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f10494x0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f10494x0 != colorStateList.getDefaultColor()) {
            this.f10494x0 = colorStateList.getDefaultColor();
        }
        w0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f10496y0 != colorStateList) {
            this.f10496y0 = colorStateList;
            w0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f10466f0 = i10;
        w0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f10467g0 = i10;
        w0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f10493x != z10) {
            if (z10) {
                androidx.appcompat.widget.b0 b0Var = new androidx.appcompat.widget.b0(getContext());
                this.B = b0Var;
                b0Var.setId(v6.f.Q);
                Typeface typeface = this.f10474m0;
                if (typeface != null) {
                    this.B.setTypeface(typeface);
                }
                this.B.setMaxLines(1);
                this.f10491w.e(this.B, 2);
                androidx.core.view.s.d((ViewGroup.MarginLayoutParams) this.B.getLayoutParams(), getResources().getDimensionPixelOffset(v6.d.f24688m0));
                j0();
                g0();
            } else {
                this.f10491w.C(this.B, 2);
                this.B = null;
            }
            this.f10493x = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f10495y != i10) {
            if (i10 > 0) {
                this.f10495y = i10;
            } else {
                this.f10495y = -1;
            }
            if (this.f10493x) {
                g0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.C != i10) {
            this.C = i10;
            j0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            j0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.D != i10) {
            this.D = i10;
            j0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            j0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f10486t0 = colorStateList;
        this.f10488u0 = colorStateList;
        if (this.f10479q != null) {
            q0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        V(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f10477p.M(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f10477p.N(z10);
    }

    public void setEndIconContentDescription(int i10) {
        this.f10477p.O(i10);
    }

    public void setEndIconDrawable(int i10) {
        this.f10477p.Q(i10);
    }

    public void setEndIconMinSize(int i10) {
        this.f10477p.S(i10);
    }

    public void setEndIconMode(int i10) {
        this.f10477p.T(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f10477p.U(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10477p.V(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f10477p.W(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f10477p.X(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f10477p.Y(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f10477p.Z(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f10491w.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f10491w.Q(charSequence);
        } else {
            this.f10491w.w();
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f10491w.E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f10491w.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f10491w.G(z10);
    }

    public void setErrorIconDrawable(int i10) {
        this.f10477p.a0(i10);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f10477p.c0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10477p.d0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f10477p.e0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f10477p.f0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f10491w.H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f10491w.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.G0 != z10) {
            this.G0 = z10;
            q0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (N()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!N()) {
            setHelperTextEnabled(true);
        }
        this.f10491w.R(charSequence);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f10491w.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f10491w.K(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f10491w.J(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.N) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(RecyclerView.m.FLAG_MOVED);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.H0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.N) {
            this.N = z10;
            if (!z10) {
                this.P = false;
                if (!TextUtils.isEmpty(this.O) && TextUtils.isEmpty(this.f10479q.getHint())) {
                    this.f10479q.setHint(this.O);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f10479q.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.O)) {
                        setHint(hint);
                    }
                    this.f10479q.setHint((CharSequence) null);
                }
                this.P = true;
            }
            if (this.f10479q != null) {
                p0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.F0.g0(i10);
        this.f10488u0 = this.F0.p();
        if (this.f10479q != null) {
            q0(false);
            p0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f10488u0 != colorStateList) {
            if (this.f10486t0 == null) {
                this.F0.i0(colorStateList);
            }
            this.f10488u0 = colorStateList;
            if (this.f10479q != null) {
                q0(false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.A = fVar;
    }

    public void setMaxEms(int i10) {
        this.f10485t = i10;
        EditText editText = this.f10479q;
        if (editText != null && i10 != -1) {
            editText.setMaxEms(i10);
        }
    }

    public void setMaxWidth(int i10) {
        this.f10489v = i10;
        EditText editText = this.f10479q;
        if (editText != null && i10 != -1) {
            editText.setMaxWidth(i10);
        }
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f10483s = i10;
        EditText editText = this.f10479q;
        if (editText != null && i10 != -1) {
            editText.setMinEms(i10);
        }
    }

    public void setMinWidth(int i10) {
        this.f10487u = i10;
        EditText editText = this.f10479q;
        if (editText != null && i10 != -1) {
            editText.setMinWidth(i10);
        }
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        this.f10477p.h0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f10477p.j0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f10477p.l0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f10477p.m0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f10477p.n0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.G == null) {
            androidx.appcompat.widget.b0 b0Var = new androidx.appcompat.widget.b0(getContext());
            this.G = b0Var;
            b0Var.setId(v6.f.T);
            p0.F0(this.G, 2);
            c4.d z10 = z();
            this.J = z10;
            z10.a0(67L);
            this.K = z();
            setPlaceholderTextAppearance(this.I);
            setPlaceholderTextColor(this.H);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.F) {
                setPlaceholderTextEnabled(true);
            }
            this.E = charSequence;
        }
        t0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.I = i10;
        TextView textView = this.G;
        if (textView != null) {
            androidx.core.widget.j.o(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            TextView textView = this.G;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f10473m.m(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f10473m.n(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f10473m.o(colorStateList);
    }

    public void setShapeAppearanceModel(p7.k kVar) {
        p7.g gVar = this.Q;
        if (gVar != null && gVar.E() != kVar) {
            this.W = kVar;
            l();
        }
    }

    public void setStartIconCheckable(boolean z10) {
        this.f10473m.p(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? h.a.b(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        this.f10473m.s(i10);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f10473m.t(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10473m.u(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f10473m.v(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f10473m.w(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f10473m.x(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f10473m.y(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f10477p.o0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f10477p.p0(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f10477p.q0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f10479q;
        if (editText != null) {
            p0.u0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f10474m0) {
            this.f10474m0 = typeface;
            this.F0.N0(typeface);
            this.f10491w.N(typeface);
            TextView textView = this.B;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w0() {
        boolean z10;
        boolean z11;
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.Q != null && this.f10462c0 != 0) {
            boolean z12 = false;
            if (!isFocused() && ((editText2 = this.f10479q) == null || !editText2.hasFocus())) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!isHovered() && ((editText = this.f10479q) == null || !editText.isHovered())) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (a0() || (this.B != null && this.f10497z)) {
                z12 = true;
            }
            if (!isEnabled()) {
                this.f10468h0 = this.D0;
            } else if (a0()) {
                if (this.f10496y0 != null) {
                    v0(z10, z11);
                } else {
                    this.f10468h0 = getErrorCurrentTextColors();
                }
            } else if (this.f10497z && (textView = this.B) != null) {
                if (this.f10496y0 != null) {
                    v0(z10, z11);
                } else {
                    this.f10468h0 = textView.getCurrentTextColor();
                }
            } else if (z10) {
                this.f10468h0 = this.f10494x0;
            } else if (z11) {
                this.f10468h0 = this.f10492w0;
            } else {
                this.f10468h0 = this.f10490v0;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                k0(z12);
            }
            this.f10477p.H();
            W();
            if (this.f10462c0 == 2) {
                int i10 = this.f10464e0;
                if (z10 && isEnabled()) {
                    this.f10464e0 = this.f10467g0;
                } else {
                    this.f10464e0 = this.f10466f0;
                }
                if (this.f10464e0 != i10) {
                    U();
                }
            }
            if (this.f10462c0 == 1) {
                if (!isEnabled()) {
                    this.f10469i0 = this.A0;
                } else if (z11 && !z10) {
                    this.f10469i0 = this.C0;
                } else if (z10) {
                    this.f10469i0 = this.B0;
                } else {
                    this.f10469i0 = this.f10498z0;
                }
            }
            l();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r22, android.util.AttributeSet r23, int r24) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f10477p.P(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f10477p.R(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f10477p.b0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f10477p.i0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f10477p.k0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f10473m.q(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f10473m.r(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.q0(!r0.K0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f10493x) {
                textInputLayout.h0(editable);
            }
            if (TextInputLayout.this.F) {
                TextInputLayout.this.u0(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
