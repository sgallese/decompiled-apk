package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzqn extends zzds {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    private static void zzo(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == zzd) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zze(ByteBuffer byteBuffer) {
        ByteBuffer zzj;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.zzb.zzd;
        if (i11 != 536870912) {
            if (i11 != 805306368) {
                if (i11 != 1342177280) {
                    if (i11 == 1610612736) {
                        zzj = zzj(i10);
                        while (position < limit) {
                            int i12 = byteBuffer.get(position + 3) & 255;
                            int i13 = (byteBuffer.get(position + 2) & 255) << 8;
                            zzo(i12 | i13 | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), zzj);
                            position += 4;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    zzj = zzj((i10 / 3) * 4);
                    while (position < limit) {
                        zzo(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), zzj);
                        position += 3;
                    }
                }
            } else {
                zzj = zzj(i10);
                while (position < limit) {
                    int i14 = byteBuffer.get(position) & 255;
                    int i15 = (byteBuffer.get(position + 1) & 255) << 8;
                    zzo(i14 | i15 | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), zzj);
                    position += 4;
                }
            }
        } else {
            zzj = zzj((i10 / 3) * 4);
            while (position < limit) {
                zzo(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), zzj);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzds
    public final zzdp zzi(zzdp zzdpVar) throws zzdq {
        int i10 = zzdpVar.zzd;
        int i11 = zzfk.zza;
        if (i10 != 536870912 && i10 != 1342177280 && i10 != 805306368 && i10 != 1610612736) {
            if (i10 == 4) {
                return zzdp.zza;
            }
            throw new zzdq("Unhandled input format:", zzdpVar);
        }
        return new zzdp(zzdpVar.zzb, zzdpVar.zzc, 4);
    }
}
