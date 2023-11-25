package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzqk extends zzsa implements zzkp {
    private final Context zzb;
    private final zzox zzc;
    private final zzpe zzd;
    private int zze;
    private boolean zzf;
    private zzam zzg;
    private zzam zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private zzlm zzm;

    public zzqk(Context context, zzrs zzrsVar, zzsc zzscVar, boolean z10, Handler handler, zzoy zzoyVar, zzpe zzpeVar) {
        super(1, zzrsVar, zzscVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzpeVar;
        this.zzc = new zzox(handler, zzoyVar);
        zzpeVar.zzp(new zzqj(this, null));
    }

    private final int zzaF(zzrw zzrwVar, zzam zzamVar) {
        int i10;
        if ("OMX.google.raw.decoder".equals(zzrwVar.zza) && (i10 = zzfk.zza) < 24 && (i10 != 23 || !zzfk.zzF(this.zzb))) {
            return -1;
        }
        return zzamVar.zzn;
    }

    private static List zzaG(zzsc zzscVar, zzam zzamVar, boolean z10, zzpe zzpeVar) throws zzsj {
        zzrw zzd;
        if (zzamVar.zzm == null) {
            return zzfud.zzl();
        }
        if (zzpeVar.zzy(zzamVar) && (zzd = zzsp.zzd()) != null) {
            return zzfud.zzm(zzd);
        }
        return zzsp.zzh(zzscVar, zzamVar, false, false);
    }

    private final void zzaH() {
        long zzb = this.zzd.zzb(zzS());
        if (zzb != Long.MIN_VALUE) {
            if (!this.zzk) {
                zzb = Math.max(this.zzi, zzb);
            }
            this.zzi = zzb;
            this.zzk = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected final void zzA() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected final void zzB() {
        zzaH();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzln, com.google.android.gms.internal.ads.zzlp
    public final String zzQ() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzln
    public final boolean zzS() {
        if (super.zzS() && this.zzd.zzx()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzln
    public final boolean zzT() {
        if (!this.zzd.zzw() && !super.zzT()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final float zzV(float f10, zzam zzamVar, zzam[] zzamVarArr) {
        int i10 = -1;
        for (zzam zzamVar2 : zzamVarArr) {
            int i11 = zzamVar2.zzA;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return i10 * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final int zzW(zzsc zzscVar, zzam zzamVar) throws zzsj {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15 = 128;
        if (!zzcc.zzf(zzamVar.zzm)) {
            return 128;
        }
        if (zzfk.zza >= 21) {
            i10 = 32;
        } else {
            i10 = 0;
        }
        int i16 = zzamVar.zzF;
        boolean zzaE = zzsa.zzaE(zzamVar);
        if (zzaE && (i16 == 0 || zzsp.zzd() != null)) {
            zzom zzd = this.zzd.zzd(zzamVar);
            if (!zzd.zzb) {
                i11 = 0;
            } else {
                if (true != zzd.zzc) {
                    i11 = 512;
                } else {
                    i11 = 1536;
                }
                if (zzd.zzd) {
                    i11 |= RecyclerView.m.FLAG_MOVED;
                }
            }
            if (this.zzd.zzy(zzamVar)) {
                i14 = i10 | 140;
                return i14 | i11;
            }
        } else {
            i11 = 0;
        }
        if (("audio/raw".equals(zzamVar.zzm) && !this.zzd.zzy(zzamVar)) || !this.zzd.zzy(zzfk.zzw(2, zzamVar.zzz, zzamVar.zzA))) {
            return 129;
        }
        List zzaG = zzaG(zzscVar, zzamVar, false, this.zzd);
        if (zzaG.isEmpty()) {
            return 129;
        }
        if (!zzaE) {
            return 130;
        }
        zzrw zzrwVar = (zzrw) zzaG.get(0);
        boolean zze = zzrwVar.zze(zzamVar);
        if (!zze) {
            for (int i17 = 1; i17 < zzaG.size(); i17++) {
                zzrw zzrwVar2 = (zzrw) zzaG.get(i17);
                if (zzrwVar2.zze(zzamVar)) {
                    zzrwVar = zzrwVar2;
                    z10 = false;
                    zze = true;
                    break;
                }
            }
        }
        z10 = true;
        if (true != zze) {
            i12 = 3;
        } else {
            i12 = 4;
        }
        int i18 = 8;
        if (zze && zzrwVar.zzf(zzamVar)) {
            i18 = 16;
        }
        if (true != zzrwVar.zzg) {
            i13 = 0;
        } else {
            i13 = 64;
        }
        if (true != z10) {
            i15 = 0;
        }
        i14 = i12 | i18 | i10 | i13 | i15;
        return i14 | i11;
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final zzie zzX(zzrw zzrwVar, zzam zzamVar, zzam zzamVar2) {
        int i10;
        int i11;
        zzie zzb = zzrwVar.zzb(zzamVar, zzamVar2);
        int i12 = zzb.zze;
        if (zzaC(zzamVar2)) {
            i12 |= 32768;
        }
        if (zzaF(zzrwVar, zzamVar2) > this.zze) {
            i12 |= 64;
        }
        String str = zzrwVar.zza;
        if (i12 != 0) {
            i11 = i12;
            i10 = 0;
        } else {
            i10 = zzb.zzd;
            i11 = 0;
        }
        return new zzie(str, zzamVar, zzamVar2, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsa
    public final zzie zzY(zzkn zzknVar) throws zzil {
        zzam zzamVar = zzknVar.zza;
        zzamVar.getClass();
        this.zzg = zzamVar;
        zzie zzY = super.zzY(zzknVar);
        this.zzc.zzg(this.zzg, zzY);
        return zzY;
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final long zza() {
        if (zzbc() == 2) {
            zzaH();
        }
        return this.zzi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x00a8, code lost:
    
        if ("AXON 7 mini".equals(r10) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008b  */
    @Override // com.google.android.gms.internal.ads.zzsa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.google.android.gms.internal.ads.zzrr zzab(com.google.android.gms.internal.ads.zzrw r8, com.google.android.gms.internal.ads.zzam r9, android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqk.zzab(com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzam, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzrr");
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final List zzac(zzsc zzscVar, zzam zzamVar, boolean z10) throws zzsj {
        return zzsp.zzi(zzaG(zzscVar, zzamVar, false, this.zzd), zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzad(Exception exc) {
        zzes.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzae(String str, zzrr zzrrVar, long j10, long j11) {
        this.zzc.zzc(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzaf(String str) {
        this.zzc.zzd(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzag(zzam zzamVar, MediaFormat mediaFormat) throws zzil {
        int i10;
        int i11;
        boolean z10;
        zzam zzamVar2 = this.zzh;
        int[] iArr = null;
        if (zzamVar2 != null) {
            zzamVar = zzamVar2;
        } else if (zzaq() != null) {
            if ("audio/raw".equals(zzamVar.zzm)) {
                i10 = zzamVar.zzB;
            } else if (zzfk.zza >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = zzfk.zzk(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i10 = 2;
            }
            zzak zzakVar = new zzak();
            zzakVar.zzS("audio/raw");
            zzakVar.zzN(i10);
            zzakVar.zzC(zzamVar.zzC);
            zzakVar.zzD(zzamVar.zzD);
            zzakVar.zzw(mediaFormat.getInteger("channel-count"));
            zzakVar.zzT(mediaFormat.getInteger("sample-rate"));
            zzam zzY = zzakVar.zzY();
            if (this.zzf && zzY.zzz == 6 && (i11 = zzamVar.zzz) < 6) {
                iArr = new int[i11];
                for (int i12 = 0; i12 < zzamVar.zzz; i12++) {
                    iArr[i12] = i12;
                }
            }
            zzamVar = zzY;
        }
        try {
            int i13 = zzfk.zza;
            if (i13 >= 29) {
                if (zzaB()) {
                    zzm();
                }
                if (i13 >= 29) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzdy.zzf(z10);
            }
            this.zzd.zze(zzamVar, 0, iArr);
        } catch (zzoz e10) {
            throw zzi(e10, e10.zza, false, 5001);
        }
    }

    public final void zzah() {
        this.zzk = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsa
    public final void zzai(long j10) {
        super.zzai(j10);
        this.zzj = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzaj() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzak(zzht zzhtVar) {
        if (this.zzj && !zzhtVar.zzf()) {
            if (Math.abs(zzhtVar.zzd - this.zzi) > 500000) {
                this.zzi = zzhtVar.zzd;
            }
            this.zzj = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzal() throws zzil {
        try {
            this.zzd.zzj();
        } catch (zzpd e10) {
            throw zzi(e10, e10.zzc, e10.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final boolean zzam(long j10, long j11, zzrt zzrtVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzam zzamVar) throws zzil {
        byteBuffer.getClass();
        if (this.zzh != null && (i11 & 2) != 0) {
            zzrtVar.getClass();
            zzrtVar.zzn(i10, false);
            return true;
        } else if (z10) {
            if (zzrtVar != null) {
                zzrtVar.zzn(i10, false);
            }
            ((zzsa) this).zza.zzf += i12;
            this.zzd.zzg();
            return true;
        } else {
            try {
                if (!this.zzd.zzv(byteBuffer, j12, i12)) {
                    return false;
                }
                if (zzrtVar != null) {
                    zzrtVar.zzn(i10, false);
                }
                ((zzsa) this).zza.zze += i12;
                return true;
            } catch (zzpa e10) {
                throw zzi(e10, this.zzg, e10.zzb, 5001);
            } catch (zzpd e11) {
                throw zzi(e11, zzamVar, e11.zzb, 5002);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final boolean zzan(zzam zzamVar) {
        zzm();
        return this.zzd.zzy(zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final zzch zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzg(zzch zzchVar) {
        this.zzd.zzq(zzchVar);
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzli
    public final void zzt(int i10, Object obj) throws zzil {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 6) {
                    switch (i10) {
                        case 9:
                            this.zzd.zzt(((Boolean) obj).booleanValue());
                            return;
                        case 10:
                            this.zzd.zzm(((Integer) obj).intValue());
                            return;
                        case 11:
                            this.zzm = (zzlm) obj;
                            return;
                        case 12:
                            if (zzfk.zza >= 23) {
                                zzqh.zza(this.zzd, obj);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                this.zzd.zzn((zzl) obj);
                return;
            }
            this.zzd.zzl((zzk) obj);
            return;
        }
        this.zzd.zzu(((Float) obj).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzic
    public final void zzw() {
        this.zzl = true;
        this.zzg = null;
        try {
            this.zzd.zzf();
            try {
                super.zzw();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzw();
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzic
    public final void zzx(boolean z10, boolean z11) throws zzil {
        super.zzx(z10, z11);
        this.zzc.zzf(((zzsa) this).zza);
        zzm();
        this.zzd.zzr(zzn());
        this.zzd.zzo(zzh());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzic
    public final void zzy(long j10, boolean z10) throws zzil {
        super.zzy(j10, z10);
        this.zzd.zzf();
        this.zzi = j10;
        this.zzj = true;
        this.zzk = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzic
    public final void zzz() {
        try {
            super.zzz();
            if (this.zzl) {
                this.zzl = false;
                this.zzd.zzk();
            }
        } catch (Throwable th) {
            if (this.zzl) {
                this.zzl = false;
                this.zzd.zzk();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzln
    public final zzkp zzk() {
        return this;
    }
}
