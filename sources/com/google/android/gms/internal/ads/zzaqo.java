package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaqo implements zzfmx {
    final /* synthetic */ zzfkx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqo(zzaqq zzaqqVar, zzfkx zzfkxVar) {
        this.zza = zzfkxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmx
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
