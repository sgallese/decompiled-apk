package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeme implements zzesi {
    final zzfca zza;
    private final long zzb;

    public zzeme(zzfca zzfcaVar, long j10) {
        Preconditions.checkNotNull(zzfcaVar, "the targeting must not be null");
        this.zza = zzfcaVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzesi
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Bundle bundle = (Bundle) obj;
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzlVar.zzw);
        bundle.putString("slotname", this.zza.zzf);
        int i10 = this.zza.zzo.zza;
        int i11 = i10 - 1;
        if (i10 != 0) {
            boolean z16 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    bundle.putBoolean("is_rewarded_interstitial", true);
                }
            } else {
                bundle.putBoolean("is_new_rewarded", true);
            }
            bundle.putLong("start_signals_timestamp", this.zzb);
            String format = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzlVar.zzb));
            if (zzlVar.zzb != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzfcm.zzf(bundle, "cust_age", format, z10);
            zzfcm.zzb(bundle, "extras", zzlVar.zzc);
            int i12 = zzlVar.zzd;
            if (i12 != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            zzfcm.zze(bundle, "cust_gender", i12, z11);
            zzfcm.zzd(bundle, "kw", zzlVar.zze);
            int i13 = zzlVar.zzg;
            if (i13 != -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            zzfcm.zze(bundle, "tag_for_child_directed_treatment", i13, z12);
            if (zzlVar.zzf) {
                bundle.putBoolean("test_request", true);
            }
            if (zzlVar.zza >= 2 && zzlVar.zzh) {
                z13 = true;
            } else {
                z13 = false;
            }
            zzfcm.zze(bundle, "d_imp_hdr", 1, z13);
            String str = zzlVar.zzi;
            if (zzlVar.zza >= 2 && !TextUtils.isEmpty(str)) {
                z14 = true;
            } else {
                z14 = false;
            }
            zzfcm.zzf(bundle, "ppid", str, z14);
            Location location = zzlVar.zzk;
            if (location != null) {
                float accuracy = location.getAccuracy() * 1000.0f;
                long time = location.getTime() * 1000;
                double latitude = location.getLatitude() * 1.0E7d;
                double longitude = 1.0E7d * location.getLongitude();
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", accuracy);
                bundle2.putLong("lat", (long) latitude);
                bundle2.putLong("long", (long) longitude);
                bundle2.putLong("time", time);
                bundle.putBundle("uule", bundle2);
            }
            zzfcm.zzc(bundle, ImagesContract.URL, zzlVar.zzl);
            zzfcm.zzd(bundle, "neighboring_content_urls", zzlVar.zzv);
            zzfcm.zzb(bundle, "custom_targeting", zzlVar.zzn);
            zzfcm.zzd(bundle, "category_exclusions", zzlVar.zzo);
            zzfcm.zzc(bundle, "request_agent", zzlVar.zzp);
            zzfcm.zzc(bundle, "request_pkg", zzlVar.zzq);
            boolean z17 = zzlVar.zzr;
            if (zzlVar.zza >= 7) {
                z15 = true;
            } else {
                z15 = false;
            }
            zzfcm.zzg(bundle, "is_designed_for_families", z17, z15);
            if (zzlVar.zza >= 8) {
                int i14 = zzlVar.zzt;
                if (i14 == -1) {
                    z16 = false;
                }
                zzfcm.zze(bundle, "tag_for_under_age_of_consent", i14, z16);
                zzfcm.zzc(bundle, "max_ad_content_rating", zzlVar.zzu);
                return;
            }
            return;
        }
        throw null;
    }
}
