package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@SafeParcelable.Class(creator = "NonagonRequestParcelCreator")
/* loaded from: classes3.dex */
public final class zzbun extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbun> CREATOR = new zzbuo();
    @SafeParcelable.Field(id = 1)
    public final Bundle zza;
    @SafeParcelable.Field(id = 2)
    public final zzcag zzb;
    @SafeParcelable.Field(id = 3)
    public final ApplicationInfo zzc;
    @SafeParcelable.Field(id = 4)
    public final String zzd;
    @SafeParcelable.Field(id = 5)
    public final List zze;
    @SafeParcelable.Field(id = 6)
    public final PackageInfo zzf;
    @SafeParcelable.Field(id = 7)
    public final String zzg;
    @SafeParcelable.Field(id = 9)
    public final String zzh;
    @SafeParcelable.Field(id = 10)
    public zzfdu zzi;
    @SafeParcelable.Field(id = 11)
    public String zzj;
    @SafeParcelable.Field(id = 12)
    public final boolean zzk;
    @SafeParcelable.Field(id = 13)
    public final boolean zzl;

    @SafeParcelable.Constructor
    public zzbun(@SafeParcelable.Param(id = 1) Bundle bundle, @SafeParcelable.Param(id = 2) zzcag zzcagVar, @SafeParcelable.Param(id = 3) ApplicationInfo applicationInfo, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) List list, @SafeParcelable.Param(id = 6) PackageInfo packageInfo, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 9) String str3, @SafeParcelable.Param(id = 10) zzfdu zzfduVar, @SafeParcelable.Param(id = 11) String str4, @SafeParcelable.Param(id = 12) boolean z10, @SafeParcelable.Param(id = 13) boolean z11) {
        this.zza = bundle;
        this.zzb = zzcagVar;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzfduVar;
        this.zzj = str4;
        this.zzk = z10;
        this.zzl = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i10, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i10, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i10, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
