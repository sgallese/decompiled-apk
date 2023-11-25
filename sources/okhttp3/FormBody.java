package okhttp3;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okio.c;
import okio.d;
import qc.h;
import qc.q;

/* compiled from: FormBody.kt */
/* loaded from: classes4.dex */
public final class FormBody extends RequestBody {
    private final List<String> encodedNames;
    private final List<String> encodedValues;
    public static final Companion Companion = new Companion(null);
    private static final MediaType CONTENT_TYPE = MediaType.Companion.get("application/x-www-form-urlencoded");

    /* compiled from: FormBody.kt */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.nio.charset.Charset, qc.h] */
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
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.FormBody.Builder.<init>():void");
        }

        public final Builder add(String str, String str2) {
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            q.i(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            return this;
        }

        public final Builder addEncoded(String str, String str2) {
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            q.i(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            return this;
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }

        public Builder(Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public /* synthetic */ Builder(Charset charset, int i10, h hVar) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }

    /* compiled from: FormBody.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public FormBody(List<String> list, List<String> list2) {
        q.i(list, "encodedNames");
        q.i(list2, "encodedValues");
        this.encodedNames = Util.toImmutableList(list);
        this.encodedValues = Util.toImmutableList(list2);
    }

    private final long writeOrCountBytes(d dVar, boolean z10) {
        c a10;
        if (z10) {
            a10 = new c();
        } else {
            q.f(dVar);
            a10 = dVar.a();
        }
        int size = this.encodedNames.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                a10.D(38);
            }
            a10.W(this.encodedNames.get(i10));
            a10.D(61);
            a10.W(this.encodedValues.get(i10));
            i10 = i11;
        }
        if (z10) {
            long s02 = a10.s0();
            a10.b();
            return s02;
        }
        return 0L;
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m272deprecated_size() {
        return size();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public final String encodedName(int i10) {
        return this.encodedNames.get(i10);
    }

    public final String encodedValue(int i10) {
        return this.encodedValues.get(i10);
    }

    public final String name(int i10) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedName(i10), 0, 0, true, 3, null);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    public final String value(int i10) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedValue(i10), 0, 0, true, 3, null);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(d dVar) throws IOException {
        q.i(dVar, "sink");
        writeOrCountBytes(dVar, false);
    }
}
