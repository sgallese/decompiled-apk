package a2;

import a2.z0;
import android.graphics.Typeface;

/* compiled from: PlatformFontFamilyTypefaceAdapter.android.kt */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f281a = o0.a();

    public z0 a(x0 x0Var, h0 h0Var, pc.l<? super z0.b, dc.w> lVar, pc.l<? super x0, ? extends Object> lVar2) {
        boolean z10;
        Typeface a10;
        qc.q.i(x0Var, "typefaceRequest");
        qc.q.i(h0Var, "platformFontLoader");
        qc.q.i(lVar, "onAsyncCompletion");
        qc.q.i(lVar2, "createDefaultTypeface");
        l c10 = x0Var.c();
        if (c10 == null) {
            z10 = true;
        } else {
            z10 = c10 instanceof i;
        }
        qc.h hVar = null;
        if (z10) {
            a10 = this.f281a.b(x0Var.f(), x0Var.d());
        } else if (c10 instanceof e0) {
            a10 = this.f281a.a((e0) x0Var.c(), x0Var.f(), x0Var.d());
        } else if (!(c10 instanceof f0)) {
            return null;
        } else {
            t0 j10 = ((f0) x0Var.c()).j();
            qc.q.g(j10, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            a10 = ((d2.k) j10).a(x0Var.f(), x0Var.d(), x0Var.e());
        }
        return new z0.b(a10, false, 2, hVar);
    }
}
