package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzazn extends zzgrq implements zzgtb {
    private static final zzgrw zzb = new zzazl();
    private static final zzazn zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private zzgrv zzj = zzgrq.zzaJ();
    private zzazi zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        zzazn zzaznVar = new zzazn();
        zzd = zzaznVar;
        zzgrq.zzaU(zzazn.class, zzaznVar);
    }

    private zzazn() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzA(zzazn zzaznVar, int i10) {
        zzaznVar.zzm = i10 - 1;
        zzaznVar.zze |= 64;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzB(zzazn zzaznVar, int i10) {
        zzaznVar.zzn = i10 - 1;
        zzaznVar.zze |= 128;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzC(zzazn zzaznVar, int i10) {
        zzaznVar.zzp = i10 - 1;
        zzaznVar.zze |= 512;
    }

    public static zzazm zzg() {
        return (zzazm) zzd.zzaA();
    }

    public static zzazn zzi(byte[] bArr) throws zzgsc {
        return (zzazn) zzgrq.zzaF(zzd, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(zzazn zzaznVar, long j10) {
        zzaznVar.zze |= 1;
        zzaznVar.zzf = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzazn zzaznVar, long j10) {
        zzaznVar.zze |= 4;
        zzaznVar.zzh = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzn(zzazn zzaznVar, long j10) {
        zzaznVar.zze |= 8;
        zzaznVar.zzi = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzo(zzazn zzaznVar, Iterable iterable) {
        zzgrv zzgrvVar = zzaznVar.zzj;
        if (!zzgrvVar.zzc()) {
            zzaznVar.zzj = zzgrq.zzaK(zzgrvVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzaznVar.zzj.zzh(((zzayc) it.next()).zza());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzp(zzazn zzaznVar, zzazi zzaziVar) {
        zzaziVar.getClass();
        zzaznVar.zzk = zzaziVar;
        zzaznVar.zze |= 16;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzq(zzazn zzaznVar, int i10) {
        zzaznVar.zze |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        zzaznVar.zzo = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzr(zzazn zzaznVar, zzazr zzazrVar) {
        zzaznVar.zzq = zzazrVar.zza();
        zzaznVar.zze |= UserVerificationMethods.USER_VERIFY_ALL;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzs(zzazn zzaznVar, long j10) {
        zzaznVar.zze |= RecyclerView.m.FLAG_MOVED;
        zzaznVar.zzr = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzy(zzazn zzaznVar, int i10) {
        zzaznVar.zzg = i10 - 1;
        zzaznVar.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzz(zzazn zzaznVar, int i10) {
        zzaznVar.zzl = i10 - 1;
        zzaznVar.zze |= 32;
    }

    public final int zza() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzaxl zzaxlVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzd;
                    }
                    return new zzazm(zzaxlVar);
                }
                return new zzazn();
            }
            zzgru zzgruVar = zzayr.zza;
            return zzgrq.zzaR(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", zzgruVar, "zzh", "zzi", "zzj", zzayb.zza, "zzk", "zzl", zzgruVar, "zzm", zzgruVar, "zzn", zzgruVar, "zzo", "zzp", zzgruVar, "zzq", zzazq.zza, "zzr"});
        }
        return (byte) 1;
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final long zze() {
        return this.zzf;
    }

    public final zzazi zzf() {
        zzazi zzaziVar = this.zzk;
        if (zzaziVar == null) {
            return zzazi.zzd();
        }
        return zzaziVar;
    }

    public final zzazr zzj() {
        zzazr zzb2 = zzazr.zzb(this.zzq);
        if (zzb2 == null) {
            return zzazr.UNSPECIFIED;
        }
        return zzb2;
    }

    public final List zzk() {
        return new zzgrx(this.zzj, zzb);
    }

    public final int zzt() {
        int zza = zzays.zza(this.zzm);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzu() {
        int zza = zzays.zza(this.zzn);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzv() {
        int zza = zzays.zza(this.zzp);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzw() {
        int zza = zzays.zza(this.zzg);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzx() {
        int zza = zzays.zza(this.zzl);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
