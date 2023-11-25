package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataClient;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzdg extends DataClient.GetFdForAssetResponse {
    private final DataApi.GetFdForAssetResult zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdg(DataApi.GetFdForAssetResult getFdForAssetResult) {
        this.zza = getFdForAssetResult;
    }

    @Override // com.google.android.gms.wearable.DataClient.GetFdForAssetResponse
    public final ParcelFileDescriptor getFdForAsset() {
        return this.zza.getFd();
    }

    @Override // com.google.android.gms.wearable.DataClient.GetFdForAssetResponse
    public final InputStream getInputStream() {
        return this.zza.getInputStream();
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
        this.zza.release();
    }
}
