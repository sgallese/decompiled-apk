package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Protocol;
import okhttp3.Response;
import qc.h;
import qc.q;
import yc.v;

/* compiled from: StatusLine.kt */
/* loaded from: classes4.dex */
public final class StatusLine {
    public static final Companion Companion = new Companion(null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final String message;
    public final Protocol protocol;

    /* compiled from: StatusLine.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final StatusLine get(Response response) {
            q.i(response, "response");
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        public final StatusLine parse(String str) throws IOException {
            boolean F;
            boolean F2;
            Protocol protocol;
            int i10;
            String str2;
            q.i(str, "statusLine");
            F = v.F(str, "HTTP/1.", false, 2, null);
            if (!F) {
                F2 = v.F(str, "ICY ", false, 2, null);
                if (F2) {
                    protocol = Protocol.HTTP_1_0;
                    i10 = 4;
                } else {
                    throw new ProtocolException(q.q("Unexpected status line: ", str));
                }
            } else {
                i10 = 9;
                if (str.length() >= 9 && str.charAt(8) == ' ') {
                    int charAt = str.charAt(7) - '0';
                    if (charAt != 0) {
                        if (charAt == 1) {
                            protocol = Protocol.HTTP_1_1;
                        } else {
                            throw new ProtocolException(q.q("Unexpected status line: ", str));
                        }
                    } else {
                        protocol = Protocol.HTTP_1_0;
                    }
                } else {
                    throw new ProtocolException(q.q("Unexpected status line: ", str));
                }
            }
            int i11 = i10 + 3;
            if (str.length() >= i11) {
                try {
                    String substring = str.substring(i10, i11);
                    q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() > i11) {
                        if (str.charAt(i11) == ' ') {
                            str2 = str.substring(i10 + 4);
                            q.h(str2, "this as java.lang.String).substring(startIndex)");
                        } else {
                            throw new ProtocolException(q.q("Unexpected status line: ", str));
                        }
                    } else {
                        str2 = "";
                    }
                    return new StatusLine(protocol, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(q.q("Unexpected status line: ", str));
                }
            }
            throw new ProtocolException(q.q("Unexpected status line: ", str));
        }
    }

    public StatusLine(Protocol protocol, int i10, String str) {
        q.i(protocol, "protocol");
        q.i(str, "message");
        this.protocol = protocol;
        this.code = i10;
        this.message = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.code);
        sb2.append(' ');
        sb2.append(this.message);
        String sb3 = sb2.toString();
        q.h(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
