package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* compiled from: StaticLayoutBuilderCompat.java */
/* loaded from: classes3.dex */
final class l {

    /* renamed from: n  reason: collision with root package name */
    static final int f10155n;

    /* renamed from: o  reason: collision with root package name */
    private static boolean f10156o;

    /* renamed from: p  reason: collision with root package name */
    private static Constructor<StaticLayout> f10157p;

    /* renamed from: q  reason: collision with root package name */
    private static Object f10158q;

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f10159a;

    /* renamed from: b  reason: collision with root package name */
    private final TextPaint f10160b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10161c;

    /* renamed from: e  reason: collision with root package name */
    private int f10163e;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10170l;

    /* renamed from: d  reason: collision with root package name */
    private int f10162d = 0;

    /* renamed from: f  reason: collision with root package name */
    private Layout.Alignment f10164f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g  reason: collision with root package name */
    private int f10165g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    private float f10166h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    private float f10167i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    private int f10168j = f10155n;

    /* renamed from: k  reason: collision with root package name */
    private boolean f10169k = true;

    /* renamed from: m  reason: collision with root package name */
    private TextUtils.TruncateAt f10171m = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StaticLayoutBuilderCompat.java */
    /* loaded from: classes3.dex */
    public static class a extends Exception {
        a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 23) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        f10155n = i10;
    }

    private l(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f10159a = charSequence;
        this.f10160b = textPaint;
        this.f10161c = i10;
        this.f10163e = charSequence.length();
    }

    private void b() throws a {
        boolean z10;
        TextDirectionHeuristic textDirectionHeuristic;
        if (f10156o) {
            return;
        }
        try {
            if (this.f10170l && Build.VERSION.SDK_INT >= 23) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            f10158q = textDirectionHeuristic;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f10157p = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f10156o = true;
        } catch (Exception e10) {
            throw new a(e10);
        }
    }

    public static l c(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new l(charSequence, textPaint, i10);
    }

    public StaticLayout a() throws a {
        StaticLayout.Builder obtain;
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout build;
        if (this.f10159a == null) {
            this.f10159a = "";
        }
        int max = Math.max(0, this.f10161c);
        CharSequence charSequence = this.f10159a;
        if (this.f10165g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f10160b, max, this.f10171m);
        }
        int min = Math.min(charSequence.length(), this.f10163e);
        this.f10163e = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f10170l && this.f10165g == 1) {
                this.f10164f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            obtain = StaticLayout.Builder.obtain(charSequence, this.f10162d, min, this.f10160b, max);
            obtain.setAlignment(this.f10164f);
            obtain.setIncludePad(this.f10169k);
            if (this.f10170l) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic);
            TextUtils.TruncateAt truncateAt = this.f10171m;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f10165g);
            float f10 = this.f10166h;
            if (f10 != 0.0f || this.f10167i != 1.0f) {
                obtain.setLineSpacing(f10, this.f10167i);
            }
            if (this.f10165g > 1) {
                obtain.setHyphenationFrequency(this.f10168j);
            }
            build = obtain.build();
            return build;
        }
        b();
        try {
            return (StaticLayout) ((Constructor) androidx.core.util.i.g(f10157p)).newInstance(charSequence, Integer.valueOf(this.f10162d), Integer.valueOf(this.f10163e), this.f10160b, Integer.valueOf(max), this.f10164f, androidx.core.util.i.g(f10158q), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f10169k), null, Integer.valueOf(max), Integer.valueOf(this.f10165g));
        } catch (Exception e10) {
            throw new a(e10);
        }
    }

    public l d(Layout.Alignment alignment) {
        this.f10164f = alignment;
        return this;
    }

    public l e(TextUtils.TruncateAt truncateAt) {
        this.f10171m = truncateAt;
        return this;
    }

    public l f(int i10) {
        this.f10168j = i10;
        return this;
    }

    public l g(boolean z10) {
        this.f10169k = z10;
        return this;
    }

    public l h(boolean z10) {
        this.f10170l = z10;
        return this;
    }

    public l i(float f10, float f11) {
        this.f10166h = f10;
        this.f10167i = f11;
        return this;
    }

    public l j(int i10) {
        this.f10165g = i10;
        return this;
    }

    public l k(m mVar) {
        return this;
    }
}
