package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;

/* compiled from: StrongMemoryCache.kt */
/* loaded from: classes.dex */
public interface g {
    MemoryCache.b a(MemoryCache.Key key);

    void b(int i10);

    void c(MemoryCache.Key key, Bitmap bitmap, Map<String, ? extends Object> map);
}
