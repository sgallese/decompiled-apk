package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzdjb implements zzbej {
    final /* synthetic */ zzdjy zza;
    final /* synthetic */ ViewGroup zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdjb(zzdjy zzdjyVar, ViewGroup viewGroup) {
        this.zza = zzdjyVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbej
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbej
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbej
    public final void zzc() {
        zzdjy zzdjyVar = this.zza;
        zzfud zzfudVar = zzdiy.zza;
        Map zzm = zzdjyVar.zzm();
        if (zzm != null) {
            int size = zzfudVar.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = zzm.get((String) zzfudVar.get(i10));
                i10++;
                if (obj != null) {
                    this.zza.onClick(this.zzb);
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbej
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
