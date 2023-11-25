package androidx.concurrent.futures;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractResolvableFuture.java */
/* loaded from: classes.dex */
public abstract class a<V> implements com.google.common.util.concurrent.a<V> {

    /* renamed from: q  reason: collision with root package name */
    static final boolean f3169q = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: r  reason: collision with root package name */
    private static final Logger f3170r = Logger.getLogger(a.class.getName());

    /* renamed from: s  reason: collision with root package name */
    static final b f3171s;

    /* renamed from: t  reason: collision with root package name */
    private static final Object f3172t;

    /* renamed from: f  reason: collision with root package name */
    volatile Object f3173f;

    /* renamed from: m  reason: collision with root package name */
    volatile e f3174m;

    /* renamed from: p  reason: collision with root package name */
    volatile i f3175p;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f3176c;

        /* renamed from: d  reason: collision with root package name */
        static final c f3177d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f3178a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f3179b;

        static {
            if (a.f3169q) {
                f3177d = null;
                f3176c = null;
                return;
            }
            f3177d = new c(false, null);
            f3176c = new c(true, null);
        }

        c(boolean z10, Throwable th) {
            this.f3178a = z10;
            this.f3179b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f3180b = new d(new C0059a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f3181a;

        /* compiled from: AbstractResolvableFuture.java */
        /* renamed from: androidx.concurrent.futures.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0059a extends Throwable {
            C0059a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f3181a = (Throwable) a.g(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f3182d = new e(null, null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f3183a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f3184b;

        /* renamed from: c  reason: collision with root package name */
        e f3185c;

        e(Runnable runnable, Executor executor) {
            this.f3183a = runnable;
            this.f3184b = executor;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f3186a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f3187b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f3188c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f3189d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f3190e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f3186a = atomicReferenceFieldUpdater;
            this.f3187b = atomicReferenceFieldUpdater2;
            this.f3188c = atomicReferenceFieldUpdater3;
            this.f3189d = atomicReferenceFieldUpdater4;
            this.f3190e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f3189d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f3190e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f3188c, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            this.f3187b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            this.f3186a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final a<V> f3191f;

        /* renamed from: m  reason: collision with root package name */
        final com.google.common.util.concurrent.a<? extends V> f3192m;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3191f.f3173f != this) {
                return;
            }
            if (a.f3171s.b(this.f3191f, this, a.m(this.f3192m))) {
                a.j(this.f3191f);
            }
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f3174m == eVar) {
                    aVar.f3174m = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f3173f == obj) {
                    aVar.f3173f = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f3175p == iVar) {
                    aVar.f3175p = iVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f3195b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f3194a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c  reason: collision with root package name */
        static final i f3193c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f3194a;

        /* renamed from: b  reason: collision with root package name */
        volatile i f3195b;

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f3171s.d(this, iVar);
        }

        void b() {
            Thread thread = this.f3194a;
            if (thread != null) {
                this.f3194a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f3171s.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "p"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "m"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "f"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f3171s = hVar;
        if (th != null) {
            f3170r.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3172t = new Object();
    }

    private void b(StringBuilder sb2) {
        try {
            Object n10 = n(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(u(n10));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    private static CancellationException f(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T g(T t10) {
        t10.getClass();
        return t10;
    }

    private e i(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f3174m;
        } while (!f3171s.a(this, eVar2, e.f3182d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f3185c;
            eVar4.f3185c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.concurrent.futures.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.concurrent.futures.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.concurrent.futures.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.concurrent.futures.a<V>, androidx.concurrent.futures.a] */
    static void j(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.q();
            aVar.d();
            e i10 = aVar.i(eVar);
            while (i10 != null) {
                eVar = i10.f3185c;
                Runnable runnable = i10.f3183a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f3191f;
                    if (aVar.f3173f == gVar) {
                        if (f3171s.b(aVar, gVar, m(gVar.f3192m))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    k(runnable, i10.f3184b);
                }
                i10 = eVar;
            }
            return;
        }
    }

    private static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f3170r.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V l(Object obj) throws ExecutionException {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == f3172t) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).f3181a);
        }
        throw f("Task was cancelled.", ((c) obj).f3179b);
    }

    static Object m(com.google.common.util.concurrent.a<?> aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).f3173f;
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f3178a) {
                    if (cVar.f3179b != null) {
                        return new c(false, cVar.f3179b);
                    }
                    return c.f3177d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f3169q) & isCancelled) {
            return c.f3177d;
        }
        try {
            Object n10 = n(aVar);
            if (n10 == null) {
                return f3172t;
            }
            return n10;
        } catch (CancellationException e10) {
            if (!isCancelled) {
                return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e10));
            }
            return new c(false, e10);
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    static <V> V n(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    private void q() {
        i iVar;
        do {
            iVar = this.f3175p;
        } while (!f3171s.c(this, iVar, i.f3193c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f3195b;
        }
    }

    private void r(i iVar) {
        iVar.f3194a = null;
        while (true) {
            i iVar2 = this.f3175p;
            if (iVar2 == i.f3193c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f3195b;
                if (iVar2.f3194a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f3195b = iVar4;
                    if (iVar3.f3194a == null) {
                        break;
                    }
                } else if (!f3171s.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String u(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.a
    public final void addListener(Runnable runnable, Executor executor) {
        g(runnable);
        g(executor);
        e eVar = this.f3174m;
        if (eVar != e.f3182d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f3185c = eVar;
                if (f3171s.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.f3174m;
            } while (eVar != e.f3182d);
        }
        k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11;
        c cVar;
        boolean z12;
        Object obj = this.f3173f;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 | (obj instanceof g)) {
            if (f3169q) {
                cVar = new c(z10, new CancellationException("Future.cancel() was called."));
            } else if (z10) {
                cVar = c.f3176c;
            } else {
                cVar = c.f3177d;
            }
            boolean z13 = false;
            a<V> aVar = this;
            while (true) {
                if (f3171s.b(aVar, obj, cVar)) {
                    if (z10) {
                        aVar.o();
                    }
                    j(aVar);
                    if (!(obj instanceof g)) {
                        return true;
                    }
                    com.google.common.util.concurrent.a<? extends V> aVar2 = ((g) obj).f3192m;
                    if (aVar2 instanceof a) {
                        aVar = (a) aVar2;
                        obj = aVar.f3173f;
                        if (obj == null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!(z12 | (obj instanceof g))) {
                            return true;
                        }
                        z13 = true;
                    } else {
                        aVar2.cancel(z10);
                        return true;
                    }
                } else {
                    obj = aVar.f3173f;
                    if (!(obj instanceof g)) {
                        return z13;
                    }
                }
            }
        } else {
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f3173f;
            if ((obj != null) & (!(obj instanceof g))) {
                return l(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                i iVar = this.f3175p;
                if (iVar != i.f3193c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f3171s.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f3173f;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return l(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    r(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            r(iVar2);
                        } else {
                            iVar = this.f3175p;
                        }
                    } while (iVar != i.f3193c);
                }
                return l(this.f3173f);
            }
            while (nanos > 0) {
                Object obj3 = this.f3173f;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return l(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j11 = -nanos;
                long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(convert);
                boolean z10 = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z10) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z10) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3173f instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z10;
        if (this.f3173f != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return (!(r0 instanceof g)) & z10;
    }

    protected String p() {
        Object obj = this.f3173f;
        if (obj instanceof g) {
            return "setFuture=[" + u(((g) obj).f3192m) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean s(V v10) {
        if (v10 == null) {
            v10 = (V) f3172t;
        }
        if (f3171s.b(this, null, v10)) {
            j(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean t(Throwable th) {
        if (f3171s.b(this, null, new d((Throwable) g(th)))) {
            j(this);
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = p();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean v() {
        Object obj = this.f3173f;
        if ((obj instanceof c) && ((c) obj).f3178a) {
            return true;
        }
        return false;
    }

    protected void d() {
    }

    protected void o() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3173f;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return l(obj2);
            }
            i iVar = this.f3175p;
            if (iVar != i.f3193c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f3171s.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3173f;
                            } else {
                                r(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return l(obj);
                    }
                    iVar = this.f3175p;
                } while (iVar != i.f3193c);
            }
            return l(this.f3173f);
        }
        throw new InterruptedException();
    }
}
