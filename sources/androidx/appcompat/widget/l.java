package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatEmojiTextHelper.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f1570a;

    /* renamed from: b  reason: collision with root package name */
    private final d3.f f1571b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(TextView textView) {
        this.f1570a = textView;
        this.f1571b = new d3.f(textView, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1571b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f1571b.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1570a.getContext().obtainStyledAttributes(attributeSet, g.j.f15865g0, i10, 0);
        try {
            int i11 = g.j.f15935u0;
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(i11)) {
                z10 = obtainStyledAttributes.getBoolean(i11, true);
            }
            obtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(boolean z10) {
        this.f1571b.c(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(boolean z10) {
        this.f1571b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f1571b.e(transformationMethod);
    }
}
