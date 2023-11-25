package com.google.android.gms.wearable;

import android.content.ComponentName;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.internal.zzas;
import com.google.android.gms.wearable.internal.zzbj;
import com.google.android.gms.wearable.internal.zzfn;
import com.google.android.gms.wearable.internal.zzfr;
import com.google.android.gms.wearable.internal.zzgp;
import com.google.android.gms.wearable.internal.zzhf;
import com.google.android.gms.wearable.internal.zzhg;
import com.google.android.gms.wearable.internal.zzjr;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzag extends zzfr {
    final /* synthetic */ WearableListenerService zza;
    private volatile int zzb = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzag(WearableListenerService wearableListenerService, zzaf zzafVar) {
        this.zza = wearableListenerService;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzn(zzfn zzfnVar, Task task) {
        if (task.isSuccessful()) {
            zzp(zzfnVar, true, (byte[]) task.getResult());
            return;
        }
        Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
        zzp(zzfnVar, false, null);
    }

    private final boolean zzo(Runnable runnable, String str, Object obj) {
        Object obj2;
        boolean z10;
        zzs zzsVar;
        ComponentName componentName;
        if (Log.isLoggable("WearableLS", 3)) {
            componentName = this.zza.zza;
            Log.d("WearableLS", String.format("%s: %s %s", str, componentName.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.zzb) {
            if (zzjr.zza(this.zza).zzb() && UidVerifier.uidHasPackageName(this.zza, callingUid, "com.google.android.wearable.app.cn")) {
                this.zzb = callingUid;
            } else if (UidVerifier.isGooglePlayServicesUid(this.zza, callingUid)) {
                this.zzb = callingUid;
            } else {
                Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                return false;
            }
        }
        obj2 = this.zza.zzf;
        synchronized (obj2) {
            WearableListenerService wearableListenerService = this.zza;
            z10 = wearableListenerService.zzg;
            if (!z10) {
                zzsVar = wearableListenerService.zzb;
                zzsVar.post(runnable);
                return true;
            }
            return false;
        }
    }

    private static final void zzp(zzfn zzfnVar, boolean z10, byte[] bArr) {
        try {
            zzfnVar.zzd(z10, bArr);
        } catch (RemoteException e10) {
            Log.e("WearableLS", "Failed to send a response back", e10);
        }
    }

    @Override // com.google.android.gms.wearable.internal.zzfs
    public final void zzb(zzbj zzbjVar) {
        zzo(new zzae(this, zzbjVar), "onChannelEvent", zzbjVar);
    }

    @Override // com.google.android.gms.wearable.internal.zzfs
    public final void zzc(zzas zzasVar) {
        zzo(new zzab(this, zzasVar), "onConnectedCapabilityChanged", zzasVar);
    }

    @Override // com.google.android.gms.wearable.internal.zzfs
    public final void zzd(List list) {
        zzo(new zzaa(this, list), "onConnectedNodes", list);
    }

    @Override // com.google.android.gms.wearable.internal.zzfs
    public final void zze(DataHolder dataHolder) {
        try {
            if (!zzo(new zzw(this, dataHolder), "onDataItemChanged", String.valueOf(dataHolder) + ", rows=" + dataHolder.getCount())) {
            }
        } finally {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.wearable.internal.zzfs
    public final void zzf(com.google.android.gms.wearable.internal.zzk zzkVar) {
        zzo(new zzad(this, zzkVar), "onEntityUpdate", zzkVar);
    }

    @Override // com.google.android.gms.wearable.internal.zzfs
    public final void zzg(zzgp zzgpVar) {
        zzo(new zzx(this, zzgpVar), "onMessageReceived", zzgpVar);
    }

    @Override // com.google.android.gms.wearable.internal.zzfs
    public final void zzh(final zzhf zzhfVar) {
        if (!zzo(new Runnable() { // from class: com.google.android.gms.wearable.zzt
            @Override // java.lang.Runnable
            public final void run() {
                zzag zzagVar = zzag.this;
                zzhf zzhfVar2 = zzhfVar;
                DataItemBuffer dataItemBuffer = new DataItemBuffer(zzhfVar2.zzb);
                try {
                    zzagVar.zza.onNodeMigrated(zzhfVar2.zza, dataItemBuffer);
                    dataItemBuffer.close();
                } catch (Throwable th) {
                    try {
                        dataItemBuffer.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            }
        }, "onNodeMigrated", "DataHolder[rows=" + zzhfVar.zzb.getCount() + "]")) {
            zzhfVar.zzb.close();
        }
    }

    @Override // com.google.android.gms.wearable.internal.zzfs
    public final void zzi(com.google.android.gms.wearable.internal.zzn zznVar) {
        zzo(new zzac(this, zznVar), "onNotificationReceived", zznVar);
    }

    @Override // com.google.android.gms.wearable.internal.zzfs
    public final void zzj(zzhg zzhgVar) {
        zzo(new zzy(this, zzhgVar), "onPeerConnected", zzhgVar);
    }

    @Override // com.google.android.gms.wearable.internal.zzfs
    public final void zzk(zzhg zzhgVar) {
        zzo(new zzz(this, zzhgVar), "onPeerDisconnected", zzhgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzgp zzgpVar, final zzfn zzfnVar) {
        Task<byte[]> onRequest = this.zza.onRequest(zzgpVar.getSourceNodeId(), zzgpVar.getPath(), zzgpVar.getData());
        if (onRequest == null) {
            zzp(zzfnVar, false, null);
        } else {
            onRequest.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.wearable.zzu
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    zzag.zzn(zzfnVar, task);
                }
            });
        }
    }

    @Override // com.google.android.gms.wearable.internal.zzfs
    public final void zzm(final zzgp zzgpVar, final zzfn zzfnVar) {
        zzo(new Runnable() { // from class: com.google.android.gms.wearable.zzv
            @Override // java.lang.Runnable
            public final void run() {
                zzag.this.zzl(zzgpVar, zzfnVar);
            }
        }, "onRequestReceived", zzgpVar);
    }
}
