package l;

import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor.java */
/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: c  reason: collision with root package name */
    private static volatile c f19468c;

    /* renamed from: d  reason: collision with root package name */
    private static final Executor f19469d = new Executor() { // from class: l.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.i(runnable);
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f19470e = new Executor() { // from class: l.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.j(runnable);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private e f19471a;

    /* renamed from: b  reason: collision with root package name */
    private final e f19472b;

    private c() {
        d dVar = new d();
        this.f19472b = dVar;
        this.f19471a = dVar;
    }

    public static Executor f() {
        return f19470e;
    }

    public static c g() {
        if (f19468c != null) {
            return f19468c;
        }
        synchronized (c.class) {
            if (f19468c == null) {
                f19468c = new c();
            }
        }
        return f19468c;
    }

    public static Executor h() {
        return f19469d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Runnable runnable) {
        g().c(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(Runnable runnable) {
        g().a(runnable);
    }

    @Override // l.e
    public void a(Runnable runnable) {
        this.f19471a.a(runnable);
    }

    @Override // l.e
    public boolean b() {
        return this.f19471a.b();
    }

    @Override // l.e
    public void c(Runnable runnable) {
        this.f19471a.c(runnable);
    }
}
