package g5;

import c5.c;

/* compiled from: HardwareBitmaps.kt */
/* loaded from: classes.dex */
final class t implements q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16211a = new a(null);

    /* compiled from: HardwareBitmaps.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public t(u uVar) {
    }

    @Override // g5.q
    public boolean a() {
        return p.f16200a.b(null);
    }

    @Override // g5.q
    public boolean b(c5.i iVar) {
        int i10;
        c5.c b10 = iVar.b();
        int i11 = Integer.MAX_VALUE;
        if (b10 instanceof c.a) {
            i10 = ((c.a) b10).f8840a;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        if (i10 > 100) {
            c5.c a10 = iVar.a();
            if (a10 instanceof c.a) {
                i11 = ((c.a) a10).f8840a;
            }
            if (i11 > 100) {
                return true;
            }
        }
        return false;
    }
}
