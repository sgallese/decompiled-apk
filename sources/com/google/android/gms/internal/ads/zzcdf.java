package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcdf {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzane zzaneVar;
        zzand zzandVar;
        long j10 = this.zza;
        if (j10 > 0) {
            return j10;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new zzamz(new zzcde(duplicate), zzcdh.zzb).zze().iterator();
            while (true) {
                zzaneVar = null;
                if (it.hasNext()) {
                    zzanb zzanbVar = (zzanb) it.next();
                    if (zzanbVar instanceof zzand) {
                        zzandVar = (zzand) zzanbVar;
                        break;
                    }
                } else {
                    zzandVar = null;
                    break;
                }
            }
            Iterator it2 = zzandVar.zze().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzanb zzanbVar2 = (zzanb) it2.next();
                if (zzanbVar2 instanceof zzane) {
                    zzaneVar = (zzane) zzanbVar2;
                    break;
                }
            }
            long zzd = (zzaneVar.zzd() * 1000) / zzaneVar.zze();
            this.zza = zzd;
            return zzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
