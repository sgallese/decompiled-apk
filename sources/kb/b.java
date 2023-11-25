package kb;

import android.util.Log;

/* compiled from: GifSupport.java */
/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f19447a;

    static {
        boolean z10;
        try {
            Class.forName("pl.droidsonroids.gif.GifDrawable");
            z10 = true;
        } catch (Throwable unused) {
            Log.w("MarkwonImagesPlugin", b());
            z10 = false;
        }
        f19447a = z10;
    }

    public static boolean a() {
        return f19447a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b() {
        return "`pl.droidsonroids.gif:android-gif-drawable:*` dependency is missing, please add to your project explicitly if you wish to use GIF media-decoder";
    }
}
