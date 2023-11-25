package qd;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import td.x;

/* compiled from: StaggeredDelimiterProcessor.java */
/* loaded from: classes4.dex */
class s implements wd.a {

    /* renamed from: a  reason: collision with root package name */
    private final char f21792a;

    /* renamed from: b  reason: collision with root package name */
    private int f21793b = 0;

    /* renamed from: c  reason: collision with root package name */
    private LinkedList<wd.a> f21794c = new LinkedList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(char c10) {
        this.f21792a = c10;
    }

    private wd.a g(int i10) {
        Iterator<wd.a> it = this.f21794c.iterator();
        while (it.hasNext()) {
            wd.a next = it.next();
            if (next.d() <= i10) {
                return next;
            }
        }
        return this.f21794c.getFirst();
    }

    @Override // wd.a
    public void a(x xVar, x xVar2, int i10) {
        g(i10).a(xVar, xVar2, i10);
    }

    @Override // wd.a
    public char b() {
        return this.f21792a;
    }

    @Override // wd.a
    public int c(wd.b bVar, wd.b bVar2) {
        return g(bVar.length()).c(bVar, bVar2);
    }

    @Override // wd.a
    public int d() {
        return this.f21793b;
    }

    @Override // wd.a
    public char e() {
        return this.f21792a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(wd.a aVar) {
        boolean z10;
        int d10;
        int d11 = aVar.d();
        ListIterator<wd.a> listIterator = this.f21794c.listIterator();
        do {
            if (listIterator.hasNext()) {
                d10 = listIterator.next().d();
                if (d11 > d10) {
                    listIterator.previous();
                    listIterator.add(aVar);
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f21794c.add(aVar);
                this.f21793b = d11;
                return;
            }
            return;
        } while (d11 != d10);
        throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f21792a + "' and minimum length " + d11);
    }
}
