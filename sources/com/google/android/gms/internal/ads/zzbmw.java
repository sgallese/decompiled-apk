package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbmw implements zzbln, zzbmv {
    private final zzbmv zza;
    private final HashSet zzb = new HashSet();

    public zzbmw(zzbmv zzbmvVar) {
        this.zza = zzbmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbln, com.google.android.gms.internal.ads.zzbly
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbln, com.google.android.gms.internal.ads.zzbly
    public final /* synthetic */ void zzb(String str, String str2) {
        zzblm.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbir) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbir) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbll
    public final /* synthetic */ void zzd(String str, Map map) {
        zzblm.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbln, com.google.android.gms.internal.ads.zzbll
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzblm.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzblm.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzq(String str, zzbir zzbirVar) {
        this.zza.zzq(str, zzbirVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbirVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzr(String str, zzbir zzbirVar) {
        this.zza.zzr(str, zzbirVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbirVar));
    }
}
