package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzadu implements zzby {
    public static final Parcelable.Creator<zzadu> CREATOR;
    private static final zzam zzf;
    private static final zzam zzg;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzh;

    static {
        zzak zzakVar = new zzak();
        zzakVar.zzS("application/id3");
        zzf = zzakVar.zzY();
        zzak zzakVar2 = new zzak();
        zzakVar2.zzS("application/x-scte35");
        zzg = zzakVar2.zzY();
        CREATOR = new zzadt();
    }

    public zzadu(String str, String str2, long j10, long j11, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadu.class == obj.getClass()) {
            zzadu zzaduVar = (zzadu) obj;
            if (this.zzc == zzaduVar.zzc && this.zzd == zzaduVar.zzd && zzfk.zzD(this.zza, zzaduVar.zza) && zzfk.zzD(this.zzb, zzaduVar.zzb) && Arrays.equals(this.zze, zzaduVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.zzh;
        if (i11 == 0) {
            String str = this.zza;
            int i12 = 0;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            String str2 = this.zzb;
            if (str2 != null) {
                i12 = str2.hashCode();
            }
            long j10 = this.zzc;
            long j11 = this.zzd;
            int hashCode = ((((((((i10 + 527) * 31) + i12) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.zze);
            this.zzh = hashCode;
            return hashCode;
        }
        return i11;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadu(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = zzfk.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.createByteArray();
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
