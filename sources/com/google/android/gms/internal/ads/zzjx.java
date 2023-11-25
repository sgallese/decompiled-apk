package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzjx implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzzw, zzoy, zzvv, zzss, zzia, zzhw, zzim {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzkb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzjx(zzkb zzkbVar, zzjw zzjwVar) {
        this.zza = zzkbVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzkb.zzP(this.zza, surfaceTexture);
        zzkb.zzN(this.zza, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzkb.zzQ(this.zza, null);
        zzkb.zzN(this.zza, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzkb.zzN(this.zza, i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        zzkb.zzN(this.zza, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        zzkb.zzN(this.zza, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzim
    public final void zza(boolean z10) {
        zzkb.zzS(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzb(Exception exc) {
        zzkb.zzF(this.zza).zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzc(String str, long j10, long j11) {
        zzkb.zzF(this.zza).zzw(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzd(String str) {
        zzkb.zzF(this.zza).zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zze(zzid zzidVar) {
        zzkb.zzF(this.zza).zzy(zzidVar);
        zzkb.zzI(this.zza, null);
        zzkb.zzH(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzf(zzid zzidVar) {
        zzkb.zzH(this.zza, zzidVar);
        zzkb.zzF(this.zza).zzz(zzidVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzg(zzam zzamVar, zzie zzieVar) {
        zzkb.zzI(this.zza, zzamVar);
        zzkb.zzF(this.zza).zzA(zzamVar, zzieVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzh(long j10) {
        zzkb.zzF(this.zza).zzB(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzi(Exception exc) {
        zzkb.zzF(this.zza).zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzj(int i10, long j10, long j11) {
        zzkb.zzF(this.zza).zzD(i10, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzk(int i10, long j10) {
        zzkb.zzF(this.zza).zzE(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzl(Object obj, long j10) {
        zzkb.zzF(this.zza).zzF(obj, j10);
        zzkb zzkbVar = this.zza;
        if (zzkb.zzG(zzkbVar) == obj) {
            zzep zzD = zzkb.zzD(zzkbVar);
            zzD.zzd(26, new zzem() { // from class: com.google.android.gms.internal.ads.zzjt
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj2) {
                    zzcm zzcmVar = (zzcm) obj2;
                }
            });
            zzD.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzm(final boolean z10) {
        zzkb zzkbVar = this.zza;
        if (zzkb.zzW(zzkbVar) == z10) {
            return;
        }
        zzkb.zzJ(zzkbVar, z10);
        zzep zzD = zzkb.zzD(this.zza);
        zzD.zzd(23, new zzem() { // from class: com.google.android.gms.internal.ads.zzju
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                ((zzcm) obj).zzn(z10);
            }
        });
        zzD.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzn(Exception exc) {
        zzkb.zzF(this.zza).zzG(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzo(String str, long j10, long j11) {
        zzkb.zzF(this.zza).zzH(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzp(String str) {
        zzkb.zzF(this.zza).zzI(str);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzq(zzid zzidVar) {
        zzkb.zzF(this.zza).zzJ(zzidVar);
        zzkb.zzL(this.zza, null);
        zzkb.zzK(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzr(zzid zzidVar) {
        zzkb.zzK(this.zza, zzidVar);
        zzkb.zzF(this.zza).zzK(zzidVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzs(long j10, int i10) {
        zzkb.zzF(this.zza).zzL(j10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzt(zzam zzamVar, zzie zzieVar) {
        zzkb.zzL(this.zza, zzamVar);
        zzkb.zzF(this.zza).zzM(zzamVar, zzieVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzu(final zzdn zzdnVar) {
        zzkb.zzM(this.zza, zzdnVar);
        zzep zzD = zzkb.zzD(this.zza);
        zzD.zzd(25, new zzem() { // from class: com.google.android.gms.internal.ads.zzjv
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                ((zzcm) obj).zzr(zzdn.this);
            }
        });
        zzD.zzc();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
