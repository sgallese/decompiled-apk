package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzds implements zzdr {
    protected zzdp zzb;
    protected zzdp zzc;
    private zzdp zzd;
    private zzdp zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzds() {
        ByteBuffer byteBuffer = zzdr.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzdp zzdpVar = zzdp.zza;
        this.zzd = zzdpVar;
        this.zze = zzdpVar;
        this.zzb = zzdpVar;
        this.zzc = zzdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final zzdp zza(zzdp zzdpVar) throws zzdq {
        this.zzd = zzdpVar;
        this.zze = zzi(zzdpVar);
        if (zzg()) {
            return this.zze;
        }
        return zzdp.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzdr.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zzc() {
        this.zzg = zzdr.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zzf() {
        zzc();
        this.zzf = zzdr.zza;
        zzdp zzdpVar = zzdp.zza;
        this.zzd = zzdpVar;
        this.zze = zzdpVar;
        this.zzb = zzdpVar;
        this.zzc = zzdpVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public boolean zzg() {
        if (this.zze != zzdp.zza) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public boolean zzh() {
        if (this.zzh && this.zzg == zzdr.zza) {
            return true;
        }
        return false;
    }

    protected zzdp zzi(zzdp zzdpVar) throws zzdq {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer zzj(int i10) {
        if (this.zzf.capacity() < i10) {
            this.zzf = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }

    protected void zzk() {
    }

    protected void zzl() {
    }

    protected void zzm() {
    }
}
