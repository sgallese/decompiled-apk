package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzkw implements zzev {
    final /* synthetic */ String zza;
    final /* synthetic */ zzlf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkw(zzlf zzlfVar, String str) {
        this.zzb = zzlfVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzev
    public final void zza(String str, int i10, Throwable th, byte[] bArr, Map map) {
        this.zzb.zzK(i10, th, bArr, this.zza);
    }
}
