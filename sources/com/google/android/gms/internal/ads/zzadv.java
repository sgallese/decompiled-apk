package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzadv {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzadv() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzadu zzaduVar) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzaduVar.zza);
            String str = zzaduVar.zzb;
            if (str == null) {
                str = "";
            }
            zzb(this.zzb, str);
            this.zzb.writeLong(zzaduVar.zzc);
            this.zzb.writeLong(zzaduVar.zzd);
            this.zzb.write(zzaduVar.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
