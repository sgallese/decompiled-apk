package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.w0;

/* compiled from: AppCompatDrawableManager.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    private static final PorterDuff.Mode f1536b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private static j f1537c;

    /* renamed from: a  reason: collision with root package name */
    private w0 f1538a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDrawableManager.java */
    /* loaded from: classes.dex */
    public class a implements w0.f {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f1539a = {g.e.R, g.e.P, g.e.f15740a};

        /* renamed from: b  reason: collision with root package name */
        private final int[] f1540b = {g.e.f15754o, g.e.B, g.e.f15759t, g.e.f15755p, g.e.f15756q, g.e.f15758s, g.e.f15757r};

        /* renamed from: c  reason: collision with root package name */
        private final int[] f1541c = {g.e.O, g.e.Q, g.e.f15750k, g.e.K, g.e.L, g.e.M, g.e.N};

        /* renamed from: d  reason: collision with root package name */
        private final int[] f1542d = {g.e.f15762w, g.e.f15748i, g.e.f15761v};

        /* renamed from: e  reason: collision with root package name */
        private final int[] f1543e = {g.e.J, g.e.S};

        /* renamed from: f  reason: collision with root package name */
        private final int[] f1544f = {g.e.f15742c, g.e.f15746g, g.e.f15743d, g.e.f15747h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int c10 = b1.c(context, g.a.f15712w);
            return new ColorStateList(new int[][]{b1.f1454b, b1.f1457e, b1.f1455c, b1.f1461i}, new int[]{b1.b(context, g.a.f15710u), androidx.core.graphics.a.g(c10, i10), androidx.core.graphics.a.g(c10, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, b1.c(context, g.a.f15709t));
        }

        private ColorStateList j(Context context) {
            return h(context, b1.c(context, g.a.f15710u));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i10 = g.a.f15714y;
            ColorStateList e10 = b1.e(context, i10);
            if (e10 != null && e10.isStateful()) {
                int[] iArr3 = b1.f1454b;
                iArr[0] = iArr3;
                iArr2[0] = e10.getColorForState(iArr3, 0);
                iArr[1] = b1.f1458f;
                iArr2[1] = b1.c(context, g.a.f15711v);
                iArr[2] = b1.f1461i;
                iArr2[2] = e10.getDefaultColor();
            } else {
                iArr[0] = b1.f1454b;
                iArr2[0] = b1.b(context, i10);
                iArr[1] = b1.f1458f;
                iArr2[1] = b1.c(context, g.a.f15711v);
                iArr[2] = b1.f1461i;
                iArr2[2] = b1.c(context, i10);
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(w0 w0Var, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable j10 = w0Var.j(context, g.e.F);
            Drawable j11 = w0Var.j(context, g.e.G);
            if ((j10 instanceof BitmapDrawable) && j10.getIntrinsicWidth() == dimensionPixelSize && j10.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) j10;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j10.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((j11 instanceof BitmapDrawable) && j11.getIntrinsicWidth() == dimensionPixelSize && j11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j11;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j11.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (n0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f1536b;
            }
            drawable.setColorFilter(j.e(i10, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[RETURN] */
        @Override // androidx.appcompat.widget.w0.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.j.a()
                int[] r1 = r6.f1539a
                boolean r1 = r6.f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = g.a.f15713x
            L11:
                r1 = r0
            L12:
                r0 = -1
                r5 = 1
                goto L50
            L15:
                int[] r1 = r6.f1541c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L20
                int r8 = g.a.f15711v
                goto L11
            L20:
                int[] r1 = r6.f1542d
                boolean r1 = r6.f(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r8 = 16842801(0x1010031, float:2.3693695E-38)
                goto L12
            L32:
                int r1 = g.e.f15760u
                if (r8 != r1) goto L47
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r1 = r0
                r5 = 1
                r0 = r8
                r8 = 16842800(0x1010030, float:2.3693693E-38)
                goto L50
            L47:
                int r1 = g.e.f15751l
                if (r8 != r1) goto L4c
                goto L2d
            L4c:
                r1 = r0
                r8 = 0
                r0 = -1
                r5 = 0
            L50:
                if (r5 == 0) goto L6d
                boolean r3 = androidx.appcompat.widget.n0.a(r9)
                if (r3 == 0) goto L5c
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L5c:
                int r7 = androidx.appcompat.widget.b1.c(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.j.e(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L6c
                r9.setAlpha(r0)
            L6c:
                return r2
            L6d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.w0.f
        public PorterDuff.Mode b(int i10) {
            if (i10 == g.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.w0.f
        public Drawable c(w0 w0Var, Context context, int i10) {
            if (i10 == g.e.f15749j) {
                return new LayerDrawable(new Drawable[]{w0Var.j(context, g.e.f15748i), w0Var.j(context, g.e.f15750k)});
            }
            if (i10 == g.e.f15764y) {
                return l(w0Var, context, g.d.f15733i);
            }
            if (i10 == g.e.f15763x) {
                return l(w0Var, context, g.d.f15734j);
            }
            if (i10 == g.e.f15765z) {
                return l(w0Var, context, g.d.f15735k);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.w0.f
        public ColorStateList d(Context context, int i10) {
            if (i10 == g.e.f15752m) {
                return h.a.a(context, g.c.f15721e);
            }
            if (i10 == g.e.I) {
                return h.a.a(context, g.c.f15724h);
            }
            if (i10 == g.e.H) {
                return k(context);
            }
            if (i10 == g.e.f15745f) {
                return j(context);
            }
            if (i10 == g.e.f15741b) {
                return g(context);
            }
            if (i10 == g.e.f15744e) {
                return i(context);
            }
            if (i10 != g.e.D && i10 != g.e.E) {
                if (f(this.f1540b, i10)) {
                    return b1.e(context, g.a.f15713x);
                }
                if (f(this.f1543e, i10)) {
                    return h.a.a(context, g.c.f15720d);
                }
                if (f(this.f1544f, i10)) {
                    return h.a.a(context, g.c.f15719c);
                }
                if (i10 == g.e.A) {
                    return h.a.a(context, g.c.f15722f);
                }
                return null;
            }
            return h.a.a(context, g.c.f15723g);
        }

        @Override // androidx.appcompat.widget.w0.f
        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == g.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i11 = g.a.f15713x;
                m(findDrawableByLayerId, b1.c(context, i11), j.f1536b);
                m(layerDrawable.findDrawableByLayerId(16908303), b1.c(context, i11), j.f1536b);
                m(layerDrawable.findDrawableByLayerId(16908301), b1.c(context, g.a.f15711v), j.f1536b);
                return true;
            } else if (i10 != g.e.f15764y && i10 != g.e.f15763x && i10 != g.e.f15765z) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), b1.b(context, g.a.f15713x), j.f1536b);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i12 = g.a.f15711v;
                m(findDrawableByLayerId2, b1.c(context, i12), j.f1536b);
                m(layerDrawable2.findDrawableByLayerId(16908301), b1.c(context, i12), j.f1536b);
                return true;
            }
        }
    }

    public static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            if (f1537c == null) {
                h();
            }
            jVar = f1537c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter l10;
        synchronized (j.class) {
            l10 = w0.l(i10, mode);
        }
        return l10;
    }

    public static synchronized void h() {
        synchronized (j.class) {
            if (f1537c == null) {
                j jVar = new j();
                f1537c = jVar;
                jVar.f1538a = w0.h();
                f1537c.f1538a.u(new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Drawable drawable, e1 e1Var, int[] iArr) {
        w0.w(drawable, e1Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f1538a.j(context, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f1538a.k(context, i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList f(Context context, int i10) {
        return this.f1538a.m(context, i10);
    }

    public synchronized void g(Context context) {
        this.f1538a.s(context);
    }
}
