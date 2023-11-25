package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfah implements OnAdMetadataChangedListener, zzcxw, zzcwl, zzcwi, zzcwy, zzcyt, zzeys, zzddw {
    private final zzfdj zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzfah(zzfdj zzfdjVar) {
        this.zza = zzfdjVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzeyj.zza(this.zzb, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzfab
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zza() {
        this.zza.zza();
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezt
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbvz) obj).zzg();
            }
        });
        zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezu
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbvj) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzb() {
        zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzfac
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbvj) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        final int i10 = zzeVar.zza;
        zzeyj.zza(this.zzc, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezn
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbwd) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzeyj.zza(this.zzc, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezo
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbwd) obj).zze(i10);
            }
        });
        zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezp
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbvj) obj).zzg(i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzbK() {
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezl
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbvz) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzbw(final zzbvd zzbvdVar, final String str, final String str2) {
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzfad
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                zzbvd zzbvdVar2 = zzbvd.this;
                ((zzbvz) obj).zzk(new zzbwn(zzbvdVar2.zzc(), zzbvdVar2.zzb()));
            }
        });
        zzeyj.zza(this.zzf, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzfae
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                zzbvd zzbvdVar2 = zzbvd.this;
                ((zzbwe) obj).zze(new zzbwn(zzbvdVar2.zzc(), zzbvdVar2.zzb()), str, str2);
            }
        });
        zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzfaf
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbvj) obj).zze(zzbvd.this);
            }
        });
        zzeyj.zza(this.zzg, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzfag
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbve) obj).zze(zzbvd.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzc() {
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezv
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbvz) obj).zzj();
            }
        });
        zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezx
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbvj) obj).zzj();
            }
        });
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezy
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbvz) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zze() {
        zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezs
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbvj) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzf() {
        zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezw
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbvj) obj).zzl();
            }
        });
    }

    public final void zzg(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzeyj.zza(this.zzh, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezm
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzh.set(zzdgVar);
    }

    public final void zzj(zzbvz zzbvzVar) {
        this.zzd.set(zzbvzVar);
    }

    public final void zzk(zzbwd zzbwdVar) {
        this.zzc.set(zzbwdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeys
    public final void zzl(zzeys zzeysVar) {
        throw null;
    }

    @Deprecated
    public final void zzm(zzbvj zzbvjVar) {
        this.zze.set(zzbvjVar);
    }

    @Deprecated
    public final void zzn(zzbve zzbveVar) {
        this.zzg.set(zzbveVar);
    }

    public final void zzo(zzbwe zzbweVar) {
        this.zzf.set(zzbweVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwy
    public final void zzp(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezq
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbvz) obj).zzi(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezr
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbvz) obj).zzh(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        zzeyj.zza(this.zzc, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezz
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbwd) obj).zzg();
            }
        });
        zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzfaa
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbvj) obj).zzi();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzs() {
    }
}
