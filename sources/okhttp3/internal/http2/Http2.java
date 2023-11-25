package okhttp3.internal.http2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import okhttp3.internal.Util;
import okio.f;
import qc.q;
import yc.v;

/* compiled from: Http2.kt */
/* loaded from: classes4.dex */
public final class Http2 {
    private static final String[] BINARY;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;
    public static final Http2 INSTANCE = new Http2();
    public static final f CONNECTION_PREFACE = f.f20621q.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] FLAGS = new String[64];

    static {
        String A;
        String[] strArr = new String[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            String binaryString = Integer.toBinaryString(i11);
            q.h(binaryString, "toBinaryString(it)");
            A = v.A(Util.format("%8s", binaryString), ' ', '0', false, 4, null);
            strArr[i11] = A;
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i12 = iArr[0];
        strArr2[i12 | 8] = q.q(strArr2[i12], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i13 = 0;
        while (i13 < 3) {
            int i14 = iArr2[i13];
            i13++;
            int i15 = iArr[0];
            String[] strArr3 = FLAGS;
            int i16 = i15 | i14;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) strArr3[i15]);
            sb2.append('|');
            sb2.append((Object) strArr3[i14]);
            strArr3[i16] = sb2.toString();
            strArr3[i16 | 8] = ((Object) strArr3[i15]) + '|' + ((Object) strArr3[i14]) + "|PADDED";
        }
        int length = FLAGS.length;
        while (i10 < length) {
            int i17 = i10 + 1;
            String[] strArr4 = FLAGS;
            if (strArr4[i10] == null) {
                strArr4[i10] = BINARY[i10];
            }
            i10 = i17;
        }
    }

    private Http2() {
    }

    public final String formatFlags(int i10, int i11) {
        String str;
        String B;
        String B2;
        if (i11 == 0) {
            return "";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 != 4 && i10 != 6) {
                if (i10 != 7 && i10 != 8) {
                    String[] strArr = FLAGS;
                    if (i11 < strArr.length) {
                        str = strArr[i11];
                        q.f(str);
                    } else {
                        str = BINARY[i11];
                    }
                    String str2 = str;
                    if (i10 == 5 && (i11 & 4) != 0) {
                        B2 = v.B(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
                        return B2;
                    } else if (i10 == 0 && (i11 & 32) != 0) {
                        B = v.B(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                        return B;
                    } else {
                        return str2;
                    }
                }
            } else if (i11 == 1) {
                return "ACK";
            } else {
                return BINARY[i11];
            }
        }
        return BINARY[i11];
    }

    public final String formattedType$okhttp(int i10) {
        String[] strArr = FRAME_NAMES;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return Util.format("0x%02x", Integer.valueOf(i10));
    }

    public final String frameLog(boolean z10, int i10, int i11, int i12, int i13) {
        String str;
        String formattedType$okhttp = formattedType$okhttp(i12);
        String formatFlags = formatFlags(i12, i13);
        if (z10) {
            str = "<<";
        } else {
            str = ">>";
        }
        return Util.format("%s 0x%08x %5d %-13s %s", str, Integer.valueOf(i10), Integer.valueOf(i11), formattedType$okhttp, formatFlags);
    }
}
