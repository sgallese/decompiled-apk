package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Configuration.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    final Executor f7399a;

    /* renamed from: b  reason: collision with root package name */
    final Executor f7400b;

    /* renamed from: c  reason: collision with root package name */
    final x f7401c;

    /* renamed from: d  reason: collision with root package name */
    final k f7402d;

    /* renamed from: e  reason: collision with root package name */
    final s f7403e;

    /* renamed from: f  reason: collision with root package name */
    final String f7404f;

    /* renamed from: g  reason: collision with root package name */
    final int f7405g;

    /* renamed from: h  reason: collision with root package name */
    final int f7406h;

    /* renamed from: i  reason: collision with root package name */
    final int f7407i;

    /* renamed from: j  reason: collision with root package name */
    final int f7408j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f7409k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Configuration.java */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f7410a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f7411b;

        a(boolean z10) {
            this.f7411b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str;
            if (this.f7411b) {
                str = "WM.task-";
            } else {
                str = "androidx.work-";
            }
            return new Thread(runnable, str + this.f7410a.incrementAndGet());
        }
    }

    /* compiled from: Configuration.java */
    /* renamed from: androidx.work.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0167b {

        /* renamed from: a  reason: collision with root package name */
        Executor f7413a;

        /* renamed from: b  reason: collision with root package name */
        x f7414b;

        /* renamed from: c  reason: collision with root package name */
        k f7415c;

        /* renamed from: d  reason: collision with root package name */
        Executor f7416d;

        /* renamed from: e  reason: collision with root package name */
        s f7417e;

        /* renamed from: f  reason: collision with root package name */
        String f7418f;

        /* renamed from: g  reason: collision with root package name */
        int f7419g = 4;

        /* renamed from: h  reason: collision with root package name */
        int f7420h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f7421i = Integer.MAX_VALUE;

        /* renamed from: j  reason: collision with root package name */
        int f7422j = 20;

        public b a() {
            return new b(this);
        }
    }

    /* compiled from: Configuration.java */
    /* loaded from: classes.dex */
    public interface c {
        b a();
    }

    b(C0167b c0167b) {
        Executor executor = c0167b.f7413a;
        if (executor == null) {
            this.f7399a = a(false);
        } else {
            this.f7399a = executor;
        }
        Executor executor2 = c0167b.f7416d;
        if (executor2 == null) {
            this.f7409k = true;
            this.f7400b = a(true);
        } else {
            this.f7409k = false;
            this.f7400b = executor2;
        }
        x xVar = c0167b.f7414b;
        if (xVar == null) {
            this.f7401c = x.c();
        } else {
            this.f7401c = xVar;
        }
        k kVar = c0167b.f7415c;
        if (kVar == null) {
            this.f7402d = k.c();
        } else {
            this.f7402d = kVar;
        }
        s sVar = c0167b.f7417e;
        if (sVar == null) {
            this.f7403e = new g4.a();
        } else {
            this.f7403e = sVar;
        }
        this.f7405g = c0167b.f7419g;
        this.f7406h = c0167b.f7420h;
        this.f7407i = c0167b.f7421i;
        this.f7408j = c0167b.f7422j;
        this.f7404f = c0167b.f7418f;
    }

    private Executor a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z10));
    }

    private ThreadFactory b(boolean z10) {
        return new a(z10);
    }

    public String c() {
        return this.f7404f;
    }

    public i d() {
        return null;
    }

    public Executor e() {
        return this.f7399a;
    }

    public k f() {
        return this.f7402d;
    }

    public int g() {
        return this.f7407i;
    }

    public int h() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.f7408j / 2;
        }
        return this.f7408j;
    }

    public int i() {
        return this.f7406h;
    }

    public int j() {
        return this.f7405g;
    }

    public s k() {
        return this.f7403e;
    }

    public Executor l() {
        return this.f7400b;
    }

    public x m() {
        return this.f7401c;
    }
}
