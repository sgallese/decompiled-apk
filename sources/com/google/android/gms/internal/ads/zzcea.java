package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcea extends zzcdu implements zzhk {
    private String zzd;
    private final zzcci zze;
    private boolean zzf;
    private final zzcdz zzg;
    private final zzcdf zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcea(zzccj zzccjVar, zzcci zzcciVar) {
        super(zzccjVar);
        String str;
        int i10;
        this.zze = zzcciVar;
        this.zzg = new zzcdz();
        this.zzh = new zzcdf();
        this.zzk = new Object();
        if (zzccjVar != null) {
            str = zzccjVar.zzbl();
        } else {
            str = null;
        }
        this.zzl = (String) zzfre.zzd(str).zzb("");
        if (zzccjVar != null) {
            i10 = zzccjVar.zzf();
        } else {
            i10 = 0;
        }
        this.zzm = i10;
    }

    protected static final String zzm(String str) {
        return "cache:".concat(String.valueOf(zzbzt.zze(str)));
    }

    private final void zzv() {
        boolean z10;
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round(zza2 * (position / zza));
        int zzs = zzcca.zzs();
        int zzu = zzcca.zzu();
        String str = this.zzd;
        String zzm = zzm(str);
        long j10 = round;
        if (round > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzn(str, zzm, position, zza, j10, zza2, z10, zzs, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzd(zzgi zzgiVar, zzgn zzgnVar, boolean z10) {
        if (zzgiVar instanceof zzgv) {
            this.zzg.zzb((zzgv) zzgiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzf() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final ByteBuffer zzk() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }

    public final boolean zzl() {
        return this.zzn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a7, code lost:
    
        r21.zzn = true;
        zzj(r22, r4, (int) r21.zzh.zza(r21.zzi));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:? -> B:45:0x0142). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcdu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzt(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcea.zzt(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzb(zzgi zzgiVar, zzgn zzgnVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzc(zzgi zzgiVar, zzgn zzgnVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zza(zzgi zzgiVar, zzgn zzgnVar, boolean z10, int i10) {
    }
}
