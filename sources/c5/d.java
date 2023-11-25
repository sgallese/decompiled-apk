package c5;

import android.content.Context;
import android.util.DisplayMetrics;
import c5.c;
import kotlin.coroutines.Continuation;
import qc.q;

/* compiled from: DisplaySizeResolver.kt */
/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: c  reason: collision with root package name */
    private final Context f8842c;

    public d(Context context) {
        this.f8842c = context;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && q.d(this.f8842c, ((d) obj).f8842c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f8842c.hashCode();
    }

    @Override // c5.j
    public Object m(Continuation<? super i> continuation) {
        DisplayMetrics displayMetrics = this.f8842c.getResources().getDisplayMetrics();
        c.a a10 = a.a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new i(a10, a10);
    }
}
