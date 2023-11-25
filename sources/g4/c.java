package g4;

import androidx.lifecycle.f0;
import androidx.work.o;

/* compiled from: OperationImpl.java */
/* loaded from: classes.dex */
public class c implements o {

    /* renamed from: c  reason: collision with root package name */
    private final f0<o.b> f16109c = new f0<>();

    /* renamed from: d  reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<o.b.c> f16110d = androidx.work.impl.utils.futures.c.s();

    public c() {
        a(o.f7598b);
    }

    public void a(o.b bVar) {
        this.f16109c.n(bVar);
        if (bVar instanceof o.b.c) {
            this.f16110d.o((o.b.c) bVar);
        } else if (bVar instanceof o.b.a) {
            this.f16110d.p(((o.b.a) bVar).a());
        }
    }
}
