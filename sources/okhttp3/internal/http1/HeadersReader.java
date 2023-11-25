package okhttp3.internal.http1;

import okhttp3.Headers;
import okio.e;
import qc.h;
import qc.q;

/* compiled from: HeadersReader.kt */
/* loaded from: classes4.dex */
public final class HeadersReader {
    public static final Companion Companion = new Companion(null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    private final e source;

    /* compiled from: HeadersReader.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public HeadersReader(e eVar) {
        q.i(eVar, "source");
        this.source = eVar;
        this.headerLimit = 262144L;
    }

    public final e getSource() {
        return this.source;
    }

    public final Headers readHeaders() {
        boolean z10;
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readLine = readLine();
            if (readLine.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return builder.build();
            }
            builder.addLenient$okhttp(readLine);
        }
    }

    public final String readLine() {
        String M = this.source.M(this.headerLimit);
        this.headerLimit -= M.length();
        return M;
    }
}
