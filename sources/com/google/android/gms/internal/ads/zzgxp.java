package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgxp extends zzgrq implements zzgtb {
    private static final zzgxp zzb;
    private zzgwa zzB;
    private zzgvs zzD;
    private zzgwt zzF;
    private int zzG;
    private int zzd;
    private int zze;
    private int zzf;
    private zzgvw zzj;
    private zzgxc zzn;
    private boolean zzo;
    private boolean zzr;
    private boolean zzs;
    private zzgxk zzu;
    private boolean zzv;
    private zzgxo zzz;
    private byte zzJ = 2;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzgrz zzk = zzgrq.zzaN();
    private zzgrz zzl = zzgrq.zzaN();
    private String zzm = "";
    private zzgrz zzp = zzgrq.zzaN();
    private String zzq = "";
    private zzgqi zzt = zzgqi.zzb;
    private String zzw = "";
    private zzgrz zzx = zzgrq.zzaN();
    private zzgrz zzy = zzgrq.zzaN();
    private zzgrz zzA = zzgrq.zzaN();
    private String zzC = "";
    private zzgrz zzE = zzgrq.zzaN();
    private zzgrz zzH = zzgrq.zzaN();
    private zzgrz zzI = zzgrq.zzaN();

    static {
        zzgxp zzgxpVar = new zzgxp();
        zzb = zzgxpVar;
        zzgrq.zzaU(zzgxp.class, zzgxpVar);
    }

    private zzgxp() {
    }

    public static zzgvu zza() {
        return (zzgvu) zzb.zzaA();
    }

    public static /* synthetic */ void zzg(zzgxp zzgxpVar, String str) {
        str.getClass();
        zzgxpVar.zzd |= 4;
        zzgxpVar.zzg = str;
    }

    public static /* synthetic */ void zzh(zzgxp zzgxpVar, String str) {
        str.getClass();
        zzgxpVar.zzd |= 8;
        zzgxpVar.zzh = str;
    }

    public static /* synthetic */ void zzi(zzgxp zzgxpVar, zzgvw zzgvwVar) {
        zzgvwVar.getClass();
        zzgxpVar.zzj = zzgvwVar;
        zzgxpVar.zzd |= 32;
    }

    public static /* synthetic */ void zzj(zzgxp zzgxpVar, zzgxi zzgxiVar) {
        zzgxiVar.getClass();
        zzgrz zzgrzVar = zzgxpVar.zzk;
        if (!zzgrzVar.zzc()) {
            zzgxpVar.zzk = zzgrq.zzaO(zzgrzVar);
        }
        zzgxpVar.zzk.add(zzgxiVar);
    }

    public static /* synthetic */ void zzk(zzgxp zzgxpVar, String str) {
        zzgxpVar.zzd |= 64;
        zzgxpVar.zzm = str;
    }

    public static /* synthetic */ void zzl(zzgxp zzgxpVar) {
        zzgxpVar.zzd &= -65;
        zzgxpVar.zzm = zzb.zzm;
    }

    public static /* synthetic */ void zzm(zzgxp zzgxpVar, zzgxc zzgxcVar) {
        zzgxcVar.getClass();
        zzgxpVar.zzn = zzgxcVar;
        zzgxpVar.zzd |= 128;
    }

    public static /* synthetic */ void zzn(zzgxp zzgxpVar, zzgxk zzgxkVar) {
        zzgxkVar.getClass();
        zzgxpVar.zzu = zzgxkVar;
        zzgxpVar.zzd |= 8192;
    }

    public static /* synthetic */ void zzo(zzgxp zzgxpVar, Iterable iterable) {
        zzgrz zzgrzVar = zzgxpVar.zzx;
        if (!zzgrzVar.zzc()) {
            zzgxpVar.zzx = zzgrq.zzaO(zzgrzVar);
        }
        zzgpr.zzav(iterable, zzgxpVar.zzx);
    }

    public static /* synthetic */ void zzp(zzgxp zzgxpVar, Iterable iterable) {
        zzgrz zzgrzVar = zzgxpVar.zzy;
        if (!zzgrzVar.zzc()) {
            zzgxpVar.zzy = zzgrq.zzaO(zzgrzVar);
        }
        zzgpr.zzav(iterable, zzgxpVar.zzy);
    }

    public static /* synthetic */ void zzq(zzgxp zzgxpVar, int i10) {
        zzgxpVar.zze = i10 - 1;
        zzgxpVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            byte b10 = 1;
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgvk zzgvkVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (obj == null) {
                                b10 = 0;
                            }
                            this.zzJ = b10;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgvu(zzgvkVar);
                }
                return new zzgxp();
            }
            return zzgrq.zzaR(zzb, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", zzgxi.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", zzgxd.zza, "zzf", zzgvt.zza, "zzj", "zzm", "zzn", "zzt", "zzl", zzgxt.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", zzgxz.class, "zzB", "zzC", "zzD", "zzE", zzgwe.class, "zzF", "zzG", zzgxm.zza, "zzH", zzgww.class, "zzI", zzgwz.class});
        }
        return Byte.valueOf(this.zzJ);
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzg;
    }

    public final List zzf() {
        return this.zzk;
    }
}
