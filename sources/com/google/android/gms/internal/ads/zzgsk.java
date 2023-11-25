package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgsk extends zzgso {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgsk(zzgsj zzgsjVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j10, int i10) {
        zzgsh zzgshVar;
        List arrayList;
        List list = (List) zzguu.zzh(obj, j10);
        if (list.isEmpty()) {
            if (list instanceof zzgsi) {
                arrayList = new zzgsh(i10);
            } else if ((list instanceof zzgth) && (list instanceof zzgrz)) {
                arrayList = ((zzgrz) list).zzd(i10);
            } else {
                arrayList = new ArrayList(i10);
            }
            zzguu.zzv(obj, j10, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i10);
            arrayList2.addAll(list);
            zzguu.zzv(obj, j10, arrayList2);
            zzgshVar = arrayList2;
        } else if (list instanceof zzgup) {
            zzgsh zzgshVar2 = new zzgsh(list.size() + i10);
            zzgshVar2.addAll(zzgshVar2.size(), (zzgup) list);
            zzguu.zzv(obj, j10, zzgshVar2);
            zzgshVar = zzgshVar2;
        } else if ((list instanceof zzgth) && (list instanceof zzgrz)) {
            zzgrz zzgrzVar = (zzgrz) list;
            if (!zzgrzVar.zzc()) {
                zzgrz zzd = zzgrzVar.zzd(list.size() + i10);
                zzguu.zzv(obj, j10, zzd);
                return zzd;
            }
            return list;
        } else {
            return list;
        }
        return zzgshVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgso
    public final List zza(Object obj, long j10) {
        return zzf(obj, j10, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgso
    public final void zzb(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) zzguu.zzh(obj, j10);
        if (list instanceof zzgsi) {
            unmodifiableList = ((zzgsi) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzgth) && (list instanceof zzgrz)) {
                zzgrz zzgrzVar = (zzgrz) list;
                if (zzgrzVar.zzc()) {
                    zzgrzVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzguu.zzv(obj, j10, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgso
    public final void zzc(Object obj, Object obj2, long j10) {
        List list = (List) zzguu.zzh(obj2, j10);
        List zzf = zzf(obj, j10, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzguu.zzv(obj, j10, list);
    }

    private zzgsk() {
        super(null);
    }
}
