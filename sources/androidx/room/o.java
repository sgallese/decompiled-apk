package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SharedSQLiteStatement.java */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f7079a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final i f7080b;

    /* renamed from: c  reason: collision with root package name */
    private volatile x3.f f7081c;

    public o(i iVar) {
        this.f7080b = iVar;
    }

    private x3.f c() {
        return this.f7080b.d(d());
    }

    private x3.f e(boolean z10) {
        if (z10) {
            if (this.f7081c == null) {
                this.f7081c = c();
            }
            return this.f7081c;
        }
        return c();
    }

    public x3.f a() {
        b();
        return e(this.f7079a.compareAndSet(false, true));
    }

    protected void b() {
        this.f7080b.a();
    }

    protected abstract String d();

    public void f(x3.f fVar) {
        if (fVar == this.f7081c) {
            this.f7079a.set(false);
        }
    }
}
