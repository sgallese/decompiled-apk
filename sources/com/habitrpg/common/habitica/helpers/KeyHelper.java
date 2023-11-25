package com.habitrpg.common.habitica.helpers;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.google.android.gms.stats.CodePackage;
import com.habitrpg.shared.habitica.HLogger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.util.Calendar;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import javax.security.cert.CertificateException;
import qc.q;

/* compiled from: KeyHelper.kt */
/* loaded from: classes4.dex */
public final class KeyHelper {
    private static final String AES_MODE_M = "AES/GCM/NoPadding";
    private static final String AndroidKeyStore = "AndroidKeyStore";
    public static final Companion Companion = new Companion(null);
    public static final String ENCRYPTED_KEY = "ENCRYPTED_KEY";
    private static final String KEY_ALIAS = "KEY";
    public static final String PUBLIC_IV = "PUBLIC_IV";
    private static final String RSA_MODE = "RSA/ECB/PKCS1Padding";
    private static KeyHelper keyHelper;
    private KeyStore keyStore;
    private SharedPreferences sharedPreferences;

    /* compiled from: KeyHelper.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        public final KeyHelper getInstance(Context context, SharedPreferences sharedPreferences, KeyStore keyStore) {
            q.i(context, "ctx");
            q.i(sharedPreferences, "sharedPreferences");
            q.i(keyStore, "keyStore");
            if (KeyHelper.keyHelper == null) {
                try {
                    KeyHelper.keyHelper = new KeyHelper(context, sharedPreferences, keyStore);
                } catch (IOException e10) {
                    HLogger.Companion.logException("KeyHelper", "Error initializing", e10);
                } catch (InvalidAlgorithmParameterException e11) {
                    HLogger.Companion.logException("KeyHelper", "Error initializing", e11);
                } catch (KeyStoreException e12) {
                    HLogger.Companion.logException("KeyHelper", "Error initializing", e12);
                } catch (NoSuchAlgorithmException e13) {
                    HLogger.Companion.logException("KeyHelper", "Error initializing", e13);
                } catch (NoSuchProviderException e14) {
                    HLogger.Companion.logException("KeyHelper", "Error initializing", e14);
                } catch (NoSuchPaddingException e15) {
                    HLogger.Companion.logException("KeyHelper", "Error initializing", e15);
                } catch (CertificateException e16) {
                    HLogger.Companion.logException("KeyHelper", "Error initializing", e16);
                }
            }
            return KeyHelper.keyHelper;
        }
    }

    public KeyHelper(Context context, SharedPreferences sharedPreferences, KeyStore keyStore) throws NoSuchPaddingException, NoSuchProviderException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, KeyStoreException, CertificateException, IOException {
        q.i(context, "ctx");
        q.i(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
        this.keyStore = keyStore;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            generateEncryptKey(context);
        }
        if (i10 < 23) {
            try {
                generateAESKey();
            } catch (Exception e10) {
                HLogger.Companion.logException("KeyHelper", "Error initializing", e10);
            }
        }
    }

    private final void generateAESKey() throws Exception {
        if (this.sharedPreferences.getString(ENCRYPTED_KEY, null) == null) {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            String encodeToString = Base64.encodeToString(rsaEncrypt(bArr), 0);
            SharedPreferences.Editor edit = this.sharedPreferences.edit();
            edit.putString(ENCRYPTED_KEY, encodeToString);
            edit.apply();
        }
    }

    private final void generateEncryptKey(Context context) throws NoSuchProviderException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, KeyStoreException, CertificateException, IOException {
        KeyGenParameterSpec.Builder blockModes;
        KeyGenParameterSpec.Builder encryptionPaddings;
        KeyGenParameterSpec.Builder randomizedEncryptionRequired;
        KeyGenParameterSpec build;
        KeyStore keyStore = this.keyStore;
        if (keyStore != null) {
            keyStore.load(null);
        }
        boolean z10 = true;
        boolean z11 = false;
        if (Build.VERSION.SDK_INT >= 23) {
            KeyStore keyStore2 = this.keyStore;
            if (keyStore2 == null || keyStore2.containsAlias(KEY_ALIAS)) {
                z10 = false;
            }
            if (z10) {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", AndroidKeyStore);
                h.a();
                blockModes = g.a(KEY_ALIAS, 3).setBlockModes(CodePackage.GCM);
                encryptionPaddings = blockModes.setEncryptionPaddings("NoPadding");
                randomizedEncryptionRequired = encryptionPaddings.setRandomizedEncryptionRequired(false);
                build = randomizedEncryptionRequired.build();
                keyGenerator.init(build);
                keyGenerator.generateKey();
                return;
            }
            return;
        }
        KeyStore keyStore3 = this.keyStore;
        if (keyStore3 != null && !keyStore3.containsAlias(KEY_ALIAS)) {
            z11 = true;
        }
        if (z11) {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 30);
            KeyPairGeneratorSpec build2 = new KeyPairGeneratorSpec.Builder(context).setAlias(KEY_ALIAS).setSubject(new X500Principal("CN=KEY")).setSerialNumber(BigInteger.TEN).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
            q.h(build2, "build(...)");
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", AndroidKeyStore);
            keyPairGenerator.initialize(build2);
            keyPairGenerator.generateKeyPair();
        }
    }

    private final Key getAesKeyFromKS() throws NoSuchProviderException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, KeyStoreException, CertificateException, IOException, UnrecoverableKeyException {
        Key key;
        KeyStore keyStore = this.keyStore;
        if (keyStore != null) {
            key = keyStore.getKey(KEY_ALIAS, null);
        } else {
            key = null;
        }
        if (!(key instanceof SecretKey)) {
            return null;
        }
        return (SecretKey) key;
    }

    private final String getRandomIV() {
        String string = this.sharedPreferences.getString(PUBLIC_IV, null);
        if (string == null) {
            string = Base64.encodeToString(new SecureRandom().generateSeed(12), 0);
            SharedPreferences.Editor edit = this.sharedPreferences.edit();
            edit.putString(PUBLIC_IV, string);
            edit.apply();
        }
        if (string == null) {
            return "";
        }
        return string;
    }

    private final Key getSecretKey() throws Exception {
        byte[] decode = Base64.decode(this.sharedPreferences.getString(ENCRYPTED_KEY, null), 0);
        q.f(decode);
        return new SecretKeySpec(rsaDecrypt(decode), "AES");
    }

    private final byte[] rsaDecrypt(byte[] bArr) throws Exception {
        KeyStore.Entry entry;
        KeyStore.PrivateKeyEntry privateKeyEntry;
        KeyStore keyStore = this.keyStore;
        PrivateKey privateKey = null;
        if (keyStore != null) {
            entry = keyStore.getEntry(KEY_ALIAS, null);
        } else {
            entry = null;
        }
        if (entry instanceof KeyStore.PrivateKeyEntry) {
            privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
        } else {
            privateKeyEntry = null;
        }
        Cipher cipher = Cipher.getInstance(RSA_MODE, "AndroidOpenSSL");
        if (privateKeyEntry != null) {
            privateKey = privateKeyEntry.getPrivateKey();
        }
        cipher.init(2, privateKey);
        return nc.a.c(new CipherInputStream(new ByteArrayInputStream(bArr), cipher));
    }

    private final byte[] rsaEncrypt(byte[] bArr) throws Exception {
        KeyStore.Entry entry;
        KeyStore.PrivateKeyEntry privateKeyEntry;
        Certificate certificate;
        KeyStore keyStore = this.keyStore;
        PublicKey publicKey = null;
        if (keyStore != null) {
            entry = keyStore.getEntry(KEY_ALIAS, null);
        } else {
            entry = null;
        }
        if (entry instanceof KeyStore.PrivateKeyEntry) {
            privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
        } else {
            privateKeyEntry = null;
        }
        Cipher cipher = Cipher.getInstance(RSA_MODE, "AndroidOpenSSL");
        if (privateKeyEntry != null && (certificate = privateKeyEntry.getCertificate()) != null) {
            publicKey = certificate.getPublicKey();
        }
        cipher.init(1, publicKey);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, cipher);
        cipherOutputStream.write(bArr);
        cipherOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        q.h(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final String decrypt(String str) throws NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException, BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException {
        Cipher cipher;
        q.i(str, "encrypted");
        String randomIV = getRandomIV();
        if (Build.VERSION.SDK_INT >= 23) {
            cipher = Cipher.getInstance(AES_MODE_M);
            q.h(cipher, "getInstance(...)");
            try {
                cipher.init(2, getAesKeyFromKS(), new GCMParameterSpec(128, Base64.decode(randomIV, 0)));
            } catch (Exception e10) {
                HLogger.Companion.logException("KeyHelper", "Error decrypting", e10);
            }
        } else {
            cipher = Cipher.getInstance(AES_MODE_M);
            q.h(cipher, "getInstance(...)");
            try {
                cipher.init(2, getSecretKey(), new GCMParameterSpec(128, Base64.decode(randomIV, 0)));
            } catch (Exception e11) {
                HLogger.Companion.logException("KeyHelper", "Error decrypting", e11);
            }
        }
        try {
            Charset forName = Charset.forName("UTF-8");
            q.h(forName, "forName(charsetName)");
            byte[] bytes = str.getBytes(forName);
            q.h(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] doFinal = cipher.doFinal(Base64.decode(bytes, 0));
            q.f(doFinal);
            return new String(doFinal, yc.d.f26303b);
        } catch (IllegalArgumentException | IllegalStateException | GeneralSecurityException unused) {
            return null;
        }
    }

    public final String encrypt(String str) throws NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException, BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException {
        Cipher cipher;
        q.i(str, "input");
        String randomIV = getRandomIV();
        if (Build.VERSION.SDK_INT >= 23) {
            cipher = Cipher.getInstance(AES_MODE_M);
            q.h(cipher, "getInstance(...)");
            try {
                cipher.init(1, getAesKeyFromKS(), new GCMParameterSpec(128, Base64.decode(randomIV, 0)));
            } catch (Exception e10) {
                HLogger.Companion.logException("KeyHelper", "Error encrypting", e10);
            }
        } else {
            cipher = Cipher.getInstance(AES_MODE_M);
            q.h(cipher, "getInstance(...)");
            try {
                cipher.init(1, getSecretKey(), new GCMParameterSpec(128, Base64.decode(randomIV, 0)));
            } catch (Exception e11) {
                HLogger.Companion.logException("KeyHelper", "Error encrypting", e11);
            }
        }
        Charset forName = Charset.forName("UTF-8");
        q.h(forName, "forName(charsetName)");
        byte[] bytes = str.getBytes(forName);
        q.h(bytes, "this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(cipher.doFinal(bytes), 0);
        q.h(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    public final KeyStore getKeyStore() {
        return this.keyStore;
    }

    public final SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    public final void setKeyStore(KeyStore keyStore) {
        this.keyStore = keyStore;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        q.i(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }
}
