package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzanl extends zzgrq implements zzgtb {
    private static final zzanl zzb;
    private int zzd;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private zzgrz zzp = zzgrq.zzaN();

    static {
        zzanl zzanlVar = new zzanl();
        zzb = zzanlVar;
        zzgrq.zzaU(zzanl.class, zzanlVar);
    }

    private zzanl() {
    }

    public static zzanh zza() {
        return (zzanh) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzanl zzanlVar, long j10) {
        zzanlVar.zzd |= 2;
        zzanlVar.zzf = j10;
    }

    public static /* synthetic */ void zze(zzanl zzanlVar, String str) {
        str.getClass();
        zzanlVar.zzd |= 4;
        zzanlVar.zzg = str;
    }

    public static /* synthetic */ void zzf(zzanl zzanlVar, String str) {
        str.getClass();
        zzanlVar.zzd |= 8;
        zzanlVar.zzh = str;
    }

    public static /* synthetic */ void zzg(zzanl zzanlVar, String str) {
        zzanlVar.zzd |= 16;
        zzanlVar.zzi = str;
    }

    public static /* synthetic */ void zzh(zzanl zzanlVar, String str) {
        zzanlVar.zzd |= UserVerificationMethods.USER_VERIFY_ALL;
        zzanlVar.zzo = str;
    }

    public static /* synthetic */ void zzi(zzanl zzanlVar, String str) {
        str.getClass();
        zzanlVar.zzd |= 1;
        zzanlVar.zze = str;
    }

    public static /* synthetic */ void zzj(zzanl zzanlVar, int i10) {
        zzanlVar.zzq = i10 - 1;
        zzanlVar.zzd |= RecyclerView.m.FLAG_MOVED;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzang zzangVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzanh(zzangVar);
                }
                return new zzanl();
            }
            return zzgrq.zzaR(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzanj.class, "zzq", zzank.zza});
        }
        return (byte) 1;
    }
}
