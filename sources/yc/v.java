package yc;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import ec.h0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import qc.j0;

/* compiled from: StringsJVM.kt */
/* loaded from: classes4.dex */
public class v extends u {
    public static /* synthetic */ String A(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return y(str, c10, c11, z10);
    }

    public static /* synthetic */ String B(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return z(str, str2, str3, z10);
    }

    public static boolean C(String str, String str2, int i10, boolean z10) {
        qc.q.i(str, "<this>");
        qc.q.i(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2, i10);
        }
        return v(str, i10, str2, 0, str2.length(), z10);
    }

    public static boolean D(String str, String str2, boolean z10) {
        qc.q.i(str, "<this>");
        qc.q.i(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2);
        }
        return v(str, 0, str2, 0, str2.length(), z10);
    }

    public static /* synthetic */ boolean E(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        boolean C;
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        C = C(str, str2, i10, z10);
        return C;
    }

    public static /* synthetic */ boolean F(String str, String str2, boolean z10, int i10, Object obj) {
        boolean D;
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        D = D(str, str2, z10);
        return D;
    }

    public static String n(char[] cArr) {
        qc.q.i(cArr, "<this>");
        return new String(cArr);
    }

    public static String o(char[] cArr, int i10, int i11) {
        qc.q.i(cArr, "<this>");
        ec.c.f14163f.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static boolean p(String str, String str2, boolean z10) {
        qc.q.i(str, "<this>");
        qc.q.i(str2, "suffix");
        if (!z10) {
            return str.endsWith(str2);
        }
        return v(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean q(String str, String str2, boolean z10, int i10, Object obj) {
        boolean p10;
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        p10 = p(str, str2, z10);
        return p10;
    }

    public static boolean r(String str, String str2, boolean z10) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z10) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static /* synthetic */ boolean s(String str, String str2, boolean z10, int i10, Object obj) {
        boolean r10;
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        r10 = r(str, str2, z10);
        return r10;
    }

    public static Comparator<String> t(j0 j0Var) {
        qc.q.i(j0Var, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        qc.q.h(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    public static boolean u(CharSequence charSequence) {
        vc.f Q;
        boolean z10;
        qc.q.i(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Q = w.Q(charSequence);
            if (!(Q instanceof Collection) || !((Collection) Q).isEmpty()) {
                Iterator<Integer> it = Q.iterator();
                while (it.hasNext()) {
                    if (!b.c(charSequence.charAt(((h0) it).a()))) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (z10) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean v(String str, int i10, String str2, int i11, int i12, boolean z10) {
        qc.q.i(str, "<this>");
        qc.q.i(str2, TaskSetupFragment.TYPE_OTHER);
        if (!z10) {
            return str.regionMatches(i10, str2, i11, i12);
        }
        return str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static /* synthetic */ boolean w(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        boolean z11;
        if ((i13 & 16) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        return v(str, i10, str2, i11, i12, z11);
    }

    public static String x(CharSequence charSequence, int i10) {
        boolean z10;
        qc.q.i(charSequence, "<this>");
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 == 0) {
                return "";
            }
            if (i10 != 1) {
                int length = charSequence.length();
                if (length == 0) {
                    return "";
                }
                if (length != 1) {
                    StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
                    h0 it = new vc.f(1, i10).iterator();
                    while (it.hasNext()) {
                        it.a();
                        sb2.append(charSequence);
                    }
                    String sb3 = sb2.toString();
                    qc.q.h(sb3, "{\n                    va…tring()\n                }");
                    return sb3;
                }
                char charAt = charSequence.charAt(0);
                char[] cArr = new char[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    cArr[i11] = charAt;
                }
                return new String(cArr);
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
    }

    public static final String y(String str, char c10, char c11, boolean z10) {
        qc.q.i(str, "<this>");
        if (!z10) {
            String replace = str.replace(c10, c11);
            qc.q.h(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (c.f(charAt, c10, z10)) {
                charAt = c11;
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        qc.q.h(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public static final String z(String str, String str2, String str3, boolean z10) {
        int d10;
        qc.q.i(str, "<this>");
        qc.q.i(str2, "oldValue");
        qc.q.i(str3, "newValue");
        int i10 = 0;
        int T = w.T(str, str2, 0, z10);
        if (T < 0) {
            return str;
        }
        int length = str2.length();
        d10 = vc.l.d(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append((CharSequence) str, i10, T);
                sb2.append(str3);
                i10 = T + length;
                if (T >= str.length()) {
                    break;
                }
                T = w.T(str, str2, T + d10, z10);
            } while (T > 0);
            sb2.append((CharSequence) str, i10, str.length());
            String sb3 = sb2.toString();
            qc.q.h(sb3, "stringBuilder.append(this, i, length).toString()");
            return sb3;
        }
        throw new OutOfMemoryError();
    }
}
