package rd;

import td.g;
import td.s;
import td.w;
import td.x;

/* compiled from: EmphasisDelimiterProcessor.java */
/* loaded from: classes4.dex */
public abstract class b implements wd.a {

    /* renamed from: a  reason: collision with root package name */
    private final char f22535a;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(char c10) {
        this.f22535a = c10;
    }

    @Override // wd.a
    public void a(x xVar, x xVar2, int i10) {
        s wVar;
        String valueOf = String.valueOf(e());
        if (i10 == 1) {
            wVar = new g(valueOf);
        } else {
            wVar = new w(valueOf + valueOf);
        }
        s e10 = xVar.e();
        while (e10 != null && e10 != xVar2) {
            s e11 = e10.e();
            wVar.b(e10);
            e10 = e11;
        }
        xVar.h(wVar);
    }

    @Override // wd.a
    public char b() {
        return this.f22535a;
    }

    @Override // wd.a
    public int c(wd.b bVar, wd.b bVar2) {
        if ((bVar.c() || bVar2.b()) && bVar2.a() % 3 != 0 && (bVar.a() + bVar2.a()) % 3 == 0) {
            return 0;
        }
        if (bVar.length() >= 2 && bVar2.length() >= 2) {
            return 2;
        }
        return 1;
    }

    @Override // wd.a
    public int d() {
        return 1;
    }

    @Override // wd.a
    public char e() {
        return this.f22535a;
    }
}
