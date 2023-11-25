package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
@ShowFirstParty
@SafeParcelable.Class(creator = "MessageOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class MessageOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MessageOptions> CREATOR = new zzk();
    public static final int MESSAGE_PRIORITY_HIGH = 1;
    public static final int MESSAGE_PRIORITY_LOW = 0;
    @SafeParcelable.Field(getter = "getPriority", id = 2)
    private final int zza;

    @SafeParcelable.Constructor
    public MessageOptions(@SafeParcelable.Param(id = 2) int i10) {
        this.zza = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MessageOptions) || this.zza != ((MessageOptions) obj).zza) {
            return false;
        }
        return true;
    }

    public int getPriority() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza));
    }

    public String toString() {
        return "MessageOptions[ priority=" + this.zza + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getPriority());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
