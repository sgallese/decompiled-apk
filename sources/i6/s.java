package i6;

/* compiled from: TransportImpl.java */
/* loaded from: classes.dex */
final class s<T> implements g6.f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final p f17087a;

    /* renamed from: b  reason: collision with root package name */
    private final String f17088b;

    /* renamed from: c  reason: collision with root package name */
    private final g6.b f17089c;

    /* renamed from: d  reason: collision with root package name */
    private final g6.e<T, byte[]> f17090d;

    /* renamed from: e  reason: collision with root package name */
    private final t f17091e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(p pVar, String str, g6.b bVar, g6.e<T, byte[]> eVar, t tVar) {
        this.f17087a = pVar;
        this.f17088b = str;
        this.f17089c = bVar;
        this.f17090d = eVar;
        this.f17091e = tVar;
    }

    @Override // g6.f
    public void a(g6.c<T> cVar) {
        b(cVar, new g6.h() { // from class: i6.r
            @Override // g6.h
            public final void a(Exception exc) {
                s.e(exc);
            }
        });
    }

    @Override // g6.f
    public void b(g6.c<T> cVar, g6.h hVar) {
        this.f17091e.a(o.a().e(this.f17087a).c(cVar).f(this.f17088b).d(this.f17090d).b(this.f17089c).a(), hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p d() {
        return this.f17087a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Exception exc) {
    }
}
