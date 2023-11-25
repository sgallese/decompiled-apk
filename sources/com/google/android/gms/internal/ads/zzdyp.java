package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdyp {
    public com.google.common.util.concurrent.a zza;
    private final zzczb zzb;
    private final zzdxx zzc;
    private final zzfge zzd;
    private final zzfca zze;
    private final zzcag zzf;
    private final zzfhu zzg;
    private final zzfhr zzh;
    private final Context zzi;
    private final zzfyo zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyp(zzczb zzczbVar, zzdxx zzdxxVar, zzfge zzfgeVar, zzfca zzfcaVar, zzcag zzcagVar, zzfhu zzfhuVar, zzfhr zzfhrVar, Context context, zzfyo zzfyoVar) {
        this.zzb = zzczbVar;
        this.zzc = zzdxxVar;
        this.zzd = zzfgeVar;
        this.zze = zzfcaVar;
        this.zzf = zzcagVar;
        this.zzg = zzfhuVar;
        this.zzh = zzfhrVar;
        this.zzi = context;
        this.zzj = zzfyoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbtv zza(zzbun zzbunVar, zzeaa zzeaaVar) {
        Context context = this.zzi;
        zzeaaVar.zzc.put("Content-Type", zzeaaVar.zze);
        zzeaaVar.zzc.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzbunVar.zzb.zza));
        String str = zzeaaVar.zza;
        int i10 = zzeaaVar.zzb;
        Map map = zzeaaVar.zzc;
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzbtv(str, i10, bundle, zzeaaVar.zzd, zzeaaVar.zzf, zzbunVar.zzd, zzbunVar.zzh);
    }

    public final com.google.common.util.concurrent.a zzc(final zzbun zzbunVar, final JSONObject jSONObject, final zzbuq zzbuqVar) {
        this.zzb.zzbr(zzbunVar);
        zzffv zzb = this.zzd.zzb(zzffy.PROXY, zzfye.zzm(this.zzd.zzb(zzffy.PREPARE_HTTP_REQUEST, zzfye.zzh(new zzeae(jSONObject, zzbuqVar))).zze(new zzeaf(zzbunVar.zzg, this.zzh, zzfhf.zza(this.zzi, 9))).zza(), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzdyn
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                return zzdyp.this.zza(zzbunVar, (zzeaa) obj);
            }
        }, this.zzj));
        final zzdxx zzdxxVar = this.zzc;
        zzffj zza = zzb.zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdyk
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzdxx.this.zzc((zzbtv) obj);
            }
        }).zza();
        this.zza = zza;
        com.google.common.util.concurrent.a zzn = zzfye.zzn(this.zzd.zzb(zzffy.PRE_PROCESS, zza).zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzdym
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                return new zzdzn(zzeab.zza(new InputStreamReader((InputStream) obj)), jSONObject, zzbuqVar);
            }
        }).zzf(com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzi, this.zzf, this.zzg).zza("google.afma.response.normalize", zzdzn.zza, zzbnf.zzb)).zza(), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdyl
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzdyp.this.zzd((InputStream) obj);
            }
        }, this.zzj);
        zzfye.zzr(zzn, new zzdyo(this), this.zzj);
        return zzn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzd(InputStream inputStream) throws Exception {
        return zzfye.zzh(new zzfbr(new zzfbo(this.zze), zzfbq.zza(new InputStreamReader(inputStream))));
    }
}
