package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
@SafeParcelable.Class(creator = "AncsNotificationParcelableCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzn extends AbstractSafeParcelable implements com.google.android.gms.wearable.zzb {
    public static final Parcelable.Creator<zzn> CREATOR = new zzo();
    @SafeParcelable.Field(getter = "getId", id = 2)
    private final int zza;
    @SafeParcelable.Field(getter = "getAppId", id = 3)
    private final String zzb;
    @SafeParcelable.Field(getter = "getDateTime", id = 4)
    private final String zzc;
    @SafeParcelable.Field(getter = "getNotificationText", id = 5)
    private final String zzd;
    @SafeParcelable.Field(getter = "getTitle", id = 6)
    private final String zze;
    @SafeParcelable.Field(getter = "getSubtitle", id = 7)
    private final String zzf;
    @SafeParcelable.Field(getter = "getDisplayName", id = 8)
    private final String zzg;
    @SafeParcelable.Field(getter = "getEventId", id = 9)
    private final byte zzh;
    @SafeParcelable.Field(getter = "getEventFlags", id = 10)
    private final byte zzi;
    @SafeParcelable.Field(getter = "getCategoryId", id = 11)
    private final byte zzj;
    @SafeParcelable.Field(getter = "getCategoryCount", id = 12)
    private final byte zzk;
    @SafeParcelable.Field(getter = "getPackageName", id = 13)
    private final String zzl;

    @SafeParcelable.Constructor
    public zzn(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 7) String str5, @SafeParcelable.Param(id = 8) String str6, @SafeParcelable.Param(id = 9) byte b10, @SafeParcelable.Param(id = 10) byte b11, @SafeParcelable.Param(id = 11) byte b12, @SafeParcelable.Param(id = 12) byte b13, @SafeParcelable.Param(id = 13) String str7) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
        this.zzg = str6;
        this.zzh = b10;
        this.zzi = b11;
        this.zzj = b12;
        this.zzk = b13;
        this.zzl = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzn.class != obj.getClass()) {
            return false;
        }
        zzn zznVar = (zzn) obj;
        if (this.zza != zznVar.zza || this.zzh != zznVar.zzh || this.zzi != zznVar.zzi || this.zzj != zznVar.zzj || this.zzk != zznVar.zzk || !this.zzb.equals(zznVar.zzb)) {
            return false;
        }
        String str = this.zzc;
        if (str == null ? zznVar.zzc != null : !str.equals(zznVar.zzc)) {
            return false;
        }
        if (!this.zzd.equals(zznVar.zzd) || !this.zze.equals(zznVar.zze) || !this.zzf.equals(zznVar.zzf)) {
            return false;
        }
        String str2 = this.zzg;
        if (str2 == null ? zznVar.zzg != null : !str2.equals(zznVar.zzg)) {
            return false;
        }
        String str3 = this.zzl;
        if (str3 != null) {
            return str3.equals(zznVar.zzl);
        }
        if (zznVar.zzl == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = ((this.zza + 31) * 31) + this.zzb.hashCode();
        String str = this.zzc;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = ((((((((hashCode * 31) + i10) * 31) + this.zzd.hashCode()) * 31) + this.zze.hashCode()) * 31) + this.zzf.hashCode()) * 31;
        String str2 = this.zzg;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((hashCode2 + i11) * 31) + this.zzh) * 31) + this.zzi) * 31) + this.zzj) * 31) + this.zzk) * 31;
        String str3 = this.zzl;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        int i10 = this.zza;
        String str = this.zzb;
        String str2 = this.zzc;
        byte b10 = this.zzh;
        byte b11 = this.zzi;
        byte b12 = this.zzj;
        byte b13 = this.zzk;
        return "AncsNotificationParcelable{, id=" + i10 + ", appId='" + str + "', dateTime='" + str2 + "', eventId=" + ((int) b10) + ", eventFlags=" + ((int) b11) + ", categoryId=" + ((int) b12) + ", categoryCount=" + ((int) b13) + ", packageName='" + this.zzl + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        String str = this.zzg;
        if (str == null) {
            str = this.zzb;
        }
        SafeParcelWriter.writeString(parcel, 8, str, false);
        SafeParcelWriter.writeByte(parcel, 9, this.zzh);
        SafeParcelWriter.writeByte(parcel, 10, this.zzi);
        SafeParcelWriter.writeByte(parcel, 11, this.zzj);
        SafeParcelWriter.writeByte(parcel, 12, this.zzk);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
