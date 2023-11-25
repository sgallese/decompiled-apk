package coil.memory;

import coil.memory.MemoryCache;

/* compiled from: RealMemoryCache.kt */
/* loaded from: classes.dex */
public final class d implements MemoryCache {

    /* renamed from: a  reason: collision with root package name */
    private final g f9035a;

    /* renamed from: b  reason: collision with root package name */
    private final h f9036b;

    public d(g gVar, h hVar) {
        this.f9035a = gVar;
        this.f9036b = hVar;
    }

    @Override // coil.memory.MemoryCache
    public MemoryCache.b a(MemoryCache.Key key) {
        MemoryCache.b a10 = this.f9035a.a(key);
        if (a10 == null) {
            return this.f9036b.a(key);
        }
        return a10;
    }

    @Override // coil.memory.MemoryCache
    public void b(int i10) {
        this.f9035a.b(i10);
        this.f9036b.b(i10);
    }

    @Override // coil.memory.MemoryCache
    public void c(MemoryCache.Key key, MemoryCache.b bVar) {
        this.f9035a.c(MemoryCache.Key.b(key, null, g5.c.b(key.c()), 1, null), bVar.a(), g5.c.b(bVar.b()));
    }
}
