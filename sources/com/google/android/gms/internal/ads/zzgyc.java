package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzgyc extends zzgya {
    private int zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzgyc(String str) {
        super("mvhd");
    }

    public final int zzh() {
        if (!this.zzc) {
            zzg();
        }
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzi(ByteBuffer byteBuffer) {
        this.zza = zzana.zzc(byteBuffer.get());
        zzana.zzd(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
