package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfuj {
    public static boolean zza(Iterable iterable, zzfrj zzfrjVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzfrjVar.getClass();
            return zzc((List) iterable, zzfrjVar);
        }
        Iterator it = iterable.iterator();
        zzfrjVar.getClass();
        boolean z10 = false;
        while (it.hasNext()) {
            if (zzfrjVar.zza(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    private static void zzb(List list, zzfrj zzfrjVar, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (zzfrjVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 >= i10) {
                list.remove(i11);
            } else {
                return;
            }
        }
    }

    private static boolean zzc(List list, zzfrj zzfrjVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!zzfrjVar.zza(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        zzb(list, zzfrjVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzb(list, zzfrjVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        if (i10 == i11) {
            return false;
        }
        return true;
    }
}
