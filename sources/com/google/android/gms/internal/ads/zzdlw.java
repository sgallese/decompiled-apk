package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdlw {
    private final Executor zza;
    private final zzcpi zzb;
    private final zzddq zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdlw(Executor executor, zzcpi zzcpiVar, zzddq zzddqVar) {
        this.zza = executor;
        this.zzc = zzddqVar;
        this.zzb = zzcpiVar;
    }

    public final void zza(final zzcfi zzcfiVar) {
        if (zzcfiVar == null) {
            return;
        }
        this.zzc.zza(zzcfiVar.zzF());
        this.zzc.zzo(new zzauf() { // from class: com.google.android.gms.internal.ads.zzdls
            @Override // com.google.android.gms.internal.ads.zzauf
            public final void zzbt(zzaue zzaueVar) {
                zzcgv zzN = zzcfi.this.zzN();
                Rect rect = zzaueVar.zzd;
                zzN.zzp(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzo(new zzauf() { // from class: com.google.android.gms.internal.ads.zzdlt
            @Override // com.google.android.gms.internal.ads.zzauf
            public final void zzbt(zzaue zzaueVar) {
                String str;
                zzcfi zzcfiVar2 = zzcfi.this;
                HashMap hashMap = new HashMap();
                if (true != zzaueVar.zzj) {
                    str = "0";
                } else {
                    str = "1";
                }
                hashMap.put("isVisible", str);
                zzcfiVar2.zzd("onAdVisibilityChanged", hashMap);
            }
        }, this.zza);
        this.zzc.zzo(this.zzb, this.zza);
        this.zzb.zzf(zzcfiVar);
        zzcfiVar.zzad("/trackActiveViewUnit", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdlu
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, Map map) {
                zzdlw.this.zzb((zzcfi) obj, map);
            }
        });
        zzcfiVar.zzad("/untrackActiveViewUnit", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdlv
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, Map map) {
                zzdlw.this.zzc((zzcfi) obj, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcfi zzcfiVar, Map map) {
        this.zzb.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcfi zzcfiVar, Map map) {
        this.zzb.zza();
    }
}
