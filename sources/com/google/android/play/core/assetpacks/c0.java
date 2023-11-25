package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class c0 {
    public static boolean a(int i10) {
        if (i10 == 1 || i10 == 7 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    public static boolean b(int i10) {
        if (i10 != 2 && i10 != 7 && i10 != 3) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(int i10, int i11) {
        if (i10 == 5) {
            if (i11 != 5) {
                return true;
            }
            i10 = 5;
        }
        if (i10 == 6) {
            if (i11 != 6 && i11 != 5) {
                return true;
            }
            i10 = 6;
        }
        if (i10 == 4 && i11 != 4) {
            return true;
        }
        if (i10 == 3 && (i11 == 2 || i11 == 7 || i11 == 1 || i11 == 8)) {
            return true;
        }
        if (i10 == 2) {
            if (i11 == 1 || i11 == 8) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean d(int i10) {
        if (i10 != 5 && i10 != 6 && i10 != 4) {
            return false;
        }
        return true;
    }
}
