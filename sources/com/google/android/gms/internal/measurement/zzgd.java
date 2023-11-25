package com.google.android.gms.internal.measurement;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzgd extends zzlb implements zzmj {
    public static final /* synthetic */ int zza = 0;
    private static final zzgd zzd;
    private long zzB;
    private int zzC;
    private boolean zzF;
    private int zzI;
    private int zzJ;
    private int zzK;
    private long zzM;
    private long zzN;
    private int zzQ;
    private zzgg zzS;
    private long zzU;
    private long zzV;
    private int zzY;
    private boolean zzZ;
    private boolean zzab;
    private zzfz zzac;
    private long zzag;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzs;
    private long zzw;
    private long zzx;
    private boolean zzz;
    private zzli zzh = zzlb.zzbH();
    private zzli zzi = zzlb.zzbH();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private String zzy = "";
    private String zzA = "";
    private String zzD = "";
    private String zzE = "";
    private zzli zzG = zzlb.zzbH();
    private String zzH = "";
    private String zzL = "";
    private String zzO = "";
    private String zzP = "";
    private String zzR = "";
    private zzlg zzT = zzlb.zzbE();
    private String zzW = "";
    private String zzX = "";
    private String zzaa = "";
    private String zzad = "";
    private zzli zzae = zzlb.zzbH();
    private String zzaf = "";

    static {
        zzgd zzgdVar = new zzgd();
        zzd = zzgdVar;
        zzlb.zzbO(zzgd.class, zzgdVar);
    }

    private zzgd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzQ(zzgd zzgdVar) {
        zzgdVar.zze &= Integer.MAX_VALUE;
        zzgdVar.zzO = zzd.zzO;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzR(zzgd zzgdVar, int i10) {
        zzgdVar.zzf |= 2;
        zzgdVar.zzQ = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzS(zzgd zzgdVar, int i10, zzft zzftVar) {
        zzftVar.getClass();
        zzgdVar.zzbS();
        zzgdVar.zzh.set(i10, zzftVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzT(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zzf |= 4;
        zzgdVar.zzR = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzU(zzgd zzgdVar, zzgg zzggVar) {
        zzggVar.getClass();
        zzgdVar.zzS = zzggVar;
        zzgdVar.zzf |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzV(zzgd zzgdVar, Iterable iterable) {
        int i10;
        zzlg zzlgVar = zzgdVar.zzT;
        if (!zzlgVar.zzc()) {
            int size = zzlgVar.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            zzgdVar.zzT = zzlgVar.zzd(i10);
        }
        zzjk.zzbw(iterable, zzgdVar.zzT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzW(zzgd zzgdVar, zzft zzftVar) {
        zzftVar.getClass();
        zzgdVar.zzbS();
        zzgdVar.zzh.add(zzftVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzX(zzgd zzgdVar, long j10) {
        zzgdVar.zzf |= 16;
        zzgdVar.zzU = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzY(zzgd zzgdVar, long j10) {
        zzgdVar.zzf |= 32;
        zzgdVar.zzV = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzZ(zzgd zzgdVar, String str) {
        zzgdVar.zzf |= 128;
        zzgdVar.zzX = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaA(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= RecyclerView.m.FLAG_MOVED;
        zzgdVar.zzt = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaB(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        zzgdVar.zzu = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaC(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= 8192;
        zzgdVar.zzv = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaD(zzgd zzgdVar, long j10) {
        zzgdVar.zze |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzgdVar.zzw = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaE(zzgd zzgdVar, long j10) {
        zzgdVar.zze |= 32768;
        zzgdVar.zzx = 76003L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaF(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= 65536;
        zzgdVar.zzy = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaG(zzgd zzgdVar) {
        zzgdVar.zze &= -65537;
        zzgdVar.zzy = zzd.zzy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaH(zzgd zzgdVar, boolean z10) {
        zzgdVar.zze |= 131072;
        zzgdVar.zzz = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaI(zzgd zzgdVar) {
        zzgdVar.zze &= -131073;
        zzgdVar.zzz = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaJ(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= 262144;
        zzgdVar.zzA = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaK(zzgd zzgdVar) {
        zzgdVar.zze &= -262145;
        zzgdVar.zzA = zzd.zzA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaL(zzgd zzgdVar, long j10) {
        zzgdVar.zze |= 524288;
        zzgdVar.zzB = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaM(zzgd zzgdVar, int i10) {
        zzgdVar.zze |= 1048576;
        zzgdVar.zzC = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaN(zzgd zzgdVar, String str) {
        zzgdVar.zze |= 2097152;
        zzgdVar.zzD = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaO(zzgd zzgdVar) {
        zzgdVar.zze &= -2097153;
        zzgdVar.zzD = zzd.zzD;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaP(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= 4194304;
        zzgdVar.zzE = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaQ(zzgd zzgdVar, boolean z10) {
        zzgdVar.zze |= 8388608;
        zzgdVar.zzF = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaR(zzgd zzgdVar, Iterable iterable) {
        zzli zzliVar = zzgdVar.zzG;
        if (!zzliVar.zzc()) {
            zzgdVar.zzG = zzlb.zzbI(zzliVar);
        }
        zzjk.zzbw(iterable, zzgdVar.zzG);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaT(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        zzgdVar.zzH = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaU(zzgd zzgdVar, int i10) {
        zzgdVar.zze |= 33554432;
        zzgdVar.zzI = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaV(zzgd zzgdVar, int i10) {
        zzgdVar.zze |= 1;
        zzgdVar.zzg = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaW(zzgd zzgdVar) {
        zzgdVar.zze &= -268435457;
        zzgdVar.zzL = zzd.zzL;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaX(zzgd zzgdVar, long j10) {
        zzgdVar.zze |= 536870912;
        zzgdVar.zzM = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaa(zzgd zzgdVar, Iterable iterable) {
        zzgdVar.zzbS();
        zzjk.zzbw(iterable, zzgdVar.zzh);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzab(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zzf |= 8192;
        zzgdVar.zzad = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzac(zzgd zzgdVar) {
        zzgdVar.zzf &= -8193;
        zzgdVar.zzad = zzd.zzad;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzad(zzgd zzgdVar, Iterable iterable) {
        zzli zzliVar = zzgdVar.zzae;
        if (!zzliVar.zzc()) {
            zzgdVar.zzae = zzlb.zzbI(zzliVar);
        }
        zzjk.zzbw(iterable, zzgdVar.zzae);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaf(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zzf |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzgdVar.zzaf = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzag(zzgd zzgdVar, long j10) {
        zzgdVar.zzf |= 32768;
        zzgdVar.zzag = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzah(zzgd zzgdVar, int i10) {
        zzgdVar.zzbS();
        zzgdVar.zzh.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzai(zzgd zzgdVar, int i10, zzgm zzgmVar) {
        zzgmVar.getClass();
        zzgdVar.zzbT();
        zzgdVar.zzi.set(i10, zzgmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaj(zzgd zzgdVar, zzgm zzgmVar) {
        zzgmVar.getClass();
        zzgdVar.zzbT();
        zzgdVar.zzi.add(zzgmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzak(zzgd zzgdVar, Iterable iterable) {
        zzgdVar.zzbT();
        zzjk.zzbw(iterable, zzgdVar.zzi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzal(zzgd zzgdVar, int i10) {
        zzgdVar.zzbT();
        zzgdVar.zzi.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzam(zzgd zzgdVar, long j10) {
        zzgdVar.zze |= 2;
        zzgdVar.zzj = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzan(zzgd zzgdVar, long j10) {
        zzgdVar.zze |= 4;
        zzgdVar.zzk = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzao(zzgd zzgdVar, long j10) {
        zzgdVar.zze |= 8;
        zzgdVar.zzl = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzap(zzgd zzgdVar, long j10) {
        zzgdVar.zze |= 16;
        zzgdVar.zzm = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaq(zzgd zzgdVar) {
        zzgdVar.zze &= -17;
        zzgdVar.zzm = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzar(zzgd zzgdVar, long j10) {
        zzgdVar.zze |= 32;
        zzgdVar.zzn = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzas(zzgd zzgdVar) {
        zzgdVar.zze &= -33;
        zzgdVar.zzn = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzat(zzgd zzgdVar, String str) {
        zzgdVar.zze |= 64;
        zzgdVar.zzo = "android";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzau(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= 128;
        zzgdVar.zzp = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzav(zzgd zzgdVar) {
        zzgdVar.zze &= -129;
        zzgdVar.zzp = zzd.zzp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaw(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        zzgdVar.zzq = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzax(zzgd zzgdVar) {
        zzgdVar.zze &= -257;
        zzgdVar.zzq = zzd.zzq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzay(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= 512;
        zzgdVar.zzr = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaz(zzgd zzgdVar, int i10) {
        zzgdVar.zze |= UserVerificationMethods.USER_VERIFY_ALL;
        zzgdVar.zzs = i10;
    }

    private final void zzbS() {
        zzli zzliVar = this.zzh;
        if (!zzliVar.zzc()) {
            this.zzh = zzlb.zzbI(zzliVar);
        }
    }

    private final void zzbT() {
        zzli zzliVar = this.zzi;
        if (!zzliVar.zzc()) {
            this.zzi = zzlb.zzbI(zzliVar);
        }
    }

    public static zzgc zzu() {
        return (zzgc) zzd.zzbA();
    }

    public final String zzA() {
        return this.zzt;
    }

    public final String zzB() {
        return this.zzv;
    }

    public final String zzC() {
        return this.zzX;
    }

    public final String zzD() {
        return this.zzq;
    }

    public final String zzE() {
        return this.zzO;
    }

    public final String zzF() {
        return this.zzH;
    }

    public final String zzG() {
        return this.zzE;
    }

    public final String zzH() {
        return this.zzD;
    }

    public final String zzI() {
        return this.zzp;
    }

    public final String zzJ() {
        return this.zzo;
    }

    public final String zzK() {
        return this.zzy;
    }

    public final String zzL() {
        return this.zzad;
    }

    public final String zzM() {
        return this.zzr;
    }

    public final List zzN() {
        return this.zzG;
    }

    public final List zzO() {
        return this.zzh;
    }

    public final List zzP() {
        return this.zzi;
    }

    public final int zza() {
        return this.zzI;
    }

    public final boolean zzaY() {
        return this.zzz;
    }

    public final boolean zzaZ() {
        return this.zzF;
    }

    public final int zzb() {
        return this.zzC;
    }

    public final boolean zzba() {
        if ((this.zze & 33554432) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbb() {
        if ((this.zze & 1048576) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbc() {
        if ((this.zze & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbd() {
        if ((this.zzf & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbe() {
        if ((this.zze & 524288) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbf() {
        if ((this.zzf & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbg() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbh() {
        if ((this.zze & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbi() {
        if ((this.zze & 131072) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbj() {
        if ((this.zze & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbk() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbl() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbm() {
        if ((this.zzf & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbn() {
        if ((this.zze & 8388608) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbo() {
        if ((this.zzf & 8192) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbp() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbq() {
        if ((this.zzf & 32768) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbr() {
        if ((this.zze & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbs() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzbt() {
        if ((this.zze & 32768) != 0) {
            return true;
        }
        return false;
    }

    public final int zzc() {
        return this.zzh.size();
    }

    public final int zzd() {
        return this.zzg;
    }

    public final int zze() {
        return this.zzQ;
    }

    public final int zzf() {
        return this.zzs;
    }

    public final int zzg() {
        return this.zzi.size();
    }

    public final long zzh() {
        return this.zzM;
    }

    public final long zzi() {
        return this.zzB;
    }

    public final long zzj() {
        return this.zzU;
    }

    public final long zzk() {
        return this.zzl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzfk zzfkVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzd;
                    }
                    return new zzgc(zzfkVar);
                }
                return new zzgd();
            }
            return zzlb.zzbL(zzd, "\u00015\u0000\u0002\u0001C5\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/", new Object[]{"zze", "zzf", "zzg", "zzh", zzft.class, "zzi", zzgm.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", zzfp.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", zzfl.zza, "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        }
        return (byte) 1;
    }

    public final long zzm() {
        return this.zzw;
    }

    public final long zzn() {
        return this.zzn;
    }

    public final long zzo() {
        return this.zzm;
    }

    public final long zzp() {
        return this.zzk;
    }

    public final long zzq() {
        return this.zzag;
    }

    public final long zzr() {
        return this.zzj;
    }

    public final long zzs() {
        return this.zzx;
    }

    public final zzft zzt(int i10) {
        return (zzft) this.zzh.get(i10);
    }

    public final zzgm zzw(int i10) {
        return (zzgm) this.zzi.get(i10);
    }

    public final String zzx() {
        return this.zzR;
    }

    public final String zzy() {
        return this.zzu;
    }

    public final String zzz() {
        return this.zzA;
    }
}
