package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes4.dex */
public final class l0 {
    public static final y0 a(File file) throws FileNotFoundException {
        return m0.b(file);
    }

    public static final y0 b() {
        return n0.a();
    }

    public static final d c(y0 y0Var) {
        return n0.b(y0Var);
    }

    public static final e d(Source source) {
        return n0.c(source);
    }

    public static final boolean e(AssertionError assertionError) {
        return m0.c(assertionError);
    }

    public static final y0 f(File file, boolean z10) throws FileNotFoundException {
        return m0.d(file, z10);
    }

    public static final y0 g(OutputStream outputStream) {
        return m0.e(outputStream);
    }

    public static final y0 h(Socket socket) throws IOException {
        return m0.f(socket);
    }

    public static final Source j(File file) throws FileNotFoundException {
        return m0.h(file);
    }

    public static final Source k(InputStream inputStream) {
        return m0.i(inputStream);
    }

    public static final Source l(Socket socket) throws IOException {
        return m0.j(socket);
    }
}
