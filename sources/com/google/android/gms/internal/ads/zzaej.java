package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaej extends zzaes {
    public static final Parcelable.Creator<zzaej> CREATOR = new zzaei();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzaes[] zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaej(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i10 = zzfk.zza;
        this.zza = readString;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.zze = new zzaes[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.zze[i11] = (zzaes) parcel.readParcelable(zzaes.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaej.class == obj.getClass()) {
            zzaej zzaejVar = (zzaej) obj;
            if (this.zzb == zzaejVar.zzb && this.zzc == zzaejVar.zzc && zzfk.zzD(this.zza, zzaejVar.zza) && Arrays.equals(this.zzd, zzaejVar.zzd) && Arrays.equals(this.zze, zzaejVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0);
        String str = this.zza;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return (i11 * 31) + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzaes zzaesVar : this.zze) {
            parcel.writeParcelable(zzaesVar, 0);
        }
    }

    public zzaej(String str, boolean z10, boolean z11, String[] strArr, zzaes[] zzaesVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = strArr;
        this.zze = zzaesVarArr;
    }
}
