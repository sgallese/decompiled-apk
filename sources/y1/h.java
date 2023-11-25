package y1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.recyclerview.widget.RecyclerView;
import qc.q;

/* compiled from: LineHeightStyleSpan.kt */
/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: f  reason: collision with root package name */
    private final float f26180f;

    /* renamed from: m  reason: collision with root package name */
    private final int f26181m;

    /* renamed from: p  reason: collision with root package name */
    private final int f26182p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f26183q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f26184r;

    /* renamed from: s  reason: collision with root package name */
    private final float f26185s;

    /* renamed from: t  reason: collision with root package name */
    private int f26186t = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: u  reason: collision with root package name */
    private int f26187u = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: v  reason: collision with root package name */
    private int f26188v = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: w  reason: collision with root package name */
    private int f26189w = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: x  reason: collision with root package name */
    private int f26190x;

    /* renamed from: y  reason: collision with root package name */
    private int f26191y;

    public h(float f10, int i10, int i11, boolean z10, boolean z11, float f11) {
        boolean z12;
        boolean z13;
        this.f26180f = f10;
        this.f26181m = i10;
        this.f26182p = i11;
        this.f26183q = z10;
        this.f26184r = z11;
        this.f26185s = f11;
        boolean z14 = true;
        if (0.0f <= f11 && f11 <= 1.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            if (f11 == -1.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                z14 = false;
            }
        }
        if (z14) {
            return;
        }
        throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
    }

    private final void a(Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        double ceil;
        int ceil2 = (int) Math.ceil(this.f26180f);
        int a10 = ceil2 - i.a(fontMetricsInt);
        float f10 = this.f26185s;
        if (f10 == -1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = Math.abs(fontMetricsInt.ascent) / i.a(fontMetricsInt);
        }
        if (a10 <= 0) {
            ceil = Math.ceil(a10 * f10);
        } else {
            ceil = Math.ceil(a10 * (1.0f - f10));
        }
        int i10 = (int) ceil;
        int i11 = fontMetricsInt.descent;
        int i12 = i10 + i11;
        this.f26188v = i12;
        int i13 = i12 - ceil2;
        this.f26187u = i13;
        if (this.f26183q) {
            i13 = fontMetricsInt.ascent;
        }
        this.f26186t = i13;
        if (this.f26184r) {
            i12 = i11;
        }
        this.f26189w = i12;
        this.f26190x = fontMetricsInt.ascent - i13;
        this.f26191y = i12 - i11;
    }

    public final h b(int i10, int i11, boolean z10) {
        return new h(this.f26180f, i10, i11, z10, this.f26184r, this.f26185s);
    }

    public final int c() {
        return this.f26190x;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        int i14;
        int i15;
        q.i(charSequence, "text");
        q.i(fontMetricsInt, "fontMetricsInt");
        if (i.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z11 = true;
        if (i10 == this.f26181m) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 != this.f26182p) {
            z11 = false;
        }
        if (z10 && z11 && this.f26183q && this.f26184r) {
            return;
        }
        if (this.f26186t == Integer.MIN_VALUE) {
            a(fontMetricsInt);
        }
        if (z10) {
            i14 = this.f26186t;
        } else {
            i14 = this.f26187u;
        }
        fontMetricsInt.ascent = i14;
        if (z11) {
            i15 = this.f26189w;
        } else {
            i15 = this.f26188v;
        }
        fontMetricsInt.descent = i15;
    }

    public final int d() {
        return this.f26191y;
    }

    public final boolean e() {
        return this.f26184r;
    }
}
