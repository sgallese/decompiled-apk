package c8;

import com.google.android.play.core.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;
import x7.w;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class r<ResultT> extends d<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f8888a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final n f8889b = new n();

    /* renamed from: c  reason: collision with root package name */
    private boolean f8890c;

    /* renamed from: d  reason: collision with root package name */
    private Object f8891d;

    /* renamed from: e  reason: collision with root package name */
    private Exception f8892e;

    private final void l() {
        w.b(this.f8890c, "Task is not yet complete");
    }

    private final void m() {
        w.b(!this.f8890c, "Task is already complete");
    }

    private final void n() {
        synchronized (this.f8888a) {
            if (!this.f8890c) {
                return;
            }
            this.f8889b.b(this);
        }
    }

    @Override // c8.d
    public final d<ResultT> a(a<ResultT> aVar) {
        this.f8889b.a(new h(e.f8866a, aVar));
        n();
        return this;
    }

    @Override // c8.d
    public final d<ResultT> b(Executor executor, b bVar) {
        this.f8889b.a(new j(executor, bVar));
        n();
        return this;
    }

    @Override // c8.d
    public final d<ResultT> c(Executor executor, c<? super ResultT> cVar) {
        this.f8889b.a(new l(executor, cVar));
        n();
        return this;
    }

    @Override // c8.d
    public final Exception d() {
        Exception exc;
        synchronized (this.f8888a) {
            exc = this.f8892e;
        }
        return exc;
    }

    @Override // c8.d
    public final ResultT e() {
        ResultT resultt;
        synchronized (this.f8888a) {
            l();
            Exception exc = this.f8892e;
            if (exc == null) {
                resultt = (ResultT) this.f8891d;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return resultt;
    }

    @Override // c8.d
    public final boolean f() {
        boolean z10;
        synchronized (this.f8888a) {
            z10 = this.f8890c;
        }
        return z10;
    }

    @Override // c8.d
    public final boolean g() {
        boolean z10;
        synchronized (this.f8888a) {
            z10 = false;
            if (this.f8890c && this.f8892e == null) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void h(Exception exc) {
        synchronized (this.f8888a) {
            m();
            this.f8890c = true;
            this.f8892e = exc;
        }
        this.f8889b.b(this);
    }

    public final void i(Object obj) {
        synchronized (this.f8888a) {
            m();
            this.f8890c = true;
            this.f8891d = obj;
        }
        this.f8889b.b(this);
    }

    public final boolean j(Exception exc) {
        synchronized (this.f8888a) {
            if (this.f8890c) {
                return false;
            }
            this.f8890c = true;
            this.f8892e = exc;
            this.f8889b.b(this);
            return true;
        }
    }

    public final boolean k(Object obj) {
        synchronized (this.f8888a) {
            if (this.f8890c) {
                return false;
            }
            this.f8890c = true;
            this.f8891d = obj;
            this.f8889b.b(this);
            return true;
        }
    }
}
