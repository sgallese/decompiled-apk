package k4;

import android.content.Context;
import android.os.Build;
import androidx.work.l;
import androidx.work.m;
import l4.i;
import n4.p;

/* compiled from: NetworkMeteredController.java */
/* loaded from: classes.dex */
public class e extends c<j4.b> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f19340e = l.f("NetworkMeteredCtrlr");

    public e(Context context, p4.a aVar) {
        super(i.c(context, aVar).d());
    }

    @Override // k4.c
    boolean b(p pVar) {
        if (pVar.f20201j.b() == m.METERED) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // k4.c
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public boolean c(j4.b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            l.c().a(f19340e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !bVar.a();
        } else if (!bVar.a() || !bVar.b()) {
            return true;
        } else {
            return false;
        }
    }
}
