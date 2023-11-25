package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgqr implements zzgtl {
    private final zzgqq zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgqr(zzgqq zzgqqVar) {
        byte[] bArr = zzgsa.zzd;
        this.zza = zzgqqVar;
        zzgqqVar.zzc = this;
    }

    private final void zzP(Object obj, zzgtt zzgttVar, zzgrc zzgrcVar) throws IOException {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzgttVar.zzh(obj, this, zzgrcVar);
            if (this.zzb == this.zzc) {
                return;
            }
            throw zzgsc.zzg();
        } finally {
            this.zzc = i10;
        }
    }

    private final void zzQ(Object obj, zzgtt zzgttVar, zzgrc zzgrcVar) throws IOException {
        int zzn = this.zza.zzn();
        zzgqq zzgqqVar = this.zza;
        if (zzgqqVar.zza < zzgqqVar.zzb) {
            int zze = zzgqqVar.zze(zzn);
            this.zza.zza++;
            zzgttVar.zzh(obj, this, zzgrcVar);
            this.zza.zzz(0);
            r5.zza--;
            this.zza.zzA(zze);
            return;
        }
        throw new zzgsc("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzR(int i10) throws IOException {
        if (this.zza.zzd() == i10) {
            return;
        }
        throw zzgsc.zzj();
    }

    private final void zzS(int i10) throws IOException {
        if ((this.zzb & 7) == i10) {
            return;
        }
        throw zzgsc.zza();
    }

    private static final void zzT(int i10) throws IOException {
        if ((i10 & 3) == 0) {
            return;
        }
        throw zzgsc.zzg();
    }

    private static final void zzU(int i10) throws IOException {
        if ((i10 & 7) == 0) {
            return;
        }
        throw zzgsc.zzg();
    }

    public static zzgqr zzq(zzgqq zzgqqVar) {
        zzgqr zzgqrVar = zzgqqVar.zzc;
        if (zzgqrVar != null) {
            return zzgqrVar;
        }
        return new zzgqr(zzgqqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zzA(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgsp) {
            zzgsp zzgspVar = (zzgsp) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int zzn = this.zza.zzn();
                    zzU(zzn);
                    int zzd = this.zza.zzd() + zzn;
                    do {
                        zzgspVar.zzg(this.zza.zzo());
                    } while (this.zza.zzd() < zzd);
                    return;
                }
                throw zzgsc.zza();
            }
            do {
                zzgspVar.zzg(this.zza.zzo());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            throw zzgsc.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzo()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zzB(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgrj) {
            zzgrj zzgrjVar = (zzgrj) list;
            int i10 = this.zzb & 7;
            if (i10 != 2) {
                if (i10 != 5) {
                    throw zzgsc.zza();
                }
                do {
                    zzgrjVar.zze(this.zza.zzc());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            }
            int zzn = this.zza.zzn();
            zzT(zzn);
            int zzd = this.zza.zzd() + zzn;
            do {
                zzgrjVar.zze(this.zza.zzc());
            } while (this.zza.zzd() < zzd);
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 2) {
            if (i11 != 5) {
                throw zzgsc.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        int zzn2 = this.zza.zzn();
        zzT(zzn2);
        int zzd2 = this.zza.zzd() + zzn2;
        do {
            list.add(Float.valueOf(this.zza.zzc()));
        } while (this.zza.zzd() < zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    @Deprecated
    public final void zzC(List list, zzgtt zzgttVar, zzgrc zzgrcVar) throws IOException {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw zzgsc.zza();
        }
        do {
            Object zze = zzgttVar.zze();
            zzP(zze, zzgttVar, zzgrcVar);
            zzgttVar.zzf(zze);
            list.add(zze);
            if (!this.zza.zzC() && this.zzd == 0) {
                zzm = this.zza.zzm();
            } else {
                return;
            }
        } while (zzm == i10);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zzD(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgrr) {
            zzgrr zzgrrVar = (zzgrr) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzgrrVar.zzh(this.zza.zzh());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgsc.zza();
            }
            do {
                zzgrrVar.zzh(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzgsc.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzh()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zzE(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgsp) {
            zzgsp zzgspVar = (zzgsp) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzgspVar.zzg(this.zza.zzp());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgsc.zza();
            }
            do {
                zzgspVar.zzg(this.zza.zzp());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzgsc.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzp()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zzF(List list, zzgtt zzgttVar, zzgrc zzgrcVar) throws IOException {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw zzgsc.zza();
        }
        do {
            Object zze = zzgttVar.zze();
            zzQ(zze, zzgttVar, zzgrcVar);
            zzgttVar.zzf(zze);
            list.add(zze);
            if (!this.zza.zzC() && this.zzd == 0) {
                zzm = this.zza.zzm();
            } else {
                return;
            }
        } while (zzm == i10);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zzG(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgrr) {
            zzgrr zzgrrVar = (zzgrr) list;
            int i10 = this.zzb & 7;
            if (i10 != 2) {
                if (i10 != 5) {
                    throw zzgsc.zza();
                }
                do {
                    zzgrrVar.zzh(this.zza.zzk());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            }
            int zzn = this.zza.zzn();
            zzT(zzn);
            int zzd = this.zza.zzd() + zzn;
            do {
                zzgrrVar.zzh(this.zza.zzk());
            } while (this.zza.zzd() < zzd);
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 2) {
            if (i11 != 5) {
                throw zzgsc.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        int zzn2 = this.zza.zzn();
        zzT(zzn2);
        int zzd2 = this.zza.zzd() + zzn2;
        do {
            list.add(Integer.valueOf(this.zza.zzk()));
        } while (this.zza.zzd() < zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zzH(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgsp) {
            zzgsp zzgspVar = (zzgsp) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int zzn = this.zza.zzn();
                    zzU(zzn);
                    int zzd = this.zza.zzd() + zzn;
                    do {
                        zzgspVar.zzg(this.zza.zzt());
                    } while (this.zza.zzd() < zzd);
                    return;
                }
                throw zzgsc.zza();
            }
            do {
                zzgspVar.zzg(this.zza.zzt());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            throw zzgsc.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzt()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zzI(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgrr) {
            zzgrr zzgrrVar = (zzgrr) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzgrrVar.zzh(this.zza.zzl());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgsc.zza();
            }
            do {
                zzgrrVar.zzh(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzgsc.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzl()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zzJ(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgsp) {
            zzgsp zzgspVar = (zzgsp) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzgspVar.zzg(this.zza.zzu());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgsc.zza();
            }
            do {
                zzgspVar.zzg(this.zza.zzu());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzgsc.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzu()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    public final void zzK(List list, boolean z10) throws IOException {
        String zzr;
        int zzm;
        int zzm2;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzgsi) && !z10) {
                zzgsi zzgsiVar = (zzgsi) list;
                do {
                    zzgsiVar.zzi(zzp());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            }
            do {
                if (z10) {
                    zzr = zzs();
                } else {
                    zzr = zzr();
                }
                list.add(zzr);
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        throw zzgsc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zzL(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgrr) {
            zzgrr zzgrrVar = (zzgrr) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzgrrVar.zzh(this.zza.zzn());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgsc.zza();
            }
            do {
                zzgrrVar.zzh(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzgsc.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzn()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zzM(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgsp) {
            zzgsp zzgspVar = (zzgsp) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzgspVar.zzg(this.zza.zzv());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgsc.zza();
            }
            do {
                zzgspVar.zzg(this.zza.zzv());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzgsc.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzv()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final boolean zzN() throws IOException {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final boolean zzO() throws IOException {
        int i10;
        if (!this.zza.zzC() && (i10 = this.zzb) != this.zzc) {
            return this.zza.zzE(i10);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final double zza() throws IOException {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final float zzb() throws IOException {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final int zzc() throws IOException {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            i10 = this.zza.zzm();
            this.zzb = i10;
        }
        if (i10 != 0 && i10 != this.zzc) {
            return i10 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final int zze() throws IOException {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final int zzf() throws IOException {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final int zzg() throws IOException {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final int zzh() throws IOException {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final int zzi() throws IOException {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final int zzj() throws IOException {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final long zzk() throws IOException {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final long zzl() throws IOException {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final long zzm() throws IOException {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final long zzn() throws IOException {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final long zzo() throws IOException {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final zzgqi zzp() throws IOException {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final String zzr() throws IOException {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final String zzs() throws IOException {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zzt(Object obj, zzgtt zzgttVar, zzgrc zzgrcVar) throws IOException {
        zzS(3);
        zzP(obj, zzgttVar, zzgrcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zzu(Object obj, zzgtt zzgttVar, zzgrc zzgrcVar) throws IOException {
        zzS(2);
        zzQ(obj, zzgttVar, zzgrcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zzv(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgpw) {
            zzgpw zzgpwVar = (zzgpw) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzgpwVar.zze(this.zza.zzD());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgsc.zza();
            }
            do {
                zzgpwVar.zze(this.zza.zzD());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzgsc.zza();
        }
        do {
            list.add(Boolean.valueOf(this.zza.zzD()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zzw(List list) throws IOException {
        int zzm;
        if ((this.zzb & 7) != 2) {
            throw zzgsc.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zzx(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgqz) {
            zzgqz zzgqzVar = (zzgqz) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int zzn = this.zza.zzn();
                    zzU(zzn);
                    int zzd = this.zza.zzd() + zzn;
                    do {
                        zzgqzVar.zze(this.zza.zzb());
                    } while (this.zza.zzd() < zzd);
                    return;
                }
                throw zzgsc.zza();
            }
            do {
                zzgqzVar.zze(this.zza.zzb());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            throw zzgsc.zza();
        }
        do {
            list.add(Double.valueOf(this.zza.zzb()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zzy(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgrr) {
            zzgrr zzgrrVar = (zzgrr) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzd = this.zza.zzd() + this.zza.zzn();
                    do {
                        zzgrrVar.zzh(this.zza.zzf());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzgsc.zza();
            }
            do {
                zzgrrVar.zzh(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            throw zzgsc.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzf()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zzz(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgrr) {
            zzgrr zzgrrVar = (zzgrr) list;
            int i10 = this.zzb & 7;
            if (i10 != 2) {
                if (i10 != 5) {
                    throw zzgsc.zza();
                }
                do {
                    zzgrrVar.zzh(this.zza.zzg());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            }
            int zzn = this.zza.zzn();
            zzT(zzn);
            int zzd = this.zza.zzd() + zzn;
            do {
                zzgrrVar.zzh(this.zza.zzg());
            } while (this.zza.zzd() < zzd);
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 2) {
            if (i11 != 5) {
                throw zzgsc.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        int zzn2 = this.zza.zzn();
        zzT(zzn2);
        int zzd2 = this.zza.zzd() + zzn2;
        do {
            list.add(Integer.valueOf(this.zza.zzg()));
        } while (this.zza.zzd() < zzd2);
    }
}
