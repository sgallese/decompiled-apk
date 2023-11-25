package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.Channel;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzbs implements Channel.GetInputStreamResult {
    private final Status zza;
    private final InputStream zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbs(Status status, InputStream inputStream) {
        this.zza = (Status) Preconditions.checkNotNull(status);
        this.zzb = inputStream;
    }

    @Override // com.google.android.gms.wearable.Channel.GetInputStreamResult
    public final InputStream getInputStream() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
        InputStream inputStream = this.zzb;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
