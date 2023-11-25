package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzefc implements zzedn {
    private final Context zza;
    private final zzdfq zzb;
    private final Executor zzc;
    private final zzfbd zzd;

    public zzefc(Context context, Executor executor, zzdfq zzdfqVar, zzfbd zzfbdVar) {
        this.zza = context;
        this.zzb = zzdfqVar;
        this.zzc = executor;
        this.zzd = zzfbdVar;
    }

    private static String zzd(zzfbe zzfbeVar) {
        try {
            return zzfbeVar.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final com.google.common.util.concurrent.a zza(final zzfbr zzfbrVar, final zzfbe zzfbeVar) {
        final Uri uri;
        String zzd = zzd(zzfbeVar);
        if (zzd != null) {
            uri = Uri.parse(zzd);
        } else {
            uri = null;
        }
        return zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzefa
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzefc.this.zzc(uri, zzfbrVar, zzfbeVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        Context context = this.zza;
        if ((context instanceof Activity) && zzbcs.zzg(context) && !TextUtils.isEmpty(zzd(zzfbeVar))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzc(Uri uri, zzfbr zzfbrVar, zzfbe zzfbeVar, Object obj) throws Exception {
        try {
            androidx.browser.customtabs.d a10 = new d.a().a();
            a10.f1758a.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(a10.f1758a, null);
            final zzcas zzcasVar = new zzcas();
            zzdeq zze = this.zzb.zze(new zzcst(zzfbrVar, zzfbeVar, null), new zzdet(new zzdfy() { // from class: com.google.android.gms.internal.ads.zzefb
                @Override // com.google.android.gms.internal.ads.zzdfy
                public final void zza(boolean z10, Context context, zzcwv zzcwvVar) {
                    zzcas zzcasVar2 = zzcas.this;
                    try {
                        com.google.android.gms.ads.internal.zzt.zzi();
                        com.google.android.gms.ads.internal.overlay.zzm.zza(context, (AdOverlayInfoParcel) zzcasVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzcasVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zze.zza(), null, new zzcag(0, 0, false, false, false), null, null));
            this.zzd.zza();
            return zzfye.zzh(zze.zzg());
        } catch (Throwable th) {
            zzcaa.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
