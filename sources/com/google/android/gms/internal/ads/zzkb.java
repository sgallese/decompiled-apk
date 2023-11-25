package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzkb extends zzm implements zziw {
    public static final /* synthetic */ int zzd = 0;
    private final zzlw zzA;
    private final long zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private int zzF;
    private zzlr zzG;
    private zzcl zzH;
    private zzbv zzI;
    private zzbv zzJ;
    private zzam zzK;
    private zzam zzL;
    private AudioTrack zzM;
    private Object zzN;
    private Surface zzO;
    private int zzP;
    private zzfc zzQ;
    private zzid zzR;
    private zzid zzS;
    private int zzT;
    private zzk zzU;
    private float zzV;
    private boolean zzW;
    private zzdx zzX;
    private boolean zzY;
    private boolean zzZ;
    private zzz zzaa;
    private zzdn zzab;
    private zzbv zzac;
    private zzlg zzad;
    private int zzae;
    private long zzaf;
    private final zzjg zzag;
    private zzvm zzah;
    final zzxm zzb;
    final zzcl zzc;
    private final zzeb zze;
    private final Context zzf;
    private final zzcp zzg;
    private final zzln[] zzh;
    private final zzxl zzi;
    private final zzej zzj;
    private final zzkl zzk;
    private final zzep zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzct zzn;
    private final List zzo;
    private final boolean zzp;
    private final zztr zzq;
    private final zzlx zzr;
    private final Looper zzs;
    private final zzxt zzt;
    private final zzdz zzu;
    private final zzjx zzv;
    private final zzjz zzw;
    private final zzhx zzx;
    private final zzib zzy;
    private final zzlv zzz;

    static {
        zzbq.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.zzxs, com.google.android.gms.internal.ads.zzlx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.google.android.gms.internal.ads.zzjy, com.google.android.gms.internal.ads.zzjw] */
    @SuppressLint({"HandlerLeak"})
    public zzkb(zziv zzivVar, zzcp zzcpVar) {
        zzoh zza;
        Object obj;
        zzeb zzebVar = new zzeb(zzdz.zza);
        this.zze = zzebVar;
        try {
            zzes.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.1.0] [" + zzfk.zze + "]");
            Context applicationContext = zzivVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? apply = zzivVar.zzh.apply(zzivVar.zzb);
            this.zzr = apply;
            this.zzU = zzivVar.zzj;
            this.zzP = zzivVar.zzk;
            this.zzW = false;
            this.zzB = zzivVar.zzo;
            ?? r82 = 0;
            zzjx zzjxVar = new zzjx(this, r82);
            this.zzv = zzjxVar;
            zzjz zzjzVar = new zzjz(r82);
            this.zzw = zzjzVar;
            Handler handler = new Handler(zzivVar.zzi);
            zzln[] zza2 = ((zzip) zzivVar.zzc).zza.zza(handler, zzjxVar, zzjxVar, zzjxVar, zzjxVar);
            this.zzh = zza2;
            int length = zza2.length;
            zzxl zzxlVar = (zzxl) zzivVar.zze.zza();
            this.zzi = zzxlVar;
            this.zzq = zziv.zza(((zziq) zzivVar.zzd).zza);
            zzxx zzg = zzxx.zzg(((zzit) zzivVar.zzg).zza);
            this.zzt = zzg;
            this.zzp = zzivVar.zzl;
            this.zzG = zzivVar.zzm;
            Looper looper = zzivVar.zzi;
            this.zzs = looper;
            zzdz zzdzVar = zzivVar.zzb;
            this.zzu = zzdzVar;
            this.zzg = zzcpVar;
            zzep zzepVar = new zzep(looper, zzdzVar, new zzen() { // from class: com.google.android.gms.internal.ads.zzjf
                @Override // com.google.android.gms.internal.ads.zzen
                public final void zza(Object obj2, zzah zzahVar) {
                    zzcm zzcmVar = (zzcm) obj2;
                }
            });
            this.zzl = zzepVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzah = new zzvm(0);
            int length2 = zza2.length;
            zzxm zzxmVar = new zzxm(new zzlq[2], new zzxf[2], zzdh.zza, null);
            this.zzb = zzxmVar;
            this.zzn = new zzct();
            zzcj zzcjVar = new zzcj();
            zzcjVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32);
            zzxlVar.zzm();
            zzcjVar.zzd(29, true);
            zzcjVar.zzd(23, false);
            zzcjVar.zzd(25, false);
            zzcjVar.zzd(33, false);
            zzcjVar.zzd(26, false);
            zzcjVar.zzd(34, false);
            zzcl zze = zzcjVar.zze();
            this.zzc = zze;
            zzcj zzcjVar2 = new zzcj();
            zzcjVar2.zzb(zze);
            zzcjVar2.zza(4);
            zzcjVar2.zza(10);
            this.zzH = zzcjVar2.zze();
            this.zzj = zzdzVar.zzb(looper, null);
            zzjg zzjgVar = new zzjg(this);
            this.zzag = zzjgVar;
            this.zzad = zzlg.zzi(zzxmVar);
            apply.zzP(zzcpVar, looper);
            int i10 = zzfk.zza;
            if (i10 < 31) {
                zza = new zzoh();
            } else {
                zza = zzjs.zza(applicationContext, this, zzivVar.zzp);
            }
            this.zzk = new zzkl(zza2, zzxlVar, zzxmVar, (zzko) zzivVar.zzf.zza(), zzg, 0, false, apply, this.zzG, zzivVar.zzr, zzivVar.zzn, false, looper, zzdzVar, zzjgVar, zza, null);
            this.zzV = 1.0f;
            zzbv zzbvVar = zzbv.zza;
            this.zzI = zzbvVar;
            this.zzJ = zzbvVar;
            this.zzac = zzbvVar;
            int i11 = -1;
            this.zzae = -1;
            if (i10 >= 21) {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                if (audioManager != null) {
                    i11 = audioManager.generateAudioSessionId();
                }
                this.zzT = i11;
                obj = null;
            } else {
                AudioTrack audioTrack = this.zzM;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.zzM.release();
                    obj = null;
                    this.zzM = null;
                } else {
                    obj = null;
                }
                if (this.zzM == null) {
                    this.zzM = new AudioTrack(3, WearableStatusCodes.TARGET_NODE_NOT_CONNECTED, 4, 2, 2, 0, 0);
                }
                this.zzT = this.zzM.getAudioSessionId();
            }
            this.zzX = zzdx.zza;
            this.zzY = true;
            apply.getClass();
            zzepVar.zzb(apply);
            zzg.zze(new Handler(looper), apply);
            copyOnWriteArraySet.add(zzjxVar);
            this.zzx = new zzhx(zzivVar.zza, handler, zzjxVar);
            this.zzy = new zzib(zzivVar.zza, handler, zzjxVar);
            zzfk.zzD(obj, obj);
            this.zzz = new zzlv(zzivVar.zza);
            this.zzA = new zzlw(zzivVar.zza);
            this.zzaa = new zzx(0).zza();
            this.zzab = zzdn.zza;
            this.zzQ = zzfc.zza;
            zzxlVar.zzj(this.zzU);
            zzah(1, 10, Integer.valueOf(this.zzT));
            zzah(2, 10, Integer.valueOf(this.zzT));
            zzah(1, 3, this.zzU);
            zzah(2, 4, Integer.valueOf(this.zzP));
            zzah(2, 5, 0);
            zzah(1, 9, Boolean.valueOf(this.zzW));
            zzah(2, 7, zzjzVar);
            zzah(6, 8, zzjzVar);
            zzebVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ void zzP(zzkb zzkbVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzkbVar.zzaj(surface);
        zzkbVar.zzO = surface;
    }

    private final int zzX(zzlg zzlgVar) {
        if (zzlgVar.zza.zzo()) {
            return this.zzae;
        }
        return zzlgVar.zza.zzn(zzlgVar.zzb.zza, this.zzn).zzd;
    }

    public static int zzY(boolean z10, int i10) {
        if (!z10 || i10 == 1) {
            return 1;
        }
        return 2;
    }

    private final long zzZ(zzlg zzlgVar) {
        if (zzlgVar.zzb.zzb()) {
            zzlgVar.zza.zzn(zzlgVar.zzb.zza, this.zzn);
            long j10 = zzlgVar.zzc;
            if (j10 == -9223372036854775807L) {
                long j11 = zzlgVar.zza.zze(zzX(zzlgVar), this.zza, 0L).zzn;
                return zzfk.zzr(0L);
            }
            return zzfk.zzr(j10) + zzfk.zzr(0L);
        }
        return zzfk.zzr(zzaa(zzlgVar));
    }

    private final long zzaa(zzlg zzlgVar) {
        long j10;
        if (zzlgVar.zza.zzo()) {
            return zzfk.zzp(this.zzaf);
        }
        if (zzlgVar.zzo) {
            j10 = zzlgVar.zza();
        } else {
            j10 = zzlgVar.zzr;
        }
        if (zzlgVar.zzb.zzb()) {
            return j10;
        }
        zzac(zzlgVar.zza, zzlgVar.zzb, j10);
        return j10;
    }

    private static long zzab(zzlg zzlgVar) {
        zzcv zzcvVar = new zzcv();
        zzct zzctVar = new zzct();
        zzlgVar.zza.zzn(zzlgVar.zzb.zza, zzctVar);
        long j10 = zzlgVar.zzc;
        if (j10 == -9223372036854775807L) {
            long j11 = zzlgVar.zza.zze(zzctVar.zzd, zzcvVar, 0L).zzn;
            return 0L;
        }
        return j10;
    }

    private final long zzac(zzcw zzcwVar, zzts zztsVar, long j10) {
        zzcwVar.zzn(zztsVar.zza, this.zzn);
        return j10;
    }

    private final Pair zzad(zzcw zzcwVar, int i10, long j10) {
        if (zzcwVar.zzo()) {
            this.zzae = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.zzaf = j10;
            return null;
        }
        if (i10 == -1 || i10 >= zzcwVar.zzc()) {
            i10 = zzcwVar.zzg(false);
            long j11 = zzcwVar.zze(i10, this.zza, 0L).zzn;
            j10 = zzfk.zzr(0L);
        }
        return zzcwVar.zzl(this.zza, this.zzn, i10, zzfk.zzp(j10));
    }

    private final zzlg zzae(zzlg zzlgVar, zzcw zzcwVar, Pair pair) {
        boolean z10;
        zzts zztsVar;
        zzvs zzvsVar;
        zzxm zzxmVar;
        List list;
        long j10;
        if (!zzcwVar.zzo() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        zzdy.zzd(z10);
        zzcw zzcwVar2 = zzlgVar.zza;
        long zzZ = zzZ(zzlgVar);
        zzlg zzh = zzlgVar.zzh(zzcwVar);
        if (zzcwVar.zzo()) {
            zzts zzj = zzlg.zzj();
            long zzp = zzfk.zzp(this.zzaf);
            zzlg zzc = zzh.zzd(zzj, zzp, zzp, zzp, 0L, zzvs.zza, this.zzb, zzfud.zzl()).zzc(zzj);
            zzc.zzp = zzc.zzr;
            return zzc;
        }
        Object obj = zzh.zzb.zza;
        int i10 = zzfk.zza;
        boolean z11 = !obj.equals(pair.first);
        if (z11) {
            zztsVar = new zzts(pair.first);
        } else {
            zztsVar = zzh.zzb;
        }
        zzts zztsVar2 = zztsVar;
        long longValue = ((Long) pair.second).longValue();
        long zzp2 = zzfk.zzp(zzZ);
        if (!zzcwVar2.zzo()) {
            zzcwVar2.zzn(obj, this.zzn);
        }
        if (!z11 && longValue >= zzp2) {
            if (longValue == zzp2) {
                int zza = zzcwVar.zza(zzh.zzk.zza);
                if (zza == -1 || zzcwVar.zzd(zza, this.zzn, false).zzd != zzcwVar.zzn(zztsVar2.zza, this.zzn).zzd) {
                    zzcwVar.zzn(zztsVar2.zza, this.zzn);
                    if (zztsVar2.zzb()) {
                        j10 = this.zzn.zzh(zztsVar2.zzb, zztsVar2.zzc);
                    } else {
                        j10 = this.zzn.zze;
                    }
                    zzlg zzc2 = zzh.zzd(zztsVar2, zzh.zzr, zzh.zzr, zzh.zzd, j10 - zzh.zzr, zzh.zzh, zzh.zzi, zzh.zzj).zzc(zztsVar2);
                    zzc2.zzp = j10;
                    return zzc2;
                }
                return zzh;
            }
            zzdy.zzf(!zztsVar2.zzb());
            long max = Math.max(0L, zzh.zzq - (longValue - zzp2));
            long j11 = zzh.zzp;
            if (zzh.zzk.equals(zzh.zzb)) {
                j11 = longValue + max;
            }
            zzlg zzd2 = zzh.zzd(zztsVar2, longValue, longValue, longValue, max, zzh.zzh, zzh.zzi, zzh.zzj);
            zzd2.zzp = j11;
            return zzd2;
        }
        zzdy.zzf(!zztsVar2.zzb());
        if (z11) {
            zzvsVar = zzvs.zza;
        } else {
            zzvsVar = zzh.zzh;
        }
        zzvs zzvsVar2 = zzvsVar;
        if (z11) {
            zzxmVar = this.zzb;
        } else {
            zzxmVar = zzh.zzi;
        }
        zzxm zzxmVar2 = zzxmVar;
        if (z11) {
            list = zzfud.zzl();
        } else {
            list = zzh.zzj;
        }
        zzlg zzc3 = zzh.zzd(zztsVar2, longValue, longValue, longValue, 0L, zzvsVar2, zzxmVar2, list).zzc(zztsVar2);
        zzc3.zzp = longValue;
        return zzc3;
    }

    private final zzlj zzaf(zzli zzliVar) {
        int i10;
        int zzX = zzX(this.zzad);
        zzkl zzklVar = this.zzk;
        zzcw zzcwVar = this.zzad.zza;
        if (zzX == -1) {
            i10 = 0;
        } else {
            i10 = zzX;
        }
        return new zzlj(zzklVar, zzliVar, zzcwVar, i10, this.zzu, zzklVar.zzb());
    }

    public final void zzag(final int i10, final int i11) {
        if (i10 == this.zzQ.zzb() && i11 == this.zzQ.zza()) {
            return;
        }
        this.zzQ = new zzfc(i10, i11);
        zzep zzepVar = this.zzl;
        zzepVar.zzd(24, new zzem() { // from class: com.google.android.gms.internal.ads.zzjj
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                int i12 = i10;
                int i13 = i11;
                int i14 = zzkb.zzd;
                ((zzcm) obj).zzo(i12, i13);
            }
        });
        zzepVar.zzc();
        zzah(2, 14, new zzfc(i10, i11));
    }

    private final void zzah(int i10, int i11, Object obj) {
        zzln[] zzlnVarArr = this.zzh;
        int length = zzlnVarArr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            zzln zzlnVar = zzlnVarArr[i12];
            if (zzlnVar.zzb() == i10) {
                zzlj zzaf = zzaf(zzlnVar);
                zzaf.zzf(i11);
                zzaf.zze(obj);
                zzaf.zzd();
            }
        }
    }

    public final void zzai() {
        zzah(1, 2, Float.valueOf(this.zzV * this.zzy.zza()));
    }

    public final void zzaj(Object obj) {
        ArrayList arrayList = new ArrayList();
        zzln[] zzlnVarArr = this.zzh;
        int length = zzlnVarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < 2; i10++) {
            zzln zzlnVar = zzlnVarArr[i10];
            if (zzlnVar.zzb() == 2) {
                zzlj zzaf = zzaf(zzlnVar);
                zzaf.zzf(1);
                zzaf.zze(obj);
                zzaf.zzd();
                arrayList.add(zzaf);
            }
        }
        Object obj2 = this.zzN;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzlj) it.next()).zzi(this.zzB);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj3 = this.zzN;
            Surface surface = this.zzO;
            if (obj3 == surface) {
                surface.release();
                this.zzO = null;
            }
        }
        this.zzN = obj;
        if (z10) {
            zzak(zzil.zzd(new zzkm(3), 1003));
        }
    }

    private final void zzak(zzil zzilVar) {
        zzlg zzlgVar = this.zzad;
        zzlg zzc = zzlgVar.zzc(zzlgVar.zzb);
        zzc.zzp = zzc.zzr;
        zzc.zzq = 0L;
        zzlg zzg = zzc.zzg(1);
        if (zzilVar != null) {
            zzg = zzg.zzf(zzilVar);
        }
        this.zzC++;
        this.zzk.zzo();
        zzam(zzg, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void zzal(boolean z10, int i10, int i11) {
        boolean z11;
        int i12 = 0;
        if (z10 && i10 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        zzlg zzlgVar = this.zzad;
        if (zzlgVar.zzl == z11 && zzlgVar.zzm == i12) {
            return;
        }
        this.zzC++;
        if (zzlgVar.zzo) {
            zzlgVar = zzlgVar.zzb();
        }
        zzlg zze = zzlgVar.zze(z11, i12);
        this.zzk.zzn(z11, i12);
        zzam(zze, 0, i11, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:306:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0457 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0461 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x046c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x047d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0489 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x04a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x04ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x04f1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r9v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzam(final com.google.android.gms.internal.ads.zzlg r43, final int r44, final int r45, boolean r46, final int r47, long r48, int r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkb.zzam(com.google.android.gms.internal.ads.zzlg, int, int, boolean, int, long, int, boolean):void");
    }

    public final void zzan() {
        int zzf = zzf();
        if (zzf != 2 && zzf != 3) {
            return;
        }
        zzao();
        boolean z10 = this.zzad.zzo;
        zzv();
        zzv();
    }

    private final void zzao() {
        IllegalStateException illegalStateException;
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (!this.zzY) {
                if (this.zzZ) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                zzes.zzg("ExoPlayerImpl", format, illegalStateException);
                this.zzZ = true;
                return;
            }
            throw new IllegalStateException(format);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzA(zzma zzmaVar) {
        zzao();
        this.zzr.zzO(zzmaVar);
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzB(zztu zztuVar) {
        boolean z10;
        zzao();
        List singletonList = Collections.singletonList(zztuVar);
        zzao();
        zzao();
        zzX(this.zzad);
        zzk();
        this.zzC++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                this.zzo.remove(i10);
            }
            this.zzah = this.zzah.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < singletonList.size(); i11++) {
            zzld zzldVar = new zzld((zztu) singletonList.get(i11), this.zzp);
            arrayList.add(zzldVar);
            this.zzo.add(i11, new zzka(zzldVar.zzb, zzldVar.zza));
        }
        this.zzah = this.zzah.zzg(0, arrayList.size());
        zzll zzllVar = new zzll(this.zzo, this.zzah);
        if (!zzllVar.zzo() && zzllVar.zzc() < 0) {
            throw new zzan(zzllVar, -1, -9223372036854775807L);
        }
        int zzg = zzllVar.zzg(false);
        zzlg zzae = zzae(this.zzad, zzllVar, zzad(zzllVar, zzg, -9223372036854775807L));
        int i12 = zzae.zze;
        if (zzg != -1 && i12 != 1) {
            i12 = 4;
            if (!zzllVar.zzo() && zzg < zzllVar.zzc()) {
                i12 = 2;
            }
        }
        zzlg zzg2 = zzae.zzg(i12);
        this.zzk.zzq(arrayList, zzg, zzfk.zzp(-9223372036854775807L), this.zzah);
        if (!this.zzad.zzb.zza.equals(zzg2.zzb.zza) && !this.zzad.zza.zzo()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzam(zzg2, 0, 1, z10, 4, zzaa(zzg2), -1, false);
    }

    public final zzil zzE() {
        zzao();
        return this.zzad.zzf;
    }

    public final /* synthetic */ void zzT(zzkj zzkjVar) {
        long j10;
        boolean z10;
        boolean z11;
        int i10 = this.zzC - zzkjVar.zzb;
        this.zzC = i10;
        boolean z12 = true;
        if (zzkjVar.zzc) {
            this.zzD = zzkjVar.zzd;
            this.zzE = true;
        }
        if (zzkjVar.zze) {
            this.zzF = zzkjVar.zzf;
        }
        if (i10 == 0) {
            zzcw zzcwVar = zzkjVar.zza.zza;
            if (!this.zzad.zza.zzo() && zzcwVar.zzo()) {
                this.zzae = -1;
                this.zzaf = 0L;
            }
            if (!zzcwVar.zzo()) {
                List zzw = ((zzll) zzcwVar).zzw();
                if (zzw.size() == this.zzo.size()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zzdy.zzf(z11);
                for (int i11 = 0; i11 < zzw.size(); i11++) {
                    ((zzka) this.zzo.get(i11)).zzc((zzcw) zzw.get(i11));
                }
            }
            if (this.zzE) {
                if (zzkjVar.zza.zzb.equals(this.zzad.zzb) && zzkjVar.zza.zzd == this.zzad.zzr) {
                    z12 = false;
                }
                if (z12) {
                    if (!zzcwVar.zzo() && !zzkjVar.zza.zzb.zzb()) {
                        zzlg zzlgVar = zzkjVar.zza;
                        zzts zztsVar = zzlgVar.zzb;
                        j10 = zzlgVar.zzd;
                        zzac(zzcwVar, zztsVar, j10);
                    } else {
                        j10 = zzkjVar.zza.zzd;
                    }
                } else {
                    j10 = -9223372036854775807L;
                }
                z10 = z12;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.zzE = false;
            zzam(zzkjVar.zza, 1, this.zzF, z10, this.zzD, j10, -1, false);
        }
    }

    public final /* synthetic */ void zzU(final zzkj zzkjVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjh
            @Override // java.lang.Runnable
            public final void run() {
                zzkb.this.zzT(zzkjVar);
            }
        });
    }

    public final /* synthetic */ void zzV(zzcm zzcmVar) {
        zzcmVar.zza(this.zzH);
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final void zza(int i10, long j10, int i11, boolean z10) {
        boolean z11;
        zzao();
        if (i10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzdy.zzd(z11);
        this.zzr.zzu();
        zzcw zzcwVar = this.zzad.zza;
        if (!zzcwVar.zzo() && i10 >= zzcwVar.zzc()) {
            return;
        }
        this.zzC++;
        if (zzx()) {
            zzes.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            zzkj zzkjVar = new zzkj(this.zzad);
            zzkjVar.zza(1);
            this.zzag.zza.zzU(zzkjVar);
            return;
        }
        zzlg zzlgVar = this.zzad;
        int i12 = zzlgVar.zze;
        if (i12 == 3 || (i12 == 4 && !zzcwVar.zzo())) {
            zzlgVar = this.zzad.zzg(2);
        }
        int zzd2 = zzd();
        zzlg zzae = zzae(zzlgVar, zzcwVar, zzad(zzcwVar, i10, j10));
        this.zzk.zzl(zzcwVar, i10, zzfk.zzp(j10));
        zzam(zzae, 0, 1, true, 1, zzaa(zzae), zzd2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzb() {
        zzao();
        if (zzx()) {
            return this.zzad.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzc() {
        zzao();
        if (zzx()) {
            return this.zzad.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzd() {
        zzao();
        int zzX = zzX(this.zzad);
        if (zzX == -1) {
            return 0;
        }
        return zzX;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zze() {
        zzao();
        if (this.zzad.zza.zzo()) {
            return 0;
        }
        zzlg zzlgVar = this.zzad;
        return zzlgVar.zza.zza(zzlgVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzf() {
        zzao();
        return this.zzad.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzg() {
        zzao();
        return this.zzad.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzh() {
        zzao();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzi() {
        zzao();
        if (zzx()) {
            zzlg zzlgVar = this.zzad;
            if (zzlgVar.zzk.equals(zzlgVar.zzb)) {
                return zzfk.zzr(this.zzad.zzp);
            }
            return zzl();
        }
        zzao();
        if (this.zzad.zza.zzo()) {
            return this.zzaf;
        }
        zzlg zzlgVar2 = this.zzad;
        long j10 = 0;
        if (zzlgVar2.zzk.zzd != zzlgVar2.zzb.zzd) {
            return zzfk.zzr(zzlgVar2.zza.zze(zzd(), this.zza, 0L).zzo);
        }
        long j11 = zzlgVar2.zzp;
        if (this.zzad.zzk.zzb()) {
            zzlg zzlgVar3 = this.zzad;
            zzlgVar3.zza.zzn(zzlgVar3.zzk.zza, this.zzn).zzi(this.zzad.zzk.zzb);
        } else {
            j10 = j11;
        }
        zzlg zzlgVar4 = this.zzad;
        zzac(zzlgVar4.zza, zzlgVar4.zzk, j10);
        return zzfk.zzr(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzj() {
        zzao();
        return zzZ(this.zzad);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzk() {
        zzao();
        return zzfk.zzr(zzaa(this.zzad));
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzl() {
        zzao();
        if (!zzx()) {
            zzcw zzn = zzn();
            if (zzn.zzo()) {
                return -9223372036854775807L;
            }
            return zzfk.zzr(zzn.zze(zzd(), this.zza, 0L).zzo);
        }
        zzlg zzlgVar = this.zzad;
        zzts zztsVar = zzlgVar.zzb;
        zzlgVar.zza.zzn(zztsVar.zza, this.zzn);
        return zzfk.zzr(this.zzn.zzh(zztsVar.zzb, zztsVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzm() {
        zzao();
        return zzfk.zzr(this.zzad.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcw zzn() {
        zzao();
        return this.zzad.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzdh zzo() {
        zzao();
        return this.zzad.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzp() {
        zzao();
        boolean zzv = zzv();
        int i10 = 2;
        int zzb = this.zzy.zzb(zzv, 2);
        zzal(zzv, zzb, zzY(zzv, zzb));
        zzlg zzlgVar = this.zzad;
        if (zzlgVar.zze != 1) {
            return;
        }
        zzlg zzf = zzlgVar.zzf(null);
        if (true == zzf.zza.zzo()) {
            i10 = 4;
        }
        zzlg zzg = zzf.zzg(i10);
        this.zzC++;
        this.zzk.zzk();
        zzam(zzg, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzq() {
        AudioTrack audioTrack;
        zzes.zze("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.1.0] [" + zzfk.zze + "] [" + zzbq.zza() + "]");
        zzao();
        if (zzfk.zza < 21 && (audioTrack = this.zzM) != null) {
            audioTrack.release();
            this.zzM = null;
        }
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzep zzepVar = this.zzl;
            zzepVar.zzd(10, new zzem() { // from class: com.google.android.gms.internal.ads.zzji
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj) {
                    ((zzcm) obj).zzj(zzil.zzd(new zzkm(1), 1003));
                }
            });
            zzepVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzt.zzf(this.zzr);
        zzlg zzlgVar = this.zzad;
        if (zzlgVar.zzo) {
            this.zzad = zzlgVar.zzb();
        }
        zzlg zzg = this.zzad.zzg(1);
        this.zzad = zzg;
        zzlg zzc = zzg.zzc(zzg.zzb);
        this.zzad = zzc;
        zzc.zzp = zzc.zzr;
        this.zzad.zzq = 0L;
        this.zzr.zzN();
        this.zzi.zzi();
        Surface surface = this.zzO;
        if (surface != null) {
            surface.release();
            this.zzO = null;
        }
        this.zzX = zzdx.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzr(boolean z10) {
        zzao();
        int zzb = this.zzy.zzb(z10, zzf());
        zzal(z10, zzb, zzY(z10, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzs(Surface surface) {
        int i10;
        zzao();
        zzaj(surface);
        if (surface == null) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        zzag(i10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzt(float f10) {
        zzao();
        final float max = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.zzV == max) {
            return;
        }
        this.zzV = max;
        zzai();
        zzep zzepVar = this.zzl;
        zzepVar.zzd(22, new zzem() { // from class: com.google.android.gms.internal.ads.zzjk
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                float f11 = max;
                int i10 = zzkb.zzd;
                ((zzcm) obj).zzs(f11);
            }
        });
        zzepVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzu() {
        zzao();
        this.zzy.zzb(zzv(), 1);
        zzak(null);
        this.zzX = new zzdx(zzfud.zzl(), this.zzad.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzv() {
        zzao();
        return this.zzad.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzw() {
        zzao();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzx() {
        zzao();
        return this.zzad.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final int zzy() {
        zzao();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzz(zzma zzmaVar) {
        this.zzr.zzt(zzmaVar);
    }
}
