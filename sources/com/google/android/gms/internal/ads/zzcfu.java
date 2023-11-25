package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcfu {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzcfi, java.lang.Object] */
    public static final zzcfi zza(final Context context, final zzcgx zzcgxVar, final String str, final boolean z10, final boolean z11, final zzaqx zzaqxVar, final zzbct zzbctVar, final zzcag zzcagVar, zzbcj zzbcjVar, final com.google.android.gms.ads.internal.zzl zzlVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzaxe zzaxeVar, final zzfbe zzfbeVar, final zzfbi zzfbiVar, final zzecs zzecsVar) throws zzcft {
        zzbbr.zza(context);
        try {
            final zzbcj zzbcjVar2 = null;
            zzfry zzfryVar = new zzfry(context, zzcgxVar, str, z10, z11, zzaqxVar, zzbctVar, zzcagVar, zzbcjVar2, zzlVar, zzaVar, zzaxeVar, zzfbeVar, zzfbiVar, zzecsVar) { // from class: com.google.android.gms.internal.ads.zzcfq
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzcgx zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzaqx zzf;
                public final /* synthetic */ zzbct zzg;
                public final /* synthetic */ zzcag zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzl zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ zzaxe zzk;
                public final /* synthetic */ zzfbe zzl;
                public final /* synthetic */ zzfbi zzm;
                public final /* synthetic */ zzecs zzn;

                {
                    this.zzi = zzlVar;
                    this.zzj = zzaVar;
                    this.zzk = zzaxeVar;
                    this.zzl = zzfbeVar;
                    this.zzm = zzfbiVar;
                    this.zzn = zzecsVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfry
                public final Object zza() {
                    Context context2 = this.zza;
                    zzcgx zzcgxVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z12 = this.zzd;
                    boolean z13 = this.zze;
                    zzaqx zzaqxVar2 = this.zzf;
                    zzbct zzbctVar2 = this.zzg;
                    zzcag zzcagVar2 = this.zzh;
                    com.google.android.gms.ads.internal.zzl zzlVar2 = this.zzi;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzaxe zzaxeVar2 = this.zzk;
                    zzfbe zzfbeVar2 = this.zzl;
                    zzfbi zzfbiVar2 = this.zzm;
                    zzecs zzecsVar2 = this.zzn;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i10 = zzcgb.zza;
                        zzcfx zzcfxVar = new zzcfx(new zzcgb(new zzcgw(context2), zzcgxVar2, str2, z12, z13, zzaqxVar2, zzbctVar2, zzcagVar2, null, zzlVar2, zzaVar2, zzaxeVar2, zzfbeVar2, zzfbiVar2));
                        zzcfxVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zzq().zzd(zzcfxVar, zzaxeVar2, z13, zzecsVar2));
                        zzcfxVar.setWebChromeClient(new zzcfh(zzcfxVar));
                        return zzcfxVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return zzfryVar.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzcft("Webview initialization failed.", th);
        }
    }
}
