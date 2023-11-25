package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbii implements zzbir {
    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfi zzcfiVar = (zzcfi) obj;
        if (zzcfiVar.zzJ() != null) {
            zzcfiVar.zzJ().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzl zzL = zzcfiVar.zzL();
        if (zzL != null) {
            zzL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzM = zzcfiVar.zzM();
        if (zzM != null) {
            zzM.zzb();
        } else {
            zzcaa.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
