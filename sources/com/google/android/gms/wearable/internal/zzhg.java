package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Node;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
@SafeParcelable.Class(creator = "NodeParcelableCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzhg extends AbstractSafeParcelable implements Node {
    public static final Parcelable.Creator<zzhg> CREATOR = new zzhh();
    @SafeParcelable.Field(getter = "getId", id = 2)
    private final String zza;
    @SafeParcelable.Field(getter = "getDisplayName", id = 3)
    private final String zzb;
    @SafeParcelable.Field(getter = "getHopCount", id = 4)
    private final int zzc;
    @SafeParcelable.Field(getter = "isNearby", id = 5)
    private final boolean zzd;

    @SafeParcelable.Constructor
    public zzhg(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) int i10, @SafeParcelable.Param(id = 5) boolean z10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhg)) {
            return false;
        }
        return ((zzhg) obj).zza.equals(this.zza);
    }

    @Override // com.google.android.gms.wearable.Node
    public final String getDisplayName() {
        return this.zzb;
    }

    @Override // com.google.android.gms.wearable.Node
    public final String getId() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.wearable.Node
    public final boolean isNearby() {
        return this.zzd;
    }

    public final String toString() {
        return "Node{" + this.zzb + ", id=" + this.zza + ", hops=" + this.zzc + ", isNearby=" + this.zzd + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
