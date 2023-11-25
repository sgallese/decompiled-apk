package p6;

import java.util.Iterator;
import java.util.concurrent.Executor;
import r6.a;

/* compiled from: WorkInitializer.java */
/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f21161a;

    /* renamed from: b  reason: collision with root package name */
    private final q6.d f21162b;

    /* renamed from: c  reason: collision with root package name */
    private final x f21163c;

    /* renamed from: d  reason: collision with root package name */
    private final r6.a f21164d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Executor executor, q6.d dVar, x xVar, r6.a aVar) {
        this.f21161a = executor;
        this.f21162b = dVar;
        this.f21163c = xVar;
        this.f21164d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator<i6.p> it = this.f21162b.F().iterator();
        while (it.hasNext()) {
            this.f21163c.a(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f21164d.d(new a.InterfaceC0500a() { // from class: p6.u
            @Override // r6.a.InterfaceC0500a
            public final Object execute() {
                Object d10;
                d10 = v.this.d();
                return d10;
            }
        });
    }

    public void c() {
        this.f21161a.execute(new Runnable() { // from class: p6.t
            @Override // java.lang.Runnable
            public final void run() {
                v.this.e();
            }
        });
    }
}
