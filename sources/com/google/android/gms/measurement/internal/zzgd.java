package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzos;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzgd implements zzgy {
    private static volatile zzgd zzd;
    private zzek zzA;
    private Boolean zzC;
    private long zzD;
    private volatile Boolean zzE;
    private volatile boolean zzF;
    private int zzG;
    @VisibleForTesting
    protected Boolean zza;
    @VisibleForTesting
    protected Boolean zzb;
    @VisibleForTesting
    final long zzc;
    private final Context zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;
    private final zzab zzj;
    private final zzag zzk;
    private final zzfi zzl;
    private final zzet zzm;
    private final zzga zzn;
    private final zzkn zzo;
    private final zzln zzp;
    private final zzeo zzq;
    private final Clock zzr;
    private final zzix zzs;
    private final zzii zzt;
    private final zzd zzu;
    private final zzim zzv;
    private final String zzw;
    private zzem zzx;
    private zzjx zzy;
    private zzaq zzz;
    private boolean zzB = false;
    private final AtomicInteger zzH = new AtomicInteger(0);

    zzgd(zzhg zzhgVar) {
        long currentTimeMillis;
        Bundle bundle;
        Preconditions.checkNotNull(zzhgVar);
        Context context = zzhgVar.zza;
        zzab zzabVar = new zzab(context);
        this.zzj = zzabVar;
        zzed.zza = zzabVar;
        this.zze = context;
        this.zzf = zzhgVar.zzb;
        this.zzg = zzhgVar.zzc;
        this.zzh = zzhgVar.zzd;
        this.zzi = zzhgVar.zzh;
        this.zzE = zzhgVar.zze;
        this.zzw = zzhgVar.zzj;
        this.zzF = true;
        com.google.android.gms.internal.measurement.zzcl zzclVar = zzhgVar.zzg;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zza = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzb = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzib.zzd(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzr = defaultClock;
        Long l10 = zzhgVar.zzi;
        if (l10 != null) {
            currentTimeMillis = l10.longValue();
        } else {
            currentTimeMillis = defaultClock.currentTimeMillis();
        }
        this.zzc = currentTimeMillis;
        this.zzk = new zzag(this);
        zzfi zzfiVar = new zzfi(this);
        zzfiVar.zzw();
        this.zzl = zzfiVar;
        zzet zzetVar = new zzet(this);
        zzetVar.zzw();
        this.zzm = zzetVar;
        zzln zzlnVar = new zzln(this);
        zzlnVar.zzw();
        this.zzp = zzlnVar;
        this.zzq = new zzeo(new zzhf(zzhgVar, this));
        this.zzu = new zzd(this);
        zzix zzixVar = new zzix(this);
        zzixVar.zzb();
        this.zzs = zzixVar;
        zzii zziiVar = new zzii(this);
        zziiVar.zzb();
        this.zzt = zziiVar;
        zzkn zzknVar = new zzkn(this);
        zzknVar.zzb();
        this.zzo = zzknVar;
        zzim zzimVar = new zzim(this);
        zzimVar.zzw();
        this.zzv = zzimVar;
        zzga zzgaVar = new zzga(this);
        zzgaVar.zzw();
        this.zzn = zzgaVar;
        com.google.android.gms.internal.measurement.zzcl zzclVar2 = zzhgVar.zzg;
        boolean z10 = zzclVar2 == null || zzclVar2.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            zzii zzq = zzq();
            if (zzq.zzt.zze.getApplicationContext() instanceof Application) {
                Application application = (Application) zzq.zzt.zze.getApplicationContext();
                if (zzq.zza == null) {
                    zzq.zza = new zzih(zzq);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(zzq.zza);
                    application.registerActivityLifecycleCallbacks(zzq.zza);
                    zzq.zzt.zzaA().zzj().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzaA().zzk().zza("Application context is not an Application");
        }
        zzgaVar.zzp(new zzgc(this, zzhgVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzA(zzgd zzgdVar, zzhg zzhgVar) {
        zzgdVar.zzaB().zzg();
        zzgdVar.zzk.zzn();
        zzaq zzaqVar = new zzaq(zzgdVar);
        zzaqVar.zzw();
        zzgdVar.zzz = zzaqVar;
        zzek zzekVar = new zzek(zzgdVar, zzhgVar.zzf);
        zzekVar.zzb();
        zzgdVar.zzA = zzekVar;
        zzem zzemVar = new zzem(zzgdVar);
        zzemVar.zzb();
        zzgdVar.zzx = zzemVar;
        zzjx zzjxVar = new zzjx(zzgdVar);
        zzjxVar.zzb();
        zzgdVar.zzy = zzjxVar;
        zzgdVar.zzp.zzx();
        zzgdVar.zzl.zzx();
        zzgdVar.zzA.zzc();
        zzer zzi = zzgdVar.zzaA().zzi();
        zzgdVar.zzk.zzh();
        zzi.zzb("App measurement initialized, version", 76003L);
        zzgdVar.zzaA().zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzl = zzekVar.zzl();
        if (TextUtils.isEmpty(zzgdVar.zzf)) {
            if (zzgdVar.zzv().zzaf(zzl)) {
                zzgdVar.zzaA().zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzgdVar.zzaA().zzi().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(zzl)));
            }
        }
        zzgdVar.zzaA().zzc().zza("Debug-level message logging enabled");
        if (zzgdVar.zzG != zzgdVar.zzH.get()) {
            zzgdVar.zzaA().zzd().zzc("Not all components initialized", Integer.valueOf(zzgdVar.zzG), Integer.valueOf(zzgdVar.zzH.get()));
        }
        zzgdVar.zzB = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zzO() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void zzP(zzgw zzgwVar) {
        if (zzgwVar != null) {
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    private static final void zzQ(zzf zzfVar) {
        if (zzfVar != null) {
            if (zzfVar.zze()) {
                return;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzfVar.getClass())));
        }
        throw new IllegalStateException("Component not created");
    }

    private static final void zzR(zzgx zzgxVar) {
        if (zzgxVar != null) {
            if (zzgxVar.zzy()) {
                return;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzgxVar.getClass())));
        }
        throw new IllegalStateException("Component not created");
    }

    public static zzgd zzp(Context context, com.google.android.gms.internal.measurement.zzcl zzclVar, Long l10) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new com.google.android.gms.internal.measurement.zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzd == null) {
            synchronized (zzgd.class) {
                if (zzd == null) {
                    zzd = new zzgd(new zzhg(context, zzclVar, l10));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(zzd);
            zzd.zzE = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzd);
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzB() {
        this.zzH.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzC(String str, int i10, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i10 != 200 && i10 != 204) {
            if (i10 == 304) {
                i10 = 304;
            }
            zzaA().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
        }
        if (th == null) {
            zzm().zzn.zza(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", "");
                    String optString2 = jSONObject.optString("gclid", "");
                    double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                    if (TextUtils.isEmpty(optString)) {
                        zzaA().zzc().zza("Deferred Deep Link is empty.");
                        return;
                    }
                    zzln zzv = zzv();
                    zzgd zzgdVar = zzv.zzt;
                    if (!TextUtils.isEmpty(optString) && (queryIntentActivities = zzv.zzt.zze.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.zzt.zzG("auto", "_cmp", bundle);
                        zzln zzv2 = zzv();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = zzv2.zzt.zze.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    zzv2.zzt.zze.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e10) {
                                zzv2.zzt.zzaA().zzd().zzb("Failed to persist Deferred Deep Link. exception", e10);
                                return;
                            }
                        }
                        return;
                    }
                    zzaA().zzk().zzc("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                } catch (JSONException e11) {
                    zzaA().zzd().zzb("Failed to parse the Deferred Deep Link response. exception", e11);
                    return;
                }
            }
            zzaA().zzc().zza("Deferred Deep Link response empty.");
            return;
        }
        zzaA().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzD() {
        this.zzG++;
    }

    public final void zzE() {
        zzaB().zzg();
        zzR(zzr());
        String zzl = zzh().zzl();
        Pair zzb = zzm().zzb(zzl);
        if (this.zzk.zzr() && !((Boolean) zzb.second).booleanValue() && !TextUtils.isEmpty((CharSequence) zzb.first)) {
            zzim zzr = zzr();
            zzr.zzv();
            ConnectivityManager connectivityManager = (ConnectivityManager) zzr.zzt.zze.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                try {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException unused) {
                }
            }
            if (networkInfo != null && networkInfo.isConnected()) {
                zzln zzv = zzv();
                zzh().zzt.zzk.zzh();
                URL zzE = zzv.zzE(76003L, zzl, (String) zzb.first, zzm().zzo.zza() - 1);
                if (zzE != null) {
                    zzim zzr2 = zzr();
                    zzgb zzgbVar = new zzgb(this);
                    zzr2.zzg();
                    zzr2.zzv();
                    Preconditions.checkNotNull(zzE);
                    Preconditions.checkNotNull(zzgbVar);
                    zzr2.zzt.zzaB().zzo(new zzil(zzr2, zzl, zzE, null, null, zzgbVar));
                    return;
                }
                return;
            }
            zzaA().zzk().zza("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        zzaA().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzF(boolean z10) {
        this.zzE = Boolean.valueOf(z10);
    }

    public final void zzG(boolean z10) {
        zzaB().zzg();
        this.zzF = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzH(com.google.android.gms.internal.measurement.zzcl zzclVar) {
        zzai zzaiVar;
        zzaB().zzg();
        zzai zzc = zzm().zzc();
        zzfi zzm = zzm();
        zzgd zzgdVar = zzm.zzt;
        zzm.zzg();
        int i10 = 100;
        int i11 = zzm.zza().getInt("consent_source", 100);
        zzag zzagVar = this.zzk;
        zzgd zzgdVar2 = zzagVar.zzt;
        Boolean zzk = zzagVar.zzk("google_analytics_default_allow_ad_storage");
        zzag zzagVar2 = this.zzk;
        zzgd zzgdVar3 = zzagVar2.zzt;
        Boolean zzk2 = zzagVar2.zzk("google_analytics_default_allow_analytics_storage");
        if ((zzk != null || zzk2 != null) && zzm().zzl(-10)) {
            zzaiVar = new zzai(zzk, zzk2);
            i10 = -10;
        } else {
            if (!TextUtils.isEmpty(zzh().zzm()) && (i11 == 0 || i11 == 30 || i11 == 10 || i11 == 30 || i11 == 30 || i11 == 40)) {
                zzq().zzS(zzai.zza, -10, this.zzc);
            } else if (TextUtils.isEmpty(zzh().zzm()) && zzclVar != null && zzclVar.zzg != null && zzm().zzl(30)) {
                zzaiVar = zzai.zza(zzclVar.zzg);
                if (!zzaiVar.equals(zzai.zza)) {
                    i10 = 30;
                }
            }
            zzaiVar = null;
        }
        if (zzaiVar != null) {
            zzq().zzS(zzaiVar, i10, this.zzc);
            zzc = zzaiVar;
        }
        zzq().zzV(zzc);
        if (zzm().zzc.zza() == 0) {
            zzaA().zzj().zzb("Persisting first open", Long.valueOf(this.zzc));
            zzm().zzc.zzb(this.zzc);
        }
        zzq().zzb.zzc();
        if (!zzM()) {
            if (zzJ()) {
                if (!zzv().zzae("android.permission.INTERNET")) {
                    zzaA().zzd().zza("App is missing INTERNET permission");
                }
                if (!zzv().zzae("android.permission.ACCESS_NETWORK_STATE")) {
                    zzaA().zzd().zza("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!Wrappers.packageManager(this.zze).isCallerInstantApp() && !this.zzk.zzx()) {
                    if (!zzln.zzal(this.zze)) {
                        zzaA().zzd().zza("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!zzln.zzam(this.zze, false)) {
                        zzaA().zzd().zza("AppMeasurementService not registered/enabled");
                    }
                }
                zzaA().zzd().zza("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(zzh().zzm()) || !TextUtils.isEmpty(zzh().zzk())) {
                zzln zzv = zzv();
                String zzm2 = zzh().zzm();
                zzfi zzm3 = zzm();
                zzm3.zzg();
                String string = zzm3.zza().getString("gmp_app_id", null);
                String zzk3 = zzh().zzk();
                zzfi zzm4 = zzm();
                zzm4.zzg();
                if (zzv.zzao(zzm2, string, zzk3, zzm4.zza().getString("admob_app_id", null))) {
                    zzaA().zzi().zza("Rechecking which service to use due to a GMP App Id change");
                    zzfi zzm5 = zzm();
                    zzm5.zzg();
                    Boolean zzd2 = zzm5.zzd();
                    SharedPreferences.Editor edit = zzm5.zza().edit();
                    edit.clear();
                    edit.apply();
                    if (zzd2 != null) {
                        zzm5.zzh(zzd2);
                    }
                    zzi().zzj();
                    this.zzy.zzs();
                    this.zzy.zzr();
                    zzm().zzc.zzb(this.zzc);
                    zzm().zze.zzb(null);
                }
                zzfi zzm6 = zzm();
                String zzm7 = zzh().zzm();
                zzm6.zzg();
                SharedPreferences.Editor edit2 = zzm6.zza().edit();
                edit2.putString("gmp_app_id", zzm7);
                edit2.apply();
                zzfi zzm8 = zzm();
                String zzk4 = zzh().zzk();
                zzm8.zzg();
                SharedPreferences.Editor edit3 = zzm8.zza().edit();
                edit3.putString("admob_app_id", zzk4);
                edit3.apply();
            }
            if (!zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
                zzm().zze.zzb(null);
            }
            zzq().zzO(zzm().zze.zza());
            zzos.zzc();
            if (this.zzk.zzs(null, zzeg.zzae)) {
                try {
                    zzv().zzt.zze.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(zzm().zzp.zza())) {
                        zzaA().zzk().zza("Remote config removed with active feature rollouts");
                        zzm().zzp.zzb(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(zzh().zzm()) || !TextUtils.isEmpty(zzh().zzk())) {
                boolean zzJ = zzJ();
                if (!zzm().zzj() && !this.zzk.zzv()) {
                    zzm().zzi(!zzJ);
                }
                if (zzJ) {
                    zzq().zzz();
                }
                zzu().zza.zza();
                zzt().zzu(new AtomicReference());
                zzt().zzH(zzm().zzs.zza());
            }
        }
        zzm().zzi.zza(true);
    }

    public final boolean zzI() {
        if (this.zzE != null && this.zzE.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean zzJ() {
        if (zza() == 0) {
            return true;
        }
        return false;
    }

    public final boolean zzK() {
        zzaB().zzg();
        return this.zzF;
    }

    public final boolean zzL() {
        return TextUtils.isEmpty(this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzM() {
        boolean z10;
        if (this.zzB) {
            zzaB().zzg();
            Boolean bool = this.zzC;
            if (bool == null || this.zzD == 0 || (!bool.booleanValue() && Math.abs(this.zzr.elapsedRealtime() - this.zzD) > 1000)) {
                this.zzD = this.zzr.elapsedRealtime();
                boolean z11 = true;
                if (zzv().zzae("android.permission.INTERNET") && zzv().zzae("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zze).isCallerInstantApp() || this.zzk.zzx() || (zzln.zzal(this.zze) && zzln.zzam(this.zze, false)))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean valueOf = Boolean.valueOf(z10);
                this.zzC = valueOf;
                if (valueOf.booleanValue()) {
                    if (!zzv().zzY(zzh().zzm(), zzh().zzk()) && TextUtils.isEmpty(zzh().zzk())) {
                        z11 = false;
                    }
                    this.zzC = Boolean.valueOf(z11);
                }
            }
            return this.zzC.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean zzN() {
        return this.zzi;
    }

    public final int zza() {
        zzaB().zzg();
        if (this.zzk.zzv()) {
            return 1;
        }
        Boolean bool = this.zzb;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        zzaB().zzg();
        if (!this.zzF) {
            return 8;
        }
        Boolean zzd2 = zzm().zzd();
        if (zzd2 != null) {
            if (zzd2.booleanValue()) {
                return 0;
            }
            return 3;
        }
        zzag zzagVar = this.zzk;
        zzab zzabVar = zzagVar.zzt.zzj;
        Boolean zzk = zzagVar.zzk("firebase_analytics_collection_enabled");
        if (zzk != null) {
            if (zzk.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bool2 = this.zza;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                return 0;
            }
            return 5;
        } else if (this.zzE == null || this.zzE.booleanValue()) {
            return 0;
        } else {
            return 7;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzet zzaA() {
        zzR(this.zzm);
        return this.zzm;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzga zzaB() {
        zzR(this.zzn);
        return this.zzn;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final Context zzaw() {
        return this.zze;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final Clock zzax() {
        return this.zzr;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzab zzay() {
        return this.zzj;
    }

    public final zzd zzd() {
        zzd zzdVar = this.zzu;
        if (zzdVar != null) {
            return zzdVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final zzag zzf() {
        return this.zzk;
    }

    public final zzaq zzg() {
        zzR(this.zzz);
        return this.zzz;
    }

    public final zzek zzh() {
        zzQ(this.zzA);
        return this.zzA;
    }

    public final zzem zzi() {
        zzQ(this.zzx);
        return this.zzx;
    }

    public final zzeo zzj() {
        return this.zzq;
    }

    public final zzet zzl() {
        zzet zzetVar = this.zzm;
        if (zzetVar != null && zzetVar.zzy()) {
            return zzetVar;
        }
        return null;
    }

    public final zzfi zzm() {
        zzP(this.zzl);
        return this.zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzga zzo() {
        return this.zzn;
    }

    public final zzii zzq() {
        zzQ(this.zzt);
        return this.zzt;
    }

    public final zzim zzr() {
        zzR(this.zzv);
        return this.zzv;
    }

    public final zzix zzs() {
        zzQ(this.zzs);
        return this.zzs;
    }

    public final zzjx zzt() {
        zzQ(this.zzy);
        return this.zzy;
    }

    public final zzkn zzu() {
        zzQ(this.zzo);
        return this.zzo;
    }

    public final zzln zzv() {
        zzP(this.zzp);
        return this.zzp;
    }

    public final String zzw() {
        return this.zzf;
    }

    public final String zzx() {
        return this.zzg;
    }

    public final String zzy() {
        return this.zzh;
    }

    public final String zzz() {
        return this.zzw;
    }
}
