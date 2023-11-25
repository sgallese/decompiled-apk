package okhttp3.internal.http2;

import java.io.IOException;
import qc.q;

/* compiled from: StreamResetException.kt */
/* loaded from: classes4.dex */
public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode) {
        super(q.q("stream was reset: ", errorCode));
        q.i(errorCode, "errorCode");
        this.errorCode = errorCode;
    }
}
