package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okio.f;
import qc.q;

/* compiled from: Credentials.kt */
/* loaded from: classes4.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String str, String str2) {
        q.i(str, "username");
        q.i(str2, "password");
        return basic$default(str, str2, null, 4, null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            q.h(charset, "ISO_8859_1");
        }
        return basic(str, str2, charset);
    }

    public static final String basic(String str, String str2, Charset charset) {
        q.i(str, "username");
        q.i(str2, "password");
        q.i(charset, "charset");
        return q.q("Basic ", f.f20621q.c(str + ':' + str2, charset).b());
    }
}
