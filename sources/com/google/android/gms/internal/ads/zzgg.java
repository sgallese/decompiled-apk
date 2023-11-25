package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgg extends zzgc {
    private zzgn zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzgg() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zzd;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        byte[] bArr2 = this.zzb;
        int i13 = zzfk.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i10, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgnVar) throws IOException {
        zzi(zzgnVar);
        this.zza = zzgnVar;
        Uri normalizeScheme = zzgnVar.zza.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        zzdy.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i10 = zzfk.zza;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.zzb = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw zzcd.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e10);
                }
            } else {
                this.zzb = URLDecoder.decode(str, zzfqu.zza.name()).getBytes(zzfqu.zzc);
            }
            long j10 = zzgnVar.zzf;
            int length = this.zzb.length;
            if (j10 <= length) {
                int i11 = (int) j10;
                this.zzc = i11;
                int i12 = length - i11;
                this.zzd = i12;
                long j11 = zzgnVar.zzg;
                if (j11 != -1) {
                    this.zzd = (int) Math.min(i12, j11);
                }
                zzj(zzgnVar);
                long j12 = zzgnVar.zzg;
                if (j12 != -1) {
                    return j12;
                }
                return this.zzd;
            }
            this.zzb = null;
            throw new zzgj(2008);
        }
        throw zzcd.zzb("Unexpected URI format: ".concat(String.valueOf(normalizeScheme)), null);
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        zzgn zzgnVar = this.zza;
        if (zzgnVar != null) {
            return zzgnVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
