package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;

/* compiled from: StrongMemoryCache.kt */
/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final h f9031a;

    public a(h hVar) {
        this.f9031a = hVar;
    }

    @Override // coil.memory.g
    public MemoryCache.b a(MemoryCache.Key key) {
        return null;
    }

    @Override // coil.memory.g
    public void c(MemoryCache.Key key, Bitmap bitmap, Map<String, ? extends Object> map) {
        this.f9031a.c(key, bitmap, map, g5.a.a(bitmap));
    }

    @Override // coil.memory.g
    public void b(int i10) {
    }
}
