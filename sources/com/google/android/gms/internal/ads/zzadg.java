package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.recyclerview.widget.m;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzadg implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzadf
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i10 = zzabh.zza;
            return new zzabb[]{new zzadg()};
        }
    };
    private zzabe zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzade zzp;
    private zzadk zzq;
    private final zzfb zzb = new zzfb(4);
    private final zzfb zzc = new zzfb(9);
    private final zzfb zzd = new zzfb(11);
    private final zzfb zze = new zzfb();
    private final zzadh zzf = new zzadh();
    private int zzh = 1;

    private final zzfb zze(zzabc zzabcVar) throws IOException {
        if (this.zzm > this.zze.zzb()) {
            zzfb zzfbVar = this.zze;
            int zzb = zzfbVar.zzb();
            zzfbVar.zzE(new byte[Math.max(zzb + zzb, this.zzm)], 0);
        } else {
            this.zze.zzG(0);
        }
        this.zze.zzF(this.zzm);
        ((zzaar) zzabcVar).zzn(this.zze.zzI(), 0, this.zzm, false);
        return this.zze;
    }

    private final void zzf() {
        if (!this.zzo) {
            this.zzg.zzN(new zzabz(-9223372036854775807L, 0L));
            this.zzo = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzabb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(com.google.android.gms.internal.ads.zzabc r17, com.google.android.gms.internal.ads.zzabx r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadg.zza(com.google.android.gms.internal.ads.zzabc, com.google.android.gms.internal.ads.zzabx):int");
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzg = zzabeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j10, long j11) {
        if (j10 == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        zzaar zzaarVar = (zzaar) zzabcVar;
        zzaarVar.zzm(this.zzb.zzI(), 0, 3, false);
        this.zzb.zzG(0);
        if (this.zzb.zzn() != 4607062) {
            return false;
        }
        zzaarVar.zzm(this.zzb.zzI(), 0, 2, false);
        this.zzb.zzG(0);
        if ((this.zzb.zzp() & m.e.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        zzaarVar.zzm(this.zzb.zzI(), 0, 4, false);
        this.zzb.zzG(0);
        int zzf = this.zzb.zzf();
        zzabcVar.zzj();
        zzaar zzaarVar2 = (zzaar) zzabcVar;
        zzaarVar2.zzl(zzf, false);
        zzaarVar2.zzm(this.zzb.zzI(), 0, 4, false);
        this.zzb.zzG(0);
        if (this.zzb.zzf() != 0) {
            return false;
        }
        return true;
    }
}
