package okhttp3.internal.ws;

import java.io.IOException;
import okhttp3.Headers;
import okhttp3.internal.Util;
import qc.h;
import qc.q;
import yc.u;
import yc.v;
import yc.w;

/* compiled from: WebSocketExtensions.kt */
/* loaded from: classes4.dex */
public final class WebSocketExtensions {
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    /* compiled from: WebSocketExtensions.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final WebSocketExtensions parse(Headers headers) throws IOException {
            boolean r10;
            boolean r11;
            String str;
            boolean r12;
            Integer j10;
            boolean r13;
            boolean r14;
            Integer j11;
            boolean r15;
            q.i(headers, "responseHeaders");
            int size = headers.size();
            int i10 = 0;
            boolean z10 = false;
            Integer num = null;
            boolean z11 = false;
            Integer num2 = null;
            boolean z12 = false;
            boolean z13 = false;
            while (i10 < size) {
                int i11 = i10 + 1;
                r10 = v.r(headers.name(i10), WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION, true);
                if (r10) {
                    String value = headers.value(i10);
                    int i12 = 0;
                    while (i12 < value.length()) {
                        int delimiterOffset$default = Util.delimiterOffset$default(value, ',', i12, 0, 4, (Object) null);
                        int delimiterOffset = Util.delimiterOffset(value, ';', i12, delimiterOffset$default);
                        String trimSubstring = Util.trimSubstring(value, i12, delimiterOffset);
                        int i13 = delimiterOffset + 1;
                        r11 = v.r(trimSubstring, "permessage-deflate", true);
                        if (r11) {
                            if (z10) {
                                z13 = true;
                            }
                            i12 = i13;
                            while (i12 < delimiterOffset$default) {
                                int delimiterOffset2 = Util.delimiterOffset(value, ';', i12, delimiterOffset$default);
                                int delimiterOffset3 = Util.delimiterOffset(value, '=', i12, delimiterOffset2);
                                String trimSubstring2 = Util.trimSubstring(value, i12, delimiterOffset3);
                                if (delimiterOffset3 < delimiterOffset2) {
                                    str = w.p0(Util.trimSubstring(value, delimiterOffset3 + 1, delimiterOffset2), "\"");
                                } else {
                                    str = null;
                                }
                                i12 = delimiterOffset2 + 1;
                                r12 = v.r(trimSubstring2, "client_max_window_bits", true);
                                if (!r12) {
                                    r13 = v.r(trimSubstring2, "client_no_context_takeover", true);
                                    if (!r13) {
                                        r14 = v.r(trimSubstring2, "server_max_window_bits", true);
                                        if (!r14) {
                                            r15 = v.r(trimSubstring2, "server_no_context_takeover", true);
                                            if (r15) {
                                                if (z12) {
                                                    z13 = true;
                                                }
                                                if (str != null) {
                                                    z13 = true;
                                                }
                                                z12 = true;
                                            } else {
                                                z13 = true;
                                            }
                                        } else {
                                            if (num2 != null) {
                                                z13 = true;
                                            }
                                            if (str != null) {
                                                j11 = u.j(str);
                                                num2 = j11;
                                            } else {
                                                num2 = null;
                                            }
                                            if (num2 == null) {
                                                z13 = true;
                                            }
                                        }
                                    } else {
                                        if (z11) {
                                            z13 = true;
                                        }
                                        if (str != null) {
                                            z13 = true;
                                        }
                                        z11 = true;
                                    }
                                } else {
                                    if (num != null) {
                                        z13 = true;
                                    }
                                    if (str != null) {
                                        j10 = u.j(str);
                                        num = j10;
                                    } else {
                                        num = null;
                                    }
                                    if (num == null) {
                                        z13 = true;
                                    }
                                }
                            }
                            z10 = true;
                        } else {
                            i12 = i13;
                            z13 = true;
                        }
                    }
                }
                i10 = i11;
            }
            return new WebSocketExtensions(z10, num, z11, num2, z12, z13);
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = webSocketExtensions.perMessageDeflate;
        }
        if ((i10 & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        Integer num3 = num;
        if ((i10 & 4) != 0) {
            z11 = webSocketExtensions.clientNoContextTakeover;
        }
        boolean z14 = z11;
        if ((i10 & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        Integer num4 = num2;
        if ((i10 & 16) != 0) {
            z12 = webSocketExtensions.serverNoContextTakeover;
        }
        boolean z15 = z12;
        if ((i10 & 32) != 0) {
            z13 = webSocketExtensions.unknownValues;
        }
        return webSocketExtensions.copy(z10, num3, z14, num4, z15, z13);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    public final WebSocketExtensions copy(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        return new WebSocketExtensions(z10, num, z11, num2, z12, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        if (this.perMessageDeflate == webSocketExtensions.perMessageDeflate && q.d(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && q.d(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        int hashCode;
        boolean z10 = this.perMessageDeflate;
        int i10 = 1;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        Integer num = this.clientMaxWindowBits;
        int i12 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i13 = (i11 + hashCode) * 31;
        ?? r22 = this.clientNoContextTakeover;
        int i14 = r22;
        if (r22 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        Integer num2 = this.serverMaxWindowBits;
        if (num2 != null) {
            i12 = num2.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        ?? r23 = this.serverNoContextTakeover;
        int i17 = r23;
        if (r23 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        boolean z11 = this.unknownValues;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        return i18 + i10;
    }

    public final boolean noContextTakeover(boolean z10) {
        if (z10) {
            return this.clientNoContextTakeover;
        }
        return this.serverNoContextTakeover;
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ')';
    }

    public WebSocketExtensions(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        this.perMessageDeflate = z10;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z11;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z12;
        this.unknownValues = z13;
    }

    public /* synthetic */ WebSocketExtensions(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, h hVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? false : z11, (i10 & 8) == 0 ? num2 : null, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? false : z13);
    }
}
