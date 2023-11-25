package okhttp3;

import java.io.IOException;
import okhttp3.internal.authenticator.JavaNetAuthenticator;
import qc.q;

/* compiled from: Authenticator.kt */
/* loaded from: classes4.dex */
public interface Authenticator {
    public static final Authenticator JAVA_NET_AUTHENTICATOR;
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final Authenticator NONE = new Companion.AuthenticatorNone();

    /* compiled from: Authenticator.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* compiled from: Authenticator.kt */
        /* loaded from: classes4.dex */
        private static final class AuthenticatorNone implements Authenticator {
            @Override // okhttp3.Authenticator
            public Request authenticate(Route route, Response response) {
                q.i(response, "response");
                return null;
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [qc.h, okhttp3.Dns] */
    static {
        ?? r12 = 0;
        JAVA_NET_AUTHENTICATOR = new JavaNetAuthenticator(r12, 1, r12);
    }

    Request authenticate(Route route, Response response) throws IOException;
}
