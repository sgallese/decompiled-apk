package okhttp3;

import okio.f;

/* compiled from: WebSocket.kt */
/* loaded from: classes4.dex */
public interface WebSocket {

    /* compiled from: WebSocket.kt */
    /* loaded from: classes4.dex */
    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i10, String str);

    long queueSize();

    Request request();

    boolean send(String str);

    boolean send(f fVar);
}
