package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzamx implements zzamy {
    private static final Logger zzb = Logger.getLogger(zzamx.class.getName());
    final ThreadLocal zza = new zzamw(this);

    public abstract zzanb zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzanb zzb(zzgyf zzgyfVar, zzanc zzancVar) throws IOException {
        int zza;
        long j10;
        String str;
        long zzb2 = zzgyfVar.zzb();
        ((ByteBuffer) this.zza.get()).rewind().limit(8);
        do {
            zza = zzgyfVar.zza((ByteBuffer) this.zza.get());
            if (zza == 8) {
                ((ByteBuffer) this.zza.get()).rewind();
                long zze = zzana.zze((ByteBuffer) this.zza.get());
                byte[] bArr = null;
                if (zze < 8 && zze > 1) {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Plausibility check failed: size < 8 (size = ");
                    sb2.append(zze);
                    sb2.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb2.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.zza.get()).get(bArr2);
                try {
                    String str2 = new String(bArr2, "ISO-8859-1");
                    if (zze == 1) {
                        ((ByteBuffer) this.zza.get()).limit(16);
                        zzgyfVar.zza((ByteBuffer) this.zza.get());
                        ((ByteBuffer) this.zza.get()).position(8);
                        j10 = zzana.zzf((ByteBuffer) this.zza.get()) - 16;
                    } else if (zze == 0) {
                        j10 = zzgyfVar.zzc() - zzgyfVar.zzb();
                    } else {
                        j10 = zze - 8;
                    }
                    if ("uuid".equals(str2)) {
                        ((ByteBuffer) this.zza.get()).limit(((ByteBuffer) this.zza.get()).limit() + 16);
                        zzgyfVar.zza((ByteBuffer) this.zza.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) this.zza.get()).position() - 16; position < ((ByteBuffer) this.zza.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) this.zza.get()).position() - 16)] = ((ByteBuffer) this.zza.get()).get(position);
                        }
                        j10 -= 16;
                    }
                    long j11 = j10;
                    if (zzancVar instanceof zzanb) {
                        str = ((zzanb) zzancVar).zza();
                    } else {
                        str = "";
                    }
                    zzanb zza2 = zza(str2, bArr, str);
                    zza2.zzc(zzancVar);
                    ((ByteBuffer) this.zza.get()).rewind();
                    zza2.zzb(zzgyfVar, (ByteBuffer) this.zza.get(), j11, this);
                    return zza2;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            }
        } while (zza >= 0);
        zzgyfVar.zze(zzb2);
        throw new EOFException();
    }
}
