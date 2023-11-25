package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdo {
    private final zzfud zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private zzdp zzd;
    private zzdp zze;
    private boolean zzf;

    public zzdo(zzfud zzfudVar) {
        this.zza = zzfudVar;
        zzdp zzdpVar = zzdp.zza;
        this.zzd = zzdpVar;
        this.zze = zzdpVar;
        this.zzf = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z10;
        ByteBuffer byteBuffer2;
        do {
            z10 = false;
            for (int i10 = 0; i10 <= zzi(); i10++) {
                if (!this.zzc[i10].hasRemaining()) {
                    zzdr zzdrVar = (zzdr) this.zzb.get(i10);
                    if (zzdrVar.zzh()) {
                        if (!this.zzc[i10].hasRemaining() && i10 < zzi()) {
                            ((zzdr) this.zzb.get(i10 + 1)).zzd();
                        }
                    } else {
                        if (i10 > 0) {
                            byteBuffer2 = this.zzc[i10 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = zzdr.zza;
                        }
                        long remaining = byteBuffer2.remaining();
                        zzdrVar.zze(byteBuffer2);
                        this.zzc[i10] = zzdrVar.zzb();
                        boolean z11 = true;
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.zzc[i10].hasRemaining()) {
                            z11 = false;
                        }
                        z10 |= z11;
                    }
                }
            }
        } while (z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdo)) {
            return false;
        }
        zzdo zzdoVar = (zzdo) obj;
        if (this.zza.size() != zzdoVar.zza.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (this.zza.get(i10) != zzdoVar.zza.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzdp zza(zzdp zzdpVar) throws zzdq {
        if (!zzdpVar.equals(zzdp.zza)) {
            for (int i10 = 0; i10 < this.zza.size(); i10++) {
                zzdr zzdrVar = (zzdr) this.zza.get(i10);
                zzdp zza = zzdrVar.zza(zzdpVar);
                if (zzdrVar.zzg()) {
                    zzdy.zzf(!zza.equals(zzdp.zza));
                    zzdpVar = zza;
                }
            }
            this.zze = zzdpVar;
            return zzdpVar;
        }
        throw new zzdq("Unhandled input format:", zzdpVar);
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzdr.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (!byteBuffer.hasRemaining()) {
            zzj(zzdr.zza);
        }
        return byteBuffer;
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = this.zze;
        this.zzf = false;
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            zzdr zzdrVar = (zzdr) this.zza.get(i10);
            zzdrVar.zzc();
            if (zzdrVar.zzg()) {
                this.zzb.add(zzdrVar);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i11 = 0; i11 <= zzi(); i11++) {
            this.zzc[i11] = ((zzdr) this.zzb.get(i11)).zzb();
        }
    }

    public final void zzd() {
        if (zzh() && !this.zzf) {
            this.zzf = true;
            ((zzdr) this.zzb.get(0)).zzd();
        }
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (zzh() && !this.zzf) {
            zzj(byteBuffer);
        }
    }

    public final void zzf() {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            zzdr zzdrVar = (zzdr) this.zza.get(i10);
            zzdrVar.zzc();
            zzdrVar.zzf();
        }
        this.zzc = new ByteBuffer[0];
        zzdp zzdpVar = zzdp.zza;
        this.zzd = zzdpVar;
        this.zze = zzdpVar;
        this.zzf = false;
    }

    public final boolean zzg() {
        if (this.zzf && ((zzdr) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean zzh() {
        if (!this.zzb.isEmpty()) {
            return true;
        }
        return false;
    }
}
