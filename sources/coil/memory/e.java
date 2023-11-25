package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;

/* compiled from: StrongMemoryCache.kt */
/* loaded from: classes.dex */
public final class e implements g {

    /* renamed from: a  reason: collision with root package name */
    private final h f9037a;

    /* renamed from: b  reason: collision with root package name */
    private final b f9038b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: StrongMemoryCache.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f9039a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, Object> f9040b;

        /* renamed from: c  reason: collision with root package name */
        private final int f9041c;

        public a(Bitmap bitmap, Map<String, ? extends Object> map, int i10) {
            this.f9039a = bitmap;
            this.f9040b = map;
            this.f9041c = i10;
        }

        public final Bitmap a() {
            return this.f9039a;
        }

        public final Map<String, Object> b() {
            return this.f9040b;
        }

        public final int c() {
            return this.f9041c;
        }
    }

    /* compiled from: StrongMemoryCache.kt */
    /* loaded from: classes.dex */
    public static final class b extends androidx.collection.f<MemoryCache.Key, a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f9042a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, e eVar) {
            super(i10);
            this.f9042a = eVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.f
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z10, MemoryCache.Key key, a aVar, a aVar2) {
            this.f9042a.f9037a.c(key, aVar.a(), aVar.b(), aVar.c());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.f
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public int sizeOf(MemoryCache.Key key, a aVar) {
            return aVar.c();
        }
    }

    public e(int i10, h hVar) {
        this.f9037a = hVar;
        this.f9038b = new b(i10, this);
    }

    @Override // coil.memory.g
    public MemoryCache.b a(MemoryCache.Key key) {
        a aVar = this.f9038b.get(key);
        if (aVar != null) {
            return new MemoryCache.b(aVar.a(), aVar.b());
        }
        return null;
    }

    @Override // coil.memory.g
    public void b(int i10) {
        if (i10 >= 40) {
            e();
            return;
        }
        boolean z10 = false;
        if (10 <= i10 && i10 < 20) {
            z10 = true;
        }
        if (z10) {
            this.f9038b.trimToSize(g() / 2);
        }
    }

    @Override // coil.memory.g
    public void c(MemoryCache.Key key, Bitmap bitmap, Map<String, ? extends Object> map) {
        int a10 = g5.a.a(bitmap);
        if (a10 <= f()) {
            this.f9038b.put(key, new a(bitmap, map, a10));
            return;
        }
        this.f9038b.remove(key);
        this.f9037a.c(key, bitmap, map, a10);
    }

    public void e() {
        this.f9038b.evictAll();
    }

    public int f() {
        return this.f9038b.maxSize();
    }

    public int g() {
        return this.f9038b.size();
    }
}
