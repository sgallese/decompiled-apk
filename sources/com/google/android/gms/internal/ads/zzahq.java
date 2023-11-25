package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzahq implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzahp
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i10 = zzabh.zza;
            return new zzabb[]{new zzahq()};
        }
    };
    private zzabe zzb;
    private zzahy zzc;
    private boolean zzd;

    private final boolean zze(zzabc zzabcVar) throws IOException {
        zzahs zzahsVar = new zzahs();
        if (zzahsVar.zzb(zzabcVar, true) && (zzahsVar.zza & 2) == 2) {
            int min = Math.min(zzahsVar.zze, 8);
            zzfb zzfbVar = new zzfb(min);
            ((zzaar) zzabcVar).zzm(zzfbVar.zzI(), 0, min, false);
            zzfbVar.zzG(0);
            if (zzfbVar.zza() >= 5 && zzfbVar.zzl() == 127 && zzfbVar.zzt() == 1179402563) {
                this.zzc = new zzaho();
            } else {
                zzfbVar.zzG(0);
                try {
                    if (zzack.zzd(1, zzfbVar, true)) {
                        this.zzc = new zzaia();
                    }
                } catch (zzcd unused) {
                }
                zzfbVar.zzG(0);
                if (zzahu.zzd(zzfbVar)) {
                    this.zzc = new zzahu();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        zzdy.zzb(this.zzb);
        if (this.zzc == null) {
            if (zze(zzabcVar)) {
                zzabcVar.zzj();
            } else {
                throw zzcd.zza("Failed to determine bitstream type", null);
            }
        }
        if (!this.zzd) {
            zzace zzv = this.zzb.zzv(0, 1);
            this.zzb.zzC();
            this.zzc.zzh(this.zzb, zzv);
            this.zzd = true;
        }
        return this.zzc.zze(zzabcVar, zzabxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzb = zzabeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j10, long j11) {
        zzahy zzahyVar = this.zzc;
        if (zzahyVar != null) {
            zzahyVar.zzj(j10, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        try {
            return zze(zzabcVar);
        } catch (zzcd unused) {
            return false;
        }
    }
}
