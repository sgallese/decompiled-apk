package i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* compiled from: DrawableContainerCompat.java */
/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: f  reason: collision with root package name */
    private d f16661f;

    /* renamed from: m  reason: collision with root package name */
    private Rect f16662m;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f16663p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f16664q;

    /* renamed from: s  reason: collision with root package name */
    private boolean f16666s;

    /* renamed from: u  reason: collision with root package name */
    private boolean f16668u;

    /* renamed from: v  reason: collision with root package name */
    private Runnable f16669v;

    /* renamed from: w  reason: collision with root package name */
    private long f16670w;

    /* renamed from: x  reason: collision with root package name */
    private long f16671x;

    /* renamed from: y  reason: collision with root package name */
    private c f16672y;

    /* renamed from: r  reason: collision with root package name */
    private int f16665r = 255;

    /* renamed from: t  reason: collision with root package name */
    private int f16667t = -1;

    /* compiled from: DrawableContainerCompat.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DrawableContainerCompat.java */
    /* renamed from: i.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0396b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableContainerCompat.java */
    /* loaded from: classes.dex */
    public static abstract class d extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a  reason: collision with root package name */
        final b f16675a;

        /* renamed from: b  reason: collision with root package name */
        Resources f16676b;

        /* renamed from: c  reason: collision with root package name */
        int f16677c;

        /* renamed from: d  reason: collision with root package name */
        int f16678d;

        /* renamed from: e  reason: collision with root package name */
        int f16679e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f16680f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f16681g;

        /* renamed from: h  reason: collision with root package name */
        int f16682h;

        /* renamed from: i  reason: collision with root package name */
        boolean f16683i;

        /* renamed from: j  reason: collision with root package name */
        boolean f16684j;

        /* renamed from: k  reason: collision with root package name */
        Rect f16685k;

        /* renamed from: l  reason: collision with root package name */
        boolean f16686l;

        /* renamed from: m  reason: collision with root package name */
        boolean f16687m;

        /* renamed from: n  reason: collision with root package name */
        int f16688n;

        /* renamed from: o  reason: collision with root package name */
        int f16689o;

        /* renamed from: p  reason: collision with root package name */
        int f16690p;

        /* renamed from: q  reason: collision with root package name */
        int f16691q;

        /* renamed from: r  reason: collision with root package name */
        boolean f16692r;

        /* renamed from: s  reason: collision with root package name */
        int f16693s;

        /* renamed from: t  reason: collision with root package name */
        boolean f16694t;

        /* renamed from: u  reason: collision with root package name */
        boolean f16695u;

        /* renamed from: v  reason: collision with root package name */
        boolean f16696v;

        /* renamed from: w  reason: collision with root package name */
        boolean f16697w;

        /* renamed from: x  reason: collision with root package name */
        boolean f16698x;

        /* renamed from: y  reason: collision with root package name */
        boolean f16699y;

        /* renamed from: z  reason: collision with root package name */
        int f16700z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(d dVar, b bVar, Resources resources) {
            Resources resources2;
            int i10;
            this.f16683i = false;
            this.f16686l = false;
            this.f16698x = true;
            this.A = 0;
            this.B = 0;
            this.f16675a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else if (dVar != null) {
                resources2 = dVar.f16676b;
            } else {
                resources2 = null;
            }
            this.f16676b = resources2;
            if (dVar != null) {
                i10 = dVar.f16677c;
            } else {
                i10 = 0;
            }
            int f10 = b.f(resources, i10);
            this.f16677c = f10;
            if (dVar != null) {
                this.f16678d = dVar.f16678d;
                this.f16679e = dVar.f16679e;
                this.f16696v = true;
                this.f16697w = true;
                this.f16683i = dVar.f16683i;
                this.f16686l = dVar.f16686l;
                this.f16698x = dVar.f16698x;
                this.f16699y = dVar.f16699y;
                this.f16700z = dVar.f16700z;
                this.A = dVar.A;
                this.B = dVar.B;
                this.C = dVar.C;
                this.D = dVar.D;
                this.E = dVar.E;
                this.F = dVar.F;
                this.G = dVar.G;
                this.H = dVar.H;
                this.I = dVar.I;
                if (dVar.f16677c == f10) {
                    if (dVar.f16684j) {
                        this.f16685k = dVar.f16685k != null ? new Rect(dVar.f16685k) : null;
                        this.f16684j = true;
                    }
                    if (dVar.f16687m) {
                        this.f16688n = dVar.f16688n;
                        this.f16689o = dVar.f16689o;
                        this.f16690p = dVar.f16690p;
                        this.f16691q = dVar.f16691q;
                        this.f16687m = true;
                    }
                }
                if (dVar.f16692r) {
                    this.f16693s = dVar.f16693s;
                    this.f16692r = true;
                }
                if (dVar.f16694t) {
                    this.f16695u = dVar.f16695u;
                    this.f16694t = true;
                }
                Drawable[] drawableArr = dVar.f16681g;
                this.f16681g = new Drawable[drawableArr.length];
                this.f16682h = dVar.f16682h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f16680f;
                if (sparseArray != null) {
                    this.f16680f = sparseArray.clone();
                } else {
                    this.f16680f = new SparseArray<>(this.f16682h);
                }
                int i11 = this.f16682h;
                for (int i12 = 0; i12 < i11; i12++) {
                    Drawable drawable = drawableArr[i12];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f16680f.put(i12, constantState);
                        } else {
                            this.f16681g[i12] = drawableArr[i12];
                        }
                    }
                }
                return;
            }
            this.f16681g = new Drawable[10];
            this.f16682h = 0;
        }

        private void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f16680f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f16681g[this.f16680f.keyAt(i10)] = s(this.f16680f.valueAt(i10).newDrawable(this.f16676b));
                }
                this.f16680f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, this.f16700z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f16675a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f16682h;
            if (i10 >= this.f16681g.length) {
                o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f16675a);
            this.f16681g[i10] = drawable;
            this.f16682h++;
            this.f16679e = drawable.getChangingConfigurations() | this.f16679e;
            p();
            this.f16685k = null;
            this.f16684j = false;
            this.f16687m = false;
            this.f16696v = false;
            return i10;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i10 = this.f16682h;
                Drawable[] drawableArr = this.f16681g;
                for (int i11 = 0; i11 < i10; i11++) {
                    Drawable drawable = drawableArr[i11];
                    if (drawable != null && androidx.core.graphics.drawable.a.b(drawable)) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i11], theme);
                        this.f16679e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                y(C0396b.c(theme));
            }
        }

        public boolean c() {
            if (this.f16696v) {
                return this.f16697w;
            }
            e();
            this.f16696v = true;
            int i10 = this.f16682h;
            Drawable[] drawableArr = this.f16681g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f16697w = false;
                    return false;
                }
            }
            this.f16697w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i10 = this.f16682h;
            Drawable[] drawableArr = this.f16681g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    if (androidx.core.graphics.drawable.a.b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f16680f.get(i11);
                    if (constantState != null && C0396b.a(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        protected void d() {
            this.f16687m = true;
            e();
            int i10 = this.f16682h;
            Drawable[] drawableArr = this.f16681g;
            this.f16689o = -1;
            this.f16688n = -1;
            this.f16691q = 0;
            this.f16690p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f16688n) {
                    this.f16688n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f16689o) {
                    this.f16689o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f16690p) {
                    this.f16690p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f16691q) {
                    this.f16691q = minimumHeight;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final int f() {
            return this.f16681g.length;
        }

        public final Drawable g(int i10) {
            int indexOfKey;
            Drawable drawable = this.f16681g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f16680f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable s10 = s(this.f16680f.valueAt(indexOfKey).newDrawable(this.f16676b));
            this.f16681g[i10] = s10;
            this.f16680f.removeAt(indexOfKey);
            if (this.f16680f.size() == 0) {
                this.f16680f = null;
            }
            return s10;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f16678d | this.f16679e;
        }

        public final int h() {
            return this.f16682h;
        }

        public final int i() {
            if (!this.f16687m) {
                d();
            }
            return this.f16689o;
        }

        public final int j() {
            if (!this.f16687m) {
                d();
            }
            return this.f16691q;
        }

        public final int k() {
            if (!this.f16687m) {
                d();
            }
            return this.f16690p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f16683i) {
                return null;
            }
            Rect rect2 = this.f16685k;
            if (rect2 == null && !this.f16684j) {
                e();
                Rect rect3 = new Rect();
                int i10 = this.f16682h;
                Drawable[] drawableArr = this.f16681g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect3)) {
                        if (rect == null) {
                            rect = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect3.left;
                        if (i12 > rect.left) {
                            rect.left = i12;
                        }
                        int i13 = rect3.top;
                        if (i13 > rect.top) {
                            rect.top = i13;
                        }
                        int i14 = rect3.right;
                        if (i14 > rect.right) {
                            rect.right = i14;
                        }
                        int i15 = rect3.bottom;
                        if (i15 > rect.bottom) {
                            rect.bottom = i15;
                        }
                    }
                }
                this.f16684j = true;
                this.f16685k = rect;
                return rect;
            }
            return rect2;
        }

        public final int m() {
            if (!this.f16687m) {
                d();
            }
            return this.f16688n;
        }

        public final int n() {
            int i10;
            if (this.f16692r) {
                return this.f16693s;
            }
            e();
            int i11 = this.f16682h;
            Drawable[] drawableArr = this.f16681g;
            if (i11 > 0) {
                i10 = drawableArr[0].getOpacity();
            } else {
                i10 = -2;
            }
            for (int i12 = 1; i12 < i11; i12++) {
                i10 = Drawable.resolveOpacity(i10, drawableArr[i12].getOpacity());
            }
            this.f16693s = i10;
            this.f16692r = true;
            return i10;
        }

        public void o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f16681g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f16681g = drawableArr;
        }

        void p() {
            this.f16692r = false;
            this.f16694t = false;
        }

        public final boolean q() {
            return this.f16686l;
        }

        abstract void r();

        public final void t(boolean z10) {
            this.f16686l = z10;
        }

        public final void u(int i10) {
            this.A = i10;
        }

        public final void v(int i10) {
            this.B = i10;
        }

        final boolean w(int i10, int i11) {
            boolean z10;
            int i12 = this.f16682h;
            Drawable[] drawableArr = this.f16681g;
            boolean z11 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        z10 = androidx.core.graphics.drawable.a.m(drawable, i10);
                    } else {
                        z10 = false;
                    }
                    if (i13 == i11) {
                        z11 = z10;
                    }
                }
            }
            this.f16700z = i10;
            return z11;
        }

        public final void x(boolean z10) {
            this.f16683i = z10;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.f16676b = resources;
                int f10 = b.f(resources, this.f16677c);
                int i10 = this.f16677c;
                this.f16677c = f10;
                if (i10 != f10) {
                    this.f16687m = false;
                    this.f16684j = false;
                }
            }
        }
    }

    private void d(Drawable drawable) {
        if (this.f16672y == null) {
            this.f16672y = new c();
        }
        drawable.setCallback(this.f16672y.b(drawable.getCallback()));
        try {
            if (this.f16661f.A <= 0 && this.f16666s) {
                drawable.setAlpha(this.f16665r);
            }
            d dVar = this.f16661f;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    androidx.core.graphics.drawable.a.o(drawable, dVar.F);
                }
                d dVar2 = this.f16661f;
                if (dVar2.I) {
                    androidx.core.graphics.drawable.a.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f16661f.f16698x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            }
            androidx.core.graphics.drawable.a.j(drawable, this.f16661f.C);
            Rect rect = this.f16662m;
            if (rect != null) {
                androidx.core.graphics.drawable.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f16672y.a());
        }
    }

    private boolean e() {
        if (isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1) {
            return true;
        }
        return false;
    }

    static int f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f16666s = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f16663p
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f16670w
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f16665r
            r3.setAlpha(r9)
            r13.f16670w = r6
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            i.b$d r9 = r13.f16661f
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f16665r
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f16670w = r6
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f16664q
            if (r9 == 0) goto L65
            long r10 = r13.f16671x
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f16664q = r0
            r13.f16671x = r6
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            i.b$d r4 = r13.f16661f
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f16665r
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f16671x = r6
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.f16669v
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f16661f.b(theme);
    }

    d b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f16667t;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f16661f.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f16663p;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f16664q;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f16667t
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            i.b$d r0 = r9.f16661f
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f16664q
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f16663p
            if (r0 == 0) goto L29
            r9.f16664q = r0
            i.b$d r0 = r9.f16661f
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f16671x = r0
            goto L35
        L29:
            r9.f16664q = r4
            r9.f16671x = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f16663p
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            i.b$d r0 = r9.f16661f
            int r1 = r0.f16682h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f16663p = r0
            r9.f16667t = r10
            if (r0 == 0) goto L5a
            i.b$d r10 = r9.f16661f
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f16670w = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f16663p = r4
            r10 = -1
            r9.f16667t = r10
        L5a:
            long r0 = r9.f16670w
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f16671x
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f16669v
            if (r0 != 0) goto L73
            i.b$a r0 = new i.b$a
            r0.<init>()
            r9.f16669v = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f16665r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f16661f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f16661f.c()) {
            this.f16661f.f16678d = getChangingConfigurations();
            return this.f16661f;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f16663p;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f16662m;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f16661f.q()) {
            return this.f16661f.i();
        }
        Drawable drawable = this.f16663p;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f16661f.q()) {
            return this.f16661f.m();
        }
        Drawable drawable = this.f16663p;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f16661f.q()) {
            return this.f16661f.j();
        }
        Drawable drawable = this.f16663p;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f16661f.q()) {
            return this.f16661f.k();
        }
        Drawable drawable = this.f16663p;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f16663p;
        if (drawable != null && drawable.isVisible()) {
            return this.f16661f.n();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f16663p;
        if (drawable != null) {
            C0396b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect l10 = this.f16661f.l();
        if (l10 != null) {
            rect.set(l10);
            if ((l10.right | l10.left | l10.top | l10.bottom) != 0) {
                padding = true;
            } else {
                padding = false;
            }
        } else {
            Drawable drawable = this.f16663p;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(d dVar) {
        this.f16661f = dVar;
        int i10 = this.f16667t;
        if (i10 >= 0) {
            Drawable g10 = dVar.g(i10);
            this.f16663p = g10;
            if (g10 != null) {
                d(g10);
            }
        }
        this.f16664q = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(Resources resources) {
        this.f16661f.y(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f16661f;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable == this.f16663p && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f16661f.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f16664q;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f16664q = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f16663p;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f16666s) {
                this.f16663p.setAlpha(this.f16665r);
            }
        }
        if (this.f16671x != 0) {
            this.f16671x = 0L;
            z10 = true;
        }
        if (this.f16670w != 0) {
            this.f16670w = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f16668u && super.mutate() == this) {
            d b10 = b();
            b10.r();
            h(b10);
            this.f16668u = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f16664q;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f16663p;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f16661f.w(i10, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f16664q;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f16663p;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f16664q;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f16663p;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable == this.f16663p && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (!this.f16666s || this.f16665r != i10) {
            this.f16666s = true;
            this.f16665r = i10;
            Drawable drawable = this.f16663p;
            if (drawable != null) {
                if (this.f16670w == 0) {
                    drawable.setAlpha(i10);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        d dVar = this.f16661f;
        if (dVar.C != z10) {
            dVar.C = z10;
            Drawable drawable = this.f16663p;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.j(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f16661f;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f16663p;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        d dVar = this.f16661f;
        if (dVar.f16698x != z10) {
            dVar.f16698x = z10;
            Drawable drawable = this.f16663p;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f16663p;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f16662m;
        if (rect == null) {
            this.f16662m = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f16663p;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f16661f;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            androidx.core.graphics.drawable.a.o(this.f16663p, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f16661f;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            androidx.core.graphics.drawable.a.p(this.f16663p, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f16664q;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f16663p;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f16663p && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableContainerCompat.java */
    /* loaded from: classes.dex */
    public static class c implements Drawable.Callback {

        /* renamed from: f  reason: collision with root package name */
        private Drawable.Callback f16674f;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f16674f;
            this.f16674f = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f16674f = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f16674f;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f16674f;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }
    }
}
