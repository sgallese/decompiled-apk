package okhttp3.internal.http2;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.Source;
import okio.a1;
import okio.c;
import okio.e;
import okio.f;
import qc.h;
import qc.q;
import vc.d;
import vc.l;

/* compiled from: Http2Reader.kt */
/* loaded from: classes4.dex */
public final class Http2Reader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final e source;

    /* compiled from: Http2Reader.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }
    }

    /* compiled from: Http2Reader.kt */
    /* loaded from: classes4.dex */
    public interface Handler {
        void ackSettings();

        void alternateService(int i10, String str, f fVar, String str2, int i11, long j10);

        void data(boolean z10, int i10, e eVar, int i11) throws IOException;

        void goAway(int i10, ErrorCode errorCode, f fVar);

        void headers(boolean z10, int i10, int i11, List<Header> list);

        void ping(boolean z10, int i10, int i11);

        void priority(int i10, int i11, int i12, boolean z10);

        void pushPromise(int i10, int i11, List<Header> list) throws IOException;

        void rstStream(int i10, ErrorCode errorCode);

        void settings(boolean z10, Settings settings);

        void windowUpdate(int i10, long j10);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        q.h(logger2, "getLogger(Http2::class.java.name)");
        logger = logger2;
    }

    public Http2Reader(e eVar, boolean z10) {
        q.i(eVar, "source");
        this.source = eVar;
        this.client = z10;
        ContinuationSource continuationSource = new ContinuationSource(eVar);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, 0, 4, null);
    }

    private final void readData(Handler handler, int i10, int i11, int i12) throws IOException {
        boolean z10;
        if (i12 != 0) {
            int i13 = 0;
            boolean z11 = true;
            if ((i11 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 & 32) == 0) {
                z11 = false;
            }
            if (!z11) {
                if ((i11 & 8) != 0) {
                    i13 = Util.and(this.source.readByte(), 255);
                }
                handler.data(z10, i12, this.source, Companion.lengthWithoutPadding(i10, i11, i13));
                this.source.skip(i13);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    private final void readGoAway(Handler handler, int i10, int i11, int i12) throws IOException {
        if (i10 >= 8) {
            if (i12 == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                int i13 = i10 - 8;
                ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(readInt2);
                if (fromHttp2 != null) {
                    f fVar = f.f20622r;
                    if (i13 > 0) {
                        fVar = this.source.l(i13);
                    }
                    handler.goAway(readInt, fromHttp2, fVar);
                    return;
                }
                throw new IOException(q.q("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(readInt2)));
            }
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        throw new IOException(q.q("TYPE_GOAWAY length < 8: ", Integer.valueOf(i10)));
    }

    private final List<Header> readHeaderBlock(int i10, int i11, int i12, int i13) throws IOException {
        this.continuation.setLeft(i10);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i11);
        this.continuation.setFlags(i12);
        this.continuation.setStreamId(i13);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int i10, int i11, int i12) throws IOException {
        boolean z10;
        if (i12 != 0) {
            int i13 = 0;
            if ((i11 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 & 8) != 0) {
                i13 = Util.and(this.source.readByte(), 255);
            }
            if ((i11 & 32) != 0) {
                readPriority(handler, i12);
                i10 -= 5;
            }
            handler.headers(z10, i12, -1, readHeaderBlock(Companion.lengthWithoutPadding(i10, i11, i13), i13, i11, i12));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    private final void readPing(Handler handler, int i10, int i11, int i12) throws IOException {
        if (i10 == 8) {
            if (i12 == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                boolean z10 = true;
                if ((i11 & 1) == 0) {
                    z10 = false;
                }
                handler.ping(z10, readInt, readInt2);
                return;
            }
            throw new IOException("TYPE_PING streamId != 0");
        }
        throw new IOException(q.q("TYPE_PING length != 8: ", Integer.valueOf(i10)));
    }

    private final void readPriority(Handler handler, int i10, int i11, int i12) throws IOException {
        if (i10 == 5) {
            if (i12 != 0) {
                readPriority(handler, i12);
                return;
            }
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
    }

    private final void readPushPromise(Handler handler, int i10, int i11, int i12) throws IOException {
        int i13;
        if (i12 != 0) {
            if ((i11 & 8) != 0) {
                i13 = Util.and(this.source.readByte(), 255);
            } else {
                i13 = 0;
            }
            handler.pushPromise(i12, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(Companion.lengthWithoutPadding(i10 - 4, i11, i13), i13, i11, i12));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    private final void readRstStream(Handler handler, int i10, int i11, int i12) throws IOException {
        if (i10 == 4) {
            if (i12 != 0) {
                int readInt = this.source.readInt();
                ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(readInt);
                if (fromHttp2 != null) {
                    handler.rstStream(i12, fromHttp2);
                    return;
                }
                throw new IOException(q.q("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(readInt)));
            }
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
    }

    private final void readSettings(Handler handler, int i10, int i11, int i12) throws IOException {
        vc.f s10;
        d r10;
        int readInt;
        if (i12 == 0) {
            if ((i11 & 1) != 0) {
                if (i10 == 0) {
                    handler.ackSettings();
                    return;
                }
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            } else if (i10 % 6 == 0) {
                Settings settings = new Settings();
                s10 = l.s(0, i10);
                r10 = l.r(s10, 6);
                int h10 = r10.h();
                int i13 = r10.i();
                int j10 = r10.j();
                if ((j10 > 0 && h10 <= i13) || (j10 < 0 && i13 <= h10)) {
                    while (true) {
                        int i14 = h10 + j10;
                        int and = Util.and(this.source.readShort(), (int) Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        readInt = this.source.readInt();
                        if (and != 2) {
                            if (and != 3) {
                                if (and != 4) {
                                    if (and == 5 && (readInt < 16384 || readInt > 16777215)) {
                                        break;
                                    }
                                } else if (readInt >= 0) {
                                    and = 7;
                                } else {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else {
                                and = 4;
                            }
                        } else if (readInt != 0 && readInt != 1) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                        }
                        settings.set(and, readInt);
                        if (h10 == i13) {
                            break;
                        }
                        h10 = i14;
                    }
                    throw new IOException(q.q("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", Integer.valueOf(readInt)));
                }
                handler.settings(false, settings);
                return;
            } else {
                throw new IOException(q.q("TYPE_SETTINGS length % 6 != 0: ", Integer.valueOf(i10)));
            }
        }
        throw new IOException("TYPE_SETTINGS streamId != 0");
    }

    private final void readWindowUpdate(Handler handler, int i10, int i11, int i12) throws IOException {
        if (i10 == 4) {
            long and = Util.and(this.source.readInt(), 2147483647L);
            if (and != 0) {
                handler.windowUpdate(i12, and);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException(q.q("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(i10)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public final boolean nextFrame(boolean z10, Handler handler) throws IOException {
        q.i(handler, "handler");
        try {
            this.source.O0(9L);
            int readMedium = Util.readMedium(this.source);
            if (readMedium <= 16384) {
                int and = Util.and(this.source.readByte(), 255);
                int and2 = Util.and(this.source.readByte(), 255);
                int readInt = this.source.readInt() & Integer.MAX_VALUE;
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Http2.INSTANCE.frameLog(true, readInt, readMedium, and, and2));
                }
                if (z10 && and != 4) {
                    throw new IOException(q.q("Expected a SETTINGS frame but was ", Http2.INSTANCE.formattedType$okhttp(and)));
                }
                switch (and) {
                    case 0:
                        readData(handler, readMedium, and2, readInt);
                        return true;
                    case 1:
                        readHeaders(handler, readMedium, and2, readInt);
                        return true;
                    case 2:
                        readPriority(handler, readMedium, and2, readInt);
                        return true;
                    case 3:
                        readRstStream(handler, readMedium, and2, readInt);
                        return true;
                    case 4:
                        readSettings(handler, readMedium, and2, readInt);
                        return true;
                    case 5:
                        readPushPromise(handler, readMedium, and2, readInt);
                        return true;
                    case 6:
                        readPing(handler, readMedium, and2, readInt);
                        return true;
                    case 7:
                        readGoAway(handler, readMedium, and2, readInt);
                        return true;
                    case 8:
                        readWindowUpdate(handler, readMedium, and2, readInt);
                        return true;
                    default:
                        this.source.skip(readMedium);
                        return true;
                }
            }
            throw new IOException(q.q("FRAME_SIZE_ERROR: ", Integer.valueOf(readMedium)));
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(Handler handler) throws IOException {
        q.i(handler, "handler");
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        e eVar = this.source;
        f fVar = Http2.CONNECTION_PREFACE;
        f l10 = eVar.l(fVar.D());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format(q.q("<< CONNECTION ", l10.n()), new Object[0]));
        }
        if (q.d(fVar, l10)) {
            return;
        }
        throw new IOException(q.q("Expected a connection header but was ", l10.I()));
    }

    private final void readPriority(Handler handler, int i10) throws IOException {
        int readInt = this.source.readInt();
        handler.priority(i10, readInt & Integer.MAX_VALUE, Util.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* compiled from: Http2Reader.kt */
    /* loaded from: classes4.dex */
    public static final class ContinuationSource implements Source {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final e source;
        private int streamId;

        public ContinuationSource(e eVar) {
            q.i(eVar, "source");
            this.source = eVar;
        }

        private final void readContinuationHeader() throws IOException {
            int i10 = this.streamId;
            int readMedium = Util.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            int and = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, and, this.flags));
            }
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = readInt;
            if (and == 9) {
                if (readInt == i10) {
                    return;
                }
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
            throw new IOException(and + " != TYPE_CONTINUATION");
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // okio.Source
        public long read(c cVar, long j10) throws IOException {
            q.i(cVar, "sink");
            while (true) {
                int i10 = this.left;
                if (i10 == 0) {
                    this.source.skip(this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    readContinuationHeader();
                } else {
                    long read = this.source.read(cVar, Math.min(j10, i10));
                    if (read == -1) {
                        return -1L;
                    }
                    this.left -= (int) read;
                    return read;
                }
            }
        }

        public final void setFlags(int i10) {
            this.flags = i10;
        }

        public final void setLeft(int i10) {
            this.left = i10;
        }

        public final void setLength(int i10) {
            this.length = i10;
        }

        public final void setPadding(int i10) {
            this.padding = i10;
        }

        public final void setStreamId(int i10) {
            this.streamId = i10;
        }

        @Override // okio.Source
        public a1 timeout() {
            return this.source.timeout();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}
