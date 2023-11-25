package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfhi implements zzfhg {
    private final Context zza;
    private final int zzo;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzp = 2;
    private int zzq = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private boolean zzm = false;
    private boolean zzn = false;

    public zzfhi(Context context, int i10) {
        this.zza = context;
        this.zzo = i10;
    }

    public final synchronized zzfhi zzH(int i10) {
        this.zzp = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzb(zzfbq zzfbqVar) {
        zzr(zzfbqVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzc(String str) {
        zzs(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzd(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zze(String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzf(boolean z10) {
        zzv(z10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzg(Throwable th) {
        zzw(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzh() {
        zzx();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzi() {
        zzy();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final synchronized boolean zzj() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final boolean zzk() {
        if (!TextUtils.isEmpty(this.zzh)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final synchronized zzfhk zzl() {
        zzfhj zzfhjVar = null;
        if (this.zzm) {
            return null;
        }
        this.zzm = true;
        if (!this.zzn) {
            zzx();
        }
        if (this.zzc < 0) {
            zzy();
        }
        return new zzfhk(this, zzfhjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzm(int i10) {
        zzH(i10);
        return this;
    }

    public final synchronized zzfhi zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder == null) {
            return this;
        }
        zzcwb zzcwbVar = (zzcwb) iBinder;
        String zzk = zzcwbVar.zzk();
        if (!TextUtils.isEmpty(zzk)) {
            this.zzf = zzk;
        }
        String zzi = zzcwbVar.zzi();
        if (!TextUtils.isEmpty(zzi)) {
            this.zzg = zzi;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x002b, code lost:
    
        r2.zzg = r0.zzac;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.zzfhi zzr(com.google.android.gms.internal.ads.zzfbq r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfbi r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.zzfbi r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            r2.zzf = r0     // Catch: java.lang.Throwable -> L31
        L11:
            java.util.List r3 = r3.zza     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L17:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzfbe r0 = (com.google.android.gms.internal.ads.zzfbe) r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r0.zzac     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L17
            java.lang.String r3 = r0.zzac     // Catch: java.lang.Throwable -> L31
            r2.zzg = r3     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r2)
            return r2
        L31:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfhi.zzr(com.google.android.gms.internal.ads.zzfbq):com.google.android.gms.internal.ads.zzfhi");
    }

    public final synchronized zzfhi zzs(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziu)).booleanValue()) {
            this.zzl = str;
        }
        return this;
    }

    public final synchronized zzfhi zzt(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfhi zzu(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfhi zzv(boolean z10) {
        this.zzd = z10;
        return this;
    }

    public final synchronized zzfhi zzw(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziu)).booleanValue()) {
            this.zzk = zzbtf.zzd(th);
            this.zzj = (String) zzfrv.zzc(zzfqt.zzc('\n')).zzd(zzbtf.zzc(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfhi zzx() {
        Configuration configuration;
        this.zze = com.google.android.gms.ads.internal.zzt.zzq().zzn(this.zza);
        Resources resources = this.zza.getResources();
        int i10 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i10 = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzq = i10;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        this.zzn = true;
        return this;
    }

    public final synchronized zzfhi zzy() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        return this;
    }
}
