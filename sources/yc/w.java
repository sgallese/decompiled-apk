package yc;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import ec.b0;
import ec.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: Strings.kt */
/* loaded from: classes4.dex */
public class w extends v {

    /* compiled from: Strings.kt */
    /* loaded from: classes4.dex */
    public static final class a extends qc.r implements pc.p<CharSequence, Integer, dc.l<? extends Integer, ? extends Integer>> {

        /* renamed from: f */
        final /* synthetic */ char[] f26340f;

        /* renamed from: m */
        final /* synthetic */ boolean f26341m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z10) {
            super(2);
            this.f26340f = cArr;
            this.f26341m = z10;
        }

        public final dc.l<Integer, Integer> a(CharSequence charSequence, int i10) {
            qc.q.i(charSequence, "$this$$receiver");
            int Y = w.Y(charSequence, this.f26340f, i10, this.f26341m);
            if (Y < 0) {
                return null;
            }
            return dc.r.a(Integer.valueOf(Y), 1);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.l<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    /* loaded from: classes4.dex */
    public static final class b extends qc.r implements pc.p<CharSequence, Integer, dc.l<? extends Integer, ? extends Integer>> {

        /* renamed from: f */
        final /* synthetic */ List<String> f26342f;

        /* renamed from: m */
        final /* synthetic */ boolean f26343m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list, boolean z10) {
            super(2);
            this.f26342f = list;
            this.f26343m = z10;
        }

        public final dc.l<Integer, Integer> a(CharSequence charSequence, int i10) {
            qc.q.i(charSequence, "$this$$receiver");
            dc.l P = w.P(charSequence, this.f26342f, i10, this.f26343m, false);
            if (P != null) {
                return dc.r.a(P.c(), Integer.valueOf(((String) P.d()).length()));
            }
            return null;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.l<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    /* loaded from: classes4.dex */
    public static final class c extends qc.r implements pc.l<vc.f, String> {

        /* renamed from: f */
        final /* synthetic */ CharSequence f26344f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f26344f = charSequence;
        }

        @Override // pc.l
        /* renamed from: a */
        public final String invoke(vc.f fVar) {
            qc.q.i(fVar, "it");
            return w.E0(this.f26344f, fVar);
        }
    }

    public static final boolean A0(CharSequence charSequence, char c10, boolean z10) {
        qc.q.i(charSequence, "<this>");
        if (charSequence.length() <= 0 || !yc.c.f(charSequence.charAt(0), c10, z10)) {
            return false;
        }
        return true;
    }

    public static final boolean B0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        boolean F;
        qc.q.i(charSequence, "<this>");
        qc.q.i(charSequence2, "prefix");
        if (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            F = v.F((String) charSequence, (String) charSequence2, false, 2, null);
            return F;
        }
        return m0(charSequence, 0, charSequence2, 0, charSequence2.length(), z10);
    }

    public static /* synthetic */ boolean C0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return A0(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean D0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return B0(charSequence, charSequence2, z10);
    }

    public static final String E0(CharSequence charSequence, vc.f fVar) {
        qc.q.i(charSequence, "<this>");
        qc.q.i(fVar, "range");
        return charSequence.subSequence(fVar.a().intValue(), fVar.f().intValue() + 1).toString();
    }

    public static final String F0(String str, char c10, String str2) {
        int W;
        qc.q.i(str, "<this>");
        qc.q.i(str2, "missingDelimiterValue");
        W = W(str, c10, 0, false, 6, null);
        if (W != -1) {
            String substring = str.substring(W + 1, str.length());
            qc.q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str2;
    }

    public static final String G0(String str, String str2, String str3) {
        int X;
        qc.q.i(str, "<this>");
        qc.q.i(str2, "delimiter");
        qc.q.i(str3, "missingDelimiterValue");
        X = X(str, str2, 0, false, 6, null);
        if (X != -1) {
            String substring = str.substring(X + str2.length(), str.length());
            qc.q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str3;
    }

    public static final boolean H(CharSequence charSequence, char c10, boolean z10) {
        int W;
        qc.q.i(charSequence, "<this>");
        W = W(charSequence, c10, 0, z10, 2, null);
        if (W >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String H0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return F0(str, c10, str2);
    }

    public static final boolean I(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        int X;
        qc.q.i(charSequence, "<this>");
        qc.q.i(charSequence2, TaskSetupFragment.TYPE_OTHER);
        if (charSequence2 instanceof String) {
            X = X(charSequence, (String) charSequence2, 0, z10, 2, null);
            if (X >= 0) {
                return true;
            }
        } else if (V(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String I0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return G0(str, str2, str3);
    }

    public static /* synthetic */ boolean J(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return H(charSequence, c10, z10);
    }

    public static String J0(String str, char c10, String str2) {
        int b02;
        qc.q.i(str, "<this>");
        qc.q.i(str2, "missingDelimiterValue");
        b02 = b0(str, c10, 0, false, 6, null);
        if (b02 != -1) {
            String substring = str.substring(b02 + 1, str.length());
            qc.q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str2;
    }

    public static /* synthetic */ boolean K(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return I(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String K0(String str, char c10, String str2, int i10, Object obj) {
        String J0;
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        J0 = J0(str, c10, str2);
        return J0;
    }

    public static final boolean L(CharSequence charSequence, char c10, boolean z10) {
        int R;
        qc.q.i(charSequence, "<this>");
        if (charSequence.length() > 0) {
            R = R(charSequence);
            if (yc.c.f(charSequence.charAt(R), c10, z10)) {
                return true;
            }
        }
        return false;
    }

    public static final String L0(String str, char c10, String str2) {
        int W;
        qc.q.i(str, "<this>");
        qc.q.i(str2, "missingDelimiterValue");
        W = W(str, c10, 0, false, 6, null);
        if (W != -1) {
            String substring = str.substring(0, W);
            qc.q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str2;
    }

    public static final boolean M(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        boolean q10;
        qc.q.i(charSequence, "<this>");
        qc.q.i(charSequence2, "suffix");
        if (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            q10 = v.q((String) charSequence, (String) charSequence2, false, 2, null);
            return q10;
        }
        return m0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z10);
    }

    public static final String M0(String str, String str2, String str3) {
        int X;
        qc.q.i(str, "<this>");
        qc.q.i(str2, "delimiter");
        qc.q.i(str3, "missingDelimiterValue");
        X = X(str, str2, 0, false, 6, null);
        if (X != -1) {
            String substring = str.substring(0, X);
            qc.q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str3;
    }

    public static /* synthetic */ boolean N(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return L(charSequence, c10, z10);
    }

    public static /* synthetic */ String N0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return L0(str, c10, str2);
    }

    public static /* synthetic */ boolean O(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return M(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String O0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return M0(str, str2, str3);
    }

    public static final dc.l<Integer, String> P(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        int R;
        int h10;
        vc.d p10;
        Object obj;
        Object obj2;
        int d10;
        Object u02;
        if (!z10 && collection.size() == 1) {
            u02 = b0.u0(collection);
            String str = (String) u02;
            int X = !z11 ? X(charSequence, str, i10, false, 4, null) : c0(charSequence, str, i10, false, 4, null);
            if (X < 0) {
                return null;
            }
            return dc.r.a(Integer.valueOf(X), str);
        }
        if (!z11) {
            d10 = vc.l.d(i10, 0);
            p10 = new vc.f(d10, charSequence.length());
        } else {
            R = R(charSequence);
            h10 = vc.l.h(i10, R);
            p10 = vc.l.p(h10, 0);
        }
        if (charSequence instanceof String) {
            int h11 = p10.h();
            int i11 = p10.i();
            int j10 = p10.j();
            if ((j10 > 0 && h11 <= i11) || (j10 < 0 && i11 <= h11)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            String str2 = (String) obj2;
                            if (v.v(str2, 0, (String) charSequence, h11, str2.length(), z10)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 != null) {
                        return dc.r.a(Integer.valueOf(h11), str3);
                    }
                    if (h11 == i11) {
                        break;
                    }
                    h11 += j10;
                }
            }
        } else {
            int h12 = p10.h();
            int i12 = p10.i();
            int j11 = p10.j();
            if ((j11 > 0 && h12 <= i12) || (j11 < 0 && i12 <= h12)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            String str4 = (String) obj;
                            if (m0(str4, 0, charSequence, h12, str4.length(), z10)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 != null) {
                        return dc.r.a(Integer.valueOf(h12), str5);
                    }
                    if (h12 == i12) {
                        break;
                    }
                    h12 += j11;
                }
            }
        }
        return null;
    }

    public static final String P0(String str, char c10, String str2) {
        int b02;
        qc.q.i(str, "<this>");
        qc.q.i(str2, "missingDelimiterValue");
        b02 = b0(str, c10, 0, false, 6, null);
        if (b02 != -1) {
            String substring = str.substring(0, b02);
            qc.q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str2;
    }

    public static vc.f Q(CharSequence charSequence) {
        qc.q.i(charSequence, "<this>");
        return new vc.f(0, charSequence.length() - 1);
    }

    public static final String Q0(String str, String str2, String str3) {
        int c02;
        qc.q.i(str, "<this>");
        qc.q.i(str2, "delimiter");
        qc.q.i(str3, "missingDelimiterValue");
        c02 = c0(str, str2, 0, false, 6, null);
        if (c02 != -1) {
            String substring = str.substring(0, c02);
            qc.q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str3;
    }

    public static int R(CharSequence charSequence) {
        qc.q.i(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static /* synthetic */ String R0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return P0(str, c10, str2);
    }

    public static final int S(CharSequence charSequence, char c10, int i10, boolean z10) {
        qc.q.i(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i10);
        }
        return Y(charSequence, new char[]{c10}, i10, z10);
    }

    public static /* synthetic */ String S0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return Q0(str, str2, str3);
    }

    public static final int T(CharSequence charSequence, String str, int i10, boolean z10) {
        qc.q.i(charSequence, "<this>");
        qc.q.i(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return V(charSequence, str, i10, charSequence.length(), z10, false, 16, null);
    }

    public static CharSequence T0(CharSequence charSequence) {
        int i10;
        qc.q.i(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i11 = 0;
        boolean z10 = false;
        while (i11 <= length) {
            if (!z10) {
                i10 = i11;
            } else {
                i10 = length;
            }
            boolean c10 = yc.b.c(charSequence.charAt(i10));
            if (!z10) {
                if (!c10) {
                    z10 = true;
                } else {
                    i11++;
                }
            } else if (!c10) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i11, length + 1);
    }

    private static final int U(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        int R;
        int h10;
        int d10;
        vc.d p10;
        int d11;
        int h11;
        if (!z11) {
            d11 = vc.l.d(i10, 0);
            h11 = vc.l.h(i11, charSequence.length());
            p10 = new vc.f(d11, h11);
        } else {
            R = R(charSequence);
            h10 = vc.l.h(i10, R);
            d10 = vc.l.d(i11, 0);
            p10 = vc.l.p(h10, d10);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int h12 = p10.h();
            int i12 = p10.i();
            int j10 = p10.j();
            if ((j10 > 0 && h12 <= i12) || (j10 < 0 && i12 <= h12)) {
                while (!v.v((String) charSequence2, 0, (String) charSequence, h12, charSequence2.length(), z10)) {
                    if (h12 != i12) {
                        h12 += j10;
                    } else {
                        return -1;
                    }
                }
                return h12;
            }
            return -1;
        }
        int h13 = p10.h();
        int i13 = p10.i();
        int j11 = p10.j();
        if ((j11 > 0 && h13 <= i13) || (j11 < 0 && i13 <= h13)) {
            while (!m0(charSequence2, 0, charSequence, h13, charSequence2.length(), z10)) {
                if (h13 != i13) {
                    h13 += j11;
                } else {
                    return -1;
                }
            }
            return h13;
        }
        return -1;
    }

    public static String U0(String str, char... cArr) {
        CharSequence charSequence;
        boolean G;
        qc.q.i(str, "<this>");
        qc.q.i(cArr, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                G = ec.p.G(cArr, str.charAt(length));
                if (!G) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                } else if (i10 < 0) {
                    break;
                } else {
                    length = i10;
                }
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    static /* synthetic */ int V(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        boolean z12;
        if ((i12 & 16) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        return U(charSequence, charSequence2, i10, i11, z10, z12);
    }

    public static /* synthetic */ int W(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return S(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int X(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return T(charSequence, str, i10, z10);
    }

    public static final int Y(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        int d10;
        int R;
        boolean z11;
        char W;
        qc.q.i(charSequence, "<this>");
        qc.q.i(cArr, "chars");
        if (z10 || cArr.length != 1 || !(charSequence instanceof String)) {
            d10 = vc.l.d(i10, 0);
            R = R(charSequence);
            h0 it = new vc.f(d10, R).iterator();
            while (it.hasNext()) {
                int a10 = it.a();
                char charAt = charSequence.charAt(a10);
                int length = cArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        if (yc.c.f(cArr[i11], charAt, z10)) {
                            z11 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (z11) {
                    return a10;
                }
            }
            return -1;
        }
        W = ec.p.W(cArr);
        return ((String) charSequence).indexOf(W, i10);
    }

    public static final int Z(CharSequence charSequence, char c10, int i10, boolean z10) {
        qc.q.i(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        return d0(charSequence, new char[]{c10}, i10, z10);
    }

    public static final int a0(CharSequence charSequence, String str, int i10, boolean z10) {
        qc.q.i(charSequence, "<this>");
        qc.q.i(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i10);
        }
        return U(charSequence, str, i10, 0, z10, true);
    }

    public static /* synthetic */ int b0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = R(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return Z(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int c0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = R(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return a0(charSequence, str, i10, z10);
    }

    public static final int d0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        int R;
        int h10;
        char W;
        qc.q.i(charSequence, "<this>");
        qc.q.i(cArr, "chars");
        if (z10 || cArr.length != 1 || !(charSequence instanceof String)) {
            R = R(charSequence);
            for (h10 = vc.l.h(i10, R); -1 < h10; h10--) {
                char charAt = charSequence.charAt(h10);
                int length = cArr.length;
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    } else if (yc.c.f(cArr[i11], charAt, z10)) {
                        z11 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z11) {
                    return h10;
                }
            }
            return -1;
        }
        W = ec.p.W(cArr);
        return ((String) charSequence).lastIndexOf(W, i10);
    }

    public static final xc.g<String> e0(CharSequence charSequence) {
        qc.q.i(charSequence, "<this>");
        return z0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> f0(CharSequence charSequence) {
        List<String> D;
        qc.q.i(charSequence, "<this>");
        D = xc.o.D(e0(charSequence));
        return D;
    }

    public static final CharSequence g0(CharSequence charSequence, int i10, char c10) {
        qc.q.i(charSequence, "<this>");
        if (i10 >= 0) {
            if (i10 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb2 = new StringBuilder(i10);
            h0 it = new vc.f(1, i10 - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.a();
                sb2.append(c10);
            }
            sb2.append(charSequence);
            return sb2;
        }
        throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
    }

    public static String h0(String str, int i10, char c10) {
        qc.q.i(str, "<this>");
        return g0(str, i10, c10).toString();
    }

    private static final xc.g<vc.f> i0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        s0(i11);
        return new e(charSequence, i10, i11, new a(cArr, z10));
    }

    private static final xc.g<vc.f> j0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        List c10;
        s0(i11);
        c10 = ec.o.c(strArr);
        return new e(charSequence, i10, i11, new b(c10, z10));
    }

    static /* synthetic */ xc.g k0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return i0(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ xc.g l0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return j0(charSequence, strArr, i10, z10, i11);
    }

    public static final boolean m0(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        qc.q.i(charSequence, "<this>");
        qc.q.i(charSequence2, TaskSetupFragment.TYPE_OTHER);
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!yc.c.f(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String n0(String str, CharSequence charSequence) {
        boolean D0;
        qc.q.i(str, "<this>");
        qc.q.i(charSequence, "prefix");
        D0 = D0(str, charSequence, false, 2, null);
        if (D0) {
            String substring = str.substring(charSequence.length());
            qc.q.h(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    public static String o0(String str, CharSequence charSequence) {
        boolean O;
        qc.q.i(str, "<this>");
        qc.q.i(charSequence, "suffix");
        O = O(str, charSequence, false, 2, null);
        if (O) {
            String substring = str.substring(0, str.length() - charSequence.length());
            qc.q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static String p0(String str, CharSequence charSequence) {
        qc.q.i(str, "<this>");
        qc.q.i(charSequence, "delimiter");
        return q0(str, charSequence, charSequence);
    }

    public static final String q0(String str, CharSequence charSequence, CharSequence charSequence2) {
        boolean D0;
        boolean O;
        qc.q.i(str, "<this>");
        qc.q.i(charSequence, "prefix");
        qc.q.i(charSequence2, "suffix");
        if (str.length() >= charSequence.length() + charSequence2.length()) {
            D0 = D0(str, charSequence, false, 2, null);
            if (D0) {
                O = O(str, charSequence2, false, 2, null);
                if (O) {
                    String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
                    qc.q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return substring;
                }
                return str;
            }
            return str;
        }
        return str;
    }

    public static CharSequence r0(CharSequence charSequence, int i10, int i11, CharSequence charSequence2) {
        qc.q.i(charSequence, "<this>");
        qc.q.i(charSequence2, "replacement");
        if (i11 >= i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i10);
            qc.q.h(sb2, "this.append(value, startIndex, endIndex)");
            sb2.append(charSequence2);
            sb2.append(charSequence, i11, charSequence.length());
            qc.q.h(sb2, "this.append(value, startIndex, endIndex)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
    }

    public static final void s0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List<String> t0(CharSequence charSequence, char[] cArr, boolean z10, int i10) {
        Iterable h10;
        int s10;
        qc.q.i(charSequence, "<this>");
        qc.q.i(cArr, "delimiters");
        if (cArr.length != 1) {
            h10 = xc.o.h(k0(charSequence, cArr, 0, z10, i10, 2, null));
            s10 = ec.u.s(h10, 10);
            ArrayList arrayList = new ArrayList(s10);
            Iterator it = h10.iterator();
            while (it.hasNext()) {
                arrayList.add(E0(charSequence, (vc.f) it.next()));
            }
            return arrayList;
        }
        return v0(charSequence, String.valueOf(cArr[0]), z10, i10);
    }

    public static final List<String> u0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        Iterable h10;
        int s10;
        qc.q.i(charSequence, "<this>");
        qc.q.i(strArr, "delimiters");
        boolean z11 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z11 = false;
            }
            if (!z11) {
                return v0(charSequence, str, z10, i10);
            }
        }
        h10 = xc.o.h(l0(charSequence, strArr, 0, z10, i10, 2, null));
        s10 = ec.u.s(h10, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator it = h10.iterator();
        while (it.hasNext()) {
            arrayList.add(E0(charSequence, (vc.f) it.next()));
        }
        return arrayList;
    }

    private static final List<String> v0(CharSequence charSequence, String str, boolean z10, int i10) {
        List<String> d10;
        boolean z11;
        s0(i10);
        int i11 = 0;
        int T = T(charSequence, str, 0, z10);
        if (T == -1 || i10 == 1) {
            d10 = ec.s.d(charSequence.toString());
            return d10;
        }
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = 10;
        if (z11) {
            i12 = vc.l.h(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i12);
        do {
            arrayList.add(charSequence.subSequence(i11, T).toString());
            i11 = str.length() + T;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            T = T(charSequence, str, i11, z10);
        } while (T != -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List w0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return t0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List x0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return u0(charSequence, strArr, z10, i10);
    }

    public static final xc.g<String> y0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        xc.g<String> w10;
        qc.q.i(charSequence, "<this>");
        qc.q.i(strArr, "delimiters");
        w10 = xc.o.w(l0(charSequence, strArr, 0, z10, i10, 2, null), new c(charSequence));
        return w10;
    }

    public static /* synthetic */ xc.g z0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return y0(charSequence, strArr, z10, i10);
    }
}
