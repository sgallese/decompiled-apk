package e2;

import ec.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import qc.q;

/* compiled from: LocaleExtensions.android.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f14009a = new e();

    private e() {
    }

    public final Object a(c2.i iVar) {
        int s10;
        q.i(iVar, "localeList");
        s10 = u.s(iVar, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator<c2.h> it = iVar.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a(it.next()));
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return d.a(c.a((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(d2.i iVar, c2.i iVar2) {
        int s10;
        q.i(iVar, "textPaint");
        q.i(iVar2, "localeList");
        s10 = u.s(iVar2, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator<c2.h> it = iVar2.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a(it.next()));
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        iVar.setTextLocales(c.a((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
