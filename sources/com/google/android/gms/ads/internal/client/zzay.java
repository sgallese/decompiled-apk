package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbgw;
import com.google.android.gms.internal.ads.zzbrz;
import com.google.android.gms.internal.ads.zzbwi;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcag;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public final class zzay {
    private static final zzay zza = new zzay();
    private final zzbzt zzb;
    private final zzaw zzc;
    private final String zzd;
    private final zzcag zze;
    private final Random zzf;

    protected zzay() {
        zzbzt zzbztVar = new zzbzt();
        zzaw zzawVar = new zzaw(new zzk(), new zzi(), new zzeq(), new zzbgv(), new zzbwi(), new zzbrz(), new zzbgw());
        String zzd = zzbzt.zzd();
        zzcag zzcagVar = new zzcag(0, 233012000, true, false, false);
        Random random = new Random();
        this.zzb = zzbztVar;
        this.zzc = zzawVar;
        this.zzd = zzd;
        this.zze = zzcagVar;
        this.zzf = random;
    }

    public static zzaw zza() {
        return zza.zzc;
    }

    public static zzbzt zzb() {
        return zza.zzb;
    }

    public static zzcag zzc() {
        return zza.zze;
    }

    public static String zzd() {
        return zza.zzd;
    }

    public static Random zze() {
        return zza.zzf;
    }
}
