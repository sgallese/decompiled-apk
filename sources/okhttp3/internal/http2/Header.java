package okhttp3.internal.http2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import okio.f;
import qc.h;
import qc.q;

/* compiled from: Header.kt */
/* loaded from: classes4.dex */
public final class Header {
    public static final Companion Companion = new Companion(null);
    public static final f PSEUDO_PREFIX;
    public static final f RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final f TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final f TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final f TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final f TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final f name;
    public final f value;

    /* compiled from: Header.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    static {
        f.a aVar = f.f20621q;
        PSEUDO_PREFIX = aVar.d(":");
        RESPONSE_STATUS = aVar.d(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = aVar.d(TARGET_METHOD_UTF8);
        TARGET_PATH = aVar.d(TARGET_PATH_UTF8);
        TARGET_SCHEME = aVar.d(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = aVar.d(TARGET_AUTHORITY_UTF8);
    }

    public Header(f fVar, f fVar2) {
        q.i(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        q.i(fVar2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.name = fVar;
        this.value = fVar2;
        this.hpackSize = fVar.D() + 32 + fVar2.D();
    }

    public static /* synthetic */ Header copy$default(Header header, f fVar, f fVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = header.name;
        }
        if ((i10 & 2) != 0) {
            fVar2 = header.value;
        }
        return header.copy(fVar, fVar2);
    }

    public final f component1() {
        return this.name;
    }

    public final f component2() {
        return this.value;
    }

    public final Header copy(f fVar, f fVar2) {
        q.i(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        q.i(fVar2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return new Header(fVar, fVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        if (q.d(this.name, header.name) && q.d(this.value, header.value)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return this.name.I() + ": " + this.value.I();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Header(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            qc.q.i(r2, r0)
            java.lang.String r0 = "value"
            qc.q.i(r3, r0)
            okio.f$a r0 = okio.f.f20621q
            okio.f r2 = r0.d(r2)
            okio.f r3 = r0.d(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Header.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(f fVar, String str) {
        this(fVar, f.f20621q.d(str));
        q.i(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
    }
}
