package okhttp3;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.c;
import okio.d;
import okio.f;
import qc.h;
import qc.q;

/* compiled from: MultipartBody.kt */
/* loaded from: classes4.dex */
public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE;
    private static final byte[] COLONSPACE;
    private static final byte[] CRLF;
    public static final Companion Companion = new Companion(null);
    private static final byte[] DASHDASH;
    public static final MediaType DIGEST;
    public static final MediaType FORM;
    public static final MediaType MIXED;
    public static final MediaType PARALLEL;
    private final f boundaryByteString;
    private long contentLength;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;

    /* compiled from: MultipartBody.kt */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private final f boundary;
        private final List<Part> parts;
        private MediaType type;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Type inference failed for: r0v0, types: [qc.h, java.lang.String] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Builder() {
            /*
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.Builder.<init>():void");
        }

        public final Builder addFormDataPart(String str, String str2) {
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            q.i(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addPart(Part.Companion.createFormData(str, str2));
            return this;
        }

        public final Builder addPart(RequestBody requestBody) {
            q.i(requestBody, "body");
            addPart(Part.Companion.create(requestBody));
            return this;
        }

        public final MultipartBody build() {
            if ((!this.parts.isEmpty()) != false) {
                return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final Builder setType(MediaType mediaType) {
            q.i(mediaType, TaskFormActivity.TASK_TYPE_KEY);
            if (q.d(mediaType.type(), "multipart")) {
                this.type = mediaType;
                return this;
            }
            throw new IllegalArgumentException(q.q("multipart != ", mediaType).toString());
        }

        public Builder(String str) {
            q.i(str, "boundary");
            this.boundary = f.f20621q.d(str);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        public final Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            q.i(requestBody, "body");
            addPart(Part.Companion.createFormData(str, str2, requestBody));
            return this;
        }

        public final Builder addPart(Headers headers, RequestBody requestBody) {
            q.i(requestBody, "body");
            addPart(Part.Companion.create(headers, requestBody));
            return this;
        }

        public final Builder addPart(Part part) {
            q.i(part, "part");
            this.parts.add(part);
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Builder(java.lang.String r1, int r2, qc.h r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L11
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "randomUUID().toString()"
                qc.q.h(r1, r2)
            L11:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.Builder.<init>(java.lang.String, int, qc.h):void");
        }
    }

    /* compiled from: MultipartBody.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final void appendQuotedString$okhttp(StringBuilder sb2, String str) {
            q.i(sb2, "<this>");
            q.i(str, "key");
            sb2.append('\"');
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char charAt = str.charAt(i10);
                if (charAt == '\n') {
                    sb2.append("%0A");
                } else if (charAt == '\r') {
                    sb2.append("%0D");
                } else if (charAt == '\"') {
                    sb2.append("%22");
                } else {
                    sb2.append(charAt);
                }
                i10 = i11;
            }
            sb2.append('\"');
        }
    }

    /* compiled from: MultipartBody.kt */
    /* loaded from: classes4.dex */
    public static final class Part {
        public static final Companion Companion = new Companion(null);
        private final RequestBody body;
        private final Headers headers;

        /* compiled from: MultipartBody.kt */
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final Part create(RequestBody requestBody) {
                q.i(requestBody, "body");
                return create(null, requestBody);
            }

            public final Part createFormData(String str, String str2) {
                q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                q.i(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                return createFormData(str, null, RequestBody.Companion.create$default(RequestBody.Companion, str2, (MediaType) null, 1, (Object) null));
            }

            public final Part create(Headers headers, RequestBody requestBody) {
                q.i(requestBody, "body");
                h hVar = null;
                if ((headers == null ? null : headers.get("Content-Type")) == null) {
                    if ((headers == null ? null : headers.get("Content-Length")) == null) {
                        return new Part(headers, requestBody, hVar);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            public final Part createFormData(String str, String str2, RequestBody requestBody) {
                q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                q.i(requestBody, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                Companion companion = MultipartBody.Companion;
                companion.appendQuotedString$okhttp(sb2, str);
                if (str2 != null) {
                    sb2.append("; filename=");
                    companion.appendQuotedString$okhttp(sb2, str2);
                }
                String sb3 = sb2.toString();
                q.h(sb3, "StringBuilder().apply(builderAction).toString()");
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb3).build(), requestBody);
            }
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, h hVar) {
            this(headers, requestBody);
        }

        public static final Part create(Headers headers, RequestBody requestBody) {
            return Companion.create(headers, requestBody);
        }

        public static final Part createFormData(String str, String str2) {
            return Companion.createFormData(str, str2);
        }

        /* renamed from: -deprecated_body  reason: not valid java name */
        public final RequestBody m314deprecated_body() {
            return this.body;
        }

        /* renamed from: -deprecated_headers  reason: not valid java name */
        public final Headers m315deprecated_headers() {
            return this.headers;
        }

        public final RequestBody body() {
            return this.body;
        }

        public final Headers headers() {
            return this.headers;
        }

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public static final Part create(RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        public static final Part createFormData(String str, String str2, RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }
    }

    static {
        MediaType.Companion companion = MediaType.Companion;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
        COLONSPACE = new byte[]{58, 32};
        CRLF = new byte[]{13, 10};
        DASHDASH = new byte[]{45, 45};
    }

    public MultipartBody(f fVar, MediaType mediaType, List<Part> list) {
        q.i(fVar, "boundaryByteString");
        q.i(mediaType, TaskFormActivity.TASK_TYPE_KEY);
        q.i(list, "parts");
        this.boundaryByteString = fVar;
        this.type = mediaType;
        this.parts = list;
        this.contentType = MediaType.Companion.get(mediaType + "; boundary=" + boundary());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long writeOrCountBytes(d dVar, boolean z10) throws IOException {
        c cVar;
        if (z10) {
            dVar = new c();
            cVar = dVar;
        } else {
            cVar = 0;
        }
        int size = this.parts.size();
        long j10 = 0;
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            Part part = this.parts.get(i10);
            Headers headers = part.headers();
            RequestBody body = part.body();
            q.f(dVar);
            dVar.y0(DASHDASH);
            dVar.B0(this.boundaryByteString);
            dVar.y0(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    dVar.W(headers.name(i12)).y0(COLONSPACE).W(headers.value(i12)).y0(CRLF);
                }
            }
            MediaType contentType = body.contentType();
            if (contentType != null) {
                dVar.W("Content-Type: ").W(contentType.toString()).y0(CRLF);
            }
            long contentLength = body.contentLength();
            if (contentLength != -1) {
                dVar.W("Content-Length: ").P0(contentLength).y0(CRLF);
            } else if (z10) {
                q.f(cVar);
                cVar.b();
                return -1L;
            }
            byte[] bArr = CRLF;
            dVar.y0(bArr);
            if (z10) {
                j10 += contentLength;
            } else {
                body.writeTo(dVar);
            }
            dVar.y0(bArr);
            i10 = i11;
        }
        q.f(dVar);
        byte[] bArr2 = DASHDASH;
        dVar.y0(bArr2);
        dVar.B0(this.boundaryByteString);
        dVar.y0(bArr2);
        dVar.y0(CRLF);
        if (z10) {
            q.f(cVar);
            long s02 = j10 + cVar.s0();
            cVar.b();
            return s02;
        }
        return j10;
    }

    /* renamed from: -deprecated_boundary  reason: not valid java name */
    public final String m310deprecated_boundary() {
        return boundary();
    }

    /* renamed from: -deprecated_parts  reason: not valid java name */
    public final List<Part> m311deprecated_parts() {
        return this.parts;
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m312deprecated_size() {
        return size();
    }

    /* renamed from: -deprecated_type  reason: not valid java name */
    public final MediaType m313deprecated_type() {
        return this.type;
    }

    public final String boundary() {
        return this.boundaryByteString.I();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j10 = this.contentLength;
        if (j10 == -1) {
            long writeOrCountBytes = writeOrCountBytes(null, true);
            this.contentLength = writeOrCountBytes;
            return writeOrCountBytes;
        }
        return j10;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.contentType;
    }

    public final Part part(int i10) {
        return this.parts.get(i10);
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final int size() {
        return this.parts.size();
    }

    public final MediaType type() {
        return this.type;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(d dVar) throws IOException {
        q.i(dVar, "sink");
        writeOrCountBytes(dVar, false);
    }
}
