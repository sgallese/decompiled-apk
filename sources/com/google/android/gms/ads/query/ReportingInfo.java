package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbsz;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class ReportingInfo {
    private final zzbsz zza;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public static final class Builder {
        private final zzbsy zza;

        @KeepForSdk
        public Builder(View view) {
            zzbsy zzbsyVar = new zzbsy();
            this.zza = zzbsyVar;
            zzbsyVar.zzb(view);
        }

        @KeepForSdk
        public ReportingInfo build() {
            return new ReportingInfo(this, null);
        }

        @KeepForSdk
        public Builder setAssetViews(Map<String, View> map) {
            this.zza.zzc(map);
            return this;
        }
    }

    /* synthetic */ ReportingInfo(Builder builder, zzb zzbVar) {
        this.zza = new zzbsz(builder.zza);
    }

    @KeepForSdk
    public void recordClick(List<Uri> list) {
        this.zza.zza(list);
    }

    @KeepForSdk
    public void recordImpression(List<Uri> list) {
        this.zza.zzb(list);
    }

    @KeepForSdk
    public void reportTouchEvent(MotionEvent motionEvent) {
        this.zza.zzc(motionEvent);
    }

    @KeepForSdk
    public void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza.zzd(uri, updateClickUrlCallback);
    }

    @KeepForSdk
    public void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza.zze(list, updateImpressionUrlsCallback);
    }
}
