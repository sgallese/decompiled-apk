package g4;

import android.text.TextUtils;
import androidx.work.l;
import androidx.work.o;
import androidx.work.t;
import androidx.work.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WorkContinuationImpl.java */
/* loaded from: classes.dex */
public class g extends t {

    /* renamed from: j  reason: collision with root package name */
    private static final String f16127j = l.f("WorkContinuationImpl");

    /* renamed from: a  reason: collision with root package name */
    private final j f16128a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16129b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.work.f f16130c;

    /* renamed from: d  reason: collision with root package name */
    private final List<? extends w> f16131d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f16132e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f16133f;

    /* renamed from: g  reason: collision with root package name */
    private final List<g> f16134g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f16135h;

    /* renamed from: i  reason: collision with root package name */
    private o f16136i;

    public g(j jVar, List<? extends w> list) {
        this(jVar, null, androidx.work.f.KEEP, list, null);
    }

    private static boolean i(g gVar, Set<String> set) {
        set.addAll(gVar.c());
        Set<String> l10 = l(gVar);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (l10.contains(it.next())) {
                return true;
            }
        }
        List<g> e10 = gVar.e();
        if (e10 != null && !e10.isEmpty()) {
            Iterator<g> it2 = e10.iterator();
            while (it2.hasNext()) {
                if (i(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.c());
        return false;
    }

    public static Set<String> l(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> e10 = gVar.e();
        if (e10 != null && !e10.isEmpty()) {
            Iterator<g> it = e10.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().c());
            }
        }
        return hashSet;
    }

    public o a() {
        if (!this.f16135h) {
            o4.b bVar = new o4.b(this);
            this.f16128a.p().b(bVar);
            this.f16136i = bVar.d();
        } else {
            l.c().h(f16127j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f16132e)), new Throwable[0]);
        }
        return this.f16136i;
    }

    public androidx.work.f b() {
        return this.f16130c;
    }

    public List<String> c() {
        return this.f16132e;
    }

    public String d() {
        return this.f16129b;
    }

    public List<g> e() {
        return this.f16134g;
    }

    public List<? extends w> f() {
        return this.f16131d;
    }

    public j g() {
        return this.f16128a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f16135h;
    }

    public void k() {
        this.f16135h = true;
    }

    public g(j jVar, String str, androidx.work.f fVar, List<? extends w> list, List<g> list2) {
        this.f16128a = jVar;
        this.f16129b = str;
        this.f16130c = fVar;
        this.f16131d = list;
        this.f16134g = list2;
        this.f16132e = new ArrayList(list.size());
        this.f16133f = new ArrayList();
        if (list2 != null) {
            Iterator<g> it = list2.iterator();
            while (it.hasNext()) {
                this.f16133f.addAll(it.next().f16133f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String a10 = list.get(i10).a();
            this.f16132e.add(a10);
            this.f16133f.add(a10);
        }
    }
}
