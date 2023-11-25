package pd;

import td.s;
import td.x;
import wd.b;

/* compiled from: StrikethroughDelimiterProcessor.java */
/* loaded from: classes4.dex */
public class a implements wd.a {
    @Override // wd.a
    public void a(x xVar, x xVar2, int i10) {
        od.a aVar = new od.a();
        s e10 = xVar.e();
        while (e10 != null && e10 != xVar2) {
            s e11 = e10.e();
            aVar.b(e10);
            e10 = e11;
        }
        xVar.h(aVar);
    }

    @Override // wd.a
    public char b() {
        return '~';
    }

    @Override // wd.a
    public int c(b bVar, b bVar2) {
        if (bVar.length() >= 2 && bVar2.length() >= 2) {
            return 2;
        }
        return 0;
    }

    @Override // wd.a
    public int d() {
        return 2;
    }

    @Override // wd.a
    public char e() {
        return '~';
    }
}
