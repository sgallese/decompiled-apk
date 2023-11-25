package i6;

import java.util.Set;

/* compiled from: TransportFactoryImpl.java */
/* loaded from: classes.dex */
final class q implements g6.g {

    /* renamed from: a  reason: collision with root package name */
    private final Set<g6.b> f17084a;

    /* renamed from: b  reason: collision with root package name */
    private final p f17085b;

    /* renamed from: c  reason: collision with root package name */
    private final t f17086c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Set<g6.b> set, p pVar, t tVar) {
        this.f17084a = set;
        this.f17085b = pVar;
        this.f17086c = tVar;
    }

    @Override // g6.g
    public <T> g6.f<T> a(String str, Class<T> cls, g6.b bVar, g6.e<T, byte[]> eVar) {
        if (this.f17084a.contains(bVar)) {
            return new s(this.f17085b, str, bVar, eVar, this.f17086c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f17084a));
    }
}
