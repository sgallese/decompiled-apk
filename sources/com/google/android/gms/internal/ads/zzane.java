package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzane extends zzgyc {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzgym zzm;
    private long zzn;

    public zzane() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzgym.zza;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zza + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + "]";
    }

    public final long zzd() {
        return this.zzj;
    }

    public final long zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzf(ByteBuffer byteBuffer) {
        zzi(byteBuffer);
        if (zzh() == 1) {
            this.zza = zzgyh.zza(zzana.zzf(byteBuffer));
            this.zzh = zzgyh.zza(zzana.zzf(byteBuffer));
            this.zzi = zzana.zze(byteBuffer);
            this.zzj = zzana.zzf(byteBuffer);
        } else {
            this.zza = zzgyh.zza(zzana.zze(byteBuffer));
            this.zzh = zzgyh.zza(zzana.zze(byteBuffer));
            this.zzi = zzana.zze(byteBuffer);
            this.zzj = zzana.zze(byteBuffer);
        }
        this.zzk = zzana.zzb(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzl = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        zzana.zzd(byteBuffer);
        zzana.zze(byteBuffer);
        zzana.zze(byteBuffer);
        this.zzm = new zzgym(zzana.zzb(byteBuffer), zzana.zzb(byteBuffer), zzana.zzb(byteBuffer), zzana.zzb(byteBuffer), zzana.zza(byteBuffer), zzana.zza(byteBuffer), zzana.zza(byteBuffer), zzana.zzb(byteBuffer), zzana.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzana.zze(byteBuffer);
    }
}
