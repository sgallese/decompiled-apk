package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgto {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgto() {
    }

    public static /* bridge */ /* synthetic */ zzgqi zza(zzgto zzgtoVar, zzgqi zzgqiVar, zzgqi zzgqiVar2) {
        zzgtoVar.zzb(zzgqiVar);
        zzgtoVar.zzb(zzgqiVar2);
        zzgqi zzgqiVar3 = (zzgqi) zzgtoVar.zza.pop();
        while (!zzgtoVar.zza.isEmpty()) {
            zzgqiVar3 = new zzgts((zzgqi) zzgtoVar.zza.pop(), zzgqiVar3);
        }
        return zzgqiVar3;
    }

    private final void zzb(zzgqi zzgqiVar) {
        zzgqi zzgqiVar2;
        zzgqi zzgqiVar3;
        if (zzgqiVar.zzh()) {
            int zzc = zzc(zzgqiVar.zzd());
            int zzc2 = zzgts.zzc(zzc + 1);
            if (!this.zza.isEmpty() && ((zzgqi) this.zza.peek()).zzd() < zzc2) {
                int zzc3 = zzgts.zzc(zzc);
                zzgqi zzgqiVar4 = (zzgqi) this.zza.pop();
                while (true) {
                    if (this.zza.isEmpty() || ((zzgqi) this.zza.peek()).zzd() >= zzc3) {
                        break;
                    }
                    zzgqiVar4 = new zzgts((zzgqi) this.zza.pop(), zzgqiVar4);
                }
                zzgts zzgtsVar = new zzgts(zzgqiVar4, zzgqiVar);
                while (!this.zza.isEmpty()) {
                    if (((zzgqi) this.zza.peek()).zzd() >= zzgts.zzc(zzc(zzgtsVar.zzd()) + 1)) {
                        break;
                    }
                    zzgtsVar = new zzgts((zzgqi) this.zza.pop(), zzgtsVar);
                }
                this.zza.push(zzgtsVar);
                return;
            }
            this.zza.push(zzgqiVar);
        } else if (zzgqiVar instanceof zzgts) {
            zzgts zzgtsVar2 = (zzgts) zzgqiVar;
            zzgqiVar2 = zzgtsVar2.zzd;
            zzb(zzgqiVar2);
            zzgqiVar3 = zzgtsVar2.zze;
            zzb(zzgqiVar3);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgqiVar.getClass())));
        }
    }

    private static final int zzc(int i10) {
        int binarySearch = Arrays.binarySearch(zzgts.zza, i10);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }

    public /* synthetic */ zzgto(zzgtn zzgtnVar) {
    }
}
