package com.google.android.gms.internal.wearable;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzew extends zzey {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzew(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzez.zzb) {
            zzez.zzD(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzez.zzE(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final void zzd(Object obj, long j10, byte b10) {
        if (zzez.zzb) {
            zzez.zzD(obj, j10, b10);
        } else {
            zzez.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final void zze(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final void zzf(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final boolean zzg(Object obj, long j10) {
        if (zzez.zzb) {
            return zzez.zzt(obj, j10);
        }
        return zzez.zzu(obj, j10);
    }
}
