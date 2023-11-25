package kb;

import android.graphics.drawable.Drawable;
import io.noties.markwon.image.q;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import pl.droidsonroids.gif.GifDrawable;

/* compiled from: GifMediaDecoder.java */
/* loaded from: classes4.dex */
public class a extends q {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19446a;

    protected a(boolean z10) {
        this.f19446a = z10;
        g();
    }

    public static a c() {
        return d(true);
    }

    public static a d(boolean z10) {
        return new a(z10);
    }

    protected static byte[] f(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private static void g() {
        if (b.a()) {
            return;
        }
        throw new IllegalStateException(b.b());
    }

    @Override // io.noties.markwon.image.q
    public Drawable a(String str, InputStream inputStream) {
        try {
            try {
                GifDrawable e10 = e(f(inputStream));
                if (!this.f19446a) {
                    e10.pause();
                }
                return e10;
            } catch (IOException e11) {
                throw new IllegalStateException("Exception creating GifDrawable", e11);
            }
        } catch (IOException e12) {
            throw new IllegalStateException("Cannot read GIF input-stream", e12);
        }
    }

    @Override // io.noties.markwon.image.q
    public Collection<String> b() {
        return Collections.singleton("image/gif");
    }

    protected GifDrawable e(byte[] bArr) throws IOException {
        return new GifDrawable(bArr);
    }
}
