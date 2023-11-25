package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzdq extends DataBufferRef implements DataItem {
    private final int zza;

    public zzdq(DataHolder dataHolder, int i10, int i11) {
        super(dataHolder, i10);
        this.zza = i11;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ DataItem freeze() {
        return new zzdn(this);
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final Map<String, DataItemAsset> getAssets() {
        HashMap hashMap = new HashMap(this.zza);
        for (int i10 = 0; i10 < this.zza; i10++) {
            zzdm zzdmVar = new zzdm(this.mDataHolder, this.mDataRow + i10);
            if (zzdmVar.getString("asset_key") != null) {
                hashMap.put(zzdmVar.getString("asset_key"), zzdmVar);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final byte[] getData() {
        return getByteArray("data");
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final Uri getUri() {
        return Uri.parse(getString("path"));
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final DataItem setData(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        Object valueOf;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        byte[] byteArray = getByteArray("data");
        Map<String, DataItemAsset> assets = getAssets();
        StringBuilder sb2 = new StringBuilder("DataItemRef{ ");
        sb2.append("uri=".concat(String.valueOf(getUri())));
        if (byteArray == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(byteArray.length);
        }
        sb2.append(", dataSz=".concat(valueOf.toString()));
        sb2.append(", numAssets=" + assets.size());
        if (isLoggable && !assets.isEmpty()) {
            sb2.append(", assets=[");
            String str = "";
            for (Map.Entry<String, DataItemAsset> entry : assets.entrySet()) {
                sb2.append(str + entry.getKey() + ": " + entry.getValue().getId());
                str = ", ";
            }
            sb2.append("]");
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
