package j0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: Applier.kt */
/* loaded from: classes.dex */
public abstract class a<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f18510a;

    /* renamed from: b  reason: collision with root package name */
    private final List<T> f18511b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private T f18512c;

    public a(T t10) {
        this.f18510a = t10;
        this.f18512c = t10;
    }

    @Override // j0.f
    public T b() {
        return this.f18512c;
    }

    @Override // j0.f
    public final void clear() {
        this.f18511b.clear();
        l(this.f18510a);
        k();
    }

    @Override // j0.f
    public void d(T t10) {
        this.f18511b.add(b());
        l(t10);
    }

    @Override // j0.f
    public /* synthetic */ void e() {
        e.a(this);
    }

    @Override // j0.f
    public void g() {
        if ((!this.f18511b.isEmpty()) != false) {
            l(this.f18511b.remove(r0.size() - 1));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // j0.f
    public /* synthetic */ void i() {
        e.b(this);
    }

    public final T j() {
        return this.f18510a;
    }

    protected abstract void k();

    protected void l(T t10) {
        this.f18512c = t10;
    }
}
