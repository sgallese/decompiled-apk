package qd;

import java.util.List;
import td.u;

/* compiled from: ParagraphParser.java */
/* loaded from: classes4.dex */
public class r extends vd.a {

    /* renamed from: a  reason: collision with root package name */
    private final u f21790a = new u();

    /* renamed from: b  reason: collision with root package name */
    private o f21791b = new o();

    @Override // vd.a, vd.d
    public void b() {
        if (this.f21791b.d().length() == 0) {
            this.f21790a.l();
        }
    }

    @Override // vd.a, vd.d
    public boolean d() {
        return true;
    }

    @Override // vd.d
    public td.a e() {
        return this.f21790a;
    }

    @Override // vd.a, vd.d
    public void f(ud.a aVar) {
        CharSequence d10 = this.f21791b.d();
        if (d10.length() > 0) {
            aVar.a(d10.toString(), this.f21790a);
        }
    }

    @Override // vd.d
    public vd.c g(vd.h hVar) {
        if (!hVar.a()) {
            return vd.c.b(hVar.getIndex());
        }
        return vd.c.d();
    }

    @Override // vd.a, vd.d
    public void h(CharSequence charSequence) {
        this.f21791b.f(charSequence);
    }

    public CharSequence i() {
        return this.f21791b.d();
    }

    public List<td.p> j() {
        return this.f21791b.c();
    }
}
