package mb;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParseException;
import io.noties.markwon.image.q;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;

/* compiled from: SvgMediaDecoder.java */
/* loaded from: classes4.dex */
public class a extends q {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f19857a;

    a(Resources resources) {
        this.f19857a = resources;
        e();
    }

    public static a c() {
        return d(Resources.getSystem());
    }

    public static a d(Resources resources) {
        return new a(resources);
    }

    private static void e() {
        if (b.a()) {
            return;
        }
        throw new IllegalStateException(b.b());
    }

    @Override // io.noties.markwon.image.q
    public Drawable a(String str, InputStream inputStream) {
        try {
            SVG fromInputStream = SVG.getFromInputStream(inputStream);
            float documentWidth = fromInputStream.getDocumentWidth();
            float documentHeight = fromInputStream.getDocumentHeight();
            float f10 = this.f19857a.getDisplayMetrics().density;
            Bitmap createBitmap = Bitmap.createBitmap((int) ((documentWidth * f10) + 0.5f), (int) ((documentHeight * f10) + 0.5f), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(f10, f10);
            fromInputStream.renderToCanvas(canvas);
            return new BitmapDrawable(this.f19857a, createBitmap);
        } catch (SVGParseException e10) {
            throw new IllegalStateException("Exception decoding SVG", e10);
        }
    }

    @Override // io.noties.markwon.image.q
    public Collection<String> b() {
        return Collections.singleton("image/svg+xml");
    }
}
