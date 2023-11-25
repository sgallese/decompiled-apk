package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.Node;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
@SafeParcelable.Class(creator = "CapabilityInfoParcelableCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzas extends AbstractSafeParcelable implements CapabilityInfo {
    public static final Parcelable.Creator<zzas> CREATOR = new zzat();
    @SafeParcelable.Field(getter = "getName", id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getNodeParcelables", id = 3)
    private final List zzc;
    private final Object zza = new Object();
    private Set zzd = null;

    @SafeParcelable.Constructor
    public zzas(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) List list) {
        this.zzb = str;
        this.zzc = list;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzas.class != obj.getClass()) {
            return false;
        }
        zzas zzasVar = (zzas) obj;
        String str = this.zzb;
        if (str == null ? zzasVar.zzb != null : !str.equals(zzasVar.zzb)) {
            return false;
        }
        List list = this.zzc;
        if (list == null ? zzasVar.zzc == null : list.equals(zzasVar.zzc)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.wearable.CapabilityInfo
    public final String getName() {
        return this.zzb;
    }

    @Override // com.google.android.gms.wearable.CapabilityInfo
    public final Set<Node> getNodes() {
        Set<Node> set;
        synchronized (this.zza) {
            if (this.zzd == null) {
                this.zzd = new HashSet(this.zzc);
            }
            set = this.zzd;
        }
        return set;
    }

    public final int hashCode() {
        int i10;
        String str = this.zzb;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        List list = this.zzc;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i10 + 31) * 31) + i11;
    }

    public final String toString() {
        return "CapabilityInfo{" + this.zzb + ", " + String.valueOf(this.zzc) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
