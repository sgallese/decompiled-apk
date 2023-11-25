package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzavj {
    private final int zza;
    private final zzavg zzb = new zzavl();

    public zzavj(int i10) {
        this.zza = i10;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] split = sb2.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzavi zzaviVar = new zzavi();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzavh(this));
        for (String str : split) {
            String[] zzb = zzavk.zzb(str, false);
            if (zzb.length != 0) {
                zzavo.zzc(zzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzaviVar.zzb.write(this.zzb.zzb(((zzavn) it.next()).zzb));
            } catch (IOException e10) {
                zzcaa.zzh("Error while writing hash to byteStream", e10);
            }
        }
        return zzaviVar.toString();
    }
}
