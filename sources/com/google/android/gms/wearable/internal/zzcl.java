package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
@SafeParcelable.Class(creator = "ConsentResponseCreator")
/* loaded from: classes3.dex */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new zzcm();
    @SafeParcelable.Field(id = 1)
    public final int zza;
    @SafeParcelable.Field(id = 2)
    public final boolean zzb;
    @SafeParcelable.Field(id = 3)
    public final boolean zzc;
    @SafeParcelable.Field(id = 4)
    public final boolean zzd;
    @SafeParcelable.Field(id = 5)
    public final boolean zze;
    @SafeParcelable.Field(id = 6)
    public final List zzf;

    @SafeParcelable.Constructor
    public zzcl(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) boolean z10, @SafeParcelable.Param(id = 3) boolean z11, @SafeParcelable.Param(id = 4) boolean z12, @SafeParcelable.Param(id = 5) boolean z13, @SafeParcelable.Param(id = 6) List list) {
        this.zza = i10;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = z12;
        this.zze = z13;
        this.zzf = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcl)) {
            return false;
        }
        zzcl zzclVar = (zzcl) obj;
        if (this.zza == zzclVar.zza && this.zzb == zzclVar.zzb && this.zzc == zzclVar.zzc && this.zzd == zzclVar.zzd && this.zze == zzclVar.zze) {
            List list = zzclVar.zzf;
            List list2 = this.zzf;
            if (list2 == null || list == null ? list2 == list : !(!list2.containsAll(list) || this.zzf.size() != list.size())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc), Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), this.zzf);
    }

    public final String toString() {
        return "ConsentResponse {statusCode =" + this.zza + ", hasTosConsent =" + this.zzb + ", hasLoggingConsent =" + this.zzc + ", hasCloudSyncConsent =" + this.zzd + ", hasLocationConsent =" + this.zze + ", accountConsentRecords =" + String.valueOf(this.zzf) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeTypedList(parcel, 6, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
