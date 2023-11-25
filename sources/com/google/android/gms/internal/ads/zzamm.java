package com.google.android.gms.internal.ads;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzamm {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e10) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                zzamb.zzc(e10, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzamb.zzd("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static zzaky zzb(zzall zzallVar) {
        long j10;
        boolean z10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzallVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        if (str != null) {
            j10 = zza(str);
        } else {
            j10 = 0;
        }
        String str2 = (String) map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z10 = false;
            j11 = 0;
            j12 = 0;
            while (i10 < split.length) {
                String trim = split[i10].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j12 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j11 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z10 = true;
                }
                i10++;
            }
            i10 = 1;
        } else {
            z10 = false;
            j11 = 0;
            j12 = 0;
        }
        String str3 = (String) map.get("Expires");
        if (str3 != null) {
            j13 = zza(str3);
        } else {
            j13 = 0;
        }
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j14 = zza(str4);
        } else {
            j14 = 0;
        }
        String str5 = (String) map.get("ETag");
        if (i10 != 0) {
            j16 = currentTimeMillis + (j12 * 1000);
            if (z10) {
                j17 = j16;
            } else {
                Long.signum(j11);
                j17 = (j11 * 1000) + j16;
            }
            j15 = j17;
        } else {
            j15 = 0;
            if (j10 > 0 && j13 >= j10) {
                j16 = currentTimeMillis + (j13 - j10);
                j15 = j16;
            } else {
                j16 = 0;
            }
        }
        zzaky zzakyVar = new zzaky();
        zzakyVar.zza = zzallVar.zzb;
        zzakyVar.zzb = str5;
        zzakyVar.zzf = j16;
        zzakyVar.zze = j15;
        zzakyVar.zzc = j10;
        zzakyVar.zzd = j14;
        zzakyVar.zzg = map;
        zzakyVar.zzh = zzallVar.zzd;
        return zzakyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzc(long j10) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j10));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
