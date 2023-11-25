package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfpi extends zzfpy {
    final /* synthetic */ zzfpr zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfpp zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzfpk zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfpi(zzfpk zzfpkVar, TaskCompletionSource taskCompletionSource, zzfpr zzfprVar, int i10, zzfpp zzfppVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zze = zzfpkVar;
        this.zza = zzfprVar;
        this.zzb = i10;
        this.zzc = zzfppVar;
        this.zzd = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfpu] */
    @Override // com.google.android.gms.internal.ads.zzfpy
    protected final void zza() {
        zzfpx zzfpxVar;
        String str;
        String str2;
        try {
            ?? zze = this.zze.zza.zze();
            zzfpr zzfprVar = this.zza;
            str2 = this.zze.zzd;
            int i10 = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfprVar.zzb());
            bundle.putInt("displayMode", i10);
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", zzfprVar.zza());
            zze.zzg(bundle, new zzfpj(this.zze, this.zzc));
        } catch (RemoteException e10) {
            zzfpxVar = zzfpk.zzb;
            str = this.zze.zzd;
            zzfpxVar.zzb(e10, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.zzb), str);
            this.zzd.trySetException(new RuntimeException(e10));
        }
    }
}
