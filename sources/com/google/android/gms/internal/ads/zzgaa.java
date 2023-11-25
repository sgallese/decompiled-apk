package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgaa {
    private final List zza = new ArrayList();
    private final zzgjt zzb = zzgjt.zza;
    private boolean zzc = false;

    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzfzy) it.next()).zza = false;
        }
    }

    public final zzgaa zza(zzfzy zzfzyVar) {
        zzgaa zzgaaVar;
        boolean z10;
        zzgaaVar = zzfzyVar.zzf;
        if (zzgaaVar == null) {
            z10 = zzfzyVar.zza;
            if (z10) {
                zzd();
            }
            zzfzyVar.zzf = this;
            this.zza.add(zzfzyVar);
            return this;
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }

    public final zzgad zzb() throws GeneralSecurityException {
        zzfzz zzfzzVar;
        zzfzz zzfzzVar2;
        zzfzz zzfzzVar3;
        int i10;
        zzgah zzgahVar;
        zzghh zzd;
        boolean z10;
        zzfzz zzfzzVar4;
        zzfzz zzfzzVar5;
        zzfzz zzfzzVar6;
        zzfzz zzfzzVar7;
        zzfzu unused;
        zzfzz unused2;
        if (!this.zzc) {
            this.zzc = true;
            zzgna zzd2 = zzgnd.zzd();
            List list = this.zza;
            for (int i11 = 0; i11 < list.size() - 1; i11++) {
                zzfzzVar4 = ((zzfzy) list.get(i11)).zze;
                zzfzzVar5 = zzfzz.zza;
                if (zzfzzVar4 == zzfzzVar5) {
                    zzfzzVar6 = ((zzfzy) list.get(i11 + 1)).zze;
                    zzfzzVar7 = zzfzz.zza;
                    if (zzfzzVar6 != zzfzzVar7) {
                        throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                    }
                }
            }
            HashSet hashSet = new HashSet();
            Integer num = null;
            for (zzfzy zzfzyVar : this.zza) {
                unused = zzfzyVar.zzb;
                zzfzzVar = zzfzyVar.zze;
                if (zzfzzVar != null) {
                    zzfzzVar2 = zzfzyVar.zze;
                    zzfzzVar3 = zzfzz.zza;
                    int i12 = 3;
                    if (zzfzzVar2 != zzfzzVar3) {
                        unused2 = zzfzyVar.zze;
                        i10 = 0;
                    } else {
                        i10 = 0;
                        while (true) {
                            if (i10 != 0 && !hashSet.contains(Integer.valueOf(i10))) {
                                break;
                            }
                            SecureRandom secureRandom = new SecureRandom();
                            byte[] bArr = new byte[4];
                            int i13 = 0;
                            while (i13 == 0) {
                                secureRandom.nextBytes(bArr);
                                i13 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                            }
                            i10 = i13;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i10);
                    if (!hashSet.contains(valueOf)) {
                        hashSet.add(valueOf);
                        zzfzy.zza(zzfzyVar);
                        zzgahVar = zzfzyVar.zzd;
                        zzfzu zzc = zzfzyVar.zzc();
                        if (!zzfzu.zza.equals(zzc)) {
                            if (zzfzu.zzb.equals(zzc)) {
                                i12 = 4;
                            } else if (zzfzu.zzc.equals(zzc)) {
                                i12 = 5;
                            } else {
                                throw new IllegalStateException("Unknown key status");
                            }
                        }
                        if (zzgahVar instanceof zzgfz) {
                            zzd = ((zzgfz) zzgahVar).zza();
                        } else {
                            zzd = zzggi.zzc().zzd(zzgahVar, zzghd.class);
                        }
                        zzghd zzghdVar = (zzghd) zzd;
                        zzgmq zza = zzgar.zza(zzghdVar.zzc());
                        zzgnb zzd3 = zzgnc.zzd();
                        zzd3.zzb(i10);
                        zzd3.zzd(i12);
                        zzd3.zza(zza);
                        zzd3.zzc(zzghdVar.zzc().zzf());
                        zzd2.zza((zzgnc) zzd3.zzal());
                        z10 = zzfzyVar.zza;
                        if (z10) {
                            if (num == null) {
                                num = valueOf;
                            } else {
                                throw new GeneralSecurityException("Two primaries were set");
                            }
                        }
                    } else {
                        throw new GeneralSecurityException("Id " + i10 + " is used twice in the keyset");
                    }
                } else {
                    throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                }
            }
            if (num != null) {
                zzd2.zzb(num.intValue());
                return zzgad.zzb((zzgnd) zzd2.zzal(), this.zzb);
            }
            throw new GeneralSecurityException("No primary was set");
        }
        throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
    }
}
