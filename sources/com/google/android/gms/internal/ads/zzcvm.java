package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcvm {
    private final zzfge zza;
    private final zzcag zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzgyn zzg;
    private final String zzh;
    private final zzesm zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzfca zzk;

    public zzcvm(zzfge zzfgeVar, zzcag zzcagVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzgyn zzgynVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzesm zzesmVar, zzfca zzfcaVar) {
        this.zza = zzfgeVar;
        this.zzb = zzcagVar;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzgynVar;
        this.zzh = str2;
        this.zzi = zzesmVar;
        this.zzj = zzgVar;
        this.zzk = zzfcaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbun zza(com.google.common.util.concurrent.a aVar) throws Exception {
        boolean z10;
        Bundle bundle = (Bundle) aVar.get();
        zzcag zzcagVar = this.zzb;
        ApplicationInfo applicationInfo = this.zzc;
        String str = this.zzd;
        List list = this.zze;
        PackageInfo packageInfo = this.zzf;
        String str2 = (String) ((com.google.common.util.concurrent.a) this.zzg.zzb()).get();
        String str3 = this.zzh;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzha)).booleanValue() && this.zzj.zzQ()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new zzbun(bundle, zzcagVar, applicationInfo, str, list, packageInfo, str2, str3, null, null, z10, this.zzk.zzb());
    }

    public final com.google.common.util.concurrent.a zzb() {
        zzfge zzfgeVar = this.zza;
        return zzffo.zzc(this.zzi.zza(new Bundle()), zzffy.SIGNALS, zzfgeVar).zza();
    }

    public final com.google.common.util.concurrent.a zzc() {
        final com.google.common.util.concurrent.a zzb = zzb();
        return this.zza.zza(zzffy.REQUEST_PARCEL, zzb, (com.google.common.util.concurrent.a) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcvl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcvm.this.zza(zzb);
            }
        }).zza();
    }
}
