package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbz implements Parcelable {
    public static final Parcelable.Creator<zzbz> CREATOR = new zzbx();
    public final long zza;
    private final zzby[] zzb;

    public zzbz(long j10, zzby... zzbyVarArr) {
        this.zza = j10;
        this.zzb = zzbyVarArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbz.class == obj.getClass()) {
            zzbz zzbzVar = (zzbz) obj;
            if (Arrays.equals(this.zzb, zzbzVar.zzb) && this.zza == zzbzVar.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.zzb) * 31;
        long j10 = this.zza;
        return hashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        String str;
        String arrays = Arrays.toString(this.zzb);
        long j10 = this.zza;
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        return "entries=" + arrays + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zzb.length);
        for (zzby zzbyVar : this.zzb) {
            parcel.writeParcelable(zzbyVar, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzby zzb(int i10) {
        return this.zzb[i10];
    }

    public final zzbz zzc(zzby... zzbyVarArr) {
        int length = zzbyVarArr.length;
        if (length == 0) {
            return this;
        }
        long j10 = this.zza;
        zzby[] zzbyVarArr2 = this.zzb;
        int i10 = zzfk.zza;
        int length2 = zzbyVarArr2.length;
        Object[] copyOf = Arrays.copyOf(zzbyVarArr2, length2 + length);
        System.arraycopy(zzbyVarArr, 0, copyOf, length2, length);
        return new zzbz(j10, (zzby[]) copyOf);
    }

    public final zzbz zzd(zzbz zzbzVar) {
        if (zzbzVar == null) {
            return this;
        }
        return zzc(zzbzVar.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbz(Parcel parcel) {
        this.zzb = new zzby[parcel.readInt()];
        int i10 = 0;
        while (true) {
            zzby[] zzbyVarArr = this.zzb;
            if (i10 < zzbyVarArr.length) {
                zzbyVarArr[i10] = (zzby) parcel.readParcelable(zzby.class.getClassLoader());
                i10++;
            } else {
                this.zza = parcel.readLong();
                return;
            }
        }
    }

    public zzbz(List list) {
        this(-9223372036854775807L, (zzby[]) list.toArray(new zzby[0]));
    }
}
