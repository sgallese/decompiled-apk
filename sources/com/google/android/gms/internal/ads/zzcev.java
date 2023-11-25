package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcev extends zzcca implements zzhk, zzma {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzceg zzc;
    private final zzxd zzd;
    private final zzcci zze;
    private final WeakReference zzf;
    private final zzuy zzg;
    private zziw zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcbz zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcei zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e3, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbr.zzbN)).booleanValue() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e7, code lost:
    
        if (r5.zzj == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e9, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ec, code lost:
    
        if (r5.zzm == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ee, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcem(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f6, code lost:
    
        if (r5.zzi <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f8, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcen(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fe, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzceo(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0105, code lost:
    
        if (r5.zzj == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0107, code lost:
    
        r5 = new com.google.android.gms.internal.ads.zzcep(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010e, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010f, code lost:
    
        r4 = r3.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0111, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0117, code lost:
    
        if (r4.limit() <= 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0119, code lost:
    
        r4 = new byte[r3.zzi.limit()];
        r3.zzi.get(r4);
        r5 = new com.google.android.gms.internal.ads.zzceq(r5, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzcev(android.content.Context r4, com.google.android.gms.internal.ads.zzcci r5, com.google.android.gms.internal.ads.zzccj r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcev.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcci, com.google.android.gms.internal.ads.zzccj, java.lang.Integer):void");
    }

    private final boolean zzad() {
        if (this.zzt != null && this.zzt.zzq()) {
            return true;
        }
        return false;
    }

    public final void finalize() {
        zzcca.zzD().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzA() {
        if (!zzad()) {
            return this.zzl;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzB() {
        if (!zzad()) {
            synchronized (this.zzq) {
                while (!this.zzs.isEmpty()) {
                    long j10 = this.zzn;
                    Map zze = ((zzhf) this.zzs.remove(0)).zze();
                    long j11 = 0;
                    if (zze != null) {
                        Iterator it = zze.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzfqo.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j11 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j10 + j11;
                }
            }
            return this.zzn;
        }
        return this.zzt.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        zztu zzukVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z10;
            int length = uriArr.length;
            if (length == 1) {
                zzukVar = zzaa(uriArr[0]);
            } else {
                zztu[] zztuVarArr = new zztu[length];
                for (int i10 = 0; i10 < uriArr.length; i10++) {
                    zztuVarArr[i10] = zzaa(uriArr[i10]);
                }
                zzukVar = new zzuk(false, false, zztuVarArr);
            }
            this.zzh.zzB(zzukVar);
            this.zzh.zzp();
            zzcca.zzE().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzH() {
        zziw zziwVar = this.zzh;
        if (zziwVar != null) {
            zziwVar.zzA(this);
            this.zzh.zzq();
            this.zzh = null;
            zzcca.zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzI(long j10) {
        zzm zzmVar = (zzm) this.zzh;
        zzmVar.zza(zzmVar.zzd(), j10, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzJ(int i10) {
        this.zzc.zzk(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzK(int i10) {
        this.zzc.zzl(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzL(zzcbz zzcbzVar) {
        this.zzk = zzcbzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzM(int i10) {
        this.zzc.zzm(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzN(int i10) {
        this.zzc.zzn(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzO(boolean z10) {
        this.zzh.zzr(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzP(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzQ(boolean z10) {
        if (this.zzh != null) {
            int i10 = 0;
            while (true) {
                this.zzh.zzy();
                if (i10 < 2) {
                    zzxd zzxdVar = this.zzd;
                    zzwp zzc = zzxdVar.zzd().zzc();
                    zzc.zzo(i10, !z10);
                    zzxdVar.zzk(zzc);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzR(int i10) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcef zzcefVar = (zzcef) ((WeakReference) it.next()).get();
            if (zzcefVar != null) {
                zzcefVar.zzm(i10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzS(Surface surface, boolean z10) {
        zziw zziwVar = this.zzh;
        if (zziwVar != null) {
            zziwVar.zzs(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzT(float f10, boolean z10) {
        zziw zziwVar = this.zzh;
        if (zziwVar != null) {
            zziwVar.zzt(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzU() {
        this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final boolean zzV() {
        if (this.zzh != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzgi zzW(String str, boolean z10) {
        zzcev zzcevVar;
        zzcci zzcciVar = this.zze;
        int i10 = zzcciVar.zzd;
        int i11 = zzcciVar.zzf;
        long j10 = zzcciVar.zzn;
        long j11 = zzcciVar.zzo;
        if (true != z10) {
            zzcevVar = null;
        } else {
            zzcevVar = this;
        }
        return new zzcey(str, zzcevVar, i10, i11, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzgi zzX(String str, boolean z10) {
        zzcev zzcevVar;
        zzcci zzcciVar = this.zze;
        int i10 = zzcciVar.zzd;
        int i11 = zzcciVar.zzf;
        int i12 = zzcciVar.zzi;
        if (true != z10) {
            zzcevVar = null;
        } else {
            zzcevVar = this;
        }
        zzcef zzcefVar = new zzcef(str, zzcevVar, i10, i11, i12);
        this.zzu.add(new WeakReference(zzcefVar));
        return zzcefVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzgi zzY(String str, boolean z10) {
        zzcev zzcevVar;
        zzgq zzgqVar = new zzgq();
        zzgqVar.zzf(str);
        if (true != z10) {
            zzcevVar = null;
        } else {
            zzcevVar = this;
        }
        zzgqVar.zze(zzcevVar);
        zzgqVar.zzc(this.zze.zzd);
        zzgqVar.zzd(this.zze.zzf);
        zzgqVar.zzb(true);
        return zzgqVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzgi zzZ(zzgh zzghVar) {
        return new zzcei(this.zzb, zzghVar.zza(), this.zzo, this.zzp, this, new zzcel(this));
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zza(zzgi zzgiVar, zzgn zzgnVar, boolean z10, int i10) {
        this.zzl += i10;
    }

    final zztu zzaa(Uri uri) {
        zzar zzarVar = new zzar();
        zzarVar.zzb(uri);
        zzbp zzc = zzarVar.zzc();
        zzuy zzuyVar = this.zzg;
        zzuyVar.zza(this.zze.zzg);
        return zzuyVar.zzb(zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzab(boolean z10, long j10) {
        zzcbz zzcbzVar = this.zzk;
        if (zzcbzVar != null) {
            zzcbzVar.zzi(z10, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzln[] zzac(Handler handler, zzzw zzzwVar, zzoy zzoyVar, zzvv zzvvVar, zzss zzssVar) {
        Context context = this.zzb;
        zzsc zzscVar = zzsc.zzb;
        zzoj zzojVar = zzoj.zza;
        zzdr[] zzdrVarArr = new zzdr[0];
        zzps zzpsVar = new zzps();
        if (zzojVar != null || zzojVar != null) {
            zzpsVar.zzc(zzojVar);
            zzpsVar.zzd(zzdrVarArr);
            zzqe zze = zzpsVar.zze();
            zzrs zzrsVar = zzrs.zza;
            return new zzln[]{new zzqk(context, zzrsVar, zzscVar, false, handler, zzoyVar, zze), new zzyz(this.zzb, zzrsVar, zzscVar, 0L, false, handler, zzzwVar, -1, 30.0f)};
        }
        throw new NullPointerException("Both parameters are null");
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzd(zzgi zzgiVar, zzgn zzgnVar, boolean z10) {
        if (zzgiVar instanceof zzhf) {
            synchronized (this.zzq) {
                this.zzs.add((zzhf) zzgiVar);
            }
        } else if (zzgiVar instanceof zzcei) {
            this.zzt = (zzcei) zzgiVar;
            final zzccj zzccjVar = (zzccj) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbN)).booleanValue() && zzccjVar != null && this.zzt.zzn()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzces
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzccj zzccjVar2 = zzccj.this;
                        Map map = hashMap;
                        int i10 = zzcev.zza;
                        zzccjVar2.zzd("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zze(zzly zzlyVar, zzam zzamVar, zzie zzieVar) {
        zzccj zzccjVar = (zzccj) this.zzf.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbN)).booleanValue() && zzccjVar != null && zzamVar != null) {
            HashMap hashMap = new HashMap();
            String str = zzamVar.zzl;
            if (str != null) {
                hashMap.put("audioMime", str);
            }
            String str2 = zzamVar.zzm;
            if (str2 != null) {
                hashMap.put("audioSampleMime", str2);
            }
            String str3 = zzamVar.zzj;
            if (str3 != null) {
                hashMap.put("audioCodec", str3);
            }
            zzccjVar.zzd("onMetadataEvent", hashMap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzh(zzly zzlyVar, int i10, long j10) {
        this.zzm += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzj(zzly zzlyVar, zztj zztjVar, zzto zztoVar, IOException iOException, boolean z10) {
        zzcbz zzcbzVar = this.zzk;
        if (zzcbzVar != null) {
            if (this.zze.zzk) {
                zzcbzVar.zzl("onLoadException", iOException);
            } else {
                zzcbzVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzk(zzly zzlyVar, int i10) {
        zzcbz zzcbzVar = this.zzk;
        if (zzcbzVar != null) {
            zzcbzVar.zzm(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzl(zzly zzlyVar, zzcf zzcfVar) {
        zzcbz zzcbzVar = this.zzk;
        if (zzcbzVar != null) {
            zzcbzVar.zzk("onPlayerError", zzcfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzn(zzly zzlyVar, Object obj, long j10) {
        zzcbz zzcbzVar = this.zzk;
        if (zzcbzVar != null) {
            zzcbzVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzp(zzly zzlyVar, zzam zzamVar, zzie zzieVar) {
        zzccj zzccjVar = (zzccj) this.zzf.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbN)).booleanValue() && zzccjVar != null && zzamVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzamVar.zzt));
            hashMap.put("bitRate", String.valueOf(zzamVar.zzi));
            hashMap.put("resolution", zzamVar.zzr + "x" + zzamVar.zzs);
            String str = zzamVar.zzl;
            if (str != null) {
                hashMap.put("videoMime", str);
            }
            String str2 = zzamVar.zzm;
            if (str2 != null) {
                hashMap.put("videoSampleMime", str2);
            }
            String str3 = zzamVar.zzj;
            if (str3 != null) {
                hashMap.put("videoCodec", str3);
            }
            zzccjVar.zzd("onMetadataEvent", hashMap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzq(zzly zzlyVar, zzdn zzdnVar) {
        zzcbz zzcbzVar = this.zzk;
        if (zzcbzVar != null) {
            zzcbzVar.zzD(zzdnVar.zzc, zzdnVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzx() {
        if (!zzad() || !this.zzt.zzp()) {
            return 0L;
        }
        return Math.min(this.zzl, this.zzt.zzk());
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzz() {
        return this.zzh.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zzg(zzly zzlyVar, zzto zztoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zzi(zzcp zzcpVar, zzlz zzlzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zzo(zzly zzlyVar, zzid zzidVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzb(zzgi zzgiVar, zzgn zzgnVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzc(zzgi zzgiVar, zzgn zzgnVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zzf(zzly zzlyVar, int i10, long j10, long j11) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zzm(zzly zzlyVar, zzco zzcoVar, zzco zzcoVar2, int i10) {
    }
}
