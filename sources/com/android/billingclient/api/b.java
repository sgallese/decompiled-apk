package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.d;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzfl;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private volatile int f9080a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9081b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f9082c;

    /* renamed from: d  reason: collision with root package name */
    private volatile x f9083d;

    /* renamed from: e  reason: collision with root package name */
    private Context f9084e;

    /* renamed from: f  reason: collision with root package name */
    private k f9085f;

    /* renamed from: g  reason: collision with root package name */
    private volatile zze f9086g;

    /* renamed from: h  reason: collision with root package name */
    private volatile j f9087h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9088i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9089j;

    /* renamed from: k  reason: collision with root package name */
    private int f9090k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9091l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f9092m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f9093n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9094o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9095p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f9096q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f9097r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f9098s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f9099t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f9100u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f9101v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f9102w;

    /* renamed from: x  reason: collision with root package name */
    private p f9103x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f9104y;

    /* renamed from: z  reason: collision with root package name */
    private ExecutorService f9105z;

    private b(Context context, p pVar, x5.n nVar, String str, String str2, x5.c cVar, k kVar) {
        this.f9080a = 0;
        this.f9082c = new Handler(Looper.getMainLooper());
        this.f9090k = 0;
        this.f9081b = str;
        k(context, nVar, pVar, cVar, str, null);
    }

    @SuppressLint({"PrivateApi"})
    private static String A() {
        try {
            return (String) y5.a.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "6.0.1";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Future B(Callable callable, long j10, final Runnable runnable, Handler handler) {
        if (this.f9105z == null) {
            this.f9105z = Executors.newFixedThreadPool(zzb.zza, new g(this));
        }
        try {
            final Future submit = this.f9105z.submit(callable);
            handler.postDelayed(new Runnable() { // from class: x5.q0
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    Runnable runnable2 = runnable;
                    if (!future.isDone() && !future.isCancelled()) {
                        future.cancel(true);
                        zzb.zzj("BillingClient", "Async task is taking too long, cancel it!");
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                }
            }, (long) (j10 * 0.95d));
            return submit;
        } catch (Exception e10) {
            zzb.zzk("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    private final void C(String str, final x5.l lVar) {
        if (!e()) {
            k kVar = this.f9085f;
            d dVar = l.f9222m;
            kVar.b(x5.x.a(2, 9, dVar));
            lVar.onQueryPurchasesResponse(dVar, zzu.zzk());
        } else if (TextUtils.isEmpty(str)) {
            zzb.zzj("BillingClient", "Please provide a valid product type.");
            k kVar2 = this.f9085f;
            d dVar2 = l.f9216g;
            kVar2.b(x5.x.a(50, 9, dVar2));
            lVar.onQueryPurchasesResponse(dVar2, zzu.zzk());
        } else if (B(new i0(this, str, lVar), 30000L, new Runnable() { // from class: com.android.billingclient.api.g0
            @Override // java.lang.Runnable
            public final void run() {
                b.this.v(lVar);
            }
        }, x()) == null) {
            d z10 = z();
            this.f9085f.b(x5.x.a(25, 9, z10));
            lVar.onQueryPurchasesResponse(z10, zzu.zzk());
        }
    }

    private void k(Context context, x5.n nVar, p pVar, x5.c cVar, String str, k kVar) {
        boolean z10;
        this.f9084e = context.getApplicationContext();
        zzfl zzv = zzfm.zzv();
        zzv.zzj(str);
        zzv.zzi(this.f9084e.getPackageName());
        if (kVar != null) {
            this.f9085f = kVar;
        } else {
            this.f9085f = new m(this.f9084e, (zzfm) zzv.zzc());
        }
        if (nVar == null) {
            zzb.zzj("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f9083d = new x(this.f9084e, nVar, cVar, this.f9085f);
        this.f9103x = pVar;
        if (cVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9104y = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ x5.g0 w(b bVar, String str, int i10) {
        Bundle zzi;
        int i11;
        zzb.zzi("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        Bundle zzc = zzb.zzc(bVar.f9093n, bVar.f9101v, true, false, bVar.f9081b);
        List list = null;
        String str2 = null;
        while (true) {
            try {
                if (bVar.f9093n) {
                    zze zzeVar = bVar.f9086g;
                    if (z10 != bVar.f9101v) {
                        i11 = 9;
                    } else {
                        i11 = 19;
                    }
                    zzi = zzeVar.zzj(i11, bVar.f9084e.getPackageName(), str, str2, zzc);
                } else {
                    zzi = bVar.f9086g.zzi(3, bVar.f9084e.getPackageName(), str, str2);
                }
                u a10 = v.a(zzi, "BillingClient", "getPurchase()");
                d a11 = a10.a();
                if (a11 != l.f9221l) {
                    bVar.f9085f.b(x5.x.a(a10.b(), 9, a11));
                    return new x5.g0(a11, list);
                }
                ArrayList<String> stringArrayList = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z11 = false;
                for (int i12 = 0; i12 < stringArrayList2.size(); i12++) {
                    String str3 = stringArrayList2.get(i12);
                    String str4 = stringArrayList3.get(i12);
                    zzb.zzi("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i12))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.f())) {
                            zzb.zzj("BillingClient", "BUG: empty/null token!");
                            z11 = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e10) {
                        zzb.zzk("BillingClient", "Got an exception trying to decode the purchase!", e10);
                        k kVar = bVar.f9085f;
                        d dVar = l.f9219j;
                        kVar.b(x5.x.a(51, 9, dVar));
                        return new x5.g0(dVar, null);
                    }
                }
                if (z11) {
                    bVar.f9085f.b(x5.x.a(26, 9, l.f9219j));
                }
                str2 = zzi.getString("INAPP_CONTINUATION_TOKEN");
                zzb.zzi("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new x5.g0(l.f9221l, arrayList);
                }
                list = null;
                z10 = true;
            } catch (Exception e11) {
                k kVar2 = bVar.f9085f;
                d dVar2 = l.f9222m;
                kVar2.b(x5.x.a(52, 9, dVar2));
                zzb.zzk("BillingClient", "Got exception trying to get purchasesm try to reconnect", e11);
                return new x5.g0(dVar2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler x() {
        if (Looper.myLooper() == null) {
            return this.f9082c;
        }
        return new Handler(Looper.myLooper());
    }

    private final d y(final d dVar) {
        if (Thread.interrupted()) {
            return dVar;
        }
        this.f9082c.post(new Runnable() { // from class: com.android.billingclient.api.h0
            @Override // java.lang.Runnable
            public final void run() {
                b.this.s(dVar);
            }
        });
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d z() {
        if (this.f9080a != 0 && this.f9080a != 3) {
            return l.f9219j;
        }
        return l.f9222m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Bundle F(int i10, String str, String str2, c cVar, Bundle bundle) throws Exception {
        return this.f9086g.zzg(i10, this.f9084e.getPackageName(), str, str2, null, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Bundle G(String str, String str2) throws Exception {
        return this.f9086g.zzf(3, this.f9084e.getPackageName(), str, str2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object L(x5.a aVar, x5.b bVar) throws Exception {
        try {
            zze zzeVar = this.f9086g;
            String packageName = this.f9084e.getPackageName();
            String a10 = aVar.a();
            String str = this.f9081b;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            Bundle zzd = zzeVar.zzd(9, packageName, a10, bundle);
            int zzb = zzb.zzb(zzd, "BillingClient");
            String zzf = zzb.zzf(zzd, "BillingClient");
            d.a c10 = d.c();
            c10.c(zzb);
            c10.b(zzf);
            bVar.a(c10.a());
            return null;
        } catch (Exception e10) {
            zzb.zzk("BillingClient", "Error acknowledge purchase!", e10);
            k kVar = this.f9085f;
            d dVar = l.f9222m;
            kVar.b(x5.x.a(28, 3, dVar));
            bVar.a(dVar);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object M(x5.f fVar, x5.g gVar) throws Exception {
        int zza;
        String str;
        String a10 = fVar.a();
        try {
            zzb.zzi("BillingClient", "Consuming purchase with token: " + a10);
            if (this.f9093n) {
                zze zzeVar = this.f9086g;
                String packageName = this.f9084e.getPackageName();
                boolean z10 = this.f9093n;
                String str2 = this.f9081b;
                Bundle bundle = new Bundle();
                if (z10) {
                    bundle.putString("playBillingLibraryVersion", str2);
                }
                Bundle zze = zzeVar.zze(9, packageName, a10, bundle);
                zza = zze.getInt("RESPONSE_CODE");
                str = zzb.zzf(zze, "BillingClient");
            } else {
                zza = this.f9086g.zza(3, this.f9084e.getPackageName(), a10);
                str = "";
            }
            d.a c10 = d.c();
            c10.c(zza);
            c10.b(str);
            d a11 = c10.a();
            if (zza == 0) {
                zzb.zzi("BillingClient", "Successfully consumed purchase.");
                gVar.a(a11, a10);
                return null;
            }
            zzb.zzj("BillingClient", "Error consuming purchase with token. Response code: " + zza);
            this.f9085f.b(x5.x.a(23, 4, a11));
            gVar.a(a11, a10);
            return null;
        } catch (Exception e10) {
            zzb.zzk("BillingClient", "Error consuming purchase!", e10);
            k kVar = this.f9085f;
            d dVar = l.f9222m;
            kVar.b(x5.x.a(29, 4, dVar));
            gVar.a(dVar, a10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0121, code lost:
    
        r12 = 4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object N(com.android.billingclient.api.f r25, x5.j r26) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.b.N(com.android.billingclient.api.f, x5.j):java.lang.Object");
    }

    @Override // com.android.billingclient.api.a
    public final void a(final x5.a aVar, final x5.b bVar) {
        if (!e()) {
            k kVar = this.f9085f;
            d dVar = l.f9222m;
            kVar.b(x5.x.a(2, 3, dVar));
            bVar.a(dVar);
        } else if (TextUtils.isEmpty(aVar.a())) {
            zzb.zzj("BillingClient", "Please provide a valid purchase token.");
            k kVar2 = this.f9085f;
            d dVar2 = l.f9218i;
            kVar2.b(x5.x.a(26, 3, dVar2));
            bVar.a(dVar2);
        } else if (!this.f9093n) {
            k kVar3 = this.f9085f;
            d dVar3 = l.f9211b;
            kVar3.b(x5.x.a(27, 3, dVar3));
            bVar.a(dVar3);
        } else if (B(new Callable() { // from class: com.android.billingclient.api.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                b.this.L(aVar, bVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.d0
            @Override // java.lang.Runnable
            public final void run() {
                b.this.r(bVar);
            }
        }, x()) == null) {
            d z10 = z();
            this.f9085f.b(x5.x.a(25, 3, z10));
            bVar.a(z10);
        }
    }

    @Override // com.android.billingclient.api.a
    public final void b(final x5.f fVar, final x5.g gVar) {
        if (!e()) {
            k kVar = this.f9085f;
            d dVar = l.f9222m;
            kVar.b(x5.x.a(2, 4, dVar));
            gVar.a(dVar, fVar.a());
        } else if (B(new Callable() { // from class: com.android.billingclient.api.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                b.this.M(fVar, gVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.b0
            @Override // java.lang.Runnable
            public final void run() {
                b.this.t(gVar, fVar);
            }
        }, x()) == null) {
            d z10 = z();
            this.f9085f.b(x5.x.a(25, 4, z10));
            gVar.a(z10, fVar.a());
        }
    }

    @Override // com.android.billingclient.api.a
    public final void c() {
        this.f9085f.c(x5.x.b(12));
        try {
            this.f9083d.d();
            if (this.f9087h != null) {
                this.f9087h.c();
            }
            if (this.f9087h != null && this.f9086g != null) {
                zzb.zzi("BillingClient", "Unbinding from service.");
                this.f9084e.unbindService(this.f9087h);
                this.f9087h = null;
            }
            this.f9086g = null;
            ExecutorService executorService = this.f9105z;
            if (executorService != null) {
                executorService.shutdownNow();
                this.f9105z = null;
            }
        } catch (Exception e10) {
            zzb.zzk("BillingClient", "There was an exception while ending connection!", e10);
        } finally {
            this.f9080a = 3;
        }
    }

    @Override // com.android.billingclient.api.a
    public final int d() {
        return this.f9080a;
    }

    @Override // com.android.billingclient.api.a
    public final boolean e() {
        if (this.f9080a == 2 && this.f9086g != null && this.f9087h != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0420 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0477 A[Catch: Exception -> 0x04c2, CancellationException -> 0x04d9, TimeoutException -> 0x04db, TryCatch #4 {CancellationException -> 0x04d9, TimeoutException -> 0x04db, Exception -> 0x04c2, blocks: (B:176:0x0463, B:178:0x0477, B:180:0x04a8), top: B:196:0x0463 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04a8 A[Catch: Exception -> 0x04c2, CancellationException -> 0x04d9, TimeoutException -> 0x04db, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x04d9, TimeoutException -> 0x04db, Exception -> 0x04c2, blocks: (B:176:0x0463, B:178:0x0477, B:180:0x04a8), top: B:196:0x0463 }] */
    @Override // com.android.billingclient.api.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.android.billingclient.api.d f(android.app.Activity r32, final com.android.billingclient.api.c r33) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.b.f(android.app.Activity, com.android.billingclient.api.c):com.android.billingclient.api.d");
    }

    @Override // com.android.billingclient.api.a
    public final void h(final f fVar, final x5.j jVar) {
        if (!e()) {
            k kVar = this.f9085f;
            d dVar = l.f9222m;
            kVar.b(x5.x.a(2, 7, dVar));
            jVar.a(dVar, new ArrayList());
        } else if (!this.f9099t) {
            zzb.zzj("BillingClient", "Querying product details is not supported.");
            k kVar2 = this.f9085f;
            d dVar2 = l.f9231v;
            kVar2.b(x5.x.a(20, 7, dVar2));
            jVar.a(dVar2, new ArrayList());
        } else if (B(new Callable() { // from class: com.android.billingclient.api.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                b.this.N(fVar, jVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.z
            @Override // java.lang.Runnable
            public final void run() {
                b.this.u(jVar);
            }
        }, x()) == null) {
            d z10 = z();
            this.f9085f.b(x5.x.a(25, 7, z10));
            jVar.a(z10, new ArrayList());
        }
    }

    @Override // com.android.billingclient.api.a
    public final void i(x5.o oVar, x5.l lVar) {
        C(oVar.b(), lVar);
    }

    @Override // com.android.billingclient.api.a
    public final void j(x5.e eVar) {
        if (e()) {
            zzb.zzi("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.f9085f.c(x5.x.b(6));
            eVar.onBillingSetupFinished(l.f9221l);
            return;
        }
        int i10 = 1;
        if (this.f9080a == 1) {
            zzb.zzj("BillingClient", "Client is already in the process of connecting to billing service.");
            k kVar = this.f9085f;
            d dVar = l.f9213d;
            kVar.b(x5.x.a(37, 6, dVar));
            eVar.onBillingSetupFinished(dVar);
        } else if (this.f9080a == 3) {
            zzb.zzj("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            k kVar2 = this.f9085f;
            d dVar2 = l.f9222m;
            kVar2.b(x5.x.a(38, 6, dVar2));
            eVar.onBillingSetupFinished(dVar2);
        } else {
            this.f9080a = 1;
            this.f9083d.e();
            zzb.zzi("BillingClient", "Starting in-app billing setup.");
            this.f9087h = new j(this, eVar, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f9084e.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if ("com.android.vending".equals(str) && str2 != null) {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.f9081b);
                        if (this.f9084e.bindService(intent2, this.f9087h, 1)) {
                            zzb.zzi("BillingClient", "Service was bonded successfully.");
                            return;
                        } else {
                            zzb.zzj("BillingClient", "Connection to Billing service is blocked.");
                            i10 = 39;
                        }
                    } else {
                        zzb.zzj("BillingClient", "The device doesn't have valid Play Store.");
                        i10 = 40;
                    }
                }
            } else {
                i10 = 41;
            }
            this.f9080a = 0;
            zzb.zzi("BillingClient", "Billing service unavailable on device.");
            k kVar3 = this.f9085f;
            d dVar3 = l.f9212c;
            kVar3.b(x5.x.a(i10, 6, dVar3));
            eVar.onBillingSetupFinished(dVar3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void r(x5.b bVar) {
        k kVar = this.f9085f;
        d dVar = l.f9223n;
        kVar.b(x5.x.a(24, 3, dVar));
        bVar.a(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void s(d dVar) {
        if (this.f9083d.c() != null) {
            this.f9083d.c().onPurchasesUpdated(dVar, null);
            return;
        }
        this.f9083d.b();
        zzb.zzj("BillingClient", "No valid listener is set in BroadcastManager");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void t(x5.g gVar, x5.f fVar) {
        k kVar = this.f9085f;
        d dVar = l.f9223n;
        kVar.b(x5.x.a(24, 4, dVar));
        gVar.a(dVar, fVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void u(x5.j jVar) {
        k kVar = this.f9085f;
        d dVar = l.f9223n;
        kVar.b(x5.x.a(24, 7, dVar));
        jVar.a(dVar, new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void v(x5.l lVar) {
        k kVar = this.f9085f;
        d dVar = l.f9223n;
        kVar.b(x5.x.a(24, 9, dVar));
        lVar.onQueryPurchasesResponse(dVar, zzu.zzk());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, p pVar, Context context, x5.c0 c0Var, k kVar) {
        this.f9080a = 0;
        this.f9082c = new Handler(Looper.getMainLooper());
        this.f9090k = 0;
        this.f9081b = A();
        this.f9084e = context.getApplicationContext();
        zzfl zzv = zzfm.zzv();
        zzv.zzj(A());
        zzv.zzi(this.f9084e.getPackageName());
        this.f9085f = new m(this.f9084e, (zzfm) zzv.zzc());
        zzb.zzj("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f9083d = new x(this.f9084e, null, this.f9085f);
        this.f9103x = pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, p pVar, Context context, x5.n nVar, x5.c cVar, k kVar) {
        this(context, pVar, nVar, A(), null, cVar, null);
    }
}
