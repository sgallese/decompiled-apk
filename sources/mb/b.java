package mb;

import android.util.Log;

/* compiled from: SvgSupport.java */
/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f19858a;

    static {
        boolean z10;
        try {
            Class.forName("com.caverock.androidsvg.SVG");
            z10 = true;
        } catch (Throwable unused) {
            Log.w("MarkwonImagesPlugin", b());
            z10 = false;
        }
        f19858a = z10;
    }

    public static boolean a() {
        return f19858a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b() {
        return "`com.caverock:androidsvg:*` dependency is missing, please add to your project explicitly if you wish to use SVG media-decoder";
    }
}
