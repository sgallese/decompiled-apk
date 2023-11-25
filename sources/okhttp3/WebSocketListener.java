package okhttp3;

import okio.f;
import qc.q;

/* compiled from: WebSocketListener.kt */
/* loaded from: classes4.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i10, String str) {
        q.i(webSocket, "webSocket");
        q.i(str, "reason");
    }

    public void onClosing(WebSocket webSocket, int i10, String str) {
        q.i(webSocket, "webSocket");
        q.i(str, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        q.i(webSocket, "webSocket");
        q.i(th, "t");
    }

    public void onMessage(WebSocket webSocket, String str) {
        q.i(webSocket, "webSocket");
        q.i(str, "text");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        q.i(webSocket, "webSocket");
        q.i(response, "response");
    }

    public void onMessage(WebSocket webSocket, f fVar) {
        q.i(webSocket, "webSocket");
        q.i(fVar, "bytes");
    }
}
