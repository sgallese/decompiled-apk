package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class e extends x7.g {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ int f10771m;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ String f10772p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ String f10773q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ int f10774r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ c8.o f10775s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ r f10776t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r rVar, c8.o oVar, int i10, String str, String str2, int i11, c8.o oVar2) {
        super(oVar);
        this.f10776t = rVar;
        this.f10771m = i10;
        this.f10772p = str;
        this.f10773q = str2;
        this.f10774r = i11;
        this.f10775s = oVar2;
    }

    @Override // x7.g
    protected final void a() {
        x7.f fVar;
        x7.r rVar;
        String str;
        Bundle f10;
        try {
            rVar = this.f10776t.f10961d;
            x7.l0 l0Var = (x7.l0) rVar.e();
            str = this.f10776t.f10958a;
            Bundle j10 = r.j(this.f10771m, this.f10772p, this.f10773q, this.f10774r);
            f10 = r.f();
            l0Var.e(str, j10, f10, new o(this.f10776t, this.f10775s));
        } catch (RemoteException e10) {
            fVar = r.f10956g;
            fVar.c(e10, "notifyChunkTransferred", new Object[0]);
        }
    }
}
