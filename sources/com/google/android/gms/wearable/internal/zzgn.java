package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzgn implements Result {
    private final Status zza;
    private final byte[] zzb;

    public zzgn(Status status, int i10, byte[] bArr) {
        this.zza = status;
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    public final byte[] zza() {
        return this.zzb;
    }
}
