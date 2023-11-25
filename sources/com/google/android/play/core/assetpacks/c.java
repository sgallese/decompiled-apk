package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class c extends x7.g {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ List f10726m;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ c8.o f10727p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ r f10728q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r rVar, c8.o oVar, List list, c8.o oVar2) {
        super(oVar);
        this.f10728q = rVar;
        this.f10726m = list;
        this.f10727p = oVar2;
    }

    @Override // x7.g
    protected final void a() {
        x7.f fVar;
        x7.r rVar;
        String str;
        Bundle f10;
        ArrayList s10 = r.s(this.f10726m);
        try {
            rVar = this.f10728q.f10961d;
            x7.l0 l0Var = (x7.l0) rVar.e();
            str = this.f10728q.f10958a;
            f10 = r.f();
            l0Var.i(str, s10, f10, new k(this.f10728q, this.f10727p));
        } catch (RemoteException e10) {
            fVar = r.f10956g;
            fVar.c(e10, "cancelDownloads(%s)", this.f10726m);
        }
    }
}
