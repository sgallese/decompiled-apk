package c8;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final Object f8883a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private Queue f8884b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8885c;

    public final void a(m mVar) {
        synchronized (this.f8883a) {
            if (this.f8884b == null) {
                this.f8884b = new ArrayDeque();
            }
            this.f8884b.add(mVar);
        }
    }

    public final void b(d dVar) {
        m mVar;
        synchronized (this.f8883a) {
            if (this.f8884b != null && !this.f8885c) {
                this.f8885c = true;
                while (true) {
                    synchronized (this.f8883a) {
                        mVar = (m) this.f8884b.poll();
                        if (mVar == null) {
                            this.f8885c = false;
                            return;
                        }
                    }
                    mVar.a(dVar);
                }
            }
        }
    }
}
