package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfkt extends zzfkp {
    public zzfkt(zzfki zzfkiVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfkiVar, hashSet, jSONObject, j10);
    }

    private final void zzc(String str) {
        zzfjh zza = zzfjh.zza();
        if (zza != null) {
            for (zzfit zzfitVar : zza.zzc()) {
                if (((zzfkp) this).zza.contains(zzfitVar.zzh())) {
                    zzfitVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfkq, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfkq
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
