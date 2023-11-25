package okhttp3.internal.http2;

import androidx.recyclerview.widget.m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ec.o;
import java.io.IOException;
import okhttp3.internal.Util;
import okio.d;
import okio.e;
import okio.f;
import qc.q;

/* compiled from: Huffman.kt */
/* loaded from: classes4.dex */
public final class Huffman {
    private static final byte[] CODE_BIT_COUNTS;
    public static final Huffman INSTANCE = new Huffman();
    private static final int[] CODES = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, m.e.DEFAULT_SWIPE_ANIMATION_DURATION, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
    private static final Node root = new Node();

    static {
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        CODE_BIT_COUNTS = bArr;
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            INSTANCE.addCode(i10, CODES[i10], CODE_BIT_COUNTS[i10]);
        }
    }

    private Huffman() {
    }

    private final void addCode(int i10, int i11, int i12) {
        Node node = new Node(i10, i12);
        Node node2 = root;
        while (i12 > 8) {
            i12 -= 8;
            int i13 = (i11 >>> i12) & 255;
            Node[] children = node2.getChildren();
            q.f(children);
            Node node3 = children[i13];
            if (node3 == null) {
                node3 = new Node();
                children[i13] = node3;
            }
            node2 = node3;
        }
        int i14 = 8 - i12;
        int i15 = (i11 << i14) & 255;
        Node[] children2 = node2.getChildren();
        q.f(children2);
        o.r(children2, node, i15, (1 << i14) + i15);
    }

    public final void decode(e eVar, long j10, d dVar) {
        q.i(eVar, "source");
        q.i(dVar, "sink");
        Node node = root;
        int i10 = 0;
        long j11 = 0;
        int i11 = 0;
        while (j11 < j10) {
            j11++;
            i10 = (i10 << 8) | Util.and(eVar.readByte(), 255);
            i11 += 8;
            while (i11 >= 8) {
                Node[] children = node.getChildren();
                q.f(children);
                node = children[(i10 >>> (i11 - 8)) & 255];
                q.f(node);
                if (node.getChildren() == null) {
                    dVar.D(node.getSymbol());
                    i11 -= node.getTerminalBitCount();
                    node = root;
                } else {
                    i11 -= 8;
                }
            }
        }
        while (i11 > 0) {
            Node[] children2 = node.getChildren();
            q.f(children2);
            Node node2 = children2[(i10 << (8 - i11)) & 255];
            q.f(node2);
            if (node2.getChildren() == null && node2.getTerminalBitCount() <= i11) {
                dVar.D(node2.getSymbol());
                i11 -= node2.getTerminalBitCount();
                node = root;
            } else {
                return;
            }
        }
    }

    public final void encode(f fVar, d dVar) throws IOException {
        q.i(fVar, "source");
        q.i(dVar, "sink");
        int D = fVar.D();
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < D) {
            int i12 = i10 + 1;
            int and = Util.and(fVar.i(i10), 255);
            int i13 = CODES[and];
            byte b10 = CODE_BIT_COUNTS[and];
            j10 = (j10 << b10) | i13;
            i11 += b10;
            while (i11 >= 8) {
                i11 = (i11 == true ? 1 : 0) - 8;
                dVar.D((int) (j10 >> i11));
            }
            i10 = i12;
        }
        if (i11 > 0) {
            dVar.D((int) ((j10 << (8 - i11)) | (255 >>> i11)));
        }
    }

    public final int encodedLength(f fVar) {
        q.i(fVar, "bytes");
        long j10 = 0;
        for (int i10 = 0; i10 < fVar.D(); i10++) {
            j10 += CODE_BIT_COUNTS[Util.and(fVar.i(i10), 255)];
        }
        return (int) ((j10 + 7) >> 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Huffman.kt */
    /* loaded from: classes4.dex */
    public static final class Node {
        private final Node[] children;
        private final int symbol;
        private final int terminalBitCount;

        public Node() {
            this.children = new Node[UserVerificationMethods.USER_VERIFY_HANDPRINT];
            this.symbol = 0;
            this.terminalBitCount = 0;
        }

        public final Node[] getChildren() {
            return this.children;
        }

        public final int getSymbol() {
            return this.symbol;
        }

        public final int getTerminalBitCount() {
            return this.terminalBitCount;
        }

        public Node(int i10, int i11) {
            this.children = null;
            this.symbol = i10;
            int i12 = i11 & 7;
            this.terminalBitCount = i12 == 0 ? 8 : i12;
        }
    }
}
