package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: CallbackToFutureAdapter.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: CallbackToFutureAdapter.java */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        Object f3196a;

        /* renamed from: b  reason: collision with root package name */
        d<T> f3197b;

        /* renamed from: c  reason: collision with root package name */
        private androidx.concurrent.futures.d<Void> f3198c = androidx.concurrent.futures.d.w();

        /* renamed from: d  reason: collision with root package name */
        private boolean f3199d;

        a() {
        }

        private void d() {
            this.f3196a = null;
            this.f3197b = null;
            this.f3198c = null;
        }

        void a() {
            this.f3196a = null;
            this.f3197b = null;
            this.f3198c.s(null);
        }

        public boolean b(T t10) {
            boolean z10 = true;
            this.f3199d = true;
            d<T> dVar = this.f3197b;
            if (dVar == null || !dVar.b(t10)) {
                z10 = false;
            }
            if (z10) {
                d();
            }
            return z10;
        }

        public boolean c() {
            boolean z10 = true;
            this.f3199d = true;
            d<T> dVar = this.f3197b;
            if (dVar == null || !dVar.a(true)) {
                z10 = false;
            }
            if (z10) {
                d();
            }
            return z10;
        }

        public boolean e(Throwable th) {
            boolean z10 = true;
            this.f3199d = true;
            d<T> dVar = this.f3197b;
            if (dVar == null || !dVar.c(th)) {
                z10 = false;
            }
            if (z10) {
                d();
            }
            return z10;
        }

        protected void finalize() {
            androidx.concurrent.futures.d<Void> dVar;
            d<T> dVar2 = this.f3197b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3196a));
            }
            if (!this.f3199d && (dVar = this.f3198c) != null) {
                dVar.s(null);
            }
        }
    }

    /* compiled from: CallbackToFutureAdapter.java */
    /* loaded from: classes.dex */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* compiled from: CallbackToFutureAdapter.java */
    /* renamed from: androidx.concurrent.futures.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0060c<T> {
        Object a(a<T> aVar) throws Exception;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CallbackToFutureAdapter.java */
    /* loaded from: classes.dex */
    public static final class d<T> implements com.google.common.util.concurrent.a<T> {

        /* renamed from: f  reason: collision with root package name */
        final WeakReference<a<T>> f3200f;

        /* renamed from: m  reason: collision with root package name */
        private final androidx.concurrent.futures.a<T> f3201m = new a();

        /* compiled from: CallbackToFutureAdapter.java */
        /* loaded from: classes.dex */
        class a extends androidx.concurrent.futures.a<T> {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String p() {
                a<T> aVar = d.this.f3200f.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f3196a + "]";
            }
        }

        d(a<T> aVar) {
            this.f3200f = new WeakReference<>(aVar);
        }

        boolean a(boolean z10) {
            return this.f3201m.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.a
        public void addListener(Runnable runnable, Executor executor) {
            this.f3201m.addListener(runnable, executor);
        }

        boolean b(T t10) {
            return this.f3201m.s(t10);
        }

        boolean c(Throwable th) {
            return this.f3201m.t(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f3200f.get();
            boolean cancel = this.f3201m.cancel(z10);
            if (cancel && aVar != null) {
                aVar.a();
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            return this.f3201m.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f3201m.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f3201m.isDone();
        }

        public String toString() {
            return this.f3201m.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.f3201m.get(j10, timeUnit);
        }
    }

    public static <T> com.google.common.util.concurrent.a<T> a(InterfaceC0060c<T> interfaceC0060c) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f3197b = dVar;
        aVar.f3196a = interfaceC0060c.getClass();
        try {
            Object a10 = interfaceC0060c.a(aVar);
            if (a10 != null) {
                aVar.f3196a = a10;
            }
        } catch (Exception e10) {
            dVar.c(e10);
        }
        return dVar;
    }
}
