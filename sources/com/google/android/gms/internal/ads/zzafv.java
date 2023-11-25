package com.google.android.gms.internal.ads;

import java.io.IOException;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzafv {
    private final zzfb zza = new zzfb(8);
    private int zzb;

    private final long zzb(zzabc zzabcVar) throws IOException {
        zzaar zzaarVar = (zzaar) zzabcVar;
        int i10 = 0;
        zzaarVar.zzm(this.zza.zzI(), 0, 1, false);
        int i11 = this.zza.zzI()[0] & 255;
        if (i11 != 0) {
            int i12 = 128;
            int i13 = 0;
            while ((i11 & i12) == 0) {
                i12 >>= 1;
                i13++;
            }
            int i14 = i11 & (~i12);
            zzaarVar.zzm(this.zza.zzI(), 1, i13, false);
            while (i10 < i13) {
                i10++;
                i14 = (this.zza.zzI()[i10] & 255) + (i14 << 8);
            }
            this.zzb += i13 + 1;
            return i14;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzabc zzabcVar) throws IOException {
        long zzd = zzabcVar.zzd();
        long j10 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (zzd != -1 && zzd <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j10 = zzd;
        }
        zzaar zzaarVar = (zzaar) zzabcVar;
        zzaarVar.zzm(this.zza.zzI(), 0, 4, false);
        long zzt = this.zza.zzt();
        this.zzb = 4;
        while (zzt != 440786851) {
            int i10 = (int) j10;
            int i11 = this.zzb + 1;
            this.zzb = i11;
            if (i11 == i10) {
                return false;
            }
            zzaarVar.zzm(this.zza.zzI(), 0, 1, false);
            zzt = ((zzt << 8) & (-256)) | (this.zza.zzI()[0] & 255);
        }
        long zzb = zzb(zzabcVar);
        long j11 = this.zzb;
        if (zzb != Long.MIN_VALUE && (zzd == -1 || j11 + zzb < zzd)) {
            while (true) {
                long j12 = this.zzb;
                long j13 = j11 + zzb;
                if (j12 < j13) {
                    if (zzb(zzabcVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long zzb2 = zzb(zzabcVar);
                    if (zzb2 < 0) {
                        return false;
                    }
                    if (zzb2 != 0) {
                        int i12 = (int) zzb2;
                        zzaarVar.zzl(i12, false);
                        this.zzb += i12;
                    }
                } else if (j12 == j13) {
                    return true;
                }
            }
        }
        return false;
    }
}
