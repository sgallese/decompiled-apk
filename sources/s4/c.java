package s4;

import a1.t3;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.l1;
import b5.h;
import c5.c;
import dc.w;
import j0.n;
import kotlin.KotlinNothingValueException;
import s4.b;
import z0.l;

/* compiled from: AsyncImagePainter.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final a f22999a = new a();

    /* compiled from: AsyncImagePainter.kt */
    /* loaded from: classes.dex */
    public static final class a implements f5.d {
        a() {
        }

        @Override // f5.d
        public Drawable a() {
            return null;
        }

        @Override // d5.b
        public /* synthetic */ void onError(Drawable drawable) {
            d5.a.a(this, drawable);
        }

        @Override // d5.b
        public /* synthetic */ void onStart(Drawable drawable) {
            d5.a.b(this, drawable);
        }

        @Override // d5.b
        public /* synthetic */ void onSuccess(Drawable drawable) {
            d5.a.c(this, drawable);
        }
    }

    private static final boolean c(long j10) {
        if (l.i(j10) >= 0.5d && l.g(j10) >= 0.5d) {
            return true;
        }
        return false;
    }

    public static final b d(Object obj, q4.g gVar, pc.l<? super b.c, ? extends b.c> lVar, pc.l<? super b.c, w> lVar2, n1.f fVar, int i10, j0.l lVar3, int i11, int i12) {
        lVar3.e(-2020614074);
        if ((i12 & 4) != 0) {
            lVar = b.I.a();
        }
        if ((i12 & 8) != 0) {
            lVar2 = null;
        }
        if ((i12 & 16) != 0) {
            fVar = n1.f.f19964a.a();
        }
        if ((i12 & 32) != 0) {
            i10 = c1.f.f8679g.b();
        }
        if (n.K()) {
            n.V(-2020614074, i11, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:128)");
        }
        b5.h d10 = j.d(obj, lVar3, 8);
        h(d10);
        lVar3.e(-492369756);
        Object f10 = lVar3.f();
        if (f10 == j0.l.f18688a.a()) {
            f10 = new b(d10, gVar);
            lVar3.J(f10);
        }
        lVar3.N();
        b bVar = (b) f10;
        bVar.K(lVar);
        bVar.F(lVar2);
        bVar.C(fVar);
        bVar.D(i10);
        bVar.H(((Boolean) lVar3.C(l1.a())).booleanValue());
        bVar.E(gVar);
        bVar.I(d10);
        bVar.d();
        if (n.K()) {
            n.U();
        }
        lVar3.N();
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.i e(long j10) {
        boolean z10;
        boolean z11;
        c5.c cVar;
        c5.c cVar2;
        int d10;
        int d11;
        boolean z12 = true;
        if (j10 == l.f26375b.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return c5.i.f8847d;
        }
        if (c(j10)) {
            float i10 = l.i(j10);
            if (!Float.isInfinite(i10) && !Float.isNaN(i10)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                d11 = sc.c.d(l.i(j10));
                cVar = c5.a.a(d11);
            } else {
                cVar = c.b.f8841a;
            }
            float g10 = l.g(j10);
            if (Float.isInfinite(g10) || Float.isNaN(g10)) {
                z12 = false;
            }
            if (z12) {
                d10 = sc.c.d(l.g(j10));
                cVar2 = c5.a.a(d10);
            } else {
                cVar2 = c.b.f8841a;
            }
            return new c5.i(cVar, cVar2);
        }
        return null;
    }

    private static final Void f(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    static /* synthetic */ Void g(String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return f(str, str2);
    }

    private static final void h(b5.h hVar) {
        boolean z10;
        Object m10 = hVar.m();
        if (!(m10 instanceof h.a)) {
            if (!(m10 instanceof t3)) {
                if (!(m10 instanceof e1.f)) {
                    if (!(m10 instanceof d1.c)) {
                        if (hVar.M() == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            return;
                        }
                        throw new IllegalArgumentException("request.target must be null.".toString());
                    }
                    g("Painter", null, 2, null);
                    throw new KotlinNothingValueException();
                }
                g("ImageVector", null, 2, null);
                throw new KotlinNothingValueException();
            }
            g("ImageBitmap", null, 2, null);
            throw new KotlinNothingValueException();
        }
        f("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
        throw new KotlinNothingValueException();
    }
}
