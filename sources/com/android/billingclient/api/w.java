package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzbn;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.List;
import x5.n0;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class w extends BroadcastReceiver {

    /* renamed from: a */
    private final x5.n f9243a;

    /* renamed from: b */
    private final k f9244b;

    /* renamed from: c */
    private boolean f9245c;

    /* renamed from: d */
    final /* synthetic */ x f9246d;

    public /* synthetic */ w(x xVar, x5.c0 c0Var, k kVar, n0 n0Var) {
        this.f9246d = xVar;
        this.f9243a = null;
        this.f9244b = kVar;
    }

    public static /* bridge */ /* synthetic */ x5.c0 a(w wVar) {
        wVar.getClass();
        return null;
    }

    private final void e(Bundle bundle, d dVar, int i10) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
            try {
                this.f9244b.b(zzfb.zzx(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzbn.zza()));
                return;
            } catch (Throwable unused) {
                zzb.zzj("BillingBroadcastManager", "Failed parsing Api failure.");
                return;
            }
        }
        this.f9244b.b(x5.x.a(23, i10, dVar));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void c(Context context, IntentFilter intentFilter) {
        w wVar;
        w wVar2;
        if (!this.f9245c) {
            if (Build.VERSION.SDK_INT >= 33) {
                wVar2 = this.f9246d.f9248b;
                context.registerReceiver(wVar2, intentFilter, 2);
            } else {
                wVar = this.f9246d.f9248b;
                context.registerReceiver(wVar, intentFilter);
            }
            this.f9245c = true;
        }
    }

    public final void d(Context context) {
        w wVar;
        if (this.f9245c) {
            wVar = this.f9246d.f9248b;
            context.unregisterReceiver(wVar);
            this.f9245c = false;
            return;
        }
        zzb.zzj("BillingBroadcastManager", "Receiver is not registered.");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        int i10 = 1;
        if (extras == null) {
            zzb.zzj("BillingBroadcastManager", "Bundle is null.");
            k kVar = this.f9244b;
            d dVar = l.f9219j;
            kVar.b(x5.x.a(11, 1, dVar));
            x5.n nVar = this.f9243a;
            if (nVar != null) {
                nVar.onPurchasesUpdated(dVar, null);
                return;
            }
            return;
        }
        d zzd = zzb.zzd(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        String string = extras.getString("INTENT_SOURCE");
        if (string == "LAUNCH_BILLING_FLOW" || (string != null && string.equals("LAUNCH_BILLING_FLOW"))) {
            i10 = 2;
        }
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            List<Purchase> zzh = zzb.zzh(extras);
            if (zzd.b() == 0) {
                this.f9244b.c(x5.x.b(i10));
            } else {
                e(extras, zzd, i10);
            }
            this.f9243a.onPurchasesUpdated(zzd, zzh);
        } else if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (zzd.b() != 0) {
                e(extras, zzd, i10);
                this.f9243a.onPurchasesUpdated(zzd, zzu.zzk());
                return;
            }
            zzb.zzj("BillingBroadcastManager", "AlternativeBillingListener is null.");
            k kVar2 = this.f9244b;
            d dVar2 = l.f9219j;
            kVar2.b(x5.x.a(15, i10, dVar2));
            this.f9243a.onPurchasesUpdated(dVar2, zzu.zzk());
        }
    }

    public /* synthetic */ w(x xVar, x5.n nVar, x5.c cVar, k kVar, n0 n0Var) {
        this.f9246d = xVar;
        this.f9243a = nVar;
        this.f9244b = kVar;
    }
}
