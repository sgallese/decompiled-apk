package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzqm extends zzds {
    private int zzd;
    private boolean zze;
    private byte[] zzf;
    private byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private long zzl;

    public zzqm() {
        byte[] bArr = zzfk.zzf;
        this.zzf = bArr;
        this.zzg = bArr;
    }

    private final int zzq(long j10) {
        return (int) ((j10 * this.zzb.zzb) / 1000000);
    }

    private final int zzr(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > 1024) {
                int i10 = this.zzd;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    private final void zzs(byte[] bArr, int i10) {
        zzj(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.zzk = true;
        }
    }

    private final void zzt(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.zzj);
        int i11 = this.zzj - min;
        System.arraycopy(bArr, i10 - i11, this.zzg, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.zzg, i11, min);
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zze(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !zzn()) {
            int i10 = this.zzh;
            if (i10 != 0) {
                if (i10 != 1) {
                    int limit = byteBuffer.limit();
                    int zzr = zzr(byteBuffer);
                    byteBuffer.limit(zzr);
                    this.zzl += byteBuffer.remaining() / this.zzd;
                    zzt(byteBuffer, this.zzg, this.zzj);
                    if (zzr < limit) {
                        zzs(this.zzg, this.zzj);
                        this.zzh = 0;
                        byteBuffer.limit(limit);
                    }
                } else {
                    int limit2 = byteBuffer.limit();
                    int zzr2 = zzr(byteBuffer);
                    int position2 = zzr2 - byteBuffer.position();
                    byte[] bArr = this.zzf;
                    int length = bArr.length;
                    int i11 = this.zzi;
                    int i12 = length - i11;
                    if (zzr2 < limit2 && position2 < i12) {
                        zzs(bArr, i11);
                        this.zzi = 0;
                        this.zzh = 0;
                    } else {
                        int min = Math.min(position2, i12);
                        byteBuffer.limit(byteBuffer.position() + min);
                        byteBuffer.get(this.zzf, this.zzi, min);
                        int i13 = this.zzi + min;
                        this.zzi = i13;
                        byte[] bArr2 = this.zzf;
                        if (i13 == bArr2.length) {
                            if (this.zzk) {
                                zzs(bArr2, this.zzj);
                                long j10 = this.zzl;
                                int i14 = this.zzi;
                                int i15 = this.zzj;
                                this.zzl = j10 + ((i14 - (i15 + i15)) / this.zzd);
                                i13 = i14;
                            } else {
                                this.zzl += (i13 - this.zzj) / this.zzd;
                            }
                            zzt(byteBuffer, this.zzf, i13);
                            this.zzi = 0;
                            this.zzh = 2;
                        }
                        byteBuffer.limit(limit2);
                    }
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.zzf.length));
                int limit4 = byteBuffer.limit();
                while (true) {
                    limit4 -= 2;
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > 1024) {
                            int i16 = this.zzd;
                            position = ((limit4 / i16) * i16) + i16;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.zzh = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    zzj(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.zzk = true;
                    }
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzds, com.google.android.gms.internal.ads.zzdr
    public final boolean zzg() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzds
    public final zzdp zzi(zzdp zzdpVar) throws zzdq {
        if (zzdpVar.zzd == 2) {
            if (this.zze) {
                return zzdpVar;
            }
            return zzdp.zza;
        }
        throw new zzdq("Unhandled input format:", zzdpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzds
    protected final void zzk() {
        if (this.zze) {
            this.zzd = this.zzb.zze;
            int zzq = zzq(150000L) * this.zzd;
            if (this.zzf.length != zzq) {
                this.zzf = new byte[zzq];
            }
            int zzq2 = zzq(20000L) * this.zzd;
            this.zzj = zzq2;
            if (this.zzg.length != zzq2) {
                this.zzg = new byte[zzq2];
            }
        }
        this.zzh = 0;
        this.zzl = 0L;
        this.zzi = 0;
        this.zzk = false;
    }

    @Override // com.google.android.gms.internal.ads.zzds
    protected final void zzl() {
        int i10 = this.zzi;
        if (i10 > 0) {
            zzs(this.zzf, i10);
        }
        if (!this.zzk) {
            this.zzl += this.zzj / this.zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzds
    protected final void zzm() {
        this.zze = false;
        this.zzj = 0;
        byte[] bArr = zzfk.zzf;
        this.zzf = bArr;
        this.zzg = bArr;
    }

    public final long zzo() {
        return this.zzl;
    }

    public final void zzp(boolean z10) {
        this.zze = z10;
    }
}
