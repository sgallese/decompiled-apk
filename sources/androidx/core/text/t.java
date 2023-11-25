package androidx.core.text;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* compiled from: PrecomputedTextCompat.java */
/* loaded from: classes.dex */
public class t implements Spannable {

    /* renamed from: q  reason: collision with root package name */
    private static final Object f4022q = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Spannable f4023f;

    /* renamed from: m  reason: collision with root package name */
    private final a f4024m;

    /* renamed from: p  reason: collision with root package name */
    private final PrecomputedText f4025p;

    public a a() {
        return this.f4024m;
    }

    public PrecomputedText b() {
        if (d.a(this.f4023f)) {
            return e.a(this.f4023f);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f4023f.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f4023f.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f4023f.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f4023f.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        Object[] spans;
        if (Build.VERSION.SDK_INT >= 29) {
            spans = this.f4025p.getSpans(i10, i11, cls);
            return (T[]) spans;
        }
        return (T[]) this.f4023f.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f4023f.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f4023f.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f4025p.removeSpan(obj);
                return;
            } else {
                this.f4023f.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f4025p.setSpan(obj, i10, i11, i12);
                return;
            } else {
                this.f4023f.setSpan(obj, i10, i11, i12);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f4023f.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f4023f.toString();
    }

    /* compiled from: PrecomputedTextCompat.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f4026a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f4027b;

        /* renamed from: c  reason: collision with root package name */
        private final int f4028c;

        /* renamed from: d  reason: collision with root package name */
        private final int f4029d;

        /* renamed from: e  reason: collision with root package name */
        final PrecomputedText.Params f4030e;

        /* compiled from: PrecomputedTextCompat.java */
        /* renamed from: androidx.core.text.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0076a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f4031a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f4032b;

            /* renamed from: c  reason: collision with root package name */
            private int f4033c;

            /* renamed from: d  reason: collision with root package name */
            private int f4034d;

            public C0076a(TextPaint textPaint) {
                this.f4031a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f4033c = 1;
                    this.f4034d = 1;
                } else {
                    this.f4034d = 0;
                    this.f4033c = 0;
                }
                this.f4032b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public a a() {
                return new a(this.f4031a, this.f4032b, this.f4033c, this.f4034d);
            }

            public C0076a b(int i10) {
                this.f4033c = i10;
                return this;
            }

            public C0076a c(int i10) {
                this.f4034d = i10;
                return this;
            }

            public C0076a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f4032b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = j.a(textPaint).setBreakStrategy(i10);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i11);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f4030e = build;
            } else {
                this.f4030e = null;
            }
            this.f4026a = textPaint;
            this.f4027b = textDirectionHeuristic;
            this.f4028c = i10;
            this.f4029d = i11;
        }

        public boolean a(a aVar) {
            LocaleList textLocales;
            LocaleList textLocales2;
            boolean equals;
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 >= 23 && (this.f4028c != aVar.b() || this.f4029d != aVar.c())) || this.f4026a.getTextSize() != aVar.e().getTextSize() || this.f4026a.getTextScaleX() != aVar.e().getTextScaleX() || this.f4026a.getTextSkewX() != aVar.e().getTextSkewX() || this.f4026a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f4026a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f4026a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                textLocales = this.f4026a.getTextLocales();
                textLocales2 = aVar.e().getTextLocales();
                equals = textLocales.equals(textLocales2);
                if (!equals) {
                    return false;
                }
            } else if (!this.f4026a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            if (this.f4026a.getTypeface() == null) {
                if (aVar.e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f4026a.getTypeface().equals(aVar.e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public int b() {
            return this.f4028c;
        }

        public int c() {
            return this.f4029d;
        }

        public TextDirectionHeuristic d() {
            return this.f4027b;
        }

        public TextPaint e() {
            return this.f4026a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (a(aVar) && this.f4027b == aVar.d()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            LocaleList textLocales;
            if (Build.VERSION.SDK_INT >= 24) {
                textLocales = this.f4026a.getTextLocales();
                return androidx.core.util.c.b(Float.valueOf(this.f4026a.getTextSize()), Float.valueOf(this.f4026a.getTextScaleX()), Float.valueOf(this.f4026a.getTextSkewX()), Float.valueOf(this.f4026a.getLetterSpacing()), Integer.valueOf(this.f4026a.getFlags()), textLocales, this.f4026a.getTypeface(), Boolean.valueOf(this.f4026a.isElegantTextHeight()), this.f4027b, Integer.valueOf(this.f4028c), Integer.valueOf(this.f4029d));
            }
            return androidx.core.util.c.b(Float.valueOf(this.f4026a.getTextSize()), Float.valueOf(this.f4026a.getTextScaleX()), Float.valueOf(this.f4026a.getTextSkewX()), Float.valueOf(this.f4026a.getLetterSpacing()), Integer.valueOf(this.f4026a.getFlags()), this.f4026a.getTextLocale(), this.f4026a.getTypeface(), Boolean.valueOf(this.f4026a.isElegantTextHeight()), this.f4027b, Integer.valueOf(this.f4028c), Integer.valueOf(this.f4029d));
        }

        public String toString() {
            String fontVariationSettings;
            LocaleList textLocales;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f4026a.getTextSize());
            sb2.append(", textScaleX=" + this.f4026a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f4026a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f4026a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f4026a.isElegantTextHeight());
            if (i10 >= 24) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", textLocale=");
                textLocales = this.f4026a.getTextLocales();
                sb3.append(textLocales);
                sb2.append(sb3.toString());
            } else {
                sb2.append(", textLocale=" + this.f4026a.getTextLocale());
            }
            sb2.append(", typeface=" + this.f4026a.getTypeface());
            if (i10 >= 26) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(", variationSettings=");
                fontVariationSettings = this.f4026a.getFontVariationSettings();
                sb4.append(fontVariationSettings);
                sb2.append(sb4.toString());
            }
            sb2.append(", textDir=" + this.f4027b);
            sb2.append(", breakStrategy=" + this.f4028c);
            sb2.append(", hyphenationFrequency=" + this.f4029d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f4026a = textPaint;
            textDirection = params.getTextDirection();
            this.f4027b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f4028c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f4029d = hyphenationFrequency;
            this.f4030e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
