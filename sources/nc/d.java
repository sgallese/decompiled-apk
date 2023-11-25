package nc;

import java.io.File;
import qc.q;
import yc.m;

/* compiled from: FilePathComponents.kt */
/* loaded from: classes4.dex */
class d {
    private static final int a(String str) {
        int W;
        int W2 = m.W(str, File.separatorChar, 0, false, 4, null);
        if (W2 == 0) {
            if (str.length() > 1) {
                char charAt = str.charAt(1);
                char c10 = File.separatorChar;
                if (charAt == c10 && (W = m.W(str, c10, 2, false, 4, null)) >= 0) {
                    int W3 = m.W(str, File.separatorChar, W + 1, false, 4, null);
                    if (W3 >= 0) {
                        return W3 + 1;
                    }
                    return str.length();
                }
            }
            return 1;
        } else if (W2 > 0 && str.charAt(W2 - 1) == ':') {
            return W2 + 1;
        } else {
            if (W2 != -1 || !m.N(str, ':', false, 2, null)) {
                return 0;
            }
            return str.length();
        }
    }

    public static final boolean b(File file) {
        q.i(file, "<this>");
        String path = file.getPath();
        q.h(path, "path");
        if (a(path) > 0) {
            return true;
        }
        return false;
    }
}
