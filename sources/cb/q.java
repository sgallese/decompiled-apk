package cb;

import cb.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: RegistryImpl.java */
/* loaded from: classes4.dex */
class q implements i.b {

    /* renamed from: a  reason: collision with root package name */
    private final List<i> f8940a;

    /* renamed from: b  reason: collision with root package name */
    private final List<i> f8941b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<i> f8942c = new HashSet(3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(List<i> list) {
        this.f8940a = list;
        this.f8941b = new ArrayList(list.size());
    }

    private void c(i iVar) {
        if (!this.f8941b.contains(iVar)) {
            if (!this.f8942c.contains(iVar)) {
                this.f8942c.add(iVar);
                iVar.configure(this);
                this.f8942c.remove(iVar);
                if (!this.f8941b.contains(iVar)) {
                    if (db.a.class.isAssignableFrom(iVar.getClass())) {
                        this.f8941b.add(0, iVar);
                        return;
                    } else {
                        this.f8941b.add(iVar);
                        return;
                    }
                }
                return;
            }
            throw new IllegalStateException("Cyclic dependency chain found: " + this.f8942c);
        }
    }

    private static <P extends i> P d(List<i> list, Class<P> cls) {
        Iterator<i> it = list.iterator();
        while (it.hasNext()) {
            P p10 = (P) it.next();
            if (cls.isAssignableFrom(p10.getClass())) {
                return p10;
            }
        }
        return null;
    }

    private <P extends i> P e(Class<P> cls) {
        P p10 = (P) d(this.f8941b, cls);
        if (p10 == null) {
            p10 = (P) d(this.f8940a, cls);
            if (p10 != null) {
                c(p10);
            } else {
                throw new IllegalStateException("Requested plugin is not added: " + cls.getName() + ", plugins: " + this.f8940a);
            }
        }
        return p10;
    }

    @Override // cb.i.b
    public <P extends i> void a(Class<P> cls, i.a<? super P> aVar) {
        aVar.a(e(cls));
    }

    @Override // cb.i.b
    public <P extends i> P b(Class<P> cls) {
        return (P) e(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<i> f() {
        Iterator<i> it = this.f8940a.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
        return this.f8941b;
    }
}
