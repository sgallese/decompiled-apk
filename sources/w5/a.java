package w5;

import java.io.File;
import java.io.IOException;
import qc.q;

/* compiled from: FileUtils.kt */
/* loaded from: classes.dex */
public final class a {
    public static final void a(File file) throws IOException {
        q.i(file, "location");
        if (!file.exists() && !file.mkdirs() && !file.isDirectory()) {
            throw new IOException(q.q("Could not create directory at ", file));
        }
    }
}
