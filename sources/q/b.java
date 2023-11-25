package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CardViewApi21Impl.java */
/* loaded from: classes.dex */
public class b implements d {
    private e p(c cVar) {
        return (e) cVar.e();
    }

    @Override // q.d
    public void a(c cVar) {
        o(cVar, g(cVar));
    }

    @Override // q.d
    public float b(c cVar) {
        return d(cVar) * 2.0f;
    }

    @Override // q.d
    public void c(c cVar, float f10) {
        p(cVar).h(f10);
    }

    @Override // q.d
    public float d(c cVar) {
        return p(cVar).d();
    }

    @Override // q.d
    public void e(c cVar) {
        o(cVar, g(cVar));
    }

    @Override // q.d
    public float f(c cVar) {
        return cVar.f().getElevation();
    }

    @Override // q.d
    public float g(c cVar) {
        return p(cVar).c();
    }

    @Override // q.d
    public float h(c cVar) {
        return d(cVar) * 2.0f;
    }

    @Override // q.d
    public ColorStateList i(c cVar) {
        return p(cVar).b();
    }

    @Override // q.d
    public void j(c cVar, float f10) {
        cVar.f().setElevation(f10);
    }

    @Override // q.d
    public void k(c cVar) {
        if (!cVar.d()) {
            cVar.b(0, 0, 0, 0);
            return;
        }
        float g10 = g(cVar);
        float d10 = d(cVar);
        int ceil = (int) Math.ceil(f.a(g10, d10, cVar.c()));
        int ceil2 = (int) Math.ceil(f.b(g10, d10, cVar.c()));
        cVar.b(ceil, ceil2, ceil, ceil2);
    }

    @Override // q.d
    public void m(c cVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        cVar.a(new e(colorStateList, f10));
        View f13 = cVar.f();
        f13.setClipToOutline(true);
        f13.setElevation(f11);
        o(cVar, f12);
    }

    @Override // q.d
    public void n(c cVar, ColorStateList colorStateList) {
        p(cVar).f(colorStateList);
    }

    @Override // q.d
    public void o(c cVar, float f10) {
        p(cVar).g(f10, cVar.d(), cVar.c());
        k(cVar);
    }

    @Override // q.d
    public void l() {
    }
}
