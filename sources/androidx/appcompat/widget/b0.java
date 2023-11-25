package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.text.t;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: AppCompatTextView.java */
/* loaded from: classes.dex */
public class b0 extends TextView implements androidx.core.widget.n {
    private final e mBackgroundTintHelper;
    private l mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<androidx.core.text.t> mPrecomputedTextFuture;
    private a mSuperCaller;
    private final z mTextClassifierHelper;
    private final a0 mTextHelper;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatTextView.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(int[] iArr, int i10);

        int[] b();

        TextClassifier c();

        int d();

        void e(TextClassifier textClassifier);

        void f(int i10);

        void g(int i10, int i11, int i12, int i13);

        int h();

        int i();

        void j(int i10);

        int k();

        void l(int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextView.java */
    /* loaded from: classes.dex */
    public class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.b0.b, androidx.appcompat.widget.b0.a
        public void f(int i10) {
            b0.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.b0.b, androidx.appcompat.widget.b0.a
        public void j(int i10) {
            b0.super.setFirstBaselineToTopHeight(i10);
        }
    }

    public b0(Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<androidx.core.text.t> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                androidx.core.widget.j.n(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private l getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new l(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.b();
        }
        a0 a0Var = this.mTextHelper;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (r1.f1662b) {
            return getSuperCaller().d();
        }
        a0 a0Var = this.mTextHelper;
        if (a0Var != null) {
            return a0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (r1.f1662b) {
            return getSuperCaller().i();
        }
        a0 a0Var = this.mTextHelper;
        if (a0Var != null) {
            return a0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (r1.f1662b) {
            return getSuperCaller().k();
        }
        a0 a0Var = this.mTextHelper;
        if (a0Var != null) {
            return a0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (r1.f1662b) {
            return getSuperCaller().b();
        }
        a0 a0Var = this.mTextHelper;
        if (a0Var != null) {
            return a0Var.h();
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (r1.f1662b) {
            if (getSuperCaller().h() != 1) {
                return 0;
            }
            return 1;
        }
        a0 a0Var = this.mTextHelper;
        if (a0Var == null) {
            return 0;
        }
        return a0Var.i();
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.q(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.j.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.j.c(this);
    }

    a getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                this.mSuperCaller = new c();
            } else if (i10 >= 26) {
                this.mSuperCaller = new b();
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        z zVar;
        if (Build.VERSION.SDK_INT < 28 && (zVar = this.mTextClassifierHelper) != null) {
            return zVar.a();
        }
        return getSuperCaller().c();
    }

    public t.a getTextMetricsParamsCompat() {
        return androidx.core.widget.j.g(this);
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, onCreateInputConnection, editorInfo);
        return m.a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a0 a0Var = this.mTextHelper;
        if (a0Var != null) {
            a0Var.o(z10, i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        super.onTextChanged(charSequence, i10, i11, i12);
        a0 a0Var = this.mTextHelper;
        if (a0Var != null && !r1.f1662b && a0Var.l()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.mTextHelper.c();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (r1.f1662b) {
            getSuperCaller().g(i10, i11, i12, i13);
            return;
        }
        a0 a0Var = this.mTextHelper;
        if (a0Var != null) {
            a0Var.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (r1.f1662b) {
            getSuperCaller().a(iArr, i10);
            return;
        }
        a0 a0Var = this.mTextHelper;
        if (a0Var != null) {
            a0Var.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (r1.f1662b) {
            getSuperCaller().l(i10);
            return;
        }
        a0 a0Var = this.mTextHelper;
        if (a0Var != null) {
            a0Var.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.mTextHelper;
        if (a0Var != null) {
            a0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.mTextHelper;
        if (a0Var != null) {
            a0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.mTextHelper;
        if (a0Var != null) {
            a0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.mTextHelper;
        if (a0Var != null) {
            a0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i10);
        } else {
            androidx.core.widget.j.k(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i10);
        } else {
            androidx.core.widget.j.l(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        androidx.core.widget.j.m(this, i10);
    }

    public void setPrecomputedText(androidx.core.text.t tVar) {
        androidx.core.widget.j.n(this, tVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.n
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.w(colorStateList);
        this.mTextHelper.b();
    }

    @Override // androidx.core.widget.n
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.x(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        a0 a0Var = this.mTextHelper;
        if (a0Var != null) {
            a0Var.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT < 28 && (zVar = this.mTextClassifierHelper) != null) {
            zVar.b(textClassifier);
        } else {
            getSuperCaller().e(textClassifier);
        }
    }

    public void setTextFuture(Future<androidx.core.text.t> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(t.a aVar) {
        androidx.core.widget.j.p(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (r1.f1662b) {
            super.setTextSize(i10, f10);
            return;
        }
        a0 a0Var = this.mTextHelper;
        if (a0Var != null) {
            a0Var.A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        Typeface typeface2;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface != null && i10 > 0) {
            typeface2 = androidx.core.graphics.e.a(getContext(), typeface, i10);
        } else {
            typeface2 = null;
        }
        this.mIsSetTypefaceProcessing = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public b0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public b0(Context context, AttributeSet attributeSet, int i10) {
        super(d1.b(context), attributeSet, i10);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        b1.a(this, getContext());
        e eVar = new e(this);
        this.mBackgroundTintHelper = eVar;
        eVar.e(attributeSet, i10);
        a0 a0Var = new a0(this);
        this.mTextHelper = a0Var;
        a0Var.m(attributeSet, i10);
        a0Var.b();
        this.mTextClassifierHelper = new z(this);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? h.a.b(context, i10) : null, i11 != 0 ? h.a.b(context, i11) : null, i12 != 0 ? h.a.b(context, i12) : null, i13 != 0 ? h.a.b(context, i13) : null);
        a0 a0Var = this.mTextHelper;
        if (a0Var != null) {
            a0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? h.a.b(context, i10) : null, i11 != 0 ? h.a.b(context, i11) : null, i12 != 0 ? h.a.b(context, i12) : null, i13 != 0 ? h.a.b(context, i13) : null);
        a0 a0Var = this.mTextHelper;
        if (a0Var != null) {
            a0Var.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextView.java */
    /* loaded from: classes.dex */
    public class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.b0.a
        public void a(int[] iArr, int i10) {
            b0.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // androidx.appcompat.widget.b0.a
        public int[] b() {
            return b0.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.b0.a
        public TextClassifier c() {
            return b0.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.b0.a
        public int d() {
            return b0.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.b0.a
        public void e(TextClassifier textClassifier) {
            b0.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.b0.a
        public void g(int i10, int i11, int i12, int i13) {
            b0.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @Override // androidx.appcompat.widget.b0.a
        public int h() {
            return b0.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.b0.a
        public int i() {
            return b0.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.b0.a
        public int k() {
            return b0.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.b0.a
        public void l(int i10) {
            b0.super.setAutoSizeTextTypeWithDefaults(i10);
        }

        @Override // androidx.appcompat.widget.b0.a
        public void f(int i10) {
        }

        @Override // androidx.appcompat.widget.b0.a
        public void j(int i10) {
        }
    }
}
