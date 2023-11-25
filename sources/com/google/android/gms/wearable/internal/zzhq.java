package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
@SafeParcelable.Class(creator = "RemoveListenerRequestCreator")
/* loaded from: classes3.dex */
public final class zzhq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhq> CREATOR = new zzhr();
    @SafeParcelable.VersionField(id = 1)
    final int zza;
    @SafeParcelable.Field(getter = "getListenerAsBinder", id = 2, type = "android.os.IBinder")
    public final zzfs zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzhq(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) IBinder iBinder) {
        this.zza = i10;
        if (iBinder == null) {
            this.zzb = null;
            return;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
        this.zzb = queryLocalInterface instanceof zzfs ? (zzfs) queryLocalInterface : new zzfq(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        zzfs zzfsVar = this.zzb;
        if (zzfsVar == null) {
            asBinder = null;
        } else {
            asBinder = zzfsVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, asBinder, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzhq(zzfs zzfsVar) {
        this.zza = 1;
        this.zzb = zzfsVar;
    }
}
