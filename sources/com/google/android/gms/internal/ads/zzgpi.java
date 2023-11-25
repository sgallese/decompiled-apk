package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgpi extends ThreadLocal {
    final /* synthetic */ zzgpj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgpi(zzgpj zzgpjVar) {
        this.zza = zzgpjVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzgow zzgowVar = zzgow.zzb;
            str = this.zza.zzb;
            Mac mac = (Mac) zzgowVar.zza(str);
            key = this.zza.zzc;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
