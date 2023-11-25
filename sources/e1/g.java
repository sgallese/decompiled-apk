package e1;

import java.util.ArrayList;

/* compiled from: ImageVector.kt */
/* loaded from: classes.dex */
public final class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T d(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T e(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean f(ArrayList<T> arrayList, T t10) {
        return arrayList.add(t10);
    }
}
