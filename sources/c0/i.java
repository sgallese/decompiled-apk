package c0;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* compiled from: DeadKeyCombiner.android.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private Integer f8444a;

    public final Integer a(KeyEvent keyEvent) {
        boolean z10;
        qc.q.i(keyEvent, "event");
        int c10 = i1.d.c(keyEvent);
        Integer num = null;
        if ((Integer.MIN_VALUE & c10) != 0) {
            this.f8444a = Integer.valueOf(c10 & Integer.MAX_VALUE);
            return null;
        }
        Integer num2 = this.f8444a;
        if (num2 != null) {
            this.f8444a = null;
            Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num2.intValue(), c10));
            if (valueOf.intValue() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                num = valueOf;
            }
            if (num == null) {
                return Integer.valueOf(c10);
            }
            return num;
        }
        return Integer.valueOf(c10);
    }
}
