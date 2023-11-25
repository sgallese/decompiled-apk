package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* compiled from: FragmentController.java */
/* loaded from: classes.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private final v<?> f4819a;

    private t(v<?> vVar) {
        this.f4819a = vVar;
    }

    public static t b(v<?> vVar) {
        return new t((v) androidx.core.util.i.h(vVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        v<?> vVar = this.f4819a;
        vVar.f4843r.o(vVar, vVar, fragment);
    }

    public void c() {
        this.f4819a.f4843r.z();
    }

    public boolean d(MenuItem menuItem) {
        return this.f4819a.f4843r.C(menuItem);
    }

    public void e() {
        this.f4819a.f4843r.D();
    }

    public void f() {
        this.f4819a.f4843r.F();
    }

    public void g() {
        this.f4819a.f4843r.O();
    }

    public void h() {
        this.f4819a.f4843r.S();
    }

    public void i() {
        this.f4819a.f4843r.T();
    }

    public void j() {
        this.f4819a.f4843r.V();
    }

    public boolean k() {
        return this.f4819a.f4843r.c0(true);
    }

    public FragmentManager l() {
        return this.f4819a.f4843r;
    }

    public void m() {
        this.f4819a.f4843r.d1();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f4819a.f4843r.A0().onCreateView(view, str, context, attributeSet);
    }
}
