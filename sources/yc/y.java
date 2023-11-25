package yc;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Strings.kt */
/* loaded from: classes4.dex */
public class y extends x {
    public static String V0(String str, int i10) {
        boolean z10;
        int h10;
        qc.q.i(str, "<this>");
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            h10 = vc.l.h(i10, str.length());
            String substring = str.substring(h10);
            qc.q.h(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static String W0(String str, int i10) {
        boolean z10;
        int d10;
        String Z0;
        qc.q.i(str, "<this>");
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            d10 = vc.l.d(str.length() - i10, 0);
            Z0 = Z0(str, d10);
            return Z0;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char X0(CharSequence charSequence) {
        boolean z10;
        qc.q.i(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char Y0(CharSequence charSequence) {
        boolean z10;
        int R;
        qc.q.i(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            R = w.R(charSequence);
            return charSequence.charAt(R);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String Z0(String str, int i10) {
        boolean z10;
        int h10;
        qc.q.i(str, "<this>");
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            h10 = vc.l.h(i10, str.length());
            String substring = str.substring(0, h10);
            qc.q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
