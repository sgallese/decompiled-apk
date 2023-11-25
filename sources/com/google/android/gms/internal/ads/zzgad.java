package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgad {
    private final zzgnd zza;
    private final List zzb;
    private final zzgjt zzc;

    private zzgad(zzgnd zzgndVar, List list, zzgjt zzgjtVar) {
        this.zza = zzgndVar;
        this.zzb = list;
        this.zzc = zzgjtVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final zzgad zza(zzgnd zzgndVar) throws GeneralSecurityException {
        zzi(zzgndVar);
        return new zzgad(zzgndVar, zzh(zzgndVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final zzgad zzb(zzgnd zzgndVar, zzgjt zzgjtVar) throws GeneralSecurityException {
        zzi(zzgndVar);
        return new zzgad(zzgndVar, zzh(zzgndVar), zzgjtVar);
    }

    public static final zzgad zzc(zzgah zzgahVar) throws GeneralSecurityException {
        zzgaa zzgaaVar = new zzgaa();
        zzfzy zzfzyVar = new zzfzy(zzgahVar, null);
        zzfzyVar.zze();
        zzfzyVar.zzd();
        zzgaaVar.zza(zzfzyVar);
        return zzgaaVar.zzb();
    }

    private static zzghc zzf(zzgnc zzgncVar) {
        Integer valueOf;
        int zza = zzgncVar.zza();
        if (zzgncVar.zzf() == zzgnw.RAW) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(zza);
        }
        try {
            return zzghc.zza(zzgncVar.zzc().zzg(), zzgncVar.zzc().zzf(), zzgncVar.zzc().zzc(), zzgncVar.zzf(), valueOf);
        } catch (GeneralSecurityException e10) {
            throw new zzghp("Creating a protokey serialization failed", e10);
        }
    }

    private static Object zzg(zzgfl zzgflVar, zzgnc zzgncVar, Class cls) throws GeneralSecurityException {
        try {
            zzgmq zzc = zzgncVar.zzc();
            int i10 = zzgar.zza;
            return zzgar.zzc(zzc.zzg(), zzc.zzf(), cls);
        } catch (UnsupportedOperationException unused) {
            return null;
        } catch (GeneralSecurityException e10) {
            if (e10.getMessage().contains("No key manager found for key type ") || e10.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e10;
        }
    }

    private static List zzh(zzgnd zzgndVar) {
        zzfzu zzfzuVar;
        boolean z10;
        ArrayList arrayList = new ArrayList(zzgndVar.zza());
        for (zzgnc zzgncVar : zzgndVar.zzh()) {
            int zza = zzgncVar.zza();
            try {
                zzfzp zza2 = zzggi.zzc().zza(zzf(zzgncVar), zzgas.zza());
                int zzk = zzgncVar.zzk() - 2;
                if (zzk != 1) {
                    if (zzk != 2) {
                        if (zzk == 3) {
                            zzfzuVar = zzfzu.zzc;
                        } else {
                            throw new GeneralSecurityException("Unknown key status");
                            break;
                        }
                    } else {
                        zzfzuVar = zzfzu.zzb;
                    }
                } else {
                    zzfzuVar = zzfzu.zza;
                }
                zzfzu zzfzuVar2 = zzfzuVar;
                if (zza == zzgndVar.zzc()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new zzgac(zza2, zzfzuVar2, zza, z10, null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void zzi(zzgnd zzgndVar) throws GeneralSecurityException {
        if (zzgndVar != null && zzgndVar.zza() > 0) {
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }

    private static final Object zzj(zzgfl zzgflVar, zzfzp zzfzpVar, Class cls) throws GeneralSecurityException {
        try {
            return zzggg.zza().zzc(zzfzpVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public final String toString() {
        zzgnd zzgndVar = this.zza;
        Charset charset = zzgat.zza;
        zzgnf zza = zzgni.zza();
        zza.zzb(zzgndVar.zzc());
        for (zzgnc zzgncVar : zzgndVar.zzh()) {
            zzgng zza2 = zzgnh.zza();
            zza2.zzc(zzgncVar.zzc().zzg());
            zza2.zzd(zzgncVar.zzk());
            zza2.zzb(zzgncVar.zzf());
            zza2.zza(zzgncVar.zza());
            zza.zza((zzgnh) zza2.zzal());
        }
        return ((zzgni) zza.zzal()).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzgnd zzd() {
        return this.zza;
    }

    public final Object zze(zzfzm zzfzmVar, Class cls) throws GeneralSecurityException {
        Object obj;
        boolean z10;
        Class zzb = zzgar.zzb(cls);
        if (zzb != null) {
            zzgnd zzgndVar = this.zza;
            Charset charset = zzgat.zza;
            int zzc = zzgndVar.zzc();
            int i10 = 0;
            boolean z11 = false;
            boolean z12 = true;
            for (zzgnc zzgncVar : zzgndVar.zzh()) {
                if (zzgncVar.zzk() == 3) {
                    if (zzgncVar.zzj()) {
                        if (zzgncVar.zzf() != zzgnw.UNKNOWN_PREFIX) {
                            if (zzgncVar.zzk() != 2) {
                                if (zzgncVar.zza() == zzc) {
                                    if (!z11) {
                                        z11 = true;
                                    } else {
                                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                                    }
                                }
                                if (zzgncVar.zzc().zzc() != zzgmp.ASYMMETRIC_PUBLIC) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                z12 &= z10;
                                i10++;
                            } else {
                                throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgncVar.zza())));
                            }
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgncVar.zza())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgncVar.zza())));
                    }
                }
            }
            if (i10 != 0) {
                if (!z11 && !z12) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                zzgaj zzgajVar = new zzgaj(zzb, null);
                zzgajVar.zzc(this.zzc);
                for (int i11 = 0; i11 < this.zza.zza(); i11++) {
                    zzgnc zze = this.zza.zze(i11);
                    if (zze.zzk() == 3) {
                        zzgfl zzgflVar = (zzgfl) zzfzmVar;
                        Object zzg = zzg(zzgflVar, zze, zzb);
                        if (this.zzb.get(i11) != null) {
                            obj = zzj(zzgflVar, ((zzgac) this.zzb.get(i11)).zza(), zzb);
                        } else {
                            obj = null;
                        }
                        if (obj == null && zzg == null) {
                            throw new GeneralSecurityException("Unable to get primitive " + zzb.toString() + " for key of type " + zze.zzc().zzg());
                        } else if (zze.zza() == this.zza.zzc()) {
                            zzgajVar.zzb(obj, zzg, zze);
                        } else {
                            zzgajVar.zza(obj, zzg, zze);
                        }
                    }
                }
                return zzggg.zza().zzd(zzgajVar.zzd(), cls);
            }
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    private zzgad(zzgnd zzgndVar, List list) {
        this.zza = zzgndVar;
        this.zzb = list;
        this.zzc = zzgjt.zza;
    }
}
