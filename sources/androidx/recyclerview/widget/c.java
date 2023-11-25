package androidx.recyclerview.widget;

import androidx.recyclerview.widget.i;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: AsyncDifferConfig.java */
/* loaded from: classes.dex */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f6688a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f6689b;

    /* renamed from: c  reason: collision with root package name */
    private final i.f<T> f6690c;

    /* compiled from: AsyncDifferConfig.java */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: d  reason: collision with root package name */
        private static final Object f6691d = new Object();

        /* renamed from: e  reason: collision with root package name */
        private static Executor f6692e;

        /* renamed from: a  reason: collision with root package name */
        private Executor f6693a;

        /* renamed from: b  reason: collision with root package name */
        private Executor f6694b;

        /* renamed from: c  reason: collision with root package name */
        private final i.f<T> f6695c;

        public a(i.f<T> fVar) {
            this.f6695c = fVar;
        }

        public c<T> a() {
            if (this.f6694b == null) {
                synchronized (f6691d) {
                    if (f6692e == null) {
                        f6692e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f6694b = f6692e;
            }
            return new c<>(this.f6693a, this.f6694b, this.f6695c);
        }
    }

    c(Executor executor, Executor executor2, i.f<T> fVar) {
        this.f6688a = executor;
        this.f6689b = executor2;
        this.f6690c = fVar;
    }

    public Executor a() {
        return this.f6689b;
    }

    public i.f<T> b() {
        return this.f6690c;
    }
}
