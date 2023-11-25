package yc;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CharJVM.kt */
/* loaded from: classes4.dex */
public class b {
    public static int a(int i10) {
        if (new vc.f(2, 36).m(i10)) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new vc.f(2, 36));
    }

    public static final int b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    public static final boolean c(char c10) {
        if (!Character.isWhitespace(c10) && !Character.isSpaceChar(c10)) {
            return false;
        }
        return true;
    }

    public static String d(char c10, Locale locale) {
        qc.q.i(locale, "locale");
        String e10 = e(c10, locale);
        if (e10.length() > 1) {
            if (c10 != 329) {
                char charAt = e10.charAt(0);
                qc.q.g(e10, "null cannot be cast to non-null type java.lang.String");
                String substring = e10.substring(1);
                qc.q.h(substring, "this as java.lang.String).substring(startIndex)");
                qc.q.g(substring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = substring.toLowerCase(Locale.ROOT);
                qc.q.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return charAt + lowerCase;
            }
            return e10;
        }
        String valueOf = String.valueOf(c10);
        qc.q.g(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        qc.q.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (!qc.q.d(e10, upperCase)) {
            return e10;
        }
        return String.valueOf(Character.toTitleCase(c10));
    }

    public static final String e(char c10, Locale locale) {
        qc.q.i(locale, "locale");
        String valueOf = String.valueOf(c10);
        qc.q.g(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        qc.q.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
