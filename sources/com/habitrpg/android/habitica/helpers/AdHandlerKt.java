package com.habitrpg.android.habitica.helpers;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import qc.q;

/* compiled from: AdHandler.kt */
/* loaded from: classes4.dex */
public final class AdHandlerKt {
    public static final String md5(String str) {
        q.i(str, "<this>");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(yc.d.f26303b);
            q.h(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] digest = messageDigest.digest(bytes);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b10 : digest) {
                String hexString = Integer.toHexString((b10 & 255) | UserVerificationMethods.USER_VERIFY_HANDPRINT);
                q.h(hexString, "toHexString(...)");
                String substring = hexString.substring(1, 3);
                q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                stringBuffer.append(substring);
            }
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
