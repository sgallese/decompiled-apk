package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfph extends zzfpy {
    final /* synthetic */ zzfpb zza;
    final /* synthetic */ zzfpp zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfpk zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfph(zzfpk zzfpkVar, TaskCompletionSource taskCompletionSource, zzfpb zzfpbVar, zzfpp zzfppVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzfpkVar;
        this.zza = zzfpbVar;
        this.zzb = zzfppVar;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfpu] */
    @Override // com.google.android.gms.internal.ads.zzfpy
    protected final void zza() {
        zzfpx zzfpxVar;
        String str;
        String str2;
        try {
            ?? zze = this.zzd.zza.zze();
            zzfpb zzfpbVar = this.zza;
            str2 = this.zzd.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfpbVar.zzb());
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", zzfpbVar.zza());
            zze.zze(bundle, new zzfpj(this.zzd, this.zzb));
        } catch (RemoteException e10) {
            zzfpxVar = zzfpk.zzb;
            str = this.zzd.zzd;
            zzfpxVar.zzb(e10, "dismiss overlay display from: %s", str);
            this.zzc.trySetException(new RuntimeException(e10));
        }
    }
}
