package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class d extends x7.g {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ Map f10741m;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ c8.o f10742p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ r f10743q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar, c8.o oVar, Map map, c8.o oVar2) {
        super(oVar);
        this.f10743q = rVar;
        this.f10741m = map;
        this.f10742p = oVar2;
    }

    @Override // x7.g
    protected final void a() {
        x7.f fVar;
        x7.r rVar;
        String str;
        try {
            rVar = this.f10743q.f10961d;
            x7.l0 l0Var = (x7.l0) rVar.e();
            str = this.f10743q.f10958a;
            l0Var.p(str, r.m(this.f10741m), new m(this.f10743q, this.f10742p));
        } catch (RemoteException e10) {
            fVar = r.f10956g;
            fVar.c(e10, "syncPacks", new Object[0]);
            this.f10742p.d(new RuntimeException(e10));
        }
    }
}
