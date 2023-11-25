package qd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import qd.c;
import qd.i;
import qd.j;
import qd.k;
import qd.l;
import qd.p;
import qd.t;
import td.y;

/* compiled from: DocumentParser.java */
/* loaded from: classes4.dex */
public class h implements vd.h {

    /* renamed from: p  reason: collision with root package name */
    private static final Set<Class<? extends td.a>> f21715p = new LinkedHashSet(Arrays.asList(td.b.class, td.j.class, td.h.class, td.k.class, y.class, td.q.class, td.n.class));

    /* renamed from: q  reason: collision with root package name */
    private static final Map<Class<? extends td.a>, vd.e> f21716q;

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f21717a;

    /* renamed from: d  reason: collision with root package name */
    private boolean f21720d;

    /* renamed from: h  reason: collision with root package name */
    private boolean f21724h;

    /* renamed from: i  reason: collision with root package name */
    private final List<vd.e> f21725i;

    /* renamed from: j  reason: collision with root package name */
    private final ud.c f21726j;

    /* renamed from: k  reason: collision with root package name */
    private final List<wd.a> f21727k;

    /* renamed from: l  reason: collision with root package name */
    private final g f21728l;

    /* renamed from: b  reason: collision with root package name */
    private int f21718b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f21719c = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f21721e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f21722f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f21723g = 0;

    /* renamed from: m  reason: collision with root package name */
    private final Map<String, td.p> f21729m = new LinkedHashMap();

    /* renamed from: n  reason: collision with root package name */
    private List<vd.d> f21730n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    private Set<vd.d> f21731o = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DocumentParser.java */
    /* loaded from: classes4.dex */
    public static class a implements vd.g {

        /* renamed from: a  reason: collision with root package name */
        private final vd.d f21732a;

        public a(vd.d dVar) {
            this.f21732a = dVar;
        }

        @Override // vd.g
        public vd.d a() {
            return this.f21732a;
        }

        @Override // vd.g
        public CharSequence b() {
            vd.d dVar = this.f21732a;
            if (!(dVar instanceof r)) {
                return null;
            }
            CharSequence i10 = ((r) dVar).i();
            if (i10.length() == 0) {
                return null;
            }
            return i10;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(td.b.class, new c.a());
        hashMap.put(td.j.class, new j.a());
        hashMap.put(td.h.class, new i.a());
        hashMap.put(td.k.class, new k.b());
        hashMap.put(y.class, new t.a());
        hashMap.put(td.q.class, new p.a());
        hashMap.put(td.n.class, new l.a());
        f21716q = Collections.unmodifiableMap(hashMap);
    }

    public h(List<vd.e> list, ud.c cVar, List<wd.a> list2) {
        this.f21725i = list;
        this.f21726j = cVar;
        this.f21727k = list2;
        g gVar = new g();
        this.f21728l = gVar;
        g(gVar);
    }

    private void g(vd.d dVar) {
        this.f21730n.add(dVar);
        this.f21731o.add(dVar);
    }

    private <T extends vd.d> T h(T t10) {
        while (!e().c(t10.e())) {
            n(e());
        }
        e().e().b(t10.e());
        g(t10);
        return t10;
    }

    private void i(r rVar) {
        for (td.p pVar : rVar.j()) {
            rVar.e().i(pVar);
            String n10 = pVar.n();
            if (!this.f21729m.containsKey(n10)) {
                this.f21729m.put(n10, pVar);
            }
        }
    }

    private void j() {
        CharSequence subSequence;
        if (this.f21720d) {
            int i10 = this.f21718b + 1;
            CharSequence charSequence = this.f21717a;
            CharSequence subSequence2 = charSequence.subSequence(i10, charSequence.length());
            int a10 = sd.d.a(this.f21719c);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + a10);
            for (int i11 = 0; i11 < a10; i11++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f21717a;
            subSequence = charSequence2.subSequence(this.f21718b, charSequence2.length());
        }
        e().h(subSequence);
    }

    private void k() {
        if (this.f21717a.charAt(this.f21718b) == '\t') {
            this.f21718b++;
            int i10 = this.f21719c;
            this.f21719c = i10 + sd.d.a(i10);
            return;
        }
        this.f21718b++;
        this.f21719c++;
    }

    public static List<vd.e> l(List<vd.e> list, Set<Class<? extends td.a>> set) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator<Class<? extends td.a>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(f21716q.get(it.next()));
        }
        return arrayList;
    }

    private void m() {
        this.f21730n.remove(r0.size() - 1);
    }

    private void n(vd.d dVar) {
        if (e() == dVar) {
            m();
        }
        if (dVar instanceof r) {
            i((r) dVar);
        }
        dVar.b();
    }

    private td.f o() {
        p(this.f21730n);
        w();
        return this.f21728l.e();
    }

    private void p(List<vd.d> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            n(list.get(size));
        }
    }

    private d q(vd.d dVar) {
        a aVar = new a(dVar);
        Iterator<vd.e> it = this.f21725i.iterator();
        while (it.hasNext()) {
            vd.f a10 = it.next().a(this, aVar);
            if (a10 instanceof d) {
                return (d) a10;
            }
        }
        return null;
    }

    private void r() {
        int i10 = this.f21718b;
        int i11 = this.f21719c;
        this.f21724h = true;
        int length = this.f21717a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f21717a.charAt(i10);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    this.f21724h = false;
                    break;
                } else {
                    i10++;
                    i11++;
                }
            } else {
                i10++;
                i11 += 4 - (i11 % 4);
            }
        }
        this.f21721e = i10;
        this.f21722f = i11;
        this.f21723g = i11 - this.f21719c;
    }

    public static Set<Class<? extends td.a>> s() {
        return f21715p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f7, code lost:
    
        y(r10.f21721e);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t(java.lang.CharSequence r11) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qd.h.t(java.lang.CharSequence):void");
    }

    private void v() {
        vd.d e10 = e();
        m();
        this.f21731o.remove(e10);
        if (e10 instanceof r) {
            i((r) e10);
        }
        e10.e().l();
    }

    private void w() {
        ud.a a10 = this.f21726j.a(new m(this.f21727k, this.f21729m));
        Iterator<vd.d> it = this.f21731o.iterator();
        while (it.hasNext()) {
            it.next().f(a10);
        }
    }

    private void x(int i10) {
        int i11;
        int i12 = this.f21722f;
        if (i10 >= i12) {
            this.f21718b = this.f21721e;
            this.f21719c = i12;
        }
        int length = this.f21717a.length();
        while (true) {
            i11 = this.f21719c;
            if (i11 >= i10 || this.f21718b == length) {
                break;
            }
            k();
        }
        if (i11 > i10) {
            this.f21718b--;
            this.f21719c = i10;
            this.f21720d = true;
            return;
        }
        this.f21720d = false;
    }

    private void y(int i10) {
        int i11 = this.f21721e;
        if (i10 >= i11) {
            this.f21718b = i11;
            this.f21719c = this.f21722f;
        }
        int length = this.f21717a.length();
        while (true) {
            int i12 = this.f21718b;
            if (i12 >= i10 || i12 == length) {
                break;
            }
            k();
        }
        this.f21720d = false;
    }

    @Override // vd.h
    public boolean a() {
        return this.f21724h;
    }

    @Override // vd.h
    public int b() {
        return this.f21723g;
    }

    @Override // vd.h
    public CharSequence c() {
        return this.f21717a;
    }

    @Override // vd.h
    public int d() {
        return this.f21721e;
    }

    @Override // vd.h
    public vd.d e() {
        return this.f21730n.get(r0.size() - 1);
    }

    @Override // vd.h
    public int f() {
        return this.f21719c;
    }

    @Override // vd.h
    public int getIndex() {
        return this.f21718b;
    }

    public td.f u(String str) {
        int i10 = 0;
        while (true) {
            int c10 = sd.d.c(str, i10);
            if (c10 == -1) {
                break;
            }
            t(str.substring(i10, c10));
            i10 = c10 + 1;
            if (i10 < str.length() && str.charAt(c10) == '\r' && str.charAt(i10) == '\n') {
                i10 = c10 + 2;
            }
        }
        if (str.length() > 0 && (i10 == 0 || i10 < str.length())) {
            t(str.substring(i10));
        }
        return o();
    }
}
