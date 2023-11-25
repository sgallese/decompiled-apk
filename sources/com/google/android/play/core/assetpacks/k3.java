package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class k3 {

    /* renamed from: l  reason: collision with root package name */
    private static final x7.f f10868l = new x7.f("AssetPackManager");

    /* renamed from: a  reason: collision with root package name */
    private final d0 f10869a;

    /* renamed from: b  reason: collision with root package name */
    private final x7.b0 f10870b;

    /* renamed from: c  reason: collision with root package name */
    private final x f10871c;

    /* renamed from: d  reason: collision with root package name */
    private final b8.a f10872d;

    /* renamed from: e  reason: collision with root package name */
    private final v1 f10873e;

    /* renamed from: f  reason: collision with root package name */
    private final g1 f10874f;

    /* renamed from: g  reason: collision with root package name */
    private final q0 f10875g;

    /* renamed from: h  reason: collision with root package name */
    private final x7.b0 f10876h;

    /* renamed from: i  reason: collision with root package name */
    private final w7.b f10877i;

    /* renamed from: j  reason: collision with root package name */
    private final o2 f10878j;

    /* renamed from: k  reason: collision with root package name */
    private final Handler f10879k = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    public k3(d0 d0Var, x7.b0 b0Var, x xVar, b8.a aVar, v1 v1Var, g1 g1Var, q0 q0Var, x7.b0 b0Var2, w7.b bVar, o2 o2Var) {
        this.f10869a = d0Var;
        this.f10870b = b0Var;
        this.f10871c = xVar;
        this.f10872d = aVar;
        this.f10873e = v1Var;
        this.f10874f = g1Var;
        this.f10875g = q0Var;
        this.f10876h = b0Var2;
        this.f10877i = bVar;
        this.f10878j = o2Var;
    }

    private final void d() {
        ((Executor) this.f10876h.zza()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.j3
            @Override // java.lang.Runnable
            public final void run() {
                k3.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        c8.d d10 = ((t3) this.f10870b.zza()).d(this.f10869a.G());
        Executor executor = (Executor) this.f10876h.zza();
        final d0 d0Var = this.f10869a;
        d0Var.getClass();
        d10.c(executor, new c8.c() { // from class: com.google.android.play.core.assetpacks.i3
            @Override // c8.c
            public final void onSuccess(Object obj) {
                d0.this.c((List) obj);
            }
        });
        d10.b((Executor) this.f10876h.zza(), new c8.b() { // from class: com.google.android.play.core.assetpacks.h3
            @Override // c8.b
            public final void onFailure(Exception exc) {
                k3.f10868l.e(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z10) {
        boolean e10 = this.f10871c.e();
        this.f10871c.c(z10);
        if (z10 && !e10) {
            d();
        }
    }
}
