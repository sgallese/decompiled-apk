package androidx.navigation;

import androidx.navigation.m;
import dc.w;
import yc.v;

/* compiled from: NavOptionsBuilder.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    private boolean f5361b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5362c;

    /* renamed from: e  reason: collision with root package name */
    private String f5364e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5365f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5366g;

    /* renamed from: a  reason: collision with root package name */
    private final m.a f5360a = new m.a();

    /* renamed from: d  reason: collision with root package name */
    private int f5363d = -1;

    private final void f(String str) {
        boolean u10;
        if (str != null) {
            u10 = v.u(str);
            if ((!u10) != false) {
                this.f5364e = str;
                this.f5365f = false;
                return;
            }
            throw new IllegalArgumentException("Cannot pop up to an empty route".toString());
        }
    }

    public final void a(pc.l<? super k3.c, w> lVar) {
        qc.q.i(lVar, "animBuilder");
        k3.c cVar = new k3.c();
        lVar.invoke(cVar);
        this.f5360a.b(cVar.a()).c(cVar.b()).e(cVar.c()).f(cVar.d());
    }

    public final m b() {
        m.a aVar = this.f5360a;
        aVar.d(this.f5361b);
        aVar.j(this.f5362c);
        String str = this.f5364e;
        if (str != null) {
            aVar.h(str, this.f5365f, this.f5366g);
        } else {
            aVar.g(this.f5363d, this.f5365f, this.f5366g);
        }
        return aVar.a();
    }

    public final void c(int i10, pc.l<? super k3.q, w> lVar) {
        qc.q.i(lVar, "popUpToBuilder");
        e(i10);
        f(null);
        k3.q qVar = new k3.q();
        lVar.invoke(qVar);
        this.f5365f = qVar.a();
        this.f5366g = qVar.b();
    }

    public final void d(boolean z10) {
        this.f5361b = z10;
    }

    public final void e(int i10) {
        this.f5363d = i10;
        this.f5365f = false;
    }

    public final void g(boolean z10) {
        this.f5362c = z10;
    }
}
