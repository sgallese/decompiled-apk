package qd;

import td.y;

/* compiled from: ThematicBreakParser.java */
/* loaded from: classes4.dex */
public class t extends vd.a {

    /* renamed from: a  reason: collision with root package name */
    private final y f21795a = new y();

    /* compiled from: ThematicBreakParser.java */
    /* loaded from: classes4.dex */
    public static class a extends vd.b {
        @Override // vd.e
        public vd.f a(vd.h hVar, vd.g gVar) {
            if (hVar.b() >= 4) {
                return vd.f.c();
            }
            int d10 = hVar.d();
            CharSequence c10 = hVar.c();
            if (t.j(c10, d10)) {
                return vd.f.d(new t()).b(c10.length());
            }
            return vd.f.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length) {
            char charAt = charSequence.charAt(i10);
            if (charAt != '\t' && charAt != ' ') {
                if (charAt != '*') {
                    if (charAt != '-') {
                        if (charAt != '_') {
                            return false;
                        }
                        i12++;
                    } else {
                        i11++;
                    }
                } else {
                    i13++;
                }
            }
            i10++;
        }
        if ((i11 < 3 || i12 != 0 || i13 != 0) && ((i12 < 3 || i11 != 0 || i13 != 0) && (i13 < 3 || i11 != 0 || i12 != 0))) {
            return false;
        }
        return true;
    }

    @Override // vd.d
    public td.a e() {
        return this.f21795a;
    }

    @Override // vd.d
    public vd.c g(vd.h hVar) {
        return vd.c.d();
    }
}
