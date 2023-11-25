package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgji implements zzgap {
    private static final Logger zza = Logger.getLogger(zzgji.class.getName());
    private static final byte[] zzb = {0};
    private static final zzgji zzc = new zzgji();

    zzgji() {
    }

    public static void zze() throws GeneralSecurityException {
        zzgar.zzf(zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final Class zza() {
        return zzgag.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final Class zzb() {
        return zzgag.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ Object zzc(zzgao zzgaoVar) throws GeneralSecurityException {
        Iterator it = zzgaoVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzgak zzgakVar : (List) it.next()) {
                if (zzgakVar.zzb() instanceof zzgje) {
                    zzgje zzgjeVar = (zzgje) zzgakVar.zzb();
                    zzgpo zzb2 = zzgpo.zzb(zzgakVar.zzg());
                    if (!zzb2.equals(zzgjeVar.zzc())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + String.valueOf(zzgjeVar.zzb()) + " has wrong output prefix (" + zzgjeVar.zzc().toString() + ") instead of (" + zzb2.toString() + ")");
                    }
                }
            }
        }
        return new zzgjh(zzgaoVar, null);
    }
}
