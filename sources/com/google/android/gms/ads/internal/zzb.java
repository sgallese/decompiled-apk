package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbxb;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzbxb zzc;
    private final zzbtt zzd = new zzbtt(false, Collections.emptyList());

    public zzb(Context context, zzbxb zzbxbVar, zzbtt zzbttVar) {
        this.zza = context;
        this.zzc = zzbxbVar;
    }

    private final boolean zzd() {
        zzbxb zzbxbVar = this.zzc;
        if ((zzbxbVar != null && zzbxbVar.zza().zzf) || this.zzd.zza) {
            return true;
        }
        return false;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (!zzd()) {
            return;
        }
        if (str == null) {
            str = "";
        }
        zzbxb zzbxbVar = this.zzc;
        if (zzbxbVar != null) {
            zzbxbVar.zzd(str, null, 3);
            return;
        }
        zzbtt zzbttVar = this.zzd;
        if (zzbttVar.zza && (list = zzbttVar.zzb) != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzs.zzI(this.zza, "", replace);
                }
            }
        }
    }

    public final boolean zzc() {
        if (zzd() && !this.zzb) {
            return false;
        }
        return true;
    }
}
