package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
/* loaded from: classes4.dex */
public final class z0 extends a {

    /* renamed from: a  reason: collision with root package name */
    private final Socket f20701a;

    public z0(Socket socket) {
        qc.q.i(socket, "socket");
        this.f20701a = socket;
    }

    @Override // okio.a
    protected IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.a
    protected void timedOut() {
        Logger logger;
        Logger logger2;
        try {
            this.f20701a.close();
        } catch (AssertionError e10) {
            if (l0.e(e10)) {
                logger2 = m0.f20651a;
                logger2.log(Level.WARNING, "Failed to close timed out socket " + this.f20701a, (Throwable) e10);
                return;
            }
            throw e10;
        } catch (Exception e11) {
            logger = m0.f20651a;
            logger.log(Level.WARNING, "Failed to close timed out socket " + this.f20701a, (Throwable) e11);
        }
    }
}
