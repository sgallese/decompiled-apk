package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzemq implements zzesi {
    public final com.google.android.gms.ads.internal.client.zzq zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzemq(com.google.android.gms.ads.internal.client.zzq zzqVar, String str, boolean z10, String str2, float f10, int i10, int i11, String str3, boolean z11) {
        Preconditions.checkNotNull(zzqVar, "the adSize must not be null");
        this.zza = zzqVar;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = str2;
        this.zze = f10;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = str3;
        this.zzi = z11;
    }

    @Override // com.google.android.gms.internal.ads.zzesi
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        boolean z10;
        boolean z11;
        Bundle bundle = (Bundle) obj;
        if (this.zza.zze == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfcm.zzf(bundle, "smart_w", "full", z10);
        if (this.zza.zzb == -2) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzfcm.zzf(bundle, "smart_h", "auto", z11);
        zzfcm.zzg(bundle, "ene", true, this.zza.zzj);
        zzfcm.zzf(bundle, "rafmt", "102", this.zza.zzm);
        zzfcm.zzf(bundle, "rafmt", "103", this.zza.zzn);
        zzfcm.zzf(bundle, "rafmt", "105", this.zza.zzo);
        zzfcm.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfcm.zzg(bundle, "interscroller_slot", true, this.zza.zzo);
        zzfcm.zzc(bundle, "format", this.zzb);
        zzfcm.zzf(bundle, "fluid", "height", this.zzc);
        zzfcm.zzf(bundle, "sz", this.zzd, !TextUtils.isEmpty(r0));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        zzfcm.zzf(bundle, "sc", this.zzh, !TextUtils.isEmpty(r0));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = this.zza.zzg;
        if (zzqVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.zza.zzb);
            bundle2.putInt("width", this.zza.zze);
            bundle2.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzq zzqVar : zzqVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzqVar.zzi);
                bundle3.putInt("height", zzqVar.zzb);
                bundle3.putInt("width", zzqVar.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
