package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbid implements zzbir {
    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfi zzcfiVar = (zzcfi) obj;
        try {
            zzfoi.zzj(zzcfiVar.getContext()).zzk();
            zzfoj.zzi(zzcfiVar.getContext()).zzj();
        } catch (IOException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
