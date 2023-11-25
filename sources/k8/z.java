package k8;

import i9.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OptionalProvider.java */
/* loaded from: classes3.dex */
public class z<T> implements i9.b<T>, i9.a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final a.InterfaceC0403a<Object> f19433c = new a.InterfaceC0403a() { // from class: k8.w
        @Override // i9.a.InterfaceC0403a
        public final void a(i9.b bVar) {
            z.f(bVar);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static final i9.b<Object> f19434d = new i9.b() { // from class: k8.x
        @Override // i9.b
        public final Object get() {
            Object g10;
            g10 = z.g();
            return g10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private a.InterfaceC0403a<T> f19435a;

    /* renamed from: b  reason: collision with root package name */
    private volatile i9.b<T> f19436b;

    private z(a.InterfaceC0403a<T> interfaceC0403a, i9.b<T> bVar) {
        this.f19435a = interfaceC0403a;
        this.f19436b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> z<T> e() {
        return new z<>(f19433c, f19434d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(a.InterfaceC0403a interfaceC0403a, a.InterfaceC0403a interfaceC0403a2, i9.b bVar) {
        interfaceC0403a.a(bVar);
        interfaceC0403a2.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> z<T> i(i9.b<T> bVar) {
        return new z<>(null, bVar);
    }

    @Override // i9.a
    public void a(final a.InterfaceC0403a<T> interfaceC0403a) {
        i9.b<T> bVar;
        i9.b<T> bVar2;
        i9.b<T> bVar3 = this.f19436b;
        i9.b<Object> bVar4 = f19434d;
        if (bVar3 != bVar4) {
            interfaceC0403a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f19436b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final a.InterfaceC0403a<T> interfaceC0403a2 = this.f19435a;
                this.f19435a = new a.InterfaceC0403a() { // from class: k8.y
                    @Override // i9.a.InterfaceC0403a
                    public final void a(i9.b bVar5) {
                        z.h(a.InterfaceC0403a.this, interfaceC0403a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0403a.a(bVar);
        }
    }

    @Override // i9.b
    public T get() {
        return this.f19436b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(i9.b<T> bVar) {
        a.InterfaceC0403a<T> interfaceC0403a;
        if (this.f19436b == f19434d) {
            synchronized (this) {
                interfaceC0403a = this.f19435a;
                this.f19435a = null;
                this.f19436b = bVar;
            }
            interfaceC0403a.a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(i9.b bVar) {
    }
}
