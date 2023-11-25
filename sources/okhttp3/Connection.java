package okhttp3;

import java.net.Socket;

/* compiled from: Connection.kt */
/* loaded from: classes4.dex */
public interface Connection {
    Handshake handshake();

    Protocol protocol();

    Route route();

    Socket socket();
}
