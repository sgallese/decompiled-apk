package d3;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.util.i;

/* compiled from: EmojiTextViewHelper.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final b f13110a;

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: classes.dex */
    private static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final TextView f13111a;

        /* renamed from: b  reason: collision with root package name */
        private final d f13112b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f13113c = true;

        a(TextView textView) {
            this.f13111a = textView;
            this.f13112b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f13112b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f13112b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> g(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> g10 = g(inputFilterArr);
            if (g10.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - g10.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (g10.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof h) {
                return ((h) transformationMethod).a();
            }
            return transformationMethod;
        }

        private void k() {
            this.f13111a.setFilters(a(this.f13111a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof h) {
                return transformationMethod;
            }
            if (transformationMethod instanceof PasswordTransformationMethod) {
                return transformationMethod;
            }
            return new h(transformationMethod);
        }

        @Override // d3.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f13113c) {
                return h(inputFilterArr);
            }
            return f(inputFilterArr);
        }

        @Override // d3.f.b
        public boolean b() {
            return this.f13113c;
        }

        @Override // d3.f.b
        void c(boolean z10) {
            if (z10) {
                l();
            }
        }

        @Override // d3.f.b
        void d(boolean z10) {
            this.f13113c = z10;
            l();
            k();
        }

        @Override // d3.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            if (this.f13113c) {
                return m(transformationMethod);
            }
            return j(transformationMethod);
        }

        void i(boolean z10) {
            this.f13113c = z10;
        }

        void l() {
            this.f13111a.setTransformationMethod(e(this.f13111a.getTransformationMethod()));
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: classes.dex */
    static class b {
        b() {
        }

        InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        void c(boolean z10) {
            throw null;
        }

        void d(boolean z10) {
            throw null;
        }

        TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: classes.dex */
    private static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final a f13114a;

        c(TextView textView) {
            this.f13114a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.f.k();
        }

        @Override // d3.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            if (f()) {
                return inputFilterArr;
            }
            return this.f13114a.a(inputFilterArr);
        }

        @Override // d3.f.b
        public boolean b() {
            return this.f13114a.b();
        }

        @Override // d3.f.b
        void c(boolean z10) {
            if (f()) {
                return;
            }
            this.f13114a.c(z10);
        }

        @Override // d3.f.b
        void d(boolean z10) {
            if (f()) {
                this.f13114a.i(z10);
            } else {
                this.f13114a.d(z10);
            }
        }

        @Override // d3.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            if (f()) {
                return transformationMethod;
            }
            return this.f13114a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z10) {
        i.h(textView, "textView cannot be null");
        if (!z10) {
            this.f13110a = new c(textView);
        } else {
            this.f13110a = new a(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f13110a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f13110a.b();
    }

    public void c(boolean z10) {
        this.f13110a.c(z10);
    }

    public void d(boolean z10) {
        this.f13110a.d(z10);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f13110a.e(transformationMethod);
    }
}
