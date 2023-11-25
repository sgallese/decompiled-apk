package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class x2 {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f11087a;

    /* renamed from: b  reason: collision with root package name */
    private final x7.b0 f11088b;

    /* renamed from: c  reason: collision with root package name */
    private final v1 f11089c;

    /* renamed from: d  reason: collision with root package name */
    private final x7.b0 f11090d;

    /* renamed from: e  reason: collision with root package name */
    private final g1 f11091e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x2(d0 d0Var, x7.b0 b0Var, v1 v1Var, x7.b0 b0Var2, g1 g1Var) {
        this.f11087a = d0Var;
        this.f11088b = b0Var;
        this.f11089c = v1Var;
        this.f11090d = b0Var2;
        this.f11091e = g1Var;
    }

    public final void a(final v2 v2Var) {
        File u10 = this.f11087a.u(v2Var.f11086b, v2Var.f11048c, v2Var.f11050e);
        if (u10.exists()) {
            File u11 = this.f11087a.u(v2Var.f11086b, v2Var.f11049d, v2Var.f11050e);
            u11.mkdirs();
            if (u10.renameTo(u11)) {
                ((Executor) this.f11090d.zza()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.w2
                    @Override // java.lang.Runnable
                    public final void run() {
                        x2.this.b(v2Var);
                    }
                });
                this.f11089c.i(v2Var.f11086b, v2Var.f11049d, v2Var.f11050e);
                this.f11091e.c(v2Var.f11086b);
                ((t3) this.f11088b.zza()).a(v2Var.f11085a, v2Var.f11086b);
                return;
            }
            throw new c1(String.format("Cannot promote pack %s from %s to %s", v2Var.f11086b, u10.getAbsolutePath(), u11.getAbsolutePath()), v2Var.f11085a);
        }
        throw new c1(String.format("Cannot find pack files to promote for pack %s at %s", v2Var.f11086b, u10.getAbsolutePath()), v2Var.f11085a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b(v2 v2Var) {
        this.f11087a.b(v2Var.f11086b, v2Var.f11049d, v2Var.f11050e);
    }
}
