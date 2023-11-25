package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class m2 {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f10903a;

    /* renamed from: b  reason: collision with root package name */
    private final x7.b0 f10904b;

    /* renamed from: c  reason: collision with root package name */
    private final v1 f10905c;

    /* renamed from: d  reason: collision with root package name */
    private final x7.b0 f10906d;

    /* renamed from: e  reason: collision with root package name */
    private final g1 f10907e;

    /* renamed from: f  reason: collision with root package name */
    private final w7.b f10908f;

    /* renamed from: g  reason: collision with root package name */
    private final o2 f10909g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m2(d0 d0Var, x7.b0 b0Var, v1 v1Var, x7.b0 b0Var2, g1 g1Var, w7.b bVar, o2 o2Var) {
        this.f10903a = d0Var;
        this.f10904b = b0Var;
        this.f10905c = v1Var;
        this.f10906d = b0Var2;
        this.f10907e = g1Var;
        this.f10908f = bVar;
        this.f10909g = o2Var;
    }

    public final void a(final j2 j2Var) {
        File w10 = this.f10903a.w(j2Var.f11086b, j2Var.f10856c, j2Var.f10857d);
        File y10 = this.f10903a.y(j2Var.f11086b, j2Var.f10856c, j2Var.f10857d);
        if (w10.exists() && y10.exists()) {
            File u10 = this.f10903a.u(j2Var.f11086b, j2Var.f10856c, j2Var.f10857d);
            u10.mkdirs();
            if (w10.renameTo(u10)) {
                new File(this.f10903a.u(j2Var.f11086b, j2Var.f10856c, j2Var.f10857d), "merge.tmp").delete();
                File v10 = this.f10903a.v(j2Var.f11086b, j2Var.f10856c, j2Var.f10857d);
                v10.mkdirs();
                if (y10.renameTo(v10)) {
                    if (this.f10908f.a("assetOnlyUpdates")) {
                        try {
                            this.f10909g.b(j2Var.f11086b, j2Var.f10856c, j2Var.f10857d, j2Var.f10858e);
                            ((Executor) this.f10906d.zza()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.l2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    m2.this.b(j2Var);
                                }
                            });
                        } catch (IOException e10) {
                            throw new c1(String.format("Could not write asset pack version tag for pack %s: %s", j2Var.f11086b, e10.getMessage()), j2Var.f11085a);
                        }
                    } else {
                        Executor executor = (Executor) this.f10906d.zza();
                        final d0 d0Var = this.f10903a;
                        d0Var.getClass();
                        executor.execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.k2
                            @Override // java.lang.Runnable
                            public final void run() {
                                d0.this.I();
                            }
                        });
                    }
                    this.f10905c.i(j2Var.f11086b, j2Var.f10856c, j2Var.f10857d);
                    this.f10907e.c(j2Var.f11086b);
                    ((t3) this.f10904b.zza()).a(j2Var.f11085a, j2Var.f11086b);
                    return;
                }
                throw new c1("Cannot move metadata files to final location.", j2Var.f11085a);
            }
            throw new c1("Cannot move merged pack files to final location.", j2Var.f11085a);
        }
        throw new c1(String.format("Cannot find pack files to move for pack %s.", j2Var.f11086b), j2Var.f11085a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b(j2 j2Var) {
        this.f10903a.b(j2Var.f11086b, j2Var.f10856c, j2Var.f10857d);
    }
}
