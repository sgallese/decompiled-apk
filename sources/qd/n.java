package qd;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import td.v;
import td.x;

/* compiled from: InlineParserImpl.java */
/* loaded from: classes4.dex */
public class n implements ud.a {

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f21747i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f21748j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f21749k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f21750l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f21751m = Pattern.compile("`+");

    /* renamed from: n  reason: collision with root package name */
    private static final Pattern f21752n = Pattern.compile("^`+");

    /* renamed from: o  reason: collision with root package name */
    private static final Pattern f21753o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    /* renamed from: p  reason: collision with root package name */
    private static final Pattern f21754p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f21755q = Pattern.compile("^ *(?:\n *)?");

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f21756r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    /* renamed from: s  reason: collision with root package name */
    private static final Pattern f21757s = Pattern.compile("\\s+");

    /* renamed from: t  reason: collision with root package name */
    private static final Pattern f21758t = Pattern.compile(" *$");

    /* renamed from: a  reason: collision with root package name */
    private final BitSet f21759a;

    /* renamed from: b  reason: collision with root package name */
    private final BitSet f21760b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Character, wd.a> f21761c;

    /* renamed from: d  reason: collision with root package name */
    private final ud.b f21762d;

    /* renamed from: e  reason: collision with root package name */
    private String f21763e;

    /* renamed from: f  reason: collision with root package name */
    private int f21764f;

    /* renamed from: g  reason: collision with root package name */
    private f f21765g;

    /* renamed from: h  reason: collision with root package name */
    private e f21766h;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InlineParserImpl.java */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final int f21767a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f21768b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f21769c;

        a(int i10, boolean z10, boolean z11) {
            this.f21767a = i10;
            this.f21769c = z10;
            this.f21768b = z11;
        }
    }

    public n(ud.b bVar) {
        Map<Character, wd.a> f10 = f(bVar.b());
        this.f21761c = f10;
        BitSet e10 = e(f10.keySet());
        this.f21760b = e10;
        this.f21759a = g(e10);
        this.f21762d = bVar;
    }

    private td.s A() {
        int i10 = this.f21764f;
        int length = this.f21763e.length();
        while (true) {
            int i11 = this.f21764f;
            if (i11 == length || this.f21759a.get(this.f21763e.charAt(i11))) {
                break;
            }
            this.f21764f++;
        }
        int i12 = this.f21764f;
        if (i10 != i12) {
            return M(this.f21763e, i10, i12);
        }
        return null;
    }

    private char B() {
        if (this.f21764f < this.f21763e.length()) {
            return this.f21763e.charAt(this.f21764f);
        }
        return (char) 0;
    }

    private void C(f fVar) {
        boolean z10;
        HashMap hashMap = new HashMap();
        f fVar2 = this.f21765g;
        while (fVar2 != null) {
            f fVar3 = fVar2.f21710e;
            if (fVar3 == fVar) {
                break;
            }
            fVar2 = fVar3;
        }
        while (fVar2 != null) {
            char c10 = fVar2.f21707b;
            wd.a aVar = this.f21761c.get(Character.valueOf(c10));
            if (fVar2.f21709d && aVar != null) {
                char e10 = aVar.e();
                f fVar4 = fVar2.f21710e;
                int i10 = 0;
                boolean z11 = false;
                while (fVar4 != null && fVar4 != fVar && fVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (fVar4.f21708c && fVar4.f21707b == e10) {
                        i10 = aVar.c(fVar4, fVar2);
                        z11 = true;
                        if (i10 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    fVar4 = fVar4.f21710e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), fVar2.f21710e);
                        if (!fVar2.f21708c) {
                            F(fVar2);
                        }
                    }
                    fVar2 = fVar2.f21711f;
                } else {
                    x xVar = fVar4.f21706a;
                    x xVar2 = fVar2.f21706a;
                    fVar4.f21712g -= i10;
                    fVar2.f21712g -= i10;
                    xVar.n(xVar.m().substring(0, xVar.m().length() - i10));
                    xVar2.n(xVar2.m().substring(0, xVar2.m().length() - i10));
                    G(fVar4, fVar2);
                    k(xVar, xVar2);
                    aVar.a(xVar, xVar2, i10);
                    if (fVar4.f21712g == 0) {
                        E(fVar4);
                    }
                    if (fVar2.f21712g == 0) {
                        f fVar5 = fVar2.f21711f;
                        E(fVar2);
                        fVar2 = fVar5;
                    }
                }
            } else {
                fVar2 = fVar2.f21711f;
            }
        }
        while (true) {
            f fVar6 = this.f21765g;
            if (fVar6 != null && fVar6 != fVar) {
                F(fVar6);
            } else {
                return;
            }
        }
    }

    private void D(f fVar) {
        f fVar2 = fVar.f21710e;
        if (fVar2 != null) {
            fVar2.f21711f = fVar.f21711f;
        }
        f fVar3 = fVar.f21711f;
        if (fVar3 == null) {
            this.f21765g = fVar2;
        } else {
            fVar3.f21710e = fVar2;
        }
    }

    private void E(f fVar) {
        fVar.f21706a.l();
        D(fVar);
    }

    private void F(f fVar) {
        D(fVar);
    }

    private void G(f fVar, f fVar2) {
        f fVar3 = fVar2.f21710e;
        while (fVar3 != null && fVar3 != fVar) {
            f fVar4 = fVar3.f21710e;
            F(fVar3);
            fVar3 = fVar4;
        }
    }

    private void H() {
        this.f21766h = this.f21766h.f21702d;
    }

    private a J(wd.a aVar, char c10) {
        String substring;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10 = this.f21764f;
        boolean z14 = false;
        int i11 = 0;
        while (B() == c10) {
            i11++;
            this.f21764f++;
        }
        if (i11 < aVar.d()) {
            this.f21764f = i10;
            return null;
        }
        String str = "\n";
        if (i10 == 0) {
            substring = "\n";
        } else {
            substring = this.f21763e.substring(i10 - 1, i10);
        }
        char B = B();
        if (B != 0) {
            str = String.valueOf(B);
        }
        Pattern pattern = f21747i;
        boolean matches = pattern.matcher(substring).matches();
        Pattern pattern2 = f21756r;
        boolean matches2 = pattern2.matcher(substring).matches();
        boolean matches3 = pattern.matcher(str).matches();
        boolean matches4 = pattern2.matcher(str).matches();
        if (!matches4 && (!matches3 || matches2 || matches)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!matches2 && (!matches || matches4 || matches3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c10 == '_') {
            if (z10 && (!z11 || matches)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z11 && (!z10 || matches3)) {
                z14 = true;
            }
        } else {
            if (z10 && c10 == aVar.e()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 && c10 == aVar.b()) {
                z14 = true;
            }
            z13 = z12;
        }
        this.f21764f = i10;
        return new a(i11, z13, z14);
    }

    private void K() {
        h(f21755q);
    }

    private x L(String str) {
        return new x(str);
    }

    private x M(String str, int i10, int i11) {
        return new x(str.substring(i10, i11));
    }

    private void b(e eVar) {
        e eVar2 = this.f21766h;
        if (eVar2 != null) {
            eVar2.f21705g = true;
        }
        this.f21766h = eVar;
    }

    private static void c(char c10, wd.a aVar, Map<Character, wd.a> map) {
        if (map.put(Character.valueOf(c10), aVar) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    private static void d(Iterable<wd.a> iterable, Map<Character, wd.a> map) {
        s sVar;
        for (wd.a aVar : iterable) {
            char e10 = aVar.e();
            char b10 = aVar.b();
            if (e10 == b10) {
                wd.a aVar2 = map.get(Character.valueOf(e10));
                if (aVar2 != null && aVar2.e() == aVar2.b()) {
                    if (aVar2 instanceof s) {
                        sVar = (s) aVar2;
                    } else {
                        s sVar2 = new s(e10);
                        sVar2.f(aVar2);
                        sVar = sVar2;
                    }
                    sVar.f(aVar);
                    map.put(Character.valueOf(e10), sVar);
                } else {
                    c(e10, aVar, map);
                }
            } else {
                c(e10, aVar, map);
                c(b10, aVar, map);
            }
        }
    }

    public static BitSet e(Set<Character> set) {
        BitSet bitSet = new BitSet();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(it.next().charValue());
        }
        return bitSet;
    }

    public static Map<Character, wd.a> f(List<wd.a> list) {
        HashMap hashMap = new HashMap();
        d(Arrays.asList(new rd.a(), new rd.c()), hashMap);
        d(list, hashMap);
        return hashMap;
    }

    public static BitSet g(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        return bitSet2;
    }

    private String h(Pattern pattern) {
        if (this.f21764f >= this.f21763e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f21763e);
        matcher.region(this.f21764f, this.f21763e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f21764f = matcher.end();
        return matcher.group();
    }

    private void i(td.s sVar) {
        if (sVar.c() == sVar.d()) {
            return;
        }
        l(sVar.c(), sVar.d());
    }

    private void j(x xVar, x xVar2, int i10) {
        if (xVar != null && xVar2 != null && xVar != xVar2) {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(xVar.m());
            td.s e10 = xVar.e();
            td.s e11 = xVar2.e();
            while (e10 != e11) {
                sb2.append(((x) e10).m());
                td.s e12 = e10.e();
                e10.l();
                e10 = e12;
            }
            xVar.n(sb2.toString());
        }
    }

    private void k(td.s sVar, td.s sVar2) {
        if (sVar != sVar2 && sVar.e() != sVar2) {
            l(sVar.e(), sVar2.g());
        }
    }

    private void l(td.s sVar, td.s sVar2) {
        x xVar = null;
        x xVar2 = null;
        int i10 = 0;
        while (sVar != null) {
            if (sVar instanceof x) {
                xVar2 = (x) sVar;
                if (xVar == null) {
                    xVar = xVar2;
                }
                i10 += xVar2.m().length();
            } else {
                j(xVar, xVar2, i10);
                xVar = null;
                xVar2 = null;
                i10 = 0;
            }
            if (sVar == sVar2) {
                break;
            }
            sVar = sVar.e();
        }
        j(xVar, xVar2, i10);
    }

    private td.s m() {
        String h10 = h(f21753o);
        if (h10 != null) {
            String substring = h10.substring(1, h10.length() - 1);
            td.o oVar = new td.o("mailto:" + substring, null);
            oVar.b(new x(substring));
            return oVar;
        }
        String h11 = h(f21754p);
        if (h11 == null) {
            return null;
        }
        String substring2 = h11.substring(1, h11.length() - 1);
        td.o oVar2 = new td.o(substring2, null);
        oVar2.b(new x(substring2));
        return oVar2;
    }

    private td.s n() {
        this.f21764f++;
        if (B() == '\n') {
            td.i iVar = new td.i();
            this.f21764f++;
            return iVar;
        }
        if (this.f21764f < this.f21763e.length()) {
            Pattern pattern = f21749k;
            String str = this.f21763e;
            int i10 = this.f21764f;
            if (pattern.matcher(str.substring(i10, i10 + 1)).matches()) {
                String str2 = this.f21763e;
                int i11 = this.f21764f;
                x M = M(str2, i11, i11 + 1);
                this.f21764f++;
                return M;
            }
        }
        return L("\\");
    }

    private td.s o() {
        String h10;
        String h11 = h(f21752n);
        if (h11 == null) {
            return null;
        }
        int i10 = this.f21764f;
        do {
            h10 = h(f21751m);
            if (h10 == null) {
                this.f21764f = i10;
                return L(h11);
            }
        } while (!h10.equals(h11));
        td.d dVar = new td.d();
        String replace = this.f21763e.substring(i10, this.f21764f - h11.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ' && sd.d.e(replace)) {
            replace = replace.substring(1, replace.length() - 1);
        }
        dVar.n(replace);
        return dVar;
    }

    private td.s p() {
        int i10 = this.f21764f;
        this.f21764f = i10 + 1;
        if (B() == '[') {
            this.f21764f++;
            x L = L("![");
            b(e.a(L, i10 + 1, this.f21766h, this.f21765g));
            return L;
        }
        return L("!");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private td.s q() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qd.n.q():td.s");
    }

    private td.s r(wd.a aVar, char c10) {
        a J = J(aVar, c10);
        if (J == null) {
            return null;
        }
        int i10 = J.f21767a;
        int i11 = this.f21764f;
        int i12 = i11 + i10;
        this.f21764f = i12;
        x M = M(this.f21763e, i11, i12);
        f fVar = new f(M, c10, J.f21769c, J.f21768b, this.f21765g);
        this.f21765g = fVar;
        fVar.f21712g = i10;
        fVar.f21713h = i10;
        f fVar2 = fVar.f21710e;
        if (fVar2 != null) {
            fVar2.f21711f = fVar;
        }
        return M;
    }

    private td.s s() {
        String h10 = h(f21750l);
        if (h10 != null) {
            return L(sd.b.a(h10));
        }
        return null;
    }

    private td.s t() {
        String h10 = h(f21748j);
        if (h10 != null) {
            td.l lVar = new td.l();
            lVar.m(h10);
            return lVar;
        }
        return null;
    }

    private td.s u(td.s sVar) {
        td.s y10;
        char B = B();
        if (B == 0) {
            return null;
        }
        if (B != '\n') {
            if (B != '!') {
                if (B != '&') {
                    if (B != '<') {
                        if (B != '`') {
                            switch (B) {
                                case '[':
                                    y10 = z();
                                    break;
                                case '\\':
                                    y10 = n();
                                    break;
                                case ']':
                                    y10 = q();
                                    break;
                                default:
                                    if (this.f21760b.get(B)) {
                                        y10 = r(this.f21761c.get(Character.valueOf(B)), B);
                                        break;
                                    } else {
                                        y10 = A();
                                        break;
                                    }
                            }
                        } else {
                            y10 = o();
                        }
                    } else {
                        y10 = m();
                        if (y10 == null) {
                            y10 = t();
                        }
                    }
                } else {
                    y10 = s();
                }
            } else {
                y10 = p();
            }
        } else {
            y10 = y(sVar);
        }
        if (y10 != null) {
            return y10;
        }
        this.f21764f++;
        return L(String.valueOf(B));
    }

    private String v() {
        String substring;
        int a10 = sd.c.a(this.f21763e, this.f21764f);
        if (a10 == -1) {
            return null;
        }
        if (B() == '<') {
            substring = this.f21763e.substring(this.f21764f + 1, a10 - 1);
        } else {
            substring = this.f21763e.substring(this.f21764f, a10);
        }
        this.f21764f = a10;
        return sd.a.e(substring);
    }

    private String x() {
        int d10 = sd.c.d(this.f21763e, this.f21764f);
        if (d10 == -1) {
            return null;
        }
        String substring = this.f21763e.substring(this.f21764f + 1, d10 - 1);
        this.f21764f = d10;
        return sd.a.e(substring);
    }

    private td.s y(td.s sVar) {
        int i10;
        this.f21764f++;
        if (sVar instanceof x) {
            x xVar = (x) sVar;
            if (xVar.m().endsWith(" ")) {
                String m10 = xVar.m();
                Matcher matcher = f21758t.matcher(m10);
                if (matcher.find()) {
                    i10 = matcher.end() - matcher.start();
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    xVar.n(m10.substring(0, m10.length() - i10));
                }
                if (i10 >= 2) {
                    return new td.i();
                }
                return new v();
            }
        }
        return new v();
    }

    private td.s z() {
        int i10 = this.f21764f;
        this.f21764f = i10 + 1;
        x L = L("[");
        b(e.b(L, i10, this.f21766h, this.f21765g));
        return L;
    }

    void I(String str) {
        this.f21763e = str;
        this.f21764f = 0;
        this.f21765g = null;
        this.f21766h = null;
    }

    @Override // ud.a
    public void a(String str, td.s sVar) {
        I(str.trim());
        td.s sVar2 = null;
        while (true) {
            sVar2 = u(sVar2);
            if (sVar2 != null) {
                sVar.b(sVar2);
            } else {
                C(null);
                i(sVar);
                return;
            }
        }
    }

    int w() {
        if (this.f21764f < this.f21763e.length() && this.f21763e.charAt(this.f21764f) == '[') {
            int i10 = this.f21764f + 1;
            int c10 = sd.c.c(this.f21763e, i10);
            int i11 = c10 - i10;
            if (c10 != -1 && i11 <= 999 && c10 < this.f21763e.length() && this.f21763e.charAt(c10) == ']') {
                this.f21764f = c10 + 1;
                return i11 + 2;
            }
        }
        return 0;
    }
}
