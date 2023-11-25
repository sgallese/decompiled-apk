package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfby {
    private com.google.android.gms.ads.internal.client.zzl zza;
    private com.google.android.gms.ads.internal.client.zzq zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzfl zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbek zzh;
    private com.google.android.gms.ads.internal.client.zzw zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzcb zzl;
    private zzbla zzn;
    private zzekx zzq;
    private com.google.android.gms.ads.internal.client.zzcf zzs;
    private int zzm = 1;
    private final zzfbl zzo = new zzfbl();
    private boolean zzp = false;
    private boolean zzr = false;

    public static /* bridge */ /* synthetic */ String zzH(zzfby zzfbyVar) {
        return zzfbyVar.zzc;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzJ(zzfby zzfbyVar) {
        return zzfbyVar.zzf;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzK(zzfby zzfbyVar) {
        return zzfbyVar.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzL(zzfby zzfbyVar) {
        return zzfbyVar.zzp;
    }

    public static /* bridge */ /* synthetic */ boolean zzM(zzfby zzfbyVar) {
        return zzfbyVar.zzr;
    }

    public static /* bridge */ /* synthetic */ boolean zzN(zzfby zzfbyVar) {
        return zzfbyVar.zze;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzcf zzP(zzfby zzfbyVar) {
        return zzfbyVar.zzs;
    }

    public static /* bridge */ /* synthetic */ int zza(zzfby zzfbyVar) {
        return zzfbyVar.zzm;
    }

    public static /* bridge */ /* synthetic */ AdManagerAdViewOptions zzb(zzfby zzfbyVar) {
        return zzfbyVar.zzj;
    }

    public static /* bridge */ /* synthetic */ PublisherAdViewOptions zzc(zzfby zzfbyVar) {
        return zzfbyVar.zzk;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzl zzd(zzfby zzfbyVar) {
        return zzfbyVar.zza;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzq zzf(zzfby zzfbyVar) {
        return zzfbyVar.zzb;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzw zzh(zzfby zzfbyVar) {
        return zzfbyVar.zzi;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzcb zzi(zzfby zzfbyVar) {
        return zzfbyVar.zzl;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzfl zzj(zzfby zzfbyVar) {
        return zzfbyVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzbek zzk(zzfby zzfbyVar) {
        return zzfbyVar.zzh;
    }

    public static /* bridge */ /* synthetic */ zzbla zzl(zzfby zzfbyVar) {
        return zzfbyVar.zzn;
    }

    public static /* bridge */ /* synthetic */ zzekx zzm(zzfby zzfbyVar) {
        return zzfbyVar.zzq;
    }

    public static /* bridge */ /* synthetic */ zzfbl zzn(zzfby zzfbyVar) {
        return zzfbyVar.zzo;
    }

    public final zzfby zzA(zzbek zzbekVar) {
        this.zzh = zzbekVar;
        return this;
    }

    public final zzfby zzB(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfby zzC(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfby zzD(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfby zzE(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza = zzlVar;
        return this;
    }

    public final zzfby zzF(com.google.android.gms.ads.internal.client.zzfl zzflVar) {
        this.zzd = zzflVar;
        return this;
    }

    public final zzfca zzG() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfca(this, null);
    }

    public final String zzI() {
        return this.zzc;
    }

    public final boolean zzO() {
        return this.zzp;
    }

    public final zzfby zzQ(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zzs = zzcfVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzl zze() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return this.zzb;
    }

    public final zzfbl zzo() {
        return this.zzo;
    }

    public final zzfby zzp(zzfca zzfcaVar) {
        this.zzo.zza(zzfcaVar.zzo.zza);
        this.zza = zzfcaVar.zzd;
        this.zzb = zzfcaVar.zze;
        this.zzs = zzfcaVar.zzr;
        this.zzc = zzfcaVar.zzf;
        this.zzd = zzfcaVar.zza;
        this.zzf = zzfcaVar.zzg;
        this.zzg = zzfcaVar.zzh;
        this.zzh = zzfcaVar.zzi;
        this.zzi = zzfcaVar.zzj;
        zzq(zzfcaVar.zzl);
        zzD(zzfcaVar.zzm);
        this.zzp = zzfcaVar.zzp;
        this.zzq = zzfcaVar.zzc;
        this.zzr = zzfcaVar.zzq;
        return this;
    }

    public final zzfby zzq(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfby zzr(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb = zzqVar;
        return this;
    }

    public final zzfby zzs(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfby zzt(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi = zzwVar;
        return this;
    }

    public final zzfby zzu(zzekx zzekxVar) {
        this.zzq = zzekxVar;
        return this;
    }

    public final zzfby zzv(zzbla zzblaVar) {
        this.zzn = zzblaVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzfl(false, true, false);
        return this;
    }

    public final zzfby zzw(boolean z10) {
        this.zzp = z10;
        return this;
    }

    public final zzfby zzx(boolean z10) {
        this.zzr = true;
        return this;
    }

    public final zzfby zzy(boolean z10) {
        this.zze = z10;
        return this;
    }

    public final zzfby zzz(int i10) {
        this.zzm = i10;
        return this;
    }
}
