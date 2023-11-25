package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class x extends y7.d {

    /* renamed from: g  reason: collision with root package name */
    private final v1 f11069g;

    /* renamed from: h  reason: collision with root package name */
    private final d1 f11070h;

    /* renamed from: i  reason: collision with root package name */
    private final x7.b0 f11071i;

    /* renamed from: j  reason: collision with root package name */
    private final q0 f11072j;

    /* renamed from: k  reason: collision with root package name */
    private final g1 f11073k;

    /* renamed from: l  reason: collision with root package name */
    private final x7.b0 f11074l;

    /* renamed from: m  reason: collision with root package name */
    private final x7.b0 f11075m;

    /* renamed from: n  reason: collision with root package name */
    private final o2 f11076n;

    /* renamed from: o  reason: collision with root package name */
    private final Handler f11077o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(Context context, v1 v1Var, d1 d1Var, x7.b0 b0Var, g1 g1Var, q0 q0Var, x7.b0 b0Var2, x7.b0 b0Var3, o2 o2Var) {
        super(new x7.f("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f11077o = new Handler(Looper.getMainLooper());
        this.f11069g = v1Var;
        this.f11070h = d1Var;
        this.f11071i = b0Var;
        this.f11073k = g1Var;
        this.f11072j = q0Var;
        this.f11074l = b0Var2;
        this.f11075m = b0Var3;
        this.f11076n = o2Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y7.d
    public final void a(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList != null && stringArrayList.size() == 1) {
                final AssetPackState i10 = AssetPackState.i(bundleExtra, stringArrayList.get(0), this.f11073k, this.f11076n, new a0() { // from class: com.google.android.play.core.assetpacks.z
                    @Override // com.google.android.play.core.assetpacks.a0
                    public final int zza(int i11, String str) {
                        return i11;
                    }
                });
                this.f26277a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", i10);
                PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
                if (pendingIntent != null) {
                    this.f11072j.a(pendingIntent);
                }
                ((Executor) this.f11075m.zza()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.this.g(bundleExtra, i10);
                    }
                });
                ((Executor) this.f11074l.zza()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.this.f(bundleExtra);
                    }
                });
                return;
            }
            this.f26277a.b("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        this.f26277a.b("Empty bundle received from broadcast.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void f(Bundle bundle) {
        if (this.f11069g.n(bundle)) {
            this.f11070h.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void g(Bundle bundle, AssetPackState assetPackState) {
        if (this.f11069g.m(bundle)) {
            h(assetPackState);
            ((t3) this.f11071i.zza()).zzf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(final AssetPackState assetPackState) {
        this.f11077o.post(new Runnable() { // from class: com.google.android.play.core.assetpacks.w
            @Override // java.lang.Runnable
            public final void run() {
                x.this.d(assetPackState);
            }
        });
    }
}
