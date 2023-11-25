package a6;

import a6.b;
import android.os.Build;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SystemLibraryLoader.java */
/* loaded from: classes.dex */
public final class d implements b.InterfaceC0006b {
    @Override // a6.b.InterfaceC0006b
    public String a(String str) {
        if (str.startsWith("lib") && str.endsWith(".so")) {
            return str;
        }
        return System.mapLibraryName(str);
    }

    @Override // a6.b.InterfaceC0006b
    public void b(String str) {
        System.loadLibrary(str);
    }

    @Override // a6.b.InterfaceC0006b
    public String c(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // a6.b.InterfaceC0006b
    public String[] d() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        if (!e.a(str)) {
            return new String[]{Build.CPU_ABI, str};
        }
        return new String[]{Build.CPU_ABI};
    }

    @Override // a6.b.InterfaceC0006b
    public void e(String str) {
        System.load(str);
    }
}
