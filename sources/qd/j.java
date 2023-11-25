package qd;

/* compiled from: HeadingParser.java */
/* loaded from: classes4.dex */
public class j extends vd.a {

    /* renamed from: a  reason: collision with root package name */
    private final td.j f21736a;

    /* renamed from: b  reason: collision with root package name */
    private final String f21737b;

    /* compiled from: HeadingParser.java */
    /* loaded from: classes4.dex */
    public static class a extends vd.b {
        @Override // vd.e
        public vd.f a(vd.h hVar, vd.g gVar) {
            CharSequence b10;
            if (hVar.b() >= sd.d.f23074a) {
                return vd.f.c();
            }
            CharSequence c10 = hVar.c();
            int d10 = hVar.d();
            j k10 = j.k(c10, d10);
            if (k10 == null) {
                int l10 = j.l(c10, d10);
                if (l10 > 0 && (b10 = gVar.b()) != null) {
                    return vd.f.d(new j(l10, b10.toString())).b(c10.length()).e();
                }
                return vd.f.c();
            }
            return vd.f.d(k10).b(c10.length());
        }
    }

    public j(int i10, String str) {
        td.j jVar = new td.j();
        this.f21736a = jVar;
        jVar.o(i10);
        this.f21737b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j k(CharSequence charSequence, int i10) {
        int k10 = sd.d.k('#', charSequence, i10, charSequence.length()) - i10;
        if (k10 == 0 || k10 > 6) {
            return null;
        }
        int i11 = i10 + k10;
        if (i11 >= charSequence.length()) {
            return new j(k10, "");
        }
        char charAt = charSequence.charAt(i11);
        if (charAt != ' ' && charAt != '\t') {
            return null;
        }
        int n10 = sd.d.n(charSequence, charSequence.length() - 1, i11);
        int l10 = sd.d.l('#', charSequence, n10, i11);
        int n11 = sd.d.n(charSequence, l10, i11);
        if (n11 != l10) {
            return new j(k10, charSequence.subSequence(i11, n11 + 1).toString());
        }
        return new j(k10, charSequence.subSequence(i11, n10 + 1).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(CharSequence charSequence, int i10) {
        char charAt = charSequence.charAt(i10);
        if (charAt != '-') {
            if (charAt == '=') {
                if (m(charSequence, i10 + 1, '=')) {
                    return 1;
                }
            } else {
                return 0;
            }
        }
        if (m(charSequence, i10 + 1, '-')) {
            return 2;
        }
        return 0;
    }

    private static boolean m(CharSequence charSequence, int i10, char c10) {
        if (sd.d.m(charSequence, sd.d.k(c10, charSequence, i10, charSequence.length()), charSequence.length()) >= charSequence.length()) {
            return true;
        }
        return false;
    }

    @Override // vd.d
    public td.a e() {
        return this.f21736a;
    }

    @Override // vd.a, vd.d
    public void f(ud.a aVar) {
        aVar.a(this.f21737b, this.f21736a);
    }

    @Override // vd.d
    public vd.c g(vd.h hVar) {
        return vd.c.d();
    }
}
