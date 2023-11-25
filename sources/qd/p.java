package qd;

/* compiled from: ListBlockParser.java */
/* loaded from: classes4.dex */
public class p extends vd.a {

    /* renamed from: a  reason: collision with root package name */
    private final td.q f21780a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f21781b;

    /* renamed from: c  reason: collision with root package name */
    private int f21782c;

    /* compiled from: ListBlockParser.java */
    /* loaded from: classes4.dex */
    public static class a extends vd.b {
        @Override // vd.e
        public vd.f a(vd.h hVar, vd.g gVar) {
            boolean z10;
            vd.d a10 = gVar.a();
            if (hVar.b() >= sd.d.f23074a) {
                return vd.f.c();
            }
            int d10 = hVar.d();
            int f10 = hVar.f() + hVar.b();
            if (gVar.b() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            b n10 = p.n(hVar.c(), d10, f10, z10);
            if (n10 == null) {
                return vd.f.c();
            }
            int i10 = n10.f21784b;
            q qVar = new q(i10 - hVar.f());
            if ((a10 instanceof p) && p.m((td.q) a10.e(), n10.f21783a)) {
                return vd.f.d(qVar).a(i10);
            }
            p pVar = new p(n10.f21783a);
            n10.f21783a.o(true);
            return vd.f.d(pVar, qVar).a(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListBlockParser.java */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final td.q f21783a;

        /* renamed from: b  reason: collision with root package name */
        final int f21784b;

        b(td.q qVar, int i10) {
            this.f21783a = qVar;
            this.f21784b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListBlockParser.java */
    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final td.q f21785a;

        /* renamed from: b  reason: collision with root package name */
        final int f21786b;

        c(td.q qVar, int i10) {
            this.f21785a = qVar;
            this.f21786b = i10;
        }
    }

    public p(td.q qVar) {
        this.f21780a = qVar;
    }

    private static boolean k(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    private static boolean l(CharSequence charSequence, int i10) {
        char charAt;
        if (i10 >= charSequence.length() || (charAt = charSequence.charAt(i10)) == '\t' || charAt == ' ') {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(td.q qVar, td.q qVar2) {
        if ((qVar instanceof td.c) && (qVar2 instanceof td.c)) {
            return k(Character.valueOf(((td.c) qVar).p()), Character.valueOf(((td.c) qVar2).p()));
        }
        if ((qVar instanceof td.t) && (qVar2 instanceof td.t)) {
            return k(Character.valueOf(((td.t) qVar).p()), Character.valueOf(((td.t) qVar2).p()));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b n(CharSequence charSequence, int i10, int i11, boolean z10) {
        boolean z11;
        c o10 = o(charSequence, i10);
        if (o10 == null) {
            return null;
        }
        td.q qVar = o10.f21785a;
        int i12 = o10.f21786b;
        int i13 = i11 + (i12 - i10);
        int length = charSequence.length();
        int i14 = i13;
        while (true) {
            if (i12 < length) {
                char charAt = charSequence.charAt(i12);
                if (charAt == '\t') {
                    i14 += sd.d.a(i14);
                } else if (charAt == ' ') {
                    i14++;
                } else {
                    z11 = true;
                    break;
                }
                i12++;
            } else {
                z11 = false;
                break;
            }
        }
        if (z10 && (((qVar instanceof td.t) && ((td.t) qVar).q() != 1) || !z11)) {
            return null;
        }
        if (!z11 || i14 - i13 > sd.d.f23074a) {
            i14 = i13 + 1;
        }
        return new b(qVar, i14);
    }

    private static c o(CharSequence charSequence, int i10) {
        char charAt = charSequence.charAt(i10);
        if (charAt != '*' && charAt != '+' && charAt != '-') {
            return p(charSequence, i10);
        }
        int i11 = i10 + 1;
        if (l(charSequence, i11)) {
            td.c cVar = new td.c();
            cVar.q(charAt);
            return new c(cVar, i11);
        }
        return null;
    }

    private static c p(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        for (int i12 = i10; i12 < length; i12++) {
            char charAt = charSequence.charAt(i12);
            if (charAt != ')' && charAt != '.') {
                switch (charAt) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        i11++;
                        if (i11 > 9) {
                            return null;
                        }
                    default:
                        return null;
                }
            } else {
                if (i11 >= 1) {
                    int i13 = i12 + 1;
                    if (l(charSequence, i13)) {
                        String charSequence2 = charSequence.subSequence(i10, i12).toString();
                        td.t tVar = new td.t();
                        tVar.s(Integer.parseInt(charSequence2));
                        tVar.r(charAt);
                        return new c(tVar, i13);
                    }
                }
                return null;
            }
        }
        return null;
    }

    @Override // vd.a, vd.d
    public boolean a() {
        return true;
    }

    @Override // vd.a, vd.d
    public boolean c(td.a aVar) {
        if (!(aVar instanceof td.r)) {
            return false;
        }
        if (this.f21781b && this.f21782c == 1) {
            this.f21780a.o(false);
            this.f21781b = false;
        }
        return true;
    }

    @Override // vd.d
    public td.a e() {
        return this.f21780a;
    }

    @Override // vd.d
    public vd.c g(vd.h hVar) {
        if (hVar.a()) {
            this.f21781b = true;
            this.f21782c = 0;
        } else if (this.f21781b) {
            this.f21782c++;
        }
        return vd.c.b(hVar.getIndex());
    }
}
