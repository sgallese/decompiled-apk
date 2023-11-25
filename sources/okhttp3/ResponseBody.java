package okhttp3;

import dc.w;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import nc.b;
import okhttp3.internal.Util;
import okio.c;
import okio.e;
import okio.f;
import pc.l;
import qc.h;
import qc.o;
import qc.q;
import yc.d;

/* compiled from: ResponseBody.kt */
/* loaded from: classes4.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    /* compiled from: ResponseBody.kt */
    /* loaded from: classes4.dex */
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final e source;

        public BomAwareReader(e eVar, Charset charset) {
            q.i(eVar, "source");
            q.i(charset, "charset");
            this.source = eVar;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            w wVar;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader == null) {
                wVar = null;
            } else {
                reader.close();
                wVar = w.f13270a;
            }
            if (wVar == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            q.i(cArr, "cbuf");
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    reader = new InputStreamReader(this.source.U0(), Util.readBomAsCharset(this.source, this.charset));
                    this.delegate = reader;
                }
                return reader.read(cArr, i10, i11);
            }
            throw new IOException("Stream closed");
        }
    }

    /* compiled from: ResponseBody.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            q.i(str, "<this>");
            Charset charset = d.f26303b;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charset$default;
                }
            }
            c Z0 = new c().Z0(str, charset);
            return create(Z0, mediaType, Z0.s0());
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, f fVar, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(fVar, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, e eVar, MediaType mediaType, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            if ((i10 & 2) != 0) {
                j10 = -1;
            }
            return companion.create(eVar, mediaType, j10);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            q.i(bArr, "<this>");
            return create(new c().y0(bArr), mediaType, bArr.length);
        }

        public final ResponseBody create(f fVar, MediaType mediaType) {
            q.i(fVar, "<this>");
            return create(new c().B0(fVar), mediaType, fVar.D());
        }

        public final ResponseBody create(final e eVar, final MediaType mediaType, final long j10) {
            q.i(eVar, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j10;
                }

                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                public e source() {
                    return eVar;
                }
            };
        }

        public final ResponseBody create(MediaType mediaType, String str) {
            q.i(str, "content");
            return create(str, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            q.i(bArr, "content");
            return create(bArr, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, f fVar) {
            q.i(fVar, "content");
            return create(fVar, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, long j10, e eVar) {
            q.i(eVar, "content");
            return create(eVar, mediaType, j10);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType contentType = contentType();
        if (contentType == null) {
            charset = null;
        } else {
            charset = contentType.charset(d.f26303b);
        }
        if (charset == null) {
            return d.f26303b;
        }
        return charset;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(l<? super e, ? extends T> lVar, l<? super T, Integer> lVar2) {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            e source = source();
            try {
                T invoke = lVar.invoke(source);
                o.b(1);
                b.a(source, null);
                o.a(1);
                int intValue = lVar2.invoke(invoke).intValue();
                if (contentLength != -1 && contentLength != intValue) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + intValue + ") disagree");
                }
                return invoke;
            } finally {
            }
        } else {
            throw new IOException(q.q("Cannot buffer entire body for content length: ", Long.valueOf(contentLength)));
        }
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public final InputStream byteStream() {
        return source().U0();
    }

    public final f byteString() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            e source = source();
            try {
                f j02 = source.j0();
                b.a(source, null);
                int D = j02.D();
                if (contentLength != -1 && contentLength != D) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + D + ") disagree");
                }
                return j02;
            } finally {
            }
        } else {
            throw new IOException(q.q("Cannot buffer entire body for content length: ", Long.valueOf(contentLength)));
        }
    }

    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            e source = source();
            try {
                byte[] A = source.A();
                b.a(source, null);
                int length = A.length;
                if (contentLength != -1 && contentLength != length) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
                }
                return A;
            } finally {
            }
        } else {
            throw new IOException(q.q("Cannot buffer entire body for content length: ", Long.valueOf(contentLength)));
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader == null) {
            BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
            this.reader = bomAwareReader;
            return bomAwareReader;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract e source();

    public final String string() throws IOException {
        e source = source();
        try {
            String b02 = source.b0(Util.readBomAsCharset(source, charset()));
            b.a(source, null);
            return b02;
        } finally {
        }
    }

    public static final ResponseBody create(MediaType mediaType, long j10, e eVar) {
        return Companion.create(mediaType, j10, eVar);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, f fVar) {
        return Companion.create(mediaType, fVar);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(e eVar, MediaType mediaType, long j10) {
        return Companion.create(eVar, mediaType, j10);
    }

    public static final ResponseBody create(f fVar, MediaType mediaType) {
        return Companion.create(fVar, mediaType);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }
}
