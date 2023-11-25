package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzayu extends zzgrq implements zzgtb {
    private static final zzayu zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private zzbae zzi;
    private zzaym zzk;
    private zzayp zzl;
    private zzazi zzm;
    private zzaxq zzn;
    private zzazs zzo;
    private zzbaz zzp;
    private zzaxz zzq;
    private String zzf = "";
    private int zzh = 1000;
    private zzgry zzj = zzgrq.zzaL();

    static {
        zzayu zzayuVar = new zzayu();
        zzb = zzayuVar;
        zzgrq.zzaU(zzayu.class, zzayuVar);
    }

    private zzayu() {
    }

    public static zzayt zzd() {
        return (zzayt) zzb.zzaA();
    }

    public static /* synthetic */ void zzg(zzayu zzayuVar, String str) {
        str.getClass();
        zzayuVar.zzd |= 2;
        zzayuVar.zzf = str;
    }

    public static /* synthetic */ void zzh(zzayu zzayuVar, Iterable iterable) {
        zzgry zzgryVar = zzayuVar.zzj;
        if (!zzgryVar.zzc()) {
            zzayuVar.zzj = zzgrq.zzaM(zzgryVar);
        }
        zzgpr.zzav(iterable, zzayuVar.zzj);
    }

    public static /* synthetic */ void zzj(zzayu zzayuVar, zzaym zzaymVar) {
        zzaymVar.getClass();
        zzayuVar.zzk = zzaymVar;
        zzayuVar.zzd |= 32;
    }

    public static /* synthetic */ void zzk(zzayu zzayuVar, zzaxq zzaxqVar) {
        zzaxqVar.getClass();
        zzayuVar.zzn = zzaxqVar;
        zzayuVar.zzd |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
    }

    public static /* synthetic */ void zzl(zzayu zzayuVar, zzazs zzazsVar) {
        zzazsVar.getClass();
        zzayuVar.zzo = zzazsVar;
        zzayuVar.zzd |= 512;
    }

    public static /* synthetic */ void zzm(zzayu zzayuVar, zzbaz zzbazVar) {
        zzbazVar.getClass();
        zzayuVar.zzp = zzbazVar;
        zzayuVar.zzd |= UserVerificationMethods.USER_VERIFY_ALL;
    }

    public static /* synthetic */ void zzn(zzayu zzayuVar, zzaxz zzaxzVar) {
        zzaxzVar.getClass();
        zzayuVar.zzq = zzaxzVar;
        zzayuVar.zzd |= RecyclerView.m.FLAG_MOVED;
    }

    public final zzaxq zza() {
        zzaxq zzaxqVar = this.zzn;
        if (zzaxqVar == null) {
            return zzaxq.zzc();
        }
        return zzaxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzaxl zzaxlVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzayt(zzaxlVar);
                }
                return new zzayu();
            }
            return zzgrq.zzaR(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzayr.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        return (byte) 1;
    }

    public final zzaym zzc() {
        zzaym zzaymVar = this.zzk;
        if (zzaymVar == null) {
            return zzaym.zzc();
        }
        return zzaymVar;
    }

    public final String zzf() {
        return this.zzf;
    }
}
