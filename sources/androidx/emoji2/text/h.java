package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: EmojiExclusions.java */
/* loaded from: classes.dex */
class h {

    /* compiled from: EmojiExclusions.java */
    /* loaded from: classes.dex */
    private static class a {
        static Set<int[]> a() {
            return b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiExclusions.java */
    /* loaded from: classes.dex */
    public static class b {
        @SuppressLint({"BanUncheckedReflection"})
        static Set<int[]> a() {
            try {
                Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
                if (invoke == null) {
                    return Collections.emptySet();
                }
                Set<int[]> set = (Set) invoke;
                Iterator<int[]> it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Set<int[]> a() {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a();
        }
        return b.a();
    }
}
