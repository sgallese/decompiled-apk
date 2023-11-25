package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* compiled from: BenchmarkOperation.java */
/* loaded from: classes.dex */
class a {

    /* compiled from: BenchmarkOperation.java */
    /* renamed from: androidx.profileinstaller.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0152a {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* compiled from: BenchmarkOperation.java */
    /* loaded from: classes.dex */
    private static class b {
        static File a(Context context) {
            Context createDeviceProtectedStorageContext;
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            return createDeviceProtectedStorageContext.getCodeCacheDir();
        }
    }

    static boolean a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z10 = true;
            for (File file2 : listFiles) {
                if (a(file2) && z10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            return z10;
        }
        file.delete();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context, ProfileInstallReceiver.a aVar) {
        File cacheDir;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            cacheDir = b.a(context);
        } else if (i10 >= 23) {
            cacheDir = C0152a.a(context);
        } else {
            cacheDir = context.getCacheDir();
        }
        if (a(cacheDir)) {
            aVar.b(14, null);
        } else {
            aVar.b(15, null);
        }
    }
}
