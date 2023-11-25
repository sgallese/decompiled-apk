package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzd;
import com.google.android.gms.internal.play_billing.zzgd;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class j implements ServiceConnection {

    /* renamed from: f  reason: collision with root package name */
    private final Object f9206f = new Object();

    /* renamed from: m  reason: collision with root package name */
    private boolean f9207m = false;

    /* renamed from: p  reason: collision with root package name */
    private x5.e f9208p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ b f9209q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ j(b bVar, x5.e eVar, x5.q qVar) {
        this.f9209q = bVar;
        this.f9208p = eVar;
    }

    private final void d(d dVar) {
        synchronized (this.f9206f) {
            x5.e eVar = this.f9208p;
            if (eVar != null) {
                eVar.onBillingSetupFinished(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object a() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.j.a():java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        k kVar;
        this.f9209q.f9080a = 0;
        this.f9209q.f9086g = null;
        kVar = this.f9209q.f9085f;
        d dVar = l.f9223n;
        kVar.b(x5.x.a(24, 6, dVar));
        d(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        synchronized (this.f9206f) {
            this.f9208p = null;
            this.f9207m = true;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler x10;
        Future B;
        d z10;
        k kVar;
        zzb.zzi("BillingClient", "Billing service connected.");
        this.f9209q.f9086g = zzd.zzn(iBinder);
        b bVar = this.f9209q;
        Callable callable = new Callable() { // from class: com.android.billingclient.api.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                j.this.a();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.i
            @Override // java.lang.Runnable
            public final void run() {
                j.this.b();
            }
        };
        x10 = bVar.x();
        B = bVar.B(callable, 30000L, runnable, x10);
        if (B == null) {
            z10 = this.f9209q.z();
            kVar = this.f9209q.f9085f;
            kVar.b(x5.x.a(25, 6, z10));
            d(z10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        k kVar;
        zzb.zzj("BillingClient", "Billing service disconnected.");
        kVar = this.f9209q.f9085f;
        kVar.a(zzgd.zzw());
        this.f9209q.f9086g = null;
        this.f9209q.f9080a = 0;
        synchronized (this.f9206f) {
            x5.e eVar = this.f9208p;
            if (eVar != null) {
                eVar.onBillingServiceDisconnected();
            }
        }
    }
}
