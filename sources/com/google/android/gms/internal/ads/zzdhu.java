package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdhu implements zzauf {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdhx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdhu(zzdhx zzdhxVar, String str) {
        this.zzb = zzdhxVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final void zzbt(zzaue zzaueVar) {
        Map map;
        zzdjy zzdjyVar;
        zzdjy zzdjyVar2;
        zzdjy zzdjyVar3;
        zzdjy zzdjyVar4;
        Map map2;
        zzdjy zzdjyVar5;
        zzdjy zzdjyVar6;
        zzdjy zzdjyVar7;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbG)).booleanValue()) {
            synchronized (this) {
                if (zzaueVar.zzj) {
                    zzdhx zzdhxVar = this.zzb;
                    zzdjyVar4 = zzdhxVar.zzo;
                    if (zzdjyVar4 != null) {
                        map2 = zzdhxVar.zzy;
                        map2.put(this.zza, Boolean.TRUE);
                        zzdhx zzdhxVar2 = this.zzb;
                        zzdjyVar5 = zzdhxVar2.zzo;
                        View zzf = zzdjyVar5.zzf();
                        zzdjyVar6 = this.zzb.zzo;
                        Map zzl = zzdjyVar6.zzl();
                        zzdjyVar7 = this.zzb.zzo;
                        zzdhxVar2.zzz(zzf, zzl, zzdjyVar7.zzm(), true);
                    }
                }
            }
        } else if (zzaueVar.zzj) {
            map = this.zzb.zzy;
            map.put(this.zza, Boolean.TRUE);
            zzdhx zzdhxVar3 = this.zzb;
            zzdjyVar = zzdhxVar3.zzo;
            View zzf2 = zzdjyVar.zzf();
            zzdjyVar2 = this.zzb.zzo;
            Map zzl2 = zzdjyVar2.zzl();
            zzdjyVar3 = this.zzb.zzo;
            zzdhxVar3.zzz(zzf2, zzl2, zzdjyVar3.zzm(), true);
        }
    }
}
