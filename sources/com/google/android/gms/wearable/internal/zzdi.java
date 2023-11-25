package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzdi implements DataEvent {
    private final int zza;
    private final DataItem zzb;

    public zzdi(DataEvent dataEvent) {
        this.zza = dataEvent.getType();
        this.zzb = new zzdn(dataEvent.getDataItem());
    }

    @Override // com.google.android.gms.wearable.DataEvent
    public final DataItem getDataItem() {
        return this.zzb;
    }

    @Override // com.google.android.gms.wearable.DataEvent
    public final int getType() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final String toString() {
        String str;
        int i10 = this.zza;
        if (i10 == 1) {
            str = "changed";
        } else if (i10 == 2) {
            str = "deleted";
        } else {
            str = "unknown";
        }
        return "DataEventEntity{ type=" + str + ", dataitem=" + this.zzb.toString() + " }";
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ DataEvent freeze() {
        return this;
    }
}
