package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import c8.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class d extends x7.g {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ o f11126m;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ g f11127p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, o oVar, o oVar2) {
        super(oVar);
        this.f11127p = gVar;
        this.f11126m = oVar2;
    }

    @Override // x7.g
    protected final void a() {
        x7.f fVar;
        String str;
        String str2;
        String str3;
        try {
            x7.c cVar = (x7.c) this.f11127p.f11133a.e();
            str2 = this.f11127p.f11134b;
            Bundle a10 = w7.a.a("review");
            g gVar = this.f11127p;
            o oVar = this.f11126m;
            str3 = gVar.f11134b;
            cVar.q(str2, a10, new f(gVar, oVar, str3));
        } catch (RemoteException e10) {
            fVar = g.f11132c;
            str = this.f11127p.f11134b;
            fVar.c(e10, "error requesting in-app review for %s", str);
            this.f11126m.d(new RuntimeException(e10));
        }
    }
}
