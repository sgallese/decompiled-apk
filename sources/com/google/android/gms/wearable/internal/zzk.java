package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
@SafeParcelable.Class(creator = "AmsEntityUpdateParcelableCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzk extends AbstractSafeParcelable implements com.google.android.gms.wearable.zza {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    @SafeParcelable.Field(getter = "getEntityId", id = 2)
    private final byte zza;
    @SafeParcelable.Field(getter = "getAttributeId", id = 3)
    private final byte zzb;
    @SafeParcelable.Field(getter = "getValue", id = 4)
    private final String zzc;

    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param(id = 2) byte b10, @SafeParcelable.Param(id = 3) byte b11, @SafeParcelable.Param(id = 4) String str) {
        this.zza = b10;
        this.zzb = b11;
        this.zzc = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzk.class != obj.getClass()) {
            return false;
        }
        zzk zzkVar = (zzk) obj;
        if (this.zza == zzkVar.zza && this.zzb == zzkVar.zzb && this.zzc.equals(zzkVar.zzc)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza + 31) * 31) + this.zzb) * 31) + this.zzc.hashCode();
    }

    public final String toString() {
        byte b10 = this.zza;
        byte b11 = this.zzb;
        return "AmsEntityUpdateParcelable{, mEntityId=" + ((int) b10) + ", mAttributeId=" + ((int) b11) + ", mValue='" + this.zzc + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, this.zza);
        SafeParcelWriter.writeByte(parcel, 3, this.zzb);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
