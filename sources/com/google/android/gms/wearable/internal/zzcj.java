package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
@SafeParcelable.Class(creator = "ConnectionStateEventParcelableCreator")
/* loaded from: classes3.dex */
public final class zzcj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcj> CREATOR = new zzck();
    @SafeParcelable.Field(getter = "getState", id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getAddress", id = 2)
    private final String zzb;

    @SafeParcelable.Constructor
    public zzcj(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) String str) {
        this.zza = i10;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcj)) {
            return false;
        }
        zzcj zzcjVar = (zzcj) obj;
        if (this.zza == zzcjVar.zza && ((str = this.zzb) == (str2 = zzcjVar.zzb) || (str != null && str.equals(str2)))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        String str;
        int i10 = this.zza;
        switch (i10) {
            case -9:
                str = "Migration was cancelled";
                break;
            case -8:
                str = "Another migration is already in progress";
                break;
            case -7:
                str = "Connect message malformed";
                break;
            case -6:
                str = "Migration status mismatch between watch and phone";
                break;
            case -5:
                str = "Phone switching feature disabled";
                break;
            case -4:
                str = "Did not receive connect msg";
                break;
            case -3:
                str = "No bluetooth connection";
                break;
            case -2:
                str = "Accounts mismatch";
                break;
            case -1:
                str = "Unknown failure";
                break;
            case 0:
                str = "Connected";
                break;
            case 1:
                str = "Connection handshake in progress";
                break;
            case 2:
                str = "Connection handshake complete";
                break;
            case 3:
                str = "Sync with old node suspended";
                break;
            case 4:
                str = "Control plane transport connected";
                break;
            case 5:
                str = "Accounts Matched";
                break;
            case 6:
                str = "Association to watch terminated";
                break;
            default:
                str = "Unrecognized state value: " + i10;
                break;
        }
        return String.format("ConnectionStateEvent: address: %s, state: %s", this.zzb, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
