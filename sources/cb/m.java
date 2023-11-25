package cb;

import cb.l;

/* compiled from: MarkwonVisitorFactory.java */
/* loaded from: classes4.dex */
abstract class m {

    /* compiled from: MarkwonVisitorFactory.java */
    /* loaded from: classes4.dex */
    class a extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l.b f8928a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f8929b;

        a(l.b bVar, g gVar) {
            this.f8928a = bVar;
            this.f8929b = gVar;
        }

        @Override // cb.m
        l a() {
            return this.f8928a.b(this.f8929b, new s());
        }
    }

    m() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m b(l.b bVar, g gVar) {
        return new a(bVar, gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract l a();
}
