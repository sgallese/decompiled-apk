package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class g extends x7.g {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ int f10814m;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ c8.o f10815p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ r f10816q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r rVar, c8.o oVar, int i10, c8.o oVar2) {
        super(oVar);
        this.f10816q = rVar;
        this.f10814m = i10;
        this.f10815p = oVar2;
    }

    @Override // x7.g
    protected final void a() {
        x7.f fVar;
        x7.r rVar;
        String str;
        Bundle g10;
        Bundle f10;
        try {
            rVar = this.f10816q.f10961d;
            x7.l0 l0Var = (x7.l0) rVar.e();
            str = this.f10816q.f10958a;
            g10 = r.g(this.f10814m);
            f10 = r.f();
            l0Var.z(str, g10, f10, new q(this.f10816q, this.f10815p));
        } catch (RemoteException e10) {
            fVar = r.f10956g;
            fVar.c(e10, "notifySessionFailed", new Object[0]);
        }
    }
}
