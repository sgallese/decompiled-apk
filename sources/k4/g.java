package k4;

import android.content.Context;
import android.os.Build;
import androidx.work.m;
import l4.i;
import n4.p;

/* compiled from: NetworkUnmeteredController.java */
/* loaded from: classes.dex */
public class g extends c<j4.b> {
    public g(Context context, p4.a aVar) {
        super(i.c(context, aVar).d());
    }

    @Override // k4.c
    boolean b(p pVar) {
        if (pVar.f20201j.b() != m.UNMETERED && (Build.VERSION.SDK_INT < 30 || pVar.f20201j.b() != m.TEMPORARILY_UNMETERED)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // k4.c
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public boolean c(j4.b bVar) {
        if (bVar.a() && !bVar.b()) {
            return false;
        }
        return true;
    }
}
