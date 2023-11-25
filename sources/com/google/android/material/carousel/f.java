package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.c;

/* compiled from: MultiBrowseCarouselStrategy.java */
/* loaded from: classes3.dex */
public final class f extends b {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f9811b = {1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f9812c = {1, 0};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f9813d = {0};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f9814a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultiBrowseCarouselStrategy.java */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int f9815a;

        /* renamed from: b  reason: collision with root package name */
        float f9816b;

        /* renamed from: c  reason: collision with root package name */
        final int f9817c;

        /* renamed from: d  reason: collision with root package name */
        final int f9818d;

        /* renamed from: e  reason: collision with root package name */
        float f9819e;

        /* renamed from: f  reason: collision with root package name */
        float f9820f;

        /* renamed from: g  reason: collision with root package name */
        final int f9821g;

        /* renamed from: h  reason: collision with root package name */
        final float f9822h;

        a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
            this.f9815a = i10;
            this.f9816b = t2.a.a(f10, f11, f12);
            this.f9817c = i11;
            this.f9819e = f13;
            this.f9818d = i12;
            this.f9820f = f14;
            this.f9821g = i13;
            c(f15, f11, f12, f14);
            this.f9822h = b(f14);
        }

        private float a(float f10, int i10, float f11, int i11, int i12) {
            if (i10 <= 0) {
                f11 = 0.0f;
            }
            float f12 = i11 / 2.0f;
            return (f10 - ((i10 + f12) * f11)) / (i12 + f12);
        }

        private float b(float f10) {
            if (!e()) {
                return Float.MAX_VALUE;
            }
            return Math.abs(f10 - this.f9820f) * this.f9815a;
        }

        private void c(float f10, float f11, float f12, float f13) {
            float d10 = f10 - d();
            int i10 = this.f9817c;
            if (i10 > 0 && d10 > 0.0f) {
                float f14 = this.f9816b;
                this.f9816b = f14 + Math.min(d10 / i10, f12 - f14);
            } else if (i10 > 0 && d10 < 0.0f) {
                float f15 = this.f9816b;
                this.f9816b = f15 + Math.max(d10 / i10, f11 - f15);
            }
            float a10 = a(f10, this.f9817c, this.f9816b, this.f9818d, this.f9821g);
            this.f9820f = a10;
            float f16 = (this.f9816b + a10) / 2.0f;
            this.f9819e = f16;
            int i11 = this.f9818d;
            if (i11 > 0 && a10 != f13) {
                float f17 = (f13 - a10) * this.f9821g;
                float min = Math.min(Math.abs(f17), f16 * 0.1f * i11);
                if (f17 > 0.0f) {
                    this.f9819e -= min / this.f9818d;
                    this.f9820f += min / this.f9821g;
                    return;
                }
                this.f9819e += min / this.f9818d;
                this.f9820f -= min / this.f9821g;
            }
        }

        private float d() {
            return (this.f9820f * this.f9821g) + (this.f9819e * this.f9818d) + (this.f9816b * this.f9817c);
        }

        private boolean e() {
            int i10 = this.f9821g;
            if (i10 > 0 && this.f9817c > 0 && this.f9818d > 0) {
                float f10 = this.f9820f;
                float f11 = this.f9819e;
                if (f10 <= f11 || f11 <= this.f9816b) {
                    return false;
                }
                return true;
            } else if (i10 > 0 && this.f9817c > 0 && this.f9820f <= this.f9816b) {
                return false;
            } else {
                return true;
            }
        }

        public String toString() {
            return "Arrangement [priority=" + this.f9815a + ", smallCount=" + this.f9817c + ", smallSize=" + this.f9816b + ", mediumCount=" + this.f9818d + ", mediumSize=" + this.f9819e + ", largeCount=" + this.f9821g + ", largeSize=" + this.f9820f + ", cost=" + this.f9822h + "]";
        }
    }

    public f() {
        this(false);
    }

    private static a c(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = i14;
                    int i16 = length2;
                    int i17 = i12;
                    int i18 = length;
                    a aVar2 = new a(i10, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    if (aVar == null || aVar2.f9822h < aVar.f9822h) {
                        if (aVar2.f9822h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    i10++;
                    i14 = i15 + 1;
                    length2 = i16;
                    i12 = i17;
                    length = i18;
                }
                i12++;
            }
        }
        return aVar;
    }

    private float d(Context context) {
        return context.getResources().getDimension(v6.d.f24690o);
    }

    private float e(Context context) {
        return context.getResources().getDimension(v6.d.f24691p);
    }

    private float f(Context context) {
        return context.getResources().getDimension(v6.d.f24692q);
    }

    private static int g(int[] iArr) {
        int i10 = RecyclerView.UNDEFINED_DURATION;
        for (int i11 : iArr) {
            if (i11 > i10) {
                i10 = i11;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.carousel.b
    public c b(com.google.android.material.carousel.a aVar, View view) {
        int[] iArr;
        float f10;
        float a10 = aVar.a();
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f11 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        float f12 = f(view.getContext()) + f11;
        float e10 = e(view.getContext()) + f11;
        float measuredWidth = view.getMeasuredWidth();
        float min = Math.min(measuredWidth + f11, a10);
        float a11 = t2.a.a((measuredWidth / 3.0f) + f11, f(view.getContext()) + f11, e(view.getContext()) + f11);
        float f13 = (min + a11) / 2.0f;
        int[] iArr2 = f9811b;
        if (this.f9814a) {
            iArr = f9813d;
        } else {
            iArr = f9812c;
        }
        int max = (int) Math.max(1.0d, Math.floor(((a10 - (g(iArr) * f13)) - (g(iArr2) * e10)) / min));
        int ceil = (int) Math.ceil(a10 / min);
        int i10 = (ceil - max) + 1;
        int[] iArr3 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr3[i11] = ceil - i11;
        }
        a c10 = c(a10, a11, f12, e10, iArr2, f13, iArr, min, iArr3);
        float d10 = d(view.getContext()) + f11;
        float f14 = d10 / 2.0f;
        float f15 = 0.0f - f14;
        float f16 = (c10.f9820f / 2.0f) + 0.0f;
        float max2 = Math.max(0, c10.f9821g - 1);
        float f17 = c10.f9820f;
        float f18 = f16 + (max2 * f17);
        float f19 = (f17 / 2.0f) + f18;
        int i12 = c10.f9818d;
        if (i12 > 0) {
            f18 = (c10.f9819e / 2.0f) + f19;
        }
        if (i12 > 0) {
            f19 = (c10.f9819e / 2.0f) + f18;
        }
        if (c10.f9817c > 0) {
            f10 = f19 + (c10.f9816b / 2.0f);
        } else {
            f10 = f18;
        }
        float a12 = aVar.a() + f14;
        float a13 = b.a(d10, c10.f9820f, f11);
        float a14 = b.a(c10.f9816b, c10.f9820f, f11);
        float a15 = b.a(c10.f9819e, c10.f9820f, f11);
        c.b d11 = new c.b(c10.f9820f).a(f15, a13, d10).d(f16, 0.0f, c10.f9820f, c10.f9821g, true);
        if (c10.f9818d > 0) {
            d11.a(f18, a15, c10.f9819e);
        }
        int i13 = c10.f9817c;
        if (i13 > 0) {
            d11.c(f10, a14, c10.f9816b, i13);
        }
        d11.a(a12, a13, d10);
        return d11.e();
    }

    public f(boolean z10) {
        this.f9814a = z10;
    }
}
