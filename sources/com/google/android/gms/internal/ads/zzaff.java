package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaff implements zzby {
    public static final Parcelable.Creator<zzaff> CREATOR = new zzafd();
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzaff(long j10, long j11, long j12, long j13, long j14) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
        this.zzd = j13;
        this.zze = j14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaff.class == obj.getClass()) {
            zzaff zzaffVar = (zzaff) obj;
            if (this.zza == zzaffVar.zza && this.zzb == zzaffVar.zzb && this.zzc == zzaffVar.zzc && this.zzd == zzaffVar.zzd && this.zze == zzaffVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.zza;
        long j11 = j10 ^ (j10 >>> 32);
        long j12 = this.zzb;
        long j13 = j12 ^ (j12 >>> 32);
        long j14 = this.zzc;
        long j15 = j14 ^ (j14 >>> 32);
        long j16 = this.zzd;
        long j17 = j16 ^ (j16 >>> 32);
        long j18 = this.zze;
        return ((((((((((int) j11) + 527) * 31) + ((int) j13)) * 31) + ((int) j15)) * 31) + ((int) j17)) * 31) + ((int) (j18 ^ (j18 >>> 32)));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.zza + ", photoSize=" + this.zzb + ", photoPresentationTimestampUs=" + this.zzc + ", videoStartPosition=" + this.zzd + ", videoSize=" + this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaff(Parcel parcel, zzafe zzafeVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
