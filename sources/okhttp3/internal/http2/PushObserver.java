package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import okio.e;
import qc.q;

/* compiled from: PushObserver.kt */
/* loaded from: classes4.dex */
public interface PushObserver {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    /* compiled from: PushObserver.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* compiled from: PushObserver.kt */
        /* loaded from: classes4.dex */
        private static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int i10, e eVar, int i11, boolean z10) throws IOException {
                q.i(eVar, "source");
                eVar.skip(i11);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i10, List<Header> list, boolean z10) {
                q.i(list, "responseHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i10, List<Header> list) {
                q.i(list, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int i10, ErrorCode errorCode) {
                q.i(errorCode, "errorCode");
            }
        }

        private Companion() {
        }
    }

    boolean onData(int i10, e eVar, int i11, boolean z10) throws IOException;

    boolean onHeaders(int i10, List<Header> list, boolean z10);

    boolean onRequest(int i10, List<Header> list);

    void onReset(int i10, ErrorCode errorCode);
}
