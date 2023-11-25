package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgow {
    public static final zzgow zza = new zzgow(new zzgox());
    public static final zzgow zzb = new zzgow(new zzgpb());
    public static final zzgow zzc = new zzgow(new zzgpd());
    public static final zzgow zzd = new zzgow(new zzgpc());
    public static final zzgow zze = new zzgow(new zzgoy());
    public static final zzgow zzf = new zzgow(new zzgpa());
    public static final zzgow zzg = new zzgow(new zzgoz());
    private final zzgov zzh;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.zzgor, com.google.android.gms.internal.ads.zzgop, com.google.android.gms.internal.ads.zzgot] */
    public zzgow(zzgpe zzgpeVar) {
        ?? r12 = 0;
        if (zzgfk.zzb()) {
            this.zzh = new zzgou(zzgpeVar, r12);
        } else if (zzgpl.zza()) {
            this.zzh = new zzgoq(zzgpeVar, r12);
        } else {
            this.zzh = new zzgos(zzgpeVar, r12);
        }
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzh.zza(str);
    }
}
