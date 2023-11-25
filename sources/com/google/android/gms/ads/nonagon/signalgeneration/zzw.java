package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzdrc;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.internal.ads.zzfya;
import com.google.common.util.concurrent.a;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
final class zzw implements zzfya {
    final /* synthetic */ a zza;
    final /* synthetic */ zzbyv zzb;
    final /* synthetic */ zzbyo zzc;
    final /* synthetic */ zzfhg zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzaa zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzw(zzaa zzaaVar, a aVar, zzbyv zzbyvVar, zzbyo zzbyoVar, zzfhg zzfhgVar, long j10) {
        this.zzf = zzaaVar;
        this.zza = aVar;
        this.zzb = zzbyvVar;
        this.zzc = zzbyoVar;
        this.zzd = zzfhgVar;
        this.zze = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzdrm zzdrmVar;
        zzdrc zzdrcVar;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zze;
        String message = th.getMessage();
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "SignalGeneratorImpl.generateSignals");
        zzaa zzaaVar = this.zzf;
        zzdrmVar = zzaaVar.zzr;
        zzdrcVar = zzaaVar.zzj;
        zzf.zzc(zzdrmVar, zzdrcVar, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(currentTimeMillis)));
        zzfhr zzr = zzaa.zzr(this.zza, this.zzb);
        if (((Boolean) zzbdd.zze.zze()).booleanValue() && zzr != null) {
            zzfhg zzfhgVar = this.zzd;
            zzfhgVar.zzg(th);
            zzfhgVar.zzf(false);
            zzr.zza(zzfhgVar);
            zzr.zzg();
        }
        try {
            this.zzc.zzb("Internal error. " + message);
        } catch (RemoteException e10) {
            zzcaa.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdrm zzdrmVar;
        zzdrc zzdrcVar;
        zzdrc zzdrcVar2;
        boolean z10;
        boolean z11;
        zzdrm zzdrmVar2;
        zzdrc zzdrcVar3;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        zzcag zzcagVar;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        zzdrm zzdrmVar3;
        zzdrc zzdrcVar4;
        zzdrm zzdrmVar4;
        zzdrc zzdrcVar5;
        zzam zzamVar = (zzam) obj;
        zzfhr zzr = zzaa.zzr(this.zza, this.zzb);
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zzht)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e10) {
                zzcaa.zzg("QueryInfo generation has been disabled.".concat(e10.toString()));
            }
            if (((Boolean) zzbdd.zze.zze()).booleanValue() && zzr != null) {
                zzfhg zzfhgVar = this.zzd;
                zzfhgVar.zzc("QueryInfo generation has been disabled.");
                zzfhgVar.zzf(false);
                zzr.zza(zzfhgVar);
                zzr.zzg();
                return;
            }
            return;
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zze;
        try {
            try {
                if (zzamVar == null) {
                    this.zzc.zzc(null, null, null);
                    zzaa zzaaVar = this.zzf;
                    zzdrmVar4 = zzaaVar.zzr;
                    zzdrcVar5 = zzaaVar.zzj;
                    zzf.zzc(zzdrmVar4, zzdrcVar5, "sgs", new Pair("rid", "-1"));
                    this.zzd.zzf(true);
                    if (((Boolean) zzbdd.zze.zze()).booleanValue() && zzr != null) {
                        zzr.zza(this.zzd);
                        zzr.zzg();
                        return;
                    }
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(zzamVar.zzb);
                    String optString = jSONObject.optString("request_id", "");
                    if (TextUtils.isEmpty(optString)) {
                        zzcaa.zzj("The request ID is empty in request JSON.");
                        this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                        zzaa zzaaVar2 = this.zzf;
                        zzdrmVar3 = zzaaVar2.zzr;
                        zzdrcVar4 = zzaaVar2.zzj;
                        zzf.zzc(zzdrmVar3, zzdrcVar4, "sgf", new Pair("sgf_reason", "rid_missing"));
                        zzfhg zzfhgVar2 = this.zzd;
                        zzfhgVar2.zzc("Request ID empty");
                        zzfhgVar2.zzf(false);
                        if (((Boolean) zzbdd.zze.zze()).booleanValue() && zzr != null) {
                            zzr.zza(this.zzd);
                            zzr.zzg();
                            return;
                        }
                        return;
                    }
                    zzaa zzaaVar3 = this.zzf;
                    String str7 = zzamVar.zzb;
                    zzdrcVar2 = zzaaVar3.zzj;
                    zzaa.zzG(zzaaVar3, optString, str7, zzdrcVar2);
                    Bundle bundle = zzamVar.zzc;
                    zzaa zzaaVar4 = this.zzf;
                    z10 = zzaaVar4.zzw;
                    if (z10 && bundle != null) {
                        str5 = zzaaVar4.zzy;
                        if (bundle.getInt(str5, -1) == -1) {
                            zzaa zzaaVar5 = this.zzf;
                            str6 = zzaaVar5.zzy;
                            atomicInteger = zzaaVar5.zzz;
                            bundle.putInt(str6, atomicInteger.get());
                        }
                    }
                    zzaa zzaaVar6 = this.zzf;
                    z11 = zzaaVar6.zzv;
                    if (z11 && bundle != null) {
                        str = zzaaVar6.zzx;
                        if (TextUtils.isEmpty(bundle.getString(str))) {
                            str2 = this.zzf.zzB;
                            if (TextUtils.isEmpty(str2)) {
                                zzaa zzaaVar7 = this.zzf;
                                com.google.android.gms.ads.internal.util.zzs zzp = com.google.android.gms.ads.internal.zzt.zzp();
                                zzaa zzaaVar8 = this.zzf;
                                context = zzaaVar8.zzg;
                                zzcagVar = zzaaVar8.zzA;
                                zzaaVar7.zzB = zzp.zzc(context, zzcagVar.zza);
                            }
                            zzaa zzaaVar9 = this.zzf;
                            str3 = zzaaVar9.zzx;
                            str4 = zzaaVar9.zzB;
                            bundle.putString(str3, str4);
                        }
                    }
                    this.zzc.zzc(zzamVar.zza, zzamVar.zzb, bundle);
                    zzaa zzaaVar10 = this.zzf;
                    zzdrmVar2 = zzaaVar10.zzr;
                    zzdrcVar3 = zzaaVar10.zzj;
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = new Pair("tqgt", String.valueOf(currentTimeMillis));
                    String str8 = "na";
                    if (((Boolean) zzba.zzc().zzb(zzbbr.zzjg)).booleanValue()) {
                        try {
                            str8 = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                        } catch (JSONException e11) {
                            zzcaa.zzh("Error retrieving JSONObject from the requestJson, ", e11);
                        }
                    }
                    pairArr[1] = new Pair("tpc", str8);
                    zzf.zzc(zzdrmVar2, zzdrcVar3, "sgs", pairArr);
                    this.zzd.zzf(true);
                    if (((Boolean) zzbdd.zze.zze()).booleanValue() && zzr != null) {
                        zzr.zza(this.zzd);
                        zzr.zzg();
                    }
                } catch (JSONException e12) {
                    zzcaa.zzj("Failed to create JSON object from the request string.");
                    this.zzc.zzb("Internal error for request JSON: " + e12.toString());
                    zzaa zzaaVar11 = this.zzf;
                    zzdrmVar = zzaaVar11.zzr;
                    zzdrcVar = zzaaVar11.zzj;
                    zzf.zzc(zzdrmVar, zzdrcVar, "sgf", new Pair("sgf_reason", "request_invalid"));
                    zzfhg zzfhgVar3 = this.zzd;
                    zzfhgVar3.zzg(e12);
                    zzfhgVar3.zzf(false);
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e12, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (((Boolean) zzbdd.zze.zze()).booleanValue() && zzr != null) {
                        zzr.zza(this.zzd);
                        zzr.zzg();
                    }
                }
            } catch (RemoteException e13) {
                zzfhg zzfhgVar4 = this.zzd;
                zzfhgVar4.zzg(e13);
                zzfhgVar4.zzf(false);
                zzcaa.zzh("", e13);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e13, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (((Boolean) zzbdd.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
            }
        } catch (Throwable th) {
            if (((Boolean) zzbdd.zze.zze()).booleanValue() && zzr != null) {
                zzr.zza(this.zzd);
                zzr.zzg();
            }
            throw th;
        }
    }
}
