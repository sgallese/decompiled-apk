package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzewm implements zzeln {
    protected final zzchd zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzexc zzd;
    private final zzeyv zze;
    private final zzcag zzf;
    private final ViewGroup zzg;
    private final zzfhu zzh;
    private final zzfby zzi;
    private com.google.common.util.concurrent.a zzj;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzewm(Context context, Executor executor, zzchd zzchdVar, zzeyv zzeyvVar, zzexc zzexcVar, zzfby zzfbyVar, zzcag zzcagVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzchdVar;
        this.zze = zzeyvVar;
        this.zzd = zzexcVar;
        this.zzi = zzfbyVar;
        this.zzf = zzcagVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzchdVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzcvo zzm(zzeyt zzeytVar) {
        zzewl zzewlVar = (zzewl) zzeytVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhP)).booleanValue()) {
            zzcpz zzcpzVar = new zzcpz(this.zzg);
            zzcvq zzcvqVar = new zzcvq();
            zzcvqVar.zze(this.zzb);
            zzcvqVar.zzi(zzewlVar.zza);
            zzcvs zzj = zzcvqVar.zzj();
            zzdbt zzdbtVar = new zzdbt();
            zzdbtVar.zzc(this.zzd, this.zzc);
            zzdbtVar.zzl(this.zzd, this.zzc);
            return zze(zzcpzVar, zzj, zzdbtVar.zzn());
        }
        zzexc zzi = zzexc.zzi(this.zzd);
        zzdbt zzdbtVar2 = new zzdbt();
        zzdbtVar2.zzb(zzi, this.zzc);
        zzdbtVar2.zzg(zzi, this.zzc);
        zzdbtVar2.zzh(zzi, this.zzc);
        zzdbtVar2.zzi(zzi, this.zzc);
        zzdbtVar2.zzc(zzi, this.zzc);
        zzdbtVar2.zzl(zzi, this.zzc);
        zzdbtVar2.zzm(zzi);
        zzcpz zzcpzVar2 = new zzcpz(this.zzg);
        zzcvq zzcvqVar2 = new zzcvq();
        zzcvqVar2.zze(this.zzb);
        zzcvqVar2.zzi(zzewlVar.zza);
        return zze(zzcpzVar2, zzcvqVar2.zzj(), zzdbtVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeln
    public final boolean zza() {
        com.google.common.util.concurrent.a aVar = this.zzj;
        if (aVar != null && !aVar.isDone()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:9:0x0026, B:14:0x0045, B:17:0x0056, B:21:0x005c, B:23:0x006c, B:25:0x0074, B:27:0x0089, B:29:0x00a2, B:31:0x00a6, B:32:0x00af, B:12:0x003e), top: B:38:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:9:0x0026, B:14:0x0045, B:17:0x0056, B:21:0x005c, B:23:0x006c, B:25:0x0074, B:27:0x0089, B:29:0x00a2, B:31:0x00a6, B:32:0x00af, B:12:0x003e), top: B:38:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzeln
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl r8, java.lang.String r9, com.google.android.gms.internal.ads.zzell r10, com.google.android.gms.internal.ads.zzelm r11) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewm.zzb(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.google.android.gms.internal.ads.zzell, com.google.android.gms.internal.ads.zzelm):boolean");
    }

    protected abstract zzcvo zze(zzcpz zzcpzVar, zzcvs zzcvsVar, zzdbv zzdbvVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk() {
        this.zzd.zzbF(zzfdb.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzt(zzwVar);
    }
}
