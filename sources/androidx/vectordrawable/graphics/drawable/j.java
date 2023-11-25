package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.l;
import androidx.core.graphics.d;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes.dex */
public class j extends androidx.vectordrawable.graphics.drawable.i {

    /* renamed from: x  reason: collision with root package name */
    static final PorterDuff.Mode f7205x = PorterDuff.Mode.SRC_IN;

    /* renamed from: m  reason: collision with root package name */
    private h f7206m;

    /* renamed from: p  reason: collision with root package name */
    private PorterDuffColorFilter f7207p;

    /* renamed from: q  reason: collision with root package name */
    private ColorFilter f7208q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f7209r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f7210s;

    /* renamed from: t  reason: collision with root package name */
    private Drawable.ConstantState f7211t;

    /* renamed from: u  reason: collision with root package name */
    private final float[] f7212u;

    /* renamed from: v  reason: collision with root package name */
    private final Matrix f7213v;

    /* renamed from: w  reason: collision with root package name */
    private final Rect f7214w;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f7241b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f7240a = androidx.core.graphics.d.d(string2);
            }
            this.f7242c = l.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.j.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (!l.r(xmlPullParser, "pathData")) {
                return;
            }
            TypedArray s10 = l.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f7176d);
            f(s10, xmlPullParser);
            s10.recycle();
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f7261a;

        /* renamed from: b  reason: collision with root package name */
        g f7262b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f7263c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f7264d;

        /* renamed from: e  reason: collision with root package name */
        boolean f7265e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f7266f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f7267g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f7268h;

        /* renamed from: i  reason: collision with root package name */
        int f7269i;

        /* renamed from: j  reason: collision with root package name */
        boolean f7270j;

        /* renamed from: k  reason: collision with root package name */
        boolean f7271k;

        /* renamed from: l  reason: collision with root package name */
        Paint f7272l;

        public h(h hVar) {
            this.f7263c = null;
            this.f7264d = j.f7205x;
            if (hVar != null) {
                this.f7261a = hVar.f7261a;
                g gVar = new g(hVar.f7262b);
                this.f7262b = gVar;
                if (hVar.f7262b.f7249e != null) {
                    gVar.f7249e = new Paint(hVar.f7262b.f7249e);
                }
                if (hVar.f7262b.f7248d != null) {
                    this.f7262b.f7248d = new Paint(hVar.f7262b.f7248d);
                }
                this.f7263c = hVar.f7263c;
                this.f7264d = hVar.f7264d;
                this.f7265e = hVar.f7265e;
            }
        }

        public boolean a(int i10, int i11) {
            if (i10 == this.f7266f.getWidth() && i11 == this.f7266f.getHeight()) {
                return true;
            }
            return false;
        }

        public boolean b() {
            if (!this.f7271k && this.f7267g == this.f7263c && this.f7268h == this.f7264d && this.f7270j == this.f7265e && this.f7269i == this.f7262b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        public void c(int i10, int i11) {
            if (this.f7266f == null || !a(i10, i11)) {
                this.f7266f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f7271k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f7266f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f7272l == null) {
                Paint paint = new Paint();
                this.f7272l = paint;
                paint.setFilterBitmap(true);
            }
            this.f7272l.setAlpha(this.f7262b.getRootAlpha());
            this.f7272l.setColorFilter(colorFilter);
            return this.f7272l;
        }

        public boolean f() {
            if (this.f7262b.getRootAlpha() < 255) {
                return true;
            }
            return false;
        }

        public boolean g() {
            return this.f7262b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f7261a;
        }

        public boolean h(int[] iArr) {
            boolean g10 = this.f7262b.g(iArr);
            this.f7271k |= g10;
            return g10;
        }

        public void i() {
            this.f7267g = this.f7263c;
            this.f7268h = this.f7264d;
            this.f7269i = this.f7262b.getRootAlpha();
            this.f7270j = this.f7265e;
            this.f7271k = false;
        }

        public void j(int i10, int i11) {
            this.f7266f.eraseColor(0);
            this.f7262b.b(new Canvas(this.f7266f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new j(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new j(this);
        }

        public h() {
            this.f7263c = null;
            this.f7264d = j.f7205x;
            this.f7262b = new g();
        }
    }

    j() {
        this.f7210s = true;
        this.f7212u = new float[9];
        this.f7213v = new Matrix();
        this.f7214w = new Rect();
        this.f7206m = new h();
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static j b(Resources resources, int i10, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            j jVar = new j();
            jVar.f7204f = androidx.core.content.res.h.e(resources, i10, theme);
            jVar.f7211t = new i(jVar.f7204f.getConstantState());
            return jVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        } catch (XmlPullParserException e11) {
            Log.e("VectorDrawableCompat", "parser error", e11);
            return null;
        }
    }

    public static j c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        j jVar = new j();
        jVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return jVar;
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f7206m;
        g gVar = hVar.f7262b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f7252h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f7228b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f7260p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f7261a = cVar.f7243d | hVar.f7261a;
                    z10 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f7228b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f7260p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f7261a = bVar.f7243d | hVar.f7261a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f7228b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f7260p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f7261a = dVar2.f7237k | hVar.f7261a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (!z10) {
            return;
        }
        throw new XmlPullParserException("no path defined");
    }

    private boolean f() {
        if (isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1) {
            return true;
        }
        return false;
    }

    private static PorterDuff.Mode g(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f7206m;
        g gVar = hVar.f7262b;
        hVar.f7264d = g(l.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g10 = l.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g10 != null) {
            hVar.f7263c = g10;
        }
        hVar.f7265e = l.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f7265e);
        gVar.f7255k = l.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f7255k);
        float j10 = l.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f7256l);
        gVar.f7256l = j10;
        if (gVar.f7255k > 0.0f) {
            if (j10 > 0.0f) {
                gVar.f7253i = typedArray.getDimension(3, gVar.f7253i);
                float dimension = typedArray.getDimension(2, gVar.f7254j);
                gVar.f7254j = dimension;
                if (gVar.f7253i > 0.0f) {
                    if (dimension > 0.0f) {
                        gVar.setAlpha(l.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                        String string = typedArray.getString(0);
                        if (string != null) {
                            gVar.f7258n = string;
                            gVar.f7260p.put(string, gVar);
                            return;
                        }
                        return;
                    }
                    throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
                }
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            }
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b(drawable);
            return false;
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f7206m.f7262b.f7260p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f7214w);
        if (this.f7214w.width() > 0 && this.f7214w.height() > 0) {
            ColorFilter colorFilter = this.f7208q;
            if (colorFilter == null) {
                colorFilter = this.f7207p;
            }
            canvas.getMatrix(this.f7213v);
            this.f7213v.getValues(this.f7212u);
            float abs = Math.abs(this.f7212u[0]);
            float abs2 = Math.abs(this.f7212u[4]);
            float abs3 = Math.abs(this.f7212u[1]);
            float abs4 = Math.abs(this.f7212u[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min((int) RecyclerView.m.FLAG_MOVED, (int) (this.f7214w.width() * abs));
            int min2 = Math.min((int) RecyclerView.m.FLAG_MOVED, (int) (this.f7214w.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f7214w;
                canvas.translate(rect.left, rect.top);
                if (f()) {
                    canvas.translate(this.f7214w.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f7214w.offsetTo(0, 0);
                this.f7206m.c(min, min2);
                if (!this.f7210s) {
                    this.f7206m.j(min, min2);
                } else if (!this.f7206m.b()) {
                    this.f7206m.j(min, min2);
                    this.f7206m.i();
                }
                this.f7206m.d(canvas, colorFilter, this.f7214w);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f7206m.f7262b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f7206m.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.f7208q;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f7204f != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f7204f.getConstantState());
        }
        this.f7206m.f7261a = getChangingConfigurations();
        return this.f7206m;
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f7206m.f7262b.f7254j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f7206m.f7262b.f7253i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z10) {
        this.f7210s = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.f7206m.f7265e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful() && ((hVar = this.f7206m) == null || (!hVar.g() && ((colorStateList = this.f7206m.f7263c) == null || !colorStateList.isStateful())))) {
            return false;
        }
        return true;
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f7209r && super.mutate() == this) {
            this.f7206m = new h(this.f7206m);
            this.f7209r = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f7206m;
        ColorStateList colorStateList = hVar.f7263c;
        if (colorStateList != null && (mode = hVar.f7264d) != null) {
            this.f7207p = j(this.f7207p, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        if (hVar.g() && hVar.h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f7206m.f7262b.getRootAlpha() != i10) {
            this.f7206m.f7262b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z10);
        } else {
            this.f7206m.f7265e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f7206m;
        if (hVar.f7263c != colorStateList) {
            hVar.f7263c = colorStateList;
            this.f7207p = j(this.f7207p, colorStateList, hVar.f7264d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        h hVar = this.f7206m;
        if (hVar.f7264d != mode) {
            hVar.f7264d = mode;
            this.f7207p = j(this.f7207p, hVar.f7263c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f7273a;

        public i(Drawable.ConstantState constantState) {
            this.f7273a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f7273a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f7273a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            j jVar = new j();
            jVar.f7204f = (VectorDrawable) this.f7273a.newDrawable();
            return jVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            j jVar = new j();
            jVar.f7204f = (VectorDrawable) this.f7273a.newDrawable(resources);
            return jVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            j jVar = new j();
            jVar.f7204f = (VectorDrawable) this.f7273a.newDrawable(resources, theme);
            return jVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f7208q = colorFilter;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        protected d.b[] f7240a;

        /* renamed from: b  reason: collision with root package name */
        String f7241b;

        /* renamed from: c  reason: collision with root package name */
        int f7242c;

        /* renamed from: d  reason: collision with root package name */
        int f7243d;

        public f() {
            super();
            this.f7240a = null;
            this.f7242c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            d.b[] bVarArr = this.f7240a;
            if (bVarArr != null) {
                d.b.e(bVarArr, path);
            }
        }

        public d.b[] getPathData() {
            return this.f7240a;
        }

        public String getPathName() {
            return this.f7241b;
        }

        public void setPathData(d.b[] bVarArr) {
            if (!androidx.core.graphics.d.b(this.f7240a, bVarArr)) {
                this.f7240a = androidx.core.graphics.d.f(bVarArr);
            } else {
                androidx.core.graphics.d.j(this.f7240a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f7240a = null;
            this.f7242c = 0;
            this.f7241b = fVar.f7241b;
            this.f7243d = fVar.f7243d;
            this.f7240a = androidx.core.graphics.d.f(fVar.f7240a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f7206m;
        hVar.f7262b = new g();
        TypedArray s10 = l.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f7173a);
        i(s10, xmlPullParser, theme);
        s10.recycle();
        hVar.f7261a = getChangingConfigurations();
        hVar.f7271k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f7207p = j(this.f7207p, hVar.f7263c, hVar.f7264d);
    }

    j(h hVar) {
        this.f7210s = true;
        this.f7212u = new float[9];
        this.f7213v = new Matrix();
        this.f7214w = new Rect();
        this.f7206m = hVar;
        this.f7207p = j(this.f7207p, hVar.f7263c, hVar.f7264d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f7215e;

        /* renamed from: f  reason: collision with root package name */
        androidx.core.content.res.d f7216f;

        /* renamed from: g  reason: collision with root package name */
        float f7217g;

        /* renamed from: h  reason: collision with root package name */
        androidx.core.content.res.d f7218h;

        /* renamed from: i  reason: collision with root package name */
        float f7219i;

        /* renamed from: j  reason: collision with root package name */
        float f7220j;

        /* renamed from: k  reason: collision with root package name */
        float f7221k;

        /* renamed from: l  reason: collision with root package name */
        float f7222l;

        /* renamed from: m  reason: collision with root package name */
        float f7223m;

        /* renamed from: n  reason: collision with root package name */
        Paint.Cap f7224n;

        /* renamed from: o  reason: collision with root package name */
        Paint.Join f7225o;

        /* renamed from: p  reason: collision with root package name */
        float f7226p;

        c() {
            this.f7217g = 0.0f;
            this.f7219i = 1.0f;
            this.f7220j = 1.0f;
            this.f7221k = 0.0f;
            this.f7222l = 1.0f;
            this.f7223m = 0.0f;
            this.f7224n = Paint.Cap.BUTT;
            this.f7225o = Paint.Join.MITER;
            this.f7226p = 4.0f;
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return cap;
                    }
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return join;
                    }
                    return Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f7215e = null;
            if (!l.r(xmlPullParser, "pathData")) {
                return;
            }
            String string = typedArray.getString(0);
            if (string != null) {
                this.f7241b = string;
            }
            String string2 = typedArray.getString(2);
            if (string2 != null) {
                this.f7240a = androidx.core.graphics.d.d(string2);
            }
            this.f7218h = l.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
            this.f7220j = l.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f7220j);
            this.f7224n = e(l.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f7224n);
            this.f7225o = f(l.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f7225o);
            this.f7226p = l.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f7226p);
            this.f7216f = l.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
            this.f7219i = l.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f7219i);
            this.f7217g = l.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f7217g);
            this.f7222l = l.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f7222l);
            this.f7223m = l.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f7223m);
            this.f7221k = l.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f7221k);
            this.f7242c = l.k(typedArray, xmlPullParser, "fillType", 13, this.f7242c);
        }

        @Override // androidx.vectordrawable.graphics.drawable.j.e
        public boolean a() {
            if (!this.f7218h.i() && !this.f7216f.i()) {
                return false;
            }
            return true;
        }

        @Override // androidx.vectordrawable.graphics.drawable.j.e
        public boolean b(int[] iArr) {
            return this.f7216f.j(iArr) | this.f7218h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s10 = l.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f7175c);
            h(s10, xmlPullParser, theme);
            s10.recycle();
        }

        float getFillAlpha() {
            return this.f7220j;
        }

        int getFillColor() {
            return this.f7218h.e();
        }

        float getStrokeAlpha() {
            return this.f7219i;
        }

        int getStrokeColor() {
            return this.f7216f.e();
        }

        float getStrokeWidth() {
            return this.f7217g;
        }

        float getTrimPathEnd() {
            return this.f7222l;
        }

        float getTrimPathOffset() {
            return this.f7223m;
        }

        float getTrimPathStart() {
            return this.f7221k;
        }

        void setFillAlpha(float f10) {
            this.f7220j = f10;
        }

        void setFillColor(int i10) {
            this.f7218h.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f7219i = f10;
        }

        void setStrokeColor(int i10) {
            this.f7216f.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f7217g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f7222l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f7223m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f7221k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f7217g = 0.0f;
            this.f7219i = 1.0f;
            this.f7220j = 1.0f;
            this.f7221k = 0.0f;
            this.f7222l = 1.0f;
            this.f7223m = 0.0f;
            this.f7224n = Paint.Cap.BUTT;
            this.f7225o = Paint.Join.MITER;
            this.f7226p = 4.0f;
            this.f7215e = cVar.f7215e;
            this.f7216f = cVar.f7216f;
            this.f7217g = cVar.f7217g;
            this.f7219i = cVar.f7219i;
            this.f7218h = cVar.f7218h;
            this.f7242c = cVar.f7242c;
            this.f7220j = cVar.f7220j;
            this.f7221k = cVar.f7221k;
            this.f7222l = cVar.f7222l;
            this.f7223m = cVar.f7223m;
            this.f7224n = cVar.f7224n;
            this.f7225o = cVar.f7225o;
            this.f7226p = cVar.f7226p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: q  reason: collision with root package name */
        private static final Matrix f7244q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        private final Path f7245a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f7246b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f7247c;

        /* renamed from: d  reason: collision with root package name */
        Paint f7248d;

        /* renamed from: e  reason: collision with root package name */
        Paint f7249e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f7250f;

        /* renamed from: g  reason: collision with root package name */
        private int f7251g;

        /* renamed from: h  reason: collision with root package name */
        final d f7252h;

        /* renamed from: i  reason: collision with root package name */
        float f7253i;

        /* renamed from: j  reason: collision with root package name */
        float f7254j;

        /* renamed from: k  reason: collision with root package name */
        float f7255k;

        /* renamed from: l  reason: collision with root package name */
        float f7256l;

        /* renamed from: m  reason: collision with root package name */
        int f7257m;

        /* renamed from: n  reason: collision with root package name */
        String f7258n;

        /* renamed from: o  reason: collision with root package name */
        Boolean f7259o;

        /* renamed from: p  reason: collision with root package name */
        final androidx.collection.a<String, Object> f7260p;

        public g() {
            this.f7247c = new Matrix();
            this.f7253i = 0.0f;
            this.f7254j = 0.0f;
            this.f7255k = 0.0f;
            this.f7256l = 0.0f;
            this.f7257m = 255;
            this.f7258n = null;
            this.f7259o = null;
            this.f7260p = new androidx.collection.a<>();
            this.f7252h = new d();
            this.f7245a = new Path();
            this.f7246b = new Path();
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f7227a.set(matrix);
            dVar.f7227a.preConcat(dVar.f7236j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f7228b.size(); i12++) {
                e eVar = dVar.f7228b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f7227a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            Path.FillType fillType;
            Path.FillType fillType2;
            float f10 = i10 / this.f7255k;
            float f11 = i11 / this.f7256l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f7227a;
            this.f7247c.set(matrix);
            this.f7247c.postScale(f10, f11);
            float e10 = e(matrix);
            if (e10 == 0.0f) {
                return;
            }
            fVar.d(this.f7245a);
            Path path = this.f7245a;
            this.f7246b.reset();
            if (fVar.c()) {
                Path path2 = this.f7246b;
                if (fVar.f7242c == 0) {
                    fillType2 = Path.FillType.WINDING;
                } else {
                    fillType2 = Path.FillType.EVEN_ODD;
                }
                path2.setFillType(fillType2);
                this.f7246b.addPath(path, this.f7247c);
                canvas.clipPath(this.f7246b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f7221k;
            if (f12 != 0.0f || cVar.f7222l != 1.0f) {
                float f13 = cVar.f7223m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f7222l + f13) % 1.0f;
                if (this.f7250f == null) {
                    this.f7250f = new PathMeasure();
                }
                this.f7250f.setPath(this.f7245a, false);
                float length = this.f7250f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f7250f.getSegment(f16, length, path, true);
                    this.f7250f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f7250f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f7246b.addPath(path, this.f7247c);
            if (cVar.f7218h.l()) {
                androidx.core.content.res.d dVar2 = cVar.f7218h;
                if (this.f7249e == null) {
                    Paint paint = new Paint(1);
                    this.f7249e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f7249e;
                if (dVar2.h()) {
                    Shader f18 = dVar2.f();
                    f18.setLocalMatrix(this.f7247c);
                    paint2.setShader(f18);
                    paint2.setAlpha(Math.round(cVar.f7220j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(j.a(dVar2.e(), cVar.f7220j));
                }
                paint2.setColorFilter(colorFilter);
                Path path3 = this.f7246b;
                if (cVar.f7242c == 0) {
                    fillType = Path.FillType.WINDING;
                } else {
                    fillType = Path.FillType.EVEN_ODD;
                }
                path3.setFillType(fillType);
                canvas.drawPath(this.f7246b, paint2);
            }
            if (cVar.f7216f.l()) {
                androidx.core.content.res.d dVar3 = cVar.f7216f;
                if (this.f7248d == null) {
                    Paint paint3 = new Paint(1);
                    this.f7248d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f7248d;
                Paint.Join join = cVar.f7225o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f7224n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f7226p);
                if (dVar3.h()) {
                    Shader f19 = dVar3.f();
                    f19.setLocalMatrix(this.f7247c);
                    paint4.setShader(f19);
                    paint4.setAlpha(Math.round(cVar.f7219i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(j.a(dVar3.e(), cVar.f7219i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f7217g * min * e10);
                canvas.drawPath(this.f7246b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float a10 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max <= 0.0f) {
                return 0.0f;
            }
            return Math.abs(a10) / max;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f7252h, f7244q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f7259o == null) {
                this.f7259o = Boolean.valueOf(this.f7252h.a());
            }
            return this.f7259o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f7252h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f7257m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f7257m = i10;
        }

        public g(g gVar) {
            this.f7247c = new Matrix();
            this.f7253i = 0.0f;
            this.f7254j = 0.0f;
            this.f7255k = 0.0f;
            this.f7256l = 0.0f;
            this.f7257m = 255;
            this.f7258n = null;
            this.f7259o = null;
            androidx.collection.a<String, Object> aVar = new androidx.collection.a<>();
            this.f7260p = aVar;
            this.f7252h = new d(gVar.f7252h, aVar);
            this.f7245a = new Path(gVar.f7245a);
            this.f7246b = new Path(gVar.f7246b);
            this.f7253i = gVar.f7253i;
            this.f7254j = gVar.f7254j;
            this.f7255k = gVar.f7255k;
            this.f7256l = gVar.f7256l;
            this.f7251g = gVar.f7251g;
            this.f7257m = gVar.f7257m;
            this.f7258n = gVar.f7258n;
            String str = gVar.f7258n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f7259o = gVar.f7259o;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f7227a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<e> f7228b;

        /* renamed from: c  reason: collision with root package name */
        float f7229c;

        /* renamed from: d  reason: collision with root package name */
        private float f7230d;

        /* renamed from: e  reason: collision with root package name */
        private float f7231e;

        /* renamed from: f  reason: collision with root package name */
        private float f7232f;

        /* renamed from: g  reason: collision with root package name */
        private float f7233g;

        /* renamed from: h  reason: collision with root package name */
        private float f7234h;

        /* renamed from: i  reason: collision with root package name */
        private float f7235i;

        /* renamed from: j  reason: collision with root package name */
        final Matrix f7236j;

        /* renamed from: k  reason: collision with root package name */
        int f7237k;

        /* renamed from: l  reason: collision with root package name */
        private int[] f7238l;

        /* renamed from: m  reason: collision with root package name */
        private String f7239m;

        public d(d dVar, androidx.collection.a<String, Object> aVar) {
            super();
            f bVar;
            this.f7227a = new Matrix();
            this.f7228b = new ArrayList<>();
            this.f7229c = 0.0f;
            this.f7230d = 0.0f;
            this.f7231e = 0.0f;
            this.f7232f = 1.0f;
            this.f7233g = 1.0f;
            this.f7234h = 0.0f;
            this.f7235i = 0.0f;
            Matrix matrix = new Matrix();
            this.f7236j = matrix;
            this.f7239m = null;
            this.f7229c = dVar.f7229c;
            this.f7230d = dVar.f7230d;
            this.f7231e = dVar.f7231e;
            this.f7232f = dVar.f7232f;
            this.f7233g = dVar.f7233g;
            this.f7234h = dVar.f7234h;
            this.f7235i = dVar.f7235i;
            this.f7238l = dVar.f7238l;
            String str = dVar.f7239m;
            this.f7239m = str;
            this.f7237k = dVar.f7237k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f7236j);
            ArrayList<e> arrayList = dVar.f7228b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f7228b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        bVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f7228b.add(bVar);
                    String str2 = bVar.f7241b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f7236j.reset();
            this.f7236j.postTranslate(-this.f7230d, -this.f7231e);
            this.f7236j.postScale(this.f7232f, this.f7233g);
            this.f7236j.postRotate(this.f7229c, 0.0f, 0.0f);
            this.f7236j.postTranslate(this.f7234h + this.f7230d, this.f7235i + this.f7231e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f7238l = null;
            this.f7229c = l.j(typedArray, xmlPullParser, "rotation", 5, this.f7229c);
            this.f7230d = typedArray.getFloat(1, this.f7230d);
            this.f7231e = typedArray.getFloat(2, this.f7231e);
            this.f7232f = l.j(typedArray, xmlPullParser, "scaleX", 3, this.f7232f);
            this.f7233g = l.j(typedArray, xmlPullParser, "scaleY", 4, this.f7233g);
            this.f7234h = l.j(typedArray, xmlPullParser, "translateX", 6, this.f7234h);
            this.f7235i = l.j(typedArray, xmlPullParser, "translateY", 7, this.f7235i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f7239m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.j.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f7228b.size(); i10++) {
                if (this.f7228b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.j.e
        public boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f7228b.size(); i10++) {
                z10 |= this.f7228b.get(i10).b(iArr);
            }
            return z10;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s10 = l.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f7174b);
            e(s10, xmlPullParser);
            s10.recycle();
        }

        public String getGroupName() {
            return this.f7239m;
        }

        public Matrix getLocalMatrix() {
            return this.f7236j;
        }

        public float getPivotX() {
            return this.f7230d;
        }

        public float getPivotY() {
            return this.f7231e;
        }

        public float getRotation() {
            return this.f7229c;
        }

        public float getScaleX() {
            return this.f7232f;
        }

        public float getScaleY() {
            return this.f7233g;
        }

        public float getTranslateX() {
            return this.f7234h;
        }

        public float getTranslateY() {
            return this.f7235i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f7230d) {
                this.f7230d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f7231e) {
                this.f7231e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f7229c) {
                this.f7229c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f7232f) {
                this.f7232f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f7233g) {
                this.f7233g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f7234h) {
                this.f7234h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f7235i) {
                this.f7235i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f7227a = new Matrix();
            this.f7228b = new ArrayList<>();
            this.f7229c = 0.0f;
            this.f7230d = 0.0f;
            this.f7231e = 0.0f;
            this.f7232f = 1.0f;
            this.f7233g = 1.0f;
            this.f7234h = 0.0f;
            this.f7235i = 0.0f;
            this.f7236j = new Matrix();
            this.f7239m = null;
        }
    }
}
