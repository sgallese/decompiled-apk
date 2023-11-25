package ld;

import qc.q;

/* compiled from: -ByteString.kt */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a */
    private static final char[] f19681a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Removed duplicated region for block: B:553:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:556:0x007a A[EDGE_INSN: B:556:0x007a->B:350:0x007a BREAK  A[LOOP:1: B:326:0x004d->B:354:0x0080, LOOP_LABEL: LOOP:0: B:298:0x0008->B:584:0x0008], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:576:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:581:0x01fc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ld.g.c(byte[], int):int");
    }

    public static final void d(okio.f fVar, okio.c cVar, int i10, int i11) {
        q.i(fVar, "<this>");
        q.i(cVar, "buffer");
        cVar.d0(fVar.j(), i10, i11);
    }

    public static final int e(char c10) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if ('0' <= c10 && c10 < ':') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' <= c10 && c10 < 'g') {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            c11 = 'A';
            if ('A' > c10 || c10 >= 'G') {
                z12 = false;
            }
            if (!z12) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    public static final char[] f() {
        return f19681a;
    }
}
