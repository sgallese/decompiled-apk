package i6;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransportRuntimeComponent.java */
/* loaded from: classes.dex */
public abstract class v implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TransportRuntimeComponent.java */
    /* loaded from: classes.dex */
    public interface a {
        a a(Context context);

        v build();
    }

    abstract q6.d b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract u c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b().close();
    }
}
