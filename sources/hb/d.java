package hb;

import android.net.Uri;
import io.noties.markwon.image.j;
import io.noties.markwon.image.r;
import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.Collections;

/* compiled from: DataUriSchemeHandler.java */
/* loaded from: classes4.dex */
public class d extends r {

    /* renamed from: a  reason: collision with root package name */
    private final c f16591a;

    /* renamed from: b  reason: collision with root package name */
    private final b f16592b;

    d(c cVar, b bVar) {
        this.f16591a = cVar;
        this.f16592b = bVar;
    }

    public static d c() {
        return new d(c.a(), b.a());
    }

    @Override // io.noties.markwon.image.r
    public j a(String str, Uri uri) {
        if (str.startsWith("data:")) {
            a b10 = this.f16591a.b(str.substring(5));
            if (b10 != null) {
                try {
                    byte[] b11 = this.f16592b.b(b10);
                    if (b11 != null) {
                        return j.d(b10.b(), new ByteArrayInputStream(b11));
                    }
                    throw new IllegalStateException("Decoding data-uri failed: " + str);
                } catch (Throwable th) {
                    throw new IllegalStateException("Cannot decode data-uri: " + str, th);
                }
            }
            throw new IllegalStateException("Invalid data-uri: " + str);
        }
        throw new IllegalStateException("Invalid data-uri: " + str);
    }

    @Override // io.noties.markwon.image.r
    public Collection<String> b() {
        return Collections.singleton("data");
    }
}
