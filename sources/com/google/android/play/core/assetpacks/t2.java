package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class t2 {

    /* renamed from: c  reason: collision with root package name */
    private static final x7.f f11000c = new x7.f("PatchSliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    private final d0 f11001a;

    /* renamed from: b  reason: collision with root package name */
    private final x7.b0 f11002b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t2(d0 d0Var, x7.b0 b0Var) {
        this.f11001a = d0Var;
        this.f11002b = b0Var;
    }

    public final void a(s2 s2Var) {
        File u10 = this.f11001a.u(s2Var.f11086b, s2Var.f10979c, s2Var.f10980d);
        File file = new File(this.f11001a.v(s2Var.f11086b, s2Var.f10979c, s2Var.f10980d), s2Var.f10984h);
        try {
            InputStream inputStream = s2Var.f10986j;
            if (s2Var.f10983g == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            try {
                g0 g0Var = new g0(u10, file);
                File C = this.f11001a.C(s2Var.f11086b, s2Var.f10981e, s2Var.f10982f, s2Var.f10984h);
                if (!C.exists()) {
                    C.mkdirs();
                }
                a3 a3Var = new a3(this.f11001a, s2Var.f11086b, s2Var.f10981e, s2Var.f10982f, s2Var.f10984h);
                x7.y.a(g0Var, inputStream, new f1(C, a3Var), s2Var.f10985i);
                a3Var.i(0);
                inputStream.close();
                f11000c.d("Patching and extraction finished for slice %s of pack %s.", s2Var.f10984h, s2Var.f11086b);
                ((t3) this.f11002b.zza()).c(s2Var.f11085a, s2Var.f11086b, s2Var.f10984h, 0);
                try {
                    s2Var.f10986j.close();
                } catch (IOException unused) {
                    f11000c.e("Could not close file for slice %s of pack %s.", s2Var.f10984h, s2Var.f11086b);
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (Throwable unused2) {
                }
                throw th;
            }
        } catch (IOException e10) {
            f11000c.b("IOException during patching %s.", e10.getMessage());
            throw new c1(String.format("Error patching slice %s of pack %s.", s2Var.f10984h, s2Var.f11086b), e10, s2Var.f11085a);
        }
    }
}
