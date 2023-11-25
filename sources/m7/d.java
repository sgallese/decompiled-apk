package m7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.h;
import v6.l;

/* compiled from: TextAppearance.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f19749a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f19750b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f19751c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19752d;

    /* renamed from: e  reason: collision with root package name */
    public final int f19753e;

    /* renamed from: f  reason: collision with root package name */
    public final int f19754f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f19755g;

    /* renamed from: h  reason: collision with root package name */
    public final float f19756h;

    /* renamed from: i  reason: collision with root package name */
    public final float f19757i;

    /* renamed from: j  reason: collision with root package name */
    public final float f19758j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f19759k;

    /* renamed from: l  reason: collision with root package name */
    public final float f19760l;

    /* renamed from: m  reason: collision with root package name */
    private ColorStateList f19761m;

    /* renamed from: n  reason: collision with root package name */
    private float f19762n;

    /* renamed from: o  reason: collision with root package name */
    private final int f19763o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f19764p = false;

    /* renamed from: q  reason: collision with root package name */
    private Typeface f19765q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextAppearance.java */
    /* loaded from: classes3.dex */
    public class a extends h.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f19766a;

        a(f fVar) {
            this.f19766a = fVar;
        }

        @Override // androidx.core.content.res.h.e
        /* renamed from: h */
        public void f(int i10) {
            d.this.f19764p = true;
            this.f19766a.a(i10);
        }

        @Override // androidx.core.content.res.h.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            d dVar = d.this;
            dVar.f19765q = Typeface.create(typeface, dVar.f19753e);
            d.this.f19764p = true;
            this.f19766a.b(d.this.f19765q, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextAppearance.java */
    /* loaded from: classes3.dex */
    public class b extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19768a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextPaint f19769b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f19770c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f19768a = context;
            this.f19769b = textPaint;
            this.f19770c = fVar;
        }

        @Override // m7.f
        public void a(int i10) {
            this.f19770c.a(i10);
        }

        @Override // m7.f
        public void b(Typeface typeface, boolean z10) {
            d.this.p(this.f19768a, this.f19769b, typeface);
            this.f19770c.b(typeface, z10);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, l.Y6);
        l(obtainStyledAttributes.getDimension(l.Z6, 0.0f));
        k(c.a(context, obtainStyledAttributes, l.f24845c7));
        this.f19749a = c.a(context, obtainStyledAttributes, l.f24855d7);
        this.f19750b = c.a(context, obtainStyledAttributes, l.f24865e7);
        this.f19753e = obtainStyledAttributes.getInt(l.f24835b7, 0);
        this.f19754f = obtainStyledAttributes.getInt(l.f24825a7, 1);
        int e10 = c.e(obtainStyledAttributes, l.f24925k7, l.f24915j7);
        this.f19763o = obtainStyledAttributes.getResourceId(e10, 0);
        this.f19752d = obtainStyledAttributes.getString(e10);
        this.f19755g = obtainStyledAttributes.getBoolean(l.f24935l7, false);
        this.f19751c = c.a(context, obtainStyledAttributes, l.f24875f7);
        this.f19756h = obtainStyledAttributes.getFloat(l.f24885g7, 0.0f);
        this.f19757i = obtainStyledAttributes.getFloat(l.f24895h7, 0.0f);
        this.f19758j = obtainStyledAttributes.getFloat(l.f24905i7, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, l.R4);
        int i11 = l.S4;
        this.f19759k = obtainStyledAttributes2.hasValue(i11);
        this.f19760l = obtainStyledAttributes2.getFloat(i11, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f19765q == null && (str = this.f19752d) != null) {
            this.f19765q = Typeface.create(str, this.f19753e);
        }
        if (this.f19765q == null) {
            int i10 = this.f19754f;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        this.f19765q = Typeface.DEFAULT;
                    } else {
                        this.f19765q = Typeface.MONOSPACE;
                    }
                } else {
                    this.f19765q = Typeface.SERIF;
                }
            } else {
                this.f19765q = Typeface.SANS_SERIF;
            }
            this.f19765q = Typeface.create(this.f19765q, this.f19753e);
        }
    }

    private boolean m(Context context) {
        Typeface typeface;
        if (e.a()) {
            return true;
        }
        int i10 = this.f19763o;
        if (i10 != 0) {
            typeface = androidx.core.content.res.h.c(context, i10);
        } else {
            typeface = null;
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public Typeface e() {
        d();
        return this.f19765q;
    }

    public Typeface f(Context context) {
        if (this.f19764p) {
            return this.f19765q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface g10 = androidx.core.content.res.h.g(context, this.f19763o);
                this.f19765q = g10;
                if (g10 != null) {
                    this.f19765q = Typeface.create(g10, this.f19753e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f19752d, e10);
            }
        }
        d();
        this.f19764p = true;
        return this.f19765q;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f19763o;
        if (i10 == 0) {
            this.f19764p = true;
        }
        if (this.f19764p) {
            fVar.b(this.f19765q, true);
            return;
        }
        try {
            androidx.core.content.res.h.i(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f19764p = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f19752d, e10);
            this.f19764p = true;
            fVar.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f19761m;
    }

    public float j() {
        return this.f19762n;
    }

    public void k(ColorStateList colorStateList) {
        this.f19761m = colorStateList;
    }

    public void l(float f10) {
        this.f19762n = f10;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        int i10;
        int i11;
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f19761m;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i10 = -16777216;
        }
        textPaint.setColor(i10);
        float f10 = this.f19758j;
        float f11 = this.f19756h;
        float f12 = this.f19757i;
        ColorStateList colorStateList2 = this.f19751c;
        if (colorStateList2 != null) {
            i11 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i11 = 0;
        }
        textPaint.setShadowLayer(f10, f11, f12, i11);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z10;
        float f10;
        Typeface a10 = h.a(context, typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f19753e & (~typeface.getStyle());
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setFakeBoldText(z10);
        if ((i10 & 2) != 0) {
            f10 = -0.25f;
        } else {
            f10 = 0.0f;
        }
        textPaint.setTextSkewX(f10);
        textPaint.setTextSize(this.f19762n);
        if (this.f19759k) {
            textPaint.setLetterSpacing(this.f19760l);
        }
    }
}
