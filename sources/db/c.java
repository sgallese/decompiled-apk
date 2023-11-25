package db;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: MarkwonTheme.java */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: x  reason: collision with root package name */
    private static final float[] f13196x = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};

    /* renamed from: a  reason: collision with root package name */
    protected final int f13197a;

    /* renamed from: b  reason: collision with root package name */
    protected final boolean f13198b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f13199c;

    /* renamed from: d  reason: collision with root package name */
    protected final int f13200d;

    /* renamed from: e  reason: collision with root package name */
    protected final int f13201e;

    /* renamed from: f  reason: collision with root package name */
    protected final int f13202f;

    /* renamed from: g  reason: collision with root package name */
    protected final int f13203g;

    /* renamed from: h  reason: collision with root package name */
    protected final int f13204h;

    /* renamed from: i  reason: collision with root package name */
    protected final int f13205i;

    /* renamed from: j  reason: collision with root package name */
    protected final int f13206j;

    /* renamed from: k  reason: collision with root package name */
    protected final int f13207k;

    /* renamed from: l  reason: collision with root package name */
    protected final int f13208l;

    /* renamed from: m  reason: collision with root package name */
    protected final int f13209m;

    /* renamed from: n  reason: collision with root package name */
    protected final Typeface f13210n;

    /* renamed from: o  reason: collision with root package name */
    protected final Typeface f13211o;

    /* renamed from: p  reason: collision with root package name */
    protected final int f13212p;

    /* renamed from: q  reason: collision with root package name */
    protected final int f13213q;

    /* renamed from: r  reason: collision with root package name */
    protected final int f13214r;

    /* renamed from: s  reason: collision with root package name */
    protected final int f13215s;

    /* renamed from: t  reason: collision with root package name */
    protected final Typeface f13216t;

    /* renamed from: u  reason: collision with root package name */
    protected final float[] f13217u;

    /* renamed from: v  reason: collision with root package name */
    protected final int f13218v;

    /* renamed from: w  reason: collision with root package name */
    protected final int f13219w;

    /* compiled from: MarkwonTheme.java */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f13220a;

        /* renamed from: c  reason: collision with root package name */
        private int f13222c;

        /* renamed from: d  reason: collision with root package name */
        private int f13223d;

        /* renamed from: e  reason: collision with root package name */
        private int f13224e;

        /* renamed from: f  reason: collision with root package name */
        private int f13225f;

        /* renamed from: g  reason: collision with root package name */
        private int f13226g;

        /* renamed from: h  reason: collision with root package name */
        private int f13227h;

        /* renamed from: i  reason: collision with root package name */
        private int f13228i;

        /* renamed from: j  reason: collision with root package name */
        private int f13229j;

        /* renamed from: k  reason: collision with root package name */
        private int f13230k;

        /* renamed from: l  reason: collision with root package name */
        private int f13231l;

        /* renamed from: m  reason: collision with root package name */
        private int f13232m;

        /* renamed from: n  reason: collision with root package name */
        private Typeface f13233n;

        /* renamed from: o  reason: collision with root package name */
        private Typeface f13234o;

        /* renamed from: p  reason: collision with root package name */
        private int f13235p;

        /* renamed from: q  reason: collision with root package name */
        private int f13236q;

        /* renamed from: s  reason: collision with root package name */
        private int f13238s;

        /* renamed from: t  reason: collision with root package name */
        private Typeface f13239t;

        /* renamed from: u  reason: collision with root package name */
        private float[] f13240u;

        /* renamed from: v  reason: collision with root package name */
        private int f13241v;

        /* renamed from: b  reason: collision with root package name */
        private boolean f13221b = true;

        /* renamed from: r  reason: collision with root package name */
        private int f13237r = -1;

        /* renamed from: w  reason: collision with root package name */
        private int f13242w = -1;

        a() {
        }

        public a A(int i10) {
            this.f13226g = i10;
            return this;
        }

        public a B(int i10) {
            this.f13232m = i10;
            return this;
        }

        public a C(int i10) {
            this.f13237r = i10;
            return this;
        }

        public a D(int i10) {
            this.f13242w = i10;
            return this;
        }

        public a x(int i10) {
            this.f13222c = i10;
            return this;
        }

        public a y(int i10) {
            this.f13223d = i10;
            return this;
        }

        public c z() {
            return new c(this);
        }
    }

    protected c(a aVar) {
        this.f13197a = aVar.f13220a;
        this.f13198b = aVar.f13221b;
        this.f13199c = aVar.f13222c;
        this.f13200d = aVar.f13223d;
        this.f13201e = aVar.f13224e;
        this.f13202f = aVar.f13225f;
        this.f13203g = aVar.f13226g;
        this.f13204h = aVar.f13227h;
        this.f13205i = aVar.f13228i;
        this.f13206j = aVar.f13229j;
        this.f13207k = aVar.f13230k;
        this.f13208l = aVar.f13231l;
        this.f13209m = aVar.f13232m;
        this.f13210n = aVar.f13233n;
        this.f13211o = aVar.f13234o;
        this.f13212p = aVar.f13235p;
        this.f13213q = aVar.f13236q;
        this.f13214r = aVar.f13237r;
        this.f13215s = aVar.f13238s;
        this.f13216t = aVar.f13239t;
        this.f13217u = aVar.f13240u;
        this.f13218v = aVar.f13241v;
        this.f13219w = aVar.f13242w;
    }

    public static a j(Context context) {
        qb.b a10 = qb.b.a(context);
        return new a().B(a10.b(8)).x(a10.b(24)).y(a10.b(4)).A(a10.b(1)).C(a10.b(1)).D(a10.b(4));
    }

    public void a(Paint paint) {
        int i10 = this.f13201e;
        if (i10 == 0) {
            i10 = qb.a.a(paint.getColor(), 25);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i10);
    }

    public void b(Paint paint) {
        int i10 = this.f13206j;
        if (i10 == 0) {
            i10 = this.f13205i;
        }
        if (i10 != 0) {
            paint.setColor(i10);
        }
        Typeface typeface = this.f13211o;
        if (typeface == null) {
            typeface = this.f13210n;
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i11 = this.f13213q;
            if (i11 <= 0) {
                i11 = this.f13212p;
            }
            if (i11 > 0) {
                paint.setTextSize(i11);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i12 = this.f13213q;
        if (i12 <= 0) {
            i12 = this.f13212p;
        }
        if (i12 > 0) {
            paint.setTextSize(i12);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void c(Paint paint) {
        int i10 = this.f13205i;
        if (i10 != 0) {
            paint.setColor(i10);
        }
        Typeface typeface = this.f13210n;
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i11 = this.f13212p;
            if (i11 > 0) {
                paint.setTextSize(i11);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i12 = this.f13212p;
        if (i12 > 0) {
            paint.setTextSize(i12);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void d(Paint paint) {
        int i10 = this.f13215s;
        if (i10 == 0) {
            i10 = qb.a.a(paint.getColor(), 75);
        }
        paint.setColor(i10);
        paint.setStyle(Paint.Style.FILL);
        int i11 = this.f13214r;
        if (i11 >= 0) {
            paint.setStrokeWidth(i11);
        }
    }

    public void e(Paint paint, int i10) {
        Typeface typeface = this.f13216t;
        if (typeface == null) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(typeface);
        }
        float[] fArr = this.f13217u;
        if (fArr == null) {
            fArr = f13196x;
        }
        if (fArr != null && fArr.length >= i10) {
            paint.setTextSize(paint.getTextSize() * fArr[i10 - 1]);
            return;
        }
        throw new IllegalStateException(String.format(Locale.US, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`", Integer.valueOf(i10), Arrays.toString(fArr)));
    }

    public void f(Paint paint) {
        paint.setUnderlineText(this.f13198b);
        int i10 = this.f13197a;
        if (i10 != 0) {
            paint.setColor(i10);
        } else if (paint instanceof TextPaint) {
            paint.setColor(((TextPaint) paint).linkColor);
        }
    }

    public void g(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f13198b);
        int i10 = this.f13197a;
        if (i10 != 0) {
            textPaint.setColor(i10);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    public void h(Paint paint) {
        int i10 = this.f13202f;
        if (i10 == 0) {
            i10 = paint.getColor();
        }
        paint.setColor(i10);
        int i11 = this.f13203g;
        if (i11 != 0) {
            paint.setStrokeWidth(i11);
        }
    }

    public void i(Paint paint) {
        int i10 = this.f13218v;
        if (i10 == 0) {
            i10 = qb.a.a(paint.getColor(), 25);
        }
        paint.setColor(i10);
        paint.setStyle(Paint.Style.FILL);
        int i11 = this.f13219w;
        if (i11 >= 0) {
            paint.setStrokeWidth(i11);
        }
    }

    public int k() {
        return this.f13199c;
    }

    public int l() {
        int i10 = this.f13200d;
        if (i10 == 0) {
            return (int) ((this.f13199c * 0.25f) + 0.5f);
        }
        return i10;
    }

    public int m(int i10) {
        int min = Math.min(this.f13199c, i10) / 2;
        int i11 = this.f13204h;
        if (i11 != 0 && i11 <= min) {
            return i11;
        }
        return min;
    }

    public int n(Paint paint) {
        int i10 = this.f13207k;
        if (i10 == 0) {
            return qb.a.a(paint.getColor(), 25);
        }
        return i10;
    }

    public int o(Paint paint) {
        int i10 = this.f13208l;
        if (i10 == 0) {
            i10 = this.f13207k;
        }
        if (i10 == 0) {
            return qb.a.a(paint.getColor(), 25);
        }
        return i10;
    }

    public int p() {
        return this.f13209m;
    }
}
