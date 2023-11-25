package com.google.android.gms.internal.ads;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeds {
    private final String zzc;
    private zzfbi zzd = null;
    private zzfbe zze = null;
    private com.google.android.gms.ads.internal.client.zzu zzf = null;
    private final Map zzb = DesugarCollections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzeds(String str) {
        this.zzc = str;
    }

    private final synchronized void zzi(zzfbe zzfbeVar, int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdo)).booleanValue()) {
            str = zzfbeVar.zzaq;
        } else {
            str = zzfbeVar.zzx;
        }
        if (this.zzb.containsKey(str)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = zzfbeVar.zzw.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, zzfbeVar.zzw.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgG)).booleanValue()) {
            str2 = zzfbeVar.zzG;
            str3 = zzfbeVar.zzH;
            str4 = zzfbeVar.zzI;
            str5 = zzfbeVar.zzJ;
        } else {
            str2 = "";
            str3 = "";
            str4 = "";
            str5 = "";
        }
        com.google.android.gms.ads.internal.client.zzu zzuVar = new com.google.android.gms.ads.internal.client.zzu(zzfbeVar.zzF, 0L, null, bundle, str2, str3, str4, str5);
        try {
            this.zza.add(i10, zzuVar);
        } catch (IndexOutOfBoundsException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(str, zzuVar);
    }

    private final void zzj(zzfbe zzfbeVar, long j10, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z10) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdo)).booleanValue()) {
            str = zzfbeVar.zzaq;
        } else {
            str = zzfbeVar.zzx;
        }
        if (!this.zzb.containsKey(str)) {
            return;
        }
        if (this.zze == null) {
            this.zze = zzfbeVar;
        }
        com.google.android.gms.ads.internal.client.zzu zzuVar = (com.google.android.gms.ads.internal.client.zzu) this.zzb.get(str);
        zzuVar.zzb = j10;
        zzuVar.zzc = zzeVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgH)).booleanValue() && z10) {
            this.zzf = zzuVar;
        }
    }

    public final com.google.android.gms.ads.internal.client.zzu zza() {
        return this.zzf;
    }

    public final zzcwb zzb() {
        return new zzcwb(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfbe zzfbeVar) {
        zzi(zzfbeVar, this.zza.size());
    }

    public final void zze(zzfbe zzfbeVar, long j10, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzj(zzfbeVar, j10, zzeVar, false);
    }

    public final void zzf(zzfbe zzfbeVar, long j10, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzj(zzfbeVar, j10, null, true);
    }

    public final synchronized void zzg(String str, List list) {
        if (!this.zzb.containsKey(str)) {
            return;
        }
        int indexOf = this.zza.indexOf((com.google.android.gms.ads.internal.client.zzu) this.zzb.get(str));
        try {
            this.zza.remove(indexOf);
        } catch (IndexOutOfBoundsException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
        }
        this.zzb.remove(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzi((zzfbe) it.next(), indexOf);
            indexOf++;
        }
    }

    public final void zzh(zzfbi zzfbiVar) {
        this.zzd = zzfbiVar;
    }
}
