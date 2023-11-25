package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class i extends x7.g {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ c8.o f10837m;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ r f10838p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, c8.o oVar, c8.o oVar2) {
        super(oVar);
        this.f10838p = rVar;
        this.f10837m = oVar2;
    }

    @Override // x7.g
    protected final void a() {
        x7.f fVar;
        x7.r rVar;
        String str;
        Bundle f10;
        try {
            rVar = this.f10838p.f10962e;
            x7.l0 l0Var = (x7.l0) rVar.e();
            str = this.f10838p.f10958a;
            f10 = r.f();
            l0Var.y(str, f10, new n(this.f10838p, this.f10837m));
        } catch (RemoteException e10) {
            fVar = r.f10956g;
            fVar.c(e10, "keepAlive", new Object[0]);
        }
    }
}
