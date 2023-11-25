package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfku extends zzfkp {
    public zzfku(zzfki zzfkiVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfkiVar, hashSet, jSONObject, j10);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfjz.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfkq, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfkq
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfjh zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfjh.zza()) != null) {
            for (zzfit zzfitVar : zza.zzc()) {
                if (((zzfkp) this).zza.contains(zzfitVar.zzh())) {
                    zzfitVar.zzg().zzf(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
