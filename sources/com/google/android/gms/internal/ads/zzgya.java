package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzgya implements zzanb {
    private static final zzgyl zza = zzgyl.zzb(zzgya.class);
    protected final String zzb;
    long zze;
    zzgyf zzg;
    private zzanc zzh;
    private ByteBuffer zzi;
    long zzf = -1;
    private ByteBuffer zzj = null;
    boolean zzd = true;
    boolean zzc = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzgya(String str) {
        this.zzb = str;
    }

    private final synchronized void zzd() {
        String str;
        if (!this.zzd) {
            try {
                zzgyl zzgylVar = zza;
                String str2 = this.zzb;
                if (str2.length() != 0) {
                    str = "mem mapping ".concat(str2);
                } else {
                    str = new String("mem mapping ");
                }
                zzgylVar.zza(str);
                this.zzi = this.zzg.zzd(this.zze, this.zzf);
                this.zzd = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanb
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzanb
    public final void zzb(zzgyf zzgyfVar, ByteBuffer byteBuffer, long j10, zzamy zzamyVar) throws IOException {
        this.zze = zzgyfVar.zzb();
        byteBuffer.remaining();
        this.zzf = j10;
        this.zzg = zzgyfVar;
        zzgyfVar.zze(zzgyfVar.zzb() + j10);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzanb
    public final void zzc(zzanc zzancVar) {
        this.zzh = zzancVar;
    }

    protected abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        String str;
        zzd();
        zzgyl zzgylVar = zza;
        String str2 = this.zzb;
        if (str2.length() != 0) {
            str = "parsing details of ".concat(str2);
        } else {
            str = new String("parsing details of ");
        }
        zzgylVar.zza(str);
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}
