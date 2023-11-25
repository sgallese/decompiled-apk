package qd;

import java.util.ArrayList;
import java.util.List;
import td.u;

/* compiled from: IndentedCodeBlockParser.java */
/* loaded from: classes4.dex */
public class l extends vd.a {

    /* renamed from: a  reason: collision with root package name */
    private final td.n f21743a = new td.n();

    /* renamed from: b  reason: collision with root package name */
    private final List<CharSequence> f21744b = new ArrayList();

    /* compiled from: IndentedCodeBlockParser.java */
    /* loaded from: classes4.dex */
    public static class a extends vd.b {
        @Override // vd.e
        public vd.f a(vd.h hVar, vd.g gVar) {
            if (hVar.b() >= sd.d.f23074a && !hVar.a() && !(hVar.e().e() instanceof u)) {
                return vd.f.d(new l()).a(hVar.f() + sd.d.f23074a);
            }
            return vd.f.c();
        }
    }

    @Override // vd.a, vd.d
    public void b() {
        int size = this.f21744b.size() - 1;
        while (size >= 0 && sd.d.f(this.f21744b.get(size))) {
            size--;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < size + 1; i10++) {
            sb2.append(this.f21744b.get(i10));
            sb2.append('\n');
        }
        this.f21743a.o(sb2.toString());
    }

    @Override // vd.d
    public td.a e() {
        return this.f21743a;
    }

    @Override // vd.d
    public vd.c g(vd.h hVar) {
        if (hVar.b() >= sd.d.f23074a) {
            return vd.c.a(hVar.f() + sd.d.f23074a);
        }
        if (hVar.a()) {
            return vd.c.b(hVar.d());
        }
        return vd.c.d();
    }

    @Override // vd.a, vd.d
    public void h(CharSequence charSequence) {
        this.f21744b.add(charSequence);
    }
}
