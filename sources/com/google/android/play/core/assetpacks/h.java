package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class h extends x7.g {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ int f10824m;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ String f10825p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ String f10826q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ int f10827r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ c8.o f10828s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ r f10829t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r rVar, c8.o oVar, int i10, String str, String str2, int i11, c8.o oVar2) {
        super(oVar);
        this.f10829t = rVar;
        this.f10824m = i10;
        this.f10825p = str;
        this.f10826q = str2;
        this.f10827r = i11;
        this.f10828s = oVar2;
    }

    @Override // x7.g
    protected final void a() {
        x7.f fVar;
        x7.r rVar;
        String str;
        Bundle f10;
        try {
            rVar = this.f10829t.f10961d;
            x7.l0 l0Var = (x7.l0) rVar.e();
            str = this.f10829t.f10958a;
            Bundle j10 = r.j(this.f10824m, this.f10825p, this.f10826q, this.f10827r);
            f10 = r.f();
            l0Var.n(str, j10, f10, new l(this.f10829t, this.f10828s));
        } catch (RemoteException e10) {
            fVar = r.f10956g;
            fVar.b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f10825p, this.f10826q, Integer.valueOf(this.f10827r), Integer.valueOf(this.f10824m));
            this.f10828s.d(new RuntimeException(e10));
        }
    }
}
