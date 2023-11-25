package p7;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import p7.k;
import p7.l;
import p7.m;

/* compiled from: MaterialShapeDrawable.java */
/* loaded from: classes3.dex */
public class g extends Drawable implements androidx.core.graphics.drawable.c, n {
    private static final String K = "g";
    private static final Paint L;
    private final Paint A;
    private final Paint B;
    private final o7.a C;
    private final l.b D;
    private final l E;
    private PorterDuffColorFilter F;
    private PorterDuffColorFilter G;
    private int H;
    private final RectF I;
    private boolean J;

    /* renamed from: f  reason: collision with root package name */
    private c f21173f;

    /* renamed from: m  reason: collision with root package name */
    private final m.g[] f21174m;

    /* renamed from: p  reason: collision with root package name */
    private final m.g[] f21175p;

    /* renamed from: q  reason: collision with root package name */
    private final BitSet f21176q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f21177r;

    /* renamed from: s  reason: collision with root package name */
    private final Matrix f21178s;

    /* renamed from: t  reason: collision with root package name */
    private final Path f21179t;

    /* renamed from: u  reason: collision with root package name */
    private final Path f21180u;

    /* renamed from: v  reason: collision with root package name */
    private final RectF f21181v;

    /* renamed from: w  reason: collision with root package name */
    private final RectF f21182w;

    /* renamed from: x  reason: collision with root package name */
    private final Region f21183x;

    /* renamed from: y  reason: collision with root package name */
    private final Region f21184y;

    /* renamed from: z  reason: collision with root package name */
    private k f21185z;

    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes3.dex */
    class a implements l.b {
        a() {
        }

        @Override // p7.l.b
        public void a(m mVar, Matrix matrix, int i10) {
            g.this.f21176q.set(i10, mVar.e());
            g.this.f21174m[i10] = mVar.f(matrix);
        }

        @Override // p7.l.b
        public void b(m mVar, Matrix matrix, int i10) {
            g.this.f21176q.set(i10 + 4, mVar.e());
            g.this.f21175p[i10] = mVar.f(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes3.dex */
    public class b implements k.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f21187a;

        b(float f10) {
            this.f21187a = f10;
        }

        @Override // p7.k.c
        public p7.c a(p7.c cVar) {
            if (!(cVar instanceof i)) {
                return new p7.b(this.f21187a, cVar);
            }
            return cVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        L = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    private float G() {
        if (P()) {
            return this.B.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean N() {
        c cVar = this.f21173f;
        int i10 = cVar.f21205q;
        if (i10 != 1 && cVar.f21206r > 0 && (i10 == 2 || X())) {
            return true;
        }
        return false;
    }

    private boolean O() {
        Paint.Style style = this.f21173f.f21210v;
        if (style != Paint.Style.FILL_AND_STROKE && style != Paint.Style.FILL) {
            return false;
        }
        return true;
    }

    private boolean P() {
        Paint.Style style = this.f21173f.f21210v;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.B.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    private void R() {
        super.invalidateSelf();
    }

    private void U(Canvas canvas) {
        if (!N()) {
            return;
        }
        canvas.save();
        W(canvas);
        if (!this.J) {
            n(canvas);
            canvas.restore();
            return;
        }
        int width = (int) (this.I.width() - getBounds().width());
        int height = (int) (this.I.height() - getBounds().height());
        if (width >= 0 && height >= 0) {
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.I.width()) + (this.f21173f.f21206r * 2) + width, ((int) this.I.height()) + (this.f21173f.f21206r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f10 = (getBounds().left - this.f21173f.f21206r) - width;
            float f11 = (getBounds().top - this.f21173f.f21206r) - height;
            canvas2.translate(-f10, -f11);
            n(canvas2);
            canvas.drawBitmap(createBitmap, f10, f11, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
            return;
        }
        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
    }

    private static int V(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void W(Canvas canvas) {
        canvas.translate(B(), C());
    }

    private PorterDuffColorFilter f(Paint paint, boolean z10) {
        if (z10) {
            int color = paint.getColor();
            int l10 = l(color);
            this.H = l10;
            if (l10 != color) {
                return new PorterDuffColorFilter(l10, PorterDuff.Mode.SRC_IN);
            }
            return null;
        }
        return null;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f21173f.f21198j != 1.0f) {
            this.f21178s.reset();
            Matrix matrix = this.f21178s;
            float f10 = this.f21173f.f21198j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f21178s);
        }
        path.computeBounds(this.I, true);
    }

    private void i() {
        k y10 = E().y(new b(-G()));
        this.f21185z = y10;
        this.E.d(y10, this.f21173f.f21199k, v(), this.f21180u);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.H = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        if (colorStateList != null && mode != null) {
            return j(colorStateList, mode, z10);
        }
        return f(paint, z10);
    }

    private boolean l0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f21173f.f21192d != null && color2 != (colorForState2 = this.f21173f.f21192d.getColorForState(iArr, (color2 = this.A.getColor())))) {
            this.A.setColor(colorForState2);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f21173f.f21193e != null && color != (colorForState = this.f21173f.f21193e.getColorForState(iArr, (color = this.B.getColor())))) {
            this.B.setColor(colorForState);
            return true;
        }
        return z10;
    }

    public static g m(Context context, float f10) {
        int c10 = d7.a.c(context, v6.b.f24647q, g.class.getSimpleName());
        g gVar = new g();
        gVar.Q(context);
        gVar.b0(ColorStateList.valueOf(c10));
        gVar.a0(f10);
        return gVar;
    }

    private boolean m0() {
        PorterDuffColorFilter porterDuffColorFilter = this.F;
        PorterDuffColorFilter porterDuffColorFilter2 = this.G;
        c cVar = this.f21173f;
        this.F = k(cVar.f21195g, cVar.f21196h, this.A, true);
        c cVar2 = this.f21173f;
        this.G = k(cVar2.f21194f, cVar2.f21196h, this.B, false);
        c cVar3 = this.f21173f;
        if (cVar3.f21209u) {
            this.C.d(cVar3.f21195g.getColorForState(getState(), 0));
        }
        if (!androidx.core.util.c.a(porterDuffColorFilter, this.F) || !androidx.core.util.c.a(porterDuffColorFilter2, this.G)) {
            return true;
        }
        return false;
    }

    private void n(Canvas canvas) {
        if (this.f21176q.cardinality() > 0) {
            Log.w(K, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f21173f.f21207s != 0) {
            canvas.drawPath(this.f21179t, this.C.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f21174m[i10].b(this.C, this.f21173f.f21206r, canvas);
            this.f21175p[i10].b(this.C, this.f21173f.f21206r, canvas);
        }
        if (this.J) {
            int B = B();
            int C = C();
            canvas.translate(-B, -C);
            canvas.drawPath(this.f21179t, L);
            canvas.translate(B, C);
        }
    }

    private void n0() {
        float M = M();
        this.f21173f.f21206r = (int) Math.ceil(0.75f * M);
        this.f21173f.f21207s = (int) Math.ceil(M * 0.25f);
        m0();
        R();
    }

    private void o(Canvas canvas) {
        q(canvas, this.A, this.f21179t, this.f21173f.f21189a, u());
    }

    private void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.u(rectF)) {
            float a10 = kVar.t().a(rectF) * this.f21173f.f21199k;
            canvas.drawRoundRect(rectF, a10, a10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private RectF v() {
        this.f21182w.set(u());
        float G = G();
        this.f21182w.inset(G, G);
        return this.f21182w;
    }

    public int A() {
        return this.H;
    }

    public int B() {
        c cVar = this.f21173f;
        return (int) (cVar.f21207s * Math.sin(Math.toRadians(cVar.f21208t)));
    }

    public int C() {
        c cVar = this.f21173f;
        return (int) (cVar.f21207s * Math.cos(Math.toRadians(cVar.f21208t)));
    }

    public int D() {
        return this.f21173f.f21206r;
    }

    public k E() {
        return this.f21173f.f21189a;
    }

    public ColorStateList F() {
        return this.f21173f.f21193e;
    }

    public float H() {
        return this.f21173f.f21200l;
    }

    public ColorStateList I() {
        return this.f21173f.f21195g;
    }

    public float J() {
        return this.f21173f.f21189a.r().a(u());
    }

    public float K() {
        return this.f21173f.f21189a.t().a(u());
    }

    public float L() {
        return this.f21173f.f21204p;
    }

    public float M() {
        return w() + L();
    }

    public void Q(Context context) {
        this.f21173f.f21190b = new g7.a(context);
        n0();
    }

    public boolean S() {
        g7.a aVar = this.f21173f.f21190b;
        if (aVar != null && aVar.e()) {
            return true;
        }
        return false;
    }

    public boolean T() {
        return this.f21173f.f21189a.u(u());
    }

    public boolean X() {
        int i10 = Build.VERSION.SDK_INT;
        if (!T() && !this.f21179t.isConvex() && i10 < 29) {
            return true;
        }
        return false;
    }

    public void Y(float f10) {
        setShapeAppearanceModel(this.f21173f.f21189a.w(f10));
    }

    public void Z(p7.c cVar) {
        setShapeAppearanceModel(this.f21173f.f21189a.x(cVar));
    }

    public void a0(float f10) {
        c cVar = this.f21173f;
        if (cVar.f21203o != f10) {
            cVar.f21203o = f10;
            n0();
        }
    }

    public void b0(ColorStateList colorStateList) {
        c cVar = this.f21173f;
        if (cVar.f21192d != colorStateList) {
            cVar.f21192d = colorStateList;
            onStateChange(getState());
        }
    }

    public void c0(float f10) {
        c cVar = this.f21173f;
        if (cVar.f21199k != f10) {
            cVar.f21199k = f10;
            this.f21177r = true;
            invalidateSelf();
        }
    }

    public void d0(int i10, int i11, int i12, int i13) {
        c cVar = this.f21173f;
        if (cVar.f21197i == null) {
            cVar.f21197i = new Rect();
        }
        this.f21173f.f21197i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.A.setColorFilter(this.F);
        int alpha = this.A.getAlpha();
        this.A.setAlpha(V(alpha, this.f21173f.f21201m));
        this.B.setColorFilter(this.G);
        this.B.setStrokeWidth(this.f21173f.f21200l);
        int alpha2 = this.B.getAlpha();
        this.B.setAlpha(V(alpha2, this.f21173f.f21201m));
        if (this.f21177r) {
            i();
            g(u(), this.f21179t);
            this.f21177r = false;
        }
        U(canvas);
        if (O()) {
            o(canvas);
        }
        if (P()) {
            r(canvas);
        }
        this.A.setAlpha(alpha);
        this.B.setAlpha(alpha2);
    }

    public void e0(float f10) {
        c cVar = this.f21173f;
        if (cVar.f21202n != f10) {
            cVar.f21202n = f10;
            n0();
        }
    }

    public void f0(boolean z10) {
        this.J = z10;
    }

    public void g0(int i10) {
        this.C.d(i10);
        this.f21173f.f21209u = false;
        R();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f21173f.f21201m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f21173f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f21173f.f21205q == 2) {
            return;
        }
        if (T()) {
            outline.setRoundRect(getBounds(), J() * this.f21173f.f21199k);
            return;
        }
        g(u(), this.f21179t);
        f7.d.f(outline, this.f21179t);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f21173f.f21197i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f21183x.set(getBounds());
        g(u(), this.f21179t);
        this.f21184y.setPath(this.f21179t, this.f21183x);
        this.f21183x.op(this.f21184y, Region.Op.DIFFERENCE);
        return this.f21183x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(RectF rectF, Path path) {
        l lVar = this.E;
        c cVar = this.f21173f;
        lVar.e(cVar.f21189a, cVar.f21199k, rectF, this.D, path);
    }

    public void h0(float f10, int i10) {
        k0(f10);
        j0(ColorStateList.valueOf(i10));
    }

    public void i0(float f10, ColorStateList colorStateList) {
        k0(f10);
        j0(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f21177r = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.f21173f.f21195g) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f21173f.f21194f) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.f21173f.f21193e) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.f21173f.f21192d) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    public void j0(ColorStateList colorStateList) {
        c cVar = this.f21173f;
        if (cVar.f21193e != colorStateList) {
            cVar.f21193e = colorStateList;
            onStateChange(getState());
        }
    }

    public void k0(float f10) {
        this.f21173f.f21200l = f10;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int l(int i10) {
        float M = M() + z();
        g7.a aVar = this.f21173f.f21190b;
        if (aVar != null) {
            return aVar.c(i10, M);
        }
        return i10;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f21173f = new c(this.f21173f);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f21177r = true;
        super.onBoundsChange(rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.n.b
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        boolean l02 = l0(iArr);
        boolean m02 = m0();
        if (!l02 && !m02) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f21173f.f21189a, rectF);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r(Canvas canvas) {
        q(canvas, this.B, this.f21180u, this.f21185z, v());
    }

    public float s() {
        return this.f21173f.f21189a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f21173f;
        if (cVar.f21201m != i10) {
            cVar.f21201m = i10;
            R();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21173f.f21191c = colorFilter;
        R();
    }

    @Override // p7.n
    public void setShapeAppearanceModel(k kVar) {
        this.f21173f.f21189a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f21173f.f21195g = colorStateList;
        m0();
        R();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f21173f;
        if (cVar.f21196h != mode) {
            cVar.f21196h = mode;
            m0();
            R();
        }
    }

    public float t() {
        return this.f21173f.f21189a.l().a(u());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RectF u() {
        this.f21181v.set(getBounds());
        return this.f21181v;
    }

    public float w() {
        return this.f21173f.f21203o;
    }

    public ColorStateList x() {
        return this.f21173f.f21192d;
    }

    public float y() {
        return this.f21173f.f21199k;
    }

    public float z() {
        return this.f21173f.f21202n;
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.e(context, attributeSet, i10, i11).m());
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g(c cVar) {
        l lVar;
        this.f21174m = new m.g[4];
        this.f21175p = new m.g[4];
        this.f21176q = new BitSet(8);
        this.f21178s = new Matrix();
        this.f21179t = new Path();
        this.f21180u = new Path();
        this.f21181v = new RectF();
        this.f21182w = new RectF();
        this.f21183x = new Region();
        this.f21184y = new Region();
        Paint paint = new Paint(1);
        this.A = paint;
        Paint paint2 = new Paint(1);
        this.B = paint2;
        this.C = new o7.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.k();
        } else {
            lVar = new l();
        }
        this.E = lVar;
        this.I = new RectF();
        this.J = true;
        this.f21173f = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m0();
        l0(getState());
        this.D = new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes3.dex */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        k f21189a;

        /* renamed from: b  reason: collision with root package name */
        g7.a f21190b;

        /* renamed from: c  reason: collision with root package name */
        ColorFilter f21191c;

        /* renamed from: d  reason: collision with root package name */
        ColorStateList f21192d;

        /* renamed from: e  reason: collision with root package name */
        ColorStateList f21193e;

        /* renamed from: f  reason: collision with root package name */
        ColorStateList f21194f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f21195g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f21196h;

        /* renamed from: i  reason: collision with root package name */
        Rect f21197i;

        /* renamed from: j  reason: collision with root package name */
        float f21198j;

        /* renamed from: k  reason: collision with root package name */
        float f21199k;

        /* renamed from: l  reason: collision with root package name */
        float f21200l;

        /* renamed from: m  reason: collision with root package name */
        int f21201m;

        /* renamed from: n  reason: collision with root package name */
        float f21202n;

        /* renamed from: o  reason: collision with root package name */
        float f21203o;

        /* renamed from: p  reason: collision with root package name */
        float f21204p;

        /* renamed from: q  reason: collision with root package name */
        int f21205q;

        /* renamed from: r  reason: collision with root package name */
        int f21206r;

        /* renamed from: s  reason: collision with root package name */
        int f21207s;

        /* renamed from: t  reason: collision with root package name */
        int f21208t;

        /* renamed from: u  reason: collision with root package name */
        boolean f21209u;

        /* renamed from: v  reason: collision with root package name */
        Paint.Style f21210v;

        public c(k kVar, g7.a aVar) {
            this.f21192d = null;
            this.f21193e = null;
            this.f21194f = null;
            this.f21195g = null;
            this.f21196h = PorterDuff.Mode.SRC_IN;
            this.f21197i = null;
            this.f21198j = 1.0f;
            this.f21199k = 1.0f;
            this.f21201m = 255;
            this.f21202n = 0.0f;
            this.f21203o = 0.0f;
            this.f21204p = 0.0f;
            this.f21205q = 0;
            this.f21206r = 0;
            this.f21207s = 0;
            this.f21208t = 0;
            this.f21209u = false;
            this.f21210v = Paint.Style.FILL_AND_STROKE;
            this.f21189a = kVar;
            this.f21190b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f21177r = true;
            return gVar;
        }

        public c(c cVar) {
            this.f21192d = null;
            this.f21193e = null;
            this.f21194f = null;
            this.f21195g = null;
            this.f21196h = PorterDuff.Mode.SRC_IN;
            this.f21197i = null;
            this.f21198j = 1.0f;
            this.f21199k = 1.0f;
            this.f21201m = 255;
            this.f21202n = 0.0f;
            this.f21203o = 0.0f;
            this.f21204p = 0.0f;
            this.f21205q = 0;
            this.f21206r = 0;
            this.f21207s = 0;
            this.f21208t = 0;
            this.f21209u = false;
            this.f21210v = Paint.Style.FILL_AND_STROKE;
            this.f21189a = cVar.f21189a;
            this.f21190b = cVar.f21190b;
            this.f21200l = cVar.f21200l;
            this.f21191c = cVar.f21191c;
            this.f21192d = cVar.f21192d;
            this.f21193e = cVar.f21193e;
            this.f21196h = cVar.f21196h;
            this.f21195g = cVar.f21195g;
            this.f21201m = cVar.f21201m;
            this.f21198j = cVar.f21198j;
            this.f21207s = cVar.f21207s;
            this.f21205q = cVar.f21205q;
            this.f21209u = cVar.f21209u;
            this.f21199k = cVar.f21199k;
            this.f21202n = cVar.f21202n;
            this.f21203o = cVar.f21203o;
            this.f21204p = cVar.f21204p;
            this.f21206r = cVar.f21206r;
            this.f21208t = cVar.f21208t;
            this.f21194f = cVar.f21194f;
            this.f21210v = cVar.f21210v;
            if (cVar.f21197i != null) {
                this.f21197i = new Rect(cVar.f21197i);
            }
        }
    }
}
