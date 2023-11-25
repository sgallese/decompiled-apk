package okhttp3;

import com.google.android.gms.common.internal.ImagesContract;
import ec.t;
import java.util.List;
import qc.q;

/* compiled from: CookieJar.kt */
/* loaded from: classes4.dex */
public interface CookieJar {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    /* compiled from: CookieJar.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* compiled from: CookieJar.kt */
        /* loaded from: classes4.dex */
        private static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            public List<Cookie> loadForRequest(HttpUrl httpUrl) {
                List<Cookie> i10;
                q.i(httpUrl, ImagesContract.URL);
                i10 = t.i();
                return i10;
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
                q.i(httpUrl, ImagesContract.URL);
                q.i(list, "cookies");
            }
        }

        private Companion() {
        }
    }

    List<Cookie> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<Cookie> list);
}
