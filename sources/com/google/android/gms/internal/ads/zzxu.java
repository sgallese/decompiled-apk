package com.google.android.gms.internal.ads;

import java.util.Arrays;
import okhttp3.internal.http2.Settings;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzxu {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzxn[] zzd = new zzxn[100];

    public zzxu(boolean z10, int i10) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzxn zzb() {
        zzxn zzxnVar;
        this.zzb++;
        int i10 = this.zzc;
        if (i10 > 0) {
            zzxn[] zzxnVarArr = this.zzd;
            int i11 = i10 - 1;
            this.zzc = i11;
            zzxnVar = zzxnVarArr[i11];
            zzxnVar.getClass();
            zzxnVarArr[i11] = null;
        } else {
            zzxnVar = new zzxn(new byte[65536], 0);
            int i12 = this.zzb;
            zzxn[] zzxnVarArr2 = this.zzd;
            int length = zzxnVarArr2.length;
            if (i12 > length) {
                this.zzd = (zzxn[]) Arrays.copyOf(zzxnVarArr2, length + length);
                return zzxnVar;
            }
        }
        return zzxnVar;
    }

    public final synchronized void zzc(zzxn zzxnVar) {
        zzxn[] zzxnVarArr = this.zzd;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zzxnVarArr[i10] = zzxnVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzxo zzxoVar) {
        while (zzxoVar != null) {
            zzxn[] zzxnVarArr = this.zzd;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            zzxnVarArr[i10] = zzxoVar.zzc();
            this.zzb--;
            zzxoVar = zzxoVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i10) {
        int i11 = this.zza;
        this.zza = i10;
        if (i10 < i11) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i10 = this.zza;
        int i11 = zzfk.zza;
        int max = Math.max(0, ((i10 + Settings.DEFAULT_INITIAL_WINDOW_SIZE) / 65536) - this.zzb);
        int i12 = this.zzc;
        if (max >= i12) {
            return;
        }
        Arrays.fill(this.zzd, max, i12, (Object) null);
        this.zzc = max;
    }
}
