package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.h;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f1422a;

    /* renamed from: b  reason: collision with root package name */
    private e1 f1423b;

    /* renamed from: c  reason: collision with root package name */
    private e1 f1424c;

    /* renamed from: d  reason: collision with root package name */
    private e1 f1425d;

    /* renamed from: e  reason: collision with root package name */
    private e1 f1426e;

    /* renamed from: f  reason: collision with root package name */
    private e1 f1427f;

    /* renamed from: g  reason: collision with root package name */
    private e1 f1428g;

    /* renamed from: h  reason: collision with root package name */
    private e1 f1429h;

    /* renamed from: i  reason: collision with root package name */
    private final c0 f1430i;

    /* renamed from: j  reason: collision with root package name */
    private int f1431j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f1432k = -1;

    /* renamed from: l  reason: collision with root package name */
    private Typeface f1433l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1434m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ TextView f1439f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Typeface f1440m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f1441p;

        b(TextView textView, Typeface typeface, int i10) {
            this.f1439f = textView;
            this.f1440m = typeface;
            this.f1441p = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1439f.setTypeface(this.f1440m, this.f1441p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class c {
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class d {
        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class e {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class f {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class g {
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(TextView textView) {
        this.f1422a = textView;
        this.f1430i = new c0(textView);
    }

    private void B(int i10, float f10) {
        this.f1430i.t(i10, f10);
    }

    private void C(Context context, g1 g1Var) {
        String o10;
        boolean z10;
        boolean z11;
        this.f1431j = g1Var.k(g.j.f15853d3, this.f1431j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z12 = false;
        if (i10 >= 28) {
            int k10 = g1Var.k(g.j.f15878i3, -1);
            this.f1432k = k10;
            if (k10 != -1) {
                this.f1431j = (this.f1431j & 2) | 0;
            }
        }
        int i11 = g.j.f15873h3;
        if (!g1Var.s(i11) && !g1Var.s(g.j.f15883j3)) {
            int i12 = g.j.f15848c3;
            if (g1Var.s(i12)) {
                this.f1434m = false;
                int k11 = g1Var.k(i12, 1);
                if (k11 != 1) {
                    if (k11 != 2) {
                        if (k11 == 3) {
                            this.f1433l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f1433l = Typeface.SERIF;
                    return;
                }
                this.f1433l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f1433l = null;
        int i13 = g.j.f15883j3;
        if (g1Var.s(i13)) {
            i11 = i13;
        }
        int i14 = this.f1432k;
        int i15 = this.f1431j;
        if (!context.isRestricted()) {
            try {
                Typeface j10 = g1Var.j(i11, this.f1431j, new a(i14, i15, new WeakReference(this.f1422a)));
                if (j10 != null) {
                    if (i10 >= 28 && this.f1432k != -1) {
                        Typeface create = Typeface.create(j10, 0);
                        int i16 = this.f1432k;
                        if ((this.f1431j & 2) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f1433l = g.a(create, i16, z11);
                    } else {
                        this.f1433l = j10;
                    }
                }
                if (this.f1433l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f1434m = z10;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1433l == null && (o10 = g1Var.o(i11)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f1432k != -1) {
                Typeface create2 = Typeface.create(o10, 0);
                int i17 = this.f1432k;
                if ((this.f1431j & 2) != 0) {
                    z12 = true;
                }
                this.f1433l = g.a(create2, i17, z12);
                return;
            }
            this.f1433l = Typeface.create(o10, this.f1431j);
        }
    }

    private void a(Drawable drawable, e1 e1Var) {
        if (drawable != null && e1Var != null) {
            j.i(drawable, e1Var, this.f1422a.getDrawableState());
        }
    }

    private static e1 d(Context context, j jVar, int i10) {
        ColorStateList f10 = jVar.f(context, i10);
        if (f10 != null) {
            e1 e1Var = new e1();
            e1Var.f1506d = true;
            e1Var.f1503a = f10;
            return e1Var;
        }
        return null;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] a10 = c.a(this.f1422a);
                Drawable drawable7 = a10[0];
                if (drawable7 == null && a10[2] == null) {
                    Drawable[] compoundDrawables = this.f1422a.getCompoundDrawables();
                    TextView textView = this.f1422a;
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                    return;
                }
                TextView textView2 = this.f1422a;
                if (drawable2 == null) {
                    drawable2 = a10[1];
                }
                Drawable drawable8 = a10[2];
                if (drawable4 == null) {
                    drawable4 = a10[3];
                }
                c.b(textView2, drawable7, drawable2, drawable8, drawable4);
                return;
            }
            return;
        }
        Drawable[] a11 = c.a(this.f1422a);
        TextView textView3 = this.f1422a;
        if (drawable5 == null) {
            drawable5 = a11[0];
        }
        if (drawable2 == null) {
            drawable2 = a11[1];
        }
        if (drawable6 == null) {
            drawable6 = a11[2];
        }
        if (drawable4 == null) {
            drawable4 = a11[3];
        }
        c.b(textView3, drawable5, drawable2, drawable6, drawable4);
    }

    private void z() {
        e1 e1Var = this.f1429h;
        this.f1423b = e1Var;
        this.f1424c = e1Var;
        this.f1425d = e1Var;
        this.f1426e = e1Var;
        this.f1427f = e1Var;
        this.f1428g = e1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(int i10, float f10) {
        if (!r1.f1662b && !l()) {
            B(i10, f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f1423b != null || this.f1424c != null || this.f1425d != null || this.f1426e != null) {
            Drawable[] compoundDrawables = this.f1422a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1423b);
            a(compoundDrawables[1], this.f1424c);
            a(compoundDrawables[2], this.f1425d);
            a(compoundDrawables[3], this.f1426e);
        }
        if (this.f1427f != null || this.f1428g != null) {
            Drawable[] a10 = c.a(this.f1422a);
            a(a10[0], this.f1427f);
            a(a10[2], this.f1428g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f1430i.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f1430i.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f1430i.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f1430i.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] h() {
        return this.f1430i.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f1430i.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList j() {
        e1 e1Var = this.f1429h;
        if (e1Var != null) {
            return e1Var.f1503a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        e1 e1Var = this.f1429h;
        if (e1Var != null) {
            return e1Var.f1504b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f1430i.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ca  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a0.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1434m) {
            this.f1433l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (androidx.core.view.p0.X(textView)) {
                    textView.post(new b(textView, typeface, this.f1431j));
                } else {
                    textView.setTypeface(typeface, this.f1431j);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (!r1.f1662b) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(Context context, int i10) {
        String o10;
        ColorStateList c10;
        ColorStateList c11;
        ColorStateList c12;
        g1 t10 = g1.t(context, i10, g.j.f15836a3);
        int i11 = g.j.f15893l3;
        if (t10.s(i11)) {
            s(t10.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23) {
            int i13 = g.j.f15858e3;
            if (t10.s(i13) && (c12 = t10.c(i13)) != null) {
                this.f1422a.setTextColor(c12);
            }
            int i14 = g.j.f15868g3;
            if (t10.s(i14) && (c11 = t10.c(i14)) != null) {
                this.f1422a.setLinkTextColor(c11);
            }
            int i15 = g.j.f15863f3;
            if (t10.s(i15) && (c10 = t10.c(i15)) != null) {
                this.f1422a.setHintTextColor(c10);
            }
        }
        int i16 = g.j.f15842b3;
        if (t10.s(i16) && t10.f(i16, -1) == 0) {
            this.f1422a.setTextSize(0, 0.0f);
        }
        C(context, t10);
        if (i12 >= 26) {
            int i17 = g.j.f15888k3;
            if (t10.s(i17) && (o10 = t10.o(i17)) != null) {
                f.d(this.f1422a, o10);
            }
        }
        t10.w();
        Typeface typeface = this.f1433l;
        if (typeface != null) {
            this.f1422a.setTypeface(typeface, this.f1431j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            v2.c.f(editorInfo, textView.getText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(boolean z10) {
        this.f1422a.setAllCaps(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        this.f1430i.p(i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int[] iArr, int i10) throws IllegalArgumentException {
        this.f1430i.q(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(int i10) {
        this.f1430i.r(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        boolean z10;
        if (this.f1429h == null) {
            this.f1429h = new e1();
        }
        e1 e1Var = this.f1429h;
        e1Var.f1503a = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e1Var.f1506d = z10;
        z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(PorterDuff.Mode mode) {
        boolean z10;
        if (this.f1429h == null) {
            this.f1429h = new e1();
        }
        e1 e1Var = this.f1429h;
        e1Var.f1504b = mode;
        if (mode != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e1Var.f1505c = z10;
        z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public class a extends h.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f1435a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1436b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WeakReference f1437c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f1435a = i10;
            this.f1436b = i11;
            this.f1437c = weakReference;
        }

        @Override // androidx.core.content.res.h.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            int i10;
            boolean z10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1435a) != -1) {
                if ((this.f1436b & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                typeface = g.a(typeface, i10, z10);
            }
            a0.this.n(this.f1437c, typeface);
        }

        @Override // androidx.core.content.res.h.e
        /* renamed from: h */
        public void f(int i10) {
        }
    }
}
