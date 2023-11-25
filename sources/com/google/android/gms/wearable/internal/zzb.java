package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
@SafeParcelable.Class(creator = "AccountConsentRecordParcelableCreator")
/* loaded from: classes3.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzc();
    @SafeParcelable.Field(getter = "getAccountName", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "hasSwaadlConsent", id = 2)
    private final boolean zzb;

    @SafeParcelable.Constructor
    public zzb(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) boolean z10) {
        this.zza = str;
        this.zzb = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzb)) {
            return false;
        }
        zzb zzbVar = (zzb) obj;
        if (this.zza.equals(zzbVar.zza) && this.zzb == zzbVar.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Boolean.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeBoolean(parcel, 2, Boolean.valueOf(this.zzb).booleanValue());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
