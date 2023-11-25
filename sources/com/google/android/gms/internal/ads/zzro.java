package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzro extends zzht {
    private long zzf;
    private int zzg;
    private int zzh;

    public zzro() {
        super(2, 0);
        this.zzh = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzht, com.google.android.gms.internal.ads.zzhn
    public final void zzb() {
        super.zzb();
        this.zzg = 0;
    }

    public final int zzm() {
        return this.zzg;
    }

    public final long zzn() {
        return this.zzf;
    }

    public final void zzo(int i10) {
        this.zzh = i10;
    }

    public final boolean zzp(zzht zzhtVar) {
        ByteBuffer byteBuffer;
        zzdy.zzd(!zzhtVar.zzd(1073741824));
        zzdy.zzd(!zzhtVar.zzd(268435456));
        zzdy.zzd(!zzhtVar.zzd(4));
        if (zzq()) {
            if (this.zzg < this.zzh && zzhtVar.zzd(RecyclerView.UNDEFINED_DURATION) == zzd(RecyclerView.UNDEFINED_DURATION)) {
                ByteBuffer byteBuffer2 = zzhtVar.zzb;
                if (byteBuffer2 != null && (byteBuffer = this.zzb) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                    return false;
                }
            } else {
                return false;
            }
        }
        int i10 = this.zzg;
        this.zzg = i10 + 1;
        if (i10 == 0) {
            this.zzd = zzhtVar.zzd;
            if (zzhtVar.zzd(1)) {
                zzc(1);
            }
        }
        if (zzhtVar.zzd(RecyclerView.UNDEFINED_DURATION)) {
            zzc(RecyclerView.UNDEFINED_DURATION);
        }
        ByteBuffer byteBuffer3 = zzhtVar.zzb;
        if (byteBuffer3 != null) {
            zzj(byteBuffer3.remaining());
            this.zzb.put(byteBuffer3);
        }
        this.zzf = zzhtVar.zzd;
        return true;
    }

    public final boolean zzq() {
        if (this.zzg > 0) {
            return true;
        }
        return false;
    }
}
