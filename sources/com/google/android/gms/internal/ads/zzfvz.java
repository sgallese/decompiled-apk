package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfvz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Set set) {
        int i10;
        int i11 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 += i10;
        }
        return i11;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzb(Set set, zzfrj zzfrjVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof zzfvw) {
                zzfvw zzfvwVar = (zzfvw) sortedSet;
                return new zzfvx((SortedSet) zzfvwVar.zza, zzfrm.zza(zzfvwVar.zzb, zzfrjVar));
            }
            sortedSet.getClass();
            return new zzfvx(sortedSet, zzfrjVar);
        } else if (set instanceof zzfvw) {
            zzfvw zzfvwVar2 = (zzfvw) set;
            return new zzfvw(zzfvwVar2.zza, zzfrm.zza(zzfvwVar2.zzb, zzfrjVar));
        } else {
            set.getClass();
            return new zzfvw(set, zzfrjVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzc(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzd(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzfvj) {
            collection = ((zzfvj) collection).zza();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator it = set.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
        return zze(set, collection.iterator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zze(Set set, Iterator it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
