package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class f extends x7.g {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ int f10790m;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ String f10791p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ c8.o f10792q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ int f10793r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ r f10794s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r rVar, c8.o oVar, int i10, String str, c8.o oVar2, int i11) {
        super(oVar);
        this.f10794s = rVar;
        this.f10790m = i10;
        this.f10791p = str;
        this.f10792q = oVar2;
        this.f10793r = i11;
    }

    @Override // x7.g
    protected final void a() {
        x7.f fVar;
        x7.r rVar;
        String str;
        Bundle w10;
        Bundle f10;
        try {
            rVar = this.f10794s.f10961d;
            x7.l0 l0Var = (x7.l0) rVar.e();
            str = this.f10794s.f10958a;
            w10 = r.w(this.f10790m, this.f10791p);
            f10 = r.f();
            l0Var.a(str, w10, f10, new p(this.f10794s, this.f10792q, this.f10790m, this.f10791p, this.f10793r));
        } catch (RemoteException e10) {
            fVar = r.f10956g;
            fVar.c(e10, "notifyModuleCompleted", new Object[0]);
        }
    }
}
