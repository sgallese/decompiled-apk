package b5;

import ad.x1;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import c5.c;
import coil.request.BaseRequestDelegate;
import coil.request.NullRequestDataException;
import coil.request.ViewTargetRequestDelegate;
import g5.u;
import g5.w;

/* compiled from: RequestService.kt */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final q4.g f8035a;

    /* renamed from: b  reason: collision with root package name */
    private final w f8036b;

    /* renamed from: c  reason: collision with root package name */
    private final g5.q f8037c;

    public p(q4.g gVar, w wVar, u uVar) {
        this.f8035a = gVar;
        this.f8036b = wVar;
        this.f8037c = g5.i.a(uVar);
    }

    private final boolean d(h hVar, c5.i iVar) {
        if (!g5.a.d(hVar.j())) {
            return true;
        }
        if (c(hVar, hVar.j()) && this.f8037c.b(iVar)) {
            return true;
        }
        return false;
    }

    private final boolean e(h hVar) {
        boolean H;
        if (!hVar.O().isEmpty()) {
            H = ec.p.H(g5.l.o(), hVar.j());
            if (!H) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(l lVar) {
        if (g5.a.d(lVar.f()) && !this.f8037c.a()) {
            return false;
        }
        return true;
    }

    public final e b(h hVar, Throwable th) {
        Drawable t10;
        if (th instanceof NullRequestDataException) {
            t10 = hVar.u();
            if (t10 == null) {
                t10 = hVar.t();
            }
        } else {
            t10 = hVar.t();
        }
        return new e(t10, hVar, th);
    }

    public final boolean c(h hVar, Bitmap.Config config) {
        boolean z10;
        if (!g5.a.d(config)) {
            return true;
        }
        if (!hVar.h()) {
            return false;
        }
        d5.b M = hVar.M();
        if (M instanceof d5.c) {
            View view = ((d5.c) M).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return false;
            }
        }
        return true;
    }

    public final l f(h hVar, c5.i iVar) {
        boolean z10;
        Bitmap.Config config;
        a aVar;
        c5.h hVar2;
        boolean z11;
        if (e(hVar) && d(hVar, iVar)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            config = hVar.j();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap.Config config2 = config;
        if (this.f8036b.b()) {
            aVar = hVar.D();
        } else {
            aVar = a.DISABLED;
        }
        a aVar2 = aVar;
        c5.c b10 = iVar.b();
        c.b bVar = c.b.f8841a;
        if (!qc.q.d(b10, bVar) && !qc.q.d(iVar.a(), bVar)) {
            hVar2 = hVar.J();
        } else {
            hVar2 = c5.h.FIT;
        }
        c5.h hVar3 = hVar2;
        if (hVar.i() && hVar.O().isEmpty() && config2 != Bitmap.Config.ALPHA_8) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new l(hVar.l(), config2, hVar.k(), iVar, hVar3, g5.k.a(hVar), z11, hVar.I(), hVar.r(), hVar.x(), hVar.L(), hVar.E(), hVar.C(), hVar.s(), aVar2);
    }

    public final o g(h hVar, x1 x1Var) {
        androidx.lifecycle.p z10 = hVar.z();
        d5.b M = hVar.M();
        if (M instanceof d5.c) {
            return new ViewTargetRequestDelegate(this.f8035a, hVar, (d5.c) M, z10, x1Var);
        }
        return new BaseRequestDelegate(z10, x1Var);
    }
}
