package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzexc implements zzcwl, zzcyh, zzeys, com.google.android.gms.ads.internal.overlay.zzo, zzcyt, zzcwy, zzddw {
    private final zzfdj zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzexc zzh = null;

    public zzexc(zzfdj zzfdjVar) {
        this.zza = zzfdjVar;
    }

    public static zzexc zzi(zzexc zzexcVar) {
        zzexc zzexcVar2 = new zzexc(zzexcVar.zza);
        zzexcVar2.zzh = zzexcVar;
        return zzexcVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzbF(zzeVar);
            return;
        }
        zzeyj.zza(this.zzb, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewn
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzawb) obj).zzc(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzeyj.zza(this.zzb, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewt
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzawb) obj).zzb(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzbK() {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzbK();
        } else {
            zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzexa
                @Override // com.google.android.gms.internal.ads.zzeyi
                public final void zza(Object obj) {
                    ((zzawf) obj).zzb();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzbu();
        } else {
            zzeyj.zza(this.zzf, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzews
                @Override // com.google.android.gms.internal.ads.zzeyi
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzbu();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzbv();
            return;
        }
        zzeyj.zza(this.zzf, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewv
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzbv();
            }
        });
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzeww
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzawf) obj).zzf();
            }
        });
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewx
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzawf) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzbx();
        } else {
            zzeyj.zza(this.zzf, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewz
                @Override // com.google.android.gms.internal.ads.zzeyi
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzbx();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(final int i10) {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzby(i10);
        } else {
            zzeyj.zza(this.zzf, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewr
                @Override // com.google.android.gms.internal.ads.zzeyi
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzby(i10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzg() {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzg();
        } else {
            zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzexb
                @Override // com.google.android.gms.internal.ads.zzeyi
                public final void zza(Object obj) {
                    ((zzcyh) obj).zzg();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzh(zzsVar);
        } else {
            zzeyj.zza(this.zzg, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewq
                @Override // com.google.android.gms.internal.ads.zzeyi
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
                }
            });
        }
    }

    public final void zzj() {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzj();
            return;
        }
        this.zza.zza();
        zzeyj.zza(this.zzc, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewo
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzawc) obj).zza();
            }
        });
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewp
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzawf) obj).zzc();
            }
        });
    }

    public final void zzk(final zzavy zzavyVar) {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzk(zzavyVar);
        } else {
            zzeyj.zza(this.zzb, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewu
                @Override // com.google.android.gms.internal.ads.zzeyi
                public final void zza(Object obj) {
                    ((zzawb) obj).zzd(zzavy.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeys
    public final void zzl(zzeys zzeysVar) {
        this.zzh = (zzexc) zzeysVar;
    }

    public final void zzm(com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.zzf.set(zzoVar);
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzg.set(zzdgVar);
    }

    public final void zzo(zzawb zzawbVar) {
        this.zzb.set(zzawbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwy
    public final void zzp(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzp(zzeVar);
        } else {
            zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewy
                @Override // com.google.android.gms.internal.ads.zzeyi
                public final void zza(Object obj) {
                    ((zzawf) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
        }
    }

    public final void zzq(zzawf zzawfVar) {
        this.zzd.set(zzawfVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzs() {
    }
}
