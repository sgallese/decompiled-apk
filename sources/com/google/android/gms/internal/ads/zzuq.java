package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzuq implements zzyd, zzth {
    final /* synthetic */ zzuv zza;
    private final Uri zzc;
    private final zzhj zzd;
    private final zzul zze;
    private final zzabe zzf;
    private final zzeb zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzace zzm;
    private boolean zzn;
    private final zzabx zzh = new zzabx();
    private boolean zzj = true;
    private final long zzb = zztj.zza();
    private zzgn zzl = zzi(0);

    public zzuq(zzuv zzuvVar, Uri uri, zzgi zzgiVar, zzul zzulVar, zzabe zzabeVar, zzeb zzebVar) {
        this.zza = zzuvVar;
        this.zzc = uri;
        this.zzd = new zzhj(zzgiVar);
        this.zze = zzulVar;
        this.zzf = zzabeVar;
        this.zzg = zzebVar;
    }

    public static /* bridge */ /* synthetic */ long zzb(zzuq zzuqVar) {
        return zzuqVar.zzb;
    }

    public static /* bridge */ /* synthetic */ long zzc(zzuq zzuqVar) {
        return zzuqVar.zzk;
    }

    public static /* bridge */ /* synthetic */ zzgn zzd(zzuq zzuqVar) {
        return zzuqVar.zzl;
    }

    public static /* bridge */ /* synthetic */ zzhj zze(zzuq zzuqVar) {
        return zzuqVar.zzd;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzuq zzuqVar, long j10, long j11) {
        zzuqVar.zzh.zza = j10;
        zzuqVar.zzk = j11;
        zzuqVar.zzj = true;
        zzuqVar.zzn = false;
    }

    private final zzgn zzi(long j10) {
        Map map;
        zzgl zzglVar = new zzgl();
        zzglVar.zzd(this.zzc);
        zzglVar.zzc(j10);
        zzglVar.zza(6);
        map = zzuv.zzb;
        zzglVar.zzb(map);
        return zzglVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzth
    public final void zza(zzfb zzfbVar) {
        long zzQ;
        long max;
        if (this.zzn) {
            zzQ = this.zza.zzQ(true);
            max = Math.max(zzQ, this.zzk);
        } else {
            max = this.zzk;
        }
        int zza = zzfbVar.zza();
        zzace zzaceVar = this.zzm;
        zzaceVar.getClass();
        zzacc.zzb(zzaceVar, zzfbVar, zza);
        zzaceVar.zzs(max, 1, zza, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0082 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:136:0x000b, B:138:0x001f, B:139:0x0025, B:142:0x003b, B:143:0x0041, B:152:0x0077, B:154:0x0082, B:156:0x008e, B:158:0x0098, B:160:0x00a4, B:162:0x00ae, B:164:0x00ba, B:166:0x00c4, B:168:0x00d6, B:170:0x00e0, B:171:0x00e6, B:180:0x0116, B:181:0x011d, B:183:0x012a, B:185:0x0132, B:187:0x014f, B:189:0x016a, B:190:0x016f, B:192:0x0173, B:174:0x00f0, B:177:0x0104, B:147:0x004d, B:150:0x0063), top: B:246:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0098 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:136:0x000b, B:138:0x001f, B:139:0x0025, B:142:0x003b, B:143:0x0041, B:152:0x0077, B:154:0x0082, B:156:0x008e, B:158:0x0098, B:160:0x00a4, B:162:0x00ae, B:164:0x00ba, B:166:0x00c4, B:168:0x00d6, B:170:0x00e0, B:171:0x00e6, B:180:0x0116, B:181:0x011d, B:183:0x012a, B:185:0x0132, B:187:0x014f, B:189:0x016a, B:190:0x016f, B:192:0x0173, B:174:0x00f0, B:177:0x0104, B:147:0x004d, B:150:0x0063), top: B:246:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00ae A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:136:0x000b, B:138:0x001f, B:139:0x0025, B:142:0x003b, B:143:0x0041, B:152:0x0077, B:154:0x0082, B:156:0x008e, B:158:0x0098, B:160:0x00a4, B:162:0x00ae, B:164:0x00ba, B:166:0x00c4, B:168:0x00d6, B:170:0x00e0, B:171:0x00e6, B:180:0x0116, B:181:0x011d, B:183:0x012a, B:185:0x0132, B:187:0x014f, B:189:0x016a, B:190:0x016f, B:192:0x0173, B:174:0x00f0, B:177:0x0104, B:147:0x004d, B:150:0x0063), top: B:246:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00c4 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:136:0x000b, B:138:0x001f, B:139:0x0025, B:142:0x003b, B:143:0x0041, B:152:0x0077, B:154:0x0082, B:156:0x008e, B:158:0x0098, B:160:0x00a4, B:162:0x00ae, B:164:0x00ba, B:166:0x00c4, B:168:0x00d6, B:170:0x00e0, B:171:0x00e6, B:180:0x0116, B:181:0x011d, B:183:0x012a, B:185:0x0132, B:187:0x014f, B:189:0x016a, B:190:0x016f, B:192:0x0173, B:174:0x00f0, B:177:0x0104, B:147:0x004d, B:150:0x0063), top: B:246:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00e0 A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #6 {all -> 0x01eb, blocks: (B:136:0x000b, B:138:0x001f, B:139:0x0025, B:142:0x003b, B:143:0x0041, B:152:0x0077, B:154:0x0082, B:156:0x008e, B:158:0x0098, B:160:0x00a4, B:162:0x00ae, B:164:0x00ba, B:166:0x00c4, B:168:0x00d6, B:170:0x00e0, B:171:0x00e6, B:180:0x0116, B:181:0x011d, B:183:0x012a, B:185:0x0132, B:187:0x014f, B:189:0x016a, B:190:0x016f, B:192:0x0173, B:174:0x00f0, B:177:0x0104, B:147:0x004d, B:150:0x0063), top: B:246:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0116 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:136:0x000b, B:138:0x001f, B:139:0x0025, B:142:0x003b, B:143:0x0041, B:152:0x0077, B:154:0x0082, B:156:0x008e, B:158:0x0098, B:160:0x00a4, B:162:0x00ae, B:164:0x00ba, B:166:0x00c4, B:168:0x00d6, B:170:0x00e0, B:171:0x00e6, B:180:0x0116, B:181:0x011d, B:183:0x012a, B:185:0x0132, B:187:0x014f, B:189:0x016a, B:190:0x016f, B:192:0x0173, B:174:0x00f0, B:177:0x0104, B:147:0x004d, B:150:0x0063), top: B:246:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x012a A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:136:0x000b, B:138:0x001f, B:139:0x0025, B:142:0x003b, B:143:0x0041, B:152:0x0077, B:154:0x0082, B:156:0x008e, B:158:0x0098, B:160:0x00a4, B:162:0x00ae, B:164:0x00ba, B:166:0x00c4, B:168:0x00d6, B:170:0x00e0, B:171:0x00e6, B:180:0x0116, B:181:0x011d, B:183:0x012a, B:185:0x0132, B:187:0x014f, B:189:0x016a, B:190:0x016f, B:192:0x0173, B:174:0x00f0, B:177:0x0104, B:147:0x004d, B:150:0x0063), top: B:246:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x016a A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:136:0x000b, B:138:0x001f, B:139:0x0025, B:142:0x003b, B:143:0x0041, B:152:0x0077, B:154:0x0082, B:156:0x008e, B:158:0x0098, B:160:0x00a4, B:162:0x00ae, B:164:0x00ba, B:166:0x00c4, B:168:0x00d6, B:170:0x00e0, B:171:0x00e6, B:180:0x0116, B:181:0x011d, B:183:0x012a, B:185:0x0132, B:187:0x014f, B:189:0x016a, B:190:0x016f, B:192:0x0173, B:174:0x00f0, B:177:0x0104, B:147:0x004d, B:150:0x0063), top: B:246:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0173 A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #6 {all -> 0x01eb, blocks: (B:136:0x000b, B:138:0x001f, B:139:0x0025, B:142:0x003b, B:143:0x0041, B:152:0x0077, B:154:0x0082, B:156:0x008e, B:158:0x0098, B:160:0x00a4, B:162:0x00ae, B:164:0x00ba, B:166:0x00c4, B:168:0x00d6, B:170:0x00e0, B:171:0x00e6, B:180:0x0116, B:181:0x011d, B:183:0x012a, B:185:0x0132, B:187:0x014f, B:189:0x016a, B:190:0x016f, B:192:0x0173, B:174:0x00f0, B:177:0x0104, B:147:0x004d, B:150:0x0063), top: B:246:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x020b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[LOOP:0: B:133:0x0004->B:252:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01c9 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzyd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuq.zzh():void");
    }
}
