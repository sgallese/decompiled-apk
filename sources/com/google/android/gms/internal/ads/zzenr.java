package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzenr implements zzesj {
    private static final Object zza = new Object();
    private final String zzb;
    private final String zzc;
    private final zzctv zzd;
    private final zzfdh zze;
    private final zzfca zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh();
    private final zzdrc zzh;

    public zzenr(String str, String str2, zzctv zzctvVar, zzfdh zzfdhVar, zzfca zzfcaVar, zzdrc zzdrcVar) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzctvVar;
        this.zze = zzfdhVar;
        this.zzf = zzfcaVar;
        this.zzh = zzdrcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhq)).booleanValue()) {
            this.zzh.zza().put("seq_num", this.zzb);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfu)).booleanValue()) {
            this.zzd.zzk(this.zzf.zzd);
            bundle.putAll(this.zze.zzb());
        }
        return zzfye.zzh(new zzesi() { // from class: com.google.android.gms.internal.ads.zzenq
            @Override // com.google.android.gms.internal.ads.zzesi
            public final void zzj(Object obj) {
                zzenr.this.zzc(bundle, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Bundle bundle, Bundle bundle2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfu)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzft)).booleanValue()) {
                synchronized (zza) {
                    this.zzd.zzk(this.zzf.zzd);
                    bundle2.putBundle("quality_signals", this.zze.zzb());
                }
            } else {
                this.zzd.zzk(this.zzf.zzd);
                bundle2.putBundle("quality_signals", this.zze.zzb());
            }
        }
        bundle2.putString("seq_num", this.zzb);
        if (!this.zzg.zzQ()) {
            bundle2.putString("session_id", this.zzc);
        }
        bundle2.putBoolean("client_purpose_one", !this.zzg.zzQ());
    }
}
