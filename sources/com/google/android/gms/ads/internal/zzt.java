package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzaw;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zzck;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzauz;
import com.google.android.gms.internal.ads.zzawm;
import com.google.android.gms.internal.ads.zzaxb;
import com.google.android.gms.internal.ads.zzbca;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbob;
import com.google.android.gms.internal.ads.zzbuv;
import com.google.android.gms.internal.ads.zzbyf;
import com.google.android.gms.internal.ads.zzbzj;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcba;
import com.google.android.gms.internal.ads.zzcdn;
import com.google.android.gms.internal.ads.zzcfu;
import com.google.android.gms.internal.ads.zzedf;
import com.google.android.gms.internal.ads.zzedg;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzt {
    private static final zzt zza = new zzt();
    private final zzbyf zzA;
    private final zzck zzB;
    private final zzcdn zzC;
    private final zzcba zzD;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzm zzc;
    private final com.google.android.gms.ads.internal.util.zzs zzd;
    private final zzcfu zze;
    private final zzaa zzf;
    private final zzauz zzg;
    private final zzbzj zzh;
    private final zzab zzi;
    private final zzawm zzj;
    private final Clock zzk;
    private final zze zzl;
    private final zzbca zzm;
    private final zzaw zzn;
    private final zzbuv zzo;
    private final zzblo zzp;
    private final zzcat zzq;
    private final zzbmz zzr;
    private final zzw zzs;
    private final zzbv zzt;
    private final com.google.android.gms.ads.internal.overlay.zzaa zzu;
    private final com.google.android.gms.ads.internal.overlay.zzab zzv;
    private final zzbob zzw;
    private final zzbw zzx;
    private final zzedg zzy;
    private final zzaxb zzz;

    protected zzt() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = new com.google.android.gms.ads.internal.overlay.zzm();
        com.google.android.gms.ads.internal.util.zzs zzsVar = new com.google.android.gms.ads.internal.util.zzs();
        zzcfu zzcfuVar = new zzcfu();
        zzaa zzo = zzaa.zzo(Build.VERSION.SDK_INT);
        zzauz zzauzVar = new zzauz();
        zzbzj zzbzjVar = new zzbzj();
        zzab zzabVar = new zzab();
        zzawm zzawmVar = new zzawm();
        Clock defaultClock = DefaultClock.getInstance();
        zze zzeVar = new zze();
        zzbca zzbcaVar = new zzbca();
        zzaw zzawVar = new zzaw();
        zzbuv zzbuvVar = new zzbuv();
        zzblo zzbloVar = new zzblo();
        zzcat zzcatVar = new zzcat();
        zzbmz zzbmzVar = new zzbmz();
        zzw zzwVar = new zzw();
        zzbv zzbvVar = new zzbv();
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = new com.google.android.gms.ads.internal.overlay.zzaa();
        com.google.android.gms.ads.internal.overlay.zzab zzabVar2 = new com.google.android.gms.ads.internal.overlay.zzab();
        zzbob zzbobVar = new zzbob();
        zzbw zzbwVar = new zzbw();
        zzedf zzedfVar = new zzedf();
        zzaxb zzaxbVar = new zzaxb();
        zzbyf zzbyfVar = new zzbyf();
        zzck zzckVar = new zzck();
        zzcdn zzcdnVar = new zzcdn();
        zzcba zzcbaVar = new zzcba();
        this.zzb = zzaVar;
        this.zzc = zzmVar;
        this.zzd = zzsVar;
        this.zze = zzcfuVar;
        this.zzf = zzo;
        this.zzg = zzauzVar;
        this.zzh = zzbzjVar;
        this.zzi = zzabVar;
        this.zzj = zzawmVar;
        this.zzk = defaultClock;
        this.zzl = zzeVar;
        this.zzm = zzbcaVar;
        this.zzn = zzawVar;
        this.zzo = zzbuvVar;
        this.zzp = zzbloVar;
        this.zzq = zzcatVar;
        this.zzr = zzbmzVar;
        this.zzt = zzbvVar;
        this.zzs = zzwVar;
        this.zzu = zzaaVar;
        this.zzv = zzabVar2;
        this.zzw = zzbobVar;
        this.zzx = zzbwVar;
        this.zzy = zzedfVar;
        this.zzz = zzaxbVar;
        this.zzA = zzbyfVar;
        this.zzB = zzckVar;
        this.zzC = zzcdnVar;
        this.zzD = zzcbaVar;
    }

    public static zzedg zzA() {
        return zza.zzy;
    }

    public static Clock zzB() {
        return zza.zzk;
    }

    public static zze zza() {
        return zza.zzl;
    }

    public static zzauz zzb() {
        return zza.zzg;
    }

    public static zzawm zzc() {
        return zza.zzj;
    }

    public static zzaxb zzd() {
        return zza.zzz;
    }

    public static zzbca zze() {
        return zza.zzm;
    }

    public static zzbmz zzf() {
        return zza.zzr;
    }

    public static zzbob zzg() {
        return zza.zzw;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzh() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzm zzi() {
        return zza.zzc;
    }

    public static zzw zzj() {
        return zza.zzs;
    }

    public static com.google.android.gms.ads.internal.overlay.zzaa zzk() {
        return zza.zzu;
    }

    public static com.google.android.gms.ads.internal.overlay.zzab zzl() {
        return zza.zzv;
    }

    public static zzbuv zzm() {
        return zza.zzo;
    }

    public static zzbyf zzn() {
        return zza.zzA;
    }

    public static zzbzj zzo() {
        return zza.zzh;
    }

    public static com.google.android.gms.ads.internal.util.zzs zzp() {
        return zza.zzd;
    }

    public static zzaa zzq() {
        return zza.zzf;
    }

    public static zzab zzr() {
        return zza.zzi;
    }

    public static zzaw zzs() {
        return zza.zzn;
    }

    public static zzbv zzt() {
        return zza.zzt;
    }

    public static zzbw zzu() {
        return zza.zzx;
    }

    public static zzck zzv() {
        return zza.zzB;
    }

    public static zzcat zzw() {
        return zza.zzq;
    }

    public static zzcba zzx() {
        return zza.zzD;
    }

    public static zzcdn zzy() {
        return zza.zzC;
    }

    public static zzcfu zzz() {
        return zza.zze;
    }
}
