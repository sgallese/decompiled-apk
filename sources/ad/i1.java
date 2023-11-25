package ad;

import ad.h1;
import java.util.concurrent.locks.LockSupport;

/* compiled from: EventLoop.kt */
/* loaded from: classes4.dex */
public abstract class i1 extends g1 {
    protected abstract Thread d1();

    /* JADX INFO: Access modifiers changed from: protected */
    public void e1(long j10, h1.c cVar) {
        p0.f546u.o1(j10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f1() {
        Thread d12 = d1();
        if (Thread.currentThread() != d12) {
            c.a();
            LockSupport.unpark(d12);
        }
    }
}
