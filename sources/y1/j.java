package y1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import qc.q;

/* compiled from: PlaceholderSpan.kt */
/* loaded from: classes.dex */
public final class j extends ReplacementSpan {

    /* renamed from: x  reason: collision with root package name */
    public static final a f26192x = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private final float f26193f;

    /* renamed from: m  reason: collision with root package name */
    private final int f26194m;

    /* renamed from: p  reason: collision with root package name */
    private final float f26195p;

    /* renamed from: q  reason: collision with root package name */
    private final int f26196q;

    /* renamed from: r  reason: collision with root package name */
    private final float f26197r;

    /* renamed from: s  reason: collision with root package name */
    private final int f26198s;

    /* renamed from: t  reason: collision with root package name */
    private Paint.FontMetricsInt f26199t;

    /* renamed from: u  reason: collision with root package name */
    private int f26200u;

    /* renamed from: v  reason: collision with root package name */
    private int f26201v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f26202w;

    /* compiled from: PlaceholderSpan.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public j(float f10, int i10, float f11, int i11, float f12, int i12) {
        this.f26193f = f10;
        this.f26194m = i10;
        this.f26195p = f11;
        this.f26196q = i11;
        this.f26197r = f12;
        this.f26198s = i12;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f26199t;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        q.z("fontMetrics");
        return null;
    }

    public final int b() {
        if (this.f26202w) {
            return this.f26201v;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public final int c() {
        return this.f26198s;
    }

    public final int d() {
        if (this.f26202w) {
            return this.f26200u;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        q.i(canvas, "canvas");
        q.i(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        float f10;
        int a10;
        q.i(paint, "paint");
        this.f26202w = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        q.h(fontMetricsInt2, "paint.fontMetricsInt");
        this.f26199t = fontMetricsInt2;
        if (a().descent > a().ascent) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i12 = this.f26194m;
            if (i12 != 0) {
                if (i12 == 1) {
                    f10 = this.f26193f * textSize;
                } else {
                    throw new IllegalArgumentException("Unsupported unit.");
                }
            } else {
                f10 = this.f26193f * this.f26197r;
            }
            this.f26200u = k.a(f10);
            int i13 = this.f26196q;
            if (i13 != 0) {
                if (i13 == 1) {
                    a10 = k.a(this.f26195p * textSize);
                } else {
                    throw new IllegalArgumentException("Unsupported unit.");
                }
            } else {
                a10 = k.a(this.f26195p * this.f26197r);
            }
            this.f26201v = a10;
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = a().ascent;
                fontMetricsInt.descent = a().descent;
                fontMetricsInt.leading = a().leading;
                switch (this.f26198s) {
                    case 0:
                        if (fontMetricsInt.ascent > (-b())) {
                            fontMetricsInt.ascent = -b();
                            break;
                        }
                        break;
                    case 1:
                    case 4:
                        if (fontMetricsInt.ascent + b() > fontMetricsInt.descent) {
                            fontMetricsInt.descent = fontMetricsInt.ascent + b();
                            break;
                        }
                        break;
                    case 2:
                    case 5:
                        if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                            fontMetricsInt.ascent = fontMetricsInt.descent - b();
                            break;
                        }
                        break;
                    case 3:
                    case 6:
                        if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                            int b10 = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                            fontMetricsInt.ascent = b10;
                            fontMetricsInt.descent = b10 + b();
                            break;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                }
                fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
            }
            return d();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }
}
