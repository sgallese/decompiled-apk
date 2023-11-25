package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzui implements zztq, zztp {
    private final zztq[] zza;
    private zztp zze;
    private zzvs zzf;
    private final zztd zzi;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzvl zzh = new zztc(new zzvl[0]);
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zztq[] zzg = new zztq[0];

    public zzui(zztd zztdVar, long[] jArr, zztq... zztqVarArr) {
        this.zzi = zztdVar;
        this.zza = zztqVarArr;
        for (int i10 = 0; i10 < zztqVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.zza[i10] = new zzug(zztqVarArr[i10], j10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zza(long j10, zzlr zzlrVar) {
        zztq zztqVar;
        zztq[] zztqVarArr = this.zzg;
        if (zztqVarArr.length > 0) {
            zztqVar = zztqVarArr[0];
        } else {
            zztqVar = this.zza[0];
        }
        return zztqVar.zza(j10, zzlrVar);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zzd() {
        long j10 = -9223372036854775807L;
        for (zztq zztqVar : this.zzg) {
            long zzd = zztqVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (zztq zztqVar2 : this.zzg) {
                        if (zztqVar2 == zztqVar) {
                            break;
                        } else if (zztqVar2.zze(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = zzd;
                } else if (zzd != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && zztqVar.zze(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zze(long j10) {
        long zze = this.zzg[0].zze(j10);
        int i10 = 1;
        while (true) {
            zztq[] zztqVarArr = this.zzg;
            if (i10 < zztqVarArr.length) {
                if (zztqVarArr[i10].zze(zze) == zze) {
                    i10++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return zze;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zzf(zzxf[] zzxfVarArr, boolean[] zArr, zzvj[] zzvjVarArr, boolean[] zArr2, long j10) {
        int length;
        zzxf zzxfVar;
        zzxf zzxfVar2;
        int intValue;
        int length2 = zzxfVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i10 = 0;
        while (true) {
            length = zzxfVarArr.length;
            zzxfVar = null;
            Integer num = null;
            if (i10 >= length) {
                break;
            }
            zzvj zzvjVar = zzvjVarArr[i10];
            if (zzvjVar != null) {
                num = (Integer) this.zzb.get(zzvjVar);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i10] = intValue;
            zzxf zzxfVar3 = zzxfVarArr[i10];
            if (zzxfVar3 != null) {
                String str = zzxfVar3.zze().zzc;
                iArr2[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i10] = -1;
            }
            i10++;
        }
        this.zzb.clear();
        zzvj[] zzvjVarArr2 = new zzvj[length];
        zzvj[] zzvjVarArr3 = new zzvj[length];
        zzxf[] zzxfVarArr2 = new zzxf[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j11 = j10;
        int i11 = 0;
        while (i11 < this.zza.length) {
            for (int i12 = 0; i12 < zzxfVarArr.length; i12++) {
                if (iArr[i12] == i11) {
                    zzxfVar2 = zzvjVarArr[i12];
                } else {
                    zzxfVar2 = zzxfVar;
                }
                zzvjVarArr3[i12] = zzxfVar2;
                if (iArr2[i12] == i11) {
                    zzxf zzxfVar4 = zzxfVarArr[i12];
                    zzxfVar4.getClass();
                    zzcy zzcyVar = (zzcy) this.zzd.get(zzxfVar4.zze());
                    zzcyVar.getClass();
                    zzxfVarArr2[i12] = new zzuf(zzxfVar4, zzcyVar);
                } else {
                    zzxfVarArr2[i12] = zzxfVar;
                }
            }
            int i13 = i11;
            ArrayList arrayList2 = arrayList;
            zzvj[] zzvjVarArr4 = zzvjVarArr3;
            zzxf[] zzxfVarArr3 = zzxfVarArr2;
            long zzf = this.zza[i11].zzf(zzxfVarArr2, zArr, zzvjVarArr3, zArr2, j11);
            if (i13 == 0) {
                j11 = zzf;
            } else if (zzf != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < zzxfVarArr.length; i14++) {
                boolean z11 = true;
                if (iArr2[i14] == i13) {
                    zzvj zzvjVar2 = zzvjVarArr4[i14];
                    zzvjVar2.getClass();
                    zzvjVarArr2[i14] = zzvjVar2;
                    this.zzb.put(zzvjVar2, Integer.valueOf(i13));
                    z10 = true;
                } else if (iArr[i14] == i13) {
                    if (zzvjVarArr4[i14] != null) {
                        z11 = false;
                    }
                    zzdy.zzf(z11);
                }
            }
            if (z10) {
                arrayList2.add(this.zza[i13]);
            }
            i11 = i13 + 1;
            arrayList = arrayList2;
            zzvjVarArr3 = zzvjVarArr4;
            zzxfVarArr2 = zzxfVarArr3;
            zzxfVar = null;
        }
        System.arraycopy(zzvjVarArr2, 0, zzvjVarArr, 0, length);
        zztq[] zztqVarArr = (zztq[]) arrayList.toArray(new zztq[0]);
        this.zzg = zztqVarArr;
        this.zzh = new zztc(zztqVarArr);
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final /* bridge */ /* synthetic */ void zzg(zzvl zzvlVar) {
        zztq zztqVar = (zztq) zzvlVar;
        zztp zztpVar = this.zze;
        zztpVar.getClass();
        zztpVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final zzvs zzh() {
        zzvs zzvsVar = this.zzf;
        zzvsVar.getClass();
        return zzvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzi(zztq zztqVar) {
        this.zzc.remove(zztqVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (zztq zztqVar2 : this.zza) {
            i10 += zztqVar2.zzh().zzc;
        }
        zzcy[] zzcyVarArr = new zzcy[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            zztq[] zztqVarArr = this.zza;
            if (i11 < zztqVarArr.length) {
                zzvs zzh = zztqVarArr[i11].zzh();
                int i13 = zzh.zzc;
                int i14 = 0;
                while (i14 < i13) {
                    zzcy zzb = zzh.zzb(i14);
                    zzcy zzc = zzb.zzc(i11 + ":" + zzb.zzc);
                    this.zzd.put(zzc, zzb);
                    zzcyVarArr[i12] = zzc;
                    i14++;
                    i12++;
                }
                i11++;
            } else {
                this.zzf = new zzvs(zzcyVarArr);
                zztp zztpVar = this.zze;
                zztpVar.getClass();
                zztpVar.zzi(this);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzj(long j10, boolean z10) {
        for (zztq zztqVar : this.zzg) {
            zztqVar.zzj(j10, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzk() throws IOException {
        for (zztq zztqVar : this.zza) {
            zztqVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzl(zztp zztpVar, long j10) {
        this.zze = zztpVar;
        Collections.addAll(this.zzc, this.zza);
        for (zztq zztqVar : this.zza) {
            zztqVar.zzl(this, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final void zzm(long j10) {
        this.zzh.zzm(j10);
    }

    public final zztq zzn(int i10) {
        zztq zztqVar;
        zztq zztqVar2 = this.zza[i10];
        if (zztqVar2 instanceof zzug) {
            zztqVar = ((zzug) zztqVar2).zza;
            return zztqVar;
        }
        return zztqVar2;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzo(long j10) {
        if (!this.zzc.isEmpty()) {
            int size = this.zzc.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((zztq) this.zzc.get(i10)).zzo(j10);
            }
            return false;
        }
        return this.zzh.zzo(j10);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
