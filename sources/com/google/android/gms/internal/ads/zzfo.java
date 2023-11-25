package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfo implements zzby {
    public static final Parcelable.Creator<zzfo> CREATOR = new zzfm();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzfo(String str, byte[] bArr, int i10, int i11) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfo.class == obj.getClass()) {
            zzfo zzfoVar = (zzfo) obj;
            if (this.zza.equals(zzfoVar.zza) && Arrays.equals(this.zzb, zzfoVar.zzb) && this.zzc == zzfoVar.zzc && this.zzd == zzfoVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final String toString() {
        String str;
        boolean z10;
        boolean z11;
        int i10 = this.zzd;
        if (i10 != 1) {
            if (i10 != 23) {
                if (i10 != 67) {
                    byte[] bArr = this.zzb;
                    int length = bArr.length;
                    StringBuilder sb2 = new StringBuilder(length + length);
                    for (int i11 = 0; i11 < bArr.length; i11++) {
                        sb2.append(Character.forDigit((bArr[i11] >> 4) & 15, 16));
                        sb2.append(Character.forDigit(bArr[i11] & 15, 16));
                    }
                    str = sb2.toString();
                } else {
                    byte[] bArr2 = this.zzb;
                    int i12 = zzfk.zza;
                    if (bArr2.length == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zzdy.zzd(z11);
                    int i13 = bArr2[0] << 24;
                    str = String.valueOf(bArr2[3] | (bArr2[1] << 16) | i13 | (bArr2[2] << 8));
                }
            } else {
                byte[] bArr3 = this.zzb;
                int i14 = zzfk.zza;
                if (bArr3.length == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzdy.zzd(z10);
                str = String.valueOf(Float.intBitsToFloat((bArr3[3] & 255) | ((bArr3[1] & 255) << 16) | (bArr3[0] << 24) | ((bArr3[2] & 255) << 8)));
            }
        } else {
            str = new String(this.zzb, zzfqu.zzc);
        }
        return "mdta: key=" + this.zza + ", value=" + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfo(Parcel parcel, zzfn zzfnVar) {
        String readString = parcel.readString();
        int i10 = zzfk.zza;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
