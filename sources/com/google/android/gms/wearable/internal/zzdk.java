package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataItemAsset;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzdk implements DataItemAsset {
    private final String zza;
    private final String zzb;

    public zzdk(DataItemAsset dataItemAsset) {
        this.zza = dataItemAsset.getId();
        this.zzb = dataItemAsset.getDataItemKey();
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public final String getDataItemKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public final String getId() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DataItemAssetEntity[@");
        sb2.append(Integer.toHexString(hashCode()));
        if (this.zza == null) {
            sb2.append(",noid");
        } else {
            sb2.append(",");
            sb2.append(this.zza);
        }
        sb2.append(", key=");
        sb2.append(this.zzb);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ DataItemAsset freeze() {
        return this;
    }
}
