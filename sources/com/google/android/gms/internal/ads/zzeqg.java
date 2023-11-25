package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeqg implements zzesj {
    private final zzfyo zza;
    private final zzfca zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzeqg(zzfyo zzfyoVar, zzfca zzfcaVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfyoVar;
        this.zzb = zzfcaVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzeqh zzc(final zzeqg zzeqgVar) {
        final ArrayList arrayList = zzeqgVar.zzb.zzg;
        if (arrayList == null) {
            return new zzeqh() { // from class: com.google.android.gms.internal.ads.zzeqc
                @Override // com.google.android.gms.internal.ads.zzesi
                public final void zzj(Object obj) {
                    Bundle bundle = (Bundle) obj;
                }
            };
        }
        if (arrayList.isEmpty()) {
            return new zzeqh() { // from class: com.google.android.gms.internal.ads.zzeqd
                @Override // com.google.android.gms.internal.ads.zzesi
                public final void zzj(Object obj) {
                    ((Bundle) obj).putInt("native_version", 0);
                }
            };
        }
        return new zzeqh() { // from class: com.google.android.gms.internal.ads.zzeqe
            @Override // com.google.android.gms.internal.ads.zzesi
            public final void zzj(Object obj) {
                zzeqg.this.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqg.zzc(zzeqg.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fc, code lost:
    
        if (r9 == 3) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void zzd(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeqg.zzd(java.util.ArrayList, android.os.Bundle):void");
    }
}
