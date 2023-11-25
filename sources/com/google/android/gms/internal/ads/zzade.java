package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzade extends zzadj {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzade(zzace zzaceVar) {
        super(zzaceVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadj
    protected final boolean zza(zzfb zzfbVar) throws zzadi {
        String str;
        if (!this.zzc) {
            int zzl = zzfbVar.zzl();
            int i10 = zzl >> 4;
            this.zze = i10;
            if (i10 == 2) {
                int i11 = zzb[(zzl >> 2) & 3];
                zzak zzakVar = new zzak();
                zzakVar.zzS("audio/mpeg");
                zzakVar.zzw(1);
                zzakVar.zzT(i11);
                this.zza.zzk(zzakVar.zzY());
                this.zzd = true;
            } else if (i10 != 7 && i10 != 8) {
                if (i10 != 10) {
                    throw new zzadi("Audio format not supported: " + i10);
                }
            } else {
                zzak zzakVar2 = new zzak();
                if (i10 == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                zzakVar2.zzS(str);
                zzakVar2.zzw(1);
                zzakVar2.zzT(8000);
                this.zza.zzk(zzakVar2.zzY());
                this.zzd = true;
            }
            this.zzc = true;
        } else {
            zzfbVar.zzH(1);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadj
    protected final boolean zzb(zzfb zzfbVar, long j10) throws zzcd {
        if (this.zze == 2) {
            int zza = zzfbVar.zza();
            this.zza.zzq(zzfbVar, zza);
            this.zza.zzs(j10, 1, zza, 0, null);
            return true;
        }
        int zzl = zzfbVar.zzl();
        if (zzl == 0 && !this.zzd) {
            int zza2 = zzfbVar.zza();
            byte[] bArr = new byte[zza2];
            zzfbVar.zzC(bArr, 0, zza2);
            zzzy zza3 = zzzz.zza(bArr);
            zzak zzakVar = new zzak();
            zzakVar.zzS("audio/mp4a-latm");
            zzakVar.zzx(zza3.zzc);
            zzakVar.zzw(zza3.zzb);
            zzakVar.zzT(zza3.zza);
            zzakVar.zzI(Collections.singletonList(bArr));
            this.zza.zzk(zzakVar.zzY());
            this.zzd = true;
            return false;
        } else if (this.zze == 10 && zzl != 1) {
            return false;
        } else {
            int zza4 = zzfbVar.zza();
            this.zza.zzq(zzfbVar, zza4);
            this.zza.zzs(j10, 1, zza4, 0, null);
            return true;
        }
    }
}
