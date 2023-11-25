package u5;

import java.util.concurrent.ArrayBlockingQueue;
import qc.h;
import qc.q;

/* compiled from: EventBridge.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f24156e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final f f24157a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f24158b;

    /* renamed from: c  reason: collision with root package name */
    private g f24159c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayBlockingQueue<u5.a> f24160d;

    /* compiled from: EventBridge.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public c(f fVar) {
        q.i(fVar, "channel");
        this.f24157a = fVar;
        this.f24158b = new Object();
        this.f24160d = new ArrayBlockingQueue<>(512);
    }

    public final void a(u5.a aVar) {
        g gVar;
        q.i(aVar, "event");
        synchronized (this.f24158b) {
            if (this.f24159c == null) {
                this.f24160d.offer(aVar);
            }
            gVar = this.f24159c;
        }
        if (gVar != null) {
            gVar.a(this.f24157a, aVar);
        }
    }
}
