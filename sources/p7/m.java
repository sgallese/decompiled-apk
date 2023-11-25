package p7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ShapePath.java */
/* loaded from: classes3.dex */
public class m {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f21256a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f21257b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f21258c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f21259d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f21260e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f21261f;

    /* renamed from: g  reason: collision with root package name */
    private final List<f> f21262g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<g> f21263h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private boolean f21264i;

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    class a extends g {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f21265c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Matrix f21266d;

        a(List list, Matrix matrix) {
            this.f21265c = list;
            this.f21266d = matrix;
        }

        @Override // p7.m.g
        public void a(Matrix matrix, o7.a aVar, int i10, Canvas canvas) {
            Iterator it = this.f21265c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f21266d, aVar, i10, canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static class b extends g {

        /* renamed from: c  reason: collision with root package name */
        private final d f21268c;

        public b(d dVar) {
            this.f21268c = dVar;
        }

        @Override // p7.m.g
        public void a(Matrix matrix, o7.a aVar, int i10, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f21268c.k(), this.f21268c.o(), this.f21268c.l(), this.f21268c.j()), i10, this.f21268c.m(), this.f21268c.n());
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    static class c extends g {

        /* renamed from: c  reason: collision with root package name */
        private final e f21269c;

        /* renamed from: d  reason: collision with root package name */
        private final float f21270d;

        /* renamed from: e  reason: collision with root package name */
        private final float f21271e;

        public c(e eVar, float f10, float f11) {
            this.f21269c = eVar;
            this.f21270d = f10;
            this.f21271e = f11;
        }

        @Override // p7.m.g
        public void a(Matrix matrix, o7.a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f21269c.f21280c - this.f21271e, this.f21269c.f21279b - this.f21270d), 0.0f);
            this.f21283a.set(matrix);
            this.f21283a.preTranslate(this.f21270d, this.f21271e);
            this.f21283a.preRotate(c());
            aVar.b(canvas, this.f21283a, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f21269c.f21280c - this.f21271e) / (this.f21269c.f21279b - this.f21270d)));
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static class d extends f {

        /* renamed from: h  reason: collision with root package name */
        private static final RectF f21272h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f21273b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f21274c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f21275d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f21276e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f21277f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f21278g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f21276e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f21273b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f21275d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f21277f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f21278g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f21274c;
        }

        private void p(float f10) {
            this.f21276e = f10;
        }

        private void q(float f10) {
            this.f21273b = f10;
        }

        private void r(float f10) {
            this.f21275d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f10) {
            this.f21277f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f10) {
            this.f21278g = f10;
        }

        private void u(float f10) {
            this.f21274c = f10;
        }

        @Override // p7.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f21281a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f21272h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static class e extends f {

        /* renamed from: b  reason: collision with root package name */
        private float f21279b;

        /* renamed from: c  reason: collision with root package name */
        private float f21280c;

        @Override // p7.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f21281a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f21279b, this.f21280c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        protected final Matrix f21281a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static abstract class g {

        /* renamed from: b  reason: collision with root package name */
        static final Matrix f21282b = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        final Matrix f21283a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, o7.a aVar, int i10, Canvas canvas);

        public final void b(o7.a aVar, int i10, Canvas canvas) {
            a(f21282b, aVar, i10, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f10) {
        if (g() == f10) {
            return;
        }
        float g10 = ((f10 - g()) + 360.0f) % 360.0f;
        if (g10 > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(g10);
        this.f21263h.add(new b(dVar));
        p(f10);
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f21263h.add(gVar);
        p(f11);
    }

    private float g() {
        return this.f21260e;
    }

    private float h() {
        return this.f21261f;
    }

    private void p(float f10) {
        this.f21260e = f10;
    }

    private void q(float f10) {
        this.f21261f = f10;
    }

    private void r(float f10) {
        this.f21258c = f10;
    }

    private void s(float f10) {
        this.f21259d = f10;
    }

    private void t(float f10) {
        this.f21256a = f10;
    }

    private void u(float f10) {
        this.f21257b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z10;
        float f16;
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f21262g.add(dVar);
        b bVar = new b(dVar);
        float f17 = f14 + f15;
        if (f15 < 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        if (z10) {
            f16 = (180.0f + f17) % 360.0f;
        } else {
            f16 = f17;
        }
        c(bVar, f14, f16);
        double d10 = f17;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f21262g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f21262g.get(i10).a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f21264i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f21263h), new Matrix(matrix));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.f21258c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.f21259d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float k() {
        return this.f21256a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float l() {
        return this.f21257b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f21279b = f10;
        eVar.f21280c = f11;
        this.f21262g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f21262g.clear();
        this.f21263h.clear();
        this.f21264i = false;
    }
}
