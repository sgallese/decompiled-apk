package androidx.paging;

import androidx.lifecycle.LiveData;
import androidx.paging.n1;
import androidx.paging.o;
import java.util.concurrent.Executor;

/* compiled from: LivePagedListBuilder.kt */
/* loaded from: classes.dex */
public final class o0<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    private final pc.a<u1<Key, Value>> f5967a;

    /* renamed from: b  reason: collision with root package name */
    private final o.c<Key, Value> f5968b;

    /* renamed from: c  reason: collision with root package name */
    private final n1.d f5969c;

    /* renamed from: d  reason: collision with root package name */
    private ad.k0 f5970d;

    /* renamed from: e  reason: collision with root package name */
    private Key f5971e;

    /* renamed from: f  reason: collision with root package name */
    private ad.g0 f5972f;

    public o0(o.c<Key, Value> cVar, n1.d dVar) {
        qc.q.i(cVar, "dataSourceFactory");
        qc.q.i(dVar, "config");
        this.f5970d = ad.p1.f548f;
        Executor f10 = l.c.f();
        qc.q.h(f10, "getIOThreadExecutor()");
        this.f5972f = ad.o1.a(f10);
        this.f5967a = null;
        this.f5968b = cVar;
        this.f5969c = dVar;
    }

    public final LiveData<n1<Value>> a() {
        boolean z10;
        pc.a<u1<Key, Value>> aVar = this.f5967a;
        if (aVar == null) {
            o.c<Key, Value> cVar = this.f5968b;
            if (cVar != null) {
                aVar = cVar.asPagingSourceFactory(this.f5972f);
            } else {
                aVar = null;
            }
        }
        pc.a<u1<Key, Value>> aVar2 = aVar;
        if (aVar2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ad.k0 k0Var = this.f5970d;
            Key key = this.f5971e;
            n1.d dVar = this.f5969c;
            Executor h10 = l.c.h();
            qc.q.h(h10, "getMainThreadExecutor()");
            return new n0(k0Var, key, dVar, null, aVar2, ad.o1.a(h10), this.f5972f);
        }
        throw new IllegalStateException("LivePagedList cannot be built without a PagingSourceFactory or DataSource.Factory".toString());
    }

    public final o0<Key, Value> c(Executor executor) {
        qc.q.i(executor, "fetchExecutor");
        this.f5972f = ad.o1.a(executor);
        return this;
    }

    public final o0<Key, Value> d(Key key) {
        this.f5971e = key;
        return this;
    }

    public final o0<Key, Value> b(n1.a<Value> aVar) {
        return this;
    }
}
