package w1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: TextLayout.kt */
/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a */
    private final boolean f25294a;

    /* renamed from: b */
    private final boolean f25295b;

    /* renamed from: c */
    private final k f25296c;

    /* renamed from: d */
    private final boolean f25297d;

    /* renamed from: e */
    private final Layout f25298e;

    /* renamed from: f */
    private final int f25299f;

    /* renamed from: g */
    private final int f25300g;

    /* renamed from: h */
    private final int f25301h;

    /* renamed from: i */
    private final float f25302i;

    /* renamed from: j */
    private final float f25303j;

    /* renamed from: k */
    private final boolean f25304k;

    /* renamed from: l */
    private final Paint.FontMetricsInt f25305l;

    /* renamed from: m */
    private final int f25306m;

    /* renamed from: n */
    private final y1.h[] f25307n;

    /* renamed from: o */
    private final Rect f25308o;

    /* renamed from: p */
    private final dc.f f25309p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextLayout.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.a<j> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            n1.this = r1;
        }

        @Override // pc.a
        /* renamed from: a */
        public final j invoke() {
            return new j(n1.this.g());
        }
    }

    public n1(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, k kVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        Layout a10;
        long k10;
        y1.h[] i18;
        long h10;
        Paint.FontMetricsInt g10;
        dc.f a11;
        qc.q.i(charSequence, "charSequence");
        qc.q.i(textPaint, "textPaint");
        qc.q.i(kVar, "layoutIntrinsics");
        this.f25294a = z10;
        this.f25295b = z11;
        this.f25296c = kVar;
        this.f25308o = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic j10 = o1.j(i11);
        Layout.Alignment a12 = s0.f25341a.a(i10);
        boolean z12 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, y1.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a13 = kVar.a();
            double d10 = f10;
            int ceil = (int) Math.ceil(d10);
            if (a13 != null && kVar.b() <= f10 && !z12) {
                this.f25304k = true;
                a10 = e.f25265a.a(charSequence, textPaint, ceil, a13, a12, z10, z11, truncateAt, ceil);
                textDirectionHeuristic = j10;
            } else {
                this.f25304k = false;
                textDirectionHeuristic = j10;
                a10 = o0.f25312a.a(charSequence, 0, charSequence.length(), textPaint, ceil, j10, a12, i12, truncateAt, (int) Math.ceil(d10), f11, f12, i17, z10, z11, i13, i14, i15, i16, iArr, iArr2);
            }
            this.f25298e = a10;
            Trace.endSection();
            int min = Math.min(a10.getLineCount(), i12);
            this.f25299f = min;
            int i19 = min - 1;
            this.f25297d = min >= i12 && (a10.getEllipsisCount(i19) > 0 || a10.getLineEnd(i19) != charSequence.length());
            k10 = o1.k(this);
            i18 = o1.i(this);
            this.f25307n = i18;
            h10 = o1.h(this, i18);
            this.f25300g = Math.max(p1.c(k10), p1.c(h10));
            this.f25301h = Math.max(p1.b(k10), p1.b(h10));
            g10 = o1.g(this, textPaint, textDirectionHeuristic, i18);
            this.f25306m = g10 != null ? g10.bottom - ((int) q(i19)) : 0;
            this.f25305l = g10;
            this.f25302i = y1.d.b(a10, i19, null, 2, null);
            this.f25303j = y1.d.d(a10, i19, null, 2, null);
            a11 = dc.h.a(dc.j.NONE, new a());
            this.f25309p = a11;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static /* synthetic */ float B(n1 n1Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return n1Var.A(i10, z10);
    }

    private final float e(int i10) {
        if (i10 == this.f25299f - 1) {
            return this.f25302i + this.f25303j;
        }
        return 0.0f;
    }

    private final j h() {
        return (j) this.f25309p.getValue();
    }

    public static /* synthetic */ float z(n1 n1Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return n1Var.y(i10, z10);
    }

    public final float A(int i10, boolean z10) {
        return h().c(i10, false, z10) + e(o(i10));
    }

    public final void C(int i10, int i11, Path path) {
        qc.q.i(path, "dest");
        this.f25298e.getSelectionPath(i10, i11, path);
        if (this.f25300g != 0 && !path.isEmpty()) {
            path.offset(0.0f, this.f25300g);
        }
    }

    public final CharSequence D() {
        CharSequence text = this.f25298e.getText();
        qc.q.h(text, "layout.text");
        return text;
    }

    public final boolean E() {
        if (this.f25304k) {
            e eVar = e.f25265a;
            Layout layout = this.f25298e;
            qc.q.g(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return eVar.b((BoringLayout) layout);
        }
        o0 o0Var = o0.f25312a;
        Layout layout2 = this.f25298e;
        qc.q.g(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return o0Var.c((StaticLayout) layout2, this.f25295b);
    }

    public final boolean F(int i10) {
        return this.f25298e.isRtlCharAt(i10);
    }

    public final void G(Canvas canvas) {
        m1 m1Var;
        qc.q.i(canvas, "canvas");
        if (!canvas.getClipBounds(this.f25308o)) {
            return;
        }
        int i10 = this.f25300g;
        if (i10 != 0) {
            canvas.translate(0.0f, i10);
        }
        m1Var = o1.f25315a;
        m1Var.a(canvas);
        this.f25298e.draw(m1Var);
        int i11 = this.f25300g;
        if (i11 != 0) {
            canvas.translate(0.0f, (-1) * i11);
        }
    }

    public final RectF a(int i10) {
        boolean z10;
        float A;
        float A2;
        float y10;
        float y11;
        int o10 = o(i10);
        float u10 = u(o10);
        float j10 = j(o10);
        if (x(o10) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isRtlCharAt = this.f25298e.isRtlCharAt(i10);
        if (z10 && !isRtlCharAt) {
            A = y(i10, false);
            A2 = y(i10 + 1, true);
        } else {
            if (z10 && isRtlCharAt) {
                y10 = A(i10, false);
                y11 = A(i10 + 1, true);
            } else if (isRtlCharAt) {
                y10 = y(i10, false);
                y11 = y(i10 + 1, true);
            } else {
                A = A(i10, false);
                A2 = A(i10 + 1, true);
            }
            float f10 = y10;
            A = y11;
            A2 = f10;
        }
        return new RectF(A, u10, A2, j10);
    }

    public final boolean b() {
        return this.f25297d;
    }

    public final boolean c() {
        return this.f25295b;
    }

    public final int d() {
        int height;
        if (this.f25297d) {
            height = this.f25298e.getLineBottom(this.f25299f - 1);
        } else {
            height = this.f25298e.getHeight();
        }
        return height + this.f25300g + this.f25301h + this.f25306m;
    }

    public final boolean f() {
        return this.f25294a;
    }

    public final Layout g() {
        return this.f25298e;
    }

    public final float i(int i10) {
        float lineBaseline;
        float f10 = this.f25300g;
        if (i10 == this.f25299f - 1 && this.f25305l != null) {
            lineBaseline = u(i10) - this.f25305l.ascent;
        } else {
            lineBaseline = this.f25298e.getLineBaseline(i10);
        }
        return f10 + lineBaseline;
    }

    public final float j(int i10) {
        int i11;
        if (i10 == this.f25299f - 1 && this.f25305l != null) {
            return this.f25298e.getLineBottom(i10 - 1) + this.f25305l.bottom;
        }
        float lineBottom = this.f25300g + this.f25298e.getLineBottom(i10);
        if (i10 == this.f25299f - 1) {
            i11 = this.f25301h;
        } else {
            i11 = 0;
        }
        return lineBottom + i11;
    }

    public final int k() {
        return this.f25299f;
    }

    public final int l(int i10) {
        return this.f25298e.getEllipsisCount(i10);
    }

    public final int m(int i10) {
        return this.f25298e.getEllipsisStart(i10);
    }

    public final int n(int i10) {
        if (this.f25298e.getEllipsisStart(i10) == 0) {
            return this.f25298e.getLineEnd(i10);
        }
        return this.f25298e.getText().length();
    }

    public final int o(int i10) {
        return this.f25298e.getLineForOffset(i10);
    }

    public final int p(int i10) {
        return this.f25298e.getLineForVertical(i10 - this.f25300g);
    }

    public final float q(int i10) {
        return j(i10) - u(i10);
    }

    public final float r(int i10) {
        float f10;
        float lineLeft = this.f25298e.getLineLeft(i10);
        if (i10 == this.f25299f - 1) {
            f10 = this.f25302i;
        } else {
            f10 = 0.0f;
        }
        return lineLeft + f10;
    }

    public final float s(int i10) {
        float f10;
        float lineRight = this.f25298e.getLineRight(i10);
        if (i10 == this.f25299f - 1) {
            f10 = this.f25303j;
        } else {
            f10 = 0.0f;
        }
        return lineRight + f10;
    }

    public final int t(int i10) {
        return this.f25298e.getLineStart(i10);
    }

    public final float u(int i10) {
        int i11;
        float lineTop = this.f25298e.getLineTop(i10);
        if (i10 == 0) {
            i11 = 0;
        } else {
            i11 = this.f25300g;
        }
        return lineTop + i11;
    }

    public final int v(int i10) {
        if (this.f25298e.getEllipsisStart(i10) == 0) {
            return this.f25298e.getLineVisibleEnd(i10);
        }
        return this.f25298e.getEllipsisStart(i10) + this.f25298e.getLineStart(i10);
    }

    public final int w(int i10, float f10) {
        return this.f25298e.getOffsetForHorizontal(i10, f10 + ((-1) * e(i10)));
    }

    public final int x(int i10) {
        return this.f25298e.getParagraphDirection(i10);
    }

    public final float y(int i10, boolean z10) {
        return h().c(i10, true, z10) + e(o(i10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ n1(java.lang.CharSequence r24, float r25, android.text.TextPaint r26, int r27, android.text.TextUtils.TruncateAt r28, int r29, float r30, float r31, boolean r32, boolean r33, int r34, int r35, int r36, int r37, int r38, int r39, int[] r40, int[] r41, w1.k r42, int r43, qc.h r44) {
        /*
            Method dump skipped, instructions count: 180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.n1.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int, int, int[], int[], w1.k, int, qc.h):void");
    }
}
