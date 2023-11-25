package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
class zzfog {
    static final String zza = new UUID(0, 0).toString();
    final zzfoh zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfog(Context context, String str, String str2, String str3) {
        this.zzb = zzfoh.zzb(context);
        this.zzc = str;
        this.zzd = str.concat("_3p");
        this.zze = str2;
        this.zzf = str2.concat("_3p");
        this.zzg = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        String str4;
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str5 = this.zzg;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str5);
        sb2.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        String str6 = "null";
        if (str2 == null) {
            str4 = "null";
        } else {
            str4 = "not null";
        }
        sb2.append(str4);
        sb2.append(", hashKey is ");
        if (str3 != null) {
            str6 = "not null";
        }
        sb2.append(str6);
        throw new IllegalArgumentException(sb2.toString());
    }

    final long zza(boolean z10) {
        String str;
        zzfoh zzfohVar = this.zzb;
        if (z10) {
            str = this.zzf;
        } else {
            str = this.zze;
        }
        return zzfohVar.zza(str, -1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfof zzb(String str, String str2, long j10, boolean z10) throws IOException {
        String str3;
        boolean z11 = true;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String zze = zze(true);
                    String zzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (zze != null && zzc != null && !zze.equals(zzh(str, str2, zzc))) {
                        return zzc(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfof();
        }
        if (str == null) {
            z11 = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            long zza2 = zza(z11);
            if (zza2 != -1) {
                if (currentTimeMillis < zza2) {
                    zzfoh zzfohVar = this.zzb;
                    if (z11) {
                        str3 = this.zzf;
                    } else {
                        str3 = this.zze;
                    }
                    zzfohVar.zzd(str3, Long.valueOf(currentTimeMillis));
                } else if (currentTimeMillis >= zza2 + j10) {
                    return zzc(str, str2);
                }
            }
            String zze2 = zze(z11);
            if (zze2 == null && !z10) {
                return zzc(str, str2);
            }
            return new zzfof(zze2, zza(z11));
        }
        throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    final zzfof zzc(String str, String str2) throws IOException {
        if (str == null) {
            return zzd(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.zzb.zzd("paid_3p_hash_key", uuid);
        return zzd(zzh(str, str2, uuid), true);
    }

    final zzfof zzd(String str, boolean z10) throws IOException {
        String str2;
        String str3;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            zzfoh zzfohVar = this.zzb;
            if (z10) {
                str2 = this.zzf;
            } else {
                str2 = this.zze;
            }
            zzfohVar.zzd(str2, Long.valueOf(currentTimeMillis));
            zzfoh zzfohVar2 = this.zzb;
            if (z10) {
                str3 = this.zzd;
            } else {
                str3 = this.zzc;
            }
            zzfohVar2.zzd(str3, str);
            return new zzfof(str, currentTimeMillis);
        }
        throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    final String zze(boolean z10) {
        String str;
        zzfoh zzfohVar = this.zzb;
        if (z10) {
            str = this.zzd;
        } else {
            str = this.zzc;
        }
        return zzfohVar.zzc(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(boolean z10) throws IOException {
        String str;
        String str2;
        zzfoh zzfohVar = this.zzb;
        if (z10) {
            str = this.zzf;
        } else {
            str = this.zze;
        }
        zzfohVar.zze(str);
        zzfoh zzfohVar2 = this.zzb;
        if (z10) {
            str2 = this.zzd;
        } else {
            str2 = this.zzc;
        }
        zzfohVar2.zze(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzg(boolean z10) {
        return this.zzb.zzg(this.zzc);
    }
}
