package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzrl {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzeb zzg;
    private boolean zzh;

    public zzrl(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzeb zzebVar = new zzeb(zzdz.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzebVar;
        this.zzf = new AtomicReference();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.ads.zzrl r9, android.os.Message r10) {
        /*
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L43
            r2 = 1
            if (r0 == r2) goto L22
            r2 = 2
            if (r0 == r2) goto L1c
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            com.google.android.gms.internal.ads.zzri.zza(r9, r1, r0)
            goto L5d
        L1c:
            com.google.android.gms.internal.ads.zzeb r9 = r9.zzg
            r9.zze()
            goto L5d
        L22:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.zzrk r10 = (com.google.android.gms.internal.ads.zzrk) r10
            int r3 = r10.zza
            android.media.MediaCodec$CryptoInfo r5 = r10.zzd
            long r6 = r10.zze
            int r8 = r10.zzf
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzrl.zzb     // Catch: java.lang.RuntimeException -> L3c
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L3c
            android.media.MediaCodec r2 = r9.zzc     // Catch: java.lang.Throwable -> L39
            r4 = 0
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            goto L5c
        L39:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r2     // Catch: java.lang.RuntimeException -> L3c
        L3c:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            com.google.android.gms.internal.ads.zzri.zza(r9, r1, r0)
            goto L5c
        L43:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.zzrk r10 = (com.google.android.gms.internal.ads.zzrk) r10
            int r3 = r10.zza
            int r5 = r10.zzc
            long r6 = r10.zze
            int r8 = r10.zzf
            android.media.MediaCodec r2 = r9.zzc     // Catch: java.lang.RuntimeException -> L56
            r4 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.RuntimeException -> L56
            goto L5c
        L56:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            com.google.android.gms.internal.ads.zzri.zza(r9, r1, r0)
        L5c:
            r1 = r10
        L5d:
            if (r1 == 0) goto L6a
            java.util.ArrayDeque r9 = com.google.android.gms.internal.ads.zzrl.zza
            monitor-enter(r9)
            r9.add(r1)     // Catch: java.lang.Throwable -> L67
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L67
            return
        L67:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L67
            throw r10
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrl.zza(com.google.android.gms.internal.ads.zzrl, android.os.Message):void");
    }

    private static zzrk zzh() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzrk();
            }
            return (zzrk) arrayDeque.removeFirst();
        }
    }

    private static byte[] zzi(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= (length = bArr.length)) {
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    private static int[] zzj(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= (length = iArr.length)) {
            System.arraycopy(iArr, 0, iArr2, 0, length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    public final void zzd(int i10, int i11, int i12, long j10, int i13) {
        zzc();
        zzrk zzh = zzh();
        zzh.zza(i10, 0, i12, j10, i13);
        Handler handler = this.zze;
        int i14 = zzfk.zza;
        handler.obtainMessage(0, zzh).sendToTarget();
    }

    public final void zze(int i10, int i11, zzhq zzhqVar, long j10, int i12) {
        zzc();
        zzrk zzh = zzh();
        zzh.zza(i10, 0, 0, j10, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzh.zzd;
        cryptoInfo.numSubSamples = zzhqVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzhqVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzhqVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzi = zzi(zzhqVar.zzb, cryptoInfo.key);
        zzi.getClass();
        cryptoInfo.key = zzi;
        byte[] zzi2 = zzi(zzhqVar.zza, cryptoInfo.iv);
        zzi2.getClass();
        cryptoInfo.iv = zzi2;
        cryptoInfo.mode = zzhqVar.zzc;
        if (zzfk.zza >= 24) {
            z2.a();
            cryptoInfo.setPattern(c0.a(zzhqVar.zzg, zzhqVar.zzh));
        }
        this.zze.obtainMessage(1, zzh).sendToTarget();
    }

    public final void zzf() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    public final void zzg() {
        if (!this.zzh) {
            this.zzd.start();
            this.zze = new zzrj(this, this.zzd.getLooper());
            this.zzh = true;
        }
    }
}
