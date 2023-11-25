package h5;

import dc.w;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import pc.l;

/* compiled from: EventBridge.kt */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: b  reason: collision with root package name */
    private l<? super b, w> f16473b;

    /* renamed from: a  reason: collision with root package name */
    private final Object f16472a = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayBlockingQueue<b> f16474c = new ArrayBlockingQueue<>(512);

    @Override // h5.c
    public void a(l<? super b, w> lVar) {
        ArrayList<b> arrayList;
        synchronized (this.f16472a) {
            this.f16473b = lVar;
            arrayList = new ArrayList();
            this.f16474c.drainTo(arrayList);
        }
        for (b bVar : arrayList) {
            if (lVar != null) {
                lVar.invoke(bVar);
            }
        }
    }
}
