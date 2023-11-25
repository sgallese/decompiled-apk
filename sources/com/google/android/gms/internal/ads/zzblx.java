package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzblx implements zzblp, zzbln {
    private final zzcfi zza;

    public zzblx(Context context, zzcag zzcagVar, zzaqx zzaqxVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcft {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcfi zza = zzcfu.zza(context, zzcgx.zza(), "", false, false, null, null, zzcagVar, null, null, null, zzaxe.zza(), null, null, null);
        this.zza = zza;
        ((View) zza).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        if (zzbzt.zzu()) {
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zza(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbls
            @Override // java.lang.Runnable
            public final void run() {
                zzblx.this.zzm(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final /* synthetic */ void zzb(String str, String str2) {
        zzblm.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbll
    public final /* synthetic */ void zzd(String str, Map map) {
        zzblm.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbll
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzblm.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzf(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblt
            @Override // java.lang.Runnable
            public final void run() {
                zzblx.this.zzn(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzg(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblv
            @Override // java.lang.Runnable
            public final void run() {
                zzblx.this.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzh(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblu
            @Override // java.lang.Runnable
            public final void run() {
                zzblx.this.zzp(format);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final boolean zzi() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final zzbmw zzj() {
        return new zzbmw(this);
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzk(final zzbme zzbmeVar) {
        this.zza.zzN().zzG(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzblq
            @Override // com.google.android.gms.internal.ads.zzcgu
            public final void zza() {
                zzbme zzbmeVar2 = zzbme.this;
                final zzbmu zzbmuVar = zzbmeVar2.zza;
                final ArrayList arrayList = zzbmeVar2.zzb;
                final long j10 = zzbmeVar2.zzc;
                final zzbmt zzbmtVar = zzbmeVar2.zzd;
                final zzblp zzblpVar = zzbmeVar2.zze;
                arrayList.add(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - j10));
                com.google.android.gms.ads.internal.util.zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbmu.this.zzi(zzbmtVar, zzblpVar, arrayList, j10);
                    }
                }, (long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzc)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzblm.zzd(this, str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzq(String str, zzbir zzbirVar) {
        this.zza.zzad(str, new zzblw(this, zzbirVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzr(String str, final zzbir zzbirVar) {
        this.zza.zzav(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzblr
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzbir zzbirVar2;
                zzbir zzbirVar3 = zzbir.this;
                zzbir zzbirVar4 = (zzbir) obj;
                if (zzbirVar4 instanceof zzblw) {
                    zzbirVar2 = ((zzblw) zzbirVar4).zzb;
                    if (zzbirVar2.equals(zzbirVar3)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        });
    }
}
