package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbrc extends zzbrf {
    private final Map zza;
    private final Context zzb;

    public zzbrc(zzcfi zzcfiVar, Map map) {
        super(zzcfiVar, "storePicture");
        this.zza = map;
        this.zzb = zzcfiVar.zzi();
    }

    public final void zzb() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.zzb == null) {
            zzg("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (!new zzbbb(this.zzb).zzc()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str5 = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str5)) {
            zzg("Image url cannot be empty.");
        } else if (URLUtil.isValidUrl(str5)) {
            String lastPathSegment = Uri.parse(str5).getLastPathSegment();
            com.google.android.gms.ads.internal.zzt.zzp();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
                com.google.android.gms.ads.internal.zzt.zzp();
                AlertDialog.Builder zzH = com.google.android.gms.ads.internal.util.zzs.zzH(this.zzb);
                if (zzd != null) {
                    str = zzd.getString(R.string.f9402s1);
                } else {
                    str = "Save image";
                }
                zzH.setTitle(str);
                if (zzd != null) {
                    str2 = zzd.getString(R.string.f9403s2);
                } else {
                    str2 = "Allow Ad to store image in Picture gallery?";
                }
                zzH.setMessage(str2);
                if (zzd != null) {
                    str3 = zzd.getString(R.string.f9404s3);
                } else {
                    str3 = "Accept";
                }
                zzH.setPositiveButton(str3, new zzbra(this, str5, lastPathSegment));
                if (zzd != null) {
                    str4 = zzd.getString(R.string.f9405s4);
                } else {
                    str4 = "Decline";
                }
                zzH.setNegativeButton(str4, new zzbrb(this));
                zzH.create().show();
                return;
            }
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
        } else {
            zzg("Invalid image url: ".concat(String.valueOf(str5)));
        }
    }
}
