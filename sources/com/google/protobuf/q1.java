package com.google.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utf8.java */
/* loaded from: classes3.dex */
public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    private static final b f12421a;

    /* compiled from: Utf8.java */
    /* loaded from: classes3.dex */
    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (!m(b11) && (((b10 << 28) + (b11 + 112)) >> 30) == 0 && !m(b12) && !m(b13)) {
                int r10 = ((b10 & 7) << 18) | (r(b11) << 12) | (r(b12) << 6) | r(b13);
                cArr[i10] = l(r10);
                cArr[i10 + 1] = q(r10);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte b10, char[] cArr, int i10) {
            cArr[i10] = (char) b10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b10, byte b11, byte b12, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (!m(b11) && ((b10 != -32 || b11 >= -96) && ((b10 != -19 || b11 < -96) && !m(b12)))) {
                cArr[i10] = (char) (((b10 & 15) << 12) | (r(b11) << 6) | r(b12));
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b10, byte b11, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (b10 >= -62 && !m(b11)) {
                cArr[i10] = (char) (((b10 & 31) << 6) | r(b11));
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        private static char l(int i10) {
            return (char) ((i10 >>> 10) + 55232);
        }

        private static boolean m(byte b10) {
            if (b10 > -65) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b10) {
            if (b10 >= 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b10) {
            if (b10 < -16) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b10) {
            if (b10 < -32) {
                return true;
            }
            return false;
        }

        private static char q(int i10) {
            return (char) ((i10 & 1023) + 56320);
        }

        private static int r(byte b10) {
            return b10 & 63;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Utf8.java */
    /* loaded from: classes3.dex */
    public static abstract class b {
        b() {
        }

        abstract String a(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

        abstract int b(CharSequence charSequence, byte[] bArr, int i10, int i11);

        final boolean c(byte[] bArr, int i10, int i11) {
            if (d(0, bArr, i10, i11) != 0) {
                return false;
            }
            return true;
        }

        abstract int d(int i10, byte[] bArr, int i11, int i12);
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes3.dex */
    static final class c extends b {
        c() {
        }

        private static int e(byte[] bArr, int i10, int i11) {
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 >= i11) {
                return 0;
            }
            return f(bArr, i10, i11);
        }

        private static int f(byte[] bArr, int i10, int i11) {
            while (i10 < i11) {
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i12 >= i11) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i10 = i12 + 1;
                            if (bArr[i12] > -65) {
                            }
                        }
                        return -1;
                    } else if (b10 < -16) {
                        if (i12 >= i11 - 1) {
                            return q1.l(bArr, i12, i11);
                        }
                        int i13 = i12 + 1;
                        byte b11 = bArr[i12];
                        if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                            i10 = i13 + 1;
                            if (bArr[i13] > -65) {
                            }
                        }
                        return -1;
                    } else if (i12 >= i11 - 2) {
                        return q1.l(bArr, i12, i11);
                    } else {
                        int i14 = i12 + 1;
                        byte b12 = bArr[i12];
                        if (b12 <= -65 && (((b10 << 28) + (b12 + 112)) >> 30) == 0) {
                            int i15 = i14 + 1;
                            if (bArr[i14] <= -65) {
                                i12 = i15 + 1;
                                if (bArr[i15] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                i10 = i12;
            }
            return 0;
        }

        @Override // com.google.protobuf.q1.b
        String a(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
                int i12 = i10 + i11;
                char[] cArr = new char[i11];
                int i13 = 0;
                while (i10 < i12) {
                    byte b10 = bArr[i10];
                    if (!a.n(b10)) {
                        break;
                    }
                    i10++;
                    a.i(b10, cArr, i13);
                    i13++;
                }
                int i14 = i13;
                while (i10 < i12) {
                    int i15 = i10 + 1;
                    byte b11 = bArr[i10];
                    if (a.n(b11)) {
                        int i16 = i14 + 1;
                        a.i(b11, cArr, i14);
                        while (i15 < i12) {
                            byte b12 = bArr[i15];
                            if (!a.n(b12)) {
                                break;
                            }
                            i15++;
                            a.i(b12, cArr, i16);
                            i16++;
                        }
                        i10 = i15;
                        i14 = i16;
                    } else if (a.p(b11)) {
                        if (i15 < i12) {
                            a.k(b11, bArr[i15], cArr, i14);
                            i10 = i15 + 1;
                            i14++;
                        } else {
                            throw InvalidProtocolBufferException.d();
                        }
                    } else if (a.o(b11)) {
                        if (i15 < i12 - 1) {
                            int i17 = i15 + 1;
                            a.j(b11, bArr[i15], bArr[i17], cArr, i14);
                            i10 = i17 + 1;
                            i14++;
                        } else {
                            throw InvalidProtocolBufferException.d();
                        }
                    } else if (i15 < i12 - 2) {
                        int i18 = i15 + 1;
                        byte b13 = bArr[i15];
                        int i19 = i18 + 1;
                        a.h(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                        i10 = i19 + 1;
                        i14 = i14 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.d();
                    }
                }
                return new String(cArr, 0, i14);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // com.google.protobuf.q1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q1.c.b(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.q1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int d(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.protobuf.q1.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.google.protobuf.q1.a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.google.protobuf.q1.b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = e(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q1.c.d(int, byte[], int, int):int");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Utf8.java */
    /* loaded from: classes3.dex */
    public static class d extends IllegalArgumentException {
        d(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes3.dex */
    static final class e extends b {
        e() {
        }

        static boolean e() {
            if (p1.E() && p1.F()) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int f(byte[] r8, long r9, int r11) {
            /*
                int r0 = g(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L7:
                r0 = 0
                r1 = 0
            L9:
                r2 = 1
                if (r11 <= 0) goto L1a
                long r4 = r9 + r2
                byte r1 = com.google.protobuf.p1.u(r8, r9)
                if (r1 < 0) goto L19
                int r11 = r11 + (-1)
                r9 = r4
                goto L9
            L19:
                r9 = r4
            L1a:
                if (r11 != 0) goto L1d
                return r0
            L1d:
                int r11 = r11 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r11 != 0) goto L29
                return r1
            L29:
                int r11 = r11 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r9
                byte r9 = com.google.protobuf.p1.u(r8, r9)
                if (r9 <= r4) goto L37
                goto L39
            L37:
                r9 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r11 >= r6) goto L46
                int r8 = h(r8, r1, r9, r11)
                return r8
            L46:
                int r11 = r11 + (-2)
                long r6 = r9 + r2
                byte r9 = com.google.protobuf.p1.u(r8, r9)
                if (r9 > r4) goto L63
                r10 = -96
                if (r1 != r0) goto L56
                if (r9 < r10) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r9 >= r10) goto L63
            L5c:
                long r2 = r2 + r6
                byte r9 = com.google.protobuf.p1.u(r8, r6)
                if (r9 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r11 >= r0) goto L6c
                int r8 = h(r8, r1, r9, r11)
                return r8
            L6c:
                int r11 = r11 + (-3)
                long r6 = r9 + r2
                byte r9 = com.google.protobuf.p1.u(r8, r9)
                if (r9 > r4) goto L8e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L8e
                long r9 = r6 + r2
                byte r0 = com.google.protobuf.p1.u(r8, r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r9
                byte r9 = com.google.protobuf.p1.u(r8, r9)
                if (r9 <= r4) goto L37
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q1.e.f(byte[], long, int):int");
        }

        private static int g(byte[] bArr, long j10, int i10) {
            int i11 = 0;
            if (i10 < 16) {
                return 0;
            }
            while (i11 < i10) {
                long j11 = 1 + j10;
                if (p1.u(bArr, j10) < 0) {
                    return i11;
                }
                i11++;
                j10 = j11;
            }
            return i10;
        }

        private static int h(byte[] bArr, int i10, long j10, int i11) {
            if (i11 == 0) {
                return q1.i(i10);
            }
            if (i11 == 1) {
                return q1.j(i10, p1.u(bArr, j10));
            }
            if (i11 == 2) {
                return q1.k(i10, p1.u(bArr, j10), p1.u(bArr, j10 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.q1.b
        String a(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
                int i12 = i10 + i11;
                char[] cArr = new char[i11];
                int i13 = 0;
                while (i10 < i12) {
                    byte u10 = p1.u(bArr, i10);
                    if (!a.n(u10)) {
                        break;
                    }
                    i10++;
                    a.i(u10, cArr, i13);
                    i13++;
                }
                int i14 = i13;
                while (i10 < i12) {
                    int i15 = i10 + 1;
                    byte u11 = p1.u(bArr, i10);
                    if (a.n(u11)) {
                        int i16 = i14 + 1;
                        a.i(u11, cArr, i14);
                        while (i15 < i12) {
                            byte u12 = p1.u(bArr, i15);
                            if (!a.n(u12)) {
                                break;
                            }
                            i15++;
                            a.i(u12, cArr, i16);
                            i16++;
                        }
                        i10 = i15;
                        i14 = i16;
                    } else if (a.p(u11)) {
                        if (i15 < i12) {
                            a.k(u11, p1.u(bArr, i15), cArr, i14);
                            i10 = i15 + 1;
                            i14++;
                        } else {
                            throw InvalidProtocolBufferException.d();
                        }
                    } else if (a.o(u11)) {
                        if (i15 < i12 - 1) {
                            int i17 = i15 + 1;
                            a.j(u11, p1.u(bArr, i15), p1.u(bArr, i17), cArr, i14);
                            i10 = i17 + 1;
                            i14++;
                        } else {
                            throw InvalidProtocolBufferException.d();
                        }
                    } else if (i15 < i12 - 2) {
                        int i18 = i15 + 1;
                        byte u13 = p1.u(bArr, i15);
                        int i19 = i18 + 1;
                        a.h(u11, u13, p1.u(bArr, i18), p1.u(bArr, i19), cArr, i14);
                        i10 = i19 + 1;
                        i14 = i14 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.d();
                    }
                }
                return new String(cArr, 0, i14);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }

        @Override // com.google.protobuf.q1.b
        int b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
            char c10;
            long j10;
            long j11;
            long j12;
            int i12;
            char charAt;
            long j13 = i10;
            long j14 = i11 + j13;
            int length = charSequence.length();
            if (length <= i11 && bArr.length - i11 >= i10) {
                int i13 = 0;
                while (true) {
                    c10 = 128;
                    j10 = 1;
                    if (i13 >= length || (charAt = charSequence.charAt(i13)) >= 128) {
                        break;
                    }
                    p1.K(bArr, j13, (byte) charAt);
                    i13++;
                    j13 = 1 + j13;
                }
                if (i13 == length) {
                    return (int) j13;
                }
                while (i13 < length) {
                    char charAt2 = charSequence.charAt(i13);
                    if (charAt2 < c10 && j13 < j14) {
                        long j15 = j13 + j10;
                        p1.K(bArr, j13, (byte) charAt2);
                        j12 = j10;
                        j11 = j15;
                    } else {
                        if (charAt2 < 2048 && j13 <= j14 - 2) {
                            long j16 = j13 + j10;
                            p1.K(bArr, j13, (byte) ((charAt2 >>> 6) | 960));
                            p1.K(bArr, j16, (byte) ((charAt2 & '?') | 128));
                            j11 = j16 + j10;
                            j12 = j10;
                        } else if ((charAt2 < 55296 || 57343 < charAt2) && j13 <= j14 - 3) {
                            long j17 = j13 + j10;
                            p1.K(bArr, j13, (byte) ((charAt2 >>> '\f') | 480));
                            long j18 = j17 + j10;
                            p1.K(bArr, j17, (byte) (((charAt2 >>> 6) & 63) | 128));
                            p1.K(bArr, j18, (byte) ((charAt2 & '?') | 128));
                            j11 = j18 + 1;
                            j12 = 1;
                        } else if (j13 <= j14 - 4) {
                            int i14 = i13 + 1;
                            if (i14 != length) {
                                char charAt3 = charSequence.charAt(i14);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    long j19 = j13 + 1;
                                    p1.K(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                    long j20 = j19 + 1;
                                    p1.K(bArr, j19, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j21 = j20 + 1;
                                    p1.K(bArr, j20, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j12 = 1;
                                    j11 = j21 + 1;
                                    p1.K(bArr, j21, (byte) ((codePoint & 63) | 128));
                                    i13 = i14;
                                } else {
                                    i13 = i14;
                                }
                            }
                            throw new d(i13 - 1, length);
                        } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                            throw new d(i13, length);
                        } else {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j13);
                        }
                        i13++;
                        c10 = 128;
                        long j22 = j12;
                        j13 = j11;
                        j10 = j22;
                    }
                    i13++;
                    c10 = 128;
                    long j222 = j12;
                    j13 = j11;
                    j10 = j222;
                }
                return (int) j13;
            }
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i10 + i11));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (com.google.protobuf.p1.u(r13, r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.p1.u(r13, r2) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.q1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int d(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q1.e.d(int, byte[], int, int):int");
        }
    }

    static {
        b cVar;
        if (e.e() && !com.google.protobuf.d.c()) {
            cVar = new e();
        } else {
            cVar = new c();
        }
        f12421a = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return f12421a.a(bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        return f12421a.b(charSequence, bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 < length) {
                char charAt = charSequence.charAt(i10);
                if (charAt < 2048) {
                    i11 += (127 - charAt) >>> 31;
                    i10++;
                } else {
                    i11 += h(charSequence, i10);
                    break;
                }
            } else {
                break;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    private static int h(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        while (i10 < length) {
            char charAt = charSequence.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i10) >= 65536) {
                        i10++;
                    } else {
                        throw new d(i10, length);
                    }
                }
            }
            i10++;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i10, int i11) {
        if (i10 <= -12 && i11 <= -65) {
            return i10 ^ (i11 << 8);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i10, int i11, int i12) {
        if (i10 <= -12 && i11 <= -65 && i12 <= -65) {
            return (i10 ^ (i11 << 8)) ^ (i12 << 16);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    return k(b10, bArr[i10], bArr[i10 + 1]);
                }
                throw new AssertionError();
            }
            return j(b10, bArr[i10]);
        }
        return i(b10);
    }

    public static boolean m(byte[] bArr) {
        return f12421a.c(bArr, 0, bArr.length);
    }

    public static boolean n(byte[] bArr, int i10, int i11) {
        return f12421a.c(bArr, i10, i11);
    }
}
