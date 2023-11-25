package g5;

import android.content.Context;
import java.io.File;
import u4.a;

/* compiled from: Utils.kt */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f16212a = new v();

    /* renamed from: b  reason: collision with root package name */
    private static u4.a f16213b;

    private v() {
    }

    public final synchronized u4.a a(Context context) {
        u4.a aVar;
        File f10;
        aVar = f16213b;
        if (aVar == null) {
            a.C0565a c0565a = new a.C0565a();
            f10 = nc.g.f(l.m(context), "image_cache");
            aVar = c0565a.b(f10).a();
            f16213b = aVar;
        }
        return aVar;
    }
}
