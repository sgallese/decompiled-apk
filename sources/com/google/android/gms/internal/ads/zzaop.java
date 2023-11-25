package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import okhttp3.internal.http2.Http2;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaop extends zzgrq implements zzgtb {
    private static final zzaop zzb;
    private int zzd;
    private long zzt;
    private long zzu;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = 1000;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = 1000;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        zzaop zzaopVar = new zzaop();
        zzb = zzaopVar;
        zzgrq.zzaU(zzaop.class, zzaopVar);
    }

    private zzaop() {
    }

    public static zzaoo zza() {
        return (zzaoo) zzb.zzaA();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzaop zzaopVar, long j10) {
        zzaopVar.zzd |= 1;
        zzaopVar.zze = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzaop zzaopVar, long j10) {
        zzaopVar.zzd |= 2;
        zzaopVar.zzf = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzaop zzaopVar, long j10) {
        zzaopVar.zzd |= 4;
        zzaopVar.zzg = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzaop zzaopVar, long j10) {
        zzaopVar.zzd |= 8;
        zzaopVar.zzh = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzaop zzaopVar) {
        zzaopVar.zzd &= -9;
        zzaopVar.zzh = -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzaop zzaopVar, long j10) {
        zzaopVar.zzd |= 16;
        zzaopVar.zzi = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzaop zzaopVar, long j10) {
        zzaopVar.zzd |= 32;
        zzaopVar.zzj = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(zzaop zzaopVar, long j10) {
        zzaopVar.zzd |= 128;
        zzaopVar.zzl = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(zzaop zzaopVar, long j10) {
        zzaopVar.zzd |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        zzaopVar.zzm = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzaop zzaopVar, long j10) {
        zzaopVar.zzd |= 512;
        zzaopVar.zzn = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzn(zzaop zzaopVar, long j10) {
        zzaopVar.zzd |= RecyclerView.m.FLAG_MOVED;
        zzaopVar.zzp = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzo(zzaop zzaopVar, long j10) {
        zzaopVar.zzd |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        zzaopVar.zzq = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzp(zzaop zzaopVar, long j10) {
        zzaopVar.zzd |= 8192;
        zzaopVar.zzr = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzq(zzaop zzaopVar, long j10) {
        zzaopVar.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzaopVar.zzs = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzr(zzaop zzaopVar, long j10) {
        zzaopVar.zzd |= 32768;
        zzaopVar.zzt = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzs(zzaop zzaopVar, long j10) {
        zzaopVar.zzd |= 65536;
        zzaopVar.zzu = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzt(zzaop zzaopVar, long j10) {
        zzaopVar.zzd |= 131072;
        zzaopVar.zzv = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzu(zzaop zzaopVar, long j10) {
        zzaopVar.zzd |= 262144;
        zzaopVar.zzw = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzv(zzaop zzaopVar, int i10) {
        zzaopVar.zzk = i10 - 1;
        zzaopVar.zzd |= 64;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzw(zzaop zzaopVar, int i10) {
        zzaopVar.zzo = i10 - 1;
        zzaopVar.zzd |= UserVerificationMethods.USER_VERIFY_ALL;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzanu zzanuVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaoo(zzanuVar);
                }
                return new zzaop();
            }
            zzgru zzgruVar = zzaoy.zza;
            return zzgrq.zzaR(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzgruVar, "zzl", "zzm", "zzn", "zzo", zzgruVar, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        }
        return (byte) 1;
    }
}
