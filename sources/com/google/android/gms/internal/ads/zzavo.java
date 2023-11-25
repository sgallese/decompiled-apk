package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzavo {
    static long zza(long j10, int i10) {
        long zza;
        if (i10 == 1) {
            return j10;
        }
        if ((i10 & 1) == 0) {
            zza = zza((j10 * j10) % 1073807359, i10 >> 1);
        } else {
            zza = j10 * (zza((j10 * j10) % 1073807359, i10 >> 1) % 1073807359);
        }
        return zza % 1073807359;
    }

    static String zzb(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            zzcaa.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i13 = i12 - 1;
            if (i10 < i13) {
                sb2.append(strArr[i10]);
                sb2.append(' ');
                i10++;
            } else {
                sb2.append(strArr[i13]);
                return sb2.toString();
            }
        }
    }

    public static void zzc(String[] strArr, int i10, int i11, PriorityQueue priorityQueue) {
        int length = strArr.length;
        int i12 = 6;
        if (length < 6) {
            zzd(i10, zze(strArr, 0, length), zzb(strArr, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr, 0, 6);
        zzd(i10, zze, zzb(strArr, 0, 6), 6, priorityQueue);
        int i13 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i13 < length2 - 5) {
                long zza = zzavk.zza(strArr[i13 - 1]);
                long zza2 = zzavk.zza(strArr[i13 + 5]);
                String zzb = zzb(strArr, i13, i12);
                zze = ((((((zze + 1073807359) - ((zza(16785407L, 5) * ((zza + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((zza2 + 2147483647L) % 1073807359)) % 1073807359;
                zzd(i10, zze, zzb, length2, priorityQueue);
                i13++;
                i12 = 6;
            } else {
                return;
            }
        }
    }

    static void zzd(int i10, long j10, String str, int i11, PriorityQueue priorityQueue) {
        zzavn zzavnVar = new zzavn(j10, str, i11);
        if ((priorityQueue.size() == i10 && (((zzavn) priorityQueue.peek()).zzc > zzavnVar.zzc || ((zzavn) priorityQueue.peek()).zza > zzavnVar.zza)) || priorityQueue.contains(zzavnVar)) {
            return;
        }
        priorityQueue.add(zzavnVar);
        if (priorityQueue.size() > i10) {
            priorityQueue.poll();
        }
    }

    private static long zze(String[] strArr, int i10, int i11) {
        long zza = (zzavk.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i12 = 1; i12 < i11; i12++) {
            zza = (((zza * 16785407) % 1073807359) + ((zzavk.zza(strArr[i12]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
