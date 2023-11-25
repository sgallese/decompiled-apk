package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcob {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzedj zzc;
    private final zzdor zzd;
    private final zzfyo zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private zzbth zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcob(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzedj zzedjVar, zzdor zzdorVar, zzfyo zzfyoVar, zzfyo zzfyoVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zza = context;
        this.zzb = zzgVar;
        this.zzc = zzedjVar;
        this.zzd = zzdorVar;
        this.zze = zzfyoVar;
        this.zzf = zzfyoVar2;
        this.zzg = scheduledExecutorService;
    }

    private final com.google.common.util.concurrent.a zzj(final String str, final InputEvent inputEvent, Random random) {
        final Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjp)) && !this.zzb.zzQ()) {
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjq), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent == null) {
                buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjr), "11");
                return zzfye.zzh(buildUpon.toString());
            }
            return zzfye.zzf(zzfye.zzn(zzfxv.zzu(this.zzc.zza()), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzcnu
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final com.google.common.util.concurrent.a zza(Object obj) {
                    return zzcob.this.zzd(buildUpon, str, inputEvent, (Integer) obj);
                }
            }, this.zzf), Throwable.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzcnv
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final com.google.common.util.concurrent.a zza(Object obj) {
                    return zzcob.this.zze(buildUpon, (Throwable) obj);
                }
            }, this.zze);
        }
        return zzfye.zzh(str);
    }

    public final com.google.common.util.concurrent.a zzc(final String str, Random random) {
        return zzfye.zzf(zzj(str, this.zzd.zza(), random), Throwable.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzcnw
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                Throwable th = (Throwable) obj;
                return zzfye.zzh(str);
            }
        }, this.zze);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzd(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) throws Exception {
        int intValue = num.intValue();
        zzedj zzedjVar = this.zzc;
        if (intValue == 1) {
            Uri.Builder buildUpon = builder.build().buildUpon();
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjs), "1");
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjr), "12");
            if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjt))) {
                buildUpon.authority((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzju));
            }
            return zzfye.zzn(zzfxv.zzu(zzedjVar.zzb(buildUpon.build(), inputEvent)), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzcnx
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final com.google.common.util.concurrent.a zza(Object obj) {
                    Uri.Builder builder2 = builder;
                    builder2.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjr), "12");
                    return zzfye.zzh(builder2.toString());
                }
            }, this.zzf);
        }
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjr), "10");
        return zzfye.zzh(builder.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zze(Uri.Builder builder, final Throwable th) throws Exception {
        this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnt
            @Override // java.lang.Runnable
            public final void run() {
                zzcob.this.zzh(th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjr), "9");
        return zzfye.zzh(builder.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(Throwable th) {
        zzbth zza = zzbtf.zza(this.zza);
        this.zzh = zza;
        zza.zzf(th, "AttributionReporting");
    }

    public final void zzi(String str, zzfik zzfikVar, Random random) {
        zzfye.zzr(zzfye.zzo(zzj(str, this.zzd.zza(), random), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjv)).intValue(), TimeUnit.MILLISECONDS, this.zzg), new zzcoa(this, zzfikVar, str), this.zze);
    }
}
