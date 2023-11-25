package androidx.room;

import java.io.File;
import x3.c;

/* compiled from: SQLiteCopyOpenHelperFactory.java */
/* loaded from: classes.dex */
class n implements c.InterfaceC0584c {

    /* renamed from: a  reason: collision with root package name */
    private final String f7076a;

    /* renamed from: b  reason: collision with root package name */
    private final File f7077b;

    /* renamed from: c  reason: collision with root package name */
    private final c.InterfaceC0584c f7078c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(String str, File file, c.InterfaceC0584c interfaceC0584c) {
        this.f7076a = str;
        this.f7077b = file;
        this.f7078c = interfaceC0584c;
    }

    @Override // x3.c.InterfaceC0584c
    public x3.c a(c.b bVar) {
        return new m(bVar.f25713a, this.f7076a, this.f7077b, bVar.f25715c.f25712a, this.f7078c.a(bVar));
    }
}
