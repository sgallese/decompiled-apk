package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaeh extends zzaes {
    public static final Parcelable.Creator<zzaeh> CREATOR = new zzaeg();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzaes[] zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaeh(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i10 = zzfk.zza;
        this.zza = readString;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzg = new zzaes[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.zzg[i11] = (zzaes) parcel.readParcelable(zzaes.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaes, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaeh.class == obj.getClass()) {
            zzaeh zzaehVar = (zzaeh) obj;
            if (this.zzb == zzaehVar.zzb && this.zzc == zzaehVar.zzc && this.zzd == zzaehVar.zzd && this.zze == zzaehVar.zze && zzfk.zzD(this.zza, zzaehVar.zza) && Arrays.equals(this.zzg, zzaehVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = ((this.zzb + 527) * 31) + this.zzc;
        int i12 = (int) this.zzd;
        int i13 = (int) this.zze;
        String str = this.zza;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return (((((i11 * 31) + i12) * 31) + i13) * 31) + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzaes zzaesVar : this.zzg) {
            parcel.writeParcelable(zzaesVar, 0);
        }
    }

    public zzaeh(String str, int i10, int i11, long j10, long j11, zzaes[] zzaesVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = j11;
        this.zzg = zzaesVarArr;
    }
}
