package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgau {
    @Deprecated
    static final zzgnz zza;
    @Deprecated
    static final zzgnz zzb;
    @Deprecated
    static final zzgnz zzc;

    static {
        new zzgbg();
        new zzgcs();
        new zzgdj();
        new zzgcb();
        new zzgeh();
        new zzgel();
        new zzgdx();
        new zzgep();
        zzgnz zzc2 = zzgnz.zzc();
        zza = zzc2;
        zzb = zzc2;
        zzc = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzgaz.zze();
        zzgjd.zza();
        zzgar.zze(new zzgbg(), true);
        int i10 = zzgbr.zza;
        zzgbr.zzc(zzggi.zzc());
        zzgar.zze(new zzgcs(), true);
        int i11 = zzgdc.zza;
        zzgdc.zzc(zzggi.zzc());
        if (zzgfk.zzb()) {
            return;
        }
        zzgar.zze(new zzgcb(), true);
        int i12 = zzgcl.zza;
        zzgcl.zzc(zzggi.zzc());
        zzgdj.zzg(true);
        zzgar.zze(new zzgdx(), true);
        int i13 = zzgee.zza;
        zzgee.zzc(zzggi.zzc());
        zzgar.zze(new zzgeh(), true);
        zzgar.zze(new zzgel(), true);
        zzgar.zze(new zzgep(), true);
        int i14 = zzgew.zza;
        zzgew.zzc(zzggi.zzc());
    }
}
