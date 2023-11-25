package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class m0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f20651a = Logger.getLogger("okio.Okio");

    public static final y0 b(File file) throws FileNotFoundException {
        qc.q.i(file, "<this>");
        return l0.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        boolean z10;
        qc.q.i(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z10 = yc.w.K(message, "getsockname failed", false, 2, null);
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public static final y0 d(File file, boolean z10) throws FileNotFoundException {
        qc.q.i(file, "<this>");
        return l0.g(new FileOutputStream(file, z10));
    }

    public static final y0 e(OutputStream outputStream) {
        qc.q.i(outputStream, "<this>");
        return new p0(outputStream, new a1());
    }

    public static final y0 f(Socket socket) throws IOException {
        qc.q.i(socket, "<this>");
        z0 z0Var = new z0(socket);
        OutputStream outputStream = socket.getOutputStream();
        qc.q.h(outputStream, "getOutputStream()");
        return z0Var.sink(new p0(outputStream, z0Var));
    }

    public static /* synthetic */ y0 g(File file, boolean z10, int i10, Object obj) throws FileNotFoundException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return l0.f(file, z10);
    }

    public static final Source h(File file) throws FileNotFoundException {
        qc.q.i(file, "<this>");
        return new q(new FileInputStream(file), a1.NONE);
    }

    public static final Source i(InputStream inputStream) {
        qc.q.i(inputStream, "<this>");
        return new q(inputStream, new a1());
    }

    public static final Source j(Socket socket) throws IOException {
        qc.q.i(socket, "<this>");
        z0 z0Var = new z0(socket);
        InputStream inputStream = socket.getInputStream();
        qc.q.h(inputStream, "getInputStream()");
        return z0Var.source(new q(inputStream, z0Var));
    }
}
