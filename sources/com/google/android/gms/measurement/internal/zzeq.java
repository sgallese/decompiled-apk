package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzeq implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzet zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeq(zzet zzetVar, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzetVar;
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        long j10;
        char c11;
        long j11;
        zzfi zzm = this.zzf.zzt.zzm();
        if (zzm.zzy()) {
            zzet zzetVar = this.zzf;
            c10 = zzetVar.zza;
            if (c10 == 0) {
                if (zzetVar.zzt.zzf().zzy()) {
                    zzet zzetVar2 = this.zzf;
                    zzetVar2.zzt.zzay();
                    zzetVar2.zza = 'C';
                } else {
                    zzet zzetVar3 = this.zzf;
                    zzetVar3.zzt.zzay();
                    zzetVar3.zza = 'c';
                }
            }
            zzet zzetVar4 = this.zzf;
            j10 = zzetVar4.zzb;
            if (j10 < 0) {
                zzetVar4.zzt.zzf().zzh();
                zzetVar4.zzb = 76003L;
            }
            char charAt = "01VDIWEA?".charAt(this.zza);
            zzet zzetVar5 = this.zzf;
            c11 = zzetVar5.zza;
            j11 = zzetVar5.zzb;
            String str = "2" + charAt + c11 + j11 + ":" + zzet.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
            if (str.length() > 1024) {
                str = this.zzb.substring(0, UserVerificationMethods.USER_VERIFY_ALL);
            }
            zzfg zzfgVar = zzm.zzb;
            if (zzfgVar != null) {
                zzfgVar.zzb(str, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.zzf.zzr(), "Persisted config not initialized. Not logging error/warn");
    }
}
