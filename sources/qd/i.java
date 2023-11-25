package qd;

/* compiled from: FencedCodeBlockParser.java */
/* loaded from: classes4.dex */
public class i extends vd.a {

    /* renamed from: a  reason: collision with root package name */
    private final td.h f21733a;

    /* renamed from: b  reason: collision with root package name */
    private String f21734b;

    /* renamed from: c  reason: collision with root package name */
    private StringBuilder f21735c;

    /* compiled from: FencedCodeBlockParser.java */
    /* loaded from: classes4.dex */
    public static class a extends vd.b {
        @Override // vd.e
        public vd.f a(vd.h hVar, vd.g gVar) {
            int b10 = hVar.b();
            if (b10 >= sd.d.f23074a) {
                return vd.f.c();
            }
            int d10 = hVar.d();
            i k10 = i.k(hVar.c(), d10, b10);
            if (k10 != null) {
                return vd.f.d(k10).b(d10 + k10.f21733a.p());
            }
            return vd.f.c();
        }
    }

    public i(char c10, int i10, int i11) {
        td.h hVar = new td.h();
        this.f21733a = hVar;
        this.f21735c = new StringBuilder();
        hVar.s(c10);
        hVar.u(i10);
        hVar.t(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i k(CharSequence charSequence, int i10, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = i10; i14 < length; i14++) {
            char charAt = charSequence.charAt(i14);
            if (charAt != '`') {
                if (charAt != '~') {
                    break;
                }
                i13++;
            } else {
                i12++;
            }
        }
        if (i12 >= 3 && i13 == 0) {
            if (sd.d.b('`', charSequence, i10 + i12) != -1) {
                return null;
            }
            return new i('`', i12, i11);
        } else if (i13 < 3 || i12 != 0) {
            return null;
        } else {
            return new i('~', i13, i11);
        }
    }

    private boolean l(CharSequence charSequence, int i10) {
        char n10 = this.f21733a.n();
        int p10 = this.f21733a.p();
        int k10 = sd.d.k(n10, charSequence, i10, charSequence.length()) - i10;
        if (k10 < p10 || sd.d.m(charSequence, i10 + k10, charSequence.length()) != charSequence.length()) {
            return false;
        }
        return true;
    }

    @Override // vd.a, vd.d
    public void b() {
        this.f21733a.v(sd.a.e(this.f21734b.trim()));
        this.f21733a.w(this.f21735c.toString());
    }

    @Override // vd.d
    public td.a e() {
        return this.f21733a;
    }

    @Override // vd.d
    public vd.c g(vd.h hVar) {
        boolean z10;
        int d10 = hVar.d();
        int index = hVar.getIndex();
        CharSequence c10 = hVar.c();
        if (hVar.b() < sd.d.f23074a && l(c10, d10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return vd.c.c();
        }
        int length = c10.length();
        for (int o10 = this.f21733a.o(); o10 > 0 && index < length && c10.charAt(index) == ' '; o10--) {
            index++;
        }
        return vd.c.b(index);
    }

    @Override // vd.a, vd.d
    public void h(CharSequence charSequence) {
        if (this.f21734b == null) {
            this.f21734b = charSequence.toString();
            return;
        }
        this.f21735c.append(charSequence);
        this.f21735c.append('\n');
    }
}
