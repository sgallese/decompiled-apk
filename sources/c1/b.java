package c1;

import a1.e4;
import a1.h1;
import qc.q;
import z0.m;

/* compiled from: CanvasDrawScope.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final j2.e f8677a = j2.g.a(1.0f, 1.0f);

    /* compiled from: CanvasDrawScope.kt */
    /* loaded from: classes.dex */
    public static final class a implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8678a;

        a(d dVar) {
            this.f8678a = dVar;
        }

        @Override // c1.i
        public void a(float f10, float f11, float f12, float f13, int i10) {
            this.f8678a.d().a(f10, f11, f12, f13, i10);
        }

        @Override // c1.i
        public void b(float f10, float f11) {
            this.f8678a.d().b(f10, f11);
        }

        @Override // c1.i
        public void c(e4 e4Var, int i10) {
            q.i(e4Var, "path");
            this.f8678a.d().c(e4Var, i10);
        }

        @Override // c1.i
        public void d(float[] fArr) {
            q.i(fArr, "matrix");
            this.f8678a.d().o(fArr);
        }

        @Override // c1.i
        public void e(float f10, float f11, long j10) {
            h1 d10 = this.f8678a.d();
            d10.b(z0.f.o(j10), z0.f.p(j10));
            d10.d(f10, f11);
            d10.b(-z0.f.o(j10), -z0.f.p(j10));
        }

        @Override // c1.i
        public void f(float f10, float f11, float f12, float f13) {
            boolean z10;
            h1 d10 = this.f8678a.d();
            d dVar = this.f8678a;
            long a10 = m.a(z0.l.i(h()) - (f12 + f10), z0.l.g(h()) - (f13 + f11));
            if (z0.l.i(a10) >= 0.0f && z0.l.g(a10) >= 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                dVar.c(a10);
                d10.b(f10, f11);
                return;
            }
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
        }

        @Override // c1.i
        public void g(float f10, long j10) {
            h1 d10 = this.f8678a.d();
            d10.b(z0.f.o(j10), z0.f.p(j10));
            d10.e(f10);
            d10.b(-z0.f.o(j10), -z0.f.p(j10));
        }

        public long h() {
            return this.f8678a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i c(d dVar) {
        return new a(dVar);
    }
}
