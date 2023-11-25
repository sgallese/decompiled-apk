package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcfz implements zzbir {
    final /* synthetic */ zzcgb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfz(zzcgb zzcgbVar) {
        this.zza = zzcgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i10;
        zzcfi zzcfiVar = (zzcfi) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.zza) {
                        zzcgb zzcgbVar = this.zza;
                        i10 = zzcgbVar.zzG;
                        if (i10 != parseInt) {
                            zzcgbVar.zzG = parseInt;
                            this.zza.requestLayout();
                        }
                    }
                } catch (Exception e10) {
                    zzcaa.zzk("Exception occurred while getting webview content height", e10);
                }
            }
        }
    }
}
