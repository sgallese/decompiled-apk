package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfep {
    private final zzfei zza;
    private final com.google.common.util.concurrent.a zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfep(final zzfdn zzfdnVar, final zzfeh zzfehVar, final zzfei zzfeiVar) {
        this.zza = zzfeiVar;
        this.zzb = zzfye.zzf(zzfye.zzn(zzfehVar.zza(zzfeiVar), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzfen
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzfep.this.zzb(zzfehVar, zzfdnVar, zzfeiVar, (zzfdw) obj);
            }
        }, zzfeiVar.zzb()), Exception.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzfeo
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzfep.this.zzc(zzfehVar, (Exception) obj);
            }
        }, zzfeiVar.zzb());
    }

    public final synchronized com.google.common.util.concurrent.a zza(zzfei zzfeiVar) {
        if (!this.zzd && !this.zzc) {
            if (this.zza.zza() != null && zzfeiVar.zza() != null && this.zza.zza().equals(zzfeiVar.zza())) {
                this.zzc = true;
                return this.zzb;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzb(zzfeh zzfehVar, zzfdn zzfdnVar, zzfei zzfeiVar, zzfdw zzfdwVar) throws Exception {
        synchronized (this) {
            this.zzd = true;
            zzfehVar.zzb(zzfdwVar);
            if (!this.zzc) {
                zzfdnVar.zzd(zzfeiVar.zza(), zzfdwVar);
                return zzfye.zzh(null);
            }
            return zzfye.zzh(new zzfeg(zzfdwVar, zzfeiVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzc(zzfeh zzfehVar, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzfya zzfyaVar) {
        zzfye.zzr(zzfye.zzn(this.zzb, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzfem
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                zzfeg zzfegVar = (zzfeg) obj;
                return zzfye.zzi();
            }
        }, this.zza.zzb()), zzfyaVar, this.zza.zzb());
    }
}
