package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
@ShowFirstParty
@SafeParcelable.Class(creator = "ConnectionRestrictionsCreator")
/* loaded from: classes3.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();
    @SafeParcelable.Field(getter = "getAllowedDataItemFilters", id = 1)
    private final List zza;
    @SafeParcelable.Field(getter = "getAllowedCapabilities", id = 2)
    private final List zzb;
    @SafeParcelable.Field(getter = "getAllowedPackages", id = 3)
    private final List zzc;

    @SafeParcelable.Constructor
    public zzf(@SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) List list2, @SafeParcelable.Param(id = 3) List list3) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = list3;
    }

    public final String toString() {
        com.google.android.gms.internal.wearable.zzad zza = com.google.android.gms.internal.wearable.zzae.zza(this);
        zza.zzb("allowedDataItemFilters", this.zza);
        zza.zzb("allowedCapabilities", this.zzb);
        zza.zzb("allowedPackages", this.zzc);
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
