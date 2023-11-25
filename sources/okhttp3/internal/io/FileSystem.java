package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.Source;
import okio.l0;
import okio.m0;
import okio.y0;
import qc.q;

/* compiled from: FileSystem.kt */
/* loaded from: classes4.dex */
public interface FileSystem {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    /* compiled from: FileSystem.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* compiled from: FileSystem.kt */
        /* loaded from: classes4.dex */
        private static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public y0 appendingSink(File file) throws FileNotFoundException {
                q.i(file, "file");
                try {
                    return l0.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return l0.a(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(File file) throws IOException {
                q.i(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException(q.q("failed to delete ", file));
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(File file) throws IOException {
                q.i(file, "directory");
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i10 = 0;
                    while (i10 < length) {
                        File file2 = listFiles[i10];
                        i10++;
                        if (file2.isDirectory()) {
                            q.h(file2, "file");
                            deleteContents(file2);
                        }
                        if (!file2.delete()) {
                            throw new IOException(q.q("failed to delete ", file2));
                        }
                    }
                    return;
                }
                throw new IOException(q.q("not a readable directory: ", file));
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(File file) {
                q.i(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(File file, File file2) throws IOException {
                q.i(file, "from");
                q.i(file2, "to");
                delete(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            @Override // okhttp3.internal.io.FileSystem
            public y0 sink(File file) throws FileNotFoundException {
                y0 g10;
                y0 g11;
                q.i(file, "file");
                try {
                    g11 = m0.g(file, false, 1, null);
                    return g11;
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    g10 = m0.g(file, false, 1, null);
                    return g10;
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(File file) {
                q.i(file, "file");
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public Source source(File file) throws FileNotFoundException {
                q.i(file, "file");
                return l0.j(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    y0 appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    y0 sink(File file) throws FileNotFoundException;

    long size(File file);

    Source source(File file) throws FileNotFoundException;
}
