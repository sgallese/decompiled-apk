package okhttp3.internal.cache;

import java.io.IOException;
import okio.y0;

/* compiled from: CacheRequest.kt */
/* loaded from: classes4.dex */
public interface CacheRequest {
    void abort();

    y0 body() throws IOException;
}
