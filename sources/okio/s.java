package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JvmSystemFileSystem.kt */
/* loaded from: classes4.dex */
public class s extends j {
    private final List<r0> r(r0 r0Var, boolean z10) {
        File p10 = r0Var.p();
        String[] list = p10.list();
        if (list == null) {
            if (z10) {
                if (!p10.exists()) {
                    throw new FileNotFoundException("no such file: " + r0Var);
                }
                throw new IOException("failed to list " + r0Var);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            qc.q.h(str, "it");
            arrayList.add(r0Var.n(str));
        }
        ec.x.u(arrayList);
        return arrayList;
    }

    private final void s(r0 r0Var) {
        if (!j(r0Var)) {
            return;
        }
        throw new IOException(r0Var + " already exists.");
    }

    private final void t(r0 r0Var) {
        if (j(r0Var)) {
            return;
        }
        throw new IOException(r0Var + " doesn't exist.");
    }

    @Override // okio.j
    public y0 b(r0 r0Var, boolean z10) {
        qc.q.i(r0Var, "file");
        if (z10) {
            t(r0Var);
        }
        return l0.f(r0Var.p(), true);
    }

    @Override // okio.j
    public void c(r0 r0Var, r0 r0Var2) {
        qc.q.i(r0Var, "source");
        qc.q.i(r0Var2, "target");
        if (r0Var.p().renameTo(r0Var2.p())) {
            return;
        }
        throw new IOException("failed to move " + r0Var + " to " + r0Var2);
    }

    @Override // okio.j
    public void g(r0 r0Var, boolean z10) {
        qc.q.i(r0Var, "dir");
        if (!r0Var.p().mkdir()) {
            i m10 = m(r0Var);
            boolean z11 = false;
            if (m10 != null && m10.f()) {
                z11 = true;
            }
            if (z11) {
                if (!z10) {
                    return;
                }
                throw new IOException(r0Var + " already exist.");
            }
            throw new IOException("failed to create directory: " + r0Var);
        }
    }

    @Override // okio.j
    public void i(r0 r0Var, boolean z10) {
        qc.q.i(r0Var, "path");
        if (!Thread.interrupted()) {
            File p10 = r0Var.p();
            if (!p10.delete()) {
                if (!p10.exists()) {
                    if (z10) {
                        throw new FileNotFoundException("no such file: " + r0Var);
                    }
                    return;
                }
                throw new IOException("failed to delete " + r0Var);
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @Override // okio.j
    public List<r0> k(r0 r0Var) {
        qc.q.i(r0Var, "dir");
        List<r0> r10 = r(r0Var, true);
        qc.q.f(r10);
        return r10;
    }

    @Override // okio.j
    public i m(r0 r0Var) {
        qc.q.i(r0Var, "path");
        File p10 = r0Var.p();
        boolean isFile = p10.isFile();
        boolean isDirectory = p10.isDirectory();
        long lastModified = p10.lastModified();
        long length = p10.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !p10.exists()) {
            return null;
        }
        return new i(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null, null, 128, null);
    }

    @Override // okio.j
    public h n(r0 r0Var) {
        qc.q.i(r0Var, "file");
        return new r(false, new RandomAccessFile(r0Var.p(), "r"));
    }

    @Override // okio.j
    public y0 p(r0 r0Var, boolean z10) {
        y0 g10;
        qc.q.i(r0Var, "file");
        if (z10) {
            s(r0Var);
        }
        g10 = m0.g(r0Var.p(), false, 1, null);
        return g10;
    }

    @Override // okio.j
    public Source q(r0 r0Var) {
        qc.q.i(r0Var, "file");
        return l0.j(r0Var.p());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
