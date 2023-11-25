package com.google.common.collect;

/* compiled from: Hashing.java */
/* loaded from: classes3.dex */
final class g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return a(hashCode);
    }
}
