package com.google.android.gms.internal.wearable;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzu extends zzcg implements zzdo {
    private static final zzu zzb;
    private int zzd;
    private double zzg;
    private float zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private long zzr;
    private byte zzs = 2;
    private zzbh zze = zzbh.zzb;
    private String zzf = "";
    private zzcn zzm = zzcg.zzU();
    private zzcn zzn = zzcg.zzU();
    private zzcn zzo = zzcg.zzU();
    private zzcm zzp = zzcg.zzT();
    private zzcl zzq = zzcg.zzS();

    static {
        zzu zzuVar = new zzu();
        zzb = zzuVar;
        zzcg.zzab(zzu.class, zzuVar);
    }

    private zzu() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzA(zzu zzuVar, Iterable iterable) {
        int i10;
        zzcm zzcmVar = zzuVar.zzp;
        if (!zzcmVar.zzc()) {
            int size = zzcmVar.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            zzuVar.zzp = zzcmVar.zzd(i10);
        }
        zzar.zzJ(iterable, zzuVar.zzp);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzB(zzu zzuVar, Iterable iterable) {
        int i10;
        zzcl zzclVar = zzuVar.zzq;
        if (!zzclVar.zzc()) {
            int size = zzclVar.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            zzuVar.zzq = zzclVar.zzd(i10);
        }
        zzar.zzJ(iterable, zzuVar.zzq);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzC(zzu zzuVar, long j10) {
        zzuVar.zzd |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        zzuVar.zzr = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzD(zzu zzuVar, double d10) {
        zzuVar.zzd |= 4;
        zzuVar.zzg = d10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzE(zzu zzuVar, float f10) {
        zzuVar.zzd |= 8;
        zzuVar.zzh = f10;
    }

    public static zzt zzh() {
        return (zzt) zzb.zzN();
    }

    public static zzu zzj() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzr(zzu zzuVar, zzbh zzbhVar) {
        zzuVar.zzd |= 1;
        zzuVar.zze = zzbhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzs(zzu zzuVar, long j10) {
        zzuVar.zzd |= 16;
        zzuVar.zzi = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzt(zzu zzuVar, int i10) {
        zzuVar.zzd |= 32;
        zzuVar.zzj = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzu(zzu zzuVar, int i10) {
        zzuVar.zzd |= 64;
        zzuVar.zzk = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzv(zzu zzuVar, boolean z10) {
        zzuVar.zzd |= 128;
        zzuVar.zzl = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzw(zzu zzuVar, Iterable iterable) {
        zzcn zzcnVar = zzuVar.zzm;
        if (!zzcnVar.zzc()) {
            zzuVar.zzm = zzcg.zzV(zzcnVar);
        }
        zzar.zzJ(iterable, zzuVar.zzm);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzx(zzu zzuVar, zzv zzvVar) {
        zzvVar.getClass();
        zzcn zzcnVar = zzuVar.zzn;
        if (!zzcnVar.zzc()) {
            zzuVar.zzn = zzcg.zzV(zzcnVar);
        }
        zzuVar.zzn.add(zzvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzy(zzu zzuVar, String str) {
        zzuVar.zzd |= 2;
        zzuVar.zzf = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzz(zzu zzuVar, Iterable iterable) {
        zzcn zzcnVar = zzuVar.zzo;
        if (!zzcnVar.zzc()) {
            zzuVar.zzo = zzcg.zzV(zzcnVar);
        }
        zzar.zzJ(iterable, zzuVar.zzo);
    }

    public final boolean zzF() {
        return this.zzl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.wearable.zzcg
    public final Object zzG(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            byte b10 = 1;
            if (i11 != 2) {
                if (i11 != 3) {
                    zzm zzmVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (obj == null) {
                                b10 = 0;
                            }
                            this.zzs = b10;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzt(zzmVar);
                }
                return new zzu();
            }
            return zzcg.zzY(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0002\u0001ည\u0000\u0002ဈ\u0001\u0003က\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဏ\u0006\bဇ\u0007\tЛ\nЛ\u000b\u001a\f\u0014\rဂ\b\u000e\u0013", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzw.class, "zzn", zzv.class, "zzo", "zzp", "zzr", "zzq"});
        }
        return Byte.valueOf(this.zzs);
    }

    public final double zza() {
        return this.zzg;
    }

    public final float zzb() {
        return this.zzh;
    }

    public final int zzc() {
        return this.zzn.size();
    }

    public final int zzd() {
        return this.zzk;
    }

    public final int zze() {
        return this.zzj;
    }

    public final long zzf() {
        return this.zzr;
    }

    public final long zzg() {
        return this.zzi;
    }

    public final zzbh zzk() {
        return this.zze;
    }

    public final String zzl() {
        return this.zzf;
    }

    public final List zzm() {
        return this.zzn;
    }

    public final List zzn() {
        return this.zzm;
    }

    public final List zzo() {
        return this.zzq;
    }

    public final List zzp() {
        return this.zzp;
    }

    public final List zzq() {
        return this.zzo;
    }
}
