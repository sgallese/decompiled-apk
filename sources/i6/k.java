package i6;

import java.util.concurrent.Executor;

/* compiled from: ExecutionModule_ExecutorFactory.java */
/* loaded from: classes.dex */
public final class k implements k6.b<Executor> {

    /* compiled from: ExecutionModule_ExecutorFactory.java */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final k f17080a = new k();
    }

    public static k a() {
        return a.f17080a;
    }

    public static Executor b() {
        return (Executor) k6.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // cc.a
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
