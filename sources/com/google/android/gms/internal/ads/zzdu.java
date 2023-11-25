package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdu implements zzdr {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzdp zze;
    private zzdp zzf;
    private zzdp zzg;
    private zzdp zzh;
    private boolean zzi;
    private zzdt zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzdu() {
        zzdp zzdpVar = zzdp.zza;
        this.zze = zzdpVar;
        this.zzf = zzdpVar;
        this.zzg = zzdpVar;
        this.zzh = zzdpVar;
        ByteBuffer byteBuffer = zzdr.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final zzdp zza(zzdp zzdpVar) throws zzdq {
        if (zzdpVar.zzd == 2) {
            int i10 = this.zzb;
            if (i10 == -1) {
                i10 = zzdpVar.zzb;
            }
            this.zze = zzdpVar;
            zzdp zzdpVar2 = new zzdp(i10, zzdpVar.zzc, 2);
            this.zzf = zzdpVar2;
            this.zzi = true;
            return zzdpVar2;
        }
        throw new zzdq("Unhandled input format:", zzdpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final ByteBuffer zzb() {
        int zza;
        zzdt zzdtVar = this.zzj;
        if (zzdtVar != null && (zza = zzdtVar.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzdtVar.zzd(this.zzl);
            this.zzo += zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzdr.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zzc() {
        if (zzg()) {
            zzdp zzdpVar = this.zze;
            this.zzg = zzdpVar;
            zzdp zzdpVar2 = this.zzf;
            this.zzh = zzdpVar2;
            if (this.zzi) {
                this.zzj = new zzdt(zzdpVar.zzb, zzdpVar.zzc, this.zzc, this.zzd, zzdpVar2.zzb);
            } else {
                zzdt zzdtVar = this.zzj;
                if (zzdtVar != null) {
                    zzdtVar.zzc();
                }
            }
        }
        this.zzm = zzdr.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zzd() {
        zzdt zzdtVar = this.zzj;
        if (zzdtVar != null) {
            zzdtVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zze(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        zzdt zzdtVar = this.zzj;
        zzdtVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.zzn += remaining;
        zzdtVar.zzf(asShortBuffer);
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzdp zzdpVar = zzdp.zza;
        this.zze = zzdpVar;
        this.zzf = zzdpVar;
        this.zzg = zzdpVar;
        this.zzh = zzdpVar;
        ByteBuffer byteBuffer = zzdr.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final boolean zzg() {
        if (this.zzf.zzb == -1) {
            return false;
        }
        if (Math.abs(this.zzc - 1.0f) < 1.0E-4f && Math.abs(this.zzd - 1.0f) < 1.0E-4f && this.zzf.zzb == this.zze.zzb) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final boolean zzh() {
        if (!this.zzp) {
            return false;
        }
        zzdt zzdtVar = this.zzj;
        if (zzdtVar != null && zzdtVar.zza() != 0) {
            return false;
        }
        return true;
    }

    public final long zzi(long j10) {
        long j11 = this.zzo;
        if (j11 >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            long j12 = this.zzn;
            this.zzj.getClass();
            long zzb = j12 - r3.zzb();
            int i10 = this.zzh.zzb;
            int i11 = this.zzg.zzb;
            if (i10 == i11) {
                return zzfk.zzq(j10, zzb, j11);
            }
            return zzfk.zzq(j10, zzb * i10, j11 * i11);
        }
        return (long) (this.zzc * j10);
    }

    public final void zzj(float f10) {
        if (this.zzd != f10) {
            this.zzd = f10;
            this.zzi = true;
        }
    }

    public final void zzk(float f10) {
        if (this.zzc != f10) {
            this.zzc = f10;
            this.zzi = true;
        }
    }
}
