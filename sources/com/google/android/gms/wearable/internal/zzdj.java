package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzdj extends DataBufferRef implements DataEvent {
    private final int zza;

    public zzdj(DataHolder dataHolder, int i10, int i11) {
        super(dataHolder, i10);
        this.zza = i11;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ DataEvent freeze() {
        return new zzdi(this);
    }

    @Override // com.google.android.gms.wearable.DataEvent
    public final DataItem getDataItem() {
        return new zzdq(this.mDataHolder, this.mDataRow, this.zza);
    }

    @Override // com.google.android.gms.wearable.DataEvent
    public final int getType() {
        return getInteger("event_type");
    }

    public final String toString() {
        String str;
        if (getInteger("event_type") == 1) {
            str = "changed";
        } else if (getInteger("event_type") == 2) {
            str = "deleted";
        } else {
            str = "unknown";
        }
        return "DataEventRef{ type=" + str + ", dataitem=" + getDataItem().toString() + " }";
    }
}
