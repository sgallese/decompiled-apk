package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.wearable.zzbu;
import com.google.android.gms.internal.wearable.zzcq;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public class DataMapItem {
    private final Uri zza;
    private final DataMap zzb;

    private DataMapItem(DataItem dataItem) {
        DataMap zza;
        this.zza = dataItem.getUri();
        DataItem freeze = dataItem.freeze();
        byte[] data = freeze.getData();
        if (data == null && !freeze.getAssets().isEmpty()) {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        }
        if (data == null) {
            zza = new DataMap();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                int size = freeze.getAssets().size();
                for (int i10 = 0; i10 < size; i10++) {
                    DataItemAsset dataItemAsset = freeze.getAssets().get(Integer.toString(i10));
                    if (dataItemAsset != null) {
                        arrayList.add(Asset.createFromRef(dataItemAsset.getId()));
                    } else {
                        throw new IllegalStateException("Cannot find DataItemAsset referenced in data at " + i10 + " for " + freeze.toString());
                    }
                }
                zza = com.google.android.gms.internal.wearable.zzl.zza(new com.google.android.gms.internal.wearable.zzk(com.google.android.gms.internal.wearable.zzx.zzd(data, zzbu.zza()), arrayList));
            } catch (zzcq | NullPointerException e10) {
                Log.w("DataItem", "Unable to parse datamap from dataItem. uri=" + String.valueOf(freeze.getUri()) + ", data=" + Base64.encodeToString(data, 0));
                throw new IllegalStateException("Unable to parse datamap from dataItem.  uri=".concat(String.valueOf(freeze.getUri())), e10);
            }
        }
        this.zzb = zza;
    }

    public static DataMapItem fromDataItem(DataItem dataItem) {
        Asserts.checkNotNull(dataItem, "dataItem must not be null");
        return new DataMapItem(dataItem);
    }

    public DataMap getDataMap() {
        return this.zzb;
    }

    public Uri getUri() {
        return this.zza;
    }
}
