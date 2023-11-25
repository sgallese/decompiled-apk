package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@SafeParcelable.Class(creator = "PoolConfigurationCreator")
/* loaded from: classes3.dex */
public final class zzfdu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfdu> CREATOR = new zzfdv();
    public final Context zza;
    public final zzfdr zzb;
    @SafeParcelable.Field(id = 2)
    public final int zzc;
    @SafeParcelable.Field(id = 3)
    public final int zzd;
    @SafeParcelable.Field(id = 4)
    public final int zze;
    @SafeParcelable.Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfdr[] zzh;
    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzi;
    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;
    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzfdu(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 4) int i13, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i14, @SafeParcelable.Param(id = 7) int i15) {
        zzfdr[] values = zzfdr.values();
        this.zzh = values;
        int[] zza = zzfds.zza();
        this.zzl = zza;
        int[] zza2 = zzfdt.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i10;
        this.zzb = values[i10];
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = str;
        this.zzj = i14;
        this.zzg = zza[i14];
        this.zzk = i15;
        int i16 = zza2[i15];
    }

    public static zzfdu zza(zzfdr zzfdrVar, Context context) {
        if (zzfdrVar == zzfdr.Rewarded) {
            return new zzfdu(context, zzfdrVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgl)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgr)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgt)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgv), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgn), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgp));
        } else if (zzfdrVar == zzfdr.Interstitial) {
            return new zzfdu(context, zzfdrVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgm)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgs)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgu)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgw), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgo), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgq));
        } else if (zzfdrVar == zzfdr.AppOpen) {
            return new zzfdu(context, zzfdrVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgz)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgB)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgC)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgx), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgy), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgA));
        } else {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzi);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzfdu(Context context, zzfdr zzfdrVar, int i10, int i11, int i12, String str, String str2, String str3) {
        int i13;
        this.zzh = zzfdr.values();
        this.zzl = zzfds.zza();
        this.zzm = zzfdt.zza();
        this.zza = context;
        this.zzi = zzfdrVar.ordinal();
        this.zzb = zzfdrVar;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i13 = 1;
        } else {
            i13 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i13;
        this.zzj = i13 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
