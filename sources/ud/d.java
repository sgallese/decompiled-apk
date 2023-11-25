package ud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import qd.h;
import qd.m;
import qd.n;
import td.s;

/* compiled from: Parser.java */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final List<vd.e> f24225a;

    /* renamed from: b  reason: collision with root package name */
    private final List<wd.a> f24226b;

    /* renamed from: c  reason: collision with root package name */
    private final ud.c f24227c;

    /* renamed from: d  reason: collision with root package name */
    private final List<e> f24228d;

    /* compiled from: Parser.java */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<vd.e> f24229a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<wd.a> f24230b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final List<e> f24231c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private Set<Class<? extends td.a>> f24232d = h.s();

        /* renamed from: e  reason: collision with root package name */
        private ud.c f24233e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Parser.java */
        /* loaded from: classes4.dex */
        public class a implements ud.c {
            a() {
            }

            @Override // ud.c
            public ud.a a(ud.b bVar) {
                return new n(bVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ud.c i() {
            ud.c cVar = this.f24233e;
            if (cVar != null) {
                return cVar;
            }
            return new a();
        }

        public d f() {
            return new d(this);
        }

        public b g(wd.a aVar) {
            if (aVar != null) {
                this.f24230b.add(aVar);
                return this;
            }
            throw new NullPointerException("delimiterProcessor must not be null");
        }

        public b h(Iterable<? extends nd.a> iterable) {
            if (iterable != null) {
                for (nd.a aVar : iterable) {
                    if (aVar instanceof c) {
                        ((c) aVar).a(this);
                    }
                }
                return this;
            }
            throw new NullPointerException("extensions must not be null");
        }
    }

    /* compiled from: Parser.java */
    /* loaded from: classes4.dex */
    public interface c extends nd.a {
        void a(b bVar);
    }

    private h a() {
        return new h(this.f24225a, this.f24227c, this.f24226b);
    }

    private s c(s sVar) {
        Iterator<e> it = this.f24228d.iterator();
        while (it.hasNext()) {
            sVar = it.next().a(sVar);
        }
        return sVar;
    }

    public s b(String str) {
        if (str != null) {
            return c(a().u(str));
        }
        throw new NullPointerException("input must not be null");
    }

    private d(b bVar) {
        this.f24225a = h.l(bVar.f24229a, bVar.f24232d);
        ud.c i10 = bVar.i();
        this.f24227c = i10;
        this.f24228d = bVar.f24231c;
        List<wd.a> list = bVar.f24230b;
        this.f24226b = list;
        i10.a(new m(list, Collections.emptyMap()));
    }
}
