package aa;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FlgTransport.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    private static final v9.a f410d = v9.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final String f411a;

    /* renamed from: b  reason: collision with root package name */
    private final i9.b<g6.g> f412b;

    /* renamed from: c  reason: collision with root package name */
    private g6.f<ba.i> f413c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(i9.b<g6.g> bVar, String str) {
        this.f411a = str;
        this.f412b = bVar;
    }

    private boolean a() {
        if (this.f413c == null) {
            g6.g gVar = this.f412b.get();
            if (gVar != null) {
                this.f413c = gVar.a(this.f411a, ba.i.class, g6.b.b("proto"), new g6.e() { // from class: aa.a
                    @Override // g6.e
                    public final Object apply(Object obj) {
                        return ((ba.i) obj).v();
                    }
                });
            } else {
                f410d.j("Flg TransportFactory is not available at the moment");
            }
        }
        if (this.f413c != null) {
            return true;
        }
        return false;
    }

    public void b(ba.i iVar) {
        if (!a()) {
            f410d.j("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.f413c.a(g6.c.d(iVar));
        }
    }
}
