package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzail implements zzajz {
    private final List zza;

    public zzail(int i10, List list) {
        this.zza = list;
    }

    private final zzajp zzb(zzajy zzajyVar) {
        return new zzajp(zzd(zzajyVar));
    }

    private final zzakd zzc(zzajy zzajyVar) {
        return new zzakd(zzd(zzajyVar));
    }

    private final List zzd(zzajy zzajyVar) {
        boolean z10;
        String str;
        int i10;
        List list;
        byte[] bArr;
        zzfb zzfbVar = new zzfb(zzajyVar.zzd);
        List list2 = this.zza;
        while (zzfbVar.zza() > 0) {
            int zzl = zzfbVar.zzl();
            int zzc = zzfbVar.zzc() + zzfbVar.zzl();
            if (zzl == 134) {
                list2 = new ArrayList();
                int zzl2 = zzfbVar.zzl() & 31;
                for (int i11 = 0; i11 < zzl2; i11++) {
                    String zzy = zzfbVar.zzy(3, zzfqu.zzc);
                    int zzl3 = zzfbVar.zzl();
                    if ((zzl3 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = zzl3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte zzl4 = (byte) zzfbVar.zzl();
                    zzfbVar.zzH(1);
                    if (z10) {
                        int i12 = zzl4 & 64;
                        int i13 = zzea.zza;
                        if (i12 != 0) {
                            bArr = new byte[]{1};
                        } else {
                            bArr = new byte[]{0};
                        }
                        list = Collections.singletonList(bArr);
                    } else {
                        list = null;
                    }
                    zzak zzakVar = new zzak();
                    zzakVar.zzS(str);
                    zzakVar.zzK(zzy);
                    zzakVar.zzu(i10);
                    zzakVar.zzI(list);
                    list2.add(zzakVar.zzY());
                }
            }
            zzfbVar.zzG(zzc);
        }
        return list2;
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final zzakb zza(int i10, zzajy zzajyVar) {
        if (i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 27) {
                        if (i10 != 36) {
                            if (i10 != 89) {
                                if (i10 != 138) {
                                    if (i10 != 172) {
                                        if (i10 != 257) {
                                            if (i10 != 128) {
                                                if (i10 != 129) {
                                                    if (i10 != 134) {
                                                        if (i10 != 135) {
                                                            switch (i10) {
                                                                case 15:
                                                                    return new zzajf(new zzaik(false, zzajyVar.zzb));
                                                                case 16:
                                                                    return new zzajf(new zzait(zzc(zzajyVar)));
                                                                case 17:
                                                                    return new zzajf(new zzajb(zzajyVar.zzb));
                                                                default:
                                                                    return null;
                                                            }
                                                        }
                                                    } else {
                                                        return new zzajo(new zzaje("application/x-scte35"));
                                                    }
                                                }
                                                return new zzajf(new zzaie(zzajyVar.zzb));
                                            }
                                        } else {
                                            return new zzajo(new zzaje("application/vnd.dvb.ait"));
                                        }
                                    } else {
                                        return new zzajf(new zzaih(zzajyVar.zzb));
                                    }
                                } else {
                                    return new zzajf(new zzaim(zzajyVar.zzb));
                                }
                            } else {
                                return new zzajf(new zzain(zzajyVar.zzc));
                            }
                        } else {
                            return new zzajf(new zzaiz(zzb(zzajyVar)));
                        }
                    } else {
                        return new zzajf(new zzaix(zzb(zzajyVar), false, false));
                    }
                } else {
                    return new zzajf(new zzaja());
                }
            } else {
                return new zzajf(new zzajc(zzajyVar.zzb));
            }
        }
        return new zzajf(new zzaiq(zzc(zzajyVar)));
    }

    public zzail() {
        this(0);
    }

    public zzail(int i10) {
        this.zza = zzfud.zzl();
    }
}
