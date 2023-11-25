package k4;

import android.content.Context;
import android.os.Build;
import androidx.work.m;
import l4.i;
import n4.p;

/* compiled from: NetworkConnectedController.java */
/* loaded from: classes.dex */
public class d extends c<j4.b> {
    public d(Context context, p4.a aVar) {
        super(i.c(context, aVar).d());
    }

    @Override // k4.c
    boolean b(p pVar) {
        if (pVar.f20201j.b() == m.CONNECTED) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // k4.c
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public boolean c(j4.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (!bVar.a() || !bVar.d()) {
                return true;
            }
            return false;
        }
        return !bVar.a();
    }
}
