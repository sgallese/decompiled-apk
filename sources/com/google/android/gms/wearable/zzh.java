package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
@ShowFirstParty
@SafeParcelable.Class(creator = "DataItemFilterCreator")
/* loaded from: classes3.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();
    @SafeParcelable.Field(getter = "getUri", id = 1)
    private final Uri zza;
    @SafeParcelable.Field(getter = "getFilterType", id = 2)
    private final int zzb;

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(id = 1) Uri uri, @SafeParcelable.Param(id = 2) int i10) {
        this.zza = uri;
        this.zzb = i10;
    }

    public final String toString() {
        com.google.android.gms.internal.wearable.zzad zza = com.google.android.gms.internal.wearable.zzae.zza(this);
        zza.zzb("uri", this.zza);
        zza.zza("filterType", this.zzb);
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i10, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
