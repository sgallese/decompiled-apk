package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzpw;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.measurement.zzra;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzlf implements zzgy {
    private static volatile zzlf zzb;
    private long zzA;
    private final Map zzB;
    private final Map zzC;
    private zzip zzD;
    private String zzE;
    @VisibleForTesting
    long zza;
    private final zzfu zzc;
    private final zzez zzd;
    private zzam zze;
    private zzfb zzf;
    private zzkq zzg;
    private zzaa zzh;
    private final zzlh zzi;
    private zzin zzj;
    private zzjz zzk;
    private final zzku zzl;
    private zzfl zzm;
    private final zzgd zzn;
    private boolean zzp;
    private List zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private FileLock zzw;
    private FileChannel zzx;
    private List zzy;
    private List zzz;
    private boolean zzo = false;
    private final zzlm zzF = new zzla(this);

    zzlf(zzlg zzlgVar, zzgd zzgdVar) {
        Preconditions.checkNotNull(zzlgVar);
        this.zzn = zzgd.zzp(zzlgVar.zza, null, null);
        this.zzA = -1L;
        this.zzl = new zzku(this);
        zzlh zzlhVar = new zzlh(this);
        zzlhVar.zzX();
        this.zzi = zzlhVar;
        zzez zzezVar = new zzez(this);
        zzezVar.zzX();
        this.zzd = zzezVar;
        zzfu zzfuVar = new zzfu(this);
        zzfuVar.zzX();
        this.zzc = zzfuVar;
        this.zzB = new HashMap();
        this.zzC = new HashMap();
        zzaB().zzp(new zzkv(this, zzlgVar));
    }

    @VisibleForTesting
    static final void zzaa(com.google.android.gms.internal.measurement.zzfs zzfsVar, int i10, String str) {
        List zzp = zzfsVar.zzp();
        for (int i11 = 0; i11 < zzp.size(); i11++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzfx) zzp.get(i11)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
        zze.zzj("_err");
        zze.zzi(Long.valueOf(i10).longValue());
        com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) zze.zzaD();
        com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
        zze2.zzj("_ev");
        zze2.zzk(str);
        com.google.android.gms.internal.measurement.zzfx zzfxVar2 = (com.google.android.gms.internal.measurement.zzfx) zze2.zzaD();
        zzfsVar.zzf(zzfxVar);
        zzfsVar.zzf(zzfxVar2);
    }

    @VisibleForTesting
    static final void zzab(com.google.android.gms.internal.measurement.zzfs zzfsVar, String str) {
        List zzp = zzfsVar.zzp();
        for (int i10 = 0; i10 < zzp.size(); i10++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzfx) zzp.get(i10)).zzg())) {
                zzfsVar.zzh(i10);
                return;
            }
        }
    }

    private final zzq zzac(String str) {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzj = zzamVar.zzj(str);
        if (zzj != null && !TextUtils.isEmpty(zzj.zzx())) {
            Boolean zzad = zzad(zzj);
            if (zzad != null && !zzad.booleanValue()) {
                zzaA().zzd().zzb("App version does not match; dropping. appId", zzet.zzn(str));
                return null;
            }
            String zzz = zzj.zzz();
            String zzx = zzj.zzx();
            long zzb2 = zzj.zzb();
            String zzw = zzj.zzw();
            long zzm = zzj.zzm();
            long zzj2 = zzj.zzj();
            boolean zzal = zzj.zzal();
            String zzy = zzj.zzy();
            zzj.zza();
            return new zzq(str, zzz, zzx, zzb2, zzw, zzm, zzj2, (String) null, zzal, false, zzy, 0L, 0L, 0, zzj.zzak(), false, zzj.zzs(), zzj.zzr(), zzj.zzk(), zzj.zzD(), (String) null, zzh(str).zzh(), "", (String) null, zzj.zzan(), zzj.zzq());
        }
        zzaA().zzc().zzb("No app data available; dropping", str);
        return null;
    }

    private final Boolean zzad(zzh zzhVar) {
        try {
            if (zzhVar.zzb() != -2147483648L) {
                if (zzhVar.zzb() == Wrappers.packageManager(this.zzn.zzaw()).getPackageInfo(zzhVar.zzu(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzaw()).getPackageInfo(zzhVar.zzu(), 0).versionName;
                String zzx = zzhVar.zzx();
                if (zzx != null && zzx.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void zzae() {
        zzaB().zzg();
        if (!this.zzt && !this.zzu && !this.zzv) {
            zzaA().zzj().zza("Stopping uploading service(s)");
            List list = this.zzq;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            ((List) Preconditions.checkNotNull(this.zzq)).clear();
            return;
        }
        zzaA().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv));
    }

    @VisibleForTesting
    private final void zzaf(com.google.android.gms.internal.measurement.zzgc zzgcVar, long j10, boolean z10) {
        String str;
        zzlk zzlkVar;
        String str2;
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        if (true != z10) {
            str = "_lte";
        } else {
            str = "_se";
        }
        zzlk zzp = zzamVar.zzp(zzgcVar.zzaq(), str);
        if (zzp != null && zzp.zze != null) {
            zzlkVar = new zzlk(zzgcVar.zzaq(), "auto", str, zzax().currentTimeMillis(), Long.valueOf(((Long) zzp.zze).longValue() + j10));
        } else {
            zzlkVar = new zzlk(zzgcVar.zzaq(), "auto", str, zzax().currentTimeMillis(), Long.valueOf(j10));
        }
        com.google.android.gms.internal.measurement.zzgl zzd = com.google.android.gms.internal.measurement.zzgm.zzd();
        zzd.zzf(str);
        zzd.zzg(zzax().currentTimeMillis());
        zzd.zze(((Long) zzlkVar.zze).longValue());
        com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) zzd.zzaD();
        int zza = zzlh.zza(zzgcVar, str);
        if (zza >= 0) {
            zzgcVar.zzan(zza, zzgmVar);
        } else {
            zzgcVar.zzm(zzgmVar);
        }
        if (j10 > 0) {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzamVar2.zzL(zzlkVar);
            if (true != z10) {
                str2 = "lifetime";
            } else {
                str2 = "session-scoped";
            }
            zzaA().zzj().zzc("Updated engagement user property. scope, value", str2, zzlkVar.zze);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzag() {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlf.zzag():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:353:0x0b33, code lost:
    
        if (r10 > (com.google.android.gms.measurement.internal.zzag.zzA() + r8)) goto L354;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0447 A[Catch: all -> 0x0cc7, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0489 A[Catch: all -> 0x0cc7, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x07d7 A[Catch: all -> 0x0cc7, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0820 A[Catch: all -> 0x0cc7, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0843 A[Catch: all -> 0x0cc7, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x08c4 A[Catch: all -> 0x0cc7, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x08f0 A[Catch: all -> 0x0cc7, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0b23 A[Catch: all -> 0x0cc7, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0baa A[Catch: all -> 0x0cc7, TRY_LEAVE, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0bc6 A[Catch: SQLiteException -> 0x0bde, all -> 0x0cc7, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0bde, blocks: (B:360:0x0bb7, B:362:0x0bc6), top: B:398:0x0bb7, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0383 A[Catch: all -> 0x0cc7, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzah(java.lang.String r41, long r42) {
        /*
            Method dump skipped, instructions count: 3282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlf.zzah(java.lang.String, long):boolean");
    }

    private final boolean zzai() {
        zzaB().zzg();
        zzB();
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        if (!zzamVar.zzF()) {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            if (TextUtils.isEmpty(zzamVar2.zzr())) {
                return false;
            }
            return true;
        }
        return true;
    }

    private final boolean zzaj(com.google.android.gms.internal.measurement.zzfs zzfsVar, com.google.android.gms.internal.measurement.zzfs zzfsVar2) {
        String zzh;
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzB = zzlh.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD(), "_sc");
        String str = null;
        if (zzB == null) {
            zzh = null;
        } else {
            zzh = zzB.zzh();
        }
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzB2 = zzlh.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaD(), "_pc");
        if (zzB2 != null) {
            str = zzB2.zzh();
        }
        if (str != null && str.equals(zzh)) {
            Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
            zzal(this.zzi);
            com.google.android.gms.internal.measurement.zzfx zzB3 = zzlh.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD(), "_et");
            if (zzB3 != null && zzB3.zzw() && zzB3.zzd() > 0) {
                long zzd = zzB3.zzd();
                zzal(this.zzi);
                com.google.android.gms.internal.measurement.zzfx zzB4 = zzlh.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaD(), "_et");
                if (zzB4 != null && zzB4.zzd() > 0) {
                    zzd += zzB4.zzd();
                }
                zzal(this.zzi);
                zzlh.zzz(zzfsVar2, "_et", Long.valueOf(zzd));
                zzal(this.zzi);
                zzlh.zzz(zzfsVar, "_fr", 1L);
                return true;
            }
            return true;
        }
        return false;
    }

    private static final boolean zzak(zzq zzqVar) {
        if (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) {
            return false;
        }
        return true;
    }

    private static final zzks zzal(zzks zzksVar) {
        if (zzksVar != null) {
            if (zzksVar.zzY()) {
                return zzksVar;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzksVar.getClass())));
        }
        throw new IllegalStateException("Upload Component not created");
    }

    public static zzlf zzt(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzlf.class) {
                if (zzb == null) {
                    zzb = new zzlf((zzlg) Preconditions.checkNotNull(new zzlg(context)), null);
                }
            }
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzy(zzlf zzlfVar, zzlg zzlgVar) {
        zzlfVar.zzaB().zzg();
        zzlfVar.zzm = new zzfl(zzlfVar);
        zzam zzamVar = new zzam(zzlfVar);
        zzamVar.zzX();
        zzlfVar.zze = zzamVar;
        zzlfVar.zzg().zzq((zzaf) Preconditions.checkNotNull(zzlfVar.zzc));
        zzjz zzjzVar = new zzjz(zzlfVar);
        zzjzVar.zzX();
        zzlfVar.zzk = zzjzVar;
        zzaa zzaaVar = new zzaa(zzlfVar);
        zzaaVar.zzX();
        zzlfVar.zzh = zzaaVar;
        zzin zzinVar = new zzin(zzlfVar);
        zzinVar.zzX();
        zzlfVar.zzj = zzinVar;
        zzkq zzkqVar = new zzkq(zzlfVar);
        zzkqVar.zzX();
        zzlfVar.zzg = zzkqVar;
        zzlfVar.zzf = new zzfb(zzlfVar);
        if (zzlfVar.zzr != zzlfVar.zzs) {
            zzlfVar.zzaA().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzlfVar.zzr), Integer.valueOf(zzlfVar.zzs));
        }
        zzlfVar.zzo = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzA() {
        zzaB().zzg();
        zzB();
        if (!this.zzp) {
            this.zzp = true;
            if (zzZ()) {
                FileChannel fileChannel = this.zzx;
                zzaB().zzg();
                int i10 = 0;
                if (fileChannel != null && fileChannel.isOpen()) {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0L);
                        int read = fileChannel.read(allocate);
                        if (read != 4) {
                            if (read != -1) {
                                zzaA().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(read));
                            }
                        } else {
                            allocate.flip();
                            i10 = allocate.getInt();
                        }
                    } catch (IOException e10) {
                        zzaA().zzd().zzb("Failed to read from channel", e10);
                    }
                } else {
                    zzaA().zzd().zza("Bad channel to read from");
                }
                int zzi = this.zzn.zzh().zzi();
                zzaB().zzg();
                if (i10 > zzi) {
                    zzaA().zzd().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i10), Integer.valueOf(zzi));
                } else if (i10 < zzi) {
                    FileChannel fileChannel2 = this.zzx;
                    zzaB().zzg();
                    if (fileChannel2 != null && fileChannel2.isOpen()) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(zzi);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0L);
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                zzaA().zzd().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            zzaA().zzj().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i10), Integer.valueOf(zzi));
                            return;
                        } catch (IOException e11) {
                            zzaA().zzd().zzb("Failed to write to channel", e11);
                        }
                    } else {
                        zzaA().zzd().zza("Bad channel to read from");
                    }
                    zzaA().zzd().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i10), Integer.valueOf(zzi));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzB() {
        if (this.zzo) {
            return;
        }
        throw new IllegalStateException("UploadController is not initialized");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzC(String str, com.google.android.gms.internal.measurement.zzgc zzgcVar) {
        int zza;
        int indexOf;
        zzfu zzfuVar = this.zzc;
        zzal(zzfuVar);
        Set zzk = zzfuVar.zzk(str);
        if (zzk != null) {
            zzgcVar.zzi(zzk);
        }
        zzfu zzfuVar2 = this.zzc;
        zzal(zzfuVar2);
        if (zzfuVar2.zzv(str)) {
            zzgcVar.zzp();
        }
        zzfu zzfuVar3 = this.zzc;
        zzal(zzfuVar3);
        if (zzfuVar3.zzy(str)) {
            if (zzg().zzs(str, zzeg.zzar)) {
                String zzas = zzgcVar.zzas();
                if (!TextUtils.isEmpty(zzas) && (indexOf = zzas.indexOf(".")) != -1) {
                    zzgcVar.zzY(zzas.substring(0, indexOf));
                }
            } else {
                zzgcVar.zzu();
            }
        }
        zzfu zzfuVar4 = this.zzc;
        zzal(zzfuVar4);
        if (zzfuVar4.zzz(str) && (zza = zzlh.zza(zzgcVar, "_id")) != -1) {
            zzgcVar.zzB(zza);
        }
        zzfu zzfuVar5 = this.zzc;
        zzal(zzfuVar5);
        if (zzfuVar5.zzx(str)) {
            zzgcVar.zzq();
        }
        zzfu zzfuVar6 = this.zzc;
        zzal(zzfuVar6);
        if (zzfuVar6.zzu(str)) {
            zzgcVar.zzn();
            zzle zzleVar = (zzle) this.zzC.get(str);
            if (zzleVar == null || zzleVar.zzb + zzg().zzi(str, zzeg.zzT) < zzax().elapsedRealtime()) {
                zzleVar = new zzle(this);
                this.zzC.put(str, zzleVar);
            }
            zzgcVar.zzR(zzleVar.zza);
        }
        zzfu zzfuVar7 = this.zzc;
        zzal(zzfuVar7);
        if (zzfuVar7.zzw(str)) {
            zzgcVar.zzy();
        }
    }

    final void zzD(zzh zzhVar) {
        zzaB().zzg();
        if (TextUtils.isEmpty(zzhVar.zzz()) && TextUtils.isEmpty(zzhVar.zzs())) {
            zzI((String) Preconditions.checkNotNull(zzhVar.zzu()), 204, null, null, null);
            return;
        }
        zzku zzkuVar = this.zzl;
        Uri.Builder builder = new Uri.Builder();
        String zzz = zzhVar.zzz();
        if (TextUtils.isEmpty(zzz)) {
            zzz = zzhVar.zzs();
        }
        a aVar = null;
        Uri.Builder appendQueryParameter = builder.scheme((String) zzeg.zze.zza(null)).encodedAuthority((String) zzeg.zzf.zza(null)).path("config/app/".concat(String.valueOf(zzz))).appendQueryParameter("platform", "android");
        zzkuVar.zzt.zzf().zzh();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(76003L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            String str = (String) Preconditions.checkNotNull(zzhVar.zzu());
            URL url = new URL(uri);
            zzaA().zzj().zzb("Fetching remote configuration", str);
            zzfu zzfuVar = this.zzc;
            zzal(zzfuVar);
            com.google.android.gms.internal.measurement.zzff zze = zzfuVar.zze(str);
            zzfu zzfuVar2 = this.zzc;
            zzal(zzfuVar2);
            String zzh = zzfuVar2.zzh(str);
            if (zze != null) {
                if (!TextUtils.isEmpty(zzh)) {
                    a aVar2 = new a();
                    aVar2.put("If-Modified-Since", zzh);
                    aVar = aVar2;
                }
                zzfu zzfuVar3 = this.zzc;
                zzal(zzfuVar3);
                String zzf = zzfuVar3.zzf(str);
                if (!TextUtils.isEmpty(zzf)) {
                    if (aVar == null) {
                        aVar = new a();
                    }
                    aVar.put("If-None-Match", zzf);
                }
            }
            this.zzt = true;
            zzez zzezVar = this.zzd;
            zzal(zzezVar);
            zzkx zzkxVar = new zzkx(this);
            zzezVar.zzg();
            zzezVar.zzW();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzkxVar);
            zzezVar.zzt.zzaB().zzo(new zzey(zzezVar, str, url, null, aVar, zzkxVar));
        } catch (MalformedURLException unused) {
            zzaA().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzet.zzn(zzhVar.zzu()), uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzE(zzaw zzawVar, zzq zzqVar) {
        zzaw zzawVar2;
        List<zzac> zzt;
        List<zzac> zzt2;
        List<zzac> zzt3;
        String str;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzaB().zzg();
        zzB();
        String str2 = zzqVar.zza;
        long j10 = zzawVar.zzd;
        zzeu zzb2 = zzeu.zzb(zzawVar);
        zzaB().zzg();
        zzip zzipVar = null;
        if (this.zzD != null && (str = this.zzE) != null && str.equals(str2)) {
            zzipVar = this.zzD;
        }
        zzln.zzK(zzipVar, zzb2.zzd, false);
        zzaw zza = zzb2.zza();
        zzal(this.zzi);
        if (!zzlh.zzA(zza, zzqVar)) {
            return;
        }
        if (!zzqVar.zzh) {
            zzd(zzqVar);
            return;
        }
        List list = zzqVar.zzt;
        if (list != null) {
            if (list.contains(zza.zza)) {
                Bundle zzc = zza.zzb.zzc();
                zzc.putLong("ga_safelisted", 1L);
                zzawVar2 = new zzaw(zza.zza, new zzau(zzc), zza.zzc, zza.zzd);
            } else {
                zzaA().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zza.zza, zza.zzc);
                return;
            }
        } else {
            zzawVar2 = zza;
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzw();
        try {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            Preconditions.checkNotEmpty(str2);
            zzamVar2.zzg();
            zzamVar2.zzW();
            if (j10 < 0) {
                zzamVar2.zzt.zzaA().zzk().zzc("Invalid time querying timed out conditional properties", zzet.zzn(str2), Long.valueOf(j10));
                zzt = Collections.emptyList();
            } else {
                zzt = zzamVar2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j10)});
            }
            for (zzac zzacVar : zzt) {
                if (zzacVar != null) {
                    zzaA().zzj().zzd("User property timed out", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb), zzacVar.zzc.zza());
                    zzaw zzawVar3 = zzacVar.zzg;
                    if (zzawVar3 != null) {
                        zzY(new zzaw(zzawVar3, j10), zzqVar);
                    }
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    zzamVar3.zza(str2, zzacVar.zzc.zzb);
                }
            }
            zzam zzamVar4 = this.zze;
            zzal(zzamVar4);
            Preconditions.checkNotEmpty(str2);
            zzamVar4.zzg();
            zzamVar4.zzW();
            if (j10 < 0) {
                zzamVar4.zzt.zzaA().zzk().zzc("Invalid time querying expired conditional properties", zzet.zzn(str2), Long.valueOf(j10));
                zzt2 = Collections.emptyList();
            } else {
                zzt2 = zzamVar4.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j10)});
            }
            ArrayList arrayList = new ArrayList(zzt2.size());
            for (zzac zzacVar2 : zzt2) {
                if (zzacVar2 != null) {
                    zzaA().zzj().zzd("User property expired", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                    zzam zzamVar5 = this.zze;
                    zzal(zzamVar5);
                    zzamVar5.zzA(str2, zzacVar2.zzc.zzb);
                    zzaw zzawVar4 = zzacVar2.zzk;
                    if (zzawVar4 != null) {
                        arrayList.add(zzawVar4);
                    }
                    zzam zzamVar6 = this.zze;
                    zzal(zzamVar6);
                    zzamVar6.zza(str2, zzacVar2.zzc.zzb);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zzY(new zzaw((zzaw) it.next(), j10), zzqVar);
            }
            zzam zzamVar7 = this.zze;
            zzal(zzamVar7);
            String str3 = zzawVar2.zza;
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str3);
            zzamVar7.zzg();
            zzamVar7.zzW();
            if (j10 < 0) {
                zzamVar7.zzt.zzaA().zzk().zzd("Invalid time querying triggered conditional properties", zzet.zzn(str2), zzamVar7.zzt.zzj().zzd(str3), Long.valueOf(j10));
                zzt3 = Collections.emptyList();
            } else {
                zzt3 = zzamVar7.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j10)});
            }
            ArrayList arrayList2 = new ArrayList(zzt3.size());
            for (zzac zzacVar3 : zzt3) {
                if (zzacVar3 != null) {
                    zzli zzliVar = zzacVar3.zzc;
                    zzlk zzlkVar = new zzlk((String) Preconditions.checkNotNull(zzacVar3.zza), zzacVar3.zzb, zzliVar.zzb, j10, Preconditions.checkNotNull(zzliVar.zza()));
                    zzam zzamVar8 = this.zze;
                    zzal(zzamVar8);
                    if (zzamVar8.zzL(zzlkVar)) {
                        zzaA().zzj().zzd("User property triggered", zzacVar3.zza, this.zzn.zzj().zzf(zzlkVar.zzc), zzlkVar.zze);
                    } else {
                        zzaA().zzd().zzd("Too many active user properties, ignoring", zzet.zzn(zzacVar3.zza), this.zzn.zzj().zzf(zzlkVar.zzc), zzlkVar.zze);
                    }
                    zzaw zzawVar5 = zzacVar3.zzi;
                    if (zzawVar5 != null) {
                        arrayList2.add(zzawVar5);
                    }
                    zzacVar3.zzc = new zzli(zzlkVar);
                    zzacVar3.zze = true;
                    zzam zzamVar9 = this.zze;
                    zzal(zzamVar9);
                    zzamVar9.zzK(zzacVar3);
                }
            }
            zzY(zzawVar2, zzqVar);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                zzY(new zzaw((zzaw) it2.next(), j10), zzqVar);
            }
            zzam zzamVar10 = this.zze;
            zzal(zzamVar10);
            zzamVar10.zzC();
        } finally {
            zzam zzamVar11 = this.zze;
            zzal(zzamVar11);
            zzamVar11.zzx();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzF(zzaw zzawVar, String str) {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzj = zzamVar.zzj(str);
        if (zzj != null && !TextUtils.isEmpty(zzj.zzx())) {
            Boolean zzad = zzad(zzj);
            if (zzad == null) {
                if (!"_ui".equals(zzawVar.zza)) {
                    zzaA().zzk().zzb("Could not find package. appId", zzet.zzn(str));
                }
            } else if (!zzad.booleanValue()) {
                zzaA().zzd().zzb("App version does not match; dropping event. appId", zzet.zzn(str));
                return;
            }
            String zzz = zzj.zzz();
            String zzx = zzj.zzx();
            long zzb2 = zzj.zzb();
            String zzw = zzj.zzw();
            long zzm = zzj.zzm();
            long zzj2 = zzj.zzj();
            boolean zzal = zzj.zzal();
            String zzy = zzj.zzy();
            zzj.zza();
            zzG(zzawVar, new zzq(str, zzz, zzx, zzb2, zzw, zzm, zzj2, (String) null, zzal, false, zzy, 0L, 0L, 0, zzj.zzak(), false, zzj.zzs(), zzj.zzr(), zzj.zzk(), zzj.zzD(), (String) null, zzh(str).zzh(), "", (String) null, zzj.zzan(), zzj.zzq()));
            return;
        }
        zzaA().zzc().zzb("No app data available; dropping event", str);
    }

    final void zzG(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzeu zzb2 = zzeu.zzb(zzawVar);
        zzln zzv = zzv();
        Bundle bundle = zzb2.zzd;
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzv.zzL(bundle, zzamVar.zzi(zzqVar.zza));
        zzv().zzN(zzb2, zzg().zzd(zzqVar.zza));
        zzaw zza = zzb2.zza();
        if ("_cmp".equals(zza.zza) && "referrer API v2".equals(zza.zzb.zzg("_cis"))) {
            String zzg = zza.zzb.zzg("gclid");
            if (!TextUtils.isEmpty(zzg)) {
                zzW(new zzli("_lgclid", zza.zzd, zzg, "auto"), zzqVar);
            }
        }
        zzE(zza, zzqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzH() {
        this.zzs++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[Catch: all -> 0x0177, TryCatch #1 {all -> 0x0177, blocks: (B:6:0x002c, B:16:0x004a, B:61:0x0161, B:21:0x0064, B:26:0x00b6, B:25:0x00a7, B:29:0x00be, B:32:0x00ca, B:34:0x00d0, B:37:0x00da, B:40:0x00e6, B:42:0x00ec, B:47:0x00f9, B:51:0x0115, B:53:0x012a, B:55:0x0149, B:57:0x0154, B:59:0x015a, B:60:0x015e, B:54:0x0138, B:48:0x0102, B:50:0x010d), top: B:72:0x002c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a A[Catch: all -> 0x0177, TryCatch #1 {all -> 0x0177, blocks: (B:6:0x002c, B:16:0x004a, B:61:0x0161, B:21:0x0064, B:26:0x00b6, B:25:0x00a7, B:29:0x00be, B:32:0x00ca, B:34:0x00d0, B:37:0x00da, B:40:0x00e6, B:42:0x00ec, B:47:0x00f9, B:51:0x0115, B:53:0x012a, B:55:0x0149, B:57:0x0154, B:59:0x015a, B:60:0x015e, B:54:0x0138, B:48:0x0102, B:50:0x010d), top: B:72:0x002c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0138 A[Catch: all -> 0x0177, TryCatch #1 {all -> 0x0177, blocks: (B:6:0x002c, B:16:0x004a, B:61:0x0161, B:21:0x0064, B:26:0x00b6, B:25:0x00a7, B:29:0x00be, B:32:0x00ca, B:34:0x00d0, B:37:0x00da, B:40:0x00e6, B:42:0x00ec, B:47:0x00f9, B:51:0x0115, B:53:0x012a, B:55:0x0149, B:57:0x0154, B:59:0x015a, B:60:0x015e, B:54:0x0138, B:48:0x0102, B:50:0x010d), top: B:72:0x002c, outer: #0 }] */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzI(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlf.zzI(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzJ(boolean z10) {
        zzag();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzK(int i10, Throwable th, byte[] bArr, String str) {
        zzam zzamVar;
        long longValue;
        zzaB().zzg();
        zzB();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzu = false;
                zzae();
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.zzy);
        this.zzy = null;
        if (i10 != 200) {
            if (i10 == 204) {
                i10 = 204;
            }
            zzaA().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th);
            this.zzk.zzd.zzb(zzax().currentTimeMillis());
            if (i10 != 503 || i10 == 429) {
                this.zzk.zzb.zzb(zzax().currentTimeMillis());
            }
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzamVar2.zzy(list);
            zzag();
        }
        if (th == null) {
            try {
                this.zzk.zzc.zzb(zzax().currentTimeMillis());
                this.zzk.zzd.zzb(0L);
                zzag();
                zzaA().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i10), Integer.valueOf(bArr.length));
                zzam zzamVar3 = this.zze;
                zzal(zzamVar3);
                zzamVar3.zzw();
            } catch (SQLiteException e10) {
                zzaA().zzd().zzb("Database error while trying to delete uploaded bundles", e10);
                this.zza = zzax().elapsedRealtime();
                zzaA().zzj().zzb("Disable upload, time", Long.valueOf(this.zza));
            }
            try {
                for (Long l10 : list) {
                    try {
                        zzamVar = this.zze;
                        zzal(zzamVar);
                        longValue = l10.longValue();
                        zzamVar.zzg();
                        zzamVar.zzW();
                    } catch (SQLiteException e11) {
                        List list2 = this.zzz;
                        if (list2 == null || !list2.contains(l10)) {
                            throw e11;
                        }
                    }
                    try {
                        if (zzamVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                            break;
                        }
                    } catch (SQLiteException e12) {
                        zzamVar.zzt.zzaA().zzd().zzb("Failed to delete a bundle in a queue table", e12);
                        throw e12;
                        break;
                    }
                }
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzamVar4.zzC();
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzx();
                this.zzz = null;
                zzez zzezVar = this.zzd;
                zzal(zzezVar);
                if (zzezVar.zza() && zzai()) {
                    zzX();
                } else {
                    this.zzA = -1L;
                    zzag();
                }
                this.zza = 0L;
            } catch (Throwable th2) {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
                throw th2;
            }
        }
        zzaA().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th);
        this.zzk.zzd.zzb(zzax().currentTimeMillis());
        if (i10 != 503) {
        }
        this.zzk.zzb.zzb(zzax().currentTimeMillis());
        zzam zzamVar22 = this.zze;
        zzal(zzamVar22);
        zzamVar22.zzy(list);
        zzag();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:97|98)|(2:100|(8:102|(3:104|(2:106|(1:108))(1:127)|109)(1:128)|110|(1:112)(1:126)|113|114|115|(4:117|(1:119)|120|(1:122))))|129|114|115|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04aa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04ab, code lost:
    
        zzaA().zzd().zzc("Application info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.zzet.zzn(r3), r0);
        r3 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03db A[Catch: all -> 0x0573, TryCatch #1 {all -> 0x0573, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a4, B:52:0x01a9, B:54:0x01af, B:56:0x01b8, B:68:0x01f2, B:70:0x01fd, B:74:0x020a, B:77:0x0218, B:81:0x0223, B:83:0x0226, B:84:0x0246, B:86:0x024b, B:89:0x026a, B:92:0x027e, B:94:0x02a5, B:97:0x02ad, B:99:0x02bc, B:133:0x03a7, B:135:0x03db, B:136:0x03de, B:138:0x0407, B:177:0x04de, B:178:0x04e1, B:186:0x0562, B:140:0x041c, B:145:0x0441, B:147:0x0449, B:149:0x0453, B:153:0x0466, B:157:0x0477, B:161:0x0483, B:164:0x049a, B:167:0x04ab, B:169:0x04bf, B:171:0x04c4, B:172:0x04cb, B:174:0x04d1, B:155:0x046f, B:143:0x042d, B:101:0x02ce, B:103:0x02f9, B:104:0x0309, B:106:0x0310, B:108:0x0316, B:110:0x0320, B:112:0x0326, B:114:0x032c, B:116:0x0332, B:117:0x0337, B:119:0x0342, B:123:0x0359, B:129:0x0361, B:130:0x0375, B:131:0x0386, B:132:0x0397, B:179:0x04f8, B:181:0x0529, B:182:0x052c, B:183:0x0543, B:185:0x0547, B:87:0x025a, B:64:0x01d7, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:195:0x00a6, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0407 A[Catch: all -> 0x0573, TRY_LEAVE, TryCatch #1 {all -> 0x0573, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a4, B:52:0x01a9, B:54:0x01af, B:56:0x01b8, B:68:0x01f2, B:70:0x01fd, B:74:0x020a, B:77:0x0218, B:81:0x0223, B:83:0x0226, B:84:0x0246, B:86:0x024b, B:89:0x026a, B:92:0x027e, B:94:0x02a5, B:97:0x02ad, B:99:0x02bc, B:133:0x03a7, B:135:0x03db, B:136:0x03de, B:138:0x0407, B:177:0x04de, B:178:0x04e1, B:186:0x0562, B:140:0x041c, B:145:0x0441, B:147:0x0449, B:149:0x0453, B:153:0x0466, B:157:0x0477, B:161:0x0483, B:164:0x049a, B:167:0x04ab, B:169:0x04bf, B:171:0x04c4, B:172:0x04cb, B:174:0x04d1, B:155:0x046f, B:143:0x042d, B:101:0x02ce, B:103:0x02f9, B:104:0x0309, B:106:0x0310, B:108:0x0316, B:110:0x0320, B:112:0x0326, B:114:0x032c, B:116:0x0332, B:117:0x0337, B:119:0x0342, B:123:0x0359, B:129:0x0361, B:130:0x0375, B:131:0x0386, B:132:0x0397, B:179:0x04f8, B:181:0x0529, B:182:0x052c, B:183:0x0543, B:185:0x0547, B:87:0x025a, B:64:0x01d7, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:195:0x00a6, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04bf A[Catch: all -> 0x0573, TryCatch #1 {all -> 0x0573, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a4, B:52:0x01a9, B:54:0x01af, B:56:0x01b8, B:68:0x01f2, B:70:0x01fd, B:74:0x020a, B:77:0x0218, B:81:0x0223, B:83:0x0226, B:84:0x0246, B:86:0x024b, B:89:0x026a, B:92:0x027e, B:94:0x02a5, B:97:0x02ad, B:99:0x02bc, B:133:0x03a7, B:135:0x03db, B:136:0x03de, B:138:0x0407, B:177:0x04de, B:178:0x04e1, B:186:0x0562, B:140:0x041c, B:145:0x0441, B:147:0x0449, B:149:0x0453, B:153:0x0466, B:157:0x0477, B:161:0x0483, B:164:0x049a, B:167:0x04ab, B:169:0x04bf, B:171:0x04c4, B:172:0x04cb, B:174:0x04d1, B:155:0x046f, B:143:0x042d, B:101:0x02ce, B:103:0x02f9, B:104:0x0309, B:106:0x0310, B:108:0x0316, B:110:0x0320, B:112:0x0326, B:114:0x032c, B:116:0x0332, B:117:0x0337, B:119:0x0342, B:123:0x0359, B:129:0x0361, B:130:0x0375, B:131:0x0386, B:132:0x0397, B:179:0x04f8, B:181:0x0529, B:182:0x052c, B:183:0x0543, B:185:0x0547, B:87:0x025a, B:64:0x01d7, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:195:0x00a6, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04de A[Catch: all -> 0x0573, TryCatch #1 {all -> 0x0573, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a4, B:52:0x01a9, B:54:0x01af, B:56:0x01b8, B:68:0x01f2, B:70:0x01fd, B:74:0x020a, B:77:0x0218, B:81:0x0223, B:83:0x0226, B:84:0x0246, B:86:0x024b, B:89:0x026a, B:92:0x027e, B:94:0x02a5, B:97:0x02ad, B:99:0x02bc, B:133:0x03a7, B:135:0x03db, B:136:0x03de, B:138:0x0407, B:177:0x04de, B:178:0x04e1, B:186:0x0562, B:140:0x041c, B:145:0x0441, B:147:0x0449, B:149:0x0453, B:153:0x0466, B:157:0x0477, B:161:0x0483, B:164:0x049a, B:167:0x04ab, B:169:0x04bf, B:171:0x04c4, B:172:0x04cb, B:174:0x04d1, B:155:0x046f, B:143:0x042d, B:101:0x02ce, B:103:0x02f9, B:104:0x0309, B:106:0x0310, B:108:0x0316, B:110:0x0320, B:112:0x0326, B:114:0x032c, B:116:0x0332, B:117:0x0337, B:119:0x0342, B:123:0x0359, B:129:0x0361, B:130:0x0375, B:131:0x0386, B:132:0x0397, B:179:0x04f8, B:181:0x0529, B:182:0x052c, B:183:0x0543, B:185:0x0547, B:87:0x025a, B:64:0x01d7, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:195:0x00a6, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0543 A[Catch: all -> 0x0573, TryCatch #1 {all -> 0x0573, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a4, B:52:0x01a9, B:54:0x01af, B:56:0x01b8, B:68:0x01f2, B:70:0x01fd, B:74:0x020a, B:77:0x0218, B:81:0x0223, B:83:0x0226, B:84:0x0246, B:86:0x024b, B:89:0x026a, B:92:0x027e, B:94:0x02a5, B:97:0x02ad, B:99:0x02bc, B:133:0x03a7, B:135:0x03db, B:136:0x03de, B:138:0x0407, B:177:0x04de, B:178:0x04e1, B:186:0x0562, B:140:0x041c, B:145:0x0441, B:147:0x0449, B:149:0x0453, B:153:0x0466, B:157:0x0477, B:161:0x0483, B:164:0x049a, B:167:0x04ab, B:169:0x04bf, B:171:0x04c4, B:172:0x04cb, B:174:0x04d1, B:155:0x046f, B:143:0x042d, B:101:0x02ce, B:103:0x02f9, B:104:0x0309, B:106:0x0310, B:108:0x0316, B:110:0x0320, B:112:0x0326, B:114:0x032c, B:116:0x0332, B:117:0x0337, B:119:0x0342, B:123:0x0359, B:129:0x0361, B:130:0x0375, B:131:0x0386, B:132:0x0397, B:179:0x04f8, B:181:0x0529, B:182:0x052c, B:183:0x0543, B:185:0x0547, B:87:0x025a, B:64:0x01d7, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:195:0x00a6, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x041c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f2 A[Catch: all -> 0x0573, TryCatch #1 {all -> 0x0573, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a4, B:52:0x01a9, B:54:0x01af, B:56:0x01b8, B:68:0x01f2, B:70:0x01fd, B:74:0x020a, B:77:0x0218, B:81:0x0223, B:83:0x0226, B:84:0x0246, B:86:0x024b, B:89:0x026a, B:92:0x027e, B:94:0x02a5, B:97:0x02ad, B:99:0x02bc, B:133:0x03a7, B:135:0x03db, B:136:0x03de, B:138:0x0407, B:177:0x04de, B:178:0x04e1, B:186:0x0562, B:140:0x041c, B:145:0x0441, B:147:0x0449, B:149:0x0453, B:153:0x0466, B:157:0x0477, B:161:0x0483, B:164:0x049a, B:167:0x04ab, B:169:0x04bf, B:171:0x04c4, B:172:0x04cb, B:174:0x04d1, B:155:0x046f, B:143:0x042d, B:101:0x02ce, B:103:0x02f9, B:104:0x0309, B:106:0x0310, B:108:0x0316, B:110:0x0320, B:112:0x0326, B:114:0x032c, B:116:0x0332, B:117:0x0337, B:119:0x0342, B:123:0x0359, B:129:0x0361, B:130:0x0375, B:131:0x0386, B:132:0x0397, B:179:0x04f8, B:181:0x0529, B:182:0x052c, B:183:0x0543, B:185:0x0547, B:87:0x025a, B:64:0x01d7, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:195:0x00a6, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024b A[Catch: all -> 0x0573, TryCatch #1 {all -> 0x0573, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a4, B:52:0x01a9, B:54:0x01af, B:56:0x01b8, B:68:0x01f2, B:70:0x01fd, B:74:0x020a, B:77:0x0218, B:81:0x0223, B:83:0x0226, B:84:0x0246, B:86:0x024b, B:89:0x026a, B:92:0x027e, B:94:0x02a5, B:97:0x02ad, B:99:0x02bc, B:133:0x03a7, B:135:0x03db, B:136:0x03de, B:138:0x0407, B:177:0x04de, B:178:0x04e1, B:186:0x0562, B:140:0x041c, B:145:0x0441, B:147:0x0449, B:149:0x0453, B:153:0x0466, B:157:0x0477, B:161:0x0483, B:164:0x049a, B:167:0x04ab, B:169:0x04bf, B:171:0x04c4, B:172:0x04cb, B:174:0x04d1, B:155:0x046f, B:143:0x042d, B:101:0x02ce, B:103:0x02f9, B:104:0x0309, B:106:0x0310, B:108:0x0316, B:110:0x0320, B:112:0x0326, B:114:0x032c, B:116:0x0332, B:117:0x0337, B:119:0x0342, B:123:0x0359, B:129:0x0361, B:130:0x0375, B:131:0x0386, B:132:0x0397, B:179:0x04f8, B:181:0x0529, B:182:0x052c, B:183:0x0543, B:185:0x0547, B:87:0x025a, B:64:0x01d7, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:195:0x00a6, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025a A[Catch: all -> 0x0573, TryCatch #1 {all -> 0x0573, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a4, B:52:0x01a9, B:54:0x01af, B:56:0x01b8, B:68:0x01f2, B:70:0x01fd, B:74:0x020a, B:77:0x0218, B:81:0x0223, B:83:0x0226, B:84:0x0246, B:86:0x024b, B:89:0x026a, B:92:0x027e, B:94:0x02a5, B:97:0x02ad, B:99:0x02bc, B:133:0x03a7, B:135:0x03db, B:136:0x03de, B:138:0x0407, B:177:0x04de, B:178:0x04e1, B:186:0x0562, B:140:0x041c, B:145:0x0441, B:147:0x0449, B:149:0x0453, B:153:0x0466, B:157:0x0477, B:161:0x0483, B:164:0x049a, B:167:0x04ab, B:169:0x04bf, B:171:0x04c4, B:172:0x04cb, B:174:0x04d1, B:155:0x046f, B:143:0x042d, B:101:0x02ce, B:103:0x02f9, B:104:0x0309, B:106:0x0310, B:108:0x0316, B:110:0x0320, B:112:0x0326, B:114:0x032c, B:116:0x0332, B:117:0x0337, B:119:0x0342, B:123:0x0359, B:129:0x0361, B:130:0x0375, B:131:0x0386, B:132:0x0397, B:179:0x04f8, B:181:0x0529, B:182:0x052c, B:183:0x0543, B:185:0x0547, B:87:0x025a, B:64:0x01d7, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:195:0x00a6, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026a A[Catch: all -> 0x0573, TRY_LEAVE, TryCatch #1 {all -> 0x0573, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a4, B:52:0x01a9, B:54:0x01af, B:56:0x01b8, B:68:0x01f2, B:70:0x01fd, B:74:0x020a, B:77:0x0218, B:81:0x0223, B:83:0x0226, B:84:0x0246, B:86:0x024b, B:89:0x026a, B:92:0x027e, B:94:0x02a5, B:97:0x02ad, B:99:0x02bc, B:133:0x03a7, B:135:0x03db, B:136:0x03de, B:138:0x0407, B:177:0x04de, B:178:0x04e1, B:186:0x0562, B:140:0x041c, B:145:0x0441, B:147:0x0449, B:149:0x0453, B:153:0x0466, B:157:0x0477, B:161:0x0483, B:164:0x049a, B:167:0x04ab, B:169:0x04bf, B:171:0x04c4, B:172:0x04cb, B:174:0x04d1, B:155:0x046f, B:143:0x042d, B:101:0x02ce, B:103:0x02f9, B:104:0x0309, B:106:0x0310, B:108:0x0316, B:110:0x0320, B:112:0x0326, B:114:0x032c, B:116:0x0332, B:117:0x0337, B:119:0x0342, B:123:0x0359, B:129:0x0361, B:130:0x0375, B:131:0x0386, B:132:0x0397, B:179:0x04f8, B:181:0x0529, B:182:0x052c, B:183:0x0543, B:185:0x0547, B:87:0x025a, B:64:0x01d7, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:195:0x00a6, inners: #0, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzL(com.google.android.gms.measurement.internal.zzq r24) {
        /*
            Method dump skipped, instructions count: 1406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlf.zzL(com.google.android.gms.measurement.internal.zzq):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzM() {
        this.zzr++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzN(zzac zzacVar) {
        zzq zzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzac != null) {
            zzO(zzacVar, zzac);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzO(zzac zzacVar, zzq zzqVar) {
        Bundle bundle;
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaB().zzg();
        zzB();
        if (!zzak(zzqVar)) {
            return;
        }
        if (zzqVar.zzh) {
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                String str = (String) Preconditions.checkNotNull(zzacVar.zza);
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzac zzk = zzamVar2.zzk(str, zzacVar.zzc.zzb);
                if (zzk != null) {
                    zzaA().zzc().zzc("Removing conditional user property", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    zzamVar3.zza(str, zzacVar.zzc.zzb);
                    if (zzk.zze) {
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzA(str, zzacVar.zzc.zzb);
                    }
                    zzaw zzawVar = zzacVar.zzk;
                    if (zzawVar != null) {
                        zzau zzauVar = zzawVar.zzb;
                        if (zzauVar != null) {
                            bundle = zzauVar.zzc();
                        } else {
                            bundle = null;
                        }
                        zzY((zzaw) Preconditions.checkNotNull(zzv().zzz(str, ((zzaw) Preconditions.checkNotNull(zzacVar.zzk)).zza, bundle, zzk.zzb, zzacVar.zzk.zzd, true, true)), zzqVar);
                    }
                } else {
                    zzaA().zzk().zzc("Conditional user property doesn't exist", zzet.zzn(zzacVar.zza), this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
                return;
            } finally {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
            }
        }
        zzd(zzqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzP(String str, zzq zzqVar) {
        long j10;
        zzaB().zzg();
        zzB();
        if (!zzak(zzqVar)) {
            return;
        }
        if (!zzqVar.zzh) {
            zzd(zzqVar);
        } else if ("_npa".equals(str) && zzqVar.zzr != null) {
            zzaA().zzc().zza("Falling back to manifest metadata value for ad personalization");
            long currentTimeMillis = zzax().currentTimeMillis();
            if (true != zzqVar.zzr.booleanValue()) {
                j10 = 0;
            } else {
                j10 = 1;
            }
            zzW(new zzli("_npa", currentTimeMillis, Long.valueOf(j10), "auto"), zzqVar);
        } else {
            zzaA().zzc().zzb("Removing user property", this.zzn.zzj().zzf(str));
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                if ("_id".equals(str)) {
                    zzam zzamVar2 = this.zze;
                    zzal(zzamVar2);
                    zzamVar2.zzA((String) Preconditions.checkNotNull(zzqVar.zza), "_lair");
                }
                zzam zzamVar3 = this.zze;
                zzal(zzamVar3);
                zzamVar3.zzA((String) Preconditions.checkNotNull(zzqVar.zza), str);
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzamVar4.zzC();
                zzaA().zzc().zzb("User property removed", this.zzn.zzj().zzf(str));
            } finally {
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzx();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzQ(zzq zzqVar) {
        if (this.zzy != null) {
            ArrayList arrayList = new ArrayList();
            this.zzz = arrayList;
            arrayList.addAll(this.zzy);
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        String str = (String) Preconditions.checkNotNull(zzqVar.zza);
        Preconditions.checkNotEmpty(str);
        zzamVar.zzg();
        zzamVar.zzW();
        try {
            SQLiteDatabase zzh = zzamVar.zzh();
            String[] strArr = {str};
            int delete = zzh.delete("apps", "app_id=?", strArr) + zzh.delete("events", "app_id=?", strArr) + zzh.delete("user_attributes", "app_id=?", strArr) + zzh.delete("conditional_properties", "app_id=?", strArr) + zzh.delete("raw_events", "app_id=?", strArr) + zzh.delete("raw_events_metadata", "app_id=?", strArr) + zzh.delete("queue", "app_id=?", strArr) + zzh.delete("audience_filter_values", "app_id=?", strArr) + zzh.delete("main_event_params", "app_id=?", strArr) + zzh.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zzamVar.zzt.zzaA().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            zzamVar.zzt.zzaA().zzd().zzc("Error resetting analytics data. appId, error", zzet.zzn(str), e10);
        }
        if (zzqVar.zzh) {
            zzL(zzqVar);
        }
    }

    public final void zzR(String str, zzip zzipVar) {
        zzaB().zzg();
        String str2 = this.zzE;
        if (str2 != null && !str2.equals(str) && zzipVar == null) {
            return;
        }
        this.zzE = str;
        this.zzD = zzipVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzS() {
        zzaB().zzg();
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzz();
        if (this.zzk.zzc.zza() == 0) {
            this.zzk.zzc.zzb(zzax().currentTimeMillis());
        }
        zzag();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzT(zzac zzacVar) {
        zzq zzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzac != null) {
            zzU(zzacVar, zzac);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzU(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzb);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaB().zzg();
        zzB();
        if (!zzak(zzqVar)) {
            return;
        }
        if (!zzqVar.zzh) {
            zzd(zzqVar);
            return;
        }
        zzac zzacVar2 = new zzac(zzacVar);
        boolean z10 = false;
        zzacVar2.zze = false;
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzw();
        try {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzac zzk = zzamVar2.zzk((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzc.zzb);
            if (zzk != null && !zzk.zzb.equals(zzacVar2.zzb)) {
                zzaA().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzb, zzk.zzb);
            }
            if (zzk != null && zzk.zze) {
                zzacVar2.zzb = zzk.zzb;
                zzacVar2.zzd = zzk.zzd;
                zzacVar2.zzh = zzk.zzh;
                zzacVar2.zzf = zzk.zzf;
                zzacVar2.zzi = zzk.zzi;
                zzacVar2.zze = true;
                zzli zzliVar = zzacVar2.zzc;
                zzacVar2.zzc = new zzli(zzliVar.zzb, zzk.zzc.zzc, zzliVar.zza(), zzk.zzc.zzf);
            } else if (TextUtils.isEmpty(zzacVar2.zzf)) {
                zzli zzliVar2 = zzacVar2.zzc;
                zzacVar2.zzc = new zzli(zzliVar2.zzb, zzacVar2.zzd, zzliVar2.zza(), zzacVar2.zzc.zzf);
                zzacVar2.zze = true;
                z10 = true;
            }
            if (zzacVar2.zze) {
                zzli zzliVar3 = zzacVar2.zzc;
                zzlk zzlkVar = new zzlk((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzb, zzliVar3.zzb, zzliVar3.zzc, Preconditions.checkNotNull(zzliVar3.zza()));
                zzam zzamVar3 = this.zze;
                zzal(zzamVar3);
                if (zzamVar3.zzL(zzlkVar)) {
                    zzaA().zzc().zzd("User property updated immediately", zzacVar2.zza, this.zzn.zzj().zzf(zzlkVar.zzc), zzlkVar.zze);
                } else {
                    zzaA().zzd().zzd("(2)Too many active user properties, ignoring", zzet.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzlkVar.zzc), zzlkVar.zze);
                }
                if (z10 && zzacVar2.zzi != null) {
                    zzY(new zzaw(zzacVar2.zzi, zzacVar2.zzd), zzqVar);
                }
            }
            zzam zzamVar4 = this.zze;
            zzal(zzamVar4);
            if (zzamVar4.zzK(zzacVar2)) {
                zzaA().zzc().zzd("Conditional property added", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
            } else {
                zzaA().zzd().zzd("Too many conditional properties, ignoring", zzet.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
            }
            zzam zzamVar5 = this.zze;
            zzal(zzamVar5);
            zzamVar5.zzC();
        } finally {
            zzam zzamVar6 = this.zze;
            zzal(zzamVar6);
            zzamVar6.zzx();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzV(String str, zzai zzaiVar) {
        zzaB().zzg();
        zzB();
        this.zzB.put(str, zzaiVar);
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzaiVar);
        zzamVar.zzg();
        zzamVar.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzaiVar.zzh());
        try {
            if (zzamVar.zzh().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzamVar.zzt.zzaA().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzet.zzn(str));
            }
        } catch (SQLiteException e10) {
            zzamVar.zzt.zzaA().zzd().zzc("Error storing consent setting. appId, error", zzet.zzn(str), e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzW(zzli zzliVar, zzq zzqVar) {
        long j10;
        int i10;
        int i11;
        zzaB().zzg();
        zzB();
        if (!zzak(zzqVar)) {
            return;
        }
        if (!zzqVar.zzh) {
            zzd(zzqVar);
            return;
        }
        int zzl = zzv().zzl(zzliVar.zzb);
        if (zzl != 0) {
            zzln zzv = zzv();
            String str = zzliVar.zzb;
            zzg();
            String zzD = zzv.zzD(str, 24, true);
            String str2 = zzliVar.zzb;
            if (str2 != null) {
                i11 = str2.length();
            } else {
                i11 = 0;
            }
            zzv().zzO(this.zzF, zzqVar.zza, zzl, "_ev", zzD, i11);
            return;
        }
        int zzd = zzv().zzd(zzliVar.zzb, zzliVar.zza());
        if (zzd != 0) {
            zzln zzv2 = zzv();
            String str3 = zzliVar.zzb;
            zzg();
            String zzD2 = zzv2.zzD(str3, 24, true);
            Object zza = zzliVar.zza();
            if (zza != null && ((zza instanceof String) || (zza instanceof CharSequence))) {
                i10 = zza.toString().length();
            } else {
                i10 = 0;
            }
            zzv().zzO(this.zzF, zzqVar.zza, zzd, "_ev", zzD2, i10);
            return;
        }
        Object zzB = zzv().zzB(zzliVar.zzb, zzliVar.zza());
        if (zzB == null) {
            return;
        }
        if ("_sid".equals(zzliVar.zzb)) {
            long j11 = zzliVar.zzc;
            String str4 = zzliVar.zzf;
            String str5 = (String) Preconditions.checkNotNull(zzqVar.zza);
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzlk zzp = zzamVar.zzp(str5, "_sno");
            if (zzp != null) {
                Object obj = zzp.zze;
                if (obj instanceof Long) {
                    j10 = ((Long) obj).longValue();
                    zzW(new zzli("_sno", j11, Long.valueOf(j10 + 1), str4), zzqVar);
                }
            }
            if (zzp != null) {
                zzaA().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzp.zze);
            }
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzas zzn = zzamVar2.zzn(str5, "_s");
            if (zzn != null) {
                j10 = zzn.zzc;
                zzaA().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(j10));
            } else {
                j10 = 0;
            }
            zzW(new zzli("_sno", j11, Long.valueOf(j10 + 1), str4), zzqVar);
        }
        zzlk zzlkVar = new zzlk((String) Preconditions.checkNotNull(zzqVar.zza), (String) Preconditions.checkNotNull(zzliVar.zzf), zzliVar.zzb, zzliVar.zzc, zzB);
        zzaA().zzj().zzc("Setting user property", this.zzn.zzj().zzf(zzlkVar.zzc), zzB);
        zzam zzamVar3 = this.zze;
        zzal(zzamVar3);
        zzamVar3.zzw();
        try {
            if ("_id".equals(zzlkVar.zzc)) {
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzlk zzp2 = zzamVar4.zzp(zzqVar.zza, "_id");
                if (zzp2 != null && !zzlkVar.zze.equals(zzp2.zze)) {
                    zzam zzamVar5 = this.zze;
                    zzal(zzamVar5);
                    zzamVar5.zzA(zzqVar.zza, "_lair");
                }
            }
            zzd(zzqVar);
            zzam zzamVar6 = this.zze;
            zzal(zzamVar6);
            boolean zzL = zzamVar6.zzL(zzlkVar);
            zzam zzamVar7 = this.zze;
            zzal(zzamVar7);
            zzamVar7.zzC();
            if (!zzL) {
                zzaA().zzd().zzc("Too many unique user properties are set. Ignoring user property", this.zzn.zzj().zzf(zzlkVar.zzc), zzlkVar.zze);
                zzv().zzO(this.zzF, zzqVar.zza, 9, null, null, 0);
            }
        } finally {
            zzam zzamVar8 = this.zze;
            zzal(zzamVar8);
            zzamVar8.zzx();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x050d, code lost:
    
        if (r3 == null) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0126, code lost:
    
        if (r11 == null) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a4 A[Catch: all -> 0x0532, TryCatch #13 {all -> 0x0532, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:41:0x0108, B:54:0x0129, B:58:0x0130, B:59:0x0133, B:60:0x0134, B:64:0x015c, B:68:0x0164, B:74:0x019e, B:131:0x029e, B:133:0x02a4, B:135:0x02b0, B:136:0x02b4, B:138:0x02ba, B:140:0x02ce, B:144:0x02d7, B:146:0x02dd, B:152:0x0302, B:149:0x02f2, B:151:0x02fc, B:153:0x0305, B:155:0x0320, B:159:0x032f, B:161:0x0353, B:163:0x038d, B:165:0x0392, B:167:0x039a, B:168:0x039d, B:170:0x03a2, B:171:0x03a5, B:173:0x03b1, B:174:0x03c7, B:175:0x03cf, B:177:0x03e0, B:179:0x03f1, B:180:0x0406, B:182:0x0413, B:184:0x0428, B:186:0x0433, B:187:0x043c, B:183:0x0421, B:189:0x048b, B:118:0x026f, B:130:0x029b, B:193:0x04a6, B:194:0x04a9, B:195:0x04aa, B:200:0x04ea, B:216:0x0511, B:218:0x0517, B:220:0x0522, B:204:0x04f3, B:225:0x052e, B:226:0x0531), top: B:245:0x0010, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04a6 A[Catch: all -> 0x0532, TryCatch #13 {all -> 0x0532, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:41:0x0108, B:54:0x0129, B:58:0x0130, B:59:0x0133, B:60:0x0134, B:64:0x015c, B:68:0x0164, B:74:0x019e, B:131:0x029e, B:133:0x02a4, B:135:0x02b0, B:136:0x02b4, B:138:0x02ba, B:140:0x02ce, B:144:0x02d7, B:146:0x02dd, B:152:0x0302, B:149:0x02f2, B:151:0x02fc, B:153:0x0305, B:155:0x0320, B:159:0x032f, B:161:0x0353, B:163:0x038d, B:165:0x0392, B:167:0x039a, B:168:0x039d, B:170:0x03a2, B:171:0x03a5, B:173:0x03b1, B:174:0x03c7, B:175:0x03cf, B:177:0x03e0, B:179:0x03f1, B:180:0x0406, B:182:0x0413, B:184:0x0428, B:186:0x0433, B:187:0x043c, B:183:0x0421, B:189:0x048b, B:118:0x026f, B:130:0x029b, B:193:0x04a6, B:194:0x04a9, B:195:0x04aa, B:200:0x04ea, B:216:0x0511, B:218:0x0517, B:220:0x0522, B:204:0x04f3, B:225:0x052e, B:226:0x0531), top: B:245:0x0010, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0517 A[Catch: all -> 0x0532, TryCatch #13 {all -> 0x0532, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:41:0x0108, B:54:0x0129, B:58:0x0130, B:59:0x0133, B:60:0x0134, B:64:0x015c, B:68:0x0164, B:74:0x019e, B:131:0x029e, B:133:0x02a4, B:135:0x02b0, B:136:0x02b4, B:138:0x02ba, B:140:0x02ce, B:144:0x02d7, B:146:0x02dd, B:152:0x0302, B:149:0x02f2, B:151:0x02fc, B:153:0x0305, B:155:0x0320, B:159:0x032f, B:161:0x0353, B:163:0x038d, B:165:0x0392, B:167:0x039a, B:168:0x039d, B:170:0x03a2, B:171:0x03a5, B:173:0x03b1, B:174:0x03c7, B:175:0x03cf, B:177:0x03e0, B:179:0x03f1, B:180:0x0406, B:182:0x0413, B:184:0x0428, B:186:0x0433, B:187:0x043c, B:183:0x0421, B:189:0x048b, B:118:0x026f, B:130:0x029b, B:193:0x04a6, B:194:0x04a9, B:195:0x04aa, B:200:0x04ea, B:216:0x0511, B:218:0x0517, B:220:0x0522, B:204:0x04f3, B:225:0x052e, B:226:0x0531), top: B:245:0x0010, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzX() {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlf.zzX():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:93:0x02f8
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:86)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    final void zzY(com.google.android.gms.measurement.internal.zzaw r37, com.google.android.gms.measurement.internal.zzq r38) {
        /*
            Method dump skipped, instructions count: 2844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlf.zzY(com.google.android.gms.measurement.internal.zzaw, com.google.android.gms.measurement.internal.zzq):void");
    }

    @VisibleForTesting
    final boolean zzZ() {
        zzaB().zzg();
        FileLock fileLock = this.zzw;
        if (fileLock != null && fileLock.isValid()) {
            zzaA().zzj().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzt.zzf();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzn.zzaw().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzx = channel;
            FileLock tryLock = channel.tryLock();
            this.zzw = tryLock;
            if (tryLock != null) {
                zzaA().zzj().zza("Storage concurrent access okay");
                return true;
            }
            zzaA().zzd().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e10) {
            zzaA().zzd().zzb("Failed to acquire storage lock", e10);
            return false;
        } catch (IOException e11) {
            zzaA().zzd().zzb("Failed to access storage lock file", e11);
            return false;
        } catch (OverlappingFileLockException e12) {
            zzaA().zzk().zzb("Storage lock already acquired", e12);
            return false;
        }
    }

    final long zza() {
        long currentTimeMillis = zzax().currentTimeMillis();
        zzjz zzjzVar = this.zzk;
        zzjzVar.zzW();
        zzjzVar.zzg();
        long zza = zzjzVar.zze.zza();
        if (zza == 0) {
            zza = zzjzVar.zzt.zzv().zzG().nextInt(86400000) + 1;
            zzjzVar.zze.zzb(zza);
        }
        return ((((currentTimeMillis + zza) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzet zzaA() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzaA();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzga zzaB() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzaB();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final Context zzaw() {
        return this.zzn.zzaw();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final Clock zzax() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzax();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzab zzay() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzh zzd(zzq zzqVar) {
        String str;
        zzaB().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzld zzldVar = null;
        if (!zzqVar.zzw.isEmpty()) {
            this.zzC.put(zzqVar.zza, new zzle(this, zzqVar.zzw));
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzj = zzamVar.zzj(zzqVar.zza);
        zzai zzc = zzh(zzqVar.zza).zzc(zzai.zzb(zzqVar.zzv));
        zzah zzahVar = zzah.AD_STORAGE;
        if (zzc.zzi(zzahVar)) {
            str = this.zzk.zzf(zzqVar.zza, zzqVar.zzo);
        } else {
            str = "";
        }
        if (zzj == null) {
            zzj = new zzh(this.zzn, zzqVar.zza);
            if (zzc.zzi(zzah.ANALYTICS_STORAGE)) {
                zzj.zzI(zzw(zzc));
            }
            if (zzc.zzi(zzahVar)) {
                zzj.zzaf(str);
            }
        } else if (zzc.zzi(zzahVar) && str != null && !str.equals(zzj.zzB())) {
            zzj.zzaf(str);
            if (zzqVar.zzo && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzqVar.zza, zzc).first)) {
                zzj.zzI(zzw(zzc));
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                if (zzamVar2.zzp(zzqVar.zza, "_id") != null) {
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    if (zzamVar3.zzp(zzqVar.zza, "_lair") == null) {
                        zzlk zzlkVar = new zzlk(zzqVar.zza, "auto", "_lair", zzax().currentTimeMillis(), 1L);
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzL(zzlkVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(zzj.zzv()) && zzc.zzi(zzah.ANALYTICS_STORAGE)) {
            zzj.zzI(zzw(zzc));
        }
        zzj.zzX(zzqVar.zzb);
        zzj.zzG(zzqVar.zzq);
        if (!TextUtils.isEmpty(zzqVar.zzk)) {
            zzj.zzW(zzqVar.zzk);
        }
        long j10 = zzqVar.zze;
        if (j10 != 0) {
            zzj.zzY(j10);
        }
        if (!TextUtils.isEmpty(zzqVar.zzc)) {
            zzj.zzK(zzqVar.zzc);
        }
        zzj.zzL(zzqVar.zzj);
        String str2 = zzqVar.zzd;
        if (str2 != null) {
            zzj.zzJ(str2);
        }
        zzj.zzT(zzqVar.zzf);
        zzj.zzad(zzqVar.zzh);
        if (!TextUtils.isEmpty(zzqVar.zzg)) {
            zzj.zzZ(zzqVar.zzg);
        }
        zzj.zzH(zzqVar.zzo);
        zzj.zzae(zzqVar.zzr);
        zzj.zzU(zzqVar.zzs);
        zzqr.zzc();
        if (zzg().zzs(null, zzeg.zzam) || zzg().zzs(zzqVar.zza, zzeg.zzao)) {
            zzj.zzah(zzqVar.zzx);
        }
        zzop.zzc();
        if (zzg().zzs(null, zzeg.zzal)) {
            zzj.zzag(zzqVar.zzt);
        } else {
            zzop.zzc();
            if (zzg().zzs(null, zzeg.zzak)) {
                zzj.zzag(null);
            }
        }
        zzra.zzc();
        if (zzg().zzs(null, zzeg.zzaq)) {
            zzj.zzai(zzqVar.zzy);
        }
        zzpw.zzc();
        if (zzg().zzs(null, zzeg.zzaE)) {
            zzj.zzaj(zzqVar.zzz);
        }
        if (zzj.zzam()) {
            zzam zzamVar5 = this.zze;
            zzal(zzamVar5);
            zzamVar5.zzD(zzj);
        }
        return zzj;
    }

    public final zzaa zzf() {
        zzaa zzaaVar = this.zzh;
        zzal(zzaaVar);
        return zzaaVar;
    }

    public final zzag zzg() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzai zzh(String str) {
        String str2;
        zzai zzaiVar = zzai.zza;
        zzaB().zzg();
        zzB();
        zzai zzaiVar2 = (zzai) this.zzB.get(str);
        if (zzaiVar2 == null) {
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            Preconditions.checkNotNull(str);
            zzamVar.zzg();
            zzamVar.zzW();
            Cursor cursor = null;
            try {
                try {
                    cursor = zzamVar.zzh().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                    if (cursor.moveToFirst()) {
                        str2 = cursor.getString(0);
                        cursor.close();
                    } else {
                        cursor.close();
                        str2 = "G1";
                    }
                    zzai zzb2 = zzai.zzb(str2);
                    zzV(str, zzb2);
                    return zzb2;
                } catch (SQLiteException e10) {
                    zzamVar.zzt.zzaA().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e10);
                    throw e10;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        return zzaiVar2;
    }

    public final zzam zzi() {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        return zzamVar;
    }

    public final zzeo zzj() {
        return this.zzn.zzj();
    }

    public final zzez zzl() {
        zzez zzezVar = this.zzd;
        zzal(zzezVar);
        return zzezVar;
    }

    public final zzfb zzm() {
        zzfb zzfbVar = this.zzf;
        if (zzfbVar != null) {
            return zzfbVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzfu zzo() {
        zzfu zzfuVar = this.zzc;
        zzal(zzfuVar);
        return zzfuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzgd zzq() {
        return this.zzn;
    }

    public final zzin zzr() {
        zzin zzinVar = this.zzj;
        zzal(zzinVar);
        return zzinVar;
    }

    public final zzjz zzs() {
        return this.zzk;
    }

    public final zzlh zzu() {
        zzlh zzlhVar = this.zzi;
        zzal(zzlhVar);
        return zzlhVar;
    }

    public final zzln zzv() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzv();
    }

    final String zzw(zzai zzaiVar) {
        if (zzaiVar.zzi(zzah.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzv().zzG().nextBytes(bArr);
            return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzx(zzq zzqVar) {
        try {
            return (String) zzaB().zzh(new zzky(this, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzaA().zzd().zzc("Failed to get app instance id. appId", zzet.zzn(zzqVar.zza), e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzz(Runnable runnable) {
        zzaB().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }
}
