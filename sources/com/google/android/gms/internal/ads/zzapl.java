package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzapl implements Runnable {
    private zzapl() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzapl(zzapk zzapkVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzapm.zzc(MessageDigest.getInstance("MD5"));
            countDownLatch = zzapm.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzapm.zzb;
        } catch (Throwable th) {
            zzapm.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
