package t0;

import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: SnapshotIdSet.kt */
/* loaded from: classes.dex */
public final class k {
    public static final int b(int[] iArr, int i10) {
        qc.q.i(iArr, "<this>");
        int length = iArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            int i13 = iArr[i12];
            if (i10 > i13) {
                i11 = i12 + 1;
            } else if (i10 < i13) {
                length = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(long j10) {
        int i10;
        if ((4294967295L & j10) == 0) {
            i10 = 32;
            j10 >>= 32;
        } else {
            i10 = 0;
        }
        if ((WebSocketProtocol.PAYLOAD_SHORT_MAX & j10) == 0) {
            i10 += 16;
            j10 >>= 16;
        }
        if ((255 & j10) == 0) {
            i10 += 8;
            j10 >>= 8;
        }
        if ((15 & j10) == 0) {
            i10 += 4;
            j10 >>= 4;
        }
        if ((1 & j10) != 0) {
            return i10;
        }
        if ((2 & j10) != 0) {
            return i10 + 1;
        }
        if ((4 & j10) != 0) {
            return i10 + 2;
        }
        if ((j10 & 8) != 0) {
            return i10 + 3;
        }
        return -1;
    }
}
