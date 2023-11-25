package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzard {
    private static Cipher zza;
    private static final Object zzb = new Object();
    private static final Object zzc = new Object();

    public zzard(SecureRandom secureRandom) {
    }

    private static final Cipher zzc() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (zzc) {
            if (zza == null) {
                zza = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = zza;
        }
        return cipher;
    }

    public final String zza(byte[] bArr, byte[] bArr2) throws zzarc {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzb) {
                zzc().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = zzc().doFinal(bArr2);
                iv = zzc().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return zzapi.zza(bArr3, false);
        } catch (InvalidKeyException e10) {
            throw new zzarc(this, e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new zzarc(this, e11);
        } catch (BadPaddingException e12) {
            throw new zzarc(this, e12);
        } catch (IllegalBlockSizeException e13) {
            throw new zzarc(this, e13);
        } catch (NoSuchPaddingException e14) {
            throw new zzarc(this, e14);
        }
    }

    public final byte[] zzb(byte[] bArr, String str) throws zzarc {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] zzb2 = zzapi.zzb(str, false);
            int length2 = zzb2.length;
            if (length2 > 16) {
                ByteBuffer allocate = ByteBuffer.allocate(length2);
                allocate.put(zzb2);
                allocate.flip();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[length2 - 16];
                allocate.get(bArr2);
                allocate.get(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (zzb) {
                    zzc().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    doFinal = zzc().doFinal(bArr3);
                }
                return doFinal;
            }
            throw new zzarc(this);
        } catch (IllegalArgumentException e10) {
            throw new zzarc(this, e10);
        } catch (InvalidAlgorithmParameterException e11) {
            throw new zzarc(this, e11);
        } catch (InvalidKeyException e12) {
            throw new zzarc(this, e12);
        } catch (NoSuchAlgorithmException e13) {
            throw new zzarc(this, e13);
        } catch (BadPaddingException e14) {
            throw new zzarc(this, e14);
        } catch (IllegalBlockSizeException e15) {
            throw new zzarc(this, e15);
        } catch (NoSuchPaddingException e16) {
            throw new zzarc(this, e16);
        }
    }
}
