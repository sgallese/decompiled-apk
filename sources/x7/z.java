package x7;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public abstract class z implements Closeable {
    public abstract long b();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract InputStream c(long j10, long j11) throws IOException;

    public final synchronized InputStream d() throws IOException {
        return c(0L, b());
    }
}
