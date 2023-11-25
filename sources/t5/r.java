package t5;

/* compiled from: Response.kt */
/* loaded from: classes.dex */
public interface r {

    /* compiled from: Response.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(r rVar, q qVar) {
            qc.q.i(rVar, "this");
            qc.q.i(qVar, "response");
            if (qVar instanceof s) {
                rVar.c((s) qVar);
            } else if (qVar instanceof b) {
                rVar.g((b) qVar);
            } else if (qVar instanceof p) {
                rVar.e((p) qVar);
            } else if (qVar instanceof u) {
                rVar.f((u) qVar);
            } else if (qVar instanceof t) {
                rVar.d((t) qVar);
            } else {
                rVar.b((h) qVar);
            }
        }
    }

    void a(q qVar);

    void b(h hVar);

    void c(s sVar);

    void d(t tVar);

    void e(p pVar);

    void f(u uVar);

    void g(b bVar);
}
