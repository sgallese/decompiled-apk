package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.wearable.DataApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzda implements PendingResultUtil.ResultConverter {
    public static final /* synthetic */ zzda zza = new zzda();

    private /* synthetic */ zzda() {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final Object convert(Result result) {
        return ((DataApi.DataItemResult) result).getDataItem();
    }
}
