package okhttp3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import pc.l;
import qc.q;

/* compiled from: Interceptor.kt */
/* loaded from: classes4.dex */
public interface Interceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: Interceptor.kt */
    /* loaded from: classes4.dex */
    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        Connection connection();

        Response proceed(Request request) throws IOException;

        int readTimeoutMillis();

        Request request();

        Chain withConnectTimeout(int i10, TimeUnit timeUnit);

        Chain withReadTimeout(int i10, TimeUnit timeUnit);

        Chain withWriteTimeout(int i10, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    /* compiled from: Interceptor.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Interceptor invoke(final l<? super Chain, Response> lVar) {
            q.i(lVar, "block");
            return new Interceptor() { // from class: okhttp3.Interceptor$Companion$invoke$1
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    q.i(chain, "it");
                    return lVar.invoke(chain);
                }
            };
        }
    }

    Response intercept(Chain chain) throws IOException;
}
