package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaos extends zzgrq implements zzgtb {
    private static final zzaos zzb;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private zzaou zzM;
    private zzaon zzaC;
    private long zzaI;
    private zzaoe zzaL;
    private zzaog zzaM;
    private int zzaP;
    private long zzaQ;
    private boolean zzaT;
    private long zzaV;
    private zzapb zzaW;
    private zzaop zzae;
    private zzaor zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private zzapd zzau;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzg = "";
    private String zzh = "";
    private String zzs = "";
    private String zzC = "";
    private String zzD = "D";
    private String zzE = "";
    private String zzI = "";
    private long zzK = -1;
    private long zzL = -1;
    private long zzN = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private String zzT = "D";
    private String zzU = "D";
    private long zzV = -1;
    private int zzW = 1000;
    private int zzX = 1000;
    private long zzY = -1;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private int zzad = 1000;
    private zzgrz zzaf = zzgrq.zzaN();
    private long zzah = -1;
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private String zzap = "D";
    private long zzaq = -1;
    private long zzav = -1;
    private int zzaw = 1000;
    private int zzax = 1000;
    private String zzay = "D";
    private zzgrz zzaz = zzgrq.zzaN();
    private int zzaA = 1000;
    private zzgrz zzaB = zzgrq.zzaN();
    private String zzaD = "";
    private long zzaE = -1;
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaJ = -1;
    private String zzaK = "";
    private long zzaN = -1;
    private long zzaO = -1;
    private String zzaR = "";
    private int zzaS = 2;
    private String zzaU = "";
    private long zzaX = -1;
    private String zzaY = "";

    static {
        zzaos zzaosVar = new zzaos();
        zzb = zzaosVar;
        zzgrq.zzaU(zzaos.class, zzaosVar);
    }

    private zzaos() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzA(zzaos zzaosVar, long j10) {
        zzaosVar.zzd |= 134217728;
        zzaosVar.zzH = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzB(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zzd |= 268435456;
        zzaosVar.zzI = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzC(zzaos zzaosVar, long j10) {
        zzaosVar.zzd |= 536870912;
        zzaosVar.zzJ = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzD(zzaos zzaosVar, long j10) {
        zzaosVar.zzd |= 1073741824;
        zzaosVar.zzK = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzE(zzaos zzaosVar, long j10) {
        zzaosVar.zzd |= RecyclerView.UNDEFINED_DURATION;
        zzaosVar.zzL = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzF(zzaos zzaosVar, long j10) {
        zzaosVar.zze |= 2;
        zzaosVar.zzN = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzG(zzaos zzaosVar, long j10) {
        zzaosVar.zze |= 4;
        zzaosVar.zzO = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzH(zzaos zzaosVar, long j10) {
        zzaosVar.zze |= 8;
        zzaosVar.zzP = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzI(zzaos zzaosVar, long j10) {
        zzaosVar.zze |= 16;
        zzaosVar.zzQ = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzJ(zzaos zzaosVar, long j10) {
        zzaosVar.zze |= 32;
        zzaosVar.zzR = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzK(zzaos zzaosVar, long j10) {
        zzaosVar.zze |= 64;
        zzaosVar.zzS = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzL(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zze |= 128;
        zzaosVar.zzT = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzM(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zze |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        zzaosVar.zzU = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzN(zzaos zzaosVar, long j10) {
        zzaosVar.zze |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        zzaosVar.zzY = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzO(zzaos zzaosVar, long j10) {
        zzaosVar.zze |= 8192;
        zzaosVar.zzZ = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzP(zzaos zzaosVar, long j10) {
        zzaosVar.zze |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzaosVar.zzaa = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzQ(zzaos zzaosVar, zzaop zzaopVar) {
        zzaopVar.getClass();
        zzaosVar.zzae = zzaopVar;
        zzaosVar.zze |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzR(zzaos zzaosVar, zzaop zzaopVar) {
        zzaopVar.getClass();
        zzgrz zzgrzVar = zzaosVar.zzaf;
        if (!zzgrzVar.zzc()) {
            zzaosVar.zzaf = zzgrq.zzaO(zzgrzVar);
        }
        zzaosVar.zzaf.add(zzaopVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzT(zzaos zzaosVar, zzaor zzaorVar) {
        zzaorVar.getClass();
        zzaosVar.zzag = zzaorVar;
        zzaosVar.zze |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzU(zzaos zzaosVar, long j10) {
        zzaosVar.zze |= 2097152;
        zzaosVar.zzai = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzV(zzaos zzaosVar, long j10) {
        zzaosVar.zze |= 4194304;
        zzaosVar.zzaj = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzW(zzaos zzaosVar, long j10) {
        zzaosVar.zze |= 8388608;
        zzaosVar.zzak = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzX(zzaos zzaosVar, long j10) {
        zzaosVar.zze |= 67108864;
        zzaosVar.zzan = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzY(zzaos zzaosVar, long j10) {
        zzaosVar.zze |= 134217728;
        zzaosVar.zzao = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzZ(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zze |= 268435456;
        zzaosVar.zzap = str;
    }

    public static zzanv zza() {
        return (zzanv) zzb.zzaA();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaa(zzaos zzaosVar, long j10) {
        zzaosVar.zzf |= 512;
        zzaosVar.zzaE = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzab(zzaos zzaosVar, long j10) {
        zzaosVar.zzf |= UserVerificationMethods.USER_VERIFY_ALL;
        zzaosVar.zzaF = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzac(zzaos zzaosVar, long j10) {
        zzaosVar.zzf |= RecyclerView.m.FLAG_MOVED;
        zzaosVar.zzaG = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzad(zzaos zzaosVar, long j10) {
        zzaosVar.zzf |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        zzaosVar.zzaH = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzae(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zzf |= 32768;
        zzaosVar.zzaK = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaf(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zzf |= 4194304;
        zzaosVar.zzaR = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzag(zzaos zzaosVar, boolean z10) {
        zzaosVar.zzf |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        zzaosVar.zzaT = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzah(zzaos zzaosVar, long j10) {
        zzaosVar.zzf |= 67108864;
        zzaosVar.zzaV = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzam(zzaos zzaosVar, int i10) {
        zzaosVar.zzW = i10 - 1;
        zzaosVar.zze |= UserVerificationMethods.USER_VERIFY_ALL;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzan(zzaos zzaosVar, int i10) {
        zzaosVar.zzX = i10 - 1;
        zzaosVar.zze |= RecyclerView.m.FLAG_MOVED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzao(zzaos zzaosVar, int i10) {
        zzaosVar.zzad = i10 - 1;
        zzaosVar.zze |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzap(zzaos zzaosVar, int i10) {
        zzaosVar.zzaw = i10 - 1;
        zzaosVar.zzf |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaq(zzaos zzaosVar, int i10) {
        zzaosVar.zzax = i10 - 1;
        zzaosVar.zzf |= 16;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzar(zzaos zzaosVar, int i10) {
        zzaosVar.zzaP = i10 - 1;
        zzaosVar.zzf |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzas(zzaos zzaosVar, int i10) {
        zzaosVar.zzaS = 5;
        zzaosVar.zzf |= 8388608;
    }

    public static zzaos zzd() {
        return zzb;
    }

    public static zzaos zze(byte[] bArr, zzgrc zzgrcVar) throws zzgsc {
        return (zzaos) zzgrq.zzaI(zzb, bArr, zzgrcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zzd |= 1;
        zzaosVar.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zzd |= 2;
        zzaosVar.zzh = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(zzaos zzaosVar, long j10) {
        zzaosVar.zzd |= 4;
        zzaosVar.zzi = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(zzaos zzaosVar, long j10) {
        zzaosVar.zzd |= 16;
        zzaosVar.zzk = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzaos zzaosVar, long j10) {
        zzaosVar.zzd |= 32;
        zzaosVar.zzl = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzn(zzaos zzaosVar, long j10) {
        zzaosVar.zzd |= UserVerificationMethods.USER_VERIFY_ALL;
        zzaosVar.zzq = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzo(zzaos zzaosVar, long j10) {
        zzaosVar.zzd |= RecyclerView.m.FLAG_MOVED;
        zzaosVar.zzr = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzp(zzaos zzaosVar, long j10) {
        zzaosVar.zzd |= 8192;
        zzaosVar.zzt = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzq(zzaos zzaosVar, long j10) {
        zzaosVar.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzaosVar.zzu = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzr(zzaos zzaosVar, long j10) {
        zzaosVar.zzd |= 32768;
        zzaosVar.zzv = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzs(zzaos zzaosVar, long j10) {
        zzaosVar.zzd |= 65536;
        zzaosVar.zzw = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzt(zzaos zzaosVar, long j10) {
        zzaosVar.zzd |= 524288;
        zzaosVar.zzz = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzu(zzaos zzaosVar, long j10) {
        zzaosVar.zzd |= 1048576;
        zzaosVar.zzA = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzv(zzaos zzaosVar, long j10) {
        zzaosVar.zzd |= 2097152;
        zzaosVar.zzB = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzw(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zzd |= 4194304;
        zzaosVar.zzC = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzx(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zzd |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        zzaosVar.zzE = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzy(zzaos zzaosVar, long j10) {
        zzaosVar.zzd |= 33554432;
        zzaosVar.zzF = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzz(zzaos zzaosVar, long j10) {
        zzaosVar.zzd |= 67108864;
        zzaosVar.zzG = j10;
    }

    public final boolean zzai() {
        return this.zzaT;
    }

    public final boolean zzaj() {
        if ((this.zzd & 4194304) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzak() {
        if ((this.zzf & 134217728) != 0) {
            return true;
        }
        return false;
    }

    public final int zzal() {
        int zza = zzaob.zza(this.zzaS);
        if (zza == 0) {
            return 3;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i10, Object obj, Object obj2) {
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
                    return new zzanv(zzanuVar);
                }
                return new zzaos();
            }
            zzgru zzgruVar = zzaoy.zza;
            return zzgrq.zzaR(zzb, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001a᠌W\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌@EဉAFဂBGဂ8Hဂ9I᠌CJဂ)Kဈ\u0017L᠌DMဈEN\u001bO᠌FP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^᠌TÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaQ", "zzA", "zzB", "zzaR", "zzaV", "zzaS", zzaoa.zza, "zzC", "zzaT", "zzE", "zzaU", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", zzaop.class, "zzR", "zzS", "zzT", "zzU", "zzW", zzgruVar, "zzX", zzgruVar, "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", zzgruVar, "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", zzaox.zza, "zzas", zzaoz.zza, "zzap", "zzat", zzanw.zza, "zzau", "zzav", "zzal", "zzam", "zzaw", zzgruVar, "zzV", "zzD", "zzax", zzgruVar, "zzay", "zzaz", zzaol.class, "zzaA", zzgruVar, "zzaB", zzany.class, "zzaC", "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", zzaoi.zza, "zzaW", "zzaX", "zzaY"});
        }
        return (byte) 1;
    }

    public final zzapb zzf() {
        zzapb zzapbVar = this.zzaW;
        if (zzapbVar == null) {
            return zzapb.zzd();
        }
        return zzapbVar;
    }

    public final String zzg() {
        return this.zzaR;
    }

    public final String zzh() {
        return this.zzC;
    }
}
