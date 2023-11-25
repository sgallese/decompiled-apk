package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzadh extends zzadj {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzadh() {
        super(new zzaba());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzfb zzfbVar) {
        return Double.valueOf(Double.longBitsToDouble(zzfbVar.zzs()));
    }

    private static Object zzh(zzfb zzfbVar, int i10) {
        if (i10 != 0) {
            boolean z10 = false;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 8) {
                            if (i10 != 10) {
                                if (i10 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) zzg(zzfbVar).doubleValue());
                                zzfbVar.zzH(2);
                                return date;
                            }
                            int zzo = zzfbVar.zzo();
                            ArrayList arrayList = new ArrayList(zzo);
                            for (int i11 = 0; i11 < zzo; i11++) {
                                Object zzh = zzh(zzfbVar, zzfbVar.zzl());
                                if (zzh != null) {
                                    arrayList.add(zzh);
                                }
                            }
                            return arrayList;
                        }
                        return zzj(zzfbVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String zzi = zzi(zzfbVar);
                        int zzl = zzfbVar.zzl();
                        if (zzl == 9) {
                            return hashMap;
                        }
                        Object zzh2 = zzh(zzfbVar, zzl);
                        if (zzh2 != null) {
                            hashMap.put(zzi, zzh2);
                        }
                    }
                } else {
                    return zzi(zzfbVar);
                }
            } else {
                if (zzfbVar.zzl() == 1) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        } else {
            return zzg(zzfbVar);
        }
    }

    private static String zzi(zzfb zzfbVar) {
        int zzp = zzfbVar.zzp();
        int zzc = zzfbVar.zzc();
        zzfbVar.zzH(zzp);
        return new String(zzfbVar.zzI(), zzc, zzp);
    }

    private static HashMap zzj(zzfb zzfbVar) {
        int zzo = zzfbVar.zzo();
        HashMap hashMap = new HashMap(zzo);
        for (int i10 = 0; i10 < zzo; i10++) {
            String zzi = zzi(zzfbVar);
            Object zzh = zzh(zzfbVar, zzfbVar.zzl());
            if (zzh != null) {
                hashMap.put(zzi, zzh);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzadj
    protected final boolean zza(zzfb zzfbVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadj
    protected final boolean zzb(zzfb zzfbVar, long j10) {
        if (zzfbVar.zzl() != 2 || !"onMetaData".equals(zzi(zzfbVar)) || zzfbVar.zza() == 0 || zzfbVar.zzl() != 8) {
            return false;
        }
        HashMap zzj = zzj(zzfbVar);
        Object obj = zzj.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.zzb = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = zzj.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.zzc = new long[size];
                this.zzd = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.zzc[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i10] = ((Double) obj5).longValue();
                    } else {
                        this.zzc = new long[0];
                        this.zzd = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }
}
