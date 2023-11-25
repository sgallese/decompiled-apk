package androidx.paging;

import androidx.lifecycle.LiveData;
import androidx.paging.n1;
import androidx.paging.o;
import java.util.concurrent.Executor;

/* compiled from: LivePagedList.kt */
/* loaded from: classes.dex */
public final class p0 {
    public static final <Key, Value> LiveData<n1<Value>> a(o.c<Key, Value> cVar, n1.d dVar, Key key, n1.a<Value> aVar, Executor executor) {
        qc.q.i(cVar, "<this>");
        qc.q.i(dVar, "config");
        qc.q.i(executor, "fetchExecutor");
        return new o0(cVar, dVar).d(key).b(aVar).c(executor).a();
    }

    public static /* synthetic */ LiveData b(o.c cVar, n1.d dVar, Object obj, n1.a aVar, Executor executor, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        if ((i10 & 8) != 0) {
            executor = l.c.f();
            qc.q.h(executor, "getIOThreadExecutor()");
        }
        return a(cVar, dVar, obj, aVar, executor);
    }
}
