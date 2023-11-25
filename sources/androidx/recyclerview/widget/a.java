package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdapterHelper.java */
/* loaded from: classes.dex */
public final class a implements t.a {

    /* renamed from: a  reason: collision with root package name */
    private androidx.core.util.f<b> f6661a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f6662b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<b> f6663c;

    /* renamed from: d  reason: collision with root package name */
    final InterfaceC0153a f6664d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f6665e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f6666f;

    /* renamed from: g  reason: collision with root package name */
    final t f6667g;

    /* renamed from: h  reason: collision with root package name */
    private int f6668h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0153a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(int i10, int i11, Object obj);

        void d(b bVar);

        RecyclerView.f0 e(int i10);

        void f(int i10, int i11);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdapterHelper.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        int f6669a;

        /* renamed from: b  reason: collision with root package name */
        int f6670b;

        /* renamed from: c  reason: collision with root package name */
        Object f6671c;

        /* renamed from: d  reason: collision with root package name */
        int f6672d;

        b(int i10, int i11, int i12, Object obj) {
            this.f6669a = i10;
            this.f6670b = i11;
            this.f6672d = i12;
            this.f6671c = obj;
        }

        String a() {
            int i10 = this.f6669a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 8) {
                            return "??";
                        }
                        return "mv";
                    }
                    return "up";
                }
                return "rm";
            }
            return "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f6669a;
            if (i10 != bVar.f6669a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f6672d - this.f6670b) == 1 && this.f6672d == bVar.f6670b && this.f6670b == bVar.f6672d) {
                return true;
            }
            if (this.f6672d != bVar.f6672d || this.f6670b != bVar.f6670b) {
                return false;
            }
            Object obj2 = this.f6671c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f6671c)) {
                    return false;
                }
            } else if (bVar.f6671c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f6669a * 31) + this.f6670b) * 31) + this.f6672d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f6670b + "c:" + this.f6672d + ",p:" + this.f6671c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(InterfaceC0153a interfaceC0153a) {
        this(interfaceC0153a, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        boolean z10;
        char c10;
        int i10 = bVar.f6670b;
        int i11 = bVar.f6672d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f6664d.e(i12) == null && !h(i12)) {
                if (c11 == 1) {
                    v(b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            } else {
                if (c11 == 0) {
                    k(b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 1;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f6672d) {
            a(bVar);
            bVar = b(2, i10, i13, null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f6670b;
        int i11 = bVar.f6672d + i10;
        int i12 = i10;
        char c10 = 65535;
        int i13 = 0;
        while (i10 < i11) {
            if (this.f6664d.e(i10) == null && !h(i10)) {
                if (c10 == 1) {
                    v(b(4, i12, i13, bVar.f6671c));
                    i12 = i10;
                    i13 = 0;
                }
                c10 = 0;
            } else {
                if (c10 == 0) {
                    k(b(4, i12, i13, bVar.f6671c));
                    i12 = i10;
                    i13 = 0;
                }
                c10 = 1;
            }
            i13++;
            i10++;
        }
        if (i13 != bVar.f6672d) {
            Object obj = bVar.f6671c;
            a(bVar);
            bVar = b(4, i12, i13, obj);
        }
        if (c10 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f6663c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f6663c.get(i11);
            int i12 = bVar.f6669a;
            if (i12 == 8) {
                if (n(bVar.f6672d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f6670b;
                int i14 = bVar.f6672d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        boolean z10;
        int i11 = bVar.f6669a;
        if (i11 != 1 && i11 != 8) {
            int z11 = z(bVar.f6670b, i11);
            int i12 = bVar.f6670b;
            int i13 = bVar.f6669a;
            if (i13 != 2) {
                if (i13 == 4) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + bVar);
                }
            } else {
                i10 = 0;
            }
            int i14 = 1;
            for (int i15 = 1; i15 < bVar.f6672d; i15++) {
                int z12 = z(bVar.f6670b + (i10 * i15), bVar.f6669a);
                int i16 = bVar.f6669a;
                if (i16 == 2 ? z12 != z11 : i16 != 4 || z12 != z11 + 1) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    i14++;
                } else {
                    b b10 = b(i16, z11, i14, bVar.f6671c);
                    l(b10, i12);
                    a(b10);
                    if (bVar.f6669a == 4) {
                        i12 += i14;
                    }
                    z11 = z12;
                    i14 = 1;
                }
            }
            Object obj = bVar.f6671c;
            a(bVar);
            if (i14 > 0) {
                b b11 = b(bVar.f6669a, z11, i14, obj);
                l(b11, i12);
                a(b11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    private void v(b bVar) {
        this.f6663c.add(bVar);
        int i10 = bVar.f6669a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        this.f6664d.a(bVar.f6670b, bVar.f6672d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + bVar);
                }
                this.f6664d.c(bVar.f6670b, bVar.f6672d, bVar.f6671c);
                return;
            }
            this.f6664d.f(bVar.f6670b, bVar.f6672d);
            return;
        }
        this.f6664d.g(bVar.f6670b, bVar.f6672d);
    }

    private int z(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f6663c.size() - 1; size >= 0; size--) {
            b bVar = this.f6663c.get(size);
            int i14 = bVar.f6669a;
            if (i14 == 8) {
                int i15 = bVar.f6670b;
                int i16 = bVar.f6672d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 >= i13 && i10 <= i12) {
                    if (i13 == i15) {
                        if (i11 == 1) {
                            bVar.f6672d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f6672d = i16 - 1;
                        }
                        i10++;
                    } else {
                        if (i11 == 1) {
                            bVar.f6670b = i15 + 1;
                        } else if (i11 == 2) {
                            bVar.f6670b = i15 - 1;
                        }
                        i10--;
                    }
                } else if (i10 < i15) {
                    if (i11 == 1) {
                        bVar.f6670b = i15 + 1;
                        bVar.f6672d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f6670b = i15 - 1;
                        bVar.f6672d = i16 - 1;
                    }
                }
            } else {
                int i17 = bVar.f6670b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f6672d;
                    } else if (i14 == 2) {
                        i10 += bVar.f6672d;
                    }
                } else if (i11 == 1) {
                    bVar.f6670b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f6670b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f6663c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f6663c.get(size2);
            if (bVar2.f6669a == 8) {
                int i18 = bVar2.f6672d;
                if (i18 == bVar2.f6670b || i18 < 0) {
                    this.f6663c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f6672d <= 0) {
                this.f6663c.remove(size2);
                a(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.t.a
    public void a(b bVar) {
        if (!this.f6666f) {
            bVar.f6671c = null;
            this.f6661a.a(bVar);
        }
    }

    @Override // androidx.recyclerview.widget.t.a
    public b b(int i10, int i11, int i12, Object obj) {
        b b10 = this.f6661a.b();
        if (b10 == null) {
            return new b(i10, i11, i12, obj);
        }
        b10.f6669a = i10;
        b10.f6670b = i11;
        b10.f6672d = i12;
        b10.f6671c = obj;
        return b10;
    }

    public int e(int i10) {
        int size = this.f6662b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f6662b.get(i11);
            int i12 = bVar.f6669a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 8) {
                        int i13 = bVar.f6670b;
                        if (i13 == i10) {
                            i10 = bVar.f6672d;
                        } else {
                            if (i13 < i10) {
                                i10--;
                            }
                            if (bVar.f6672d <= i10) {
                                i10++;
                            }
                        }
                    }
                } else {
                    int i14 = bVar.f6670b;
                    if (i14 <= i10) {
                        int i15 = bVar.f6672d;
                        if (i14 + i15 > i10) {
                            return -1;
                        }
                        i10 -= i15;
                    } else {
                        continue;
                    }
                }
            } else if (bVar.f6670b <= i10) {
                i10 += bVar.f6672d;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        int size = this.f6663c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6664d.d(this.f6663c.get(i10));
        }
        x(this.f6663c);
        this.f6668h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.f6662b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f6662b.get(i10);
            int i11 = bVar.f6669a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            this.f6664d.d(bVar);
                            this.f6664d.a(bVar.f6670b, bVar.f6672d);
                        }
                    } else {
                        this.f6664d.d(bVar);
                        this.f6664d.c(bVar.f6670b, bVar.f6672d, bVar.f6671c);
                    }
                } else {
                    this.f6664d.d(bVar);
                    this.f6664d.h(bVar.f6670b, bVar.f6672d);
                }
            } else {
                this.f6664d.d(bVar);
                this.f6664d.g(bVar.f6670b, bVar.f6672d);
            }
            Runnable runnable = this.f6665e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f6662b);
        this.f6668h = 0;
    }

    void l(b bVar, int i10) {
        this.f6664d.b(bVar);
        int i11 = bVar.f6669a;
        if (i11 != 2) {
            if (i11 == 4) {
                this.f6664d.c(i10, bVar.f6672d, bVar.f6671c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        this.f6664d.h(i10, bVar.f6672d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m(int i10) {
        return n(i10, 0);
    }

    int n(int i10, int i11) {
        int size = this.f6663c.size();
        while (i11 < size) {
            b bVar = this.f6663c.get(i11);
            int i12 = bVar.f6669a;
            if (i12 == 8) {
                int i13 = bVar.f6670b;
                if (i13 == i10) {
                    i10 = bVar.f6672d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f6672d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f6670b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f6672d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f6672d;
                }
            }
            i11++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o(int i10) {
        if ((i10 & this.f6668h) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        if (this.f6662b.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        if (!this.f6663c.isEmpty() && !this.f6662b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f6662b.add(b(4, i10, i11, obj));
        this.f6668h |= 4;
        if (this.f6662b.size() != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f6662b.add(b(1, i10, i11, null));
        this.f6668h |= 1;
        if (this.f6662b.size() != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 == 1) {
            this.f6662b.add(b(8, i10, i11, null));
            this.f6668h |= 8;
            if (this.f6662b.size() != 1) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f6662b.add(b(2, i10, i11, null));
        this.f6668h |= 2;
        if (this.f6662b.size() != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        this.f6667g.b(this.f6662b);
        int size = this.f6662b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f6662b.get(i10);
            int i11 = bVar.f6669a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            d(bVar);
                        }
                    } else {
                        g(bVar);
                    }
                } else {
                    f(bVar);
                }
            } else {
                c(bVar);
            }
            Runnable runnable = this.f6665e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f6662b.clear();
    }

    void x(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(list.get(i10));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y() {
        x(this.f6662b);
        x(this.f6663c);
        this.f6668h = 0;
    }

    a(InterfaceC0153a interfaceC0153a, boolean z10) {
        this.f6661a = new androidx.core.util.g(30);
        this.f6662b = new ArrayList<>();
        this.f6663c = new ArrayList<>();
        this.f6668h = 0;
        this.f6664d = interfaceC0153a;
        this.f6666f = z10;
        this.f6667g = new t(this);
    }
}
