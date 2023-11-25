package qd;

import td.u;

/* compiled from: ListItemParser.java */
/* loaded from: classes4.dex */
public class q extends vd.a {

    /* renamed from: a  reason: collision with root package name */
    private final td.r f21787a = new td.r();

    /* renamed from: b  reason: collision with root package name */
    private int f21788b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f21789c;

    public q(int i10) {
        this.f21788b = i10;
    }

    @Override // vd.a, vd.d
    public boolean a() {
        return true;
    }

    @Override // vd.a, vd.d
    public boolean c(td.a aVar) {
        if (this.f21789c) {
            td.a f10 = this.f21787a.f();
            if (f10 instanceof td.q) {
                ((td.q) f10).o(false);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // vd.d
    public td.a e() {
        return this.f21787a;
    }

    @Override // vd.d
    public vd.c g(vd.h hVar) {
        boolean z10;
        if (hVar.a()) {
            if (this.f21787a.c() == null) {
                return vd.c.d();
            }
            td.a e10 = hVar.e().e();
            if (!(e10 instanceof u) && !(e10 instanceof td.r)) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.f21789c = z10;
            return vd.c.b(hVar.d());
        } else if (hVar.b() >= this.f21788b) {
            return vd.c.a(hVar.f() + this.f21788b);
        } else {
            return vd.c.d();
        }
    }
}
