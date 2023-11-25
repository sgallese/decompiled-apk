package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import c8.o;
import x7.r;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
class e extends x7.d {

    /* renamed from: f  reason: collision with root package name */
    final x7.f f11128f;

    /* renamed from: m  reason: collision with root package name */
    final o f11129m;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ g f11130p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(g gVar, x7.f fVar, o oVar) {
        this.f11130p = gVar;
        this.f11128f = fVar;
        this.f11129m = oVar;
    }

    @Override // x7.e
    public void zzb(Bundle bundle) throws RemoteException {
        r rVar = this.f11130p.f11133a;
        if (rVar != null) {
            rVar.s(this.f11129m);
        }
        this.f11128f.d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
