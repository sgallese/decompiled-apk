package k4;

import java.util.ArrayList;
import java.util.List;
import n4.p;

/* compiled from: ConstraintController.java */
/* loaded from: classes.dex */
public abstract class c<T> implements j4.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f19336a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private T f19337b;

    /* renamed from: c  reason: collision with root package name */
    private l4.d<T> f19338c;

    /* renamed from: d  reason: collision with root package name */
    private a f19339d;

    /* compiled from: ConstraintController.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(l4.d<T> dVar) {
        this.f19338c = dVar;
    }

    private void h(a aVar, T t10) {
        if (!this.f19336a.isEmpty() && aVar != null) {
            if (t10 != null && !c(t10)) {
                aVar.a(this.f19336a);
            } else {
                aVar.b(this.f19336a);
            }
        }
    }

    @Override // j4.a
    public void a(T t10) {
        this.f19337b = t10;
        h(this.f19339d, t10);
    }

    abstract boolean b(p pVar);

    abstract boolean c(T t10);

    public boolean d(String str) {
        T t10 = this.f19337b;
        if (t10 != null && c(t10) && this.f19336a.contains(str)) {
            return true;
        }
        return false;
    }

    public void e(Iterable<p> iterable) {
        this.f19336a.clear();
        for (p pVar : iterable) {
            if (b(pVar)) {
                this.f19336a.add(pVar.f20192a);
            }
        }
        if (this.f19336a.isEmpty()) {
            this.f19338c.c(this);
        } else {
            this.f19338c.a(this);
        }
        h(this.f19339d, this.f19337b);
    }

    public void f() {
        if (!this.f19336a.isEmpty()) {
            this.f19336a.clear();
            this.f19338c.c(this);
        }
    }

    public void g(a aVar) {
        if (this.f19339d != aVar) {
            this.f19339d = aVar;
            h(aVar, this.f19337b);
        }
    }
}
