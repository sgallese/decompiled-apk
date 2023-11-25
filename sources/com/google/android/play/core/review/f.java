package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import c8.o;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class f extends e {

    /* renamed from: q  reason: collision with root package name */
    final String f11131q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(g gVar, o oVar, String str) {
        super(gVar, new x7.f("OnRequestInstallCallback"), oVar);
        this.f11131q = str;
    }

    @Override // com.google.android.play.core.review.e, x7.e
    public final void zzb(Bundle bundle) throws RemoteException {
        super.zzb(bundle);
        this.f11129m.e(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
