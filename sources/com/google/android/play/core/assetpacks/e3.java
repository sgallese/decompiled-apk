package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class e3 {

    /* renamed from: b  reason: collision with root package name */
    private static final x7.f f10788b = new x7.f("VerifySliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    private final d0 f10789a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e3(d0 d0Var) {
        this.f10789a = d0Var;
    }

    private final void b(d3 d3Var, File file) {
        try {
            File B = this.f10789a.B(d3Var.f11086b, d3Var.f10767c, d3Var.f10768d, d3Var.f10769e);
            if (B.exists()) {
                try {
                    if (e2.a(c3.a(file, B)).equals(d3Var.f10770f)) {
                        f10788b.d("Verification of slice %s of pack %s successful.", d3Var.f10769e, d3Var.f11086b);
                        return;
                    }
                    throw new c1(String.format("Verification failed for slice %s.", d3Var.f10769e), d3Var.f11085a);
                } catch (IOException e10) {
                    throw new c1(String.format("Could not digest file during verification for slice %s.", d3Var.f10769e), e10, d3Var.f11085a);
                } catch (NoSuchAlgorithmException e11) {
                    throw new c1("SHA256 algorithm not supported.", e11, d3Var.f11085a);
                }
            }
            throw new c1(String.format("Cannot find metadata files for slice %s.", d3Var.f10769e), d3Var.f11085a);
        } catch (IOException e12) {
            throw new c1(String.format("Could not reconstruct slice archive during verification for slice %s.", d3Var.f10769e), e12, d3Var.f11085a);
        }
    }

    public final void a(d3 d3Var) {
        File C = this.f10789a.C(d3Var.f11086b, d3Var.f10767c, d3Var.f10768d, d3Var.f10769e);
        if (C.exists()) {
            b(d3Var, C);
            File D = this.f10789a.D(d3Var.f11086b, d3Var.f10767c, d3Var.f10768d, d3Var.f10769e);
            if (!D.exists()) {
                D.mkdirs();
            }
            if (C.renameTo(D)) {
                return;
            }
            throw new c1(String.format("Failed to move slice %s after verification.", d3Var.f10769e), d3Var.f11085a);
        }
        throw new c1(String.format("Cannot find unverified files for slice %s.", d3Var.f10769e), d3Var.f11085a);
    }
}
