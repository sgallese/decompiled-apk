package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfcn {
    public zzfcn() {
        try {
            zzgau.zza();
        } catch (GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgqf zzt = zzgqi.zzt();
        try {
            zzfzl.zzb(zzgad.zzc(zzfzw.zza("AES128_GCM").zza()), zzfzk.zzb(zzt));
        } catch (IOException | GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(zzt.zzb().zzA(), 11);
        zzt.zzc();
        return encodeToString;
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdrc zzdrcVar) {
        zzgad zzc = zzc(str);
        if (zzc == null) {
            return null;
        }
        try {
            byte[] zza = ((zzfzi) zzc.zze(zzghg.zza(), zzfzi.class)).zza(bArr, bArr2);
            zzdrcVar.zza().put("ds", "1");
            return new String(zza, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "CryptoUtils.decrypt");
            zzdrcVar.zza().put("dsf", e10.toString());
            return null;
        }
    }

    private static final zzgad zzc(String str) {
        try {
            return zzfzl.zza(zzfzj.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "CryptoUtils.getHandle");
            return null;
        }
    }
}
