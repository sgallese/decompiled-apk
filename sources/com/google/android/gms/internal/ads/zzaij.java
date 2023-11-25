package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaij implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzaii
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i10 = zzabh.zza;
            return new zzabb[]{new zzaij(0)};
        }
    };
    private final zzaik zzb;
    private final zzfb zzc;
    private final zzfb zzd;
    private final zzfa zze;
    private zzabe zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzaij() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        zzdy.zzb(this.zzf);
        int zza2 = zzabcVar.zza(this.zzc.zzI(), 0, RecyclerView.m.FLAG_MOVED);
        if (!this.zzj) {
            this.zzf.zzN(new zzabz(-9223372036854775807L, 0L));
            this.zzj = true;
        }
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzG(0);
        this.zzc.zzF(zza2);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzf = zzabeVar;
        this.zzb.zzb(zzabeVar, new zzaka(RecyclerView.UNDEFINED_DURATION, 0, 1));
        zzabeVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j10, long j11) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        int i10 = 0;
        while (true) {
            zzaar zzaarVar = (zzaar) zzabcVar;
            zzaarVar.zzm(this.zzd.zzI(), 0, 10, false);
            this.zzd.zzG(0);
            if (this.zzd.zzn() != 4801587) {
                break;
            }
            this.zzd.zzH(3);
            int zzk = this.zzd.zzk();
            i10 += zzk + 10;
            zzaarVar.zzl(zzk, false);
        }
        zzabcVar.zzj();
        zzaar zzaarVar2 = (zzaar) zzabcVar;
        zzaarVar2.zzl(i10, false);
        if (this.zzh == -1) {
            this.zzh = i10;
        }
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        do {
            zzaarVar2.zzm(this.zzd.zzI(), 0, 2, false);
            this.zzd.zzG(0);
            if (!zzaik.zzf(this.zzd.zzp())) {
                i11++;
                zzabcVar.zzj();
                zzaarVar2.zzl(i11, false);
            } else {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                zzaarVar2.zzm(this.zzd.zzI(), 0, 4, false);
                this.zze.zzj(14);
                int zzd = this.zze.zzd(13);
                if (zzd <= 6) {
                    i11++;
                    zzabcVar.zzj();
                    zzaarVar2.zzl(i11, false);
                } else {
                    zzaarVar2.zzl(zzd - 6, false);
                    i13 += zzd;
                }
            }
            i12 = 0;
            i13 = 0;
        } while (i11 - i10 < 8192);
        return false;
    }

    public zzaij(int i10) {
        this.zzb = new zzaik(true, null);
        this.zzc = new zzfb((int) RecyclerView.m.FLAG_MOVED);
        this.zzh = -1L;
        zzfb zzfbVar = new zzfb(10);
        this.zzd = zzfbVar;
        byte[] zzI = zzfbVar.zzI();
        this.zze = new zzfa(zzI, zzI.length);
    }
}
