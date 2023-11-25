package c4;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18.java */
/* loaded from: classes.dex */
class n0 implements o0 {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f8823a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(View view) {
        this.f8823a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof n0) && ((n0) obj).f8823a.equals(this.f8823a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f8823a.hashCode();
    }
}
