package a1;

import a1.v4;
import android.graphics.Shader;
import android.os.Build;

/* compiled from: AndroidTileMode.android.kt */
/* loaded from: classes.dex */
public final class w0 {
    public static final Shader.TileMode a(int i10) {
        v4.a aVar = v4.f208a;
        if (v4.f(i10, aVar.a())) {
            return Shader.TileMode.CLAMP;
        }
        if (v4.f(i10, aVar.d())) {
            return Shader.TileMode.REPEAT;
        }
        if (v4.f(i10, aVar.c())) {
            return Shader.TileMode.MIRROR;
        }
        if (v4.f(i10, aVar.b())) {
            if (Build.VERSION.SDK_INT >= 31) {
                return x4.f220a.b();
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }
}
