package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzfkq extends AsyncTask {
    private zzfkr zza;
    protected final zzfki zzd;

    public zzfkq(zzfki zzfkiVar) {
        this.zzd = zzfkiVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfkr zzfkrVar = this.zza;
        if (zzfkrVar != null) {
            zzfkrVar.zza(this);
        }
    }

    public final void zzb(zzfkr zzfkrVar) {
        this.zza = zzfkrVar;
    }
}
