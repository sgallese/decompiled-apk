package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgaj {
    private final Class zza;
    private zzgak zzd;
    private ConcurrentMap zzb = new ConcurrentHashMap();
    private final List zzc = new ArrayList();
    private zzgjt zze = zzgjt.zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgaj(Class cls, zzgai zzgaiVar) {
        this.zza = cls;
    }

    private final zzgaj zze(Object obj, Object obj2, zzgnc zzgncVar, boolean z10) throws GeneralSecurityException {
        byte[] array;
        if (this.zzb != null) {
            if (obj == null && obj2 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (zzgncVar.zzk() == 3) {
                Integer valueOf = Integer.valueOf(zzgncVar.zza());
                zzgal zzgalVar = null;
                if (zzgncVar.zzf() == zzgnw.RAW) {
                    valueOf = null;
                }
                zzfzp zza = zzggi.zzc().zza(zzghc.zza(zzgncVar.zzc().zzg(), zzgncVar.zzc().zzf(), zzgncVar.zzc().zzc(), zzgncVar.zzf(), valueOf), zzgas.zza());
                int ordinal = zzgncVar.zzf().ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                        } else {
                            array = zzfzn.zza;
                        }
                    }
                    array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgncVar.zza()).array();
                } else {
                    array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgncVar.zza()).array();
                }
                zzgak zzgakVar = new zzgak(obj, obj2, array, zzgncVar.zzk(), zzgncVar.zzf(), zzgncVar.zza(), zzgncVar.zzc().zzg(), zza);
                ConcurrentMap concurrentMap = this.zzb;
                List list = this.zzc;
                ArrayList arrayList = new ArrayList();
                arrayList.add(zzgakVar);
                zzgam zzgamVar = new zzgam(zzgakVar.zzg(), zzgalVar);
                List list2 = (List) concurrentMap.put(zzgamVar, Collections.unmodifiableList(arrayList));
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list2);
                    arrayList2.add(zzgakVar);
                    concurrentMap.put(zzgamVar, Collections.unmodifiableList(arrayList2));
                }
                list.add(zzgakVar);
                if (z10) {
                    if (this.zzd == null) {
                        this.zzd = zzgakVar;
                    } else {
                        throw new IllegalStateException("you cannot set two primary primitives");
                    }
                }
                return this;
            }
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        throw new IllegalStateException("addPrimitive cannot be called after build");
    }

    public final zzgaj zza(Object obj, Object obj2, zzgnc zzgncVar) throws GeneralSecurityException {
        zze(obj, obj2, zzgncVar, false);
        return this;
    }

    public final zzgaj zzb(Object obj, Object obj2, zzgnc zzgncVar) throws GeneralSecurityException {
        zze(obj, obj2, zzgncVar, true);
        return this;
    }

    public final zzgaj zzc(zzgjt zzgjtVar) {
        if (this.zzb != null) {
            this.zze = zzgjtVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzgao zzd() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.zzb;
        if (concurrentMap != null) {
            zzgao zzgaoVar = new zzgao(concurrentMap, this.zzc, this.zzd, this.zze, this.zza, null);
            this.zzb = null;
            return zzgaoVar;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
