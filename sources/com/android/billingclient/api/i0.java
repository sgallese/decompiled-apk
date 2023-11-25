package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzu;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class i0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f9203a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ x5.l f9204b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f9205c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(b bVar, String str, x5.l lVar) {
        this.f9205c = bVar;
        this.f9203a = str;
        this.f9204b = lVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        x5.g0 w10 = b.w(this.f9205c, this.f9203a, 9);
        if (w10.b() != null) {
            this.f9204b.onQueryPurchasesResponse(w10.a(), w10.b());
            return null;
        }
        this.f9204b.onQueryPurchasesResponse(w10.a(), zzu.zzk());
        return null;
    }
}
