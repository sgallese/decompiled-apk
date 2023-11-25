package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfu implements zzby {
    public static final Parcelable.Creator<zzfu> CREATOR = new zzfs();
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzfu(long j10, long j11, long j12) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfu)) {
            return false;
        }
        zzfu zzfuVar = (zzfu) obj;
        if (this.zza == zzfuVar.zza && this.zzb == zzfuVar.zzb && this.zzc == zzfuVar.zzc) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.zza;
        long j11 = j10 ^ (j10 >>> 32);
        long j12 = this.zzb;
        long j13 = j12 ^ (j12 >>> 32);
        long j14 = this.zzc;
        return ((((((int) j11) + 527) * 31) + ((int) j13)) * 31) + ((int) (j14 ^ (j14 >>> 32)));
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfu(Parcel parcel, zzft zzftVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
