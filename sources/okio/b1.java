package okio;

/* compiled from: Utf8.kt */
/* loaded from: classes4.dex */
public final class b1 {
    public static final long a(String str, int i10, int i11) {
        boolean z10;
        boolean z11;
        int i12;
        char c10;
        qc.q.i(str, "<this>");
        boolean z12 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 > str.length()) {
                    z12 = false;
                }
                if (z12) {
                    long j10 = 0;
                    while (i10 < i11) {
                        char charAt = str.charAt(i10);
                        if (charAt < 128) {
                            j10++;
                        } else {
                            if (charAt < 2048) {
                                i12 = 2;
                            } else if (charAt >= 55296 && charAt <= 57343) {
                                int i13 = i10 + 1;
                                if (i13 < i11) {
                                    c10 = str.charAt(i13);
                                } else {
                                    c10 = 0;
                                }
                                if (charAt <= 56319 && c10 >= 56320 && c10 <= 57343) {
                                    j10 += 4;
                                    i10 += 2;
                                } else {
                                    j10++;
                                    i10 = i13;
                                }
                            } else {
                                i12 = 3;
                            }
                            j10 += i12;
                        }
                        i10++;
                    }
                    return j10;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
    }

    public static /* synthetic */ long b(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return a(str, i10, i11);
    }
}
