package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzcdu implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcdu(zzccj zzccjVar) {
        Context context = zzccjVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzccjVar.zzn().zza);
        this.zzc = new WeakReference(zzccjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zze(zzcdu zzcduVar, String str, Map map) {
        zzccj zzccjVar = (zzccj) zzcduVar.zzc.get();
        if (zzccjVar != null) {
            zzccjVar.zzd("onPrecacheEvent", map);
        }
    }

    public abstract void zzf();

    public final void zzg(String str, String str2, String str3, String str4) {
        zzbzt.zza.post(new zzcdt(this, str, str2, str3, str4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzh(String str, String str2, int i10) {
        zzbzt.zza.post(new zzcdr(this, str, str2, i10));
    }

    public final void zzj(String str, String str2, long j10) {
        zzbzt.zza.post(new zzcds(this, str, str2, j10));
    }

    public final void zzn(String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        zzbzt.zza.post(new zzcdq(this, str, str2, i10, i11, j10, j11, z10, i12, i13));
    }

    public final void zzo(String str, String str2, long j10, long j11, boolean z10, long j12, long j13, long j14, int i10, int i11) {
        zzbzt.zza.post(new zzcdp(this, str, str2, j10, j11, j12, j13, j14, z10, i10, i11));
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, zzcdm zzcdmVar) {
        return zzt(str);
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzp(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzq(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzr(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzs(int i10) {
    }
}
