package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfca {
    public final com.google.android.gms.ads.internal.client.zzfl zza;
    public final zzbla zzb;
    public final zzekx zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;
    public final com.google.android.gms.ads.internal.client.zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbek zzi;
    public final com.google.android.gms.ads.internal.client.zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzcb zzn;
    public final zzfbn zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final com.google.android.gms.ads.internal.client.zzcf zzr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfca(zzfby zzfbyVar, zzfbz zzfbzVar) {
        com.google.android.gms.ads.internal.client.zzfl zzflVar;
        zzbek zzk;
        this.zze = zzfby.zzf(zzfbyVar);
        this.zzf = zzfby.zzH(zzfbyVar);
        this.zzr = zzfby.zzP(zzfbyVar);
        int i10 = zzfby.zzd(zzfbyVar).zza;
        long j10 = zzfby.zzd(zzfbyVar).zzb;
        Bundle bundle = zzfby.zzd(zzfbyVar).zzc;
        int i11 = zzfby.zzd(zzfbyVar).zzd;
        List list = zzfby.zzd(zzfbyVar).zze;
        boolean z10 = zzfby.zzd(zzfbyVar).zzf;
        int i12 = zzfby.zzd(zzfbyVar).zzg;
        boolean z11 = true;
        if (!zzfby.zzd(zzfbyVar).zzh && !zzfby.zzN(zzfbyVar)) {
            z11 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzl(i10, j10, bundle, i11, list, z10, i12, z11, zzfby.zzd(zzfbyVar).zzi, zzfby.zzd(zzfbyVar).zzj, zzfby.zzd(zzfbyVar).zzk, zzfby.zzd(zzfbyVar).zzl, zzfby.zzd(zzfbyVar).zzm, zzfby.zzd(zzfbyVar).zzn, zzfby.zzd(zzfbyVar).zzo, zzfby.zzd(zzfbyVar).zzp, zzfby.zzd(zzfbyVar).zzq, zzfby.zzd(zzfbyVar).zzr, zzfby.zzd(zzfbyVar).zzs, zzfby.zzd(zzfbyVar).zzt, zzfby.zzd(zzfbyVar).zzu, zzfby.zzd(zzfbyVar).zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzfby.zzd(zzfbyVar).zzw), zzfby.zzd(zzfbyVar).zzx);
        zzfbm zzfbmVar = null;
        if (zzfby.zzj(zzfbyVar) != null) {
            zzflVar = zzfby.zzj(zzfbyVar);
        } else if (zzfby.zzk(zzfbyVar) != null) {
            zzflVar = zzfby.zzk(zzfbyVar).zzf;
        } else {
            zzflVar = null;
        }
        this.zza = zzflVar;
        this.zzg = zzfby.zzJ(zzfbyVar);
        this.zzh = zzfby.zzK(zzfbyVar);
        if (zzfby.zzJ(zzfbyVar) == null) {
            zzk = null;
        } else if (zzfby.zzk(zzfbyVar) == null) {
            zzk = new zzbek(new NativeAdOptions.Builder().build());
        } else {
            zzk = zzfby.zzk(zzfbyVar);
        }
        this.zzi = zzk;
        this.zzj = zzfby.zzh(zzfbyVar);
        this.zzk = zzfby.zza(zzfbyVar);
        this.zzl = zzfby.zzb(zzfbyVar);
        this.zzm = zzfby.zzc(zzfbyVar);
        this.zzn = zzfby.zzi(zzfbyVar);
        this.zzb = zzfby.zzl(zzfbyVar);
        this.zzo = new zzfbn(zzfby.zzn(zzfbyVar), zzfbmVar);
        this.zzp = zzfby.zzL(zzfbyVar);
        this.zzc = zzfby.zzm(zzfbyVar);
        this.zzq = zzfby.zzM(zzfbyVar);
    }

    public final zzbgn zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        if (publisherAdViewOptions != null) {
            return publisherAdViewOptions.zzb();
        }
        return this.zzl.zza();
    }

    public final boolean zzb() {
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcS));
    }
}
