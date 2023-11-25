package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdv extends zzds {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9 A[ADDED_TO_REGION, LOOP:6: B:38:0x00e9->B:39:0x00eb, LOOP_START, PHI: r0
      0x00e9: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:17:0x003e, B:39:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzdr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdv.zze(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzds
    public final zzdp zzi(zzdp zzdpVar) throws zzdq {
        int i10 = zzdpVar.zzd;
        if (i10 != 3) {
            if (i10 != 2) {
                if (i10 != 268435456 && i10 != 536870912 && i10 != 1342177280 && i10 != 805306368 && i10 != 1610612736 && i10 != 4) {
                    throw new zzdq("Unhandled input format:", zzdpVar);
                }
            } else {
                return zzdp.zza;
            }
        }
        return new zzdp(zzdpVar.zzb, zzdpVar.zzc, 2);
    }
}
