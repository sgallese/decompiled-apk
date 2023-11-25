package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzerk implements zzesj {
    final String zza;
    private final zzfyo zzb;
    private final ScheduledExecutorService zzc;
    private final zzejt zzd;
    private final Context zze;
    private final zzfca zzf;
    private final zzejp zzg;
    private final zzdpc zzh;
    private final zzdtl zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzerk(zzfyo zzfyoVar, ScheduledExecutorService scheduledExecutorService, String str, zzejt zzejtVar, Context context, zzfca zzfcaVar, zzejp zzejpVar, zzdpc zzdpcVar, zzdtl zzdtlVar) {
        this.zzb = zzfyoVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzejtVar;
        this.zze = context;
        this.zzf = zzfcaVar;
        this.zzg = zzejpVar;
        this.zzh = zzdpcVar;
        this.zzi = zzdtlVar;
    }

    public static /* synthetic */ com.google.common.util.concurrent.a zzc(zzerk zzerkVar) {
        String str;
        final Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjO)).booleanValue()) {
            str = zzerkVar.zzf.zzf.toLowerCase(Locale.ROOT);
        } else {
            str = zzerkVar.zzf.zzf;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbA)).booleanValue()) {
            bundle = zzerkVar.zzi.zzg();
        } else {
            bundle = new Bundle();
        }
        final ArrayList arrayList = new ArrayList();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbJ)).booleanValue()) {
            for (Map.Entry entry : ((zzfug) zzerkVar.zzd.zzb(zzerkVar.zza, str)).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzerkVar.zzg(str2, (List) entry.getValue(), zzerkVar.zzf(str2), true, true));
            }
            zzerkVar.zzi(arrayList, zzerkVar.zzd.zzc());
        } else {
            zzerkVar.zzi(arrayList, zzerkVar.zzd.zza(zzerkVar.zza, str));
        }
        return zzfye.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzerj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<com.google.common.util.concurrent.a> list = arrayList;
                Bundle bundle2 = bundle;
                JSONArray jSONArray = new JSONArray();
                for (com.google.common.util.concurrent.a aVar : list) {
                    if (((JSONObject) aVar.get()) != null) {
                        jSONArray.put(aVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzerl(jSONArray.toString(), bundle2);
            }
        }, zzerkVar.zzb);
    }

    private final Bundle zzf(String str) {
        Bundle bundle = this.zzf.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzfxv zzg(final String str, final List list, final Bundle bundle, final boolean z10, final boolean z11) {
        zzfxv zzu = zzfxv.zzu(zzfye.zzk(new zzfxk() { // from class: com.google.android.gms.internal.ads.zzerh
            @Override // com.google.android.gms.internal.ads.zzfxk
            public final com.google.common.util.concurrent.a zza() {
                return zzerk.this.zzd(str, list, bundle, z10, z11);
            }
        }, this.zzb));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbw)).booleanValue()) {
            zzu = (zzfxv) zzfye.zzo(zzu, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbp)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzfxv) zzfye.zze(zzu, Throwable.class, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzeri
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzcaa.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.zzb);
    }

    private final void zzh(zzbqc zzbqcVar, Bundle bundle, List list, zzejw zzejwVar) throws RemoteException {
        zzbqcVar.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzejwVar);
    }

    private final void zzi(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzejx zzejxVar = (zzejx) ((Map.Entry) it.next()).getValue();
            String str = zzejxVar.zza;
            list.add(zzg(str, Collections.singletonList(zzejxVar.zze), zzf(str), zzejxVar.zzb, zzejxVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        zzfca zzfcaVar = this.zzf;
        if (zzfcaVar.zzq) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbC)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzfcaVar.zzd)))) {
                return zzfye.zzh(new zzerl(new JSONArray().toString(), new Bundle()));
            }
        }
        return zzfye.zzk(new zzfxk() { // from class: com.google.android.gms.internal.ads.zzere
            @Override // com.google.android.gms.internal.ads.zzfxk
            public final com.google.common.util.concurrent.a zza() {
                return zzerk.zzc(zzerk.this);
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(3:5|(2:7|(1:9)(1:12))(3:13|(1:15)|(2:17|(1:19)(1:20))(1:21))|10))|22|23|(0)(0)|10) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        com.google.android.gms.internal.ads.zzcaa.zzh("Couldn't create RTB adapter : ", r13);
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.common.util.concurrent.a zzd(java.lang.String r9, final java.util.List r10, final android.os.Bundle r11, boolean r12, boolean r13) throws java.lang.Exception {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzcas r7 = new com.google.android.gms.internal.ads.zzcas
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L26
            com.google.android.gms.internal.ads.zzbbj r13 = com.google.android.gms.internal.ads.zzbbr.zzbB
            com.google.android.gms.internal.ads.zzbbp r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r13 = r1.zzb(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L26
            com.google.android.gms.internal.ads.zzejp r13 = r8.zzg
            r13.zzb(r9)
            com.google.android.gms.internal.ads.zzejp r13 = r8.zzg
            com.google.android.gms.internal.ads.zzbqc r13 = r13.zza(r9)
            goto L34
        L26:
            com.google.android.gms.internal.ads.zzdpc r13 = r8.zzh     // Catch: android.os.RemoteException -> L2d
            com.google.android.gms.internal.ads.zzbqc r13 = r13.zzb(r9)     // Catch: android.os.RemoteException -> L2d
            goto L34
        L2d:
            r13 = move-exception
            java.lang.String r1 = "Couldn't create RTB adapter : "
            com.google.android.gms.internal.ads.zzcaa.zzh(r1, r13)
            r13 = r0
        L34:
            if (r13 != 0) goto L4e
            com.google.android.gms.internal.ads.zzbbj r10 = com.google.android.gms.internal.ads.zzbbr.zzbr
            com.google.android.gms.internal.ads.zzbbp r11 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r10 = r11.zzb(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4d
            com.google.android.gms.internal.ads.zzejw.zzb(r9, r7)
            goto Lba
        L4d:
            throw r0
        L4e:
            com.google.android.gms.internal.ads.zzejw r6 = new com.google.android.gms.internal.ads.zzejw
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzt.zzB()
            long r4 = r0.elapsedRealtime()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbbj r9 = com.google.android.gms.internal.ads.zzbbr.zzbw
            com.google.android.gms.internal.ads.zzbbp r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r9 = r0.zzb(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8d
            java.util.concurrent.ScheduledExecutorService r9 = r8.zzc
            com.google.android.gms.internal.ads.zzerf r0 = new com.google.android.gms.internal.ads.zzerf
            r0.<init>()
            com.google.android.gms.internal.ads.zzbbj r1 = com.google.android.gms.internal.ads.zzbbr.zzbp
            com.google.android.gms.internal.ads.zzbbp r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r0, r1, r3)
        L8d:
            if (r12 == 0) goto Lb7
            com.google.android.gms.internal.ads.zzbbj r9 = com.google.android.gms.internal.ads.zzbbr.zzbD
            com.google.android.gms.internal.ads.zzbbp r12 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r9 = r12.zzb(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb3
            com.google.android.gms.internal.ads.zzfyo r9 = r8.zzb
            com.google.android.gms.internal.ads.zzerg r12 = new com.google.android.gms.internal.ads.zzerg
            r0 = r12
            r1 = r8
            r2 = r13
            r3 = r11
            r4 = r10
            r5 = r6
            r6 = r7
            r0.<init>()
            r9.zza(r12)
            goto Lba
        Lb3:
            r8.zzh(r13, r11, r10, r6)
            goto Lba
        Lb7:
            r6.zzd()
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzerk.zzd(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):com.google.common.util.concurrent.a");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzbqc zzbqcVar, Bundle bundle, List list, zzejw zzejwVar, zzcas zzcasVar) {
        try {
            zzh(zzbqcVar, bundle, list, zzejwVar);
        } catch (RemoteException e10) {
            zzcasVar.zzd(e10);
        }
    }
}
