package com.google.android.gms.measurement.internal;

import androidx.collection.a;
import com.google.android.gms.internal.measurement.zzov;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzu {
    final /* synthetic */ zzaa zza;
    private String zzb;
    private boolean zzc;
    private com.google.android.gms.internal.measurement.zzgi zzd;
    private BitSet zze;
    private BitSet zzf;
    private Map zzg;
    private Map zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzu(zzaa zzaaVar, String str, zzt zztVar) {
        this.zza = zzaaVar;
        this.zzb = str;
        this.zzc = true;
        this.zze = new BitSet();
        this.zzf = new BitSet();
        this.zzg = new a();
        this.zzh = new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ BitSet zzb(zzu zzuVar) {
        return zzuVar.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.gms.internal.measurement.zzfp zza(int i10) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.zzfo zzb = com.google.android.gms.internal.measurement.zzfp.zzb();
        zzb.zza(i10);
        zzb.zzc(this.zzc);
        com.google.android.gms.internal.measurement.zzgi zzgiVar = this.zzd;
        if (zzgiVar != null) {
            zzb.zzd(zzgiVar);
        }
        com.google.android.gms.internal.measurement.zzgh zze = com.google.android.gms.internal.measurement.zzgi.zze();
        zze.zzb(zzlh.zzr(this.zze));
        zze.zzd(zzlh.zzr(this.zzf));
        Map map = this.zzg;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            Iterator it = this.zzg.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                Long l10 = (Long) this.zzg.get(Integer.valueOf(intValue));
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.zzfq zzc = com.google.android.gms.internal.measurement.zzfr.zzc();
                    zzc.zzb(intValue);
                    zzc.zza(l10.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.zzfr) zzc.zzaD());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zze.zza(arrayList);
        }
        Map map2 = this.zzh;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.zzh.keySet()) {
                com.google.android.gms.internal.measurement.zzgj zzd = com.google.android.gms.internal.measurement.zzgk.zzd();
                zzd.zzb(num.intValue());
                List list2 = (List) this.zzh.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzd.zza(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.zzgk) zzd.zzaD());
            }
            list = arrayList3;
        }
        zze.zzc(list);
        zzb.zzb(zze);
        return (com.google.android.gms.internal.measurement.zzfp) zzb.zzaD();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(zzy zzyVar) {
        int zza = zzyVar.zza();
        Boolean bool = zzyVar.zzd;
        if (bool != null) {
            BitSet bitSet = this.zzf;
            bool.booleanValue();
            bitSet.set(zza, true);
        }
        Boolean bool2 = zzyVar.zze;
        if (bool2 != null) {
            this.zze.set(zza, bool2.booleanValue());
        }
        if (zzyVar.zzf != null) {
            Map map = this.zzg;
            Integer valueOf = Integer.valueOf(zza);
            Long l10 = (Long) map.get(valueOf);
            long longValue = zzyVar.zzf.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.zzg.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (zzyVar.zzg != null) {
            Map map2 = this.zzh;
            Integer valueOf2 = Integer.valueOf(zza);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.zzh.put(valueOf2, list);
            }
            if (zzyVar.zzc()) {
                list.clear();
            }
            zzov.zzc();
            zzag zzf = this.zza.zzt.zzf();
            String str = this.zzb;
            zzef zzefVar = zzeg.zzY;
            if (zzf.zzs(str, zzefVar) && zzyVar.zzb()) {
                list.clear();
            }
            zzov.zzc();
            if (this.zza.zzt.zzf().zzs(this.zzb, zzefVar)) {
                Long valueOf3 = Long.valueOf(zzyVar.zzg.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(zzyVar.zzg.longValue() / 1000));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzu(zzaa zzaaVar, String str, com.google.android.gms.internal.measurement.zzgi zzgiVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzt zztVar) {
        this.zza = zzaaVar;
        this.zzb = str;
        this.zze = bitSet;
        this.zzf = bitSet2;
        this.zzg = map;
        this.zzh = new a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.zzh.put(num, arrayList);
        }
        this.zzc = false;
        this.zzd = zzgiVar;
    }
}
