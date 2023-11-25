package db;

import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import cb.j;
import cb.l;
import cb.r;
import cb.t;
import db.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import td.q;
import td.s;
import td.u;
import td.v;
import td.w;
import td.x;
import td.y;

/* compiled from: CorePlugin.java */
/* loaded from: classes4.dex */
public class a extends cb.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<p> f13186a = new ArrayList(0);

    /* renamed from: b  reason: collision with root package name */
    private boolean f13187b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* renamed from: db.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0304a implements l.c<y> {
        C0304a() {
        }

        @Override // cb.l.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(cb.l lVar, y yVar) {
            lVar.A(yVar);
            int length = lVar.length();
            lVar.builder().append((char) 160);
            lVar.w(yVar, length);
            lVar.i(yVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* loaded from: classes4.dex */
    public class b implements l.c<td.j> {
        b() {
        }

        @Override // cb.l.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(cb.l lVar, td.j jVar) {
            lVar.A(jVar);
            int length = lVar.length();
            lVar.n(jVar);
            db.b.f13192d.e(lVar.z(), Integer.valueOf(jVar.n()));
            lVar.w(jVar, length);
            lVar.i(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* loaded from: classes4.dex */
    public class c implements l.c<v> {
        c() {
        }

        @Override // cb.l.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(cb.l lVar, v vVar) {
            lVar.builder().append(' ');
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* loaded from: classes4.dex */
    public class d implements l.c<td.i> {
        d() {
        }

        @Override // cb.l.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(cb.l lVar, td.i iVar) {
            lVar.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* loaded from: classes4.dex */
    public class e implements l.c<u> {
        e() {
        }

        @Override // cb.l.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(cb.l lVar, u uVar) {
            boolean p10 = a.p(uVar);
            if (!p10) {
                lVar.A(uVar);
            }
            int length = lVar.length();
            lVar.n(uVar);
            db.b.f13194f.e(lVar.z(), Boolean.valueOf(p10));
            lVar.w(uVar, length);
            if (!p10) {
                lVar.i(uVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* loaded from: classes4.dex */
    public class f implements l.c<td.o> {
        f() {
        }

        @Override // cb.l.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(cb.l lVar, td.o oVar) {
            int length = lVar.length();
            lVar.n(oVar);
            db.b.f13193e.e(lVar.z(), oVar.m());
            lVar.w(oVar, length);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* loaded from: classes4.dex */
    public class g implements l.c<x> {
        g() {
        }

        @Override // cb.l.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(cb.l lVar, x xVar) {
            String m10 = xVar.m();
            lVar.builder().d(m10);
            if (!a.this.f13186a.isEmpty()) {
                int length = lVar.length() - m10.length();
                Iterator it = a.this.f13186a.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).a(lVar, m10, length);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* loaded from: classes4.dex */
    public class h implements l.c<w> {
        h() {
        }

        @Override // cb.l.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(cb.l lVar, w wVar) {
            int length = lVar.length();
            lVar.n(wVar);
            lVar.w(wVar, length);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* loaded from: classes4.dex */
    public class i implements l.c<td.g> {
        i() {
        }

        @Override // cb.l.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(cb.l lVar, td.g gVar) {
            int length = lVar.length();
            lVar.n(gVar);
            lVar.w(gVar, length);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* loaded from: classes4.dex */
    public class j implements l.c<td.b> {
        j() {
        }

        @Override // cb.l.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(cb.l lVar, td.b bVar) {
            lVar.A(bVar);
            int length = lVar.length();
            lVar.n(bVar);
            lVar.w(bVar, length);
            lVar.i(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* loaded from: classes4.dex */
    public class k implements l.c<td.d> {
        k() {
        }

        @Override // cb.l.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(cb.l lVar, td.d dVar) {
            int length = lVar.length();
            lVar.builder().append((char) 160).d(dVar.m()).append((char) 160);
            lVar.w(dVar, length);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* loaded from: classes4.dex */
    public class l implements l.c<td.h> {
        l() {
        }

        @Override // cb.l.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(cb.l lVar, td.h hVar) {
            a.z(lVar, hVar.q(), hVar.r(), hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* loaded from: classes4.dex */
    public class m implements l.c<td.n> {
        m() {
        }

        @Override // cb.l.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(cb.l lVar, td.n nVar) {
            a.z(lVar, null, nVar.n(), nVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* loaded from: classes4.dex */
    public class n implements l.c<td.m> {
        n() {
        }

        @Override // cb.l.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(cb.l lVar, td.m mVar) {
            t a10 = lVar.o().e().a(td.m.class);
            if (a10 == null) {
                lVar.n(mVar);
                return;
            }
            int length = lVar.length();
            lVar.n(mVar);
            if (length == lVar.length()) {
                lVar.builder().append((char) 65532);
            }
            cb.g o10 = lVar.o();
            boolean z10 = mVar.f() instanceof td.o;
            String b10 = o10.b().b(mVar.m());
            r z11 = lVar.z();
            io.noties.markwon.image.k.f17221a.e(z11, b10);
            io.noties.markwon.image.k.f17222b.e(z11, Boolean.valueOf(z10));
            io.noties.markwon.image.k.f17223c.e(z11, null);
            lVar.d(length, a10.a(o10, z11));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* loaded from: classes4.dex */
    public class o implements l.c<td.r> {
        o() {
        }

        @Override // cb.l.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(cb.l lVar, td.r rVar) {
            int length = lVar.length();
            lVar.n(rVar);
            td.a f10 = rVar.f();
            if (f10 instanceof td.t) {
                td.t tVar = (td.t) f10;
                int q10 = tVar.q();
                db.b.f13189a.e(lVar.z(), b.a.ORDERED);
                db.b.f13191c.e(lVar.z(), Integer.valueOf(q10));
                tVar.s(tVar.q() + 1);
            } else {
                db.b.f13189a.e(lVar.z(), b.a.BULLET);
                db.b.f13190b.e(lVar.z(), Integer.valueOf(a.s(rVar)));
            }
            lVar.w(rVar, length);
            if (lVar.a(rVar)) {
                lVar.s();
            }
        }
    }

    /* compiled from: CorePlugin.java */
    /* loaded from: classes4.dex */
    public interface p {
        void a(cb.l lVar, String str, int i10);
    }

    protected a() {
    }

    private static void e(l.b bVar) {
        bVar.a(td.b.class, new j());
    }

    private static void f(l.b bVar) {
        bVar.a(td.c.class, new db.d());
    }

    private static void g(l.b bVar) {
        bVar.a(td.d.class, new k());
    }

    public static a h() {
        return new a();
    }

    private static void i(l.b bVar) {
        bVar.a(td.g.class, new i());
    }

    private static void j(l.b bVar) {
        bVar.a(td.h.class, new l());
    }

    private static void k(l.b bVar) {
        bVar.a(td.i.class, new d());
    }

    private static void m(l.b bVar) {
        bVar.a(td.j.class, new b());
    }

    private static void n(l.b bVar) {
        bVar.a(td.m.class, new n());
    }

    private static void o(l.b bVar) {
        bVar.a(td.n.class, new m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean p(u uVar) {
        td.a f10 = uVar.f();
        if (f10 != null) {
            s f11 = f10.f();
            if (f11 instanceof q) {
                return ((q) f11).n();
            }
            return false;
        }
        return false;
    }

    private static void q(l.b bVar) {
        bVar.a(td.o.class, new f());
    }

    private static void r(l.b bVar) {
        bVar.a(td.r.class, new o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(s sVar) {
        int i10 = 0;
        for (s f10 = sVar.f(); f10 != null; f10 = f10.f()) {
            if (f10 instanceof td.r) {
                i10++;
            }
        }
        return i10;
    }

    private static void t(l.b bVar) {
        bVar.a(td.t.class, new db.d());
    }

    private static void u(l.b bVar) {
        bVar.a(u.class, new e());
    }

    private static void v(l.b bVar) {
        bVar.a(v.class, new c());
    }

    private static void w(l.b bVar) {
        bVar.a(w.class, new h());
    }

    private void x(l.b bVar) {
        bVar.a(x.class, new g());
    }

    private static void y(l.b bVar) {
        bVar.a(y.class, new C0304a());
    }

    static void z(cb.l lVar, String str, String str2, s sVar) {
        lVar.A(sVar);
        int length = lVar.length();
        lVar.builder().append((char) 160).append('\n').append(lVar.o().f().a(str, str2));
        lVar.s();
        lVar.builder().append((char) 160);
        db.b.f13195g.e(lVar.z(), str);
        lVar.w(sVar, length);
        lVar.i(sVar);
    }

    @Override // cb.a, cb.i
    public void afterSetText(TextView textView) {
        if (!this.f13187b && textView.getMovementMethod() == null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // cb.a, cb.i
    public void beforeSetText(TextView textView, Spanned spanned) {
        fb.h.a(textView, spanned);
        if (spanned instanceof Spannable) {
            fb.k.a((Spannable) spanned, textView);
        }
    }

    @Override // cb.a, cb.i
    public void configureSpansFactory(j.a aVar) {
        eb.b bVar = new eb.b();
        aVar.a(w.class, new eb.h()).a(td.g.class, new eb.d()).a(td.b.class, new eb.a()).a(td.d.class, new eb.c()).a(td.h.class, bVar).a(td.n.class, bVar).a(td.r.class, new eb.g()).a(td.j.class, new eb.e()).a(td.o.class, new eb.f()).a(y.class, new eb.i());
    }

    @Override // cb.a, cb.i
    public void configureVisitor(l.b bVar) {
        x(bVar);
        w(bVar);
        i(bVar);
        e(bVar);
        g(bVar);
        j(bVar);
        o(bVar);
        n(bVar);
        f(bVar);
        t(bVar);
        r(bVar);
        y(bVar);
        m(bVar);
        v(bVar);
        k(bVar);
        u(bVar);
        q(bVar);
    }

    public a d(p pVar) {
        this.f13186a.add(pVar);
        return this;
    }

    public a l(boolean z10) {
        this.f13187b = z10;
        return this;
    }
}
