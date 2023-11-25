package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzra;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzku extends zzkr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzku(zzlf zzlfVar) {
        super(zzlfVar);
    }

    private final String zzd(String str) {
        String zzi = this.zzf.zzo().zzi(str);
        if (!TextUtils.isEmpty(zzi)) {
            Uri parse = Uri.parse((String) zzeg.zzq.zza(null));
            Uri.Builder buildUpon = parse.buildUpon();
            buildUpon.authority(zzi + "." + parse.getAuthority());
            return buildUpon.build().toString();
        }
        return (String) zzeg.zzq.zza(null);
    }

    public final zzkt zza(String str) {
        String str2;
        zzra.zzc();
        zzkt zzktVar = null;
        if (this.zzt.zzf().zzs(null, zzeg.zzaq)) {
            this.zzt.zzaA().zzj().zza("sgtm feature flag enabled.");
            zzh zzj = this.zzf.zzi().zzj(str);
            if (zzj == null) {
                return new zzkt(zzd(str));
            }
            if (zzj.zzan()) {
                this.zzt.zzaA().zzj().zza("sgtm upload enabled in manifest.");
                com.google.android.gms.internal.measurement.zzff zze = this.zzf.zzo().zze(zzj.zzu());
                if (zze != null) {
                    String zzj2 = zze.zzj();
                    if (!TextUtils.isEmpty(zzj2)) {
                        String zzi = zze.zzi();
                        zzer zzj3 = this.zzt.zzaA().zzj();
                        if (true != TextUtils.isEmpty(zzi)) {
                            str2 = "N";
                        } else {
                            str2 = "Y";
                        }
                        zzj3.zzc("sgtm configured with upload_url, server_info", zzj2, str2);
                        if (TextUtils.isEmpty(zzi)) {
                            this.zzt.zzay();
                            zzktVar = new zzkt(zzj2);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", zzi);
                            zzktVar = new zzkt(zzj2, hashMap);
                        }
                    }
                }
            }
            if (zzktVar != null) {
                return zzktVar;
            }
        }
        return new zzkt(zzd(str));
    }
}
