package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbji implements zzbir {
    private final zzbjh zza;

    public zzbji(zzbjh zzbjhVar) {
        this.zza = zzbjhVar;
    }

    public static void zzb(zzcfi zzcfiVar, zzbjh zzbjhVar) {
        zzcfiVar.zzad("/reward", new zzbji(zzbjhVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzbvp zzbvpVar = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get(TaskFormActivity.TASK_TYPE_KEY);
                if (!TextUtils.isEmpty(str2)) {
                    zzbvpVar = new zzbvp(str2, parseInt);
                }
            } catch (NumberFormatException e10) {
                zzcaa.zzk("Unable to parse reward amount.", e10);
            }
            this.zza.zza(zzbvpVar);
        } else if ("video_start".equals(str)) {
            this.zza.zzc();
        } else if ("video_complete".equals(str)) {
            this.zza.zzb();
        }
    }
}
