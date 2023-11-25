package com.google.common.collect;

/* compiled from: Collections2.java */
/* loaded from: classes3.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static StringBuilder a(int i10) {
        d.b(i10, "size");
        return new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
    }
}
