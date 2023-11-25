package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzevu implements zzgyt {
    public static zzesm zza(Context context, zzbyx zzbyxVar, zzbyy zzbyyVar, Object obj, zzetk zzetkVar, zzeva zzevaVar, zzgyn zzgynVar, zzgyn zzgynVar2, zzgyn zzgynVar3, zzgyn zzgynVar4, zzgyn zzgynVar5, zzgyn zzgynVar6, zzgyn zzgynVar7, zzgyn zzgynVar8, zzgyn zzgynVar9, Executor executor, zzfhr zzfhrVar, zzdrh zzdrhVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzeut) obj);
        hashSet.add(zzetkVar);
        hashSet.add(zzevaVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfC)).booleanValue()) {
            hashSet.add((zzesj) zzgynVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfD)).booleanValue()) {
            hashSet.add((zzesj) zzgynVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfE)).booleanValue()) {
            hashSet.add((zzesj) zzgynVar3.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfF)).booleanValue()) {
            hashSet.add((zzesj) zzgynVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfJ)).booleanValue()) {
            hashSet.add((zzesj) zzgynVar6.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfK)).booleanValue()) {
            hashSet.add((zzesj) zzgynVar7.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcE)).booleanValue()) {
            hashSet.add((zzesj) zzgynVar9.zzb());
        }
        return new zzesm(context, executor, hashSet, zzfhrVar, zzdrhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
