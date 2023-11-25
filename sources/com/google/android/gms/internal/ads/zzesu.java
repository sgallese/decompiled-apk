package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzesu implements zzesj {
    private final zzfyo zza;
    private final Context zzb;

    public zzesu(zzfyo zzfyoVar, Context context) {
        this.zza = zzfyoVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzest
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesu.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzess zzc() throws Exception {
        int i10;
        boolean z10;
        int i11;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzt.zzp();
        int i12 = -1;
        if (com.google.android.gms.ads.internal.util.zzs.zzx(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i10 = type;
                i12 = ordinal;
            } else {
                i10 = -1;
            }
            z10 = connectivityManager.isActiveNetworkMetered();
            i11 = i12;
        } else {
            i10 = -2;
            z10 = false;
            i11 = -1;
        }
        return new zzess(networkOperator, i10, com.google.android.gms.ads.internal.zzt.zzq().zzn(this.zzb), phoneType, z10, i11);
    }
}
