package com.google.android.gms.internal.wearable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzcx extends zzdb {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcx(zzcw zzcwVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.wearable.zzdb
    public final void zza(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) zzez.zzf(obj, j10);
        if (list instanceof zzcv) {
            unmodifiableList = ((zzcv) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzdu) && (list instanceof zzcn)) {
                zzcn zzcnVar = (zzcn) list;
                if (zzcnVar.zzc()) {
                    zzcnVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzez.zzs(obj, j10, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.wearable.zzdb
    public final void zzb(Object obj, Object obj2, long j10) {
        zzcu zzcuVar;
        List list = (List) zzez.zzf(obj2, j10);
        int size = list.size();
        List list2 = (List) zzez.zzf(obj, j10);
        if (list2.isEmpty()) {
            if (list2 instanceof zzcv) {
                list2 = new zzcu(size);
            } else if ((list2 instanceof zzdu) && (list2 instanceof zzcn)) {
                list2 = ((zzcn) list2).zzd(size);
            } else {
                list2 = new ArrayList(size);
            }
            zzez.zzs(obj, j10, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                zzez.zzs(obj, j10, arrayList);
                zzcuVar = arrayList;
            } else if (list2 instanceof zzeu) {
                zzcu zzcuVar2 = new zzcu(list2.size() + size);
                zzcuVar2.addAll(zzcuVar2.size(), (zzeu) list2);
                zzez.zzs(obj, j10, zzcuVar2);
                zzcuVar = zzcuVar2;
            } else if ((list2 instanceof zzdu) && (list2 instanceof zzcn)) {
                zzcn zzcnVar = (zzcn) list2;
                if (!zzcnVar.zzc()) {
                    list2 = zzcnVar.zzd(list2.size() + size);
                    zzez.zzs(obj, j10, list2);
                }
            }
            list2 = zzcuVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        zzez.zzs(obj, j10, list);
    }

    private zzcx() {
        super(null);
    }
}
