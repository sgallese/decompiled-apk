package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcdn implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcdm zza(zzccj zzccjVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcdm zzcdmVar = (zzcdm) it.next();
            if (zzcdmVar.zza == zzccjVar) {
                return zzcdmVar;
            }
        }
        return null;
    }

    public final void zzb(zzcdm zzcdmVar) {
        this.zza.add(zzcdmVar);
    }

    public final void zzc(zzcdm zzcdmVar) {
        this.zza.remove(zzcdmVar);
    }

    public final boolean zzd(zzccj zzccjVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcdm zzcdmVar = (zzcdm) it.next();
            if (zzcdmVar.zza == zzccjVar) {
                arrayList.add(zzcdmVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzcdm) it2.next()).zzb.zzf();
        }
        return true;
    }
}
