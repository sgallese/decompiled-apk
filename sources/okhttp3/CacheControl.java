package okhttp3;

import java.util.concurrent.TimeUnit;
import qc.h;
import qc.q;
import yc.w;

/* compiled from: CacheControl.kt */
/* loaded from: classes4.dex */
public final class CacheControl {
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;
    public static final Companion Companion = new Companion(null);
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    /* compiled from: CacheControl.kt */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j10) {
            if (j10 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j10;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder maxAge(int i10, TimeUnit timeUnit) {
            boolean z10;
            q.i(timeUnit, "timeUnit");
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(q.q("maxAge < 0: ", Integer.valueOf(i10)).toString());
        }

        public final Builder maxStale(int i10, TimeUnit timeUnit) {
            boolean z10;
            q.i(timeUnit, "timeUnit");
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(q.q("maxStale < 0: ", Integer.valueOf(i10)).toString());
        }

        public final Builder minFresh(int i10, TimeUnit timeUnit) {
            boolean z10;
            q.i(timeUnit, "timeUnit");
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.minFreshSeconds = clampToInt(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(q.q("minFresh < 0: ", Integer.valueOf(i10)).toString());
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    /* compiled from: CacheControl.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i10) {
            boolean J;
            int length = str.length();
            while (i10 < length) {
                int i11 = i10 + 1;
                J = w.J(str2, str.charAt(i10), false, 2, null);
                if (J) {
                    return i10;
                }
                i10 = i11;
            }
            return str.length();
        }

        static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return companion.indexOfElement(str, str2, i10);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.CacheControl parse(okhttp3.Headers r31) {
            /*
                Method dump skipped, instructions count: 408
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.parse(okhttp3.Headers):okhttp3.CacheControl");
        }
    }

    public /* synthetic */ CacheControl(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, h hVar) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }

    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    /* renamed from: -deprecated_immutable  reason: not valid java name */
    public final boolean m244deprecated_immutable() {
        return this.immutable;
    }

    /* renamed from: -deprecated_maxAgeSeconds  reason: not valid java name */
    public final int m245deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* renamed from: -deprecated_maxStaleSeconds  reason: not valid java name */
    public final int m246deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* renamed from: -deprecated_minFreshSeconds  reason: not valid java name */
    public final int m247deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* renamed from: -deprecated_mustRevalidate  reason: not valid java name */
    public final boolean m248deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    /* renamed from: -deprecated_noCache  reason: not valid java name */
    public final boolean m249deprecated_noCache() {
        return this.noCache;
    }

    /* renamed from: -deprecated_noStore  reason: not valid java name */
    public final boolean m250deprecated_noStore() {
        return this.noStore;
    }

    /* renamed from: -deprecated_noTransform  reason: not valid java name */
    public final boolean m251deprecated_noTransform() {
        return this.noTransform;
    }

    /* renamed from: -deprecated_onlyIfCached  reason: not valid java name */
    public final boolean m252deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    /* renamed from: -deprecated_sMaxAgeSeconds  reason: not valid java name */
    public final int m253deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        boolean z10;
        String str = this.headerValue;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            if (noCache()) {
                sb2.append("no-cache, ");
            }
            if (noStore()) {
                sb2.append("no-store, ");
            }
            if (maxAgeSeconds() != -1) {
                sb2.append("max-age=");
                sb2.append(maxAgeSeconds());
                sb2.append(", ");
            }
            if (sMaxAgeSeconds() != -1) {
                sb2.append("s-maxage=");
                sb2.append(sMaxAgeSeconds());
                sb2.append(", ");
            }
            if (isPrivate()) {
                sb2.append("private, ");
            }
            if (isPublic()) {
                sb2.append("public, ");
            }
            if (mustRevalidate()) {
                sb2.append("must-revalidate, ");
            }
            if (maxStaleSeconds() != -1) {
                sb2.append("max-stale=");
                sb2.append(maxStaleSeconds());
                sb2.append(", ");
            }
            if (minFreshSeconds() != -1) {
                sb2.append("min-fresh=");
                sb2.append(minFreshSeconds());
                sb2.append(", ");
            }
            if (onlyIfCached()) {
                sb2.append("only-if-cached, ");
            }
            if (noTransform()) {
                sb2.append("no-transform, ");
            }
            if (immutable()) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return "";
            }
            sb2.delete(sb2.length() - 2, sb2.length());
            String sb3 = sb2.toString();
            q.h(sb3, "StringBuilder().apply(builderAction).toString()");
            this.headerValue = sb3;
            return sb3;
        }
        return str;
    }

    private CacheControl(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.noCache = z10;
        this.noStore = z11;
        this.maxAgeSeconds = i10;
        this.sMaxAgeSeconds = i11;
        this.isPrivate = z12;
        this.isPublic = z13;
        this.mustRevalidate = z14;
        this.maxStaleSeconds = i12;
        this.minFreshSeconds = i13;
        this.onlyIfCached = z15;
        this.noTransform = z16;
        this.immutable = z17;
        this.headerValue = str;
    }
}
