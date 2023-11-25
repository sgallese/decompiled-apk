package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzfz;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
final class n {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9238a;

    /* renamed from: b  reason: collision with root package name */
    private g6.f f9239b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Context context) {
        try {
            i6.u.f(context);
            this.f9239b = i6.u.c().g(com.google.android.datatransport.cct.a.f9299g).a("PLAY_BILLING_LIBRARY", zzfz.class, g6.b.b("proto"), new g6.e() { // from class: x5.b0
                @Override // g6.e
                public final Object apply(Object obj) {
                    return ((zzfz) obj).zzc();
                }
            });
        } catch (Throwable unused) {
            this.f9238a = true;
        }
    }

    public final void a(zzfz zzfzVar) {
        if (this.f9238a) {
            zzb.zzj("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f9239b.a(g6.c.d(zzfzVar));
        } catch (Throwable unused) {
            zzb.zzj("BillingLogger", "logging failed.");
        }
    }
}
