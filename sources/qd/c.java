package qd;

/* compiled from: BlockQuoteParser.java */
/* loaded from: classes4.dex */
public class c extends vd.a {

    /* renamed from: a  reason: collision with root package name */
    private final td.b f21694a = new td.b();

    /* compiled from: BlockQuoteParser.java */
    /* loaded from: classes4.dex */
    public static class a extends vd.b {
        @Override // vd.e
        public vd.f a(vd.h hVar, vd.g gVar) {
            int d10 = hVar.d();
            if (c.k(hVar, d10)) {
                int f10 = hVar.f() + hVar.b() + 1;
                if (sd.d.i(hVar.c(), d10 + 1)) {
                    f10++;
                }
                return vd.f.d(new c()).a(f10);
            }
            return vd.f.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k(vd.h hVar, int i10) {
        CharSequence c10 = hVar.c();
        if (hVar.b() < sd.d.f23074a && i10 < c10.length() && c10.charAt(i10) == '>') {
            return true;
        }
        return false;
    }

    @Override // vd.a, vd.d
    public boolean a() {
        return true;
    }

    @Override // vd.a, vd.d
    public boolean c(td.a aVar) {
        return true;
    }

    @Override // vd.d
    public vd.c g(vd.h hVar) {
        int d10 = hVar.d();
        if (k(hVar, d10)) {
            int f10 = hVar.f() + hVar.b() + 1;
            if (sd.d.i(hVar.c(), d10 + 1)) {
                f10++;
            }
            return vd.c.a(f10);
        }
        return vd.c.d();
    }

    @Override // vd.d
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public td.b e() {
        return this.f21694a;
    }
}
