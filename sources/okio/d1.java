package okio;

import java.util.Arrays;
import okio.f;

/* compiled from: -Base64.kt */
/* loaded from: classes4.dex */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f20619a;

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f20620b;

    static {
        f.a aVar = f.f20621q;
        f20619a = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").j();
        f20620b = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").j();
    }

    public static final byte[] a(String str) {
        boolean z10;
        boolean z11;
        int i10;
        char charAt;
        qc.q.i(str, "<this>");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i11 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i11];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            boolean z12 = true;
            if (i12 < length) {
                char charAt2 = str.charAt(i12);
                if ('A' <= charAt2 && charAt2 < '[') {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10 = charAt2 - 'A';
                } else {
                    if ('a' <= charAt2 && charAt2 < '{') {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i10 = charAt2 - 'G';
                    } else {
                        if ('0' > charAt2 || charAt2 >= ':') {
                            z12 = false;
                        }
                        if (z12) {
                            i10 = charAt2 + 4;
                        } else if (charAt2 != '+' && charAt2 != '-') {
                            if (charAt2 != '/' && charAt2 != '_') {
                                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                                    return null;
                                }
                                i12++;
                            } else {
                                i10 = 63;
                            }
                        } else {
                            i10 = 62;
                        }
                    }
                }
                i14 = (i14 << 6) | i10;
                i13++;
                if (i13 % 4 == 0) {
                    int i16 = i15 + 1;
                    bArr[i15] = (byte) (i14 >> 16);
                    int i17 = i16 + 1;
                    bArr[i16] = (byte) (i14 >> 8);
                    bArr[i17] = (byte) i14;
                    i15 = i17 + 1;
                }
                i12++;
            } else {
                int i18 = i13 % 4;
                if (i18 == 1) {
                    return null;
                }
                if (i18 != 2) {
                    if (i18 == 3) {
                        int i19 = i14 << 6;
                        int i20 = i15 + 1;
                        bArr[i15] = (byte) (i19 >> 16);
                        i15 = i20 + 1;
                        bArr[i20] = (byte) (i19 >> 8);
                    }
                } else {
                    bArr[i15] = (byte) ((i14 << 12) >> 16);
                    i15++;
                }
                if (i15 == i11) {
                    return bArr;
                }
                byte[] copyOf = Arrays.copyOf(bArr, i15);
                qc.q.h(copyOf, "copyOf(this, newSize)");
                return copyOf;
            }
        }
    }

    public static final String b(byte[] bArr, byte[] bArr2) {
        qc.q.i(bArr, "<this>");
        qc.q.i(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            int i13 = i12 + 1;
            byte b11 = bArr[i12];
            int i14 = i13 + 1;
            byte b12 = bArr[i13];
            int i15 = i11 + 1;
            bArr3[i11] = bArr2[(b10 & 255) >> 2];
            int i16 = i15 + 1;
            bArr3[i15] = bArr2[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i17 = i16 + 1;
            bArr3[i16] = bArr2[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 = i17 + 1;
            bArr3[i17] = bArr2[b12 & 63];
            i10 = i14;
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i18 = i10 + 1;
                byte b13 = bArr[i10];
                byte b14 = bArr[i18];
                int i19 = i11 + 1;
                bArr3[i11] = bArr2[(b13 & 255) >> 2];
                int i20 = i19 + 1;
                bArr3[i19] = bArr2[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
                bArr3[i20] = bArr2[(b14 & 15) << 2];
                bArr3[i20 + 1] = 61;
            }
        } else {
            byte b15 = bArr[i10];
            int i21 = i11 + 1;
            bArr3[i11] = bArr2[(b15 & 255) >> 2];
            int i22 = i21 + 1;
            bArr3[i21] = bArr2[(b15 & 3) << 4];
            bArr3[i22] = 61;
            bArr3[i22 + 1] = 61;
        }
        return e1.c(bArr3);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr2 = f20619a;
        }
        return b(bArr, bArr2);
    }
}
