package a6;

import android.content.Context;
import java.io.File;

/* compiled from: ReLinker.java */
/* loaded from: classes.dex */
public class b {

    /* compiled from: ReLinker.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(Context context, String[] strArr, String str, File file, a6.c cVar);
    }

    /* compiled from: ReLinker.java */
    /* renamed from: a6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0006b {
        String a(String str);

        void b(String str);

        String c(String str);

        String[] d();

        void e(String str);
    }

    /* compiled from: ReLinker.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    public static void a(Context context, String str, String str2) {
        b(context, str, str2, null);
    }

    public static void b(Context context, String str, String str2, c cVar) {
        new a6.c().f(context, str, str2, cVar);
    }
}
