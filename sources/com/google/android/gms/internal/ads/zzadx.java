package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzadx implements zzby {
    public static final Parcelable.Creator<zzadx> CREATOR = new zzadw();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzadx(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = bArr;
    }

    public static zzadx zzb(zzfb zzfbVar) {
        int zzf = zzfbVar.zzf();
        String zzy = zzfbVar.zzy(zzfbVar.zzf(), zzfqu.zza);
        String zzy2 = zzfbVar.zzy(zzfbVar.zzf(), zzfqu.zzc);
        int zzf2 = zzfbVar.zzf();
        int zzf3 = zzfbVar.zzf();
        int zzf4 = zzfbVar.zzf();
        int zzf5 = zzfbVar.zzf();
        int zzf6 = zzfbVar.zzf();
        byte[] bArr = new byte[zzf6];
        zzfbVar.zzC(bArr, 0, zzf6);
        return new zzadx(zzf, zzy, zzy2, zzf2, zzf3, zzf4, zzf5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadx.class == obj.getClass()) {
            zzadx zzadxVar = (zzadx) obj;
            if (this.zza == zzadxVar.zza && this.zzb.equals(zzadxVar.zzb) && this.zzc.equals(zzadxVar.zzc) && this.zzd == zzadxVar.zzd && this.zze == zzadxVar.zze && this.zzf == zzadxVar.zzf && this.zzg == zzadxVar.zzg && Arrays.equals(this.zzh, zzadxVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zza(zzbt zzbtVar) {
        zzbtVar.zza(this.zzh, this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadx(Parcel parcel) {
        this.zza = parcel.readInt();
        String readString = parcel.readString();
        int i10 = zzfk.zza;
        this.zzb = readString;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }
}
