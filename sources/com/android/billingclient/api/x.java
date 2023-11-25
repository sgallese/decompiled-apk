package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9247a;

    /* renamed from: b  reason: collision with root package name */
    private final w f9248b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r2v1, types: [x5.n0, x5.c0] */
    public x(Context context, x5.c0 c0Var, k kVar) {
        this.f9247a = context;
        ?? r22 = 0;
        this.f9248b = new w(this, r22, kVar, r22);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final x5.c0 b() {
        w.a(this.f9248b);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final x5.n c() {
        return w.b(this.f9248b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.f9248b.d(this.f9247a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f9248b.c(this.f9247a, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(Context context, x5.n nVar, x5.c cVar, k kVar) {
        this.f9247a = context;
        this.f9248b = new w(this, nVar, cVar, kVar, null);
    }
}
