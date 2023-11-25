package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaeb implements zzby {
    public static final Parcelable.Creator<zzaeb> CREATOR = new zzaea();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzaeb(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11 = true;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        }
        zzdy.zzd(z11);
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z10;
        this.zzf = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaeb.class == obj.getClass()) {
            zzaeb zzaebVar = (zzaeb) obj;
            if (this.zza == zzaebVar.zza && zzfk.zzD(this.zzb, zzaebVar.zzb) && zzfk.zzD(this.zzc, zzaebVar.zzc) && zzfk.zzD(this.zzd, zzaebVar.zzd) && this.zze == zzaebVar.zze && this.zzf == zzaebVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = this.zza + 527;
        String str = this.zzb;
        int i13 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = i12 * 31;
        String str2 = this.zzc;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (((i14 + i10) * 31) + i11) * 31;
        String str3 = this.zzd;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return ((((i15 + i13) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.zzc + "\", genre=\"" + this.zzb + "\", bitrate=" + this.zza + ", metadataInterval=" + this.zzf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        boolean z10 = this.zze;
        int i11 = zzfk.zza;
        parcel.writeInt(z10 ? 1 : 0);
        parcel.writeInt(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zza(zzbt zzbtVar) {
        String str = this.zzc;
        if (str != null) {
            zzbtVar.zzp(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzbtVar.zzi(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaeb(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        int i10 = zzfk.zza;
        this.zze = parcel.readInt() != 0;
        this.zzf = parcel.readInt();
    }
}
