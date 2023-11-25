package w1;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: StaticLayoutFactory.kt */
/* loaded from: classes.dex */
final class r0 {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f25320a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25321b;

    /* renamed from: c  reason: collision with root package name */
    private final int f25322c;

    /* renamed from: d  reason: collision with root package name */
    private final TextPaint f25323d;

    /* renamed from: e  reason: collision with root package name */
    private final int f25324e;

    /* renamed from: f  reason: collision with root package name */
    private final TextDirectionHeuristic f25325f;

    /* renamed from: g  reason: collision with root package name */
    private final Layout.Alignment f25326g;

    /* renamed from: h  reason: collision with root package name */
    private final int f25327h;

    /* renamed from: i  reason: collision with root package name */
    private final TextUtils.TruncateAt f25328i;

    /* renamed from: j  reason: collision with root package name */
    private final int f25329j;

    /* renamed from: k  reason: collision with root package name */
    private final float f25330k;

    /* renamed from: l  reason: collision with root package name */
    private final float f25331l;

    /* renamed from: m  reason: collision with root package name */
    private final int f25332m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f25333n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f25334o;

    /* renamed from: p  reason: collision with root package name */
    private final int f25335p;

    /* renamed from: q  reason: collision with root package name */
    private final int f25336q;

    /* renamed from: r  reason: collision with root package name */
    private final int f25337r;

    /* renamed from: s  reason: collision with root package name */
    private final int f25338s;

    /* renamed from: t  reason: collision with root package name */
    private final int[] f25339t;

    /* renamed from: u  reason: collision with root package name */
    private final int[] f25340u;

    public r0(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        qc.q.i(charSequence, "text");
        qc.q.i(textPaint, "paint");
        qc.q.i(textDirectionHeuristic, "textDir");
        qc.q.i(alignment, "alignment");
        this.f25320a = charSequence;
        this.f25321b = i10;
        this.f25322c = i11;
        this.f25323d = textPaint;
        this.f25324e = i12;
        this.f25325f = textDirectionHeuristic;
        this.f25326g = alignment;
        this.f25327h = i13;
        this.f25328i = truncateAt;
        this.f25329j = i14;
        this.f25330k = f10;
        this.f25331l = f11;
        this.f25332m = i15;
        this.f25333n = z10;
        this.f25334o = z11;
        this.f25335p = i16;
        this.f25336q = i17;
        this.f25337r = i18;
        this.f25338s = i19;
        this.f25339t = iArr;
        this.f25340u = iArr2;
        if (!(i10 >= 0 && i10 <= i11)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i13 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i14 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(f10 >= 0.0f)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final Layout.Alignment a() {
        return this.f25326g;
    }

    public final int b() {
        return this.f25335p;
    }

    public final TextUtils.TruncateAt c() {
        return this.f25328i;
    }

    public final int d() {
        return this.f25329j;
    }

    public final int e() {
        return this.f25322c;
    }

    public final int f() {
        return this.f25338s;
    }

    public final boolean g() {
        return this.f25333n;
    }

    public final int h() {
        return this.f25332m;
    }

    public final int[] i() {
        return this.f25339t;
    }

    public final int j() {
        return this.f25336q;
    }

    public final int k() {
        return this.f25337r;
    }

    public final float l() {
        return this.f25331l;
    }

    public final float m() {
        return this.f25330k;
    }

    public final int n() {
        return this.f25327h;
    }

    public final TextPaint o() {
        return this.f25323d;
    }

    public final int[] p() {
        return this.f25340u;
    }

    public final int q() {
        return this.f25321b;
    }

    public final CharSequence r() {
        return this.f25320a;
    }

    public final TextDirectionHeuristic s() {
        return this.f25325f;
    }

    public final boolean t() {
        return this.f25334o;
    }

    public final int u() {
        return this.f25324e;
    }
}
