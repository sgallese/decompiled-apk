package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;

/* compiled from: Shimmer.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    final float[] f9257a = new float[4];

    /* renamed from: b  reason: collision with root package name */
    final int[] f9258b = new int[4];

    /* renamed from: c  reason: collision with root package name */
    final RectF f9259c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    int f9260d = 0;

    /* renamed from: e  reason: collision with root package name */
    int f9261e = -1;

    /* renamed from: f  reason: collision with root package name */
    int f9262f = 1291845631;

    /* renamed from: g  reason: collision with root package name */
    int f9263g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f9264h = 0;

    /* renamed from: i  reason: collision with root package name */
    int f9265i = 0;

    /* renamed from: j  reason: collision with root package name */
    float f9266j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    float f9267k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    float f9268l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    float f9269m = 0.5f;

    /* renamed from: n  reason: collision with root package name */
    float f9270n = 20.0f;

    /* renamed from: o  reason: collision with root package name */
    boolean f9271o = true;

    /* renamed from: p  reason: collision with root package name */
    boolean f9272p = true;

    /* renamed from: q  reason: collision with root package name */
    boolean f9273q = true;

    /* renamed from: r  reason: collision with root package name */
    int f9274r = -1;

    /* renamed from: s  reason: collision with root package name */
    int f9275s = 1;

    /* renamed from: t  reason: collision with root package name */
    long f9276t = 1000;

    /* renamed from: u  reason: collision with root package name */
    long f9277u;

    /* compiled from: Shimmer.java */
    /* loaded from: classes.dex */
    public static abstract class b<T extends b<T>> {

        /* renamed from: a  reason: collision with root package name */
        final a f9278a = new a();

        private static float b(float f10, float f11, float f12) {
            return Math.min(f11, Math.max(f10, f12));
        }

        public a a() {
            this.f9278a.b();
            this.f9278a.c();
            return this.f9278a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public T c(TypedArray typedArray) {
            int i10 = z5.a.f26408e;
            if (typedArray.hasValue(i10)) {
                g(typedArray.getBoolean(i10, this.f9278a.f9271o));
            }
            int i11 = z5.a.f26405b;
            if (typedArray.hasValue(i11)) {
                e(typedArray.getBoolean(i11, this.f9278a.f9272p));
            }
            int i12 = z5.a.f26406c;
            if (typedArray.hasValue(i12)) {
                f(typedArray.getFloat(i12, 0.3f));
            }
            int i13 = z5.a.f26416m;
            if (typedArray.hasValue(i13)) {
                n(typedArray.getFloat(i13, 1.0f));
            }
            if (typedArray.hasValue(z5.a.f26412i)) {
                j(typedArray.getInt(r0, (int) this.f9278a.f9276t));
            }
            int i14 = z5.a.f26419p;
            if (typedArray.hasValue(i14)) {
                p(typedArray.getInt(i14, this.f9278a.f9274r));
            }
            if (typedArray.hasValue(z5.a.f26420q)) {
                q(typedArray.getInt(r0, (int) this.f9278a.f9277u));
            }
            int i15 = z5.a.f26421r;
            if (typedArray.hasValue(i15)) {
                r(typedArray.getInt(i15, this.f9278a.f9275s));
            }
            int i16 = z5.a.f26410g;
            if (typedArray.hasValue(i16)) {
                int i17 = typedArray.getInt(i16, this.f9278a.f9260d);
                if (i17 != 1) {
                    if (i17 != 2) {
                        if (i17 != 3) {
                            h(0);
                        } else {
                            h(3);
                        }
                    } else {
                        h(2);
                    }
                } else {
                    h(1);
                }
            }
            int i18 = z5.a.f26422s;
            if (typedArray.hasValue(i18)) {
                if (typedArray.getInt(i18, this.f9278a.f9263g) != 1) {
                    s(0);
                } else {
                    s(1);
                }
            }
            int i19 = z5.a.f26411h;
            if (typedArray.hasValue(i19)) {
                i(typedArray.getFloat(i19, this.f9278a.f9269m));
            }
            int i20 = z5.a.f26414k;
            if (typedArray.hasValue(i20)) {
                l(typedArray.getDimensionPixelSize(i20, this.f9278a.f9264h));
            }
            int i21 = z5.a.f26413j;
            if (typedArray.hasValue(i21)) {
                k(typedArray.getDimensionPixelSize(i21, this.f9278a.f9265i));
            }
            int i22 = z5.a.f26418o;
            if (typedArray.hasValue(i22)) {
                o(typedArray.getFloat(i22, this.f9278a.f9268l));
            }
            int i23 = z5.a.f26424u;
            if (typedArray.hasValue(i23)) {
                u(typedArray.getFloat(i23, this.f9278a.f9266j));
            }
            int i24 = z5.a.f26415l;
            if (typedArray.hasValue(i24)) {
                m(typedArray.getFloat(i24, this.f9278a.f9267k));
            }
            int i25 = z5.a.f26423t;
            if (typedArray.hasValue(i25)) {
                t(typedArray.getFloat(i25, this.f9278a.f9270n));
            }
            return d();
        }

        protected abstract T d();

        public T e(boolean z10) {
            this.f9278a.f9272p = z10;
            return d();
        }

        public T f(float f10) {
            int b10 = (int) (b(0.0f, 1.0f, f10) * 255.0f);
            a aVar = this.f9278a;
            aVar.f9262f = (b10 << 24) | (aVar.f9262f & 16777215);
            return d();
        }

        public T g(boolean z10) {
            this.f9278a.f9271o = z10;
            return d();
        }

        public T h(int i10) {
            this.f9278a.f9260d = i10;
            return d();
        }

        public T i(float f10) {
            if (f10 >= 0.0f) {
                this.f9278a.f9269m = f10;
                return d();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f10);
        }

        public T j(long j10) {
            if (j10 >= 0) {
                this.f9278a.f9276t = j10;
                return d();
            }
            throw new IllegalArgumentException("Given a negative duration: " + j10);
        }

        public T k(int i10) {
            if (i10 >= 0) {
                this.f9278a.f9265i = i10;
                return d();
            }
            throw new IllegalArgumentException("Given invalid height: " + i10);
        }

        public T l(int i10) {
            if (i10 >= 0) {
                this.f9278a.f9264h = i10;
                return d();
            }
            throw new IllegalArgumentException("Given invalid width: " + i10);
        }

        public T m(float f10) {
            if (f10 >= 0.0f) {
                this.f9278a.f9267k = f10;
                return d();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f10);
        }

        public T n(float f10) {
            int b10 = (int) (b(0.0f, 1.0f, f10) * 255.0f);
            a aVar = this.f9278a;
            aVar.f9261e = (b10 << 24) | (aVar.f9261e & 16777215);
            return d();
        }

        public T o(float f10) {
            if (f10 >= 0.0f) {
                this.f9278a.f9268l = f10;
                return d();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f10);
        }

        public T p(int i10) {
            this.f9278a.f9274r = i10;
            return d();
        }

        public T q(long j10) {
            if (j10 >= 0) {
                this.f9278a.f9277u = j10;
                return d();
            }
            throw new IllegalArgumentException("Given a negative repeat delay: " + j10);
        }

        public T r(int i10) {
            this.f9278a.f9275s = i10;
            return d();
        }

        public T s(int i10) {
            this.f9278a.f9263g = i10;
            return d();
        }

        public T t(float f10) {
            this.f9278a.f9270n = f10;
            return d();
        }

        public T u(float f10) {
            if (f10 >= 0.0f) {
                this.f9278a.f9266j = f10;
                return d();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f10);
        }
    }

    a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i10) {
        int i11 = this.f9265i;
        if (i11 <= 0) {
            return Math.round(this.f9267k * i10);
        }
        return i11;
    }

    void b() {
        if (this.f9263g != 1) {
            int[] iArr = this.f9258b;
            int i10 = this.f9262f;
            iArr[0] = i10;
            int i11 = this.f9261e;
            iArr[1] = i11;
            iArr[2] = i11;
            iArr[3] = i10;
            return;
        }
        int[] iArr2 = this.f9258b;
        int i12 = this.f9261e;
        iArr2[0] = i12;
        iArr2[1] = i12;
        int i13 = this.f9262f;
        iArr2[2] = i13;
        iArr2[3] = i13;
    }

    void c() {
        if (this.f9263g != 1) {
            this.f9257a[0] = Math.max(((1.0f - this.f9268l) - this.f9269m) / 2.0f, 0.0f);
            this.f9257a[1] = Math.max(((1.0f - this.f9268l) - 0.001f) / 2.0f, 0.0f);
            this.f9257a[2] = Math.min(((this.f9268l + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.f9257a[3] = Math.min(((this.f9268l + 1.0f) + this.f9269m) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.f9257a;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.f9268l, 1.0f);
        this.f9257a[2] = Math.min(this.f9268l + this.f9269m, 1.0f);
        this.f9257a[3] = 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d(int i10) {
        int i11 = this.f9264h;
        if (i11 <= 0) {
            return Math.round(this.f9266j * i10);
        }
        return i11;
    }

    /* compiled from: Shimmer.java */
    /* renamed from: com.facebook.shimmer.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0228a extends b<C0228a> {
        public C0228a() {
            this.f9278a.f9273q = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.shimmer.a.b
        /* renamed from: v  reason: merged with bridge method [inline-methods] */
        public C0228a d() {
            return this;
        }
    }

    /* compiled from: Shimmer.java */
    /* loaded from: classes.dex */
    public static class c extends b<c> {
        public c() {
            this.f9278a.f9273q = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.facebook.shimmer.a.b
        /* renamed from: v  reason: merged with bridge method [inline-methods] */
        public c c(TypedArray typedArray) {
            super.c(typedArray);
            int i10 = z5.a.f26407d;
            if (typedArray.hasValue(i10)) {
                x(typedArray.getColor(i10, this.f9278a.f9262f));
            }
            int i11 = z5.a.f26417n;
            if (typedArray.hasValue(i11)) {
                y(typedArray.getColor(i11, this.f9278a.f9261e));
            }
            return d();
        }

        public c x(int i10) {
            a aVar = this.f9278a;
            aVar.f9262f = (i10 & 16777215) | (aVar.f9262f & (-16777216));
            return d();
        }

        public c y(int i10) {
            this.f9278a.f9261e = i10;
            return d();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.shimmer.a.b
        /* renamed from: w  reason: merged with bridge method [inline-methods] */
        public c d() {
            return this;
        }
    }
}
