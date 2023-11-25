package okhttp3.internal.http2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ec.b0;
import ec.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.Util;
import okio.Source;
import okio.c;
import okio.e;
import okio.f;
import okio.l0;
import qc.h;
import qc.q;

/* compiled from: Hpack.kt */
/* loaded from: classes4.dex */
public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<f, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    /* compiled from: Hpack.kt */
    /* loaded from: classes4.dex */
    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final e source;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Reader(Source source, int i10) {
            this(source, i10, 0, 4, null);
            q.i(source, "source");
        }

        private final void adjustDynamicTableByteCount() {
            int i10 = this.maxDynamicTableByteCount;
            int i11 = this.dynamicTableByteCount;
            if (i10 < i11) {
                if (i10 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i11 - i10);
                }
            }
        }

        private final void clearDynamicTable() {
            o.t(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i10) {
            return this.nextHeaderIndex + 1 + i10;
        }

        private final int evictToRecoverBytes(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i11 = this.nextHeaderIndex;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    q.f(header);
                    int i13 = header.hpackSize;
                    i10 -= i13;
                    this.dynamicTableByteCount -= i13;
                    this.headerCount--;
                    i12++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i11 + 1, headerArr, i11 + 1 + i12, this.headerCount);
                this.nextHeaderIndex += i12;
            }
            return i12;
        }

        private final f getName(int i10) throws IOException {
            if (isStaticHeader(i10)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i10].name;
            }
            int dynamicTableIndex = dynamicTableIndex(i10 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    Header header = headerArr[dynamicTableIndex];
                    q.f(header);
                    return header.name;
                }
            }
            throw new IOException(q.q("Header index too large ", Integer.valueOf(i10 + 1)));
        }

        private final void insertIntoDynamicTable(int i10, Header header) {
            this.headerList.add(header);
            int i11 = header.hpackSize;
            if (i10 != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i10)];
                q.f(header2);
                i11 -= header2.hpackSize;
            }
            int i12 = this.maxDynamicTableByteCount;
            if (i11 > i12) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i11) - i12);
            if (i10 == -1) {
                int i13 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i13 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i14 = this.nextHeaderIndex;
                this.nextHeaderIndex = i14 - 1;
                this.dynamicTable[i14] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i10 + dynamicTableIndex(i10) + evictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i11;
        }

        private final boolean isStaticHeader(int i10) {
            if (i10 >= 0 && i10 <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1) {
                return true;
            }
            return false;
        }

        private final int readByte() throws IOException {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i10) throws IOException {
            if (isStaticHeader(i10)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i10]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i10 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[dynamicTableIndex];
                    q.f(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException(q.q("Header index too large ", Integer.valueOf(i10 + 1)));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i10) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(i10), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i10) throws IOException {
            this.headerList.add(new Header(getName(i10), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> C0;
            C0 = b0.C0(this.headerList);
            this.headerList.clear();
            return C0;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public final f readByteString() throws IOException {
            boolean z10;
            int readByte = readByte();
            if ((readByte & 128) == 128) {
                z10 = true;
            } else {
                z10 = false;
            }
            long readInt = readInt(readByte, 127);
            if (z10) {
                c cVar = new c();
                Huffman.INSTANCE.decode(this.source, readInt, cVar);
                return cVar.j0();
            }
            return this.source.l(readInt);
        }

        public final void readHeaders() throws IOException {
            while (!this.source.C()) {
                int and = Util.and(this.source.readByte(), 255);
                if (and != 128) {
                    if ((and & 128) == 128) {
                        readIndexedHeader(readInt(and, 127) - 1);
                    } else if (and == 64) {
                        readLiteralHeaderWithIncrementalIndexingNewName();
                    } else if ((and & 64) == 64) {
                        readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(and, 63) - 1);
                    } else if ((and & 32) == 32) {
                        int readInt = readInt(and, 31);
                        this.maxDynamicTableByteCount = readInt;
                        if (readInt >= 0 && readInt <= this.headerTableSizeSetting) {
                            adjustDynamicTableByteCount();
                        } else {
                            throw new IOException(q.q("Invalid dynamic table size update ", Integer.valueOf(this.maxDynamicTableByteCount)));
                        }
                    } else if (and != 16 && and != 0) {
                        readLiteralHeaderWithoutIndexingIndexedName(readInt(and, 15) - 1);
                    } else {
                        readLiteralHeaderWithoutIndexingNewName();
                    }
                } else {
                    throw new IOException("index == 0");
                }
            }
        }

        public final int readInt(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & 128) != 0) {
                    i11 += (readByte & 127) << i13;
                    i13 += 7;
                } else {
                    return i11 + (readByte << i13);
                }
            }
        }

        public Reader(Source source, int i10, int i11) {
            q.i(source, "source");
            this.headerTableSizeSetting = i10;
            this.maxDynamicTableByteCount = i11;
            this.headerList = new ArrayList();
            this.source = l0.d(source);
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        public /* synthetic */ Reader(Source source, int i10, int i11, int i12, h hVar) {
            this(source, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    /* compiled from: Hpack.kt */
    /* loaded from: classes4.dex */
    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final c out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(int i10, c cVar) {
            this(i10, false, cVar, 2, null);
            q.i(cVar, "out");
        }

        private final void adjustDynamicTableByteCount() {
            int i10 = this.maxDynamicTableByteCount;
            int i11 = this.dynamicTableByteCount;
            if (i10 < i11) {
                if (i10 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i11 - i10);
                }
            }
        }

        private final void clearDynamicTable() {
            o.t(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i11 = this.nextHeaderIndex;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    q.f(header);
                    i10 -= header.hpackSize;
                    int i13 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    q.f(header2);
                    this.dynamicTableByteCount = i13 - header2.hpackSize;
                    this.headerCount--;
                    i12++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i11 + 1, headerArr, i11 + 1 + i12, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i14 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.nextHeaderIndex += i12;
            }
            return i12;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i10 = header.hpackSize;
            int i11 = this.maxDynamicTableByteCount;
            if (i10 > i11) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i10) - i11);
            int i12 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i12 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i13 = this.nextHeaderIndex;
            this.nextHeaderIndex = i13 - 1;
            this.dynamicTable[i13] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i10;
        }

        public final void resizeHeaderTable(int i10) {
            this.headerTableSizeSetting = i10;
            int min = Math.min(i10, 16384);
            int i11 = this.maxDynamicTableByteCount;
            if (i11 == min) {
                return;
            }
            if (min < i11) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = min;
            adjustDynamicTableByteCount();
        }

        public final void writeByteString(f fVar) throws IOException {
            q.i(fVar, "data");
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(fVar) < fVar.D()) {
                    c cVar = new c();
                    huffman.encode(fVar, cVar);
                    f j02 = cVar.j0();
                    writeInt(j02.D(), 127, 128);
                    this.out.B0(j02);
                    return;
                }
            }
            writeInt(fVar.D(), 127, 0);
            this.out.B0(fVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> r15) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 271
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.writeHeaders(java.util.List):void");
        }

        public final void writeInt(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.out.D(i10 | i12);
                return;
            }
            this.out.D(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.out.D(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.out.D(i13);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(c cVar) {
            this(0, false, cVar, 3, null);
            q.i(cVar, "out");
        }

        public Writer(int i10, boolean z10, c cVar) {
            q.i(cVar, "out");
            this.headerTableSizeSetting = i10;
            this.useCompression = z10;
            this.out = cVar;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i10;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        public /* synthetic */ Writer(int i10, boolean z10, c cVar, int i11, h hVar) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, cVar);
        }
    }

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        f fVar = Header.TARGET_METHOD;
        f fVar2 = Header.TARGET_PATH;
        f fVar3 = Header.TARGET_SCHEME;
        f fVar4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{new Header(Header.TARGET_AUTHORITY, ""), new Header(fVar, "GET"), new Header(fVar, "POST"), new Header(fVar2, "/"), new Header(fVar2, "/index.html"), new Header(fVar3, "http"), new Header(fVar3, "https"), new Header(fVar4, "200"), new Header(fVar4, "204"), new Header(fVar4, "206"), new Header(fVar4, "304"), new Header(fVar4, "400"), new Header(fVar4, "404"), new Header(fVar4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<f, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i10].name)) {
                linkedHashMap.put(headerArr2[i10].name, Integer.valueOf(i10));
            }
            i10 = i11;
        }
        Map<f, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        q.h(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public final f checkLowercase(f fVar) throws IOException {
        boolean z10;
        q.i(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        int D = fVar.D();
        int i10 = 0;
        while (i10 < D) {
            int i11 = i10 + 1;
            byte i12 = fVar.i(i10);
            if (65 <= i12 && i12 <= 90) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                i10 = i11;
            } else {
                throw new IOException(q.q("PROTOCOL_ERROR response malformed: mixed case name: ", fVar.I()));
            }
        }
        return fVar;
    }

    public final Map<f, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }
}
