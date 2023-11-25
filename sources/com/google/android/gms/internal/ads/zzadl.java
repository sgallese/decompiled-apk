package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzadl implements zzabb {
    private zzabe zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzaff zzg;
    private zzabc zzh;
    private zzado zzi;
    private zzahc zzj;
    private final zzfb zza = new zzfb(6);
    private long zzf = -1;

    private final int zze(zzabc zzabcVar) throws IOException {
        this.zza.zzD(2);
        ((zzaar) zzabcVar).zzm(this.zza.zzI(), 0, 2, false);
        return this.zza.zzp();
    }

    private final void zzf() {
        zzg(new zzby[0]);
        zzabe zzabeVar = this.zzb;
        zzabeVar.getClass();
        zzabeVar.zzC();
        this.zzb.zzN(new zzabz(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    private final void zzg(zzby... zzbyVarArr) {
        zzabe zzabeVar = this.zzb;
        zzabeVar.getClass();
        zzace zzv = zzabeVar.zzv(UserVerificationMethods.USER_VERIFY_ALL, 4);
        zzak zzakVar = new zzak();
        zzakVar.zzz("image/jpeg");
        zzakVar.zzM(new zzbz(-9223372036854775807L, zzbyVarArr));
        zzv.zzk(zzakVar.zzY());
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x015d  */
    @Override // com.google.android.gms.internal.ads.zzabb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(com.google.android.gms.internal.ads.zzabc r24, com.google.android.gms.internal.ads.zzabx r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadl.zza(com.google.android.gms.internal.ads.zzabc, com.google.android.gms.internal.ads.zzabx):int");
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzb = zzabeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j10, long j11) {
        if (j10 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzahc zzahcVar = this.zzj;
            zzahcVar.getClass();
            zzahcVar.zzc(j10, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        if (zze(zzabcVar) != 65496) {
            return false;
        }
        int zze = zze(zzabcVar);
        this.zzd = zze;
        if (zze == 65504) {
            this.zza.zzD(2);
            zzaar zzaarVar = (zzaar) zzabcVar;
            zzaarVar.zzm(this.zza.zzI(), 0, 2, false);
            zzaarVar.zzl(this.zza.zzp() - 2, false);
            zze = zze(zzabcVar);
            this.zzd = zze;
        }
        if (zze == 65505) {
            zzaar zzaarVar2 = (zzaar) zzabcVar;
            zzaarVar2.zzl(2, false);
            this.zza.zzD(6);
            zzaarVar2.zzm(this.zza.zzI(), 0, 6, false);
            if (this.zza.zzt() == 1165519206 && this.zza.zzp() == 0) {
                return true;
            }
        }
        return false;
    }
}
