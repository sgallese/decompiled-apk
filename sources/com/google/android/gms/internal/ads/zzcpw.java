package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcpw extends zzcse {
    private final zzcfi zzc;
    private final int zzd;
    private final Context zze;
    private final zzcpl zzf;
    private final zzdfy zzg;
    private final zzdde zzh;
    private final zzcwv zzi;
    private final boolean zzj;
    private final zzbzn zzk;
    private boolean zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcpw(zzcsd zzcsdVar, Context context, zzcfi zzcfiVar, int i10, zzcpl zzcplVar, zzdfy zzdfyVar, zzdde zzddeVar, zzcwv zzcwvVar, zzbzn zzbznVar) {
        super(zzcsdVar);
        this.zzl = false;
        this.zzc = zzcfiVar;
        this.zze = context;
        this.zzd = i10;
        this.zzf = zzcplVar;
        this.zzg = zzdfyVar;
        this.zzh = zzddeVar;
        this.zzi = zzcwvVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzff)).booleanValue();
        this.zzk = zzbznVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcse
    public final void zzb() {
        super.zzb();
        zzcfi zzcfiVar = this.zzc;
        if (zzcfiVar != null) {
            zzcfiVar.destroy();
        }
    }

    public final void zzc(zzavs zzavsVar) {
        zzcfi zzcfiVar = this.zzc;
        if (zzcfiVar != null) {
            zzcfiVar.zzah(zzavsVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(android.app.Activity r3, com.google.android.gms.internal.ads.zzawf r4, boolean r5) throws android.os.RemoteException {
        /*
            r2 = this;
            if (r3 != 0) goto L4
            android.content.Context r3 = r2.zze
        L4:
            boolean r4 = r2.zzj
            if (r4 == 0) goto Ld
            com.google.android.gms.internal.ads.zzdde r4 = r2.zzh
            r4.zzb()
        Ld:
            com.google.android.gms.internal.ads.zzbbj r4 = com.google.android.gms.internal.ads.zzbbr.zzaB
            com.google.android.gms.internal.ads.zzbbp r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r0.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L61
            com.google.android.gms.ads.internal.zzt.zzp()
            boolean r4 = com.google.android.gms.ads.internal.util.zzs.zzD(r3)
            if (r4 == 0) goto L61
            java.lang.String r4 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.zzcaa.zzj(r4)
            com.google.android.gms.internal.ads.zzcwv r4 = r2.zzi
            r4.zzb()
            com.google.android.gms.internal.ads.zzbbj r4 = com.google.android.gms.internal.ads.zzbbr.zzaC
            com.google.android.gms.internal.ads.zzbbp r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Ld2
            com.google.android.gms.internal.ads.zzfln r4 = new com.google.android.gms.internal.ads.zzfln
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzbv r5 = com.google.android.gms.ads.internal.zzt.zzt()
            android.os.Looper r5 = r5.zzb()
            r4.<init>(r3, r5)
            com.google.android.gms.internal.ads.zzfbr r3 = r2.zza
            com.google.android.gms.internal.ads.zzfbq r3 = r3.zzb
            com.google.android.gms.internal.ads.zzfbi r3 = r3.zzb
            java.lang.String r3 = r3.zzb
            r4.zza(r3)
            return
        L61:
            com.google.android.gms.internal.ads.zzbbj r4 = com.google.android.gms.internal.ads.zzbbr.zzkC
            com.google.android.gms.internal.ads.zzbbp r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r0.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto La0
            com.google.android.gms.internal.ads.zzcfi r4 = r2.zzc
            if (r4 == 0) goto La0
            com.google.android.gms.internal.ads.zzfbe r4 = r4.zzD()
            if (r4 == 0) goto La0
            boolean r1 = r4.zzar
            if (r1 == 0) goto La0
            int r4 = r4.zzas
            com.google.android.gms.internal.ads.zzbzn r1 = r2.zzk
            int r1 = r1.zzb()
            if (r4 != r1) goto L8d
            goto La0
        L8d:
            java.lang.String r3 = "The app open consent form has been shown."
            com.google.android.gms.internal.ads.zzcaa.zzj(r3)
            com.google.android.gms.internal.ads.zzcwv r3 = r2.zzi
            r4 = 12
            java.lang.String r5 = "The consent form has already been shown."
            com.google.android.gms.ads.internal.client.zze r4 = com.google.android.gms.internal.ads.zzfdb.zzd(r4, r5, r0)
            r3.zza(r4)
            return
        La0:
            boolean r4 = r2.zzl
            if (r4 == 0) goto Lb4
            java.lang.String r4 = "App open interstitial ad is already visible."
            com.google.android.gms.internal.ads.zzcaa.zzj(r4)
            com.google.android.gms.internal.ads.zzcwv r4 = r2.zzi
            r1 = 10
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfdb.zzd(r1, r0, r0)
            r4.zza(r0)
        Lb4:
            boolean r4 = r2.zzl
            if (r4 != 0) goto Ld2
            com.google.android.gms.internal.ads.zzdfy r4 = r2.zzg     // Catch: com.google.android.gms.internal.ads.zzdfx -> Lcc
            com.google.android.gms.internal.ads.zzcwv r0 = r2.zzi     // Catch: com.google.android.gms.internal.ads.zzdfx -> Lcc
            r4.zza(r5, r3, r0)     // Catch: com.google.android.gms.internal.ads.zzdfx -> Lcc
            boolean r3 = r2.zzj     // Catch: com.google.android.gms.internal.ads.zzdfx -> Lcc
            if (r3 == 0) goto Lc8
            com.google.android.gms.internal.ads.zzdde r3 = r2.zzh     // Catch: com.google.android.gms.internal.ads.zzdfx -> Lcc
            r3.zza()     // Catch: com.google.android.gms.internal.ads.zzdfx -> Lcc
        Lc8:
            r3 = 1
            r2.zzl = r3
            return
        Lcc:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzcwv r4 = r2.zzi
            r4.zzc(r3)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcpw.zzd(android.app.Activity, com.google.android.gms.internal.ads.zzawf, boolean):void");
    }

    public final void zze(long j10, int i10) {
        this.zzf.zza(j10, i10);
    }
}
