package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@SafeParcelable.Class(creator = "GoogleSessionIdExtensionCreator")
/* loaded from: classes.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new zzac();
    @SafeParcelable.Field(getter = "getSessionId", id = 1)
    private final long zza;

    @SafeParcelable.Constructor
    public zzab(@SafeParcelable.Param(id = 1) long j10) {
        this.zza = ((Long) Preconditions.checkNotNull(Long.valueOf(j10))).longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzab) || this.zza != ((zzab) obj).zza) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
