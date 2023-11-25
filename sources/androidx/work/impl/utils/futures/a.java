package androidx.work.impl.utils.futures;

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

/* compiled from: AbstractFuture.java */
/* loaded from: classes.dex */
public abstract class a<V> implements com.google.common.util.concurrent.a<V> {

    /* renamed from: q  reason: collision with root package name */
    static final boolean f7556q = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: r  reason: collision with root package name */
    private static final Logger f7557r = Logger.getLogger(a.class.getName());

    /* renamed from: s  reason: collision with root package name */
    static final b f7558s;

    /* renamed from: t  reason: collision with root package name */
    private static final Object f7559t;

    /* renamed from: f  reason: collision with root package name */
    volatile Object f7560f;

    /* renamed from: m  reason: collision with root package name */
    volatile e f7561m;

    /* renamed from: p  reason: collision with root package name */
    volatile i f7562p;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
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
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f7563c;

        /* renamed from: d  reason: collision with root package name */
        static final c f7564d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f7565a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f7566b;

        static {
            if (a.f7556q) {
                f7564d = null;
                f7563c = null;
                return;
            }
            f7564d = new c(false, null);
            f7563c = new c(true, null);
        }

        c(boolean z10, Throwable th) {
            this.f7565a = z10;
            this.f7566b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f7567b = new d(new C0171a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f7568a;

        /* compiled from: AbstractFuture.java */
        /* renamed from: androidx.work.impl.utils.futures.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0171a extends Throwable {
            C0171a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f7568a = (Throwable) a.d(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f7569d = new e(null, null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f7570a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f7571b;

        /* renamed from: c  reason: collision with root package name */
        e f7572c;

        e(Runnable runnable, Executor executor) {
            this.f7570a = runnable;
            this.f7571b = executor;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f7573a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f7574b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f7575c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f7576d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f7577e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f7573a = atomicReferenceFieldUpdater;
            this.f7574b = atomicReferenceFieldUpdater2;
            this.f7575c = atomicReferenceFieldUpdater3;
            this.f7576d = atomicReferenceFieldUpdater4;
            this.f7577e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f7576d, aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f7577e, aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f7575c, aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f7574b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f7573a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final a<V> f7578f;

        /* renamed from: m  reason: collision with root package name */
        final com.google.common.util.concurrent.a<? extends V> f7579m;

        g(a<V> aVar, com.google.common.util.concurrent.a<? extends V> aVar2) {
            this.f7578f = aVar;
            this.f7579m = aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7578f.f7560f != this) {
                return;
            }
            if (a.f7558s.b(this.f7578f, this, a.i(this.f7579m))) {
                a.f(this.f7578f);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f7561m == eVar) {
                    aVar.f7561m = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f7560f == obj) {
                    aVar.f7560f = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f7562p == iVar) {
                    aVar.f7562p = iVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f7582b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f7581a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c  reason: collision with root package name */
        static final i f7580c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f7581a;

        /* renamed from: b  reason: collision with root package name */
        volatile i f7582b;

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f7558s.d(this, iVar);
        }

        void b() {
            Thread thread = this.f7581a;
            if (thread != null) {
                this.f7581a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f7558s.e(this, Thread.currentThread());
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
        f7558s = hVar;
        if (th != null) {
            f7557r.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f7559t = new Object();
    }

    private void a(StringBuilder sb2) {
        try {
            Object j10 = j(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(r(j10));
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

    private static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T d(T t10) {
        t10.getClass();
        return t10;
    }

    private e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f7561m;
        } while (!f7558s.a(this, eVar2, e.f7569d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f7572c;
            eVar4.f7572c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.work.impl.utils.futures.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.work.impl.utils.futures.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.work.impl.utils.futures.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.work.impl.utils.futures.a<V>, androidx.work.impl.utils.futures.a] */
    static void f(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.m();
            aVar.b();
            e e10 = aVar.e(eVar);
            while (e10 != null) {
                eVar = e10.f7572c;
                Runnable runnable = e10.f7570a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f7578f;
                    if (aVar.f7560f == gVar) {
                        if (f7558s.b(aVar, gVar, i(gVar.f7579m))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, e10.f7571b);
                }
                e10 = eVar;
            }
            return;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f7557r.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V h(Object obj) throws ExecutionException {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == f7559t) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).f7568a);
        }
        throw c("Task was cancelled.", ((c) obj).f7566b);
    }

    static Object i(com.google.common.util.concurrent.a<?> aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).f7560f;
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f7565a) {
                    if (cVar.f7566b != null) {
                        return new c(false, cVar.f7566b);
                    }
                    return c.f7564d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f7556q) & isCancelled) {
            return c.f7564d;
        }
        try {
            Object j10 = j(aVar);
            if (j10 == null) {
                return f7559t;
            }
            return j10;
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

    private static <V> V j(Future<V> future) throws ExecutionException {
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

    private void m() {
        i iVar;
        do {
            iVar = this.f7562p;
        } while (!f7558s.c(this, iVar, i.f7580c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f7582b;
        }
    }

    private void n(i iVar) {
        iVar.f7581a = null;
        while (true) {
            i iVar2 = this.f7562p;
            if (iVar2 == i.f7580c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f7582b;
                if (iVar2.f7581a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f7582b = iVar4;
                    if (iVar3.f7581a == null) {
                        break;
                    }
                } else if (!f7558s.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String r(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.a
    public final void addListener(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f7561m;
        if (eVar != e.f7569d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f7572c = eVar;
                if (f7558s.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.f7561m;
            } while (eVar != e.f7569d);
        }
        g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11;
        c cVar;
        boolean z12;
        Object obj = this.f7560f;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 | (obj instanceof g)) {
            if (f7556q) {
                cVar = new c(z10, new CancellationException("Future.cancel() was called."));
            } else if (z10) {
                cVar = c.f7563c;
            } else {
                cVar = c.f7564d;
            }
            boolean z13 = false;
            a<V> aVar = this;
            while (true) {
                if (f7558s.b(aVar, obj, cVar)) {
                    if (z10) {
                        aVar.k();
                    }
                    f(aVar);
                    if (!(obj instanceof g)) {
                        return true;
                    }
                    com.google.common.util.concurrent.a<? extends V> aVar2 = ((g) obj).f7579m;
                    if (aVar2 instanceof a) {
                        aVar = (a) aVar2;
                        obj = aVar.f7560f;
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
                    obj = aVar.f7560f;
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
            Object obj = this.f7560f;
            if ((obj != null) & (!(obj instanceof g))) {
                return h(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                i iVar = this.f7562p;
                if (iVar != i.f7580c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f7558s.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f7560f;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return h(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    n(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            n(iVar2);
                        } else {
                            iVar = this.f7562p;
                        }
                    } while (iVar != i.f7580c);
                }
                return h(this.f7560f);
            }
            while (nanos > 0) {
                Object obj3 = this.f7560f;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return h(obj3);
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
        return this.f7560f instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z10;
        if (this.f7560f != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return (!(r0 instanceof g)) & z10;
    }

    protected String l() {
        Object obj = this.f7560f;
        if (obj instanceof g) {
            return "setFuture=[" + r(((g) obj).f7579m) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean o(V v10) {
        if (v10 == null) {
            v10 = (V) f7559t;
        }
        if (f7558s.b(this, null, v10)) {
            f(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p(Throwable th) {
        if (f7558s.b(this, null, new d((Throwable) d(th)))) {
            f(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q(com.google.common.util.concurrent.a<? extends V> aVar) {
        d dVar;
        d(aVar);
        Object obj = this.f7560f;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f7558s.b(this, null, i(aVar))) {
                    return false;
                }
                f(this);
                return true;
            }
            g gVar = new g(this, aVar);
            if (f7558s.b(this, null, gVar)) {
                try {
                    aVar.addListener(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f7567b;
                    }
                    f7558s.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f7560f;
        }
        if (obj instanceof c) {
            aVar.cancel(((c) obj).f7565a);
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
            a(sb2);
        } else {
            try {
                str = l();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected void b() {
    }

    protected void k() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f7560f;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return h(obj2);
            }
            i iVar = this.f7562p;
            if (iVar != i.f7580c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f7558s.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f7560f;
                            } else {
                                n(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return h(obj);
                    }
                    iVar = this.f7562p;
                } while (iVar != i.f7580c);
            }
            return h(this.f7560f);
        }
        throw new InterruptedException();
    }
}
