package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzapm {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static String zza(byte[] bArr, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] zzg;
        Vector zzb2 = zzb(bArr, 255);
        if (zzb2 != null && !zzb2.isEmpty()) {
            zzape zza2 = zzapf.zza();
            int size = zzb2.size();
            for (int i10 = 0; i10 < size; i10++) {
                zza2.zza(zzgqi.zzv(zzg((byte[]) zzb2.get(i10), str, false), 0, UserVerificationMethods.USER_VERIFY_HANDPRINT));
            }
            byte[] zze2 = zze(bArr);
            zzgqi zzgqiVar = zzgqi.zzb;
            zza2.zzb(zzgqi.zzv(zze2, 0, zze2.length));
            zzg = ((zzapf) zza2.zzal()).zzax();
        } else {
            zzg = zzg(zzf(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT).zzax(), str, true);
        }
        return zzapi.zza(zzg, true);
    }

    static Vector zzb(byte[] bArr, int i10) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i11 = length + 254;
        Vector vector = new Vector();
        for (int i12 = 0; i12 < i11 / 255; i12++) {
            int i13 = i12 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i13 > 255) {
                    length2 = i13 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i13, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zzd() {
        synchronized (zzf) {
            if (!zza) {
                zza = true;
                new Thread(new zzapl(null)).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x001e, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.zzapm.zzd.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] zze(byte[] r6) throws java.security.NoSuchAlgorithmException {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzapm.zze
            monitor-enter(r0)
            zzd()     // Catch: java.lang.Throwable -> L34
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.google.android.gms.internal.ads.zzapm.zzb     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            r4 = 2
            boolean r2 = r2.await(r4, r3)     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            if (r2 != 0) goto L14
            goto L1c
        L14:
            java.security.MessageDigest r2 = com.google.android.gms.internal.ads.zzapm.zzd     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L19
            goto L1c
        L19:
            r1 = r2
            goto L1c
        L1b:
        L1c:
            if (r1 == 0) goto L2c
            r1.reset()     // Catch: java.lang.Throwable -> L34
            r1.update(r6)     // Catch: java.lang.Throwable -> L34
            java.security.MessageDigest r6 = com.google.android.gms.internal.ads.zzapm.zzd     // Catch: java.lang.Throwable -> L34
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return r6
        L2c:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L34
            throw r6     // Catch: java.lang.Throwable -> L34
        L34:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapm.zze(byte[]):byte[]");
    }

    static zzaos zzf(int i10) {
        zzanv zza2 = zzaos.zza();
        zza2.zzD(4096L);
        return (zzaos) zza2.zzal();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z10) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        int i10;
        byte[] array;
        int length = bArr.length;
        if (true != z10) {
            i10 = 255;
        } else {
            i10 = 239;
        }
        if (length > i10) {
            bArr = zzf(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT).zzax();
        }
        int length2 = bArr.length;
        if (length2 < i10) {
            byte[] bArr2 = new byte[i10 - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i10 + 1).put((byte) length2).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i10 + 1).put((byte) length2).put(bArr).array();
        }
        if (z10) {
            array = ByteBuffer.allocate(UserVerificationMethods.USER_VERIFY_HANDPRINT).put(zze(array)).put(array).array();
        }
        byte[] bArr3 = new byte[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        zzapn[] zzapnVarArr = new zzaqm().zzcG;
        int length3 = zzapnVarArr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            zzapnVarArr[i11].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzapg(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
